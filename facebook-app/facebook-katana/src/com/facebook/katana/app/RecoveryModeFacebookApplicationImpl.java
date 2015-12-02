// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.katana.app;

import android.app.Application;
import android.os.Handler;
import com.facebook.base.app.ApplicationLike;
import com.facebook.nobreak.RecoveryModeHelper;

public class RecoveryModeFacebookApplicationImpl
    implements ApplicationLike
{

    private final Application a;
    private final RecoveryModeHelper b;
    private final Runnable c = new _cls1();

    RecoveryModeFacebookApplicationImpl(Application application, RecoveryModeHelper recoverymodehelper)
    {
        a = application;
        b = recoverymodehelper;
    }

    static Application a(RecoveryModeFacebookApplicationImpl recoverymodefacebookapplicationimpl)
    {
        return recoverymodefacebookapplicationimpl.a;
    }

    static RecoveryModeHelper b(RecoveryModeFacebookApplicationImpl recoverymodefacebookapplicationimpl)
    {
        return recoverymodefacebookapplicationimpl.b;
    }

    public final void a(int i)
    {
    }

    public final void c()
    {
        b.a(a, new Handler(), c);
    }

    public final void e()
    {
    }

    private class _cls1
        implements Runnable
    {

        final RecoveryModeFacebookApplicationImpl a;

        public void run()
        {
            RecoveryModeFacebookApplicationImpl.b(a).b(RecoveryModeFacebookApplicationImpl.a(a));
            RecoveryModeHelper.b();
        }

        _cls1()
        {
            a = RecoveryModeFacebookApplicationImpl.this;
            super();
        }
    }

}
