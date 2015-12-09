// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

public class ac extends d
{

    public ac()
    {
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        c c1 = (c)aobj[0];
        com.pandora.radio.data.c c2 = (com.pandora.radio.data.c)aobj[1];
        aobj = (com.pandora.android.artist.a.a)aobj[2];
        c1.e().a(c2, ((com.pandora.android.artist.a.a) (aobj)).name());
        return null;
    }
}
