// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.android.slyce.report.mpmetrics.ab;
import com.android.slyce.report.mpmetrics.af;
import com.android.slyce.report.mpmetrics.az;
import com.android.slyce.report.mpmetrics.bl;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;

// Referenced classes of package com.android.slyce.report.c:
//            ab, z, g, j, 
//            ag, ah, b

public class ac
    implements com.android.slyce.report.c.ab, z
{

    private final List a = new ArrayList();
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final ab e;
    private final b f;
    private final SSLSocketFactory g;
    private final g h;
    private final j i = new j();
    private final bl j = new bl();
    private final Map k;
    private final ah l;

    public ac(Context context, String s, af af1)
    {
        e = ab.a(context);
        String s1 = e.q();
        Object obj = s1;
        if (s1 == null)
        {
            obj = context.getPackageName();
        }
        h = new g(new az(((String) (obj)), context));
        k = af1.d();
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks(new ag(this));
        obj = new HandlerThread(com/android/slyce/report/c/ac.getCanonicalName());
        ((HandlerThread) (obj)).setPriority(10);
        ((HandlerThread) (obj)).start();
        l = new ah(this, context, s, ((HandlerThread) (obj)).getLooper());
        l.sendMessage(l.obtainMessage(0));
        f = new b(af1, l);
        try
        {
            context = SSLContext.getInstance("TLS");
            context.init(null, null, null);
            context = context.getSocketFactory();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.i("MixpanelAPI.ViewCrawler", "System has no SSL support. Built-in events editor will not be available", context);
            context = null;
        }
        g = context;
    }

    static ah a(ac ac1)
    {
        return ac1.l;
    }

    static j b(ac ac1)
    {
        return ac1.i;
    }

    static ab c(ac ac1)
    {
        return ac1.e;
    }

    static List d(ac ac1)
    {
        return ac1.a;
    }

    static List e(ac ac1)
    {
        return ac1.c;
    }

    static SSLSocketFactory f(ac ac1)
    {
        return ac1.g;
    }

    static bl g(ac ac1)
    {
        return ac1.j;
    }

    static Map h(ac ac1)
    {
        return ac1.k;
    }

    static g i(ac ac1)
    {
        return ac1.h;
    }

    static List j(ac ac1)
    {
        return ac1.b;
    }

    static List k(ac ac1)
    {
        return ac1.d;
    }

    static b l(ac ac1)
    {
        return ac1.f;
    }

    public void a(String s)
    {
        Message message = l.obtainMessage();
        message.what = 9;
        message.obj = s;
        l.sendMessage(message);
    }

    public void a(JSONArray jsonarray)
    {
        Message message = l.obtainMessage(6);
        message.obj = jsonarray;
        l.sendMessage(message);
    }
}
