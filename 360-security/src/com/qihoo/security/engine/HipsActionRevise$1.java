// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine;

import android.os.Parcel;

// Referenced classes of package com.qihoo.security.engine:
//            HipsActionRevise

class 
    implements android.os.ActionRevise._cls1
{

    public HipsActionRevise a(Parcel parcel)
    {
        return new HipsActionRevise(parcel);
    }

    public HipsActionRevise[] a(int i)
    {
        return new HipsActionRevise[i];
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
