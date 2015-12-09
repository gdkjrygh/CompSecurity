// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.os.Parcel;

// Referenced classes of package com.pandora.android.util:
//            ShuffleListItem

static final class 
    implements android.os.
{

    public ShuffleListItem a(Parcel parcel)
    {
        return new ShuffleListItem(parcel);
    }

    public ShuffleListItem[] a(int i)
    {
        return new ShuffleListItem[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
