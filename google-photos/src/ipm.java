// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

public final class ipm extends iph
{

    private static final List h;
    public final float a;
    public final float b;
    public final float f;
    public final float g;

    public ipm(long l, Interpolator interpolator, boolean flag, float f1, float f2, float f3, 
            float f4)
    {
        super(l, interpolator, flag);
        a = f1;
        b = f3;
        f = f2;
        g = f4;
    }

    public final List a()
    {
        return h;
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        h = arraylist;
        arraylist.add("scaleX");
        h.add("scaleY");
    }
}
