// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import b.a.a.a.a.a.b;
import b.a.a.a.a.b.ah;
import b.a.a.a.a.b.s;
import b.a.a.a.a.b.x;
import b.a.a.a.a.b.y;
import b.a.a.a.a.f.c;
import b.a.a.a.a.g.v;
import b.a.a.a.f;
import b.a.a.a.o;
import b.a.a.a.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

// Referenced classes of package com.a.a.b:
//            g, b, c

public class a extends o
    implements s
{

    private final b a = new b();
    private final g g = new g();

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
        f.c().a("Beta", (new StringBuilder()).append(((com.a.a.b.b) (obj1)).d).append(" build properties: ").append(((com.a.a.b.b) (obj1)).b).append(" (").append(((com.a.a.b.b) (obj1)).a).append(") - ").append(((com.a.a.b.b) (obj1)).c).toString());
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
                f.c().c("Beta", "Error closing Beta build properties asset", context);
                return ((com.a.a.b.b) (obj));
            }
            obj1 = obj;
        }
_L4:
        return ((com.a.a.b.b) (obj1));
        obj1;
        context = null;
_L7:
        f.c().c("Beta", "Error reading Beta build properties", ((Throwable) (obj1)));
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
            f.c().c("Beta", "Error closing Beta build properties asset", ((Throwable) (obj)));
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
                f.c().c("Beta", "Error closing Beta build properties asset", context);
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

    private String a(Context context, String s1)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            if (s1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = "io.crash.air".equals(s1);
        }
        if (flag)
        {
            f.c().a("Beta", "App was installed by Beta. Getting device token");
            try
            {
                context = (String)a.a(context, g);
                flag = "".equals(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                f.c().c("Beta", "Failed to load the Beta device token", context);
                return null;
            }
            if (flag)
            {
                context = null;
            }
            return context;
        } else
        {
            f.c().a("Beta", "App was not installed by Beta. Skipping device token");
            return null;
        }
    }

    public final Map b()
    {
        String s1 = v().h();
        s1 = a(w(), s1);
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s1))
        {
            hashmap.put(y.c, s1);
        }
        return hashmap;
    }

    public final String c()
    {
        return "com.crashlytics.sdk.android:beta";
    }

    public final String d()
    {
        return "1.1.2.37";
    }

    protected final Object t()
    {
        boolean flag1 = false;
        f.c().a("Beta", "Beta kit initializing...");
        Context context = w();
        x x1 = v();
        if (TextUtils.isEmpty(a(context, x1.h())))
        {
            f.c().a("Beta", "A Beta device token was not found for this app");
            return Boolean.valueOf(false);
        }
        f.c().a("Beta", "Beta device token is present, checking for app updates.");
        Object obj = b.a.a.a.a.g.q.a().b();
        com.a.a.b.b b1;
        boolean flag;
        if (obj != null)
        {
            obj = ((v) (obj)).f;
        } else
        {
            obj = null;
        }
        b1 = a(context);
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(((b.a.a.a.a.g.f) (obj)).a))
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
            (new com.a.a.b.c(context, this, x1, ((b.a.a.a.a.g.f) (obj)), b1, new c(f.a(com/a/a/b/a)), new ah(), new b.a.a.a.a.e.b(f.c()))).a();
        }
        return Boolean.valueOf(true);
    }
}
