// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

public final class s
{
    static class a
        implements d
    {

        public void a(TextView textview, Drawable drawable)
        {
            textview.setCompoundDrawables(drawable, null, null, null);
        }

        a()
        {
        }
    }

    static class b extends a
    {

        public void a(TextView textview, Drawable drawable)
        {
            Drawable drawable1;
            boolean flag;
            if (textview.getLayoutDirection() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                drawable1 = null;
            } else
            {
                drawable1 = drawable;
            }
            if (!flag)
            {
                drawable = null;
            }
            textview.setCompoundDrawables(drawable1, null, drawable, null);
        }

        b()
        {
        }
    }

    static final class c extends b
    {

        public final void a(TextView textview, Drawable drawable)
        {
            textview.setCompoundDrawablesRelative(drawable, null, null, null);
        }

        c()
        {
        }
    }

    static interface d
    {

        public abstract void a(TextView textview, Drawable drawable);
    }


    static final d a;

    public static void a(TextView textview, Drawable drawable)
    {
        a.a(textview, drawable);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 18)
        {
            a = new c();
        } else
        if (i >= 17)
        {
            a = new b();
        } else
        {
            a = new a();
        }
    }
}
