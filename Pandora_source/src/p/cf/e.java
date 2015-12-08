// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cf;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import org.json.JSONException;
import p.cw.c;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

public class e extends h
{

    private c a;
    private String c;

    public e(c c1, String s)
    {
        a = c1;
        c = s;
    }

    public transient Void a(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        a.e().o(c);
        return null;
    }

    public e a()
    {
        return new e(a, c);
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return a(aobj);
    }

    public h b()
    {
        return a();
    }
}
