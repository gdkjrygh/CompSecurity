// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;

public abstract class s
{
    private static class a extends s
    {

        private Context c;
        private CharSequence d;
        private android.content.DialogInterface.OnClickListener e;

        public s a(android.content.DialogInterface.OnClickListener onclicklistener)
        {
            e = onclicklistener;
            return this;
        }

        public void a()
        {
        }

        public void a(float f1, float f2)
        {
        }

        public void a(int j, int k, int l)
        {
        }

        public void a(View view)
        {
        }

        public void a(CharSequence charsequence)
        {
            d = charsequence;
        }

        public void b(int j)
        {
            d = c.getText(j);
        }

        public int c()
        {
            return 0;
        }

        public float d()
        {
            return 0.0F;
        }

        public float e()
        {
            return 0.0F;
        }

        public View f()
        {
            return null;
        }

        public int g()
        {
            return 0;
        }

        public int h()
        {
            return 0;
        }

        public void i()
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(new ContextThemeWrapper(c, 0x7f0c01d0));
            builder.setPositiveButton(0x7f08042e, e);
            builder.setMessage(d);
            builder.show();
        }

        public a(Context context)
        {
            e = null;
            c = context;
        }
    }


    public static final int a = 1;
    public static final int b = 0;
    private int c;

    public s()
    {
    }

    public static s a(Activity activity, int j, int k)
    {
        return a(activity, ((CharSequence) (activity.getString(j))), k);
    }

    public static s a(Activity activity, CharSequence charsequence, int j)
    {
        activity = new a(activity);
        activity.a(charsequence);
        return activity;
    }

    public abstract s a(android.content.DialogInterface.OnClickListener onclicklistener);

    public abstract void a();

    public abstract void a(float f1, float f2);

    public void a(int j)
    {
        c = j;
    }

    public abstract void a(int j, int k, int l);

    public abstract void a(View view);

    public abstract void a(CharSequence charsequence);

    public int b()
    {
        return c;
    }

    public abstract void b(int j);

    public abstract int c();

    public abstract float d();

    public abstract float e();

    public abstract View f();

    public abstract int g();

    public abstract int h();

    public abstract void i();
}
