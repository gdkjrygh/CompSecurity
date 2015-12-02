// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.dialog;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.dialog:
//            MenuDialogParams

final class i
    implements android.os.Parcelable.Creator
{

    i()
    {
    }

    public MenuDialogParams a(Parcel parcel)
    {
        return new MenuDialogParams(parcel, null);
    }

    public MenuDialogParams[] a(int j)
    {
        return new MenuDialogParams[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
