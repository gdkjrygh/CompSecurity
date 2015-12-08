// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.a;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.k;
import com.kik.g.p;
import com.kik.g.s;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutorService;
import kik.a.d.aa;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.f.ao;
import kik.a.f.j;
import kik.a.h.h;
import kik.a.h.i;
import kik.a.z;

// Referenced classes of package kik.a.g:
//            ba, bb, bc, be, 
//            bd

public final class az
    implements w, j
{

    private final f a = new f();
    private final com.kik.g.i b = new ba(this);
    private aa c;
    private kik.a.e.f d;
    private v e;
    private k f;
    private k g;
    private k h;
    private p i;

    public az(v v1, kik.a.e.f f1)
    {
        i = new p();
        e = v1;
        d = f1;
    }

    static void a(az az1)
    {
        if (az1.c.a())
        {
            az1.d.a(new ao(az1));
        }
    }

    static v b(az az1)
    {
        return az1.e;
    }

    static k c(az az1)
    {
        return az1.h;
    }

    public final e a()
    {
        return g.a();
    }

    public final p a(String s1)
    {
        byte abyte0[] = kik.a.h.h.a(z.b(e).d(), s1, "niCRwL7isZHny24qgLvy");
        String s2 = kik.a.h.i.a(abyte0);
        return s.b(s.b(d.a(new ao(this, null, null, s1, null, s2, null))), new bb(this, s1, abyte0));
    }

    public final p a(String s1, String s2)
    {
        return s.b(s.b(d.a(new ao(this, s1, s2, null, null, null, null))), new bc(this, s1, s2));
    }

    public final p a(boolean flag)
    {
        return s.b(s.b(d.a(new ao(this, null, null, null, Boolean.valueOf(flag), null, null))), new be(this, flag));
    }

    public final void a(ExecutorService executorservice)
    {
        f = new a(this, executorservice);
        g = new a(this, executorservice);
        h = new k(this);
        c = aa.a(e);
        a.a(d.b(), b);
    }

    public final void a(aa aa1)
    {
        boolean flag2 = false;
        boolean flag = false;
        boolean flag1 = true;
        Object obj = c;
        if (aa1 != null)
        {
            flag = flag2;
            if (aa1.c != null)
            {
                obj.c = aa1.c;
                flag = true;
            }
            if (aa1.a != null)
            {
                obj.a = aa1.a;
                flag = true;
            }
            if (aa1.b != null)
            {
                obj.b = aa1.b;
                flag = true;
            }
            if (aa1.d != null)
            {
                obj.d = aa1.d;
                flag = true;
            }
            if (aa1.e != null)
            {
                obj.e = aa1.e;
                flag = true;
            }
            if (aa1.f != null)
            {
                obj.f = aa1.f;
                flag = true;
            }
            if (aa1.g != null)
            {
                obj.g = aa1.g;
                flag = true;
            }
            if (aa1.h != null)
            {
                obj.h = aa1.h;
                flag = true;
            }
            if (aa1.i != null)
            {
                obj.i = aa1.i;
                flag = flag1;
            }
        }
        if (flag)
        {
            aa aa2 = c;
            obj = e;
            ((v) (obj)).c("user_profile_email", aa2.a);
            if (aa2.b != null && aa2.b.booleanValue())
            {
                aa1 = "true";
            } else
            {
                aa1 = "false";
            }
            ((v) (obj)).c("user_profile_email_emailConfirmed", aa1);
            ((v) (obj)).c("user_profile_username", aa2.c);
            ((v) (obj)).c("user_profile_firstName", aa2.d);
            ((v) (obj)).c("user_profile_lastName", aa2.e);
            ((v) (obj)).c("user_profile_photoUrl", aa2.f);
            if (aa2.g != null && aa2.g.booleanValue())
            {
                aa1 = "true";
            } else
            {
                aa1 = "false";
            }
            ((v) (obj)).c("user_profile_is_updated", aa1);
            if (aa2.h != null && aa2.h.booleanValue())
            {
                aa1 = "true";
            } else
            {
                aa1 = "false";
            }
            ((v) (obj)).c("notify_new_people", aa1);
            if (aa2.i != null && aa2.i.booleanValue())
            {
                aa1 = "true";
            } else
            {
                aa1 = "false";
            }
            ((v) (obj)).c("user_profile_verified", aa1);
            g.a(null);
        }
    }

    public final void a(kik.a.f.f.z z1, int i1)
    {
        if (!(z1 instanceof ao)) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 2 2: default 28
    //                   2 29;
           goto _L2 _L3
_L2:
        return;
_L3:
        a(((ao)z1).d());
        return;
    }

    public final void a(byte abyte0[])
    {
        e.a(abyte0, c);
    }

    public final e b()
    {
        return f.a();
    }

    public final p b(String s1)
    {
        Object obj = d();
        Object obj1;
        try
        {
            obj1 = MessageDigest.getInstance("SHA1");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s.a(s1);
        }
        s1 = kik.a.h.i.a(((MessageDigest) (obj1)).digest(s1.getBytes()));
        obj1 = kik.a.h.i.a(kik.a.h.h.a(s1, ((aa) (obj)).c, "niCRwL7isZHny24qgLvy"));
        obj = kik.a.h.i.a(kik.a.h.h.a(s1, ((aa) (obj)).a, "niCRwL7isZHny24qgLvy"));
        return s.b(s.b(d.a(new ao(this, null, null, null, null, ((String) (obj)), ((String) (obj1))))), new bd(this, s1));
    }

    public final void b(byte abyte0[])
    {
        e.b(abyte0, c);
    }

    public final e c()
    {
        return h.a();
    }

    public final aa d()
    {
        aa aa1 = c;
        aa aa2 = new aa();
        aa2.a = aa1.a;
        aa2.b = aa1.b;
        aa2.c = aa1.c;
        aa2.d = aa1.d;
        aa2.e = aa1.e;
        aa2.f = aa1.f;
        aa2.g = aa1.g;
        aa2.h = aa1.h;
        aa2.i = aa1.i;
        return aa2;
    }

    public final void e()
    {
        f.a(null);
        i.e();
    }

    public final void f()
    {
        d.a(new ao(this));
    }

    public final void g()
    {
        i.a(null);
    }

    public final p h()
    {
        return i;
    }

    public final void i()
    {
        if (c.a())
        {
            d.a(new ao(this));
        }
        a.a();
    }

    public final boolean j()
    {
        return e.o();
    }

    public final boolean k()
    {
        return c != null && c.f != null;
    }

    public final void l()
    {
        if (!j() && k())
        {
            d.a(new ao(this));
        }
    }
}
