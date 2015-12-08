// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.bl;
import java.util.ArrayList;
import java.util.HashMap;

public class b
{

    private final String a[];
    private final ArrayList b;
    private final String c;
    private final HashMap d;
    private boolean e;
    private String f;

    private b(String as[])
    {
        a = (String[])bl.a(as);
        b = new ArrayList();
        c = null;
        d = new HashMap();
        e = false;
        f = null;
    }

    b(String as[], byte byte0)
    {
        this(as);
    }
}
