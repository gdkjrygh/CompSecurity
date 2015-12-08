// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.editstyledtext;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.android.ex.editstyledtext:
//            EditStyledText

public static class  extends android.view.dStyledTextState
{

    public int mBackgroundColor;

    public String toString()
    {
        return (new StringBuilder("EditStyledText.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" bgcolor=").append(mBackgroundColor).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.dStyledTextState(parcel, i);
        parcel.writeInt(mBackgroundColor);
    }

    (Parcelable parcelable)
    {
        super(parcelable);
    }
}
