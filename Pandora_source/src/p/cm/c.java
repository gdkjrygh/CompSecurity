// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.provider.b;
import java.util.List;
import java.util.Vector;
import org.json.JSONException;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

public class c extends h
{
    public static interface a
    {

        public abstract void a(List list);

        public abstract void b(List list);
    }


    private a a;

    public c(a a1)
    {
        a = null;
        a = a1;
    }

    List a(Vector vector)
        throws y, JSONException, q, n
    {
        return b.a.b().e().b(vector);
    }

    public transient List a(p.dc.b ab[])
        throws JSONException, q, y, n, RemoteException
    {
        Object obj = null;
        if (ab.length > 0)
        {
            obj = new Vector();
            int j = ab.length;
            for (int i = 0; i < j; i++)
            {
                ((Vector) (obj)).add(ab[i].toString());
            }

            obj = a(((Vector) (obj)));
        }
        if (a != null)
        {
            a.a(((List) (obj)));
        }
        return ((List) (obj));
    }

    public c a()
    {
        return new c(a);
    }

    public void a(List list)
    {
        if (a != null)
        {
            a.b(list);
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return a((p.dc.b[])aobj);
    }

    public h b()
    {
        return a();
    }

    public void onPostExecute(Object obj)
    {
        a((List)obj);
    }
}
