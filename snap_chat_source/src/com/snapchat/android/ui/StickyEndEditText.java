// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;

// Referenced classes of package com.snapchat.android.ui:
//            BackNavigationEditText

public class StickyEndEditText extends BackNavigationEditText
{
    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        String a;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    public StickyEndEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
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
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getText().toString();
        return savedstate;
    }

    public void onSelectionChanged(int i, int j)
    {
        android.text.Editable editable = getText();
        if (editable != null && (i != editable.length() || j != editable.length()))
        {
            setSelection(editable.length(), editable.length());
            return;
        } else
        {
            super.onSelectionChanged(i, j);
            return;
        }
    }
}
