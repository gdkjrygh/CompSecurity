// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import com.kik.scan.KikCode;
import kik.android.util.cv;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment, h

final class g
    implements Runnable
{

    final KikCode a;
    final ScanFragment b;

    g(ScanFragment scanfragment, KikCode kikcode)
    {
        b = scanfragment;
        a = kikcode;
        super();
    }

    public final void run()
    {
        cv.b(new View[] {
            b._animationContainer
        });
        ObjectAnimator objectanimator = ObjectAnimator.ofObject(b._animationContainer, "backgroundColor", new ArgbEvaluator(), new Object[] {
            Integer.valueOf(0xff000000), Integer.valueOf(Color.argb(179, 0, 0, 0))
        }).setDuration(300L);
        objectanimator.addListener(new h(this));
        objectanimator.start();
    }
}
