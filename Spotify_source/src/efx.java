// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Set;

public final class efx
{

    public final ebb a;
    public final Set b = new HashSet();

    public efx(ebb ebb)
    {
        a = ebb;
    }

    public final boolean a()
    {
        return b.contains("com.google.android.projection.gearhead") || b.contains("com.google.android.mediasimulator") || b.contains("com.google.android.autosimulator") || b.contains("com.carconnectivity.mlmediaplayer");
    }
}
