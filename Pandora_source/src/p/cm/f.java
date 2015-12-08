// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class f extends d
{

    public f()
    {
    }

    private void a(boolean flag, Throwable throwable)
    {
        if (flag)
        {
            p.df.a.c("CanSubscribeAsyncTask", (new StringBuilder()).append("AmazonInAppPurchase - CanSubscribeAsyncTask api error: ").append(throwable.getMessage()).toString());
            return;
        } else
        {
            p.df.a.c("GoogleInApp", (new StringBuilder()).append("CanSubscribeAsyncTask api error: ").append(throwable.getMessage()).toString());
            return;
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws q, y, JSONException, n
    {
        PandoraIntent pandoraintent;
        boolean flag1;
        flag1 = s.m();
        pandoraintent = new PandoraIntent("can_subscribe_result");
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (aobj[0] == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        boolean flag = ((Boolean)aobj[0]).booleanValue();
_L5:
        aobj = b.a.b().e().l("amazonappstore");
        pandoraintent.putExtra("intent_is_end_of_month", flag);
_L3:
        flag = ((JSONObject) (aobj)).optBoolean("canSubscribe", true);
_L4:
        pandoraintent.putExtra("intent_can_susbscribe", flag);
        b.a.C().a(pandoraintent);
        return null;
_L2:
        aobj = b.a.b().e().l("googleplay");
        pandoraintent.putExtra("intent_vendor_disabled", ((JSONObject) (aobj)).optBoolean("isVendorDisabled", false));
          goto _L3
        aobj;
        a(flag1, ((Throwable) (aobj)));
        switch (((y) (aobj)).a())
        {
        default:
            flag = false;
            break;

        case 1001: 
            throw aobj;
        }
          goto _L4
        aobj;
        a(flag1, ((Throwable) (aobj)));
        flag = false;
          goto _L4
        flag = false;
          goto _L5
    }
}
