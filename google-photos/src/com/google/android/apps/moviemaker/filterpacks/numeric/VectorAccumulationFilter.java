// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.numeric;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import java.util.Arrays;

public class VectorAccumulationFilter extends ahn
{

    private static final String VECTOR_INPUT_PORT = "input";
    private static final String VECTOR_OUTPUT_PORT = "output";
    public long mCumulativeVector[];

    public VectorAccumulationFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.b(java/lang/Long);
        return (new ajw()).a("input", 2, aif1).b("output", 2, aif1).a();
    }

    protected final void e()
    {
        int i = 0;
        ahs ahs1 = a("input").a();
        Object obj1 = (long[])ahs1.d().m();
        long al[] = mCumulativeVector;
        Object obj;
        if (al == null)
        {
            obj = Arrays.copyOf(((long []) (obj1)), obj1.length);
        } else
        {
            if (obj1.length != al.length)
            {
                throw new IllegalStateException(String.format("Unexpected vector length - the current vector's length is %d while the previous cumulative vector's length is %d.", new Object[] {
                    Integer.valueOf(obj1.length), Integer.valueOf(al.length)
                }));
            }
            obj = new long[obj1.length];
            while (i < obj.length) 
            {
                obj[i] = obj1[i] + al[i];
                i++;
            }
        }
        mCumulativeVector = ((long []) (obj));
        obj = b("output");
        obj1 = ((aju) (obj)).a(null).d();
        ((aig) (obj1)).a(mCumulativeVector);
        ((aig) (obj1)).a(ahs1.c());
        ((aju) (obj)).a(((ahs) (obj1)));
    }

    protected final void f()
    {
        mCumulativeVector = null;
    }
}
