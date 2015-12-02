// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.app.Activity;
import android.app.Dialog;
import android.app.NativeActivity;
import android.content.Context;
import android.content.ContextWrapper;
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
import com.facebook.base.activity.l;
import com.facebook.base.activity.n;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.reflex:
//            g, f, j

public class e extends g
{

    private final n c;

    public e(l l1)
    {
        c = l1.a(this, new f(this));
    }

    static Dialog a(e e1, int i1)
    {
        return e1.g.onCreateDialog(i1);
    }

    static Object a(e e1, Object obj)
    {
        return e1.j.a(obj);
    }

    static void a(e e1)
    {
        e1.g.onStart();
    }

    static void a(e e1, int i1, Dialog dialog)
    {
        e1.g.onPrepareDialog(i1, dialog);
    }

    static void a(e e1, Intent intent)
    {
        e1.g.a(intent);
    }

    static void a(e e1, Configuration configuration)
    {
        e1.g.onConfigurationChanged(configuration);
    }

    static void a(e e1, Bundle bundle)
    {
        e1.g.b(bundle);
    }

    static void a(e e1, Fragment fragment)
    {
        e1.j.a(fragment);
    }

    static void a(e e1, ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        e1.Activity.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    static void a(e e1, com.facebook.common.d.e e2)
    {
        e1.g.a(e2);
    }

    static void a(e e1, Object obj, Object obj1)
    {
        e1.j.a(obj, obj1);
    }

    static void a(e e1, String s1, Fragment fragment)
    {
        e1.g.a(s1, fragment);
    }

    static void a(e e1, boolean flag)
    {
        e1.NativeActivity.onWindowFocusChanged(flag);
    }

    static boolean a(e e1, int i1, KeyEvent keyevent)
    {
        return e1.g.onKeyDown(i1, keyevent);
    }

    static boolean a(e e1, KeyEvent keyevent)
    {
        return e1.NativeActivity.dispatchKeyEvent(keyevent);
    }

    static boolean a(e e1, Menu menu)
    {
        return e1.g.onCreateOptionsMenu(menu);
    }

    static boolean a(e e1, MenuItem menuitem)
    {
        return e1.g.onOptionsItemSelected(menuitem);
    }

    static boolean a(e e1, MotionEvent motionevent)
    {
        return e1.g.dispatchTouchEvent(motionevent);
    }

    static boolean a(e e1, Exception exception)
    {
        return e1.g.a(exception);
    }

    static View b(e e1, int i1)
    {
        return e1.g.a(i1);
    }

    static void b(e e1)
    {
        e1.g.onStop();
    }

    static void b(e e1, Intent intent)
    {
        e1.Activity.startActivity(intent);
    }

    static void b(e e1, Bundle bundle)
    {
        e1.g.a(bundle);
    }

    static boolean b(e e1, int i1, KeyEvent keyevent)
    {
        return e1.g.onKeyUp(i1, keyevent);
    }

    static boolean b(e e1, Menu menu)
    {
        return e1.g.onPrepareOptionsMenu(menu);
    }

    static boolean b(e e1, MenuItem menuitem)
    {
        return e1.Activity.onContextItemSelected(menuitem);
    }

    static void c(e e1)
    {
        e1.g.onPause();
    }

    static void c(e e1, int i1)
    {
        e1.j.setContentView(i1);
    }

    static void c(e e1, Bundle bundle)
    {
        e1.g.onPostCreate(bundle);
    }

    static String d(e e1, int i1)
    {
        return e1.Context.getString(i1);
    }

    static void d(e e1)
    {
        e1.g.onResume();
    }

    static void d(e e1, Bundle bundle)
    {
        e1.NativeActivity.onSaveInstanceState(bundle);
    }

    static void e(e e1)
    {
        e1.g.onDestroy();
    }

    static void e(e e1, int i1)
    {
        e1.Activity.setRequestedOrientation(i1);
    }

    static void f(e e1)
    {
        e1.g.onUserInteraction();
    }

    static String g(e e1)
    {
        return e1.g.h();
    }

    static boolean h(e e1)
    {
        return e1.g.onSearchRequested();
    }

    static void i(e e1)
    {
        e1.g.finish();
    }

    static void j(e e1)
    {
        e1.g.onContentChanged();
    }

    static void k(e e1)
    {
        e1.g.onBackPressed();
    }

    static t l(e e1)
    {
        return e1.g.d();
    }

    static void m(e e1)
    {
        e1.j.onAttachedToWindow();
    }

    static q n(e e1)
    {
        return e1.j.f();
    }

    static Window o(e e1)
    {
        return e1.Activity.getWindow();
    }

    static Intent p(e e1)
    {
        return e1.Activity.getIntent();
    }

    static Resources q(e e1)
    {
        return e1.ContextWrapper.getResources();
    }

    static MenuInflater r(e e1)
    {
        return e1.Activity.getMenuInflater();
    }

    static boolean s(e e1)
    {
        return e1.Activity.hasWindowFocus();
    }

    protected View a(int i1)
    {
        return c.b(i1);
    }

    public Object a(Object obj)
    {
        return c.a(obj);
    }

    protected void a(Intent intent)
    {
        c.a(intent);
    }

    protected void a(Bundle bundle)
    {
        c.b(bundle);
    }

    public void a(Fragment fragment)
    {
        c.a(fragment);
    }

    public void a(com.facebook.common.d.e e1)
    {
        c.a(e1);
    }

    public void a(Object obj, Object obj1)
    {
        c.a(obj, obj1);
    }

    public void a(String s1, Fragment fragment)
    {
        c.a(s1, fragment);
    }

    public boolean a(Exception exception)
    {
        return c.a(exception);
    }

    protected void b(Bundle bundle)
    {
        c.a(bundle);
    }

    public t d()
    {
        return c.l();
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return c.a(keyevent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return c.a(motionevent);
    }

    public q f()
    {
        return c.n();
    }

    public void finish()
    {
        c.i();
    }

    public Intent getIntent()
    {
        return c.p();
    }

    public MenuInflater getMenuInflater()
    {
        return c.r();
    }

    public Resources getResources()
    {
        return c.q();
    }

    public Window getWindow()
    {
        return c.o();
    }

    public String h()
    {
        return c.g();
    }

    public boolean hasWindowFocus()
    {
        return c.s();
    }

    public void onAttachedToWindow()
    {
        c.m();
    }

    public void onBackPressed()
    {
        c.k();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        c.a(configuration);
    }

    public void onContentChanged()
    {
        c.j();
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        return c.b(menuitem);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        c.a(contextmenu, view, contextmenuinfo);
    }

    protected Dialog onCreateDialog(int i1)
    {
        return c.a(i1);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return c.a(menu);
    }

    protected void onDestroy()
    {
        c.e();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return c.a(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        return c.b(i1, keyevent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return c.a(menuitem);
    }

    protected void onPause()
    {
        c.c();
    }

    protected void onPostCreate(Bundle bundle)
    {
        c.c(bundle);
    }

    protected void onPrepareDialog(int i1, Dialog dialog)
    {
        c.a(i1, dialog);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return c.b(menu);
    }

    protected void onResume()
    {
        c.d();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        c.d(bundle);
    }

    public boolean onSearchRequested()
    {
        return c.h();
    }

    protected void onStart()
    {
        c.a();
    }

    protected void onStop()
    {
        c.b();
    }

    public void onUserInteraction()
    {
        c.f();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        c.a(flag);
    }

    public void setContentView(int i1)
    {
        c.c(i1);
    }

    public void setRequestedOrientation(int i1)
    {
        c.e(i1);
    }

    public void startActivity(Intent intent)
    {
        c.b(intent);
    }
}
