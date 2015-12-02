// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.w.n;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.compose.MessageDraft;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.ev;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.orca.threads:
//            t, ThreadParticipant, FolderName, v, 
//            u

public class ThreadSummary
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new t();
    private final String a;
    private final String b;
    private final long c;
    private final long d;
    private final long e;
    private final String f;
    private final es g;
    private final es h;
    private final es i;
    private final boolean j;
    private final UserKey k;
    private final long l;
    private final es m;
    private final String n;
    private final String o;
    private final ParticipantInfo p;
    private final String q;
    private final Uri r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final FolderName w;
    private final MessageDraft x;
    private final es y;
    private final ev z;

    private ThreadSummary(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readLong();
        d = parcel.readLong();
        e = parcel.readLong();
        f = parcel.readString();
        g = es.a(parcel.createTypedArrayList(ThreadParticipant.CREATOR));
        h = es.a(parcel.createTypedArrayList(ThreadParticipant.CREATOR));
        i = es.a(parcel.createTypedArrayList(ParticipantInfo.CREATOR));
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        k = UserKey.a(parcel.readString());
        l = parcel.readLong();
        m = es.a(parcel.createTypedArrayList(ParticipantInfo.CREATOR));
        n = parcel.readString();
        o = parcel.readString();
        p = (ParticipantInfo)parcel.readParcelable(com/facebook/messages/model/threads/ParticipantInfo.getClassLoader());
        q = parcel.readString();
        r = (Uri)parcel.readParcelable(null);
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        t = flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u = flag;
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        v = flag;
        w = (FolderName)parcel.readParcelable(com/facebook/orca/threads/FolderName.getClassLoader());
        x = (MessageDraft)parcel.readParcelable(com/facebook/orca/compose/MessageDraft.getClassLoader());
        y = es.a(parcel.createTypedArrayList(CREATOR));
        z = a(g, h);
    }

    ThreadSummary(Parcel parcel, t t1)
    {
        this(parcel);
    }

    ThreadSummary(v v1)
    {
        Preconditions.checkNotNull(v1.w());
        a = v1.a();
        b = v1.b();
        c = v1.f();
        d = v1.c();
        e = v1.d();
        f = v1.e();
        g = es.a(v1.i());
        h = es.a(v1.j());
        i = es.a(v1.k());
        j = v1.g();
        k = v1.h();
        l = v1.l();
        m = es.a(v1.p());
        n = v1.m();
        o = v1.o();
        p = v1.n();
        q = v1.q();
        r = v1.r();
        s = v1.s();
        t = v1.t();
        u = v1.u();
        v = v1.v();
        w = v1.w();
        x = v1.x();
        y = es.a(v1.y());
        z = a(g, h);
    }

    private static ev a(es es1, es es2)
    {
        java.util.HashMap hashmap = ik.a();
        ThreadParticipant threadparticipant;
        for (es1 = es1.iterator(); es1.hasNext(); hashmap.put(threadparticipant.d(), threadparticipant))
        {
            threadparticipant = (ThreadParticipant)es1.next();
        }

        for (es1 = es2.iterator(); es1.hasNext(); hashmap.put(es2.d(), es2))
        {
            es2 = (ThreadParticipant)es1.next();
        }

        return ev.a(hashmap);
    }

    private String a(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return s1.replace("\n", " ");
        }
    }

    public static v newBuilder()
    {
        return new v();
    }

    public es A()
    {
        return y;
    }

    public es B()
    {
        return h;
    }

    public List C()
    {
        return new u(g, h);
    }

    public ThreadParticipant a(ParticipantInfo participantinfo)
    {
        return a(participantinfo.e());
    }

    public ThreadParticipant a(UserKey userkey)
    {
        return (ThreadParticipant)z.get(userkey);
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public long d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public long e()
    {
        return e;
    }

    public boolean f()
    {
        return !com.facebook.common.w.n.a(f);
    }

    public String g()
    {
        return f;
    }

    public boolean h()
    {
        return j;
    }

    public UserKey i()
    {
        return k;
    }

    public es j()
    {
        return g;
    }

    public es k()
    {
        return i;
    }

    public long l()
    {
        return l;
    }

    public es m()
    {
        return m;
    }

    public String n()
    {
        return n;
    }

    public String o()
    {
        return o;
    }

    public ParticipantInfo p()
    {
        return p;
    }

    public String q()
    {
        return q;
    }

    public boolean r()
    {
        return q != null;
    }

    public Uri s()
    {
        return r;
    }

    public boolean t()
    {
        return r != null;
    }

    public String toString()
    {
        com.google.common.base.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(com/facebook/orca/threads/ThreadSummary).add("id", a).add("fbid", b).add("folder", w.b()).add("singleRecipientCanonicalThread", Boolean.valueOf(j));
        String s1;
        if (k != null)
        {
            s1 = k.c();
        } else
        {
            s1 = null;
        }
        return tostringhelper.add("singleRecipientUserKey", s1).add("timestampMs", Long.valueOf(l)).add("participants", g).add("senders", m).add("snippet", a(n)).add("adminSnippet", a(o)).toString();
    }

    public boolean u()
    {
        return s;
    }

    public boolean v()
    {
        return t;
    }

    public boolean w()
    {
        return u;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeLong(c);
        parcel.writeLong(d);
        parcel.writeLong(e);
        parcel.writeString(f);
        parcel.writeTypedList(g);
        parcel.writeTypedList(h);
        parcel.writeTypedList(i);
        String s1;
        int j1;
        if (j)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        if (k != null)
        {
            s1 = k.c();
        } else
        {
            s1 = null;
        }
        parcel.writeString(s1);
        parcel.writeLong(l);
        parcel.writeTypedList(m);
        parcel.writeString(n);
        parcel.writeString(o);
        parcel.writeParcelable(p, i1);
        parcel.writeString(q);
        parcel.writeParcelable(r, i1);
        if (s)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        if (t)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        if (u)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        if (v)
        {
            j1 = ((flag) ? 1 : 0);
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        parcel.writeParcelable(w, i1);
        parcel.writeParcelable(x, i1);
        parcel.writeTypedList(y);
    }

    public boolean x()
    {
        return v;
    }

    public FolderName y()
    {
        return w;
    }

    public MessageDraft z()
    {
        return x;
    }

}
