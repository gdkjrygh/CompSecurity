// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import com.google.android.m4b.maps.bo.ak;
import com.google.android.m4b.maps.bo.ax;
import com.google.android.m4b.maps.bo.ay;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bo.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g
    implements ax
{
    public static final class a
    {

        final List a = new ArrayList();

        public a()
        {
        }
    }


    private final ax a;

    public g(List list)
    {
        Object obj = list.iterator();
        int i;
        for (i = 0; ((Iterator) (obj)).hasNext(); i = ((ak)((Iterator) (obj)).next()).a() + i) { }
        obj = new ay(i);
        for (list = list.iterator(); list.hasNext(); ((ak)list.next()).a(((ay) (obj)))) { }
        a = ((ax) (obj));
    }

    public final m a()
    {
        return a.a();
    }

    public final boolean a(com.google.android.m4b.maps.bo.g g1)
    {
        return a.a(g1);
    }

    public final boolean a(n n)
    {
        return a.a(n);
    }
}
