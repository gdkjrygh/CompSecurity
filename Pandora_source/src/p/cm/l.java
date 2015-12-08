// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.app.Activity;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.activity.a;
import com.pandora.android.util.s;
import org.json.JSONException;
import p.cq.b;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.ab;

public class l extends d
{

    b a;

    public l()
    {
    }

    private Void a(boolean flag)
    {
        if (a != null)
        {
            a.a(flag, null);
        }
        return null;
    }

    protected transient void a(Exception exception, Object aobj[])
    {
        com.pandora.android.provider.b.a.b().a(new ab(exception.getMessage(), 0, null));
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        Object obj;
        Activity activity;
        String s1;
        int i;
        i = ((Integer)aobj[0]).intValue();
        obj = (String)aobj[1];
        s1 = (String)aobj[2];
        activity = (Activity)aobj[3];
        if (aobj.length >= 5)
        {
            a = (b)aobj[4];
        }
        i;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 156
    //                   2 91;
           goto _L1 _L2 _L3
_L1:
        aobj = null;
        obj = null;
_L5:
        com.pandora.android.activity.a.a(activity, i, ((com.pandora.radio.data.y) (aobj)), ((com.pandora.radio.data.aa) (obj)), null);
        return a(true);
_L3:
        if (!s.a(s1))
        {
            obj = com.pandora.android.provider.b.a.b().e().f(s1);
            p.df.a.a("GetExtendedShareInfoAsyncTask", (new StringBuilder()).append("Get extended share track data by musicId: ").append(obj).toString());
            aobj = null;
        } else
        {
            p.df.a.a("GetExtendedShareInfoAsyncTask", "Get extended share track by musicId - missing musicId");
            return a(false);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!s.a(((String) (obj))))
        {
            aobj = com.pandora.android.provider.b.a.b().e().g(((String) (obj)));
            obj = null;
        } else
        {
            p.df.a.a("GetExtendedShareInfoAsyncTask", "Get extended share station by stationId - missing stationId");
            return a(false);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
