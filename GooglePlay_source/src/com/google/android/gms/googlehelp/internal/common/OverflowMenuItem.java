// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            OverflowMenuItemCreator

public final class OverflowMenuItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OverflowMenuItemCreator();
    final int mId;
    final Intent mIntent;
    final String mTitle;
    final int mVersionCode;

    OverflowMenuItem(int i, int j, String s, Intent intent)
    {
        mVersionCode = i;
        mId = j;
        mTitle = s;
        mIntent = intent;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        OverflowMenuItemCreator.writeToParcel(this, parcel, i);
    }

}
