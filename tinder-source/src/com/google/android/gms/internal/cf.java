// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            cl, cg, cc, x, 
//            j, k, i

public final class cf
{

    final Object a = new Object();
    Boolean b;
    private final String c = cl.a();
    private final cg d;
    private BigInteger e;
    private final HashSet f = new HashSet();
    private final HashMap g = new HashMap();
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private Context l;
    private VersionInfoParcel m;
    private x n;
    private boolean o;
    private j p;
    private k q;
    private i r;
    private final LinkedList s = new LinkedList();
    private final cc t = null;
    private String u;
    private boolean v;
    private boolean w;

    public cf()
    {
        e = BigInteger.ONE;
        h = false;
        i = true;
        j = 0;
        k = false;
        n = null;
        o = true;
        p = null;
        q = null;
        r = null;
        b = null;
        v = false;
        w = false;
        d = new cg(c);
    }

    public final x a()
    {
        x x;
        synchronized (a)
        {
            x = n;
        }
        return x;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String a(int i1, String s1)
    {
        Resources resources;
        if (m.e)
        {
            resources = l.getResources();
        } else
        {
            resources = GooglePlayServicesUtil.getRemoteResource(l);
        }
        if (resources == null)
        {
            return s1;
        } else
        {
            return resources.getString(i1);
        }
    }

    public final void a(Throwable throwable, boolean flag)
    {
        (new cc(l, m)).a(throwable, flag);
    }

    public final String b()
    {
        String s1;
        synchronized (a)
        {
            s1 = u;
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Boolean c()
    {
        Boolean boolean1;
        synchronized (a)
        {
            boolean1 = b;
        }
        return boolean1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
