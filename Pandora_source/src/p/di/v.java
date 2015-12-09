// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.radio.provider.StationProvider;
import com.pandora.radio.provider.f;
import org.json.JSONException;
import p.cw.b;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

public class v extends d
{

    private c a;
    private p.cx.f c;

    public v()
    {
    }

    private void a()
    {
        a.d().f();
        a.x().a();
        a.s().getContentResolver().delete(StationProvider.f, null, null);
        ((p.dj.c)a.q()).a(true);
        c.a(p.cx.e.a.d);
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    protected transient boolean b(Exception exception, Object aobj[])
    {
        a();
        return true;
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException
    {
        if (aobj.length < 3)
        {
            return null;
        }
        a = (c)aobj[0];
        c = (p.cx.f)aobj[1];
        if (((Boolean)aobj[2]).booleanValue())
        {
            try
            {
                a.e().h();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                if (((y) (aobj)).a() != 1009)
                {
                    throw aobj;
                }
            }
        }
        a.d().f();
        a();
        return null;
    }
}
