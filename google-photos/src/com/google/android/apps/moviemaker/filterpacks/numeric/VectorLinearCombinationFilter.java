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
import android.util.Log;

public class VectorLinearCombinationFilter extends ahn
{

    private static final String COEFFICIENT_A_INPUT_PORT = "coefficientA";
    private static final String COEFFICIENT_B_INPUT_PORT = "coefficientB";
    private static final String TAG = com/google/android/apps/moviemaker/filterpacks/numeric/VectorLinearCombinationFilter.getSimpleName();
    private static final String VECTOR_A_INPUT_PORT = "vectorA";
    private static final String VECTOR_B_INPUT_PORT = "vectorB";
    private static final String VECTOR_OUTPUT_PORT = "vector";
    private int mCoefficientA;
    private int mCoefficientB;

    public VectorLinearCombinationFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mCoefficientA = 1;
        mCoefficientB = 1;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(Integer.TYPE);
        aif aif2 = aif.b(java/lang/Long);
        return (new ajw()).a("vectorA", 2, aif2).a("vectorB", 2, aif2).a("coefficientA", 1, aif1).a("coefficientB", 1, aif1).b("vector", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("coefficientA"))
        {
            ajo1.a("mCoefficientA");
            ajo1.g = true;
            ajo1.f = false;
        }
        if (ajo1.b.equals("coefficientB"))
        {
            ajo1.a("mCoefficientB");
            ajo1.g = true;
            ajo1.f = false;
        }
    }

    protected final void e()
    {
        Object obj = a("vectorA");
        Object obj1 = a("vectorB");
        obj = ((ajo) (obj)).a();
        obj1 = ((ajo) (obj1)).a();
        long al1[] = (long[])((ahs) (obj)).d().m();
        long al2[] = (long[])((ahs) (obj1)).d().m();
        if (al1.length != al2.length)
        {
            Log.w(TAG, "The length of vector A doesn't match the length of vectorB.");
            return;
        }
        long al[] = new long[al1.length];
        for (int i = 0; i < al.length; i++)
        {
            al[i] = (long)mCoefficientA * al1[i] + (long)mCoefficientB * al2[i];
        }

        aju aju1 = b("vector");
        aig aig1 = aju1.a(null).d();
        aig1.a(al);
        aig1.a(((ahs) (obj)).c());
        aju1.a(aig1);
    }

}
