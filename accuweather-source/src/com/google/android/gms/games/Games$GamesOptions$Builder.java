// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;


// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class <init>
{

    boolean MJ;
    boolean MK;
    int ML;
    boolean MM;
    int MN;
    String MO;

    public <init> build()
    {
        return new <init>(this, null);
    }

    public <init> setSdkVariant(int i)
    {
        MN = i;
        return this;
    }

    public MN setShowConnectingPopup(boolean flag)
    {
        MK = flag;
        ML = 17;
        return this;
    }

    public ML setShowConnectingPopup(boolean flag, int i)
    {
        MK = flag;
        ML = i;
        return this;
    }

    private ()
    {
        MJ = false;
        MK = true;
        ML = 17;
        MM = false;
        MN = 4368;
        MO = null;
    }

    MO(MO mo)
    {
        this();
    }
}
