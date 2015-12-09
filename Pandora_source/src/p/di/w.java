// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.util.Pair;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.ab;
import p.dd.g;

public class w extends d
{

    public w()
    {
    }

    protected transient void a(Exception exception, Object aobj[])
    {
        aobj = new Pair(p.dd.ab.a.b, Integer.valueOf(1));
        c.z.a(new ab(exception.getMessage(), 2005, ((Pair) (aobj))));
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        String s = (String)aobj[0];
        aobj = (String)aobj[1];
        c.z.e().i(s);
        c.z.a(new g(1, ((String) (aobj))));
        return null;
    }
}
