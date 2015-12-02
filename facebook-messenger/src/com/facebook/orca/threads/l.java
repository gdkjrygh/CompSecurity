// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import com.facebook.debug.log.b;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.l.aj;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.a.hq;
import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.threads:
//            MessagesCollection

public class l
{

    private static final Class a = com/facebook/orca/threads/l;
    private final a b;
    private final com.facebook.common.time.a c;

    public l(a a1, com.facebook.common.time.a a2)
    {
        b = a1;
        c = a2;
    }

    private long a(Message message)
    {
        if (message.g() && message.h() < message.f())
        {
            return message.h();
        } else
        {
            return message.f();
        }
    }

    private void a(MessagesCollection messagescollection, MessagesCollection messagescollection1)
    {
        if (!com.facebook.debug.log.b.b(2))
        {
            return;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("  Before Messages:\n");
            a(stringbuilder, messagescollection, 8);
            stringbuilder.append("  After Messages:\n");
            a(stringbuilder, messagescollection1, 8);
            com.facebook.debug.log.b.a(a, stringbuilder.toString());
            return;
        }
    }

    private void a(StringBuilder stringbuilder, MessagesCollection messagescollection, int i)
    {
        if (messagescollection == null || messagescollection.e())
        {
            stringbuilder.append("    none\n");
        } else
        {
            int j = 0;
            while (j < i && j < messagescollection.f()) 
            {
                Message message = messagescollection.a(j);
                stringbuilder.append("   ").append(message).append("\n");
                j++;
            }
        }
    }

    private boolean b(Message message)
    {
        message = message.i();
        User user = (User)b.b();
        return user != null && message.e() != null && Objects.equal(user.c(), message.e());
    }

    public MessagesCollection a(MessagesCollection messagescollection)
    {
        es es1;
        int i;
        int j;
        long l1;
        boolean flag;
        l1 = c.a();
        es1 = messagescollection.b();
        j = -1;
        flag = false;
        i = 0;
_L6:
        if (i >= es1.size()) goto _L2; else goto _L1
_L1:
        Object obj;
        boolean flag1;
        obj = (Message)es1.get(i);
        flag1 = b(((Message) (obj)));
        if (l1 - ((Message) (obj)).f() <= 0x1b7740L || j != -1 && flag1 && flag) goto _L3; else goto _L2
_L2:
        if (j != -1) goto _L5; else goto _L4
_L4:
        return messagescollection;
_L3:
        flag = flag1;
        j = i;
        i++;
          goto _L6
_L5:
        obj = (Message)es1.get(0);
        i = 1;
_L9:
        Message message;
        if (i > j)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        message = (Message)es1.get(i);
        if (a(((Message) (obj))) >= a(message)) goto _L8; else goto _L7
_L7:
        i = 1;
_L10:
        if (i != 0)
        {
            obj = hq.a(es1);
            Collections.sort(((List) (obj)).subList(0, j + 1), new aj());
            obj = new MessagesCollection(messagescollection.a(), es.a(((java.util.Collection) (obj))), messagescollection.d());
            a(messagescollection, ((MessagesCollection) (obj)));
            return ((MessagesCollection) (obj));
        }
          goto _L4
_L8:
        i++;
        obj = message;
          goto _L9
        i = 0;
          goto _L10
    }

}
