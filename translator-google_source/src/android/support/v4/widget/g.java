// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v4.widget:
//            h, j, ce

class g
    implements h
{

    g()
    {
    }

    public Drawable a(CompoundButton compoundbutton)
    {
        return j.a(compoundbutton);
    }

    public void a(CompoundButton compoundbutton, ColorStateList colorstatelist)
    {
        if (compoundbutton instanceof ce)
        {
            ((ce)compoundbutton).setSupportButtonTintList(colorstatelist);
        }
    }

    public void a(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
    {
        if (compoundbutton instanceof ce)
        {
            ((ce)compoundbutton).setSupportButtonTintMode(mode);
        }
    }
}
