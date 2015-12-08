// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.aj;
import com.pandora.radio.util.i;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.cx.h;
import p.cx.m;
import p.cx.n;
import p.cx.q;
import p.cx.t;
import p.cx.x;
import p.cx.y;
import p.dd.at;
import p.dd.s;
import p.df.a;

public class am extends h
{

    private final String a;
    private final JSONObject c;
    private final com.pandora.radio.data.b d;
    private final c e;
    private boolean f;
    private String g;
    private String h;
    private final p.cx.x.g i;
    private final String j;

    public am(c c1, String s1, JSONObject jsonobject, com.pandora.radio.data.b b1, String s2, String s3, p.cx.x.g g1, 
            String s4)
    {
        f = false;
        e = c1;
        a = s1;
        c = jsonobject;
        d = b1;
        g = s2;
        h = s3;
        i = g1;
        j = s4;
        c1.b(this);
    }

    private void a(aj aj1)
    {
        String s1;
        if (aj1 != null)
        {
            if (!com.pandora.radio.util.i.a(s1 = aj1.a("leadInBannerUrl")))
            {
                aj1 = b.a.d().b();
                if (aj1 == null)
                {
                    aj1 = new HashMap();
                } else
                {
                    aj1 = new HashMap(1, aj1) {

                        final String a;
                        final am b;

            
            {
                b = am.this;
                a = s1;
                super(k);
                put("Cookie", (new StringBuilder()).append("pat=").append(a).toString());
            }
                    };
                }
                try
                {
                    aj1 = new JSONObject(e.p().a(s1, aj1));
                }
                // Misplaced declaration of an exception variable
                catch (aj aj1)
                {
                    p.df.a.b("StartValueExchangeAsyncTask", "Fetching LEAD_IN_BANNER_URL failed", aj1);
                    aj1 = null;
                }
                if (aj1 != null)
                {
                    String s2 = aj1.optString("html");
                    int k = aj1.optInt("height", 250);
                    if (!com.pandora.radio.util.i.a(s2))
                    {
                        aj1 = (new com.pandora.radio.data.a.b(s2, k, com.pandora.radio.data.a.a.a)).b(true).a();
                        e.a(new s(aj1));
                        return;
                    }
                }
            }
        }
    }

    private void a(boolean flag)
    {
        b.a.e().a(new p.bz.s(flag, g, h));
    }

    public am a()
    {
        return new am(e, a, c, d, g, h, i, j);
    }

    public void a(Void void1)
    {
        e.c(this);
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

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        Object obj;
        aobj = com.pandora.radio.util.i.a(c);
        obj = e.e().a(a, ((java.util.Hashtable) (aobj)), j, d, i);
        aobj = ((Object []) (obj));
        b.a.b().d().b(ac.c);
        aobj = ((Object []) (obj));
        b.a.b().d().b(ac.b);
        if (obj != null) goto _L2; else goto _L1
_L1:
        a(false);
_L4:
        return null;
_L2:
        a(true);
_L8:
        e.e().d();
        if (f) goto _L4; else goto _L3
_L3:
        a(e.k().J());
        return null;
        Object obj1;
        obj1;
        obj = null;
_L11:
        aobj = ((Object []) (obj));
        ((y) (obj1)).a();
        JVM INSTR tableswitch 1043 1044: default 242
    //                   1043 185
    //                   1044 176;
           goto _L5 _L6 _L7
_L5:
        aobj = ((Object []) (obj));
        throw obj1;
        obj1;
        obj = ((Object) (aobj));
        aobj = ((Object []) (obj1));
_L9:
        if (obj == null)
        {
            a(false);
            return null;
        } else
        {
            a(true);
            throw aobj;
        }
_L7:
        aobj = ((Object []) (obj));
        m.c(((y) (obj1)).a());
_L6:
        if (obj == null)
        {
            a(false);
            return null;
        }
        a(true);
          goto _L8
        obj1;
        obj = null;
_L10:
        aobj = ((Object []) (obj));
        p.df.a.b("StartValueExchangeAsyncTask", "StartValueExchangeAsyncTask exception", ((Throwable) (obj1)));
        aobj = ((Object []) (obj));
        throw obj1;
        aobj;
        obj = null;
          goto _L9
        obj1;
          goto _L10
        obj1;
          goto _L11
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    public void onStationDataEvent(at at1)
    {
        boolean flag;
        if (at1.a != null && at1.a.A())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
