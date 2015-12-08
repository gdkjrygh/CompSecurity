// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.o;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public static class <init>
{

    private final String Kb[];
    private final ArrayList Kk;
    private final String Kl;
    private final HashMap Km;
    private boolean Kn;
    private String Ko;

    static String[] a(<init> <init>1)
    {
        return <init>1.Kb;
    }

    static ArrayList b(Kb kb)
    {
        return kb.Kk;
    }

    private (String as[], String s)
    {
        Kb = (String[])o.i(as);
        Kk = new ArrayList();
        Kl = s;
        Km = new HashMap();
        Kn = false;
        Ko = null;
    }

    Ko(String as[], String s, Ko ko)
    {
        this(as, s);
    }
}
