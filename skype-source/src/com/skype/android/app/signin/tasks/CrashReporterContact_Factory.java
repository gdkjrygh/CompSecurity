// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import com.skype.android.crash.CrashReporter;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            b

public final class CrashReporterContact_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider crashReporterProvider;

    public CrashReporterContact_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            crashReporterProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new CrashReporterContact_Factory(provider);
    }

    public final b get()
    {
        return new b((CrashReporter)crashReporterProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/tasks/CrashReporterContact_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
