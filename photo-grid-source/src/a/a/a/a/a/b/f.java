// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import a.a.a.a.s;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;

// Referenced classes of package a.a.a.a.a.b:
//            i, g, h, b

final class f
    implements i
{

    private final Context a;

    public f(Context context)
    {
        a = context.getApplicationContext();
    }

    public final b a()
    {
        Object obj;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            a.a.a.a.f.d();
            return null;
        }
        Object obj1;
        boolean flag;
        try
        {
            a.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a.a.a.f.d();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a.a.a.f.d();
            return null;
        }
        obj = new g((byte)0);
        obj1 = new Intent("com.google.android.gms.ads.identifier.service.START");
        ((Intent) (obj1)).setPackage("com.google.android.gms");
        Exception exception;
        try
        {
            flag = a.bindService(((Intent) (obj1)), ((android.content.ServiceConnection) (obj)), 1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a.a.a.f.d();
            return null;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj1 = new h(((g) (obj)).a());
        obj1 = new b(((h) (obj1)).a(), ((h) (obj1)).b());
        a.unbindService(((android.content.ServiceConnection) (obj)));
        return ((b) (obj1));
        exception;
        a.a.a.a.f.d().a("Fabric", "Exception in binding to Google Play Service to capture AdvertisingId", exception);
        a.unbindService(((android.content.ServiceConnection) (obj)));
        return null;
        Exception exception1;
        exception1;
        a.unbindService(((android.content.ServiceConnection) (obj)));
        throw exception1;
        a.a.a.a.f.d();
        return null;
    }
}
