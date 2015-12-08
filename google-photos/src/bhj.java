// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

public final class bhj
    implements Runnable
{

    private CropOverlayView a;

    public bhj(CropOverlayView cropoverlayview)
    {
        a = cropoverlayview;
        super();
    }

    public final void run()
    {
        if (CropOverlayView.a(a) != -1 && CropOverlayView.a(a) == -2)
        {
            CropOverlayView.a(a, CropOverlayView.b(a).x, CropOverlayView.b(a).y, true);
            CropOverlayView.c(a).postDelayed(this, 25L);
        }
    }
}
