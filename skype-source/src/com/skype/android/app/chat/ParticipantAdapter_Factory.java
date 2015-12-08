// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import dagger.MembersInjector;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app.chat:
//            ParticipantAdapter

public final class ParticipantAdapter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final MembersInjector membersInjector;

    public ParticipantAdapter_Factory(MembersInjector membersinjector)
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
        return new ParticipantAdapter_Factory(membersinjector);
    }

    public final ParticipantAdapter get()
    {
        ParticipantAdapter participantadapter = new ParticipantAdapter();
        membersInjector.injectMembers(participantadapter);
        return participantadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/ParticipantAdapter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
