// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.internal:
//            as, ba, bn, bo, 
//            cm, cj, ck, bg, 
//            ax, am, an, av, 
//            ay, bh, aw, at, 
//            au, bu

public final class ar
{

    private final AtomicReference a;
    private av b;
    private boolean c;

    private ar()
    {
        a = new AtomicReference();
        c = false;
    }

    ar(byte byte0)
    {
        this();
    }

    public static ar a()
    {
        return as.a();
    }

    private static String a(String s, String s1, Context context)
    {
        try
        {
            s1 = s1.replaceAll("\\.", (new StringBuffer(new String(new char[] {
                's', 'l', 'c'
            }))).reverse().toString());
            s = ba.b(1, ba.a((new StringBuilder()).append(s).append(s1).toString()));
            break MISSING_BLOCK_LABEL_71;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            cm.a().b().a("Crashlytics", "Could not create cipher to encrypt headers.", s);
        }
_L2:
        return "";
        s1 = new JSONObject();
        context = new bn(context);
        Iterator iterator;
        try
        {
            s1.put("APPLICATION_INSTALLATION_UUID".toLowerCase(Locale.US), context.b());
        }
        catch (Exception exception)
        {
            cm.a().b().a("Crashlytics", "Could not write application id to JSON", exception);
        }
        for (iterator = context.f().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            try
            {
                s1.put(((bo)entry.getKey()).name().toLowerCase(Locale.US), entry.getValue());
            }
            catch (Exception exception2)
            {
                cm.a().b().a("Crashlytics", (new StringBuilder("Could not write value to JSON: ")).append(((bo)entry.getKey()).name()).toString(), exception2);
            }
        }

        try
        {
            s1.put("os_version", context.c());
        }
        catch (Exception exception1)
        {
            cm.a().b().a("Crashlytics", "Could not write OS version to JSON", exception1);
        }
        try
        {
            s1.put("model", context.d());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            cm.a().b().a("Crashlytics", "Could not write model to JSON", context);
        }
        if (s1.length() > 0)
        {
            try
            {
                s = ba.a(s.doFinal(s1.toString().getBytes()));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                cm.a().b().a("Crashlytics", "Could not encrypt IDs", s);
                return "";
            }
            return s;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final ar a(Context context, bu bu, String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        if (b == null)
        {
            String s3 = ck.a(context, false);
            String s4 = context.getPackageName();
            String s5 = context.getPackageManager().getInstallerPackageName(s4);
            bg bg1 = new bg();
            ax ax1 = new ax();
            am am1 = new am();
            String s6 = ba.g(context);
            bu = new an(s2, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[] {
                s4
            }), bu);
            b = new av(new ay(s3, a(s3, s4, context), ba.a(new String[] {
                ba.i(context)
            }), s1, s, bh.a(s5).a(), s6), bg1, ax1, am1, bu);
        }
        c = true;
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    public final Object a(at at1, Object obj)
    {
        aw aw1 = (aw)a.get();
        if (aw1 == null)
        {
            return obj;
        } else
        {
            return at1.a(aw1);
        }
    }

    public final aw b()
    {
        return (aw)a.get();
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        aw aw1;
        aw1 = b.a();
        a.set(aw1);
        boolean flag;
        if (aw1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        aw aw1;
        aw1 = b.a(au.b);
        a.set(aw1);
        if (aw1 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        cm.a().b().a("Crashlytics", "Failed to force reload of settings from Crashlytics.", null);
        boolean flag;
        if (aw1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
