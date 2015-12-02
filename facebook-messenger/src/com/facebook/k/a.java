// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.k;

import android.content.Intent;
import com.facebook.base.broadcast.j;

public class a
{

    public static final String a = (new StringBuilder()).append(com/facebook/k/a.getCanonicalName()).append(".ACTION_NETWORK_ACTIVITY").toString();
    private long b;
    private final j c;
    private final com.facebook.common.time.a d;

    public a(j j1, com.facebook.common.time.a a1)
    {
        c = j1;
        d = a1;
    }

    public void a()
    {
        long l = d.a();
        if (b + 60000L <= l)
        {
            b = l;
            Intent intent = new Intent(a);
            c.a(intent);
        }
    }

}
