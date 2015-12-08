// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.os.Handler;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.UnderlineSpan;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import org.chromium.ui.picker.InputDialogContainer;

// Referenced classes of package org.chromium.content.browser.input:
//            AdapterInputConnection, InputMethodManagerWrapper

public class ImeAdapter
{
    public static class AdapterInputConnectionFactory
    {

        public AdapterInputConnection get(View view, ImeAdapter imeadapter, Editable editable, EditorInfo editorinfo)
        {
            return new AdapterInputConnection(view, imeadapter, editable, editorinfo);
        }

        public AdapterInputConnectionFactory()
        {
        }
    }

    private class DelayedDismissInput
        implements Runnable
    {

        private long mNativeImeAdapter;
        final ImeAdapter this$0;

        void detach()
        {
            mNativeImeAdapter = 0L;
        }

        public void run()
        {
            if (mNativeImeAdapter != 0L)
            {
                attach(mNativeImeAdapter, ImeAdapter.sTextInputTypeNone, ImeAdapter.sTextInputFlagNone);
            }
            dismissInput(true);
        }

        DelayedDismissInput(long l)
        {
            this$0 = ImeAdapter.this;
            super();
            mNativeImeAdapter = l;
        }
    }

    public static interface ImeAdapterDelegate
    {

        public abstract View getAttachedView();

        public abstract ResultReceiver getNewShowKeyboardReceiver();

        public abstract void onDismissInput();

        public abstract void onImeEvent();
    }


    private static final int COMPOSITION_KEY_CODE = 229;
    private static final int INPUT_DISMISS_DELAY = 150;
    static int sEventTypeChar;
    static int sEventTypeKeyUp;
    static int sEventTypeRawKeyDown;
    static KeyCharacterMap sKeyCharacterMap;
    static int sModifierAlt;
    static int sModifierCapsLockOn;
    static int sModifierCtrl;
    static int sModifierNumLockOn;
    static int sModifierShift;
    static char sSingleCharArray[] = new char[1];
    static int sTextInputFlagAutocompleteOff;
    static int sTextInputFlagAutocompleteOn;
    static int sTextInputFlagAutocorrectOff;
    static int sTextInputFlagAutocorrectOn;
    static int sTextInputFlagNone = 0;
    static int sTextInputFlagSpellcheckOff;
    static int sTextInputFlagSpellcheckOn;
    static int sTextInputTypeContentEditable;
    static int sTextInputTypeEmail;
    static int sTextInputTypeNone;
    static int sTextInputTypeNumber;
    static int sTextInputTypePassword;
    static int sTextInputTypeSearch;
    static int sTextInputTypeTel;
    static int sTextInputTypeText;
    static int sTextInputTypeTextArea;
    static int sTextInputTypeUrl;
    private DelayedDismissInput mDismissInput;
    private final Handler mHandler = new Handler();
    private AdapterInputConnection mInputConnection;
    private InputMethodManagerWrapper mInputMethodManagerWrapper;
    boolean mIsShowWithoutHideOutstanding;
    private String mLastComposeText;
    int mLastSyntheticKeyCode;
    private long mNativeImeAdapterAndroid;
    private int mTextInputFlags;
    private int mTextInputType;
    private final ImeAdapterDelegate mViewEmbedder;

    public ImeAdapter(InputMethodManagerWrapper inputmethodmanagerwrapper, ImeAdapterDelegate imeadapterdelegate)
    {
        mDismissInput = null;
        mIsShowWithoutHideOutstanding = false;
        mInputMethodManagerWrapper = inputmethodmanagerwrapper;
        mViewEmbedder = imeadapterdelegate;
    }

    private static KeyEvent androidKeyEventForCharacter(char c)
    {
        if (sKeyCharacterMap == null)
        {
            sKeyCharacterMap = KeyCharacterMap.load(-1);
        }
        sSingleCharArray[0] = c;
        KeyEvent akeyevent[] = sKeyCharacterMap.getEvents(sSingleCharArray);
        if (akeyevent != null)
        {
            int i = 0;
            while (i < akeyevent.length) 
            {
                if (akeyevent[i].getAction() == 0 && !KeyEvent.isModifierKey(akeyevent[i].getKeyCode()))
                {
                    return akeyevent[i];
                }
                i++;
            }
        }
        return null;
    }

    private void cancelComposition()
    {
        if (mInputConnection != null)
        {
            mInputConnection.restartInput();
        }
        mLastComposeText = null;
    }

