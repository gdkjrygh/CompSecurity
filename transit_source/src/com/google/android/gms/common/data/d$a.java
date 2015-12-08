// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.dm;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            d

public static class <init>
{

    private final String jm[];
    private final ArrayList jv;
    private final String jw;
    private final HashMap jx;
    private boolean jy;
    private String jz;

    static String[] b(<init> <init>1)
    {
        return <init>1.jm;
    }

    static ArrayList c(jm jm1)
    {
        return jm1.jv;
    }

    private (String as[], String s)
    {
        jm = (String[])dm.e(as);
        jv = new ArrayList();
        jw = s;
        jx = new HashMap();
        jy = false;
        jz = null;
    }

    jz(String as[], String s, jz jz1)
    {
        this(as, s);
    }
}
