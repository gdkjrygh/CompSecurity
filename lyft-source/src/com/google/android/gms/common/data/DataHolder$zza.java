// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;

public class <init>
{

    private final String a[];
    private final ArrayList b;
    private final String c;
    private final HashMap d;
    private boolean e;
    private String f;

    static String[] a(<init> <init>1)
    {
        return <init>1.a;
    }

    static ArrayList b(a a1)
    {
        return a1.b;
    }

    private (String as[], String s)
    {
        a = (String[])zzu.a(as);
        b = new ArrayList();
        c = s;
        d = new HashMap();
        e = false;
        f = null;
    }

    f(String as[], String s, f f1)
    {
        this(as, s);
    }
}
