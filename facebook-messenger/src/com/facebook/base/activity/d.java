// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
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
//            i, e, l, n

public class d extends com.facebook.base.activity.i
{

    private final n p;

    public d(l l1)
    {
        p = l1.a(this, new com.facebook.base.activity.e(this));
    }

    static Dialog a(d d1, int i1)
    {
        return d1.i.onCreateDialog(i1);
    }

    static Object a(d d1, Object obj)
    {
        return d1.i.a(obj);
    }

    static void a(d d1)
    {
        d1.i.onStart();
    }

    static void a(d d1, int i1, Dialog dialog)
    {
        d1.i.onPrepareDialog(i1, dialog);
    }

    static void a(d d1, Intent intent)
    {
        d1.i.a(intent);
    }

    static void a(d d1, Configuration configuration)
    {
        d1.i.onConfigurationChanged(configuration);
    }

    static void a(d d1, Bundle bundle)
    {
        d1.i.a(bundle);
    }

    static void a(d d1, Fragment fragment)
    {
        d1.i.a(fragment);
    }

    static void a(d d1, ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        d1.Activity.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    static void a(d d1, e e1)
    {
        d1.i.a(e1);
    }

    static void a(d d1, Object obj, Object obj1)
    {
        d1.i.a(obj, obj1);
    }

    static void a(d d1, String s1, Fragment fragment)
    {
        d1.i.a(s1, fragment);
    }

    static void a(d d1, boolean flag)
    {
        d1.Activity.onWindowFocusChanged(flag);
    }

    static boolean a(d d1, int i1, KeyEvent keyevent)
    {
        return d1.i.onKeyDown(i1, keyevent);
    }

    static boolean a(d d1, KeyEvent keyevent)
    {
        return d1.Activity.dispatchKeyEvent(keyevent);
    }

    static boolean a(d d1, Menu menu)
    {
        return d1.i.onCreateOptionsMenu(menu);
    }

    static boolean a(d d1, MenuItem menuitem)
    {
        return d1.i.onOptionsItemSelected(menuitem);
    }

    static boolean a(d d1, MotionEvent motionevent)
    {
        return d1.i.dispatchTouchEvent(motionevent);
    }

    static boolean a(d d1, Exception exception)
    {
        return d1.i.a(exception);
    }

    static View b(d d1, int i1)
    {
        return d1.i.b(i1);
    }

    static void b(d d1)
    {
        d1.i.onStop();
    }

    static void b(d d1, Intent intent)
    {
        d1.Activity.startActivity(intent);
    }

    static void b(d d1, Bundle bundle)
    {
        d1.i.b(bundle);
    }

    static boolean b(d d1, int i1, KeyEvent keyevent)
    {
        return d1.i.onKeyUp(i1, keyevent);
    }

    static boolean b(d d1, Menu menu)
    {
        return d1.i.onPrepareOptionsMenu(menu);
    }

    static boolean b(d d1, MenuItem menuitem)
    {
        return d1.Activity.onContextItemSelected(menuitem);
    }

    static void c(d d1)
    {
        d1.i.onPause();
    }

    static void c(d d1, int i1)
    {
        d1.Activity.setContentView(i1);
    }

    static void c(d d1, Bundle bundle)
    {
        d1.i.onPostCreate(bundle);
    }

    static String d(d d1, int i1)
    {
        return d1.Context.getString(i1);
    }

    static void d(d d1)
    {
        d1.i.onResume();
    }

    static void d(d d1, Bundle bundle)
    {
        d1.i.onSaveInstanceState(bundle);
    }

    static void e(d d1)
    {
        d1.i.onDestroy();
    }

    static void e(d d1, int i1)
    {
        d1.Activity.setRequestedOrientation(i1);
    }

    static void f(d d1)
    {
        d1.i.onUserInteraction();
    }

    static String g(d d1)
    {
        return d1.i.h();
    }

    static boolean h(d d1)
    {
        return d1.i.onSearchRequested();
    }

    static void i(d d1)
    {
        d1.i.finish();
    }

    static void j(d d1)
    {
        d1.i.onContentChanged();
    }

    static void k(d d1)
    {
        d1.i.onBackPressed();
    }

    static t l(d d1)
    {
        return d1.com.facebook.base.activity.i.i();
    }

    static void m(d d1)
    {
        d1.Activity.onAttachedToWindow();
    }

    static q n(d d1)
    {
        return d1.i.f();
    }

    static Window o(d d1)
    {
        return d1.Activity.getWindow();
    }

    static Intent p(d d1)
    {
        return d1.Activity.getIntent();
    }

    static Resources q(d d1)
    {
        return d1.ContextWrapper.getResources();
    }

    static MenuInflater r(d d1)
    {
        return d1.Activity.getMenuInflater();
    }

    static boolean s(d d1)
    {
        return d1.Activity.hasWindowFocus();
    }

    public Object a(Object obj)
    {
        return p.a(obj);
    }

    protected void a(Intent intent)
    {
        p.a(intent);
    }

    protected void a(Bundle bundle)
    {
        p.a(bundle);
    }

    public void a(Fragment fragment)
    {
        p.a(fragment);
    }

    public void a(e e1)
    {
        p.a(e1);
    }

    public void a(Object obj, Object obj1)
    {
        p.a(obj, obj1);
    }

    public void a(String s1, Fragment fragment)
    {
        p.a(s1, fragment);
    }

    public boolean a(Exception exception)
    {
        return p.a(exception);
    }

    protected View b(int i1)
    {
        return p.b(i1);
    }

    protected void b(Bundle bundle)
    {
        p.b(bundle);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return p.a(keyevent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return p.a(motionevent);
    }

    public q f()
    {
        return p.n();
    }

    public void finish()
    {
        p.i();
    }

    public Intent getIntent()
    {
        return p.p();
    }

    public MenuInflater getMenuInflater()
    {
        return p.r();
    }

    public Resources getResources()
    {
        return p.q();
    }

    public Window getWindow()
    {
        return p.o();
    }

    public String h()
    {
        return p.g();
    }

    public boolean hasWindowFocus()
    {
        return p.s();
    }

    public t i()
    {
        return p.l();
    }

    public void onAttachedToWindow()
    {
        p.m();
    }

    public void onBackPressed()
    {
        p.k();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        p.a(configuration);
    }

    public void onContentChanged()
    {
        p.j();
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        return p.b(menuitem);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        p.a(contextmenu, view, contextmenuinfo);
    }

    protected Dialog onCreateDialog(int i1)
    {
        return p.a(i1);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return p.a(menu);
    }

    protected void onDestroy()
    {
        p.e();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return p.a(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        return p.b(i1, keyevent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return p.a(menuitem);
    }

    protected void onPause()
    {
        p.c();
    }

    protected void onPostCreate(Bundle bundle)
    {
        p.c(bundle);
    }

    protected void onPrepareDialog(int i1, Dialog dialog)
    {
        p.a(i1, dialog);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return p.b(menu);
    }

    protected void onResume()
    {
        p.d();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        p.d(bundle);
    }

    public boolean onSearchRequested()
    {
        return p.h();
    }

    protected void onStart()
    {
        p.a();
    }

    protected void onStop()
    {
        p.b();
    }

    public void onUserInteraction()
    {
        p.f();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        p.a(flag);
    }

    public void setContentView(int i1)
    {
        p.c(i1);
    }

    public void setRequestedOrientation(int i1)
    {
        p.e(i1);
    }

    public void startActivity(Intent intent)
    {
        p.b(intent);
    }
}
