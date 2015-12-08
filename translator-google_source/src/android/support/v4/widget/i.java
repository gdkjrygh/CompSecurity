// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v4.widget:
//            g

class i extends g
{

    i()
    {
    }

    public final void a(CompoundButton compoundbutton, ColorStateList colorstatelist)
    {
        compoundbutton.setButtonTintList(colorstatelist);
    }

    public final void a(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
    {
        compoundbutton.setButtonTintMode(mode);
    }
}
