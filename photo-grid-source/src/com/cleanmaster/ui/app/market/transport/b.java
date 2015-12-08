// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.transport;

import android.text.TextUtils;
import com.cleanmaster.service.a;
import com.cleanmaster.ui.app.market.c;
import com.cleanmaster.ui.app.market.d;
import com.picksinit.PicksMob;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.cleanmaster.ui.app.market.transport:
//            c

public class b
{

    public static int a = -1;
    public static int b;
    public static String c = "unad.adkmob.com";
    public static String d = "unad.mobad.ijinshan.com";
    public static String e = "https";
    public static String f = "http";
    public static String g = "cm.adkmob.com";
    public static int h = -1;
    public static String i = "/queryUpdate/";
    public static String j;
    private static String k = null;

    public static ClientConnectionManager a(HttpParams httpparams)
    {
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        a(schemeregistry);
        return new SingleClientConnManager(httpparams, schemeregistry);
    }

    public static void a()
    {
        if (k != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        com.cleanmaster.service.a.a();
        String s = com.cleanmaster.service.a.b();
        k = s;
        if (TextUtils.isEmpty(s))
        {
            k = com.cleanmaster.util.b.a(PicksMob.getInstance().getContext());
            com.cleanmaster.service.a.a();
            com.cleanmaster.service.a.a(k);
        }
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }

    public static void a(String s)
    {
        k = s;
    }

    private static void a(SchemeRegistry schemeregistry)
    {
        schemeregistry.register(new Scheme("https", new com.cleanmaster.ui.app.market.transport.c(), 443));
    }

    public static String b()
    {
        if (k == null)
        {
            com.cleanmaster.service.a.a();
            k = com.cleanmaster.service.a.b();
        }
        return k;
    }

    public static String c()
    {
        if (PicksMob.getInstance().getmAdResourceRp() != 1)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        if (!com.cleanmaster.ui.app.market.d.a()) goto _L2; else goto _L1
_L1:
        String s = "sdk.mobad.ijinshan.com";
_L4:
        return s;
_L2:
        String s1;
        s1 = com.cleanmaster.ui.app.market.c.d();
        s = s1;
        if (!TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        return "ssdk.adkmob.com";
        if (com.cleanmaster.ui.app.market.d.a())
        {
            return d;
        } else
        {
            return c;
        }
    }

    static 
    {
        b = 80;
        j = (new StringBuilder("http://")).append(c()).append(":").append(b).append("/b/?action=get_config&mid=").toString();
    }
}
