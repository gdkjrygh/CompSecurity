// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.push;

import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import p.cw.c;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class b extends h
{

    private String a;
    private List c;
    private p.cx.x.a d;
    private p.cx.x.b e;

    public b(String s, List list, p.cx.x.a a1, p.cx.x.b b1)
    {
        a = s;
        c = list;
        d = a1;
        e = b1;
    }

    public b a()
    {
        return new b(a, c, d, e);
    }

    public transient AsyncTask a_(Object aobj[])
    {
        String s = "";
        if (a != null)
        {
            s = a;
        } else
        if (c != null)
        {
            s = TextUtils.join(",", c);
        }
        if (f())
        {
            p.df.a.d("TrackRemoteNotificationTask", "Notification tracking dropped: %s %s (%s)", new Object[] {
                s, d.name(), e.name()
            });
            return null;
        } else
        {
            return super.a_(aobj);
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public h b()
    {
        return a();
    }

    public transient Intent c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        aobj = "";
        if (a == null) goto _L2; else goto _L1
_L1:
        aobj = a;
        com.pandora.android.provider.b.a.b().e().a(a, d, e);
_L4:
        p.df.a.a("TrackRemoteNotificationTask", "Notification tracked: %s %s (%s)", new Object[] {
            aobj, d.name(), e.name()
        });
        return null;
_L2:
        if (c != null)
        {
            aobj = TextUtils.join(",", c);
            com.pandora.android.provider.b.a.b().e().a(c, d, e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
