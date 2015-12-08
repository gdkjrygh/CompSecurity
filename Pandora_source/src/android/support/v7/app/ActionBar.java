// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public abstract class ActionBar
{
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;

        public LayoutParams(int i)
        {
            this(-2, -1, i);
        }

        public LayoutParams(int i, int j, int k)
        {
            super(i, j);
            a = -1;
            a = k;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = -1;
            context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBarLayout);
            a = context.getInt(0, -1);
            context.recycle();
        }
    }

    static interface a
    {
    }

    public static interface b
    {

        public abstract boolean a(int i, long l);
    }

    public static abstract class c
    {

        public abstract Drawable a();

        public abstract CharSequence b();

        public abstract View c();

        public abstract void d();

        public abstract CharSequence e();

        public c()
        {
        }
    }


    public ActionBar()
    {
    }

    public abstract int a();

    public abstract void a(int i);

    public abstract void a(Drawable drawable);

    public abstract void a(View view, LayoutParams layoutparams);

    public abstract void a(CharSequence charsequence);

    public abstract void a(boolean flag);

    public Context b()
    {
        return null;
    }

    public abstract void b(int i);

    public abstract void b(boolean flag);

    public abstract void c(boolean flag);

    public abstract void d(boolean flag);

    public abstract void e(boolean flag);

    public void f(boolean flag)
    {
    }

    // Unreferenced inner class android/support/v7/app/ActionBar$DisplayOptions
    /* block-local class not found */
    class DisplayOptions {}


    // Unreferenced inner class android/support/v7/app/ActionBar$NavigationMode
    /* block-local class not found */
    class NavigationMode {}

}