    private void dismissInput(boolean flag)
    {
        mIsShowWithoutHideOutstanding = false;
        Object obj = mViewEmbedder.getAttachedView();
        if (mInputMethodManagerWrapper.isActive(((View) (obj))))
        {
            InputMethodManagerWrapper inputmethodmanagerwrapper = mInputMethodManagerWrapper;
            android.os.IBinder ibinder = ((View) (obj)).getWindowToken();
            if (flag)
            {
                obj = mViewEmbedder.getNewShowKeyboardReceiver();
            } else
            {
                obj = null;
            }
            inputmethodmanagerwrapper.hideSoftInputFromWindow(ibinder, 0, ((ResultReceiver) (obj)));
        }
        mViewEmbedder.onDismissInput();
    }

    private void focusedNodeChanged(boolean flag)
    {
        if (mInputConnection != null && flag)
        {
            mInputConnection.restartInput();
        }
    }

    private static int getModifiers(int i)
    {
        int k = 0;
        if ((i & 1) != 0)
        {
            k = 0 | sModifierShift;
        }
        int j = k;
        if ((i & 2) != 0)
        {
            j = k | sModifierAlt;
        }
        k = j;
        if ((i & 0x1000) != 0)
        {
            k = j | sModifierCtrl;
        }
        j = k;
        if ((0x100000 & i) != 0)
        {
            j = k | sModifierCapsLockOn;
        }
        k = j;
        if ((0x200000 & i) != 0)
        {
            k = j | sModifierNumLockOn;
        }
        return k;
    }

    public static int getTextInputTypeNone()
    {
        return sTextInputTypeNone;
    }

    public static KeyEvent getTypedKeyEventGuess(String s, String s1)
    {
        Object obj = null;
        KeyEvent keyevent;
        if (s == null)
        {
            keyevent = obj;
            if (s1.length() == 1)
            {
                keyevent = androidKeyEventForCharacter(s1.charAt(0));
            }
        } else
        {
            if (s1.length() > s.length() && s1.startsWith(s))
            {
                return androidKeyEventForCharacter(s1.charAt(s1.length() - 1));
            }
            keyevent = obj;
            if (s.length() > s1.length())
            {
                keyevent = obj;
                if (s.startsWith(s1))
                {
                    return new KeyEvent(0, 67);
                }
            }
        }
        return keyevent;
    }

    private boolean hasInputType()
    {
        return mTextInputType != sTextInputTypeNone;
    }

    private static void initializeTextInputFlags(int i, int j, int k, int l, int i1, int j1)
    {
        sTextInputFlagAutocompleteOn = i;
        sTextInputFlagAutocompleteOff = j;
        sTextInputFlagAutocorrectOn = k;
        sTextInputFlagAutocorrectOff = l;
        sTextInputFlagSpellcheckOn = i1;
        sTextInputFlagSpellcheckOff = j1;
    }

    private static void initializeTextInputTypes(int i, int j, int k, int l, int i1, int j1, int k1, int l1, 
            int i2, int j2)
    {
        sTextInputTypeNone = i;
        sTextInputTypeText = j;
        sTextInputTypeTextArea = k;
        sTextInputTypePassword = l;
        sTextInputTypeSearch = i1;
        sTextInputTypeUrl = j1;
        sTextInputTypeEmail = k1;
        sTextInputTypeTel = l1;
        sTextInputTypeNumber = i2;
        sTextInputTypeContentEditable = j2;
    }

    private static void initializeWebInputEvents(int i, int j, int k, int l, int i1, int j1, int k1, int l1)
    {
        sEventTypeRawKeyDown = i;
        sEventTypeKeyUp = j;
        sEventTypeChar = k;
        sModifierShift = l;
        sModifierAlt = i1;
        sModifierCtrl = j1;
        sModifierCapsLockOn = k1;
        sModifierNumLockOn = l1;
    }

    private static boolean isTextInputType(int i)
    {
        return i != sTextInputTypeNone && !InputDialogContainer.isDialogInputType(i);
    }

    private static native void nativeAppendBackgroundColorSpan(long l, int i, int j, int k);

    private static native void nativeAppendUnderlineSpan(long l, int i, int j);

    private native void nativeAttachImeAdapter(long l);

    private native void nativeCommitText(long l, String s);

    private native void nativeCopy(long l);

    private native void nativeCut(long l);

    private native void nativeDeleteSurroundingText(long l, int i, int j);

    private native void nativeFinishComposingText(long l);

    private native void nativePaste(long l);

    private native void nativeResetImeAdapter(long l);

    private native void nativeSelectAll(long l);

    private native boolean nativeSendKeyEvent(long l, KeyEvent keyevent, int i, int j, long l1, 
            int k, boolean flag, int i1);

    private native boolean nativeSendSyntheticKeyEvent(long l, int i, long l1, int j, int k, 
            int i1);

    private native void nativeSetComposingRegion(long l, int i, int j);

    private native void nativeSetComposingText(long l, CharSequence charsequence, String s, int i);

    private native void nativeSetEditableSelectionOffsets(long l, int i, int j);

    private native void nativeUnselect(long l);

