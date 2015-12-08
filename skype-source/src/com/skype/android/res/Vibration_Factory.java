// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import dagger.MembersInjector;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.res:
//            Vibration

public final class Vibration_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final MembersInjector membersInjector;

    public Vibration_Factory(MembersInjector membersinjector)
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
        return new Vibration_Factory(membersinjector);
    }

    public final Vibration get()
    {
        Vibration vibration = new Vibration();
        membersInjector.injectMembers(vibration);
        return vibration;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/res/Vibration_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
