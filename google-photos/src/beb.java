// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.TextView;
import java.util.List;

final class beb
    implements Runnable
{

    long a;
    private final msy b = new msy(0.52F, 0.3F, 0.12F, 1.0F);
    private final TextView c;
    private final Handler d;
    private final List e;

    beb(bdx bdx, TextView textview, Handler handler, List list)
    {
        c = textview;
        d = handler;
        e = list;
    }

    public final void run()
    {
        float f = (float)(System.currentTimeMillis() - a) / 300F;
        f = b.getInterpolation(f);
        int i = Math.min(Math.round(36F * f), 35);
        c.setCompoundDrawablesWithIntrinsicBounds(null, (Drawable)e.get(i), null, null);
        if (f < 0.999F)
        {
            d.postDelayed(this, 10L);
        }
    }
}
