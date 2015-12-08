// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.aa;
import com.jcp.util.ae;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.jcp.c:
//            z, y, v

public class u
{

    private static final String a = com/jcp/c/u.getSimpleName();
    private final Context b;
    private Map c;
    private ExecutorService d;
    private Handler e;
    private v f;
    private boolean g;

    public u(Context context)
    {
        c = Collections.synchronizedMap(new WeakHashMap());
        e = new Handler();
        b = context;
        d = Executors.newFixedThreadPool(5);
    }

    static Handler a(u u1)
    {
        return u1.e;
    }

    static ProductEntityContainer a(u u1, String s)
    {
        return u1.a(s);
    }

    private ProductEntityContainer a(String s)
    {
        ae.c(a, (new StringBuilder()).append("Loading url :").append(s).toString());
        s = (new StringBuilder()).append(s).append(b.g).toString();
        s = com.jcp.http.b.a(JCP.k().newCall(com.jcp.http.b.a(s)).execute());
        boolean flag;
        if (s == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        s = b(s);
        return s;
        s;
        ae.a(a, "Exception : ", s);
        s.printStackTrace();
        return null;
    }

    static String a()
    {
        return a;
    }

    static v b(u u1)
    {
        return u1.f;
    }

    private ProductEntityContainer b(String s)
    {
        return (ProductEntityContainer)aa.a(new InputStreamReader(new ByteArrayInputStream(s.getBytes())), com/jcp/productentity/ProductEntityContainer);
    }

    private void b(String s, View view)
    {
        ae.c(a, (new StringBuilder()).append("Queued url :").append(s).toString());
        s = new z(this, s, view);
        d.submit(new y(this, s));
    }

    static boolean c(u u1)
    {
        return u1.g;
    }

    static Context d(u u1)
    {
        return u1.b;
    }

    public void a(v v)
    {
        f = v;
    }

    public void a(String s, View view)
    {
        ae.c(a, (new StringBuilder()).append("Trying to load url :").append(s).toString());
        c.put(view, s);
        b(s, view);
    }

    boolean a(z z1)
    {
        String s = (String)c.get(com.jcp.c.z.b(z1));
        return s == null || !s.equals(z.a(z1));
    }

}
