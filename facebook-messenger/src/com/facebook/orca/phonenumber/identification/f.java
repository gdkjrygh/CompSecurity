// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.phonenumber.identification;

import android.os.Handler;
import com.google.common.base.Preconditions;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.orca.phonenumber.identification:
//            g, h

public class f
{

    private ab a;
    private Handler b;
    private Runnable c;
    private boolean d;
    private boolean e;
    private String f;
    private long g;

    public f()
    {
        d = false;
    }

    static void a(f f1)
    {
        f1.c();
    }

    static void a(f f1, String s)
    {
        f1.a(s);
    }

    private void a(String s)
    {
        if (a != null)
        {
            a.a_(s);
            e();
            f();
        }
    }

    private String b(String s)
    {
        if (f != null)
        {
            s = Pattern.compile((new StringBuilder()).append(f).append("\\s\\w+").toString()).matcher(s);
            if (!s.find())
            {
                return null;
            }
            s = s.group();
            Matcher matcher = Pattern.compile("\\w+$").matcher(s);
            s = matcher;
            if (!matcher.find())
            {
                return null;
            }
        } else
        {
            Matcher matcher1 = Pattern.compile("\\d{4,}").matcher(s);
            s = matcher1;
            if (!matcher1.find())
            {
                return null;
            }
        }
        return s.group();
    }

    private void c()
    {
        if (a != null)
        {
            a.a_(new Exception("Cannot get the confirmation sms from Facebook"));
            f();
        }
    }

    private void d()
    {
        c = new g(this);
        b.postDelayed(c, 30000L);
    }

    private void e()
    {
        if (c != null)
        {
            b.removeCallbacks(c);
            c = null;
        }
    }

    private void f()
    {
        f = null;
        b = null;
        d = false;
        a = null;
    }

    public s a(Handler handler, String s)
    {
        return a(handler, s, 30000L, true);
    }

    public s a(Handler handler, String s, long l, boolean flag)
    {
label0:
        {
            boolean flag2 = false;
            boolean flag1;
            if (handler != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkArgument(flag1, "Null Handler!");
            if (s != null)
            {
                flag1 = flag2;
                if (s.length() <= 0)
                {
                    break label0;
                }
                flag1 = flag2;
                if (s.length() > 5)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        Preconditions.checkArgument(flag1, "Invalid marker length!");
        f = s;
        b = handler;
        g = l;
        a = ab.a();
        d();
        d = true;
        e = flag;
        return a;
    }

    public void a()
    {
        e();
        f();
    }

    public boolean a(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            String s = b((String)list.next());
            if (s != null)
            {
                list = new h(this, s);
                b.post(list);
                return e;
            }
        }

        return false;
    }

    public boolean b()
    {
        return d;
    }
}
