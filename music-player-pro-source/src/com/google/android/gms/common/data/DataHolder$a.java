// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public static class <init>
{

    private final String Ld[];
    private final ArrayList Lm;
    private final String Ln;
    private final HashMap Lo;
    private boolean Lp;
    private String Lq;

    static String[] a(<init> <init>1)
    {
        return <init>1.Ld;
    }

    static ArrayList b(Ld ld)
    {
        return ld.Lm;
    }

    private (String as[], String s)
    {
        Ld = (String[])jx.i(as);
        Lm = new ArrayList();
        Ln = s;
        Lo = new HashMap();
        Lp = false;
        Lq = null;
    }

    Lq(String as[], String s, Lq lq)
    {
        this(as, s);
    }
}
