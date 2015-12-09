// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ag;
import org.json.JSONException;
import p.bz.z;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

public class p extends d
{

    public p()
    {
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws q, y, n, JSONException
    {
        aobj = b.a.b().e().e();
        b.a.b().k().a(((com.pandora.radio.data.ai) (aobj)));
        b.a.e().a(new z(((com.pandora.radio.data.ai) (aobj))));
        return null;
    }
}
