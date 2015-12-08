// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Fb;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.EditText;
import java.util.Iterator;
import java.util.List;

public class CursorCallbackEditText extends EditText
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

    public static interface a
    {

        public abstract void a();
    }


    public List a;
    private Fb b;

    public CursorCallbackEditText(Context context)
    {
        super(context);
        b = null;
    }

    public CursorCallbackEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = null;
    }

    public CursorCallbackEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = null;
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

    protected void onSelectionChanged(int i, int j)
    {
        super.onSelectionChanged(i, j);
        if (a != null)
        {
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((a)iterator.next()).a()) { }
        }
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
}
