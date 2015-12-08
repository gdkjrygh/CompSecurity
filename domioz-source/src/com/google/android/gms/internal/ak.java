// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            a, ap, ao, am, 
//            al, an, aq

public abstract class ak
{

    private final String a;
    private final Object b;

    private ak(String s, Object obj)
    {
        a = s;
        b = obj;
        com.google.android.gms.internal.a.g().a.add(this);
    }

    ak(String s, Object obj, byte byte0)
    {
        this(s, obj);
    }

    public static ak a(String s)
    {
        s = new ao(s);
        com.google.android.gms.internal.a.g().b.add(s);
        return s;
    }

    public static ak a(String s, int i)
    {
        return new am(s, Integer.valueOf(i));
    }

    public static ak a(String s, Boolean boolean1)
    {
        return new al(s, boolean1);
    }

    public static ak a(String s, String s1)
    {
        return new an(s, s1);
    }

    static String a(Bundle bundle, String s, String s1)
    {
        bundle = bundle.getString(s);
        if (bundle == null)
        {
            return s1;
        } else
        {
            return bundle;
        }
    }

    protected abstract Object a(Bundle bundle);

    public final String a()
    {
        return a;
    }

    public final Object b()
    {
        return b;
    }

    public final Object c()
    {
        Object obj;
        obj = com.google.android.gms.internal.a.h().a();
        if (!((Future) (obj)).isDone())
        {
            return b;
        }
        obj = a((Bundle)((Future) (obj)).get());
        return obj;
        Object obj1;
        obj1;
_L2:
        return b;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
