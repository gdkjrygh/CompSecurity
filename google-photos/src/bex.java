// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;

final class bex
    implements Runnable
{

    long a;
    final bem b;
    private int c;

    bex(bem bem1)
    {
        b = bem1;
        super();
        a = 0L;
        c = 0;
    }

    private static PointF a(float f)
    {
        float f1 = 3F * f * f - f * 2.0F * f * f;
        f = (f1 - 0.5F) * 3.141593F * 4.5F;
        f1 = Math.abs(f1 * 2.0F - 1.0F);
        f1 = (f1 * (f1 * f1 * f1)) / 1.6F + 0.25F;
        return new PointF((float)Math.sin(f) * f1 + 0.5F, 0.5F - f1 * (float)Math.cos(f) * 0.5F);
    }

    public final void run()
    {
        PipelineParams pipelineparams = bem.n(b).f();
        float f = Math.min(1.0F, Math.max(0.0F, (float)(System.currentTimeMillis() - a) / 10000F));
        if (f >= 0.999F)
        {
            pipelineparams.easterEggShow = false;
        } else
        {
            PointF pointf = a(f);
            PointF pointf1 = a(f + 0.0025F);
            pipelineparams.easterEggShow = true;
            pipelineparams.easterEggX = pointf.x;
            pipelineparams.easterEggY = pointf.y;
            pipelineparams.easterEggAngle = (float)Math.atan2(pointf.x - pointf1.x, pointf.y - pointf1.y);
            pipelineparams.easterEggFrame = c / 3;
            c = (c + 1) % 24;
            bem.K(b).postDelayed(this, 25L);
        }
        bem.n(b).a(pipelineparams);
    }
}
