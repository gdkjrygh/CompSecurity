// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android_src.mms.d;
import com.facebook.fbservice.c.b;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.f.o;
import com.facebook.orca.protocol.methods.ad;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.NewMessageResult;
import com.facebook.orca.server.SendMessageByRecipientsParams;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.m;
import com.facebook.orca.threads.q;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.g;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserKey;
import com.facebook.user.UserPhoneNumber;
import com.google.common.a.ev;
import com.google.common.a.kl;
import com.google.common.base.Joiner;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.sms:
//            br, y, af, u, 
//            b, bk, e

public class bi
{

    private static final Class a = com/facebook/orca/sms/bi;
    private final ad b;
    private final q c;
    private final y d;
    private final u e;
    private final br f;
    private final bk g;
    private final af h;
    private final o i;

    public bi(ad ad1, q q1, y y1, u u1, br br1, bk bk1, af af1, 
            o o1)
    {
        b = ad1;
        c = q1;
        d = y1;
        e = u1;
        f = br1;
        g = bk1;
        h = af1;
        i = o1;
    }

    private Message a(Message message, Set set)
    {
        Object obj;
        boolean flag1 = true;
        boolean flag = true;
        Object obj1;
        Exception exception;
        Object obj2;
        af af1;
        int j;
        int k;
        if (!message.C() && set.size() <= 1)
        {
            if (set.size() == 1)
            {
                set = (String)set.iterator().next();
                return f.a(message, set);
            } else
            {
                message = new StringBuilder();
                message.append("Trying to send an Sms or Mms to an invalid set of participants: <");
                message.append(Joiner.on(" ").join(set));
                message.append(">");
                throw new d(message.toString());
            }
        }
        for (obj = d.b().iterator(); ((Iterator) (obj)).hasNext(); i.a(((String) (obj1)), -1L))
        {
            obj1 = m.a(((Long)((Iterator) (obj)).next()).longValue());
        }

        break MISSING_BLOCK_LABEL_220;
        exception;
        obj2 = message.B();
        if (message.I())
        {
            obj = (String)message.J().get("trigger");
        } else
        {
            obj = null;
        }
        if (((List) (obj2)).size() > 0)
        {
            af1 = h;
            message = message.e();
            j = set.size();
            k = ((List) (obj2)).size();
            set = ((MediaResource)((List) (obj2)).get(0)).c().name();
            if (false)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            af1.a(message, j, k, set, flag, ((String) (obj)));
        } else
        {
            obj2 = h;
            message = message.e();
            j = set.size();
            if (false)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            ((af) (obj2)).a(message, j, flag, ((String) (obj)));
        }
        throw exception;
        exception = e.a(message, set);
        obj2 = message.B();
        if (message.I())
        {
            obj = (String)message.J().get("trigger");
        } else
        {
            obj = null;
        }
        if (((List) (obj2)).size() > 0)
        {
            af1 = h;
            message = message.e();
            j = set.size();
            k = ((List) (obj2)).size();
            set = ((MediaResource)((List) (obj2)).get(0)).c().name();
            if (exception != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            af1.a(message, j, k, set, flag, ((String) (obj)));
        } else
        {
            obj2 = h;
            message = message.e();
            j = set.size();
            if (exception == null)
            {
                flag = false;
            }
            ((af) (obj2)).a(message, j, flag, ((String) (obj)));
        }
        return exception;
    }

    public FetchThreadResult a(SendMessageByRecipientsParams sendmessagebyrecipientsparams)
    {
        Object obj = sendmessagebyrecipientsparams.a();
        sendmessagebyrecipientsparams = sendmessagebyrecipientsparams.d();
        java.util.HashSet hashset = kl.a();
        RecipientInfo recipientinfo;
        for (sendmessagebyrecipientsparams = sendmessagebyrecipientsparams.iterator(); sendmessagebyrecipientsparams.hasNext(); hashset.add(b.a(recipientinfo).b()))
        {
            recipientinfo = (RecipientInfo)sendmessagebyrecipientsparams.next();
        }

        long l = m.c(a(((Message) (obj)), ((Set) (hashset))).e());
        obj = d.a(l);
        sendmessagebyrecipientsparams = com.facebook.orca.sms.b.a(l, 3, -1L);
        com.facebook.orca.threads.MessagesCollection messagescollection = d.a(sendmessagebyrecipientsparams);
        sendmessagebyrecipientsparams = null;
        if (hashset.size() == 1)
        {
            sendmessagebyrecipientsparams = g.a((String)hashset.iterator().next());
        }
        return new FetchThreadResult(b.FROM_CACHE_UP_TO_DATE, ((e) (obj)).a(), messagescollection, ((e) (obj)).b(), sendmessagebyrecipientsparams, System.currentTimeMillis());
    }

    public NewMessageResult a(Message message)
    {
        long l = m.c(message.e());
        Object obj = d.a(l);
        Object obj1 = c.c(((e) (obj)).a());
        obj = kl.a();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((Set) (obj)).add(((ThreadParticipant)((Iterator) (obj1)).next()).d().b())) { }
        message = a(message, ((Set) (obj)));
        return new NewMessageResult(b.FROM_CACHE_UP_TO_DATE, message.e(), message, null, System.currentTimeMillis());
    }

}
