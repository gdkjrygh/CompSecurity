// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v4.widget:
//            d, t

public final class android.support.v4.widget.c
{
    static final class a extends d
    {

        public final Drawable a(CompoundButton compoundbutton)
        {
            return compoundbutton.getButtonDrawable();
        }

        a()
        {
        }
    }

    static class b
        implements c
    {

        public Drawable a(CompoundButton compoundbutton)
        {
            return android.support.v4.widget.d.a(compoundbutton);
        }

        public void a(CompoundButton compoundbutton, ColorStateList colorstatelist)
        {
            if (compoundbutton instanceof t)
            {
                ((t)compoundbutton).setSupportButtonTintList(colorstatelist);
            }
        }

        public void a(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
        {
            if (compoundbutton instanceof t)
            {
                ((t)compoundbutton).setSupportButtonTintMode(mode);
            }
        }

        b()
        {
        }
    }

    static interface c
    {

        public abstract Drawable a(CompoundButton compoundbutton);

        public abstract void a(CompoundButton compoundbutton, ColorStateList colorstatelist);

        public abstract void a(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode);
    }

    static class d extends b
    {

        public final void a(CompoundButton compoundbutton, ColorStateList colorstatelist)
        {
            compoundbutton.setButtonTintList(colorstatelist);
        }

        public final void a(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
        {
            compoundbutton.setButtonTintMode(mode);
        }

        d()
        {
        }
    }


    private static final c a;

    public static Drawable a(CompoundButton compoundbutton)
    {
        return a.a(compoundbutton);
    }

    public static void a(CompoundButton compoundbutton, ColorStateList colorstatelist)
    {
        a.a(compoundbutton, colorstatelist);
    }

    public static void a(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
    {
        a.a(compoundbutton, mode);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 23)
        {
            a = new a();
        } else
        if (i >= 21)
        {
            a = new d();
        } else
        {
            a = new b();
        }
    }
}
