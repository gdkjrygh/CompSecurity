// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;

public interface f
{

    public abstract Dialog a(Activity activity, int i1);

    public abstract Boolean a(Activity activity, int i1, KeyEvent keyevent);

    public abstract void a(Activity activity);

    public abstract void a(Activity activity, int i1, int j1, Intent intent);

    public abstract void a(Activity activity, Intent intent);

    public abstract void a(Activity activity, Configuration configuration);

    public abstract void a(Activity activity, Bundle bundle);

    public abstract void a(Activity activity, MotionEvent motionevent);

    public abstract void a(Menu menu);

    public abstract boolean a(Activity activity, int i1, Dialog dialog);

    public abstract boolean a(Activity activity, Exception exception);

    public abstract boolean a(MenuItem menuitem);

    public abstract Boolean b(Activity activity, int i1, KeyEvent keyevent);

    public abstract void b(Activity activity);

    public abstract void b(Menu menu);

    public abstract void c(Activity activity);

    public abstract void d(Activity activity);

    public abstract void e(Activity activity);

    public abstract void f(Activity activity);

    public abstract void g(Activity activity);

    public abstract void h(Activity activity);

    public abstract void i(Activity activity);

    public abstract void j(Activity activity);

    public abstract Boolean k(Activity activity);

    public abstract boolean l(Activity activity);
}
