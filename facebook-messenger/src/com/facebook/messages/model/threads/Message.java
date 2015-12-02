// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.w.n;
import com.facebook.location.Coordinates;
import com.facebook.messages.model.share.Share;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.user.RecipientInfo;
import com.google.common.a.es;
import com.google.common.a.ev;
import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.facebook.messages.model.threads:
//            b, ParticipantInfo, TitanAttachmentInfo, c, 
//            GroupMessageInfo, SendError, e

public class Message
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final SendError A;
    private final String a;
    private final String b;
    private final long c;
    private final long d;
    private final ParticipantInfo e;
    private final String f;
    private final String g;
    private final String h;
    private final long i;
    private final Coordinates j;
    private final es k;
    private final es l;
    private final es m;
    private final int n;
    private final es o;
    private final String p;
    private final boolean q;
    private final String r;
    private final c s;
    private final es t;
    private final es u;
    private final String v;
    private final long w;
    private final RecipientInfo x;
    private final GroupMessageInfo y;
    private final ev z;

    private Message(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readLong();
        d = parcel.readLong();
        e = (ParticipantInfo)parcel.readParcelable(com/facebook/messages/model/threads/ParticipantInfo.getClassLoader());
        f = parcel.readString();
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readLong();
        j = (Coordinates)parcel.readParcelable(com/facebook/location/Coordinates.getClassLoader());
        k = es.a(parcel.readArrayList(com/facebook/ui/media/attachments/MediaResource.getClassLoader()));
        l = es.a(parcel.readArrayList(com/facebook/messages/model/threads/TitanAttachmentInfo.getClassLoader()));
        m = es.a(parcel.readArrayList(com/facebook/messages/model/share/Share.getClassLoader()));
        n = parcel.readInt();
        o = es.a(parcel.readArrayList(com/facebook/messages/model/threads/ParticipantInfo.getClassLoader()));
        p = parcel.readString();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q = flag;
        r = parcel.readString();
        s = com.facebook.messages.model.threads.c.valueOf(parcel.readString());
        t = es.a(parcel.readArrayList(com/facebook/ui/media/attachments/MediaResource.getClassLoader()));
        u = es.a(parcel.readArrayList(com/facebook/messages/model/share/Share.getClassLoader()));
        v = parcel.readString();
        w = parcel.readLong();
        x = (RecipientInfo)parcel.readParcelable(com/facebook/user/RecipientInfo.getClassLoader());
        y = (GroupMessageInfo)parcel.readParcelable(com/facebook/messages/model/threads/GroupMessageInfo.getClassLoader());
        z = ev.a(parcel.readHashMap(com/facebook/messages/model/threads/Message.getClassLoader()));
        A = (SendError)parcel.readParcelable(com/facebook/messages/model/threads/SendError.getClassLoader());
    }

    Message(Parcel parcel, b b1)
    {
        this(parcel);
    }

    Message(e e1)
    {
        boolean flag = true;
        super();
        a = e1.a();
        b = e1.b();
        c = e1.c();
        d = e1.d();
        e = e1.e();
        f = e1.f();
        g = e1.g();
        h = e1.h();
        i = e1.i();
        j = e1.j();
        k = es.a(e1.k());
        l = es.a(e1.l());
        m = es.a(e1.m());
        n = e1.n();
        o = es.a(e1.o());
        p = e1.p();
        q = e1.q();
        r = e1.r();
        s = e1.s();
        t = es.a(e1.t());
        u = es.a(e1.u());
        v = e1.v();
        w = e1.w();
        x = e1.x();
        y = e1.y();
        z = ev.a(e1.z());
        A = e1.A();
        boolean flag1;
        if (b == null || x == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1);
        if (n != 901)
        {
            flag = false;
        }
        Preconditions.checkArgument(SendError.a.equals(A) ^ flag);
    }

    public c A()
    {
        return s;
    }

    public List B()
    {
        return t;
    }

    public boolean C()
    {
        return t != null && !t.isEmpty();
    }

    public es D()
    {
        return u;
    }

    public String E()
    {
        return v;
    }

    public long F()
    {
        return w;
    }

    public RecipientInfo G()
    {
        return x;
    }

    public GroupMessageInfo H()
    {
        return y;
    }

    public boolean I()
    {
        return z != null && !z.isEmpty();
    }

    public ev J()
    {
        return z;
    }

    public SendError K()
    {
        return A;
    }

    public boolean a()
    {
        return !com.facebook.common.w.n.a(b());
    }

    public String b()
    {
        return k();
    }

    public boolean c()
    {
        return !t();
    }

    public String d()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return b;
    }

    public long f()
    {
        return c;
    }

    public boolean g()
    {
        return d != 0L;
    }

    public long h()
    {
        return d;
    }

    public ParticipantInfo i()
    {
        return e;
    }

    public String j()
    {
        return f;
    }

    public String k()
    {
        return g;
    }

    public boolean l()
    {
        return g != null;
    }

    public String m()
    {
        return h;
    }

    public Coordinates n()
    {
        return j;
    }

    public List o()
    {
        return k;
    }

    public es p()
    {
        return l;
    }

    public es q()
    {
        return m;
    }

    public boolean r()
    {
        return j != null;
    }

    public long s()
    {
        return i;
    }

    public boolean t()
    {
        return n != 0 && n != 900 && n != 901;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(d());
        if (x())
        {
            stringbuilder.append(" (").append(w()).append(")");
        }
        stringbuilder.append(" ").append(A());
        stringbuilder.append(" t: ").append(c);
        stringbuilder.append(" st: ").append(d);
        stringbuilder.append(": ");
        String s1 = k();
        if (com.facebook.common.w.n.a(s1))
        {
            stringbuilder.append("[empty]");
        } else
        if (s1.length() > 10)
        {
            stringbuilder.append(s1.substring(0, 10));
        } else
        {
            stringbuilder.append(s1);
        }
        return stringbuilder.toString();
    }

    public int u()
    {
        return n;
    }

    public es v()
    {
        return o;
    }

    public String w()
    {
        return p;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeLong(c);
        parcel.writeLong(d);
        parcel.writeParcelable(e, i1);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeLong(i);
        parcel.writeParcelable(j, i1);
        parcel.writeList(k);
        parcel.writeList(l);
        parcel.writeList(m);
        parcel.writeInt(n);
        parcel.writeList(o);
        parcel.writeString(p);
        int j1;
        if (q)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        parcel.writeString(r);
        parcel.writeString(s.name());
        parcel.writeList(t);
        parcel.writeList(u);
        parcel.writeString(v);
        parcel.writeLong(w);
        parcel.writeParcelable(x, i1);
        parcel.writeParcelable(y, i1);
        parcel.writeMap(z);
        parcel.writeParcelable(A, i1);
    }

    public boolean x()
    {
        return !com.facebook.common.w.n.a(p);
    }

    public boolean y()
    {
        return q;
    }

    public String z()
    {
        return r;
    }

}
