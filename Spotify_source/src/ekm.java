// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.HandlerThread;
import com.bmwgroup.connected.car.app.ApplicationType;
import com.bmwgroup.connected.car.app.BrandType;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.Assertion;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class ekm
    implements ekl
{

    private static final List a = Lists.a(new String[] {
        "com.bmwgroup.connected.bmw", "com.bmwgroup.connected.mini"
    });
    private volatile boolean b;
    private HandlerThread c;

    public ekm()
    {
    }

    static void a(ekm ekm1)
    {
        if (gem.n)
        {
            ekm1.c.quitSafely();
            return;
        } else
        {
            ekm1.c.quit();
            return;
        }
    }

    static void a(ekm ekm1, Context context)
    {
        dmz.a(ekn);
        ekn.a(context, "com.spotify.mobile.android.spotlets.bmw.ACTION_CONNECTED", "com.spotify.mobile.android.spotlets.bmw.ACTION_DISCONNECTED", ApplicationType.a, BrandType.a);
        ekm1.b = true;
        ekm1 = new File(b(context), ".nomedia");
        try
        {
            ekm1.mkdirs();
            ekm1.createNewFile();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Assertion.a(String.format("Cannot create .nomedia file: %s", new Object[] {
                ekm1.getPath()
            }), context);
        }
    }

    private static File b(Context context)
    {
        return new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/bmwgroup/").append(context.getPackageName()).toString());
    }

    public final void a(Context context)
    {
        if (!((gim)dmz.a(gim)).a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) goto _L2; else goto _L1
_L1:
        PackageManager packagemanager;
        Iterator iterator;
        packagemanager = context.getPackageManager();
        iterator = a.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (packagemanager.getLaunchIntentForPackage((String)iterator.next()) == null) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L11:
        if (!flag) goto _L8; else goto _L7
_L7:
        c = new HandlerThread("BMW_HANDLER", context) {

            private Context a;
            private ekm b;

            protected final void onLooperPrepared()
            {
                ekm.a(b, a);
            }

            public final void run()
            {
                super.run();
                ekm.a(b);
            }

            
            {
                b = ekm.this;
                a = context;
                super(s);
            }
        };
        c.start();
_L2:
        return;
_L4:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L8:
        context = b(context);
        if (!context.exists()) goto _L2; else goto _L9
_L9:
        gdi.a(context);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final boolean a()
    {
        return b;
    }

}
