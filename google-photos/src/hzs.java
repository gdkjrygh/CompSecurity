// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;

final class hzs
    implements Runnable
{

    private hzr a;

    hzs(hzr hzr1)
    {
        a = hzr1;
        super();
    }

    public final void run()
    {
        ImageView imageview = (ImageView)hzr.a(a).findViewById(p.aA).findViewById(p.aC);
        if (imageview != null)
        {
            imageview.setImageResource(p.az);
        }
        hzr.a(a, null);
    }
}
