// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.w.q;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.user:
//            m, n, UserKey, UserEmailAddress, 
//            UserPhoneNumber, Name, PicCropInfo, Birthday, 
//            LastActive, MobileAppData, o, UserFbidIdentifier

public class User
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    private final String a;
    private final n b;
    private final es c;
    private final es d;
    private final Name e;
    private final String f;
    private final String g;
    private final PicCropInfo h;
    private final PicCropInfo i;
    private final String j;
    private final float k;
    private final q l;
    private final boolean m;
    private final Birthday n;
    private final String o;
    private final String p;
    private final LastActive q;
    private final MobileAppData r;
    private final String s;
    private final String t;
    private final UserKey u;
    private final es v;
    private final UserFbidIdentifier w;

    private User(Parcel parcel)
    {
        a = parcel.readString();
        b = com.facebook.user.n.valueOf(parcel.readString());
        u = new UserKey(b, a);
        c = es.a(parcel.readArrayList(com/facebook/user/UserEmailAddress.getClassLoader()));
        d = es.a(parcel.readArrayList(com/facebook/user/UserPhoneNumber.getClassLoader()));
        e = (Name)parcel.readParcelable(com/facebook/user/Name.getClassLoader());
        f = parcel.readString();
        g = parcel.readString();
        h = (PicCropInfo)parcel.readParcelable(com/facebook/user/PicCropInfo.getClassLoader());
        i = (PicCropInfo)parcel.readParcelable(com/facebook/user/PicCropInfo.getClassLoader());
        j = parcel.readString();
        k = parcel.readFloat();
        l = com.facebook.common.w.q.valueOf(parcel.readString());
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
        n = (Birthday)parcel.readParcelable(com/facebook/user/Birthday.getClassLoader());
        o = parcel.readString();
        p = parcel.readString();
        q = (LastActive)parcel.readParcelable(com/facebook/user/LastActive.getClassLoader());
        r = (MobileAppData)parcel.readParcelable(com/facebook/user/MobileAppData.getClassLoader());
        s = parcel.readString();
        t = parcel.readString();
        w = G();
        v = H();
    }

    User(Parcel parcel, m m1)
    {
        this(parcel);
    }

    User(o o1)
    {
        a = (String)Preconditions.checkNotNull(o1.b(), "id must not be null");
        b = (n)Preconditions.checkNotNull(o1.a(), "type must not be null");
        u = new UserKey(b, a);
        if (o1.c() == null)
        {
            c = es.d();
        } else
        {
            c = es.a(o1.c());
        }
        if (o1.d() == null)
        {
            d = es.d();
        } else
        {
            d = es.a(o1.d());
        }
        e = a(o1);
        f = o1.i();
        g = o1.j();
        h = o1.k();
        i = o1.l();
        j = o1.m();
        k = o1.n();
        l = o1.o();
        m = o1.p();
        n = o1.q();
        o = o1.r();
        p = o1.s();
        q = o1.t();
        r = o1.u();
        s = o1.v();
        t = o1.w();
        w = G();
        v = H();
    }

    private UserFbidIdentifier G()
    {
        if (b == n.FACEBOOK)
        {
            return new UserFbidIdentifier(a);
        } else
        {
            return null;
        }
    }

    private es H()
    {
        et et1 = es.e();
        if (w != null)
        {
            et1.b(w);
        }
        et1.b(c);
        et1.b(d);
        return et1.b();
    }

    private static Name a(o o1)
    {
        if (o1.h() != null)
        {
            return o1.h();
        } else
        {
            return new Name(o1.f(), o1.g(), o1.e());
        }
    }

    public String A()
    {
        return o;
    }

    public String B()
    {
        return p;
    }

    public LastActive C()
    {
        return q;
    }

    public MobileAppData D()
    {
        return r;
    }

    public String E()
    {
        return s;
    }

    public String F()
    {
        return t;
    }

    public n a()
    {
        return b;
    }

    public String b()
    {
        return a;
    }

    public UserKey c()
    {
        return u;
    }

    public Name d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e.getFirstName();
    }

    public String f()
    {
        return e.getLastName();
    }

    public String g()
    {
        return e.getDisplayName();
    }

    public String h()
    {
        return e.f();
    }

    public UserFbidIdentifier i()
    {
        return w;
    }

    public es j()
    {
        return c;
    }

    public es k()
    {
        return d;
    }

    public boolean l()
    {
        return !c.isEmpty();
    }

    public String m()
    {
        if (c.isEmpty())
        {
            return null;
        } else
        {
            return ((UserEmailAddress)c.get(0)).a();
        }
    }

    public boolean n()
    {
        return !d.isEmpty();
    }

    public UserPhoneNumber o()
    {
        if (d.isEmpty())
        {
            return null;
        } else
        {
            return (UserPhoneNumber)d.get(0);
        }
    }

    public String p()
    {
        return g;
    }

    public String q()
    {
        return f;
    }

    public Uri r()
    {
        if (g != null)
        {
            return Uri.parse(g);
        } else
        {
            return null;
        }
    }

    public PicCropInfo s()
    {
        return h;
    }

    public PicCropInfo t()
    {
        return i;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(e).append(" ");
        stringbuilder.append(a).append(" [").append(b).append("] ");
        if (!c.isEmpty())
        {
            stringbuilder.append(c.get(0)).append(" ");
        }
        if (!d.isEmpty())
        {
            stringbuilder.append(d.get(0)).append(" ");
        }
        return stringbuilder.toString();
    }

    public String u()
    {
        return j;
    }

    public es v()
    {
        return v;
    }

    public float w()
    {
        return k;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(a);
        parcel.writeString(b.name());
        parcel.writeList(c);
        parcel.writeList(d);
        parcel.writeParcelable(e, i1);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeParcelable(h, i1);
        parcel.writeParcelable(i, i1);
        parcel.writeString(j);
        parcel.writeFloat(k);
        parcel.writeString(l.name());
        int j1;
        if (m)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        parcel.writeParcelable(n, i1);
        parcel.writeString(o);
        parcel.writeString(p);
        parcel.writeParcelable(q, i1);
        parcel.writeParcelable(r, i1);
        parcel.writeString(s);
        parcel.writeString(t);
    }

    public q x()
    {
        return l;
    }

    public boolean y()
    {
        return m;
    }

    public Birthday z()
    {
        return n;
    }

}
