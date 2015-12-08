// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.photos.daydream.DreamViewFlipper;
import java.util.List;

public final class ezr
    implements Runnable
{

    private DreamViewFlipper a;

    public ezr(DreamViewFlipper dreamviewflipper)
    {
        a = dreamviewflipper;
        super();
    }

    public final void run()
    {
        if (!DreamViewFlipper.a(a))
        {
            return;
        }
        android.widget.ImageView imageview = DreamViewFlipper.e(a);
        DreamViewFlipper.a(a, DreamViewFlipper.f(a));
        DreamViewFlipper.b(a, imageview);
        DreamViewFlipper.g(a);
        if (DreamViewFlipper.h(a) < DreamViewFlipper.i(a).size())
        {
            DreamViewFlipper.c(a, DreamViewFlipper.f(a));
            DreamViewFlipper.k(a).postDelayed(DreamViewFlipper.j(a), 4000L);
            return;
        } else
        {
            DreamViewFlipper.k(a).postDelayed(DreamViewFlipper.l(a), 4000L);
            return;
        }
    }
}
