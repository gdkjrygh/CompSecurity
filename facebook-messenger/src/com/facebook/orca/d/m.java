// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.media.AudioManager;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.d:
//            n, o, e, bf, 
//            l

public class m
{

    private final AudioManager a;
    private final a b;
    private final bf c;
    private final Queue d = new LinkedList();
    private final l e = new n(this);
    private final android.media.AudioManager.OnAudioFocusChangeListener f = new o(this);
    private e g;

    public m(AudioManager audiomanager, a a1, bf bf1)
    {
        a = audiomanager;
        b = a1;
        c = bf1;
    }

    static void a(m m1)
    {
        m1.h();
    }

    static e b(m m1)
    {
        return m1.g;
    }

    private e c(Uri uri)
    {
        e e1 = (e)b.b();
        e1.a(uri);
        return e1;
    }

    private void c()
    {
        c.a(3);
    }

    private void d()
    {
        c.a(0x80000000);
    }

    private boolean e()
    {
        return a.requestAudioFocus(f, 0, 2) == 1;
    }

    private void f()
    {
        a.abandonAudioFocus(f);
    }

    private void g()
    {
        if (g != null)
        {
            g.c();
            return;
        }
        if (!d.isEmpty())
        {
            c();
            e();
            g = (e)d.remove();
            g.a(e);
            g.a();
            return;
        } else
        {
            f();
            return;
        }
    }

    private void h()
    {
        g.b(e);
        g = null;
        g();
    }

    public e a(Uri uri)
    {
        uri = c(uri);
        d.clear();
        d.add(uri);
        g();
        return uri;
    }

    public void a()
    {
        b();
        d();
    }

    public e b(Uri uri)
    {
        if (g != null && g.b() == uri)
        {
            return g;
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            e e1 = (e)iterator.next();
            if (e1.b() == uri)
            {
                return e1;
            }
        }

        return null;
    }

    public void b()
    {
        if (g != null)
        {
            g.c();
        }
    }
}
