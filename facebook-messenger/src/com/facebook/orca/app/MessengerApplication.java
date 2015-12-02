// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.facebook.base.a.j;
import com.facebook.common.e.g;
import com.facebook.common.w.i;
import com.facebook.config.a.a;
import com.facebook.debug.log.b;
import com.facebook.inject.aa;
import com.facebook.inject.t;
import org.acra.ACRA;
import org.acra.ErrorReporter;
import org.acra.sender.HttpPostSender;

// Referenced classes of package com.facebook.orca.app:
//            ff, fa

public class MessengerApplication extends j
    implements aa
{

    private a a;

    public MessengerApplication()
    {
    }

    private a e()
    {
        Signature asignature[];
        a a1;
        String s;
        int k;
        int l;
        try
        {
            asignature = getPackageManager().getPackageInfo("com.facebook.orca", 64).signatures;
            l = asignature.length;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            break; /* Loop/switch isn't completed */
        }
        k = 0;
_L2:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        s = i.b(asignature[k].toByteArray());
        com.facebook.debug.log.b.d("OrcaGuiceModule", (new StringBuilder()).append("Sig: ").append(s).toString());
        if (s.equals(com.facebook.orca.app.ff.a.f()))
        {
            return com.facebook.orca.app.ff.a;
        }
        if (!s.equals(com.facebook.orca.app.ff.b.f()))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        a1 = com.facebook.orca.app.ff.b;
        return a1;
        k++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        return ff.c;
    }

    protected com.facebook.base.a.i a()
    {
        return d();
    }

    protected void b()
    {
        ACRA.init(new g(this));
        ErrorReporter errorreporter = ErrorReporter.getInstance();
        errorreporter.setReportSender(new HttpPostSender("https://www.facebook.com/mobile/orca_android_crash_logs/"));
        a = e();
        errorreporter.putCustomData("app", a.a());
        errorreporter.putCustomData("fb_app_id", a.b());
    }

    protected fa d()
    {
        return new fa(this, a);
    }

    public t f()
    {
        this;
        JVM INSTR monitorenter ;
        t t = ((fa)c()).f();
        this;
        JVM INSTR monitorexit ;
        return t;
        Exception exception;
        exception;
        throw exception;
    }
}
