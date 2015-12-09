// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.util.Pair;
import org.json.JSONException;
import p.cw.b;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.ab;
import p.dd.p;

public class f extends d
{

    public f()
    {
    }

    protected transient void a(Exception exception, Object aobj[])
    {
        aobj = (String)aobj[0];
        aobj = new Pair(p.dd.ab.a.a, ((Object) (aobj)));
        c.z.a(new ab(exception.getMessage(), 2001, ((Pair) (aobj))));
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        boolean flag1 = false;
        aobj = (String)aobj[0];
        com.pandora.radio.data.y y1 = c.z.d().t();
        boolean flag = flag1;
        if (aobj != null)
        {
            flag = flag1;
            if (y1 != null)
            {
                flag = flag1;
                if (((String) (aobj)).equals(y1.c()))
                {
                    flag = true;
                }
            }
        }
        c.z.e().c(((String) (aobj)));
        c.z.a(new p(((String) (aobj)), flag));
        return null;
    }
}
