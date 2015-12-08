// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class <init>
{

    boolean VD;
    boolean VE;
    int VF;
    boolean VG;
    int VH;
    String VI;
    ArrayList VJ;

    public <init> build()
    {
        return new <init>(this, null);
    }

    public <init> setSdkVariant(int i)
    {
        VH = i;
        return this;
    }

    public VH setShowConnectingPopup(boolean flag)
    {
        VE = flag;
        VF = 17;
        return this;
    }

    public VF setShowConnectingPopup(boolean flag, int i)
    {
        VE = flag;
        VF = i;
        return this;
    }

    private ()
    {
        VD = false;
        VE = true;
        VF = 17;
        VG = false;
        VH = 4368;
        VI = null;
        VJ = new ArrayList();
    }

    VJ(VJ vj)
    {
        this();
    }
}
