// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge.upload;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.auth.module.Provider_TriState_IsMeUserAnEmployeeMethodAutoProvider__com_facebook_common_util_TriState__com_facebook_auth_annotations_IsMeUserAnEmployee__INJECTED_BY_TemplateInjector;
import com.facebook.common.time.SystemClock;
import com.facebook.common.util.TriState;
import com.facebook.inject.InjectorLike;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.prefs.shared.FbSharedPreferencesImpl;
import com.facebook.tools.dextr.bridge.DextrXConfigManager;
import com.facebook.tools.dextr.bridge.constants.DextrConstants;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;

// Referenced classes of package com.facebook.tools.dextr.bridge.upload:
//            UploadConfiguration

public class UploadConstraints
{

    private final FbSharedPreferences a;
    private final Context b;
    private final UploadConfiguration c;
    private final Provider d;

    public UploadConstraints(Context context, DextrXConfigManager dextrxconfigmanager, FbSharedPreferences fbsharedpreferences, Provider provider)
    {
        b = context;
        c = dextrxconfigmanager.a();
        a = fbsharedpreferences;
        d = provider;
        c(c());
        d(d());
    }

    public static UploadConstraints a(InjectorLike injectorlike)
    {
        return b(injectorlike);
    }

    private static UploadConstraints b(InjectorLike injectorlike)
    {
        return new UploadConstraints((Context)injectorlike.getInstance(android/content/Context), (DextrXConfigManager)DextrXConfigManager.a(injectorlike), (FbSharedPreferences)FbSharedPreferencesImpl.a(injectorlike), Provider_TriState_IsMeUserAnEmployeeMethodAutoProvider__com_facebook_common_util_TriState__com_facebook_auth_annotations_IsMeUserAnEmployee__INJECTED_BY_TemplateInjector.a(injectorlike));
    }

    private void b()
    {
        b(0L);
    }

    private void b(long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = e() - d();
        if (l1 < c.c() && l == 0L)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        l1 /= c.c();
        c(c() + c.b() * l1 + l);
        l = d();
        d(l1 * c.c() + l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private long c()
    {
        return a.a(DextrConstants.a, 0L);
    }

    private void c(long l)
    {
        a.c().a(DextrConstants.a, Math.min(l, c.a())).a();
    }

    private long d()
    {
        return a.a(DextrConstants.b, e());
    }

    private void d(long l)
    {
        a.c().a(DextrConstants.b, l).a();
    }

    private static long e()
    {
        return TimeUnit.MILLISECONDS.toSeconds(SystemClock.b().a());
    }

    public final void a(long l)
    {
        b(-l);
    }

    public final boolean a()
    {
        b();
        Object obj = (ConnectivityManager)b.getSystemService("connectivity");
        if (obj == null)
        {
            return false;
        }
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        if (obj == null || !((NetworkInfo) (obj)).isConnected())
        {
            return false;
        }
        if (d.get() == TriState.YES)
        {
            return true;
        }
        return ((NetworkInfo) (obj)).getType() == 1 && c() >= 0L;
    }
}
