// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.view.a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import java.lang.annotation.Annotation;

public abstract class ActionBar
{
    public static interface DisplayOptions
        extends Annotation
    {
    }

    public static interface NavigationMode
        extends Annotation
    {
    }

    public static class a extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;

        public a()
        {
            super(-2, -2);
            a = 0;
            a = 0x800013;
        }

        public a(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.a.k.ActionBarLayout);
            a = context.getInt(android.support.v7.appcompat.a.k.ActionBarLayout_android_layout_gravity, 0);
            context.recycle();
        }

        public a(a a1)
        {
            super(a1);
            a = 0;
            a = a1.a;
        }

        public a(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
        }
    }

    public static abstract class b
    {

        public abstract Drawable a();

        public abstract CharSequence b();

        public abstract View c();

        public abstract CharSequence d();

        public b()
        {
        }
    }


    public ActionBar()
    {
    }

    public android.support.v7.view.a a(android.support.v7.view.a.a a1)
    {
        return null;
    }

    public abstract void a();

    public void a(int i1)
    {
    }

    public void a(Configuration configuration)
    {
    }

    public abstract void a(Drawable drawable);

    public abstract void a(View view);

    public abstract void a(CharSequence charsequence);

    public abstract void a(boolean flag);

    public boolean a(int i1, KeyEvent keyevent)
    {
        return false;
    }

    public abstract void b();

    public void b(int i1)
    {
    }

    public void b(Drawable drawable)
    {
    }

    public void b(CharSequence charsequence)
    {
    }

    public abstract void b(boolean flag);

    public abstract void c();

    public void c(boolean flag)
    {
    }

    public abstract View d();

    public void d(boolean flag)
    {
    }

    public abstract int e();

    public void e(boolean flag)
    {
    }

    public abstract int f();

    public abstract void g();

    public abstract void h();

    public abstract boolean i();

    public Context j()
    {
        return null;
    }

    public boolean k()
    {
        return false;
    }

    public boolean l()
    {
        return false;
    }
}
