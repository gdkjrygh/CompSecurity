// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class <init>
{

    boolean Xa;
    boolean Xb;
    int Xc;
    boolean Xd;
    int Xe;
    String Xf;
    ArrayList Xg;

    public <init> build()
    {
        return new <init>(this, null);
    }

    public <init> setSdkVariant(int i)
    {
        Xe = i;
        return this;
    }

    public Xe setShowConnectingPopup(boolean flag)
    {
        Xb = flag;
        Xc = 17;
        return this;
    }

    public Xc setShowConnectingPopup(boolean flag, int i)
    {
        Xb = flag;
        Xc = i;
        return this;
    }

    private ()
    {
        Xa = false;
        Xb = true;
        Xc = 17;
        Xd = false;
        Xe = 4368;
        Xf = null;
        Xg = new ArrayList();
    }

    Xg(Xg xg)
    {
        this();
    }
}
