// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.headless.filters.IFilter;
import com.aviary.android.feather.library.a.a;
import com.aviary.android.feather.library.services.IAviaryController;
import java.util.HashMap;

public abstract class com.aviary.android.feather.sdk.panels.c
{
    public static interface a
    {

        public abstract View a(LayoutInflater layoutinflater);

        public abstract void a(c c1);
    }

    public static interface b
    {

        public abstract void a(Bitmap bitmap, com.aviary.android.feather.library.d.a a1);
    }

    public static interface c
    {

        public abstract void a(com.aviary.android.feather.sdk.panels.c c1);
    }

    public static interface d
    {

        public abstract void a(CharSequence charsequence, int i1, android.content.DialogInterface.OnClickListener onclicklistener);
    }

    public static interface e
    {

        public abstract void b(Bitmap bitmap, boolean flag);

        public abstract void x();
    }

    public static interface f
    {

        public abstract void A();

        public abstract void B();

        public abstract void C();

        public abstract void D();
    }

    public static interface g
    {

        public abstract View c(LayoutInflater layoutinflater, ViewGroup viewgroup);
    }


    private Bundle a;
    private boolean b;
    private boolean c;
    private IAviaryController d;
    protected final com.aviary.android.feather.library.d.a e;
    protected Bitmap f;
    protected Bitmap g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected IFilter k;
    protected HashMap l;
    protected f m;
    protected e n;
    protected b o;
    protected d p;
    protected com.aviary.android.feather.common.a.a.c q;
    final Handler r = new Handler() {

        final com.aviary.android.feather.sdk.panels.c a;

        public void handleMessage(Message message)
        {
            boolean flag;
            flag = true;
            super.handleMessage(message);
            message.what;
            JVM INSTR tableswitch 1 12: default 76
        //                       1 77
        //                       2 76
        //                       3 76
        //                       4 170
        //                       5 203
        //                       6 236
        //                       7 269
        //                       8 302
        //                       9 332
        //                       10 355
        //                       11 379
        //                       12 137;
               goto _L1 _L2 _L1 _L1 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            return;
_L2:
            if (a.n != null && a.n())
            {
                e e1 = a.n;
                Bitmap bitmap = (Bitmap)message.obj;
                if (message.arg1 != 1)
                {
                    flag = false;
                }
                e1.b(bitmap, flag);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L11:
            if (a.n != null && a.n())
            {
                a.n.x();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (a.m != null && a.o())
            {
                a.m.A();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (a.m != null && a.o())
            {
                a.m.B();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            if (a.m != null && a.o())
            {
                a.m.C();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (a.m != null && a.o())
            {
                a.m.D();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            if (a.n())
            {
                a.B().a((CharSequence)message.obj);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L8:
            if (a.n())
            {
                a.B().f();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L9:
            if (a.n())
            {
                a.B().a(false);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L10:
            if (a.n())
            {
                a.B().a(true);
                return;
            }
            if (true) goto _L1; else goto _L12
_L12:
        }

            
            {
                a = com.aviary.android.feather.sdk.panels.c.this;
                super();
            }
    };
    private com.aviary.android.feather.library.filters.a.a s;

    public com.aviary.android.feather.sdk.panels.c(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1)
    {
        d = iaviarycontroller;
        s = a1.c;
        b = false;
        j = true;
        l = new HashMap();
        q = com.aviary.android.feather.common.a.a.a(getClass().getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
        e = new com.aviary.android.feather.library.d.a(com.aviary.android.feather.library.filters.a.b(s), com.aviary.android.feather.library.filters.a.c(s));
        c(false);
    }

    private void a()
    {
        D();
        f = null;
        g = null;
        n = null;
        p = null;
        o = null;
        d = null;
        k = null;
        s = null;
        a = null;
    }

    public void A()
    {
        q.b("onDeactivate");
        a(false);
        b = false;
    }

    public IAviaryController B()
    {
        return d;
    }

    public com.aviary.android.feather.library.filters.a.a C()
    {
        return s;
    }

    protected void D()
    {
        if (f != null && !f.isRecycled() && !f.equals(g))
        {
            q.c((new StringBuilder()).append("[recycle] preview Bitmap: ").append(f).toString());
            f.recycle();
        }
    }

    protected void E()
    {
        c(true);
        if (n())
        {
            r.removeMessages(12);
            r.sendEmptyMessage(12);
        }
    }

    protected void F()
    {
        a(((com.aviary.android.feather.library.d.a) (null)));
    }

    public void a(Configuration configuration, Configuration configuration1)
    {
    }

    public void a(Bitmap bitmap)
    {
        q.b("onBitmapReplaced");
        if (n())
        {
            g = bitmap;
            e.g();
            c(false);
        }
    }

    public void a(Bitmap bitmap, Bundle bundle)
    {
        q.b("onCreate");
        g = bitmap;
        c = true;
        a = bundle;
    }

    protected void a(Bitmap bitmap, com.aviary.android.feather.library.d.a a1)
    {
        q.b("onComplete(bitmap, editResult)");
        if (o != null && n())
        {
            B().h().a((new StringBuilder()).append(com.aviary.android.feather.library.filters.a.a(s)).append(": saved").toString(), l);
            o.a(bitmap, a1);
        }
        f = null;
        i = false;
    }

    protected void a(Bitmap bitmap, boolean flag, boolean flag1)
    {
        int i1 = 1;
        boolean flag2;
        if (bitmap != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        c(flag2);
        if (bitmap == null || !bitmap.equals(f))
        {
            D();
        }
        f = bitmap;
        if (flag1 && n())
        {
            Message message = r.obtainMessage(1);
            message.obj = bitmap;
            if (!flag)
            {
                i1 = 0;
            }
            message.arg1 = i1;
            r.sendMessage(message);
        }
    }

    protected void a(com.aviary.android.feather.library.d.a a1)
    {
        a(f, a1);
    }

    public void a(b b1)
    {
        o = b1;
    }

    public void a(d d1)
    {
        p = d1;
    }

    public void a(e e1)
    {
        n = e1;
    }

    public void a(f f1)
    {
        m = f1;
    }

    protected void a(CharSequence charsequence, int i1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        if (p != null && n())
        {
            p.a(charsequence, i1, onclicklistener);
        }
    }

    protected void a(Exception exception)
    {
        a(((CharSequence) (exception.getMessage())), 0x104000a, ((android.content.DialogInterface.OnClickListener) (null)));
    }

    public void a(boolean flag)
    {
        j = flag;
    }

    public boolean a(String s1)
    {
        return q() && a.containsKey(s1);
    }

    protected void b(Bitmap bitmap)
    {
        a(bitmap, e);
    }

    protected void b(boolean flag)
    {
        Handler handler = r;
        byte byte0;
        if (flag)
        {
            byte0 = 11;
        } else
        {
            byte0 = 10;
        }
        handler.sendEmptyMessage(byte0);
    }

    protected void c()
    {
        q.b("onDispose");
        a();
    }

    protected void c(boolean flag)
    {
        h = flag;
    }

    public abstract boolean e();

    public Handler g()
    {
        return r;
    }

    protected void h()
    {
        r.sendEmptyMessage(9);
    }

    protected void i()
    {
        if (n())
        {
            r.sendEmptyMessage(4);
        }
    }

    protected void j()
    {
        if (n())
        {
            r.sendEmptyMessage(5);
        }
    }

    protected void k()
    {
        if (n())
        {
            r.sendEmptyMessage(6);
        }
    }

    protected void l()
    {
        if (n())
        {
            r.sendEmptyMessage(7);
        }
    }

    public boolean m()
    {
        return j;
    }

    public boolean n()
    {
        return b && o();
    }

    public boolean o()
    {
        return c;
    }

    public Bundle p()
    {
        return a;
    }

    public boolean q()
    {
        return a != null;
    }

    public void r()
    {
        q.b("onOpening");
    }

    public void s()
    {
        q.b("onClosing");
    }

    public boolean t()
    {
        return false;
    }

    public void u()
    {
        q.b("onSave");
        if (!i)
        {
            i = true;
            F();
        }
    }

    public boolean v()
    {
        q.b("onCancel");
        return false;
    }

    public void w()
    {
        q.b("onCancelled");
        a(false);
    }

    public boolean x()
    {
        return h;
    }

    public void y()
    {
        q.b("onDestroy");
        c = false;
        c();
    }

    public void z()
    {
        q.b("onActivate");
        b = true;
    }
}
