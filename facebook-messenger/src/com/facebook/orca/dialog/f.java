// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.dialog;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.dialog:
//            MenuDialogItem

final class f
    implements android.os.Parcelable.Creator
{

    f()
    {
    }

    public MenuDialogItem a(Parcel parcel)
    {
        return new MenuDialogItem(parcel, null);
    }

    public MenuDialogItem[] a(int i)
    {
        return new MenuDialogItem[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
