// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cf;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.radio.data.ag;
import org.json.JSONException;
import p.cw.c;
import p.cx.h;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

// Referenced classes of package p.cf:
//            b

public class a extends h
{

    private c a;

    public a(c c1)
    {
        a = c1;
    }

    public transient Boolean a(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return Boolean.valueOf(a.e().o());
    }

    public a a()
    {
        return new a(a);
    }

    public void a(Boolean boolean1)
    {
        super.onPostExecute(boolean1);
        if (boolean1 == null)
        {
            p.df.a.b("CheckRefreshTokenTask", "An unexpected error occurred.");
            return;
        }
        a.k().d(System.currentTimeMillis());
        if (boolean1.booleanValue())
        {
            p.df.a.a("CheckRefreshTokenTask", "Server has valid refresh token.");
            return;
        } else
        {
            p.cf.b.a().d();
            return;
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return a(aobj);
    }

    public h b()
    {
        return a();
    }

    public void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }
}
