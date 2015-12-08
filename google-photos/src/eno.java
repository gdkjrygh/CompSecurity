// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class eno
{

    public final hkl a;
    public enr b;
    public final enp c;
    public final ent d = new ent();
    public final Rect e = new Rect();
    public ens f;

    public eno(Context context, hkl hkl)
    {
        c = new enp(context);
        a = hkl;
    }

    public final void a()
    {
        enp enp1 = c;
        if (enp1.d != null)
        {
            enp1.d.setVisible(false, false);
        }
    }

    public final void b()
    {
        enp enp1 = c;
        if (enp1.f == null)
        {
            enp1.f = ObjectAnimator.ofInt(enp1.e, "alpha", new int[] {
                255, 0
            });
            enp1.f.setDuration(250L);
            enp1.f.addListener(new enq(enp1));
        }
        enp1.f.start();
    }
}