    private void populateUnderlinesFromSpans(CharSequence charsequence, long l)
    {
        if (charsequence instanceof SpannableString)
        {
            SpannableString spannablestring = (SpannableString)charsequence;
            charsequence = (CharacterStyle[])spannablestring.getSpans(0, charsequence.length(), android/text/style/CharacterStyle);
            int j = charsequence.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = charsequence[i];
                if (obj instanceof BackgroundColorSpan)
                {
                    nativeAppendBackgroundColorSpan(l, spannablestring.getSpanStart(obj), spannablestring.getSpanEnd(obj), ((BackgroundColorSpan)obj).getBackgroundColor());
                } else
                if (obj instanceof UnderlineSpan)
                {
                    nativeAppendUnderlineSpan(l, spannablestring.getSpanStart(obj), spannablestring.getSpanEnd(obj));
                }
                i++;
            }
        }
    }

    private int shouldSendKeyEventWithKeyCode(String s)
    {
        if (s.length() == 1)
        {
            if (s.equals("\n"))
            {
                return 66;
            }
            if (s.equals("\t"))
            {
                return 61;
            }
        }
        return 229;
    }

    private void showKeyboard()
    {
        mIsShowWithoutHideOutstanding = true;
        mInputMethodManagerWrapper.showSoftInput(mViewEmbedder.getAttachedView(), 0, mViewEmbedder.getNewShowKeyboardReceiver());
    }

    public void attach(long l)
    {
        attach(l, sTextInputTypeNone, sTextInputFlagNone);
    }

    public void attach(long l, int i, int j)
    {
        if (mNativeImeAdapterAndroid != 0L)
        {
            nativeResetImeAdapter(mNativeImeAdapterAndroid);
        }
        mNativeImeAdapterAndroid = l;
        mTextInputType = i;
        mTextInputFlags = j;
        mLastComposeText = null;
        if (l != 0L)
        {
            nativeAttachImeAdapter(mNativeImeAdapterAndroid);
        }
        if (mTextInputType == sTextInputTypeNone)
        {
            dismissInput(false);
        }
    }

    boolean checkCompositionQueueAndCallNative(CharSequence charsequence, int i, boolean flag)
    {
        if (mNativeImeAdapterAndroid == 0L)
        {
            return false;
        }
        mViewEmbedder.onImeEvent();
        String s = charsequence.toString();
        int j = shouldSendKeyEventWithKeyCode(s);
        long l1 = SystemClock.uptimeMillis();
        if (j != 229)
        {
            sendKeyEventWithKeyCode(j, 6);
            charsequence = s;
        } else
        {
            KeyEvent keyevent = getTypedKeyEventGuess(mLastComposeText, s);
            int l = 0;
            int k;
            if (keyevent != null)
            {
                k = keyevent.getKeyCode();
                l = getModifiers(keyevent.getMetaState());
            } else
            if (!s.equals(mLastComposeText))
            {
                k = 0;
            } else
            {
                k = -1;
            }
            if (k > 0 && flag && mLastComposeText == null)
            {
                mLastSyntheticKeyCode = k;
                return translateAndSendNativeEvents(keyevent) && translateAndSendNativeEvents(KeyEvent.changeAction(keyevent, 1));
            }
            if (k >= 0)
            {
                nativeSendSyntheticKeyEvent(mNativeImeAdapterAndroid, sEventTypeRawKeyDown, l1, k, l, 0);
            }
            if (flag)
            {
                nativeCommitText(mNativeImeAdapterAndroid, s);
                charsequence = null;
            } else
            {
                nativeSetComposingText(mNativeImeAdapterAndroid, charsequence, s, i);
                charsequence = s;
            }
            if (k >= 0)
            {
                nativeSendSyntheticKeyEvent(mNativeImeAdapterAndroid, sEventTypeKeyUp, l1, k, l, 0);
            }
            mLastSyntheticKeyCode = k;
        }
        mLastComposeText = charsequence;
        return true;
    }

    public boolean copy()
    {
        if (mNativeImeAdapterAndroid == 0L)
        {
            return false;
        } else
        {
            nativeCopy(mNativeImeAdapterAndroid);
            return true;
        }
    }

    public boolean cut()
    {
        if (mNativeImeAdapterAndroid == 0L)
        {
            return false;
        } else
        {
            nativeCut(mNativeImeAdapterAndroid);
            return true;
        }
    }

    boolean deleteSurroundingText(int i, int j)
    {
        mViewEmbedder.onImeEvent();
        if (mNativeImeAdapterAndroid == 0L)
        {
            return false;
        } else
        {
            nativeDeleteSurroundingText(mNativeImeAdapterAndroid, i, j);
            return true;
        }
    }

    void detach()
    {
        if (mDismissInput != null)
        {
            mHandler.removeCallbacks(mDismissInput);
            mDismissInput.detach();
        }
        mNativeImeAdapterAndroid = 0L;
        mTextInputType = 0;
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return translateAndSendNativeEvents(keyevent);
    }

    void finishComposingText()
    {
        mLastComposeText = null;
        if (mNativeImeAdapterAndroid == 0L)
        {
            return;
        } else
        {
            nativeFinishComposingText(mNativeImeAdapterAndroid);
            return;
        }
    }

    InputMethodManagerWrapper getInputMethodManagerWrapper()
    {
        return mInputMethodManagerWrapper;
    }

    int getTextInputFlags()
    {
        return mTextInputFlags;
    }

    int getTextInputType()
    {
        return mTextInputType;
    }

    public boolean hasTextInputType()
    {
        return isTextInputType(mTextInputType);
    }

    public boolean isSelectionPassword()
    {
        return mTextInputType == sTextInputTypePassword;
    }

    public boolean paste()
    {
        if (mNativeImeAdapterAndroid == 0L)
        {
            return false;
        } else
        {
            nativePaste(mNativeImeAdapterAndroid);
            return true;
        }
    }

    public boolean selectAll()
    {
        if (mNativeImeAdapterAndroid == 0L)
        {
            return false;
        } else
        {
            nativeSelectAll(mNativeImeAdapterAndroid);
            return true;
        }
    }

    void sendKeyEventWithKeyCode(int i, int j)
    {
        long l = SystemClock.uptimeMillis();
        mLastSyntheticKeyCode = i;
        translateAndSendNativeEvents(new KeyEvent(l, l, 0, i, 0, 0, -1, 0, j));
        translateAndSendNativeEvents(new KeyEvent(SystemClock.uptimeMillis(), l, 1, i, 0, 0, -1, 0, j));
    }

    boolean sendSyntheticKeyEvent(int i, long l, int j, int k, int i1)
    {
        if (mNativeImeAdapterAndroid == 0L)
        {
            return false;
        } else
        {
            nativeSendSyntheticKeyEvent(mNativeImeAdapterAndroid, i, l, j, k, i1);
            return true;
        }
    }

    boolean setComposingRegion(CharSequence charsequence, int i, int j)
    {
        if (mNativeImeAdapterAndroid == 0L)
        {
            return false;
        }
        nativeSetComposingRegion(mNativeImeAdapterAndroid, i, j);
        if (charsequence != null)
        {
            charsequence = charsequence.toString();
        } else
        {
            charsequence = null;
        }
        mLastComposeText = charsequence;
        return true;
    }

    boolean setEditableSelectionOffsets(int i, int j)
    {
        if (mNativeImeAdapterAndroid == 0L)
        {
            return false;
        } else
        {
            nativeSetEditableSelectionOffsets(mNativeImeAdapterAndroid, i, j);
            return true;
        }
    }

    void setInputConnection(AdapterInputConnection adapterinputconnection)
    {
        mInputConnection = adapterinputconnection;
        mLastComposeText = null;
    }

    public void setInputMethodManagerWrapper(InputMethodManagerWrapper inputmethodmanagerwrapper)
    {
        mInputMethodManagerWrapper = inputmethodmanagerwrapper;
    }

    boolean translateAndSendNativeEvents(KeyEvent keyevent)
    {
        int i;
        if (mNativeImeAdapterAndroid != 0L)
        {
            if ((i = keyevent.getAction()) == 0 || i == 1)
            {
                mViewEmbedder.onImeEvent();
                return nativeSendKeyEvent(mNativeImeAdapterAndroid, keyevent, keyevent.getAction(), getModifiers(keyevent.getMetaState()), keyevent.getEventTime(), keyevent.getKeyCode(), false, keyevent.getUnicodeChar());
            }
        }
        return false;
    }

    public boolean unselect()
    {
        if (mNativeImeAdapterAndroid == 0L)
        {
            return false;
        } else
        {
            nativeUnselect(mNativeImeAdapterAndroid);
            return true;
        }
    }

    public void updateKeyboardVisibility(long l, int i, int j, boolean flag)
    {
        mHandler.removeCallbacks(mDismissInput);
        if (mTextInputType != sTextInputTypeNone || flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (mNativeImeAdapterAndroid == l && mTextInputType == i)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == sTextInputTypeNone)
        {
            mDismissInput = new DelayedDismissInput(l);
            mHandler.postDelayed(mDismissInput, 150L);
            return;
        }
        attach(l, i, j);
        mInputMethodManagerWrapper.restartInput(mViewEmbedder.getAttachedView());
        if (!flag) goto _L1; else goto _L3
_L3:
        showKeyboard();
        return;
        if (!hasInputType() || !flag) goto _L1; else goto _L4
_L4:
        showKeyboard();
        return;
    }


}
