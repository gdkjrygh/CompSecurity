// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.effect.Effect;
import android.media.effect.EffectUpdateListener;
import androidx.media.filterpacks.face.FaceTrackerFilter;

public final class akw
    implements EffectUpdateListener
{

    private FaceTrackerFilter a;

    public akw(FaceTrackerFilter facetrackerfilter)
    {
        a = facetrackerfilter;
        super();
    }

    public final void onEffectUpdated(Effect effect, Object obj)
    {
        synchronized (a)
        {
            FaceTrackerFilter.a(a, (android.hardware.Camera.Face[])obj);
        }
        return;
        obj;
        effect;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
