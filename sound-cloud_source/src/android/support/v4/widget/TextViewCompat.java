// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//            TextViewCompatJbMr1, TextViewCompatJbMr2

public class TextViewCompat
{
    static class BaseTextViewCompatImpl
        implements TextViewCompatImpl
    {

        public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
        {
            textview.setCompoundDrawables(drawable, drawable1, drawable2, drawable3);
        }

        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(i, j, k, l);
        }

        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
        }

        BaseTextViewCompatImpl()
        {
        }
    }

    static class JbMr1TextViewCompatImpl extends BaseTextViewCompatImpl
    {

        public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
        {
            TextViewCompatJbMr1.setCompoundDrawablesRelative(textview, drawable, drawable1, drawable2, drawable3);
        }

        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
        {
            TextViewCompatJbMr1.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, i, j, k, l);
        }

        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
        {
            TextViewCompatJbMr1.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, drawable, drawable1, drawable2, drawable3);
        }

        JbMr1TextViewCompatImpl()
        {
        }
    }

    static class JbMr2TextViewCompatImpl extends JbMr1TextViewCompatImpl
    {

        public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
        {
            TextViewCompatJbMr2.setCompoundDrawablesRelative(textview, drawable, drawable1, drawable2, drawable3);
        }

        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
        {
            TextViewCompatJbMr2.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, i, j, k, l);
        }

        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
        {
            TextViewCompatJbMr2.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, drawable, drawable1, drawable2, drawable3);
        }

        JbMr2TextViewCompatImpl()
        {
        }
    }

    static interface TextViewCompatImpl
    {

        public abstract void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3);

        public abstract void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l);

        public abstract void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3);
    }


    static final TextViewCompatImpl IMPL;

    private TextViewCompat()
    {
    }

    public static void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        IMPL.setCompoundDrawablesRelative(textview, drawable, drawable1, drawable2, drawable3);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
    {
        IMPL.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, i, j, k, l);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        IMPL.setCompoundDrawablesRelativeWithIntrinsicBounds(textview, drawable, drawable1, drawable2, drawable3);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 18)
        {
            IMPL = new JbMr2TextViewCompatImpl();
        } else
        if (i >= 17)
        {
            IMPL = new JbMr1TextViewCompatImpl();
        } else
        {
            IMPL = new BaseTextViewCompatImpl();
        }
    }
}
