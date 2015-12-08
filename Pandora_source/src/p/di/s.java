// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class s extends d
{

    public s()
    {
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        com.pandora.radio.data.d d1 = (com.pandora.radio.data.d)aobj[0];
        aobj = (com.pandora.radio.data.y)aobj[1];
        try
        {
            c.z.e().a(d1.e(), ((com.pandora.radio.data.y) (aobj)).t(), ((com.pandora.radio.data.y) (aobj)).h());
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            a.b("RegisterAdAsyncTask.class", "Unable to register audio ad impression", ((Throwable) (aobj)));
        }
        return null;
    }
}
