// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.os.Bundle;
import com.facebook.analytics.cb;
import com.facebook.common.executors.a;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.SendError;
import com.facebook.messages.model.threads.e;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.app.g;
import com.facebook.orca.notify.av;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.SendMessageByRecipientsParams;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserIdentifierKey;
import com.google.common.a.es;
import com.google.common.a.gb;
import com.google.common.a.gr;
import com.google.common.a.hq;
import com.google.common.a.hy;
import com.google.common.a.kl;
import com.google.common.base.Objects;
import com.google.common.d.a.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.orca.f:
//            u, ac, s, t, 
//            v, ad

public class r
{

    private static final Class a = com/facebook/orca/f/r;
    private final g b;
    private final k c;
    private final av d;
    private final a e;
    private final ad f;
    private final com.facebook.analytics.av g;
    private final com.facebook.common.time.a h;
    private final com.facebook.common.time.a i;
    private final ac j;
    private final javax.inject.a k;
    private final gr l = gr.m();
    private final gr m = gr.m();
    private final LinkedHashSet n = kl.b();
    private final gr o = gr.m();
    private final List p = hq.a();
    private final ConcurrentMap q;
    private final ConcurrentMap r;
    private final Set s = kl.a();
    private boolean t;

    public r(g g1, k k1, av av1, a a1, ad ad, com.facebook.analytics.av av2, com.facebook.common.time.a a2, 
            com.facebook.common.time.a a3, ac ac1, javax.inject.a a4)
    {
        b = g1;
        c = k1;
        d = av1;
        e = a1;
        f = ad;
        g = av2;
        h = a2;
        i = a3;
        k = a4;
        j = ac1;
        q = (new hy()).a(300L, TimeUnit.SECONDS).n();
        r = (new hy()).a(600L, TimeUnit.SECONDS).n();
    }

    private List a(UserIdentifierKey useridentifierkey)
    {
        e.a();
        return hq.a(hq.a(o.a(useridentifierkey)));
    }

    static Set a(r r1)
    {
        return r1.s;
    }

    private void a(OperationResult operationresult)
    {
        com.facebook.debug.log.b.a(a, "onSendSuccess");
        e.a();
        t = false;
        operationresult = operationresult.g();
        if (operationresult != null && operationresult.getBoolean("hasMoreQueuedMessages"))
        {
            operationresult = operationresult.getString("threadId");
            n.add(operationresult);
        }
        b();
    }

    private void a(OperationResult operationresult, Message message)
    {
        com.facebook.debug.log.b.a(a, "onQueuedSuccess %s", new Object[] {
            message
        });
        e.a();
        operationresult = message.e();
        if (l.c(operationresult, message))
        {
            com.facebook.debug.log.b.a(a, "Adding to data structures");
            n.add(operationresult);
            m.a(operationresult, message);
        }
        b();
        b.a(message.e());
    }

    private void a(ServiceException serviceexception, Message message)
    {
        com.facebook.debug.log.b.a(a, "onQueuedFailure");
        e.a();
        serviceexception = message.e();
        l.c(serviceexception, message);
        b.a(serviceexception);
        b(serviceexception);
    }

    private void a(t t1, String s1)
    {
        if (t1 == t.PHOTO_UPLOAD_NOT_COMPLETE)
        {
            com.facebook.debug.log.b.a(a, "onSendFailure - Incomplete photo upload");
            e.a();
            t = false;
            n.add(s1);
            p.add(s1);
            b();
        }
        if (t1 == t.PHOTO_UPLOAD_FAILED)
        {
            com.facebook.debug.log.b.a(a, "onSendFailure - Photo upload failed");
            e.a();
            t = false;
            n.add(s1);
            p.add(s1);
            b();
            b.a(s1);
            d.a(s1);
        }
    }

    static void a(r r1, OperationResult operationresult)
    {
        r1.a(operationresult);
    }

    static void a(r r1, OperationResult operationresult, Message message)
    {
        r1.a(operationresult, message);
    }

    static void a(r r1, ServiceException serviceexception, Message message)
    {
        r1.a(serviceexception, message);
    }

