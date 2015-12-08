// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.iap.f;
import java.util.List;
import org.json.JSONException;
import p.cc.e;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.df.a;

public class y extends h
{
    public static interface a
    {

        public abstract void a(p.dc.a a1, List list);
    }


    private a a;
    private x c;

    public y(x x1, a a1)
    {
        a = a1;
        c = x1;
    }

    public transient Void a(e ae[])
        throws q, p.cx.y, JSONException, n
    {
        if (ae.length < 1)
        {
            if (a != null)
            {
                a.a(null, null);
            }
        } else
        {
            Object obj = ae[0];
            ae = ((e) (obj)).f();
            String s = ((e) (obj)).b();
            String s1 = ((e) (obj)).c();
            String s2 = ((e) (obj)).h();
            obj = ((e) (obj)).g();
            try
            {
                ae = a(((String) (ae)), s, s1, s2, ((String) (obj)));
                p.df.a.a("PANDORA", (new StringBuilder()).append("Backend successful: ").append(ae).toString());
            }
            // Misplaced declaration of an exception variable
            catch (e ae[])
            {
                p.df.a.a("GoogleInApp", (new StringBuilder()).append("Backend api exception: ").append(ae.getMessage()).toString());
                switch (ae.a())
                {
                default:
                    f.a();
                    throw ae;

                case 1000: 
                    f.a();
                    break;
                }
                ae = new p.dc.e(null, null);
            }
            // Misplaced declaration of an exception variable
            catch (e ae[])
            {
                p.df.a.a("GoogleInApp", (new StringBuilder()).append("Backend IO error: ").append(ae.getMessage()).toString());
                f.a();
                throw ae;
            }
            // Misplaced declaration of an exception variable
            catch (e ae[])
            {
                p.df.a.a("GoogleInApp", (new StringBuilder()).append("Backend HTTP error: ").append(ae.getMessage()).toString());
                f.a();
                throw ae;
            }
            // Misplaced declaration of an exception variable
            catch (e ae[])
            {
                p.df.a.a("GoogleInApp", (new StringBuilder()).append("Backend json error: ").append(ae.getMessage()).toString());
                f.a();
                throw ae;
            }
            if (a != null)
            {
                a.a(ae.a(), ae.b());
                return null;
            }
        }
        return null;
    }

    public y a()
    {
        return new y(c, a);
    }

    p.dc.e a(String s, String s1, String s2, String s3, String s4)
        throws p.cx.y, q, JSONException, n
    {
        return c.a(s, s1, s2, s3, s4);
    }

    public Object b(Object aobj[])
        throws JSONException, q, p.cx.y, n, RemoteException, OperationApplicationException
    {
        return a((e[])aobj);
    }

    public h b()
    {
        return a();
    }
}
