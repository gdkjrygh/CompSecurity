// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.am;

public class m extends d
{

    public m()
    {
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        c c1 = (c)aobj[0];
        aobj = (String)aobj[1];
        c1.a(new am(((String) (aobj)), c1.e().e(((String) (aobj)))));
        return null;
    }
}
