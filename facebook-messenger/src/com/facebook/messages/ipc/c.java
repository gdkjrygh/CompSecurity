// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc;

import android.app.PendingIntent;
import com.facebook.messages.model.threads.GroupMessageInfo;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;
import javax.inject.a;

// Referenced classes of package com.facebook.messages.ipc:
//            FrozenParticipant, FrozenGroupMessageInfo, FrozenNewMessageNotification

public class c
{

    private final a a;

    public c(a a1)
    {
        a = a1;
    }

    private FrozenGroupMessageInfo a(GroupMessageInfo groupmessageinfo)
    {
        if (groupmessageinfo == null)
        {
            return null;
        }
        et et1 = es.e();
        ParticipantInfo participantinfo;
        for (Iterator iterator = groupmessageinfo.b().iterator(); iterator.hasNext(); et1.b(new FrozenParticipant(participantinfo.e().b(), participantinfo.d())))
        {
            participantinfo = (ParticipantInfo)iterator.next();
        }

        return new FrozenGroupMessageInfo(groupmessageinfo.a(), et1.b(), groupmessageinfo.c(), groupmessageinfo.d());
    }

    public FrozenNewMessageNotification a(Message message, PendingIntent pendingintent)
    {
        Object obj = message.i();
        String s;
        String s1;
        String s2;
        if (obj != null && ((ParticipantInfo) (obj)).e().d())
        {
            s = ((ParticipantInfo) (obj)).e().b();
        } else
        {
            s = null;
        }
        s1 = message.d();
        s2 = (String)a.b();
        if (obj != null)
        {
            obj = ((ParticipantInfo) (obj)).d();
        } else
        {
            obj = null;
        }
        return new FrozenNewMessageNotification(s1, s2, s, ((String) (obj)), message.e(), message.k(), pendingintent, message.z(), message.A().name(), message.f(), message.h(), a(message.H()));
    }
}
