// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;
import java.util.List;

public abstract class iph
{

    public final long c;
    public final Interpolator d;
    public final boolean e;

    public iph(long l, Interpolator interpolator, boolean flag)
    {
        c = l;
        d = interpolator;
        e = flag;
    }

    public abstract List a();
}
