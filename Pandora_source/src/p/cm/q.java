// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.radio.data.ae;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class q extends d
{

    public q()
    {
    }

    public Object b(Object aobj[])
        throws JSONException, p.cx.q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws p.cx.q, y, JSONException, n
    {
        boolean flag = false;
        boolean flag1 = b.a.b().e().l().f();
        flag = flag1;
_L2:
        aobj = new PandoraIntent("get_usage_result");
        ((Intent) (aobj)).putExtra("intent_is_capped", flag);
        b.a.C().a(((Intent) (aobj)));
        return null;
        aobj;
        switch (((y) (aobj)).a())
        {
        case 1001: 
            throw aobj;
        }
        continue; /* Loop/switch isn't completed */
        aobj;
        a.c("GetUsageInfoAsyncTask", "error", ((Throwable) (aobj)));
        if (true) goto _L2; else goto _L1
_L1:
    }
}
