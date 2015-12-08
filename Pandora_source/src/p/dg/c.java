// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.radio.data.k;
import org.json.JSONException;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.u;
import p.df.a;

// Referenced classes of package p.dg:
//            l, g

public class c extends d
{

    private p.cw.c a;

    public c()
    {
    }

    private void a(Exception exception, l l1)
    {
        l1.a(exception);
        int i;
        if (exception instanceof y)
        {
            i = ((y)exception).a();
        } else
        {
            i = -1;
        }
        exception = exception.getMessage();
        a.a(new u(exception, i, p.dg.g.a(a).g()));
        p.dg.g.a(a).f();
    }

    private boolean a(y y1, l l1)
    {
        if (y1.a() == 1006 && !a.C())
        {
            a(((Exception) (y1)), l1);
            return true;
        }
        if (y1.a() == 1038 || y1.a() == 1006)
        {
            l1.a(y1);
            return true;
        } else
        {
            return false;
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, RemoteException, n
    {
        l l1;
        p.cw.b.b b1;
        long l2;
        l2 = System.currentTimeMillis();
        l1 = (l)aobj[0];
        a = (p.cw.c)aobj[1];
        b1 = (p.cw.b.b)aobj[2];
        aobj = (k)aobj[3];
        aobj = a.e().a(l1.m(), b1, ((k) (aobj)));
        l1.a(l1.a(((p.cx.x.c) (aobj)).a), ((p.cx.x.c) (aobj)).b);
        p.df.a.c("GetPlaylistTask", "GetPlaylistTask took %s ms", new Object[] {
            String.valueOf(System.currentTimeMillis() - l2)
        });
        return null;
        aobj;
        if (a.C())
        {
            throw aobj;
        }
        break MISSING_BLOCK_LABEL_133;
        aobj;
        p.df.a.c("GetPlaylistTask", "GetPlaylistTask took %s ms", new Object[] {
            String.valueOf(System.currentTimeMillis() - l2)
        });
        throw aobj;
        a(((Exception) (aobj)), l1);
        p.df.a.c("GetPlaylistTask", "GetPlaylistTask took %s ms", new Object[] {
            String.valueOf(System.currentTimeMillis() - l2)
        });
        return null;
        aobj;
        if (a.C())
        {
            throw aobj;
        }
        a(((Exception) (aobj)), l1);
        p.df.a.c("GetPlaylistTask", "GetPlaylistTask took %s ms", new Object[] {
            String.valueOf(System.currentTimeMillis() - l2)
        });
        return null;
        aobj;
        boolean flag = a(((y) (aobj)), l1);
        if (flag)
        {
            p.df.a.c("GetPlaylistTask", "GetPlaylistTask took %s ms", new Object[] {
                String.valueOf(System.currentTimeMillis() - l2)
            });
            return null;
        }
        if (((y) (aobj)).a() == 1001 || a.C())
        {
            throw aobj;
        }
        a(((Exception) (aobj)), l1);
        p.df.a.c("GetPlaylistTask", "GetPlaylistTask took %s ms", new Object[] {
            String.valueOf(System.currentTimeMillis() - l2)
        });
        return null;
        aobj;
        if (a.C())
        {
            throw aobj;
        }
        a(((Exception) (aobj)), l1);
        p.df.a.c("GetPlaylistTask", "GetPlaylistTask took %s ms", new Object[] {
            String.valueOf(System.currentTimeMillis() - l2)
        });
        return null;
    }
}
