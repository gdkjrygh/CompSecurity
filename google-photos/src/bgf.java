// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;

public final class bgf
    implements Runnable
{

    private final msy a = new msy(0.0F, 0.0F, 0.6F, 1.0F);
    private final PipelineParams b;
    private final PipelineParams c;
    private final long d = System.currentTimeMillis();
    private final bdo e;
    private final Handler f;

    public bgf(PipelineParams pipelineparams, PipelineParams pipelineparams1, bdo bdo1, Handler handler)
    {
        b = pipelineparams;
        c = pipelineparams1;
        e = bdo1;
        f = handler;
    }

    public final void run()
    {
        float f1 = Math.min(1.0F, (float)(System.currentTimeMillis() - d) / 150F);
        f1 = a.getInterpolation(f1);
        PipelineParams pipelineparams = e.f();
        if (f1 < 0.999F)
        {
            pipelineparams.ruleOfThirdsOpacity = c.ruleOfThirdsOpacity * f1 + b.ruleOfThirdsOpacity * (1.0F - f1);
        } else
        {
            pipelineparams.ruleOfThirdsOpacity = c.ruleOfThirdsOpacity;
        }
        e.a(pipelineparams);
        if (f1 < 0.999F)
        {
            f.postDelayed(this, 25L);
        }
    }
}
