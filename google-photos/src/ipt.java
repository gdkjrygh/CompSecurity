// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

public final class ipt extends iph
{

    private static final List a;

    public ipt(long l, Interpolator interpolator, boolean flag)
    {
        super(l, interpolator, flag);
    }

    public final List a()
    {
        return a;
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        a = arraylist;
        arraylist.add("verticalFold");
    }
}
