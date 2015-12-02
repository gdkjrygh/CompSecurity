// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.notify.NotificationSetting;

// Referenced classes of package com.facebook.orca.threads:
//            ThreadParticipant

public class p
{

    private ParticipantInfo a;
    private String b;
    private NotificationSetting c;
    private long d;
    private String e;

    public p()
    {
    }

    public ParticipantInfo a()
    {
        return a;
    }

    public p a(long l)
    {
        d = l;
        return this;
    }

    public p a(ParticipantInfo participantinfo)
    {
        a = participantinfo;
        return this;
    }

    public p a(NotificationSetting notificationsetting)
    {
        c = notificationsetting;
        return this;
    }

    public p a(String s)
    {
        b = s;
        return this;
    }

    public void a(ThreadParticipant threadparticipant)
    {
        a = threadparticipant.a();
        b = threadparticipant.g();
        c = threadparticipant.h();
        d = threadparticipant.i();
        e = threadparticipant.j();
    }

    public p b(String s)
    {
        e = s;
        return this;
    }

    public String b()
    {
        return b;
    }

    public NotificationSetting c()
    {
        return c;
    }

    public long d()
    {
        return d;
    }

    public String e()
    {
        return e;
    }

    public ThreadParticipant f()
    {
        return new ThreadParticipant(this);
    }
}
