// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.q;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.common.d.e;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.base.activity:
//            n, m

public class l
{

    private Activity a;
    private n b;

    public l()
    {
    }

    protected Dialog a(int i1)
    {
        return b.a(i1);
    }

    public final n a(Activity activity, n n1)
    {
        a = activity;
        b = n1;
        return new m(this);
    }

    public Object a(Object obj)
    {
        return b.a(obj);
    }

    protected void a(int i1, Dialog dialog)
    {
        b.a(i1, dialog);
    }

    protected void a(Intent intent)
    {
        b.a(intent);
    }

    public void a(Configuration configuration)
    {
        b.a(configuration);
    }

    protected void a(Bundle bundle)
    {
        b.a(bundle);
    }

    public void a(Fragment fragment)
    {
        b.a(fragment);
    }

    public void a(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        b.a(contextmenu, view, contextmenuinfo);
    }

    public void a(e e1)
    {
        b.a(e1);
    }

    public void a(Object obj, Object obj1)
    {
        b.a(obj, obj1);
    }

    public void a(String s1, Fragment fragment)
    {
        b.a(s1, fragment);
    }

    public void a(boolean flag)
    {
        b.a(flag);
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        return b.a(i1, keyevent);
    }

    public boolean a(KeyEvent keyevent)
    {
        return b.a(keyevent);
    }

    public boolean a(Menu menu)
    {
        return b.a(menu);
    }

    public boolean a(MenuItem menuitem)
    {
        return b.a(menuitem);
    }

    public boolean a(MotionEvent motionevent)
    {
        return b.a(motionevent);
    }

    public boolean a(Exception exception)
    {
        return b.a(exception);
    }

    protected final Activity b()
    {
        return a;
    }

    protected View b(int i1)
    {
        return b.b(i1);
    }

    public void b(Intent intent)
    {
        b.b(intent);
    }

    protected void b(Bundle bundle)
    {
        b.b(bundle);
    }

    public boolean b(int i1, KeyEvent keyevent)
    {
        return b.b(i1, keyevent);
    }

    public boolean b(Menu menu)
    {
        return b.b(menu);
    }

    public boolean b(MenuItem menuitem)
    {
        return b.b(menuitem);
    }

    public void c(int i1)
    {
        b.c(i1);
    }

    protected void c(Bundle bundle)
    {
        b.c(bundle);
    }

    public final String d(int i1)
    {
        return b.d(i1);
    }

    protected void d()
    {
        b.b();
    }

    protected void d(Bundle bundle)
    {
        b.d(bundle);
    }

    protected void e()
    {
        b.c();
    }

    public void e(int i1)
    {
        b.e(i1);
    }

    protected void e_()
    {
        b.a();
    }

    protected void f()
    {
        b.d();
    }

    protected void g()
    {
        b.e();
    }

    public void h()
    {
        b.f();
    }

    public String i()
    {
        return b.g();
    }

    public boolean j()
    {
        return b.h();
    }

    public void k()
    {
        b.i();
    }

    public void l()
    {
        b.j();
    }

    public void m()
    {
        b.k();
    }

    public t n()
    {
        return b.l();
    }

    public void o()
    {
        b.m();
    }

    public q p()
    {
        return b.n();
    }

    public Window q()
    {
        return b.o();
    }

    public Intent r()
    {
        return b.p();
    }

    public Resources s()
    {
        return b.q();
    }

    public MenuInflater t()
    {
        return b.r();
    }

    public boolean u()
    {
        return b.s();
    }
}
