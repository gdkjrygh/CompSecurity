// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.hn;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public static class <init>
{

    private final String ED[];
    private final ArrayList EM;
    private final String EN;
    private final HashMap EO;
    private boolean EP;
    private String EQ;

    static String[] a(<init> <init>1)
    {
        return <init>1.ED;
    }

    static ArrayList b(ED ed)
    {
        return ed.EM;
    }

    private (String as[], String s)
    {
        ED = (String[])hn.f(as);
        EM = new ArrayList();
        EN = s;
        EO = new HashMap();
        EP = false;
        EQ = null;
    }

    EQ(String as[], String s, EQ eq)
    {
        this(as, s);
    }
}
