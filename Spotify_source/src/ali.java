// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class ali extends gyh
    implements gzd
{

    private final gyn a = new gyn();
    private final aln b = new aln();
    private alp c;

    public ali()
    {
    }

    private static alj a(Context context)
    {
        Object obj = null;
        context = context.getAssets().open("crashlytics-build.properties");
        if (context == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj = new Properties();
        ((Properties) (obj)).load(context);
        obj1 = new alj(((Properties) (obj)).getProperty("version_code"), ((Properties) (obj)).getProperty("version_name"), ((Properties) (obj)).getProperty("build_id"), ((Properties) (obj)).getProperty("package_name"));
        gya.a().a("Beta", (new StringBuilder()).append(((alj) (obj1)).d).append(" build properties: ").append(((alj) (obj1)).b).append(" (").append(((alj) (obj1)).a).append(") - ").append(((alj) (obj1)).c).toString());
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
                gya.a().c("Beta", "Error closing Beta build properties asset", context);
                return ((alj) (obj));
            }
            obj1 = obj;
        }
_L4:
        return ((alj) (obj1));
        obj1;
        context = null;
_L7:
        gya.a().c("Beta", "Error reading Beta build properties", ((Throwable) (obj1)));
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
            gya.a().c("Beta", "Error closing Beta build properties asset", ((Throwable) (obj)));
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
                gya.a().c("Beta", "Error closing Beta build properties asset", context);
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
            gya.a().a("Beta", "App was possibly installed by Beta. Getting device token");
            try
            {
                context = (String)a.a(context, b);
                flag = "".equals(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                gya.a().c("Beta", "Failed to load the Beta device token", context);
                return null;
            }
            if (flag)
            {
                context = null;
            }
            return context;
        } else
        {
            gya.a().a("Beta", "App was not installed by Beta. Skipping device token");
            return null;
        }
    }

    public final String a()
    {
        return "1.1.3.61";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:beta";
    }

    protected final boolean c_()
    {
        super.k.getApplicationContext();
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            obj = new alh(super.i.b, super.i.a);
        } else
        {
            obj = new alo();
        }
        c = ((alp) (obj));
        return true;
    }

    public final Map d()
    {
        String s = super.m.e();
        s = a(super.k, s);
        HashMap hashmap = new HashMap();
        if (!TextUtils.isEmpty(s))
        {
            hashmap.put(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.c, s);
        }
        return hashmap;
    }

    protected final Object e()
    {
        boolean flag1 = false;
        gya.a().a("Beta", "Beta kit initializing...");
        Context context = super.k;
        IdManager idmanager = super.m;
        if (TextUtils.isEmpty(a(context, idmanager.e())))
        {
            gya.a().a("Beta", "A Beta device token was not found for this app");
            return Boolean.valueOf(false);
        }
        gya.a().a("Beta", "Beta device token is present, checking for app updates.");
        Object obj = hbw.a().a();
        alj alj1;
        boolean flag;
        if (obj != null)
        {
            obj = ((hbz) (obj)).f;
        } else
        {
            obj = null;
        }
        alj1 = a(context);
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(((hbk) (obj)).a))
            {
                flag = flag1;
                if (alj1 != null)
                {
                    flag = true;
                }
            }
        }
        if (flag)
        {
            c.a(context, this, idmanager, ((hbk) (obj)), alj1, new hbe(this), new gzl(), new hav(gya.a()));
        }
        return Boolean.valueOf(true);
    }
}
