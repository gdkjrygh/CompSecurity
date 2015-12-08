// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;

final class hzp
    implements Runnable
{

    private hzo a;

    hzp(hzo hzo1)
    {
        a = hzo1;
        super();
    }

    public final void run()
    {
        ImageView imageview = (ImageView)hzo.a(a).findViewById(p.aA).findViewById(p.aB);
        if (imageview != null)
        {
            hzo.a(a, new hzq(imageview, imageview.getDrawable()));
            imageview.setImageResource(p.ay);
        }
        hzo.a(a, null);
    }
}
