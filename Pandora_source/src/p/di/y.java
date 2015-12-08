// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import org.json.JSONException;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;

public class y extends d
{

    public y()
    {
    }

    public void a(Void void1)
    {
        super.onPostExecute(void1);
    }

    public Object b(Object aobj[])
        throws JSONException, q, p.cx.y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, p.cx.y, n, RemoteException, OperationApplicationException
    {
        Intent intent = (Intent)aobj[0];
        ((x)aobj[1]).a(new Intent(intent));
        return null;
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }
}
