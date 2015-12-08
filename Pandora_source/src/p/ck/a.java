// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ck;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.au;

public class a extends d
{

    public a()
    {
    }

    public transient Void a(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        c c1 = (c)aobj[0];
        String s = (String)aobj[1];
        String s1 = (String)aobj[2];
        aobj = (String)aobj[3];
        c1.a(new au(c1.e().b(s, s1, ((String) (aobj))), p.dd.au.a.e));
        return null;
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return a(aobj);
    }
}
