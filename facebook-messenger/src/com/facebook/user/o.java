// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import com.facebook.common.w.q;
import java.util.List;

// Referenced classes of package com.facebook.user:
//            User, n, Name, PicCropInfo, 
//            Birthday, LastActive, MobileAppData

public class o
{

    private n a;
    private String b;
    private List c;
    private List d;
    private Name e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private PicCropInfo k;
    private PicCropInfo l;
    private String m;
    private float n;
    private q o;
    private boolean p;
    private Birthday q;
    private String r;
    private String s;
    private LastActive t;
    private MobileAppData u;
    private String v;
    private String w;

    public o()
    {
        c = null;
        d = null;
        o = q.UNSET;
    }

    public n a()
    {
        return a;
    }

    public o a(float f1)
    {
        n = f1;
        return this;
    }

    public o a(q q1)
    {
        o = q1;
        return this;
    }

    public o a(Birthday birthday)
    {
        q = birthday;
        return this;
    }

    public o a(LastActive lastactive)
    {
        t = lastactive;
        return this;
    }

    public o a(MobileAppData mobileappdata)
    {
        u = mobileappdata;
        return this;
    }

    public o a(Name name)
    {
        e = name;
        return this;
    }

    public o a(PicCropInfo piccropinfo)
    {
        k = piccropinfo;
        return this;
    }

    public o a(User user)
    {
        a = user.a();
        b = user.b();
        c = user.j();
        d = user.k();
        e = user.d();
        j = user.p();
        i = user.q();
        k = user.s();
        l = user.t();
        m = user.u();
        n = user.w();
        o = user.x();
        p = user.y();
        q = user.z();
        r = user.A();
        s = user.B();
        t = user.C();
        u = user.D();
        v = user.E();
        w = user.F();
        return this;
    }

    public o a(n n1, String s1)
    {
        a = n1;
        b = s1;
        return this;
    }

    public o a(String s1)
    {
        f = s1;
        return this;
    }

    public o a(List list)
    {
        c = list;
        return this;
    }

    public void a(boolean flag)
    {
        p = flag;
    }

    public o b(PicCropInfo piccropinfo)
    {
        l = piccropinfo;
        return this;
    }

    public o b(String s1)
    {
        i = s1;
        return this;
    }

    public o b(List list)
    {
        d = list;
        return this;
    }

    public String b()
    {
        return b;
    }

    public o c(String s1)
    {
        j = s1;
        return this;
    }

    public List c()
    {
        return c;
    }

    public o d(String s1)
    {
        r = s1;
        return this;
    }

    public List d()
    {
        return d;
    }

    public o e(String s1)
    {
        s = s1;
        return this;
    }

    public String e()
    {
        return f;
    }

    public o f(String s1)
    {
        v = s1;
        return this;
    }

    public String f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }

    public void g(String s1)
    {
        w = s1;
    }

    public Name h()
    {
        return e;
    }

    public String i()
    {
        return i;
    }

    public String j()
    {
        return j;
    }

    public PicCropInfo k()
    {
        return k;
    }

    public PicCropInfo l()
    {
        return l;
    }

    public String m()
    {
        return m;
    }

    public float n()
    {
        return n;
    }

    public q o()
    {
        return o;
    }

    public boolean p()
    {
        return p;
    }

    public Birthday q()
    {
        return q;
    }

    public String r()
    {
        return r;
    }

    public String s()
    {
        return s;
    }

    public LastActive t()
    {
        return t;
    }

    public MobileAppData u()
    {
        return u;
    }

    public String v()
    {
        return v;
    }

    public String w()
    {
        return w;
    }

    public User x()
    {
        return new User(this);
    }
}
