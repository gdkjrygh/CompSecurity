// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.editstyledtext;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.DynamicDrawableSpan;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

public final class EditStyledText extends EditText
{
    public final class EditModeActions
    {

        private int mMode;

        private static EditModeActionBase getAction(int i)
        {
            throw new NullPointerException();
        }

        public final boolean doNext(int i)
        {
            Log.d("EditModeActions", (new StringBuilder("--- do the next action: ")).append(i).append(",0").toString());
            if (getAction(i) == null)
            {
                Log.e("EditModeActions", "--- invalid action error.");
            }
            return false;
        }

        public final void onAction(int i)
        {
            getAction(i).mParams = null;
            throw new NullPointerException();
        }
    }

    public final class EditModeActions.EditModeActionBase
    {

        Object mParams[];
    }

    public static final class EditStyledTextSpans
    {
    }

    public static final class EditStyledTextSpans.HorizontalLineDrawable extends ShapeDrawable
    {

        private static boolean DBG_HL = false;
        int mWidth;

        public final void draw(Canvas canvas)
        {
            throw new NullPointerException();
        }

    }

    public static class EditStyledTextSpans.HorizontalLineSpan extends DynamicDrawableSpan
    {

        public Drawable getDrawable()
        {
            return null;
        }
    }

    public static class EditStyledTextSpans.MarqueeSpan extends CharacterStyle
    {

        int mMarqueeColor;

        static int getMarqueeColor(int i, int j)
        {
            int k = Color.alpha(j);
            int j1 = Color.red(j);
            int l = Color.green(j);
            int i1 = Color.blue(j);
            i = k;
            if (k == 0)
            {
                i = 128;
            }
            if (j1 > 128)
            {
                j = j1 / 2;
            } else
            {
                j = (255 - j1) / 2;
            }
            return Color.argb(i, j, l, i1);
        }

        public void updateDrawState(TextPaint textpaint)
        {
            textpaint.bgColor = mMarqueeColor;
        }
    }

    private final class EditorManager
    {

        int mBackgroundColor;
        int mColorWaitInput;
        boolean mEditFlag;
        boolean mKeepNonLineSpan;
        int mMode;
        int mSizeWaitInput;
        boolean mSoftKeyBlockFlag;
        int mState;
        boolean mTextIsFinishedFlag;
        boolean mWaitInputFlag;
        final EditStyledText this$0;

        public final void onAction(int i)
        {
            throw new NullPointerException();
        }

        public final void onStartSelectAll(boolean flag)
        {
            Log.d("EditStyledText.EditorManager", "--- onClickSelectAll");
            throw new NullPointerException();
        }

        public final void showSoftKey$255f295()
        {
            Log.d("EditStyledText.EditorManager", "--- showsoftkey");
            throw new NullPointerException();
        }

        public final void unsetTextComposingMask()
        {
            Log.d("EditStyledText", "--- unsetTextComposingMask");
        }
    }

    private final class MenuHandler
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final EditStyledText this$0;

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            return onTextContextMenuItem(menuitem.getItemId());
        }

        private MenuHandler()
        {
            this$0 = EditStyledText.this;
            super();
        }

        MenuHandler(byte byte0)
        {
            this();
        }
    }

    public static class SavedStyledTextState extends android.view.View.BaseSavedState
    {

        public int mBackgroundColor;

        public String toString()
        {
            return (new StringBuilder("EditStyledText.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" bgcolor=").append(mBackgroundColor).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(mBackgroundColor);
        }

        SavedStyledTextState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    private static class SoftKeyReceiver extends ResultReceiver
    {

        int mNewEnd;
        int mNewStart;

        protected void onReceiveResult(int i, Bundle bundle)
        {
            if (i != 2)
            {
                throw new NullPointerException();
            } else
            {
                return;
            }
        }
    }

    public static final class StyledTextInputConnection extends InputConnectionWrapper
    {

        EditStyledText mEST;

        public final boolean commitText(CharSequence charsequence, int i)
        {
            Log.d("EditStyledText", "--- commitText:");
            null.unsetTextComposingMask();
            return super.commitText(charsequence, i);
        }

        public final boolean finishComposingText()
        {
            Log.d("EditStyledText", "--- finishcomposing:");
            throw new NullPointerException();
        }

        public StyledTextInputConnection(InputConnection inputconnection, EditStyledText editstyledtext)
        {
            super(inputconnection, true);
            mEST = editstyledtext;
        }
    }


    private static final android.text.NoCopySpan.Concrete SELECTING = new android.text.NoCopySpan.Concrete();
    private InputConnection mInputConnection;

    protected final void drawableStateChanged()
    {
        super.drawableStateChanged();
    }

    protected final void onCreateContextMenu(ContextMenu contextmenu)
    {
        super.onCreateContextMenu(contextmenu);
        new MenuHandler((byte)0);
        throw new NullPointerException();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        mInputConnection = new StyledTextInputConnection(super.onCreateInputConnection(editorinfo), this);
        return mInputConnection;
    }

    protected final void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (flag)
        {
            throw new NullPointerException();
        } else
        {
            throw new NullPointerException();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedStyledTextState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedStyledTextState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            setBackgroundColor(((SavedStyledTextState) (parcelable)).mBackgroundColor);
            return;
        }
    }

    public final Parcelable onSaveInstanceState()
    {
        new SavedStyledTextState(super.onSaveInstanceState());
        throw new NullPointerException();
    }

    protected final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
    }

    public final boolean onTextContextMenuItem(int i)
    {
        boolean flag;
        if (getSelectionStart() != getSelectionEnd())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        switch (i)
        {
        default:
            return super.onTextContextMenuItem(i);

        case 16908319: 
            throw new NullPointerException();

        case 16908328: 
            Log.d("EditStyledText.EditorManager", "--- onClickSelect");
            throw new NullPointerException();

        case 16908329: 
            Log.d("EditStyledText.EditorManager", "--- onFixSelectedItem");
            Log.d("EditStyledText.EditorManager", (new StringBuilder("--- handleComplete:0")).append(",0").toString());
            throw new NullPointerException();

        case 16908322: 
            throw new NullPointerException();

        case 16908321: 
            if (flag)
            {
                throw new NullPointerException();
            } else
            {
                throw new NullPointerException();
            }

        case 16908320: 
            if (flag)
            {
                throw new NullPointerException();
            } else
            {
                throw new NullPointerException();
            }

        case 16776961: 
            throw new NullPointerException();

        case 16776962: 
            throw new NullPointerException();

        case 16776963: 
            throw new NullPointerException();

        case 16776964: 
            throw new NullPointerException();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            cancelLongPress();
            throw new NullPointerException();
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public final void setBackgroundColor(int i)
    {
        if (i != 0xffffff)
        {
            super.setBackgroundColor(i);
        } else
        {
            setBackgroundDrawable(null);
        }
        Log.d("EditStyledText.EditorManager", "--- onRefreshStyles");
        throw new NullPointerException();
    }



}
