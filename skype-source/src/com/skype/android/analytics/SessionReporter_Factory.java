// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import dagger.MembersInjector;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.analytics:
//            SessionReporter

public final class SessionReporter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final MembersInjector membersInjector;

    public SessionReporter_Factory(MembersInjector membersinjector)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        } else
        {
            membersInjector = membersinjector;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector)
    {
        return new SessionReporter_Factory(membersinjector);
    }

    public final SessionReporter get()
    {
        SessionReporter sessionreporter = new SessionReporter();
        membersInjector.injectMembers(sessionreporter);
        return sessionreporter;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/analytics/SessionReporter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
