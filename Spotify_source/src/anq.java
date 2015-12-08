// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.crashlytics.android.ndk.JniNativeApi;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class anq extends gyh
    implements anh
{

    private final ant a;
    private final ans b;
    private anp c;
    private anl d;

    public anq()
    {
        this(((ant) (new JniNativeApi())));
    }

    private anq(ant ant1)
    {
        a = ant1;
        b = new ans();
    }

    private static String a(File file)
    {
        gya.a().a("CrashlyticsNdk", "Reading NDK crash data...");
        Object obj = new FileInputStream(file);
        file = ((File) (obj));
        Object obj1 = CommonUtils.a(((java.io.InputStream) (obj)));
        CommonUtils.a(((java.io.Closeable) (obj)), "Error closing crash data file.");
        return ((String) (obj1));
        Object obj2;
        obj2;
        obj = null;
_L4:
        file = ((File) (obj));
        gya.a().c("CrashlyticsNdk", "Failed to read NDK crash data.", ((Throwable) (obj2)));
        CommonUtils.a(((java.io.Closeable) (obj)), "Error closing crash data file.");
        return null;
        file;
        obj2 = null;
        obj = file;
_L2:
        CommonUtils.a(((java.io.Closeable) (obj2)), "Error closing crash data file.");
        throw obj;
        obj;
        obj2 = file;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean a(anp anp1, alu alu1)
    {
        c = anp1;
        boolean flag;
        try
        {
            anp1 = anp1.a().getCanonicalPath();
            flag = a.a(anp1, super.k.getAssets());
        }
        // Misplaced declaration of an exception variable
        catch (anp anp1)
        {
            gya.a().c("CrashlyticsNdk", "Error initializing CrashlyticsNdk", anp1);
            flag = false;
        }
        if (flag)
        {
            alu1.h = this;
            gya.a().a("CrashlyticsNdk", "Crashlytics NDK initialization successful");
        }
        return flag;
    }

    public static anq f()
    {
        return (anq)gya.a(anq);
    }

    public final String a()
    {
        return "1.1.1.74";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android.crashlytics-ndk";
    }

    protected final boolean c_()
    {
        if (gya.a(alu) == null)
        {
            throw new UnmetDependencyException("CrashlyticsNdk requires Crashlytics");
        } else
        {
            anx anx1 = new anx((new hbc(this)).a());
            alu alu1 = alu.f();
            new alx();
            return a(anx1, alu1);
        }
    }

    public final anl d()
    {
        return d;
    }

    public Object e()
    {
        return g();
    }

    public Void g()
    {
        Object obj = c.b();
        if (obj != null && ((File) (obj)).exists())
        {
            gya.a().a("CrashlyticsNdk", "Found NDK crash file...");
            obj = a(((File) (obj)));
            if (obj != null)
            {
                try
                {
                    ans ans1 = b;
                    JSONObject jsonobject = new JSONObject(((String) (obj)));
                    d = new anl(jsonobject.optLong("time"), ans.b(jsonobject), ans.d(jsonobject), ans1.c(jsonobject), ans.a(((String) (obj))), ans.a(jsonobject));
                }
                catch (JSONException jsonexception)
                {
                    gya.a().c("CrashlyticsNdk", "Failed to parse NDK crash data.", jsonexception);
                }
            }
        }
        c.c();
        return null;
    }
}
