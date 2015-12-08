// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;

// Referenced classes of package org.chromium.content.browser.input:
//            ImeAdapter, InputMethodManagerWrapper

public class AdapterInputConnection extends BaseInputConnection
{
    static class ImeState
    {

        public final int compositionEnd;
        public final int compositionStart;
        public final int selectionEnd;
        public final int selectionStart;
        public final String text;

        public ImeState(String s, int i, int j, int k, int l)
        {
            text = s;
            selectionStart = i;
            selectionEnd = j;
            compositionStart = k;
            compositionEnd = l;
        }
    }


    private static final boolean DEBUG = false;
    public static final int INVALID_COMPOSITION = -1;
    public static final int INVALID_SELECTION = -1;
    private static final String TAG = "AdapterInputConnection";
    private final Editable mEditable;
    private final ImeAdapter mImeAdapter;
    private final View mInternalView;
    private int mLastUpdateCompositionEnd;
    private int mLastUpdateCompositionStart;
    private int mLastUpdateSelectionEnd;
    private int mLastUpdateSelectionStart;
    private int mNumNestedBatchEdits;
    private boolean mSingleLine;

    AdapterInputConnection(View view, ImeAdapter imeadapter, Editable editable, EditorInfo editorinfo)
    {
        int i;
        int j;
        super(view, true);
        mNumNestedBatchEdits = 0;
        mLastUpdateSelectionStart = -1;
        mLastUpdateSelectionEnd = -1;
        mLastUpdateCompositionStart = -1;
        mLastUpdateCompositionEnd = -1;
        mInternalView = view;
        mImeAdapter = imeadapter;
        mImeAdapter.setInputConnection(this);
        mEditable = editable;
        removeComposingSpans(mEditable);
        mSingleLine = true;
        editorinfo.imeOptions = 0x12000000;
        editorinfo.inputType = 161;
        i = imeadapter.getTextInputType();
        j = imeadapter.getTextInputFlags();
        if ((ImeAdapter.sTextInputFlagAutocompleteOff & j) != 0)
        {
            editorinfo.inputType = editorinfo.inputType | 0x80000;
        }
        if (i != ImeAdapter.sTextInputTypeText) goto _L2; else goto _L1
_L1:
        editorinfo.imeOptions = editorinfo.imeOptions | 2;
        if ((ImeAdapter.sTextInputFlagAutocorrectOff & j) == 0)
        {
            editorinfo.inputType = editorinfo.inputType | 0x8000;
        }
_L4:
        editorinfo.initialSelStart = Selection.getSelectionStart(mEditable);
        editorinfo.initialSelEnd = Selection.getSelectionEnd(mEditable);
        mLastUpdateSelectionStart = Selection.getSelectionStart(mEditable);
        mLastUpdateSelectionEnd = Selection.getSelectionEnd(mEditable);
        Selection.setSelection(mEditable, editorinfo.initialSelStart, editorinfo.initialSelEnd);
        updateSelectionIfRequired();
        return;
_L2:
        if (i == ImeAdapter.sTextInputTypeTextArea || i == ImeAdapter.sTextInputTypeContentEditable)
        {
            editorinfo.inputType = editorinfo.inputType | 0x24000;
            if ((ImeAdapter.sTextInputFlagAutocorrectOff & j) == 0)
            {
                editorinfo.inputType = editorinfo.inputType | 0x8000;
            }
            editorinfo.imeOptions = editorinfo.imeOptions | 1;
            mSingleLine = false;
        } else
        if (i == ImeAdapter.sTextInputTypePassword)
        {
            editorinfo.inputType = 225;
            editorinfo.imeOptions = editorinfo.imeOptions | 2;
        } else
        if (i == ImeAdapter.sTextInputTypeSearch)
        {
            editorinfo.imeOptions = editorinfo.imeOptions | 3;
        } else
        if (i == ImeAdapter.sTextInputTypeUrl)
        {
            editorinfo.inputType = 17;
            editorinfo.imeOptions = editorinfo.imeOptions | 2;
        } else
        if (i == ImeAdapter.sTextInputTypeEmail)
        {
            editorinfo.inputType = 209;
            editorinfo.imeOptions = editorinfo.imeOptions | 2;
        } else
        if (i == ImeAdapter.sTextInputTypeTel)
        {
            editorinfo.inputType = 3;
            editorinfo.imeOptions = editorinfo.imeOptions | 5;
        } else
        if (i == ImeAdapter.sTextInputTypeNumber)
        {
            editorinfo.inputType = 8194;
            editorinfo.imeOptions = editorinfo.imeOptions | 5;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private InputMethodManagerWrapper getInputMethodManagerWrapper()
    {
        return mImeAdapter.getInputMethodManagerWrapper();
    }

    private boolean maybePerformEmptyCompositionWorkaround(CharSequence charsequence)
    {
        int k = Selection.getSelectionStart(mEditable);
        int i1 = Selection.getSelectionEnd(mEditable);
        int i = getComposingSpanStart(mEditable);
        int j = getComposingSpanEnd(mEditable);
        if (TextUtils.isEmpty(charsequence) && k == i1 && i != -1 && j != -1)
        {
            beginBatchEdit();
            finishComposingText();
            int l = Selection.getSelectionStart(mEditable);
            deleteSurroundingText(l - i, l - j);
            endBatchEdit();
            return true;
        } else
        {
            return false;
        }
    }

    private void updateSelectionIfRequired()
    {
        if (mNumNestedBatchEdits == 0)
        {
            int i = Selection.getSelectionStart(mEditable);
            int j = Selection.getSelectionEnd(mEditable);
            int k = getComposingSpanStart(mEditable);
            int l = getComposingSpanEnd(mEditable);
            if (mLastUpdateSelectionStart != i || mLastUpdateSelectionEnd != j || mLastUpdateCompositionStart != k || mLastUpdateCompositionEnd != l)
            {
                getInputMethodManagerWrapper().updateSelection(mInternalView, i, j, k, l);
                mLastUpdateSelectionStart = i;
                mLastUpdateSelectionEnd = j;
                mLastUpdateCompositionStart = k;
                mLastUpdateCompositionEnd = l;
                return;
            }
        }
    }

    public boolean beginBatchEdit()
    {
        mNumNestedBatchEdits = mNumNestedBatchEdits + 1;
        return true;
    }

    public boolean commitText(CharSequence charsequence, int i)
    {
        boolean flag = true;
        if (maybePerformEmptyCompositionWorkaround(charsequence))
        {
            return true;
        }
        super.commitText(charsequence, i);
        updateSelectionIfRequired();
        ImeAdapter imeadapter = mImeAdapter;
        if (charsequence.length() <= 0)
        {
            flag = false;
        }
        return imeadapter.checkCompositionQueueAndCallNative(charsequence, i, flag);
    }

    public boolean deleteSurroundingText(int i, int j)
    {
        int i1 = Selection.getSelectionStart(mEditable);
        int k = mEditable.length();
        int l = Selection.getSelectionEnd(mEditable);
        i1 = Math.min(i, i1);
        int j1 = Math.min(j, k - l);
        super.deleteSurroundingText(i1, j1);
        updateSelectionIfRequired();
        l = 0;
        if (i == 1 && j == 0)
        {
            k = 67;
        } else
        {
            k = l;
            if (i == 0)
            {
                k = l;
                if (j == 1)
                {
                    k = 112;
                }
            }
        }
        if (k == 0)
        {
            return mImeAdapter.sendSyntheticKeyEvent(ImeAdapter.sEventTypeRawKeyDown, SystemClock.uptimeMillis(), k, 0, 0) & mImeAdapter.deleteSurroundingText(i1, j1) & mImeAdapter.sendSyntheticKeyEvent(ImeAdapter.sEventTypeKeyUp, SystemClock.uptimeMillis(), k, 0, 0);
        } else
        {
            mImeAdapter.sendKeyEventWithKeyCode(k, 6);
            return true;
        }
    }

    public boolean endBatchEdit()
    {
        if (mNumNestedBatchEdits != 0)
        {
            mNumNestedBatchEdits = mNumNestedBatchEdits - 1;
            if (mNumNestedBatchEdits == 0)
            {
                updateSelectionIfRequired();
            }
            if (mNumNestedBatchEdits != 0)
            {
                return true;
            }
        }
        return false;
    }

    public boolean finishComposingText()
    {
        if (getComposingSpanStart(mEditable) == getComposingSpanEnd(mEditable))
        {
            return true;
        } else
        {
            super.finishComposingText();
            updateSelectionIfRequired();
            mImeAdapter.finishComposingText();
            return true;
        }
    }

    public Editable getEditable()
    {
        return mEditable;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedtextrequest, int i)
    {
        extractedtextrequest = new ExtractedText();
        extractedtextrequest.text = mEditable.toString();
        extractedtextrequest.partialEndOffset = mEditable.length();
        extractedtextrequest.selectionStart = Selection.getSelectionStart(mEditable);
        extractedtextrequest.selectionEnd = Selection.getSelectionEnd(mEditable);
        if (mSingleLine)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        extractedtextrequest.flags = i;
        return extractedtextrequest;
    }

    ImeState getImeStateForTesting()
    {
        return new ImeState(mEditable.toString(), Selection.getSelectionStart(mEditable), Selection.getSelectionEnd(mEditable), getComposingSpanStart(mEditable), getComposingSpanEnd(mEditable));
    }

    boolean isActive()
    {
        return getInputMethodManagerWrapper().isActive(mInternalView);
    }

    public boolean performContextMenuAction(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 16908319: 
            return mImeAdapter.selectAll();

        case 16908320: 
            return mImeAdapter.cut();

        case 16908321: 
            return mImeAdapter.copy();

        case 16908322: 
            return mImeAdapter.paste();
        }
    }

    public boolean performEditorAction(int i)
    {
        if (i == 5)
        {
            restartInput();
            long l = SystemClock.uptimeMillis();
            mImeAdapter.sendSyntheticKeyEvent(ImeAdapter.sEventTypeRawKeyDown, l, 61, 0, 0);
        } else
        {
            mImeAdapter.sendKeyEventWithKeyCode(66, 22);
        }
        return true;
    }

    void restartInput()
    {
        getInputMethodManagerWrapper().restartInput(mInternalView);
        mNumNestedBatchEdits = 0;
    }

    public boolean sendKeyEvent(KeyEvent keyevent)
    {
        if (keyevent.getAction() != 1) goto _L2; else goto _L1
_L1:
        if (keyevent.getKeyCode() != 67) goto _L4; else goto _L3
_L3:
        deleteSurroundingText(1, 0);
_L8:
        return true;
_L4:
        if (keyevent.getKeyCode() == 112)
        {
            deleteSurroundingText(0, 1);
            return true;
        }
        int i1 = keyevent.getUnicodeChar();
        if (i1 != 0)
        {
            int i = Selection.getSelectionStart(mEditable);
            int k = Selection.getSelectionEnd(mEditable);
            int l = k;
            int j = i;
            if (i > k)
            {
                j = k;
                l = i;
            }
            mEditable.replace(j, l, Character.toString((char)i1));
        }
_L6:
        mImeAdapter.translateAndSendNativeEvents(keyevent);
        return true;
_L2:
        if (keyevent.getAction() == 0)
        {
            if (keyevent.getKeyCode() == 66)
            {
                beginBatchEdit();
                finishComposingText();
                mImeAdapter.translateAndSendNativeEvents(keyevent);
                endBatchEdit();
                return true;
            }
            if (keyevent.getKeyCode() == 67)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (keyevent.getKeyCode() == 112)
            {
                return true;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean setComposingRegion(int i, int j)
    {
        int k = mEditable.length();
        int l = Math.min(i, j);
        int i1 = Math.max(i, j);
        i = l;
        if (l < 0)
        {
            i = 0;
        }
        j = i1;
        if (i1 < 0)
        {
            j = 0;
        }
        l = i;
        if (i > k)
        {
            l = k;
        }
        i = j;
        if (j > k)
        {
            i = k;
        }
        CharSequence charsequence;
        if (l == i)
        {
            removeComposingSpans(mEditable);
        } else
        {
            super.setComposingRegion(l, i);
        }
        updateSelectionIfRequired();
        charsequence = null;
        if (i > l)
        {
            charsequence = mEditable.subSequence(l, i);
        }
        return mImeAdapter.setComposingRegion(charsequence, l, i);
    }

    public boolean setComposingText(CharSequence charsequence, int i)
    {
        if (maybePerformEmptyCompositionWorkaround(charsequence))
        {
            return true;
        } else
        {
            super.setComposingText(charsequence, i);
            updateSelectionIfRequired();
            return mImeAdapter.checkCompositionQueueAndCallNative(charsequence, i, false);
        }
    }

    public boolean setSelection(int i, int j)
    {
        int k = mEditable.length();
        if (i < 0 || j < 0 || i > k || j > k)
        {
            return true;
        } else
        {
            super.setSelection(i, j);
            updateSelectionIfRequired();
            return mImeAdapter.setEditableSelectionOffsets(i, j);
        }
    }

    public void updateState(String s, int i, int j, int k, int l, boolean flag)
    {
        if (!flag)
        {
            return;
        }
        s = s.replace('\240', ' ');
        i = Math.min(i, s.length());
        j = Math.min(j, s.length());
        k = Math.min(k, s.length());
        l = Math.min(l, s.length());
        if (!mEditable.toString().equals(s))
        {
            mEditable.replace(0, mEditable.length(), s);
        }
        Selection.setSelection(mEditable, i, j);
        if (k == l)
        {
            removeComposingSpans(mEditable);
        } else
        {
            super.setComposingRegion(k, l);
        }
        updateSelectionIfRequired();
    }
}
