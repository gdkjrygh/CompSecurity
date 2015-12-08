// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import Fb;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.SuggestionSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.snapchat.android.fragments.chat2:
//            SpanManager, SnapchatTextStyle

public class CursorCallbackEditTextV2 extends EditText
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        String a;
        List b;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(a);
            parcel.writeTypedList(b);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
            b = new ArrayList();
            parcel.readTypedList(b, SnapchatTextStyle.CREATOR);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public class a
        implements SpanWatcher
    {

        private CursorCallbackEditTextV2 a;

        public void onSpanAdded(Spannable spannable, Object obj, int i, int j)
        {
            if ((obj instanceof UnderlineSpan) && !(obj instanceof SpanManager.SnapchatUnderlineSpan) && !(obj instanceof SuggestionSpan))
            {
                a.getEditableText().removeSpan(obj);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int j, int k, int l)
        {
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int j)
        {
        }

        protected a()
        {
            a = CursorCallbackEditTextV2.this;
            super();
        }
    }


    public final SpanManager a;
    private Fb b;
    private a c;

    public CursorCallbackEditTextV2(Context context)
    {
        super(context);
        b = null;
        a = new SpanManager();
    }

    public CursorCallbackEditTextV2(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = null;
        a = new SpanManager();
    }

    public CursorCallbackEditTextV2(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = null;
        a = new SpanManager();
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            setText(((SavedState) (parcelable)).a);
            SpannableString spannablestring = new SpannableString(((SavedState) (parcelable)).a);
            a.a(((SavedState) (parcelable)).b);
            a.a(spannablestring);
            setText(spannablestring);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getText().toString();
        savedstate.b = a.b(getText());
        return savedstate;
    }

    protected void onSelectionChanged(int i, int j)
    {
        super.onSelectionChanged(i, j);
    }

    public boolean onTextContextMenuItem(int i)
    {
        if (b != null && b.a(i, getText(), getSelectionStart(), getSelectionEnd()))
        {
            return true;
        } else
        {
            return super.onTextContextMenuItem(i);
        }
    }

    public void setContextMenuItemStrategy(Fb fb)
    {
        b = fb;
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        super.setText(charsequence, buffertype);
        charsequence = getEditableText();
        buffertype = (a[])charsequence.getSpans(0, charsequence.length(), com/snapchat/android/fragments/chat2/CursorCallbackEditTextV2$a);
        for (int i = 0; i < buffertype.length; i++)
        {
            charsequence.removeSpan(buffertype[i]);
        }

        if (c == null)
        {
            c = new a();
        }
        charsequence.setSpan(c, 0, charsequence.length(), 0x640012);
    }
}
