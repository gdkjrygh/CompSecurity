// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import b.a.a.a.a.a.b;
import b.a.a.a.a.b.o;
import b.a.a.a.a.b.t;
import b.a.a.a.a.b.z;
import b.a.a.a.a.f.c;
import b.a.a.a.a.g.f;
import b.a.a.a.a.g.q;
import b.a.a.a.d;
import b.a.a.a.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

// Referenced classes of package com.a.a.b:
//            g, b, c

public class a extends l
    implements o
{

    private final b a = new b();
    private final g b = new g();

    public a()
    {
    }

    private static com.a.a.b.b a(Context context)
    {
        Object obj = null;
        context = context.getAssets().open("crashlytics-build.properties");
        if (context == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj = new Properties();
        ((Properties) (obj)).load(context);
        obj1 = new com.a.a.b.b(((Properties) (obj)).getProperty("version_code"), ((Properties) (obj)).getProperty("version_name"), ((Properties) (obj)).getProperty("build_id"), ((Properties) (obj)).getProperty("package_name"));
        d.c();
        (new StringBuilder()).append(((com.a.a.b.b) (obj1)).d).append(" build properties: ").append(((com.a.a.b.b) (obj1)).b).append(" (").append(((com.a.a.b.b) (obj1)).a).append(") - ").append(((com.a.a.b.b) (obj1)).c);
        obj = obj1;
_L9:
        obj1 = obj;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                d.c().b("Beta", "Error closing Beta build properties asset", context);
                return ((com.a.a.b.b) (obj));
            }
            obj1 = obj;
        }
_L4:
        return ((com.a.a.b.b) (obj1));
        obj1;
        context = null;
_L7:
        d.c().b("Beta", "Error reading Beta build properties", ((Throwable) (obj1)));
        obj1 = context;
        if (obj == null) goto _L4; else goto _L3
_L3:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d.c().b("Beta", "Error closing Beta build properties asset", ((Throwable) (obj)));
            return context;
        }
        return context;
        obj;
        context = null;
_L6:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                d.c().b("Beta", "Error closing Beta build properties asset", context);
            }
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj1;
        context = ((Context) (obj));
        obj = obj1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        Object obj2 = null;
        obj = context;
        context = obj2;
          goto _L7
        Exception exception;
        exception;
        obj = context;
        context = ((Context) (obj1));
        obj1 = exception;
          goto _L7
_L2:
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String a(Context context, String s)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            if (s == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = "io.crash.air".equals(s);
        }
        if (flag)
        {
            d.c();
            try
            {
                context = (String)a.a(context, b);
                flag = "".equals(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                d.c().b("Beta", "Failed to load the Beta device token", context);
                return null;
            }
            if (flag)
            {
                context = null;
            }
            return context;
        } else
        {
            d.c();
            return null;
        }
    }

    public final String a()
    {
        return "1.1.2.37";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:beta";
    }

    public final Map c()
    {
        String s = u().h();
        s = a(v(), s);
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s))
        {
            hashmap.put(b.a.a.a.a.b.t.a.c, s);
        }
        return hashmap;
    }

    protected final Object e()
    {
        boolean flag1 = false;
        d.c();
        Context context = v();
        t t1 = u();
        if (TextUtils.isEmpty(a(context, t1.h())))
        {
            d.c();
            return Boolean.valueOf(false);
        }
        d.c();
        Object obj = q.a().b();
        com.a.a.b.b b1;
        boolean flag;
        if (obj != null)
        {
            obj = ((b.a.a.a.a.g.t) (obj)).f;
        } else
        {
            obj = null;
        }
        b1 = a(context);
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(((f) (obj)).a))
            {
                flag = flag1;
                if (b1 != null)
                {
                    flag = true;
                }
            }
        }
        if (flag)
        {
            (new com.a.a.b.c(context, this, t1, ((f) (obj)), b1, new c(d.a(com/a/a/b/a)), new z(), new b.a.a.a.a.e.b(d.c()))).a();
        }
        return Boolean.valueOf(true);
    }
}
