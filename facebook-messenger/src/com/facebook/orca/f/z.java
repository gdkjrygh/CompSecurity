// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.net.Uri;
import com.facebook.auth.f.b;
import com.facebook.debug.log.l;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.attachments.a;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.m;
import com.facebook.orca.threads.q;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hy;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.orca.f:
//            k, aa

public class z
    implements b
{

    private static final l a = new l();
    private static final Class b = com/facebook/orca/f/z;
    private final k c;
    private final a d;
    private final q e;
    private final ConcurrentMap f = (new hy()).a(128).c(2).i().n();
    private final Map g = ik.c();

    public z(k k1, a a1, q q1)
    {
        c = k1;
        d = a1;
        e = q1;
    }

    private aa d(ThreadSummary threadsummary)
    {
        Object obj4 = threadsummary.m();
        Object obj2 = threadsummary.j();
        Object obj3 = threadsummary.B();
        Object obj1 = c.b();
        Object obj = ik.b();
        obj4 = ((es) (obj4)).iterator();
        do
        {
            if (!((Iterator) (obj4)).hasNext())
            {
                break;
            }
            ParticipantInfo participantinfo1 = (ParticipantInfo)((Iterator) (obj4)).next();
            if (!Objects.equal(participantinfo1.e(), c.b()))
            {
                ((LinkedHashMap) (obj)).put(participantinfo1.e(), participantinfo1);
            }
        } while (true);
        obj3 = ((es) (obj3)).iterator();
        do
        {
            if (!((Iterator) (obj3)).hasNext())
            {
                break;
            }
            ThreadParticipant threadparticipant1 = (ThreadParticipant)((Iterator) (obj3)).next();
            if (((LinkedHashMap) (obj)).containsKey(threadparticipant1.d()))
            {
                ((LinkedHashMap) (obj)).remove(threadparticipant1.d());
            }
        } while (true);
        obj2 = ((es) (obj2)).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            ThreadParticipant threadparticipant = (ThreadParticipant)((Iterator) (obj2)).next();
            if (!Objects.equal(threadparticipant.d(), obj1) && !((LinkedHashMap) (obj)).containsKey(threadparticipant.d()))
            {
                ((LinkedHashMap) (obj)).put(threadparticipant.d(), threadparticipant.a());
            }
        } while (true);
        obj1 = es.e();
        obj2 = es.e();
        if (((LinkedHashMap) (obj)).size() == 1)
        {
            obj = (ParticipantInfo)((LinkedHashMap) (obj)).values().iterator().next();
            String s = c.a(((ParticipantInfo) (obj)));
            if (s != null)
            {
                ((et) (obj2)).b(obj);
                ((et) (obj1)).b(s);
            } else
            {
                com.facebook.debug.log.b.a(a, b, "ParticipantInfo [%s]", new Object[] {
                    obj
                });
            }
        } else
        {
            obj = ((LinkedHashMap) (obj)).values().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ParticipantInfo participantinfo = (ParticipantInfo)((Iterator) (obj)).next();
                String s1 = c.b(participantinfo);
                if (s1 != null)
                {
                    ((et) (obj2)).b(participantinfo);
                    ((et) (obj1)).b(s1);
                }
            }
        }
        return new aa(threadsummary.c(), ((et) (obj2)).b(), ((et) (obj1)).b());
    }

    public Uri a(ThreadSummary threadsummary, boolean flag)
    {
        if (threadsummary.r())
        {
            return d.a(threadsummary);
        }
        if (flag)
        {
            int i = c(threadsummary);
            if (i == 1)
            {
                threadsummary = (ThreadParticipant)threadsummary.j().get(0);
                return c.b(threadsummary.d());
            }
            if (i == 2)
            {
                threadsummary = e.a(threadsummary);
                return c.b(threadsummary.d());
            }
        }
        return null;
    }

    public UserKey a(String s)
    {
        if (s != null)
        {
            if ((s = c.b(s)) != null && (s = e.b(s)) != null)
            {
                return s.d();
            }
        }
        return null;
    }

    public Long a(UserKey userkey)
    {
        if (userkey == null)
        {
            return null;
        } else
        {
            return (Long)g.get(userkey.c());
        }
    }

    public List a(ThreadSummary threadsummary)
    {
        aa aa1;
label0:
        {
            aa aa2 = (aa)f.get(threadsummary.a());
            if (aa2 != null)
            {
                aa1 = aa2;
                if (com.facebook.orca.f.aa.a(aa2) == threadsummary.c())
                {
                    break label0;
                }
            }
            aa1 = d(threadsummary);
            f.put(threadsummary.a(), aa1);
        }
        return com.facebook.orca.f.aa.b(aa1);
    }

    public void a()
    {
        f.clear();
    }

    public void a(UserKey userkey, long l1)
    {
        Long long1;
        if (userkey != null)
        {
            if ((long1 = (Long)g.get(userkey.c())) == null || long1.longValue() < l1)
            {
                g.put(userkey.c(), Long.valueOf(l1));
                return;
            }
        }
    }

    public List b(ThreadSummary threadsummary)
    {
        aa aa1;
label0:
        {
            aa aa2 = (aa)f.get(threadsummary.a());
            if (aa2 != null)
            {
                aa1 = aa2;
                if (com.facebook.orca.f.aa.a(aa2) == threadsummary.c())
                {
                    break label0;
                }
            }
            aa1 = d(threadsummary);
            f.put(threadsummary.a(), aa1);
        }
        return aa.c(aa1);
    }

    public void b()
    {
        Iterator iterator = f.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (m.g((String)iterator.next()))
            {
                iterator.remove();
            }
        } while (true);
    }

    public int c(ThreadSummary threadsummary)
    {
        return threadsummary.j().size();
    }

    public void d()
    {
        a();
    }

}
