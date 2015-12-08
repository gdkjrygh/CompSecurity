// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;

public final class bhn
    implements Runnable
{

    public long a;
    public float b;
    public float c;
    public PipelineParams d;
    public final CropOverlayView e;

    public bhn(CropOverlayView cropoverlayview)
    {
        e = cropoverlayview;
        super();
        a = 0L;
        b = 0.0F;
        c = 0.0F;
    }

    public final void run()
    {
        float f = Math.min(1.0F, (float)(System.currentTimeMillis() - a) / 200F);
        float f1 = CropOverlayView.z(e).getInterpolation(f);
        f = (1.0F - f1) * b + c * f1;
        if (f1 >= 0.999F)
        {
            f = c;
        }
        e.a(f, d, CropOverlayView.f(e).f().ruleOfThirdsOpacity);
        if (f1 < 0.999F)
        {
            CropOverlayView.L(e).postDelayed(this, 25L);
        }
    }
}
