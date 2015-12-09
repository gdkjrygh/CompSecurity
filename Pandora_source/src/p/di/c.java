// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.os.SystemClock;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.data.b;
import com.pandora.radio.data.z;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import org.json.JSONException;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.al;
import p.dm.m;

public class c extends h
{

    private final p.cw.c a;
    private final String c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;
    private final String h;
    private final Integer i;
    private final p.cx.x.e j;
    private final b k;
    private final long l;
    private final SearchDescriptor m;
    private final String n;

    public c(p.cw.c c1, String s, String s1, boolean flag, String s2, String s3, String s4, 
            Integer integer, p.cx.x.e e1, b b1, SearchDescriptor searchdescriptor, String s5)
    {
        a = c1;
        c = s;
        d = s1;
        e = flag;
        f = s2;
        g = s3;
        h = s4;
        i = integer;
        j = e1;
        if (b1 == null)
        {
            b1 = new b();
        }
        k = b1;
        l = SystemClock.elapsedRealtime();
        m = searchdescriptor;
        n = s5;
    }

    public c(p.cw.c c1, String s, String s1, boolean flag, p.cx.x.e e1, SearchDescriptor searchdescriptor, String s2)
    {
        this(c1, s, s1, flag, null, null, "", null, e1, null, searchdescriptor, s2);
    }

    public c a()
    {
        return new c(a, c, d, e, f, g, h, i, j, k, m, n);
    }

    public void a(Boolean boolean1)
    {
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
        com.pandora.radio.util.i.a(exception.getMessage(), c1);
        if (m.bn == 1)
        {
            a.d().f();
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
        int i1;
        i1 = a.y().g();
        aobj = a.e().a(c, i, j, k, m, n);
        com.pandora.radio.data.z.a a1;
        boolean flag;
        boolean flag1;
        if (a.y().g() > i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            flag1 = a.d().a(((com.pandora.radio.data.y) (aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            if (((y) (aobj)).a() == 1038)
            {
                throw new y(3000, "", null, null);
            } else
            {
                throw aobj;
            }
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        a1 = z.a(flag, j);
        a.o().b(new z(a1, l));
        a.a(new p.dd.m(((com.pandora.radio.data.y) (aobj)), flag, flag1, c, d, e, f, m));
        if (!flag) goto _L2; else goto _L1
_L1:
        if (g != null)
        {
            a.o().a(g, c, ((com.pandora.radio.data.y) (aobj)).h(), h);
        }
_L4:
        return Boolean.valueOf(flag);
_L2:
        if (!flag1) goto _L4; else goto _L3
_L3:
        a.a(new al(((com.pandora.radio.data.y) (aobj)).c()));
          goto _L4
    }

    public void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }
}
