// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

class TextViewCompatJbMr1
{

    TextViewCompatJbMr1()
    {
    }

    public static void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        Drawable drawable4;
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
            drawable4 = drawable2;
        } else
        {
            drawable4 = drawable;
        }
        if (!flag)
        {
            drawable = drawable2;
        }
        textview.setCompoundDrawables(drawable4, drawable1, drawable, drawable3);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
    {
        boolean flag;
        int i1;
        if (textview.getLayoutDirection() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i1 = k;
        } else
        {
            i1 = i;
        }
        if (!flag)
        {
            i = k;
        }
        textview.setCompoundDrawablesWithIntrinsicBounds(i1, j, i, l);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        Drawable drawable4;
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
            drawable4 = drawable2;
        } else
        {
            drawable4 = drawable;
        }
        if (!flag)
        {
            drawable = drawable2;
        }
        textview.setCompoundDrawablesWithIntrinsicBounds(drawable4, drawable1, drawable, drawable3);
    }
}
