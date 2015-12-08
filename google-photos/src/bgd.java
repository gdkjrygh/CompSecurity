// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;

final class bgd
    implements Runnable
{

    private final Handler a;
    private final bdo b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final long i = System.currentTimeMillis();
    private final long j;

    bgd(Handler handler, bdo bdo1, long l, float f1, float f2, float f3, 
            float f4, float f5, float f6)
    {
        a = handler;
        b = bdo1;
        c = f1;
        d = f2;
        e = f3;
        f = f4;
        g = f5;
        h = f6;
        j = i + 300L;
    }

    public final void run()
    {
        float f1 = 0.0F;
        float f2 = (float)(System.currentTimeMillis() - i) / (float)(j - i);
        PipelineParams pipelineparams;
        if (f2 >= 0.0F)
        {
            if (f2 > 1.0F)
            {
                f1 = 1.0F;
            } else
            {
                f1 = f2;
            }
        }
        f1 = bgb.a.getInterpolation(f1);
        pipelineparams = b.f();
        pipelineparams.zoomCenterX = (1.0F - f1) * c + f * f1;
        pipelineparams.zoomCenterY = (1.0F - f1) * d + g * f1;
        pipelineparams.zoomScale = (1.0F - f1) * e + h * f1;
        b.a(pipelineparams);
        if (f1 < 1.0F)
        {
            a.postDelayed(this, 15L);
        }
    }
}
