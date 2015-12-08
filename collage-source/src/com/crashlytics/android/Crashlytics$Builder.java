// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsListener;
import com.crashlytics.android.core.PinningInfoProvider;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics

public static class ider
{

    private Answers answers;
    private Beta beta;
    private CrashlyticsCore core;
    private com.crashlytics.android.core.der coreBuilder;

    private com.crashlytics.android.core.der getCoreBuilder()
    {
        this;
        JVM INSTR monitorenter ;
        com.crashlytics.android.core.der der;
        if (coreBuilder == null)
        {
            coreBuilder = new com.crashlytics.android.core.der();
        }
        der = coreBuilder;
        this;
        JVM INSTR monitorexit ;
        return der;
        Exception exception;
        exception;
        throw exception;
    }

    public coreBuilder answers(Answers answers1)
    {
        if (answers1 == null)
        {
            throw new NullPointerException("Answers Kit must not be null.");
        }
        if (answers != null)
        {
            throw new IllegalStateException("Answers Kit already set.");
        } else
        {
            answers = answers1;
            return this;
        }
    }

    public answers beta(Beta beta1)
    {
        if (beta1 == null)
        {
            throw new NullPointerException("Beta Kit must not be null.");
        }
        if (beta != null)
        {
            throw new IllegalStateException("Beta Kit already set.");
        } else
        {
            beta = beta1;
            return this;
        }
    }

    public Crashlytics build()
    {
        if (coreBuilder != null)
        {
            if (core != null)
            {
                throw new IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
            }
            core = coreBuilder.build();
        }
        if (answers == null)
        {
            answers = new Answers();
        }
        if (beta == null)
        {
            beta = new Beta();
        }
        if (core == null)
        {
            core = new CrashlyticsCore();
        }
        return new Crashlytics(answers, beta, core);
    }

    public  core(CrashlyticsCore crashlyticscore)
    {
        if (crashlyticscore == null)
        {
            throw new NullPointerException("CrashlyticsCore Kit must not be null.");
        }
        if (core != null)
        {
            throw new IllegalStateException("CrashlyticsCore Kit already set.");
        } else
        {
            core = crashlyticscore;
            return this;
        }
    }

    public core delay(float f)
    {
        getCoreBuilder().delay(f);
        return this;
    }

    public .Builder.delay disabled(boolean flag)
    {
        getCoreBuilder().disabled(flag);
        return this;
    }

    public ener listener(CrashlyticsListener crashlyticslistener)
    {
        getCoreBuilder().listener(crashlyticslistener);
        return this;
    }

    public ider pinningInfo(PinningInfoProvider pinninginfoprovider)
    {
        getCoreBuilder().pinningInfo(pinninginfoprovider);
        return this;
    }

    public ider()
    {
    }
}
