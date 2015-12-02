// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.os.Parcel;

// Referenced classes of package com.qihoo.security.profile:
//            ProfileDataKeeper

static final class 
    implements android.os.Keeper.Sample._cls1
{

    public  a(Parcel parcel)
    {
        return new nit>(parcel);
    }

    public nit>[] a(int i)
    {
        return new nit>[i];
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
