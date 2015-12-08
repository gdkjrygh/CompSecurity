// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.pager.ClippingImageView;

final class goi
    implements hyk
{

    private ekp a;
    private gog b;

    goi(gog gog1, ekp ekp)
    {
        b = gog1;
        a = ekp;
        super();
    }

    public final void a(View view)
    {
        if (gog.a(b) == null)
        {
            if (gog.b(b).a())
            {
                gog.b(b);
            }
            return;
        }
        goq goq1 = gog.a(b);
        ekp ekp = a;
        goq1.e = true;
        goq1.a(ekp, view);
        if (view != null)
        {
            view.setVisibility(4);
        }
        goq1.b.setPivotX((float)goq1.b.getWidth() / 2.0F);
        goq1.b.setPivotY((float)goq1.b.getHeight() / 2.0F);
        goq1.b(gpb.b);
        goq1.r();
    }
}
