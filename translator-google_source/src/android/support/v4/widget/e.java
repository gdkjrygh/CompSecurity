// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v4.widget:
//            f, i, g, h

public final class e
{

    private static final h a;

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
        int j = android.os.Build.VERSION.SDK_INT;
        if (j >= 23)
        {
            a = new f();
        } else
        if (j >= 21)
        {
            a = new i();
        } else
        {
            a = new g();
        }
    }
}
