// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

public final class azm
    implements azp
{

    private final azp a;
    private final int b;

    public azm(azp azp1, int i)
    {
        a = azp1;
        b = i;
    }

    public final boolean a(Object obj, azq azq1)
    {
        obj = (Drawable)obj;
        Drawable drawable = azq1.b();
        if (drawable != null)
        {
            obj = new TransitionDrawable(new Drawable[] {
                drawable, obj
            });
            ((TransitionDrawable) (obj)).setCrossFadeEnabled(true);
            ((TransitionDrawable) (obj)).startTransition(b);
            azq1.d(((Drawable) (obj)));
            return true;
        } else
        {
            a.a(obj, azq1);
            return false;
        }
    }
}
