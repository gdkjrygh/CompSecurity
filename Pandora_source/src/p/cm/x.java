// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.pandora.android.iap.b;
import com.pandora.android.util.s;
import java.security.InvalidParameterException;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.y;

public class x extends d
{
    public static interface a
    {

        public abstract void a(boolean flag);
    }


    private a a;

    public x(a a1)
    {
        a = a1;
    }

    private void a(boolean flag)
    {
        if (a != null)
        {
            a.a(flag);
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
        String s1;
        String s2;
        s1 = (String)aobj[0];
        s2 = (String)aobj[1];
        aobj = (String)aobj[2];
        if (s.a(s2))
        {
            com.pandora.android.iap.b.a("PurchaseAmazonSubscriptionAsyncTask", new InvalidParameterException("userId cannot be null"));
            a(false);
            return null;
        }
        if (s.a(((String) (aobj))))
        {
            com.pandora.android.iap.b.a("PurchaseAmazonSubscriptionAsyncTask", new InvalidParameterException("sku cannot be null"));
            a(false);
            return null;
        }
        if (s.a(s1))
        {
            com.pandora.android.iap.b.a("PurchaseAmazonSubscriptionAsyncTask", new InvalidParameterException("token cannot be null"));
            a(false);
            return null;
        }
        com.pandora.android.iap.b.d((new StringBuilder()).append("PurchaseAmazonSubscriptionAsyncTask: SKU = ").append(((String) (aobj))).toString());
        boolean flag = com.pandora.android.provider.b.a.b().e().c(s1, s2, ((String) (aobj)));
        a(flag);
        return null;
        aobj;
        com.pandora.android.iap.b.a("PurchaseAmazonSubscriptionAsyncTask - exception: ", ((Throwable) (aobj)));
        switch (((y) (aobj)).a())
        {
        default:
            a(false);
            throw aobj;

        case 1000: 
            a(false);
            break;
        }
        return null;
        aobj;
_L2:
        com.pandora.android.iap.b.a("PurchaseAmazonSubscriptionAsyncTask error: ", ((Throwable) (aobj)));
        a(false);
        throw aobj;
        aobj;
        continue; /* Loop/switch isn't completed */
        aobj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
