// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.threadview:
//            i, RowReceiptParticipant, j

public class k
{

    private static final l a = new l();
    private static final Class b = com/facebook/orca/threadview/k;
    private final a c;

    public k(a a1)
    {
        c = a1;
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

    private i a(Set set, Set set1, Set set2, Message message, ThreadSummary threadsummary)
    {
        return b(set, set1, set2, message, threadsummary);
    }

    private void a(String s, i i1, ThreadParticipant threadparticipant, Message message, ThreadSummary threadsummary, UserKey userkey, Set set)
    {
        StringBuilder stringbuilder = new StringBuilder(500);
        stringbuilder.append("logMessageDeliveredReadInfo\n");
        stringbuilder.append(s).append("\n");
        if (i1 != null)
        {
            stringbuilder.append("type: ").append(i1.d()).append('\n');
            stringbuilder.append("receiptTimestampMs: ").append(i1.e()).append('\n');
            if (i1.c() != null)
            {
                stringbuilder.append("deliveree: ").append(i1.c()).append('\n');
            }
            if (i1.b() != null)
            {
                stringbuilder.append("sender: ").append(i1.b()).append('\n');
            }
            if (i1.a() != null)
            {
                stringbuilder.append("readers:\n");
                for (s = i1.a().iterator(); s.hasNext(); stringbuilder.append((RowReceiptParticipant)s.next()).append('\n')) { }
            }
        }
        if (threadparticipant != null)
        {
            stringbuilder.append("threadParticipant: ").append(threadparticipant).append('\n');
        }
        if (message != null)
        {
            stringbuilder.append("message: ").append(message).append('\n');
            stringbuilder.append("message sender: ").append(message.i()).append('\n');
            stringbuilder.append("getSentOrServerTimestamp: ").append(a(message)).append('\n');
        }
        if (threadsummary != null)
        {
            stringbuilder.append("threadSummary: ").append(threadsummary).append('\n');
        }
        if (userkey != null)
        {
            stringbuilder.append("loggedInUserKey: ").append(userkey).append('\n');
        }
        if (set != null)
        {
            stringbuilder.append("readThreadParticipants:\n");
            for (s = set.iterator(); s.hasNext(); stringbuilder.append((ThreadParticipant)s.next()).append('\n')) { }
        }
        com.facebook.debug.log.b.a(a, b, stringbuilder.toString());
    }

    private boolean a(Message message, ThreadParticipant threadparticipant)
    {
        return d(message, threadparticipant) || c(message, threadparticipant) || b(message, threadparticipant);
    }

    private boolean a(Message message, ThreadParticipant threadparticipant, ThreadSummary threadsummary)
    {
        return a(message, threadparticipant) && !threadsummary.h();
    }

    private boolean a(UserKey userkey, ThreadParticipant threadparticipant)
    {
        return threadparticipant.b() && threadparticipant.d().equals(userkey);
    }

    private i b(Set set, Set set1, Set set2, Message message, ThreadSummary threadsummary)
    {
        UserKey userkey = (UserKey)c.b();
        if (userkey != null) goto _L2; else goto _L1
_L1:
        set = null;
_L4:
        return set;
_L2:
        i i1 = null;
        Iterator iterator = set.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ThreadParticipant threadparticipant = (ThreadParticipant)iterator.next();
            if (a(userkey, threadparticipant))
            {
                iterator.remove();
            } else
            if (a(message, threadparticipant, threadsummary))
            {
                if (i1 != null && i1.d() != j.READER)
                {
                    a("isMessageSentByThreadParticipantInGroup", i1, threadparticipant, message, threadsummary, userkey, set);
                }
                boolean flag;
                if (i1 == null || i1.d() == j.READER)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "messageDeliveredReadInfo should be null or of type READER");
                iterator.remove();
                set1.remove(threadparticipant);
            } else
            if (b(message, threadparticipant, threadsummary))
            {
                if (i1 != null)
                {
                    a("isMessageSentByThreadParticipantInCanonical", i1, threadparticipant, message, threadsummary, userkey, set);
                }
                boolean flag1;
                if (i1 == null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkState(flag1, "messageDeliveredReadInfo should be null");
                iterator.remove();
                set1.remove(threadparticipant);
                i1 = com.facebook.orca.threadview.i.a(threadparticipant.a());
            } else
            if (e(message, threadparticipant))
            {
                if (i1 != null && i1.d() != j.READER)
                {
                    a("isMessageReadByThreadParticipant", i1, threadparticipant, message, threadsummary, userkey, set);
                }
                i j1;
                boolean flag2;
                if (i1 == null || i1.d() == j.READER)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                Preconditions.checkState(flag2, "messageDeliveredReadInfo should be null or of type READER");
                iterator.remove();
                set1.remove(threadparticipant);
                j1 = i1;
                if (i1 == null)
                {
                    j1 = com.facebook.orca.threadview.i.a(threadparticipant.i());
                }
                j1.a(new RowReceiptParticipant(threadparticipant.a(), threadparticipant.i()));
                i1 = j1;
            }
        } while (true);
        set = i1;
        if (threadsummary.h())
        {
            continue;
        }
        set1 = set2.iterator();
        do
        {
            set = i1;
            if (!set1.hasNext())
            {
                continue;
            }
            set = (ThreadParticipant)set1.next();
            if (a(userkey, set))
            {
                set1.remove();
            } else
            if (c(message, set, threadsummary))
            {
                set1.remove();
                if (i1 == null)
                {
                    i1 = com.facebook.orca.threadview.i.a(set.a());
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean b(Message message, ThreadParticipant threadparticipant)
    {
        message = message.i();
        return !threadparticipant.b() && threadparticipant.c() && !message.b() && message.c() && Objects.equal(message.e(), threadparticipant.d());
    }

    private boolean b(Message message, ThreadParticipant threadparticipant, ThreadSummary threadsummary)
    {
        return a(message, threadparticipant) && threadsummary.h();
    }

    private boolean c(Message message, ThreadParticipant threadparticipant)
    {
        message = message.i();
        return !threadparticipant.b() && !n.a(threadparticipant.e()) && !message.b() && !n.a(message.a()) && Objects.equal(message.a(), threadparticipant.e());
    }

    private boolean c(Message message, ThreadParticipant threadparticipant, ThreadSummary threadsummary)
    {
        return threadparticipant.b() && Objects.equal(message.i().e(), threadparticipant.d()) && !threadsummary.h();
    }

    private boolean d(Message message, ThreadParticipant threadparticipant)
    {
        return threadparticipant.b() && Objects.equal(message.i().e(), threadparticipant.d());
    }

    private boolean e(Message message, ThreadParticipant threadparticipant)
    {
        return threadparticipant.b() && threadparticipant.i() >= a(message) && !Objects.equal(message.i().e(), threadparticipant.d()) && !message.d().startsWith("sent");
    }

    public Map a(MessagesCollection messagescollection, ThreadSummary threadsummary)
    {
        java.util.HashSet hashset = kl.a(threadsummary.j());
        java.util.HashSet hashset1 = kl.a(threadsummary.j());
        java.util.HashSet hashset2 = kl.a(threadsummary.j());
        java.util.HashMap hashmap = ik.a();
        messagescollection = messagescollection.b().iterator();
        do
        {
            if (!messagescollection.hasNext())
            {
                break;
            }
            Message message = (Message)messagescollection.next();
            if (!message.t())
            {
                i i1 = a(((Set) (hashset)), ((Set) (hashset1)), ((Set) (hashset2)), message, threadsummary);
                if (i1 != null)
                {
                    hashmap.put(message.d(), i1);
                }
            }
        } while (true);
        return hashmap;
    }

}
