// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;
import com.google.android.apps.moviemaker.ui.AspectRatioEnforcingFrameLayout;

public final class cfn extends Property
{

    private float a;
    private int b;
    private PlayerScreenFragment c;

    public cfn(PlayerScreenFragment playerscreenfragment, Class class1, String s)
    {
        c = playerscreenfragment;
        super(class1, s);
        a = 0.0F;
    }

    public final Object get(Object obj)
    {
        return Float.valueOf(a);
    }

    public final void set(Object obj, Object obj1)
    {
        obj = (Float)obj1;
        if (b == 0)
        {
            b = c.g().getDimensionPixelSize(b.dB);
        }
        a = ((Float) (obj)).floatValue();
        if (((Float) (obj)).floatValue() > 0.5F)
        {
            float f = dac.a.getInterpolation(((Float) (obj)).floatValue() * 2.0F - 1.0F);
            PlayerScreenFragment.f(c).setTranslationY(b);
            PlayerScreenFragment.f(c).setAlpha(0.0F);
            PlayerScreenFragment.l(c).setAlpha(1.0F - f);
            if (PlayerScreenFragment.m(c) != null)
            {
                PlayerScreenFragment.m(c).setAlpha(1.0F - f);
            }
        } else
        {
            float f1 = dac.a.getInterpolation(((Float) (obj)).floatValue() * 2.0F);
            PlayerScreenFragment.f(c).setTranslationY((float)b * f1);
            PlayerScreenFragment.f(c).setAlpha(1.0F - f1);
            PlayerScreenFragment.l(c).setAlpha(1.0F);
            if (PlayerScreenFragment.m(c) != null)
            {
                PlayerScreenFragment.m(c).setAlpha(1.0F);
                return;
            }
        }
    }
}
