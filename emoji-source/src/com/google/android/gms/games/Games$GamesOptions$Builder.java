// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;


// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class <init>
{

    boolean MM;
    boolean MN;
    int MO;
    boolean MP;
    int MQ;
    String MR;

    public <init> build()
    {
        return new <init>(this, null);
    }

    public <init> setSdkVariant(int i)
    {
        MQ = i;
        return this;
    }

    public MQ setShowConnectingPopup(boolean flag)
    {
        MN = flag;
        MO = 17;
        return this;
    }

    public MO setShowConnectingPopup(boolean flag, int i)
    {
        MN = flag;
        MO = i;
        return this;
    }

    private ()
    {
        MM = false;
        MN = true;
        MO = 17;
        MP = false;
        MQ = 4368;
        MR = null;
    }

    MR(MR mr)
    {
        this();
    }
}
