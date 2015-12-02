// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets.text;

import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.f.z;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.m;
import com.facebook.orca.threads.q;
import com.facebook.orca.threadview.v;
import com.facebook.user.RecipientInfo;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.google.common.a.es;

public class a
{

    private final z a;
    private final q b;

    public a(z z1, q q1)
    {
        a = z1;
        b = q1;
    }

    public v a(ThreadSummary threadsummary)
    {
        if (threadsummary == null)
        {
            return null;
        }
        ThreadParticipant threadparticipant = b.b(threadsummary);
        ParticipantInfo participantinfo;
        long l;
        if (threadparticipant != null)
        {
            participantinfo = threadparticipant.a();
        } else
        {
            participantinfo = null;
        }
        if (threadparticipant != null)
        {
            l = threadparticipant.i();
        } else
        {
            l = -1L;
        }
        return new v(threadsummary.f(), threadsummary.g(), es.a(a.a(threadsummary)), m.g(threadsummary.a()), participantinfo, l);
    }

    public v a(RecipientInfo recipientinfo)
    {
        if (recipientinfo == null)
        {
            return null;
        } else
        {
            String s = recipientinfo.c();
            recipientinfo = new ParticipantInfo(UserKey.a(recipientinfo.a()), s);
            return new v(false, null, es.a(s), false, recipientinfo, -1L);
        }
    }

    public v a(User user)
    {
        if (user == null)
        {
            return null;
        } else
        {
            String s = user.h();
            user = new ParticipantInfo(user.c(), s);
            return new v(false, null, es.a(s), false, user, -1L);
        }
    }
}
