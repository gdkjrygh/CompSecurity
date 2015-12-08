// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.gcm;

import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class b extends d
{

    public b()
    {
    }

    public transient Intent a(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        aobj = (String)aobj[0];
        com.pandora.android.provider.b.a.b().e().n(((String) (aobj)));
        p.df.a.a("UpdateRemoteNotificationTokenTask", "GCM Registration sent to backend");
        return null;
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return a(aobj);
    }
}
