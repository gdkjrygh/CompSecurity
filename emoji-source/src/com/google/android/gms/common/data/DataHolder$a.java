// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.hm;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public static class <init>
{

    private final String EG[];
    private final ArrayList EP;
    private final String EQ;
    private final HashMap ER;
    private boolean ES;
    private String ET;

    static String[] a(<init> <init>1)
    {
        return <init>1.EG;
    }

    static ArrayList b(EG eg)
    {
        return eg.EP;
    }

    private (String as[], String s)
    {
        EG = (String[])hm.f(as);
        EP = new ArrayList();
        EQ = s;
        ER = new HashMap();
        ES = false;
        ET = null;
    }

    ET(String as[], String s, ET et)
    {
        this(as, s);
    }
}
