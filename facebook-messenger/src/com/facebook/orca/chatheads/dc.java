// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.emoji.ai;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.orca.chatheads:
//            dh, de, dg, dt, 
//            ef

public class dc
{

    private final Context a;
    private final WindowManager b;
    private ViewGroup c;
    private dh d;
    private dg e;
    private ai f;

    public dc(Context context, WindowManager windowmanager, ViewGroup viewgroup)
    {
        a = context;
        b = windowmanager;
        c = viewgroup;
        d = new dh(a);
        d.setEmojiKeyboardWindowControl(new de(this, null));
        d.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        viewgroup.addView(d);
    }

    static dg a(dc dc1)
    {
        return dc1.e;
    }

    static dg a(dc dc1, dg dg1)
    {
        dc1.e = dg1;
        return dg1;
    }

    static ai a(dc dc1, ai ai)
    {
        dc1.f = ai;
        return ai;
    }

    static WindowManager b(dc dc1)
    {
        return dc1.b;
    }

    static Context c(dc dc1)
    {
        return dc1.a;
    }

    static ai d(dc dc1)
    {
        return dc1.f;
    }

    static dh e(dc dc1)
    {
        return dc1.d;
    }

    public ThreadViewSpec a()
    {
        return d.getThread();
    }

    public void a(PointF pointf)
    {
        d.setNubTarget(pointf);
    }

    public void a(ThreadViewSpec threadviewspec)
    {
        d.setThread(threadviewspec);
    }

    public void a(dt dt)
    {
        d.setListener(dt);
    }

    public ef b()
    {
        return d.getThreadViewSpringyPositioner();
    }

    public void c()
    {
        d.a();
    }

    public s d()
    {
        return d.b();
    }

    public void e()
    {
        d.g();
    }

    public void f()
    {
        d.h();
    }

    public PointF g()
    {
        return d.getNubTarget();
    }

    public void h()
    {
        d.c();
    }

    public void i()
    {
        j();
        c.removeView(d);
    }

    public void j()
    {
        d.setEmojiKeyboardWindowControl(null);
        d.setEmojiKeyboardWindowControlListener(null);
        d.setListener(null);
        d.d();
        if (e != null)
        {
            e.b();
        }
    }
}
