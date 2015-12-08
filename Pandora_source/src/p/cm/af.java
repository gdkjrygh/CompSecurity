// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ag;
import org.json.JSONException;
import p.ce.a;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;

public class af extends d
{

    public af()
    {
    }

    private void a()
    {
        b.a.b().k().j(false);
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        String s;
        s = (String)aobj[0];
        aobj = (a)aobj[1];
        b.a.b().e().a(p.dj.b.a.b, s);
        b.a.b().k().j(true);
        boolean flag = true;
_L2:
        if (!flag)
        {
            a();
        }
        ((a) (aobj)).b();
        return null;
        Object obj;
        obj;
        p.df.a.a("SendMediaStoreCollectionAsyncTask", "MediaStoreCollectorAsyncTask PublicApi Error");
        flag = false;
        continue; /* Loop/switch isn't completed */
        obj;
        p.df.a.a("SendMediaStoreCollectionAsyncTask", "MediaStoreCollectorAsyncTask Network Error");
        flag = false;
        continue; /* Loop/switch isn't completed */
        obj;
        p.df.a.a("SendMediaStoreCollectionAsyncTask", "MediaStoreCollectorAsyncTask Http Error");
        flag = false;
        continue; /* Loop/switch isn't completed */
        obj;
        p.df.a.a("SendMediaStoreCollectionAsyncTask", "MediaStoreCollectorAsyncTask JSON Error");
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
