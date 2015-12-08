// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.provider.b;
import java.util.Arrays;
import org.json.JSONException;
import p.cw.c;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

public class f extends h
{

    private final p.cx.x.d a;

    public f(p.cx.x.d d)
    {
        a = d;
    }

    public f a()
    {
        return new f(a);
    }

    public transient Void a(Long along[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        b.a.b().e().a(Arrays.asList(along), a);
        return null;
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return a((Long[])aobj);
    }

    public h b()
    {
        return a();
    }
}
