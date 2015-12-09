// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import org.json.JSONException;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dc.d;
import p.df.a;

public class e extends h
{
    public static interface a
    {

        public abstract void a(boolean flag, String s);
    }


    private x a;
    private a c;

    public e(x x1, a a1)
    {
        a = x1;
        c = a1;
    }

    public e a()
    {
        return new e(a, c);
    }

    protected d a(String s)
        throws y, q, JSONException, n
    {
        return a.m(s);
    }

    public transient d a(String as[])
        throws q, y, JSONException, n
    {
        if (as.length <= 0)
        {
            return new d(false, "Sku is required parameter");
        }
        as = as[0];
        try
        {
            as = a(((String) (as)));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            switch (as.a())
            {
            default:
                return new d(false, as.getMessage());

            case 1001: 
                throw as;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            d d1 = new d(false, as.getMessage());
            p.df.a.c("CanPurchaseALaCarteProductTask", "error", as);
            return d1;
        }
        return as;
    }

    public void a(d d1)
    {
        super.onPostExecute(d1);
        if (c != null)
        {
            c.a(d1.a(), d1.b());
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return a((String[])aobj);
    }

    public h b()
    {
        return a();
    }

    public void onPostExecute(Object obj)
    {
        a((d)obj);
    }
}
