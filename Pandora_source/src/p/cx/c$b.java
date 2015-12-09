// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import org.json.JSONException;

// Referenced classes of package p.cx:
//            h, c, q, y, 
//            n

private class <init> extends h
{

    final c a;

    public <init> a()
    {
        return new <init>(a);
    }

    public transient Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        a.m();
        return null;
    }

    public h b()
    {
        return a();
    }

    public void onPostExecute(Object obj)
    {
        super.onPostExecute(obj);
        a.T();
    }

    private .Object(c c1)
    {
        a = c1;
        super();
    }

    nit>(c c1, nit> nit>)
    {
        this(c1);
    }
}
