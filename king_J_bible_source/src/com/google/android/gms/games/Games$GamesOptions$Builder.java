// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;


// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class <init>
{

    boolean HZ;
    boolean Ia;
    int Ib;
    boolean Ic;
    int Id;

    public <init> build()
    {
        return new <init>(this, null);
    }

    public <init> setSdkVariant(int i)
    {
        Id = i;
        return this;
    }

    public Id setShowConnectingPopup(boolean flag)
    {
        Ia = flag;
        Ib = 17;
        return this;
    }

    public Ib setShowConnectingPopup(boolean flag, int i)
    {
        Ia = flag;
        Ib = i;
        return this;
    }

    private ()
    {
        HZ = false;
        Ia = true;
        Ib = 17;
        Ic = false;
        Id = 4368;
    }

    Id(Id id)
    {
        this();
    }
}
