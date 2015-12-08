// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.List;

final class fsw
    implements Runnable
{

    private fsv a;

    fsw(fsv fsv1)
    {
        a = fsv1;
        super();
    }

    public final void run()
    {
        a.a(ftk.d);
        fsv.a(a).setFloatValues(new float[] {
            ((Float)fsv.a(a).getAnimatedValue()).floatValue(), 0.0F
        });
        fsv.a(a).setDuration(150L);
        fsv.a(a).start();
        fsv.b(a).a(150L);
        Object obj = fsv.c(a);
        fsv fsv1 = a;
        for (obj = ((ftj) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); ((ftd)((Iterator) (obj)).next()).ap_()) { }
    }
}
