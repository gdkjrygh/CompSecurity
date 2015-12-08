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
import p.dd.ab;

public class t extends d
{

    public t()
    {
    }

    protected transient void a(Exception exception, Object aobj[])
    {
        c.z.a(new ab(exception.getMessage(), 0, null));
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        String s;
        int i;
        i = ((Integer)aobj[0]).intValue();
        s = (String)aobj[1];
        aobj = (String)aobj[2];
        if ((i & 1) == 0) goto _L2; else goto _L1
_L1:
        c.z.e().c(s, ((String) (aobj)));
_L4:
        return null;
_L2:
        if ((i & 2) != 0)
        {
            c.z.e().d(s, ((String) (aobj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
