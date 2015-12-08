// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

public final class ipg extends iph
{

    private static final List f;
    public final float a;
    public final float b;

    public ipg(long l, Interpolator interpolator, boolean flag, float f1, float f2)
    {
        super(l, interpolator, flag);
        a = f1;
        b = f2;
    }

    public final List a()
    {
        return f;
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        f = arraylist;
        arraylist.add("alpha");
    }
}