    private void a(Set set, Message message)
    {
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            Message message1 = (Message)set.next();
            if (message1.x() && message.x() && Objects.equal(message1.w(), message.w()))
            {
                com.facebook.debug.log.b.a(a, "Clearing out equivalent sent message %s", new Object[] {
                    message
                });
                set.remove();
            }
        } while (true);
    }

    private boolean a(t t1)
    {
        return t1 == t.PHOTO_UPLOAD_NOT_COMPLETE || t1 == t.PHOTO_UPLOAD_FAILED;
    }

    static javax.inject.a b(r r1)
    {
        return r1.k;
    }

    private void b()
    {
        e.a();
        if (t)
        {
            com.facebook.debug.log.b.a(a, "Send already in progress");
            return;
        }
        String s1 = c();
        if (s1 == null)
        {
            com.facebook.debug.log.b.a(a, "No messages to send");
            return;
        } else
        {
            com.facebook.debug.log.b.a(a, "Starting send");
            Bundle bundle = new Bundle();
            bundle.putString("threadId", s1);
            com.google.common.d.a.i.a(c.a(aq.w, bundle).a(), new u(this, s1));
            t = true;
            return;
        }
    }

    private void b(OperationResult operationresult, Message message)
    {
        e.a();
        com.facebook.debug.log.b.a(a, "onCreateThreadSuccess");
        UserIdentifierKey useridentifierkey = message.G().a().c();
        o.c(useridentifierkey, message);
        operationresult = ((FetchThreadResult)operationresult.h()).a().a();
        message = o.a(useridentifierkey);
        Message message1;
        long l1;
        for (Iterator iterator = message.iterator(); iterator.hasNext(); b((new e()).a(message1).b(operationresult).a(null).a(l1).b(l1).B()))
        {
            message1 = (Message)iterator.next();
            l1 = h.a();
        }

        message.clear();
        j.b(ThreadViewSpec.a(operationresult));
        b.a(useridentifierkey, operationresult);
    }

    private void b(ServiceException serviceexception, Message message)
    {
        e.a();
        com.facebook.debug.log.b.a(a, "onCreateThreadFailure");
        serviceexception = serviceexception.b().g();
        if (serviceexception == null) goto _L2; else goto _L1
_L1:
        serviceexception = serviceexception.getParcelable("result");
        if (!(serviceexception instanceof Message)) goto _L2; else goto _L3
_L3:
        serviceexception = (Message)serviceexception;
_L5:
        UserIdentifierKey useridentifierkey = message.G().a().c();
        message = o.a(useridentifierkey);
        java.util.ArrayList arraylist = hq.a();
        Message message1;
        for (Iterator iterator = message.iterator(); iterator.hasNext(); arraylist.add((new e()).a(message1).a(901).a(message).B()))
        {
            message1 = (Message)iterator.next();
            SendError senderror = SendError.d;
            message = senderror;
            if (serviceexception == null)
            {
                continue;
            }
            message = senderror;
            if (message1.d().equals(serviceexception.d()))
            {
                message = serviceexception.K();
            }
        }

        o.a(useridentifierkey, arraylist);
        b.a(useridentifierkey, null);
        return;
_L2:
        serviceexception = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void b(Message message)
    {
        if (message.e() != null)
        {
            c(message);
            return;
        } else
        {
            d(message);
            return;
        }
    }

    private void b(Message message, String s1, String s2)
    {
        s1 = (new cb("send_message")).g(message.d()).e(s1).b("trigger", s2);
        if (message.e() != null)
        {
            s1.b("thread", message.e());
        } else
        {
            s1.b("user_identifier", message.G().a().c().b);
        }
        g.a(s1);
    }

    static void b(r r1, OperationResult operationresult, Message message)
    {
        r1.b(operationresult, message);
    }

    static void b(r r1, ServiceException serviceexception, Message message)
    {
        r1.b(serviceexception, message);
    }

    private void b(String s1, ServiceException serviceexception)
    {
        cb cb1 = new cb("send_failure");
        cb1.b("thread_id", s1);
        if (serviceexception != null)
        {
            cb1.b("error_message", serviceexception.getMessage());
            if (serviceexception.a() != null)
            {
                cb1.b("error_code", serviceexception.a().name());
            }
        }
        g.a(cb1);
    }

    static ad c(r r1)
    {
        return r1.f;
    }

    private String c()
    {
        e.a();
        if (n.isEmpty())
        {
            return null;
        }
        Iterator iterator = n.iterator();
        if (iterator.hasNext())
        {
            String s1 = (String)iterator.next();
            if (!p.contains(s1))
            {
                iterator.remove();
                return s1;
            }
        }
        return null;
    }

    private List c(String s1)
    {
        e.a();
        d(s1);
        return hq.a(hq.a(gb.a(m.a(s1), l.a(s1))));
    }

    private void c(Message message)
    {
        s.remove(message.w());
        e.a();
        Object obj = message.e();
        com.facebook.debug.log.b.a(a, "Starting send %s", new Object[] {
            message
        });
        a(m.a(obj), message);
        l.a(obj).add(message);
        obj = new Bundle();
        ((Bundle) (obj)).putParcelable("outgoingMessage", message);
        com.google.common.d.a.i.a(c.a(aq.x, ((Bundle) (obj))).a(), new s(this, message));
        q.put(message.w(), Long.valueOf(i.a()));
        b.a(message.e());
    }

    static av d(r r1)
    {
        return r1.d;
    }

    private void d(Message message)
    {
        UserIdentifierKey useridentifierkey;
        Object obj;
        Set set;
        Iterator iterator;
        e.a();
        com.facebook.debug.log.b.a(a, "Starting send %s", new Object[] {
            message
        });
        obj = message.G();
        useridentifierkey = ((RecipientInfo) (obj)).a().c();
        set = o.a(useridentifierkey);
        a(set, message);
        iterator = set.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (((Message)iterator.next()).u() != 900) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        set.add(message);
        if (flag)
        {
            obj = new SendMessageByRecipientsParams(null, message, es.a(obj));
            Bundle bundle = new Bundle();
            bundle.putParcelable("createThreadParams", ((android.os.Parcelable) (obj)));
            com.google.common.d.a.i.a(c.a(aq.e, bundle).a(), new com.facebook.orca.f.t(this, message));
        }
        q.put(message.w(), Long.valueOf(i.a()));
        b.a(useridentifierkey, null);
        return;
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void d(String s1)
    {
        if (m.f(s1))
        {
            s1 = m.a(s1).iterator();
            long l1 = i.a();
            while (s1.hasNext()) 
            {
                Message message = (Message)s1.next();
                Long long1 = (Long)q.get(message.w());
                if (long1 == null || l1 - long1.longValue() > 30000L)
                {
                    com.facebook.debug.log.b.a(a, "Clearing out expired recently sent message %s", new Object[] {
                        message
                    });
                    s1.remove();
                }
            }
        }
    }

    public List a(ThreadViewSpec threadviewspec)
    {
        if (threadviewspec.a())
        {
            return c(threadviewspec.d());
        }
        if (threadviewspec.b())
        {
            return a(threadviewspec.e().a().c());
        } else
        {
            throw new IllegalArgumentException();
        }
    }

    public void a()
    {
        p.clear();
        b();
    }

    public void a(Message message)
    {
        p.clear();
        long l1 = h.a();
        b((new e()).a(message).a(900).a(SendError.a).a(l1).b(l1).B());
    }

    public void a(Message message, String s1, String s2)
    {
        b(message, s1, s2);
        if (s2 != null)
        {
            s1 = (new e()).a(message);
            s1.a("trigger", s2);
            s1 = s1.B();
        } else
        {
            s1 = message;
        }
        if (com.facebook.debug.log.b.b(2))
        {
            StringBuilder stringbuilder = new StringBuilder("Sending message");
            stringbuilder.append((new StringBuilder()).append(" thread:").append(message.e()).toString());
            stringbuilder.append(" trigger:");
            if (s2 != null)
            {
                stringbuilder.append(s2);
            }
            com.facebook.debug.log.b.a(a, stringbuilder.toString());
        }
        b(s1);
    }

    protected void a(String s1)
    {
        cb cb1 = new cb("spurious_send_failure");
        cb1.b("thread_id", s1);
        g.a(cb1);
    }

    void a(String s1, ServiceException serviceexception)
    {
        if (!a(serviceexception.a())) goto _L2; else goto _L1
_L1:
        a(serviceexception.a(), s1);
_L4:
        return;
_L2:
        com.facebook.debug.log.b.a(a, "onSendFailure");
        e.a();
        t = false;
        r.put(ThreadViewSpec.a(s1), serviceexception);
        b(s1, serviceexception);
        b();
        b.a(s1);
        serviceexception = serviceexception.b().g();
        if (serviceexception == null)
        {
            break; /* Loop/switch isn't completed */
        }
        serviceexception = serviceexception.getParcelable("result");
        if (!(serviceexception instanceof Message))
        {
            break; /* Loop/switch isn't completed */
        }
        serviceexception = (Message)serviceexception;
_L5:
        if (serviceexception == null || serviceexception.w() == null)
        {
            d.a(s1);
            return;
        }
        serviceexception = serviceexception.w();
        if (s.add(serviceexception))
        {
            e.a(new v(this, serviceexception, s1), 10000L);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        serviceexception = null;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void a(String s1, String s2)
    {
        s1 = m.a(s1).iterator();
        do
        {
            if (!s1.hasNext())
            {
                break;
            }
            Message message = (Message)s1.next();
            if (message.x() && !com.facebook.common.w.n.a(s2) && Objects.equal(message.w(), s2))
            {
                com.facebook.debug.log.b.a(a, "Clearing out sent message with offlineThreadId %s", new Object[] {
                    s2
                });
                s1.remove();
            }
        } while (true);
    }

    public ServiceException b(ThreadViewSpec threadviewspec)
    {
        return (ServiceException)r.get(threadviewspec);
    }

    protected void b(String s1)
    {
        cb cb1 = new cb("queue_failure");
        cb1.b("thread_id", s1);
        g.a(cb1);
    }

}
