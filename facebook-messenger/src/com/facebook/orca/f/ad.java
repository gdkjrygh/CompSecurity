// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.location.Location;
import com.facebook.auth.b.c;
import com.facebook.auth.f.b;
import com.facebook.common.w.n;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.compose.MessageDraft;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.orca.threads.g;
import com.facebook.orca.threads.i;
import com.facebook.orca.threads.v;
import com.facebook.orca.threads.x;
import com.facebook.user.Name;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.f:
//            m, ab, ae

public class ad
    implements b
{

    private static final Class a = com/facebook/orca/f/ad;
    private final com.facebook.auth.b.b b;
    private final i c;
    private final x d;
    private final a e;
    private final a f;
    private final g g;
    private final Map h = ik.a();
    private final Map i = ik.c();

    public ad(com.facebook.auth.b.b b1, i j, x x1, a a1, a a2, g g1)
    {
        b = b1;
        c = j;
        d = x1;
        e = a1;
        f = a2;
        g = g1;
    }

    private MessagesCollection a(Message message, MessagesCollection messagescollection, MessagesCollection messagescollection1)
    {
        MessagesCollection messagescollection2 = messagescollection;
        if (messagescollection == null)
        {
            messagescollection2 = MessagesCollection.a(message);
        }
        return c.a(messagescollection2, messagescollection1);
    }

    private MessagesCollection a(MessagesCollection messagescollection, Set set)
    {
        et et1 = es.e();
        Iterator iterator = messagescollection.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Message message = (Message)iterator.next();
            if (!set.contains(message.d()))
            {
                et1.b(message);
            }
        } while (true);
        return new MessagesCollection(messagescollection.a(), et1.b(), messagescollection.d());
    }

    private String a(User user)
    {
        Name name = user.d();
        if (name.a())
        {
            return name.getFirstName();
        }
        if (name.c())
        {
            return name.d();
        }
        if (name.e())
        {
            return name.getDisplayName();
        }
        if (user.l())
        {
            return user.m();
        } else
        {
            return null;
        }
    }

    private void a(Message message, MessagesCollection messagescollection, MessagesCollection messagescollection1, MessagesCollection messagescollection2)
    {
        if (!com.facebook.debug.log.b.b(2))
        {
            return;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Merged messages:\n");
            stringbuilder.append("  New Message:\n");
            a(stringbuilder, MessagesCollection.a(message), 1);
            stringbuilder.append("  Recent Messages:\n");
            a(stringbuilder, messagescollection, 5);
            stringbuilder.append("  Loaded Messages:\n");
            a(stringbuilder, messagescollection1, 5);
            stringbuilder.append("  Result:\n");
            a(stringbuilder, messagescollection2, 8);
            stringbuilder.append("\n");
            com.facebook.debug.log.b.a(a, stringbuilder.toString());
            return;
        }
    }

    private void a(MessagesCollection messagescollection)
    {
        if (!com.facebook.debug.log.b.b(2))
        {
            return;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("  Messages:\n");
            a(stringbuilder, messagescollection, 8);
            stringbuilder.append("\n");
            com.facebook.debug.log.b.a(a, stringbuilder.toString());
            return;
        }
    }

    private void a(ThreadSummary threadsummary, ThreadSummary threadsummary1)
    {
        if (com.facebook.debug.log.b.b(2))
        {
            threadsummary = threadsummary.toString();
            if (threadsummary1 == null || !Objects.equal(threadsummary, threadsummary1.toString()))
            {
                threadsummary1 = new StringBuilder();
                threadsummary1.append("  ThreadSummary: ").append(threadsummary);
                com.facebook.debug.log.b.a(a, threadsummary1.toString());
                return;
            }
        }
    }

    private void a(StringBuilder stringbuilder, MessagesCollection messagescollection, int j)
    {
        if (messagescollection == null || messagescollection.e())
        {
            stringbuilder.append("    none\n");
        } else
        {
            int k = 0;
            while (k < j && k < messagescollection.f()) 
            {
                Message message = messagescollection.a(k);
                stringbuilder.append("   ").append(message).append("\n");
                k++;
            }
        }
    }

    private boolean a(ThreadSummary threadsummary, Message message)
    {
        if (message != null || threadsummary != null)
        {
            if (threadsummary == null || message == null)
            {
                return false;
            }
            if (threadsummary.e() != -1L && threadsummary.e() != message.s())
            {
                return false;
            }
        }
        return true;
    }

    private void b(FolderName foldername, Message message, MessagesCollection messagescollection)
    {
        Object obj;
        MessagesCollection messagescollection1;
        ThreadSummary threadsummary;
        ab ab1;
        if (message == null)
        {
            return;
        }
        obj = message.e();
        ab1 = g(foldername).g(((String) (obj)));
        threadsummary = g(foldername).c(((String) (obj)));
        if (threadsummary == null)
        {
            a();
            ab1.b();
            return;
        }
        messagescollection1 = g(foldername).f(((String) (obj)));
        if (messagescollection1 != null) goto _L2; else goto _L1
_L1:
        obj = new MessagesCollection(((String) (obj)), es.d(), false);
        a();
        ab1.b();
_L4:
        if (messagescollection == null || !c.c(messagescollection, ((MessagesCollection) (obj))))
        {
            a();
            ab1.b();
        }
        messagescollection1 = a(message, messagescollection, ((MessagesCollection) (obj)));
        a(message, messagescollection, ((MessagesCollection) (obj)), messagescollection1);
        message = d.a(threadsummary, message);
        foldername = g(foldername);
        a(message, foldername.c(threadsummary.a()));
        foldername.b(message);
        foldername.a(messagescollection1);
        b(((ThreadSummary) (message)));
        return;
_L2:
        obj = messagescollection1;
        if (message.y())
        {
            a();
            ab1.b();
            obj = messagescollection1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(ThreadSummary threadsummary)
    {
        ab ab1 = g(threadsummary.y()).g(threadsummary.a());
        if (threadsummary.u())
        {
            ab1.a(threadsummary.c() - 1L);
            return;
        } else
        {
            ab1.a(threadsummary.c());
            return;
        }
    }

    private m g(FolderName foldername)
    {
        this;
        JVM INSTR monitorenter ;
        m m2 = (m)h.get(foldername);
        m m1;
        m1 = m2;
        if (m2 != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        m1 = new m(foldername);
        h.put(foldername, m1);
        this;
        JVM INSTR monitorexit ;
        return m1;
        foldername;
        throw foldername;
    }

    long a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        long l = g((FolderName)f.b()).g(s).g();
        this;
        JVM INSTR monitorexit ;
        return l;
        s;
        throw s;
    }

    ThreadSummary a(FolderName foldername, ThreadCriteria threadcriteria)
    {
        this;
        JVM INSTR monitorenter ;
        if (threadcriteria.a() == null) goto _L2; else goto _L1
_L1:
        foldername = g(foldername).c(threadcriteria.a());
_L4:
        this;
        JVM INSTR monitorexit ;
        return foldername;
_L2:
        threadcriteria = threadcriteria.b();
        foldername = g(foldername).a(threadcriteria);
        if (true) goto _L4; else goto _L3
_L3:
        foldername;
        throw foldername;
    }

    ThreadSummary a(FolderName foldername, String s)
    {
        this;
        JVM INSTR monitorenter ;
        foldername = g(foldername).c(s);
        this;
        JVM INSTR monitorexit ;
        return foldername;
        foldername;
        throw foldername;
    }

    ThreadSummary a(UserKey userkey, ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = h.keySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (FolderName)iterator.next();
        if (!a(((FolderName) (obj)), ae1)) goto _L4; else goto _L3
_L3:
        obj = g(((FolderName) (obj))).a(userkey);
        if (obj == null) goto _L4; else goto _L5
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((ThreadSummary) (obj));
_L2:
        obj = null;
        if (true) goto _L5; else goto _L6
_L6:
        userkey;
        throw userkey;
    }

    ThreadSummary a(String s, ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = h.keySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (FolderName)iterator.next();
        if (!a(((FolderName) (obj)), ae1)) goto _L4; else goto _L3
_L3:
        obj = g(((FolderName) (obj))).c(s);
        if (obj == null) goto _L4; else goto _L5
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((ThreadSummary) (obj));
_L2:
        obj = null;
        if (true) goto _L5; else goto _L6
_L6:
        s;
        throw s;
    }

    User a(UserKey userkey)
    {
        if (userkey == null)
        {
            return null;
        } else
        {
            return (User)i.get(userkey);
        }
    }

    String a(ParticipantInfo participantinfo)
    {
        Object obj;
        if (participantinfo.e() != null)
        {
            obj = (User)i.get(participantinfo.e());
            String s;
            if (obj != null)
            {
                obj = ((User) (obj)).d().f();
            } else
            {
                obj = participantinfo.d();
            }
        } else
        {
            obj = participantinfo.d();
        }
        s = ((String) (obj));
        if (obj == null)
        {
            s = participantinfo.a();
        }
        return s;
    }

    void a()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = h.values().iterator(); iterator.hasNext(); ((m)iterator.next()).c(false)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void a(FolderName foldername, Message message, MessagesCollection messagescollection)
    {
        this;
        JVM INSTR monitorenter ;
        b(foldername, message, messagescollection);
        this;
        JVM INSTR monitorexit ;
        return;
        foldername;
        throw foldername;
    }

    void a(FolderName foldername, FolderCounts foldercounts)
    {
        g(foldername).a(foldercounts);
    }

    void a(FolderName foldername, MessagesCollection messagescollection)
    {
        this;
        JVM INSTR monitorenter ;
        String s = messagescollection.a();
        g(foldername).a(messagescollection);
        foldername = g(foldername).c(s);
        if (foldername != null) goto _L2; else goto _L1
_L1:
        a();
_L4:
        a(messagescollection);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a(((ThreadSummary) (foldername)), messagescollection.c())) goto _L4; else goto _L3
_L3:
        a();
          goto _L4
        foldername;
        throw foldername;
    }

    void a(FolderName foldername, ThreadsCollection threadscollection, long l)
    {
        this;
        JVM INSTR monitorenter ;
        foldername = g(foldername);
        ThreadSummary threadsummary;
        for (Iterator iterator = threadscollection.b().iterator(); iterator.hasNext(); a(threadsummary, l))
        {
            threadsummary = (ThreadSummary)iterator.next();
            foldername.a(threadsummary);
        }

        break MISSING_BLOCK_LABEL_60;
        foldername;
        throw foldername;
        foldername.a(threadscollection.c());
        this;
        JVM INSTR monitorexit ;
    }

    void a(FolderName foldername, ThreadsCollection threadscollection, long l, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        foldername = g(foldername);
        foldername.g();
        ThreadSummary threadsummary;
        for (Iterator iterator = threadscollection.b().iterator(); iterator.hasNext(); a(threadsummary, l))
        {
            threadsummary = (ThreadSummary)iterator.next();
            foldername.a(threadsummary);
        }

        break MISSING_BLOCK_LABEL_64;
        foldername;
        throw foldername;
        foldername.b(true);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        foldername.c(flag);
        foldername.a(l);
        for (Iterator iterator1 = threadscollection.b().iterator(); iterator1.hasNext(); b((ThreadSummary)iterator1.next())) { }
        foldername.i();
        foldername.a(threadscollection.c());
        this;
        JVM INSTR monitorexit ;
    }

    void a(FolderName foldername, String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        g(foldername).g(s).b(l);
        this;
        JVM INSTR monitorexit ;
        return;
        foldername;
        throw foldername;
    }

    void a(ThreadSummary threadsummary)
    {
        this;
        JVM INSTR monitorenter ;
        a(threadsummary, ((MessageDraft) (null)));
        this;
        JVM INSTR monitorexit ;
        return;
        threadsummary;
        throw threadsummary;
    }

    void a(ThreadSummary threadsummary, long l)
    {
        this;
        JVM INSTR monitorenter ;
        a(threadsummary);
        threadsummary = g(threadsummary.y()).g(threadsummary.a());
        threadsummary.c(l);
        threadsummary.c();
        this;
        JVM INSTR monitorexit ;
        return;
        threadsummary;
        throw threadsummary;
    }

    void a(ThreadSummary threadsummary, MessageDraft messagedraft)
    {
        this;
        JVM INSTR monitorenter ;
        threadsummary = (new v()).a(threadsummary).a(messagedraft).z();
        messagedraft = g(threadsummary.y());
        a(threadsummary, messagedraft.c(threadsummary.a()));
        messagedraft.b(threadsummary);
        b(threadsummary);
        this;
        JVM INSTR monitorexit ;
        return;
        threadsummary;
        throw threadsummary;
    }

    void a(ThreadSummary threadsummary, MessagesCollection messagescollection)
    {
        this;
        JVM INSTR monitorenter ;
        FolderName foldername;
        foldername = threadsummary.y();
        threadsummary = threadsummary.a();
        if (!g(foldername).d(threadsummary)) goto _L2; else goto _L1
_L1:
        b(foldername, messagescollection.a(0), messagescollection);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(foldername, messagescollection);
        if (true) goto _L4; else goto _L3
_L3:
        threadsummary;
        throw threadsummary;
    }

    void a(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        a((FolderName)f.b(), s, l);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    void a(String s, Location location, long l)
    {
        this;
        JVM INSTR monitorenter ;
        g((FolderName)f.b()).g(s).a(location, l);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    void a(String s, Set set)
    {
        this;
        JVM INSTR monitorenter ;
        a(s, set, (FolderName)f.b());
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    void a(String s, Set set, FolderName foldername)
    {
        this;
        JVM INSTR monitorenter ;
        foldername = g(foldername);
        s = foldername.f(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        foldername.a(a(((MessagesCollection) (s)), set));
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void a(Collection collection)
    {
        UserKey userkey = (UserKey)e.b();
        User user;
        for (collection = collection.iterator(); collection.hasNext(); i.put(user.c(), user))
        {
            user = (User)collection.next();
            if (userkey != null && Objects.equal(user.c(), userkey) && (b instanceof c))
            {
                ((c)b).a(user);
            }
        }

    }

    boolean a(FolderName foldername)
    {
        return g(foldername).c();
    }

    boolean a(FolderName foldername, ae ae1)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = false;
        if (!g.a()) goto _L2; else goto _L1
_L1:
        if (ae1 != ae.PREFER_MERGED_FOLDERS) goto _L4; else goto _L3
_L3:
label0:
        {
            if (!g.a(foldername))
            {
                flag = flag1;
                if (g.b(foldername))
                {
                    break label0;
                }
            }
            flag = true;
        }
_L6:
        return flag;
_L4:
        if (ae1 == ae.PREFER_RAW_FOLDERS)
        {
            if (g.a(foldername))
            {
                return false;
            }
        } else
        {
            throw new IllegalArgumentException();
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (g.a(foldername))
        {
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    boolean a(String s, int j)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a(s, j, (FolderName)f.b());
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    boolean a(String s, int j, FolderName foldername)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag = a(s, foldername);
        if (flag) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        s = g(foldername).f(s);
        flag = flag1;
        int k;
        if (s.d())
        {
            continue; /* Loop/switch isn't completed */
        }
        k = s.f();
        flag = flag1;
        if (j > k)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    boolean a(String s, FolderName foldername)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        ab ab1 = g(foldername).h(s);
        if (ab1 == null) goto _L2; else goto _L1
_L1:
        boolean flag = ab1.a();
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = flag1;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        m m1 = g(foldername);
        foldername = m1.f(s);
        s = m1.c(s);
        flag = flag1;
        if (foldername == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag2 = a(((ThreadSummary) (s)), foldername.c());
        flag = flag1;
        if (flag2)
        {
            flag = true;
        }
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }

    long b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        long l = g((FolderName)f.b()).g(s).f();
        this;
        JVM INSTR monitorexit ;
        return l;
        s;
        throw s;
    }

    MessagesCollection b(FolderName foldername, String s)
    {
        this;
        JVM INSTR monitorenter ;
        foldername = g(foldername).f(s);
        this;
        JVM INSTR monitorexit ;
        return foldername;
        foldername;
        throw foldername;
    }

    MessagesCollection b(String s, ae ae1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = h.keySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (FolderName)iterator.next();
        if (!a(((FolderName) (obj)), ae1)) goto _L4; else goto _L3
_L3:
        obj = g(((FolderName) (obj))).f(s);
        if (obj == null) goto _L4; else goto _L5
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((MessagesCollection) (obj));
_L2:
        obj = null;
        if (true) goto _L5; else goto _L6
_L6:
        s;
        throw s;
    }

    String b(ParticipantInfo participantinfo)
    {
        if (participantinfo.e() == null) goto _L2; else goto _L1
_L1:
        Object obj = (User)i.get(participantinfo.e());
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = a(((User) (obj)));
_L5:
        String s = ((String) (obj));
        if (n.a(((CharSequence) (obj))))
        {
            s = participantinfo.d();
        }
        return s;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = h.values().iterator(); iterator.hasNext(); ((m)iterator.next()).j()) { }
        break MISSING_BLOCK_LABEL_46;
        Exception exception;
        exception;
        throw exception;
        h.clear();
        i.clear();
        this;
        JVM INSTR monitorexit ;
    }

    boolean b(FolderName foldername)
    {
        return g(foldername).d();
    }

    long c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        long l = g((FolderName)f.b()).g(s).e();
        this;
        JVM INSTR monitorexit ;
        return l;
        s;
        throw s;
    }

    ThreadsCollection c(FolderName foldername)
    {
        this;
        JVM INSTR monitorenter ;
        foldername = g(foldername);
        foldername = new ThreadsCollection(es.a(foldername.a().a()), foldername.b());
        this;
        JVM INSTR monitorexit ;
        return foldername;
        foldername;
        throw foldername;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        m m1 = (m)h.remove(FolderName.d);
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        m1.j();
        m1 = (m)h.remove(FolderName.e);
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        m1.j();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void c(FolderName foldername, String s)
    {
        this;
        JVM INSTR monitorenter ;
        g(foldername).b(s);
        g(foldername).e(s);
        for (foldername = h.values().iterator(); foldername.hasNext(); ((m)foldername.next()).a(s)) { }
        break MISSING_BLOCK_LABEL_65;
        foldername;
        throw foldername;
        this;
        JVM INSTR monitorexit ;
    }

    long d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        long l = g((FolderName)f.b()).g(s).d();
        this;
        JVM INSTR monitorexit ;
        return l;
        s;
        throw s;
    }

    es d(FolderName foldername)
    {
        this;
        JVM INSTR monitorenter ;
        foldername = g(foldername).h();
        this;
        JVM INSTR monitorexit ;
        return foldername;
        foldername;
        throw foldername;
    }

    public void d()
    {
        b();
    }

    FolderCounts e(FolderName foldername)
    {
        return g(foldername).f();
    }

    Collection e()
    {
        return Collections.unmodifiableCollection(i.values());
    }

    long f(FolderName foldername)
    {
        return g(foldername).e();
    }

}
