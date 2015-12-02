// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.activity;

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

public interface n
{

    public abstract Dialog a(int i1);

    public abstract Object a(Object obj);

    public abstract void a();

    public abstract void a(int i1, Dialog dialog);

    public abstract void a(Intent intent);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(Fragment fragment);

    public abstract void a(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo);

    public abstract void a(e e1);

    public abstract void a(Object obj, Object obj1);

    public abstract void a(String s1, Fragment fragment);

    public abstract void a(boolean flag);

    public abstract boolean a(int i1, KeyEvent keyevent);

    public abstract boolean a(KeyEvent keyevent);

    public abstract boolean a(Menu menu);

    public abstract boolean a(MenuItem menuitem);

    public abstract boolean a(MotionEvent motionevent);

    public abstract boolean a(Exception exception);

    public abstract View b(int i1);

    public abstract void b();

    public abstract void b(Intent intent);

    public abstract void b(Bundle bundle);

    public abstract boolean b(int i1, KeyEvent keyevent);

    public abstract boolean b(Menu menu);

    public abstract boolean b(MenuItem menuitem);

    public abstract void c();

    public abstract void c(int i1);

    public abstract void c(Bundle bundle);

    public abstract String d(int i1);

    public abstract void d();

    public abstract void d(Bundle bundle);

    public abstract void e();

    public abstract void e(int i1);

    public abstract void f();

    public abstract String g();

    public abstract boolean h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract t l();

    public abstract void m();

    public abstract q n();

    public abstract Window o();

    public abstract Intent p();

    public abstract Resources q();

    public abstract MenuInflater r();

    public abstract boolean s();
}
