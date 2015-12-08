// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.numeric;

import ahn;
import ahs;
import aht;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class ThresholdFilter extends ahn
{

    private int mThreshold;

    public ThresholdFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mThreshold = 480;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(102);
        aif aif2 = aif.a(Integer.TYPE);
        aif aif3 = aif.a(Float.TYPE);
        return (new ajw()).a("values", 2, aif1).a("threshold", 1, aif2).b("ratio", 2, aif3).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("threshold"))
        {
            ajo1.a("mThreshold");
            ajo1.g = true;
        }
    }

    protected final void e()
    {
        int j = 0;
        Object obj = a("values").a().f();
        Object obj1 = ((aht) (obj)).a(1).asIntBuffer();
        int i = 0;
        while (((IntBuffer) (obj1)).hasRemaining()) 
        {
            if (((IntBuffer) (obj1)).get() > mThreshold)
            {
                i++;
            } else
            {
                j++;
            }
        }
        ((aht) (obj)).k();
        obj = b("ratio");
        obj1 = ((aju) (obj)).a(null).d();
        ((aig) (obj1)).a(Float.valueOf((float)i / (float)(j + i)));
        ((aju) (obj)).a(((ahs) (obj1)));
    }
}
