// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;

final class ith
    implements Runnable
{

    final itf a;

    ith(itf itf1)
    {
        a = itf1;
        super();
    }

    public final void run()
    {
        a.r();
        PointF pointf = itf.x(a);
        float f = pointf.x;
        float f1 = pointf.y;
        itf.a(a).animate().x(f).y(f1).setListener(new iti(this)).setDuration(500L).start();
    }
}
