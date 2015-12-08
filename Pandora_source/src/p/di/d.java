// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.os.SystemClock;
import com.pandora.radio.data.z;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import org.json.JSONException;
import p.cw.b;
import p.cw.c;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.al;
import p.dm.m;

public class d extends h
{

    private final String a;
    private final String c;
    private final p.cx.x.e d;
    private final c e;
    private final long f = SystemClock.elapsedRealtime();

    public d(c c1, String s, String s1, p.cx.x.e e1)
    {
        e = c1;
        a = s;
        c = s1;
        d = e1;
    }

    public d a()
    {
        return new d(e, a, c, d);
    }

    protected transient void a(Exception exception, Object aobj[])
    {
        char c1;
        if ((exception instanceof y) && ((y)exception).a() == 1005)
        {
            c1 = '\u03ED';
        } else
        {
            c1 = '\u07D4';
        }
        i.a(exception.getMessage(), c1);
        if (m.bn == 1)
        {
            e.d().f();
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

    public transient Boolean c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        e.y();
        int j = e.y().g();
        aobj = e.e().a(a, c, d);
        boolean flag;
        boolean flag1;
        if (e.y().g() > j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = e.d().a(((com.pandora.radio.data.y) (aobj)));
        if (!flag1)
        {
            com.pandora.radio.data.z.a a1 = z.a(flag, d);
            e.o().b(new z(a1, f));
        }
        e.a(new p.dd.m(((com.pandora.radio.data.y) (aobj)), flag, flag1, a, null, false, null, null));
        if (flag1)
        {
            e.a(new al(((com.pandora.radio.data.y) (aobj)).c()));
        }
        return null;
    }
}
