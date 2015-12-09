// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

public class ai extends d
{

    public ai()
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
        aobj = (Boolean)aobj[0];
        b.a.b().e().d(((Boolean) (aobj)).booleanValue());
        aobj = new PandoraIntent("user_aware_of_profile_success");
        b.a.C().a(((android.content.Intent) (aobj)));
        return null;
    }
}
