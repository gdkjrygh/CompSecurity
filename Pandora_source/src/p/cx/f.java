// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.content.Intent;
import com.pandora.radio.data.af;
import com.pandora.radio.data.q;
import java.security.InvalidParameterException;
import p.cw.b;
import p.cw.c;
import p.dd.ae;
import p.dd.an;
import p.dd.bo;
import p.di.aa;
import p.di.e;
import p.di.v;
import p.di.y;

// Referenced classes of package p.cx:
//            e

public class f
    implements p.cx.e
{

    private e.a a;
    private final c b;
    private af c;
    private q d;

    public f(c c1)
    {
        a = e.a.a;
        b = c1;
        c1.b(this);
    }

    public af a()
    {
        return c;
    }

    public void a(Intent intent)
    {
        (new y()).execute(new Object[] {
            intent, b.e()
        });
    }

    void a(af af)
    {
        if (c != af)
        {
            c = af;
            b.a(new bo(af));
        }
    }

    void a(q q)
    {
        if (d != q)
        {
            d = q;
            b.a(new ae(q));
        }
    }

    public void a(String s, String s1)
    {
        (new aa()).execute(new Object[] {
            s, s1
        });
    }

    public void a(String s, String s1, int i, String s2, boolean flag, String s3, boolean flag1)
    {
        (new e()).execute(new Object[] {
            s, s1, Integer.valueOf(i), s2, s3, Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
    }

    public void a(e.a a1)
    {
        if (a == a1)
        {
            return;
        }
        a = a1;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[e.a.values().length];
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(a1).toString());

        case 3: // '\003'
        case 4: // '\004'
            a(((af) (null)));
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            b.a(new an(c, d, a1));
            break;
        }
    }

    public void a(boolean flag)
    {
        b.a(new an(c, d, p.cx.e.a.c));
        b.d().a(false, "signing out");
        (new v()).execute(new Object[] {
            b, this, Boolean.valueOf(flag)
        });
    }

    void b()
    {
        a(p.cx.e.a.b);
    }

    q c()
    {
        return d;
    }

    public void d()
    {
        b.c(this);
    }

    public ae producePartnerDataEvent()
    {
        return new ae(d);
    }

    public an produceSignInState()
    {
        return new an(c, d, a);
    }

    public bo produceUserDataEvent()
    {
        return new bo(c);
    }
}
