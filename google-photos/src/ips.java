// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

public final class ips extends iph
{

    private static final List h;
    public final int a;
    public final int b;
    public final int f;
    public final int g;

    public ips(long l, Interpolator interpolator, boolean flag, int i, int j, int k, 
            int i1)
    {
        super(l, interpolator, flag);
        a = i;
        b = j;
        f = k;
        g = i1;
    }

    public final List a()
    {
        return h;
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        h = arraylist;
        arraylist.add("translationX");
        h.add("translationY");
    }
}
