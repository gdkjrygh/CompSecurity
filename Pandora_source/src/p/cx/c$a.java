// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import java.util.Hashtable;
import org.json.JSONException;
import p.df.a;
import p.dm.m;

// Referenced classes of package p.cx:
//            d, c, q, y, 
//            n, x

public static class .Object extends d
{

    public transient void a(Exception exception, Object aobj[])
    {
        p.df.a.b("PandoraLink", "API call to accessory.accessoryConnect failed", exception);
    }

    public void a(Hashtable hashtable)
    {
        m.a(hashtable);
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Hashtable c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        return ((x)aobj[0]).r();
    }

    public void onPostExecute(Object obj)
    {
        a((Hashtable)obj);
    }

    public .Object()
    {
    }
}
