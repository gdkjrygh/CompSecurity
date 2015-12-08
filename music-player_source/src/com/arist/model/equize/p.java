// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;


// Referenced classes of package com.arist.model.equize:
//            VisualizerView

final class p
    implements Runnable
{

    final VisualizerView a;

    p(VisualizerView visualizerview)
    {
        a = visualizerview;
        super();
    }

    public final void run()
    {
        a.postInvalidate();
        a.postDelayed(this, 100L);
    }
}
