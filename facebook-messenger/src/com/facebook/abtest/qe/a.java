// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe;

import com.facebook.base.b;
import com.facebook.common.w.q;
import com.facebook.inject.d;

class a extends d
{

    private final javax.inject.a a;

    public a(javax.inject.a a1)
    {
        a = a1;
    }

    public Boolean a()
    {
        boolean flag;
        if (com.facebook.base.b.a() && a.b() == q.YES)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }
}
