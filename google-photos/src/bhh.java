// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

public final class bhh
    implements Runnable
{

    private final float a;
    private final float b;
    private final long c;
    private final long d;
    private long e;
    private CropOverlayView f;

    public bhh(CropOverlayView cropoverlayview, float f1, float f2)
    {
        f = cropoverlayview;
        super();
        a = f1;
        b = f2;
        long l;
        if (f1 < f2)
        {
            l = 75L;
        } else
        {
            l = 800L;
        }
        c = l;
        d = c / 100L;
    }

    public final void a()
    {
        CropOverlayView.K(f).removeCallbacksAndMessages(null);
        e = System.currentTimeMillis();
        CropOverlayView.K(f).postDelayed(this, 25L);
    }

    public final void run()
    {
        float f2 = (float)(System.currentTimeMillis() - e) / (float)c;
        float f1 = f2;
        if (a > b)
        {
            f1 = Math.min(1.0F, Math.max(0.0F, f2 * 5F - 4F));
        }
        PipelineParams pipelineparams = CropOverlayView.f(f).f();
        pipelineparams.bannerOpacity = b * f1 + (1.0F - f1) * a;
        if (f1 >= 0.999F)
        {
            pipelineparams.bannerOpacity = b;
            CropOverlayView.f(f).q = false;
        }
        CropOverlayView.f(f).a(pipelineparams);
        if (f1 < 0.999F)
        {
            CropOverlayView.K(f).postDelayed(this, d);
        }
    }
}
