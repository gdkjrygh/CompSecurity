// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.histogram;

import ahn;
import ahs;
import aif;
import aih;
import ajo;
import ajr;
import aju;
import ajw;

public final class UniformHistogramSource extends ahn
{

    private int mNumBins;

    public UniformHistogramSource(ajr ajr, String s)
    {
        super(ajr, s);
        mNumBins = 50;
    }

    public final void a(ajo ajo1)
    {
        if (ajo1.b.equals("binsize"))
        {
            ajo1.a("mNumBins");
            ajo1.g = true;
        }
    }

    public final ajw b()
    {
        return (new ajw()).a("binsize", 1, aif.b(Integer.TYPE)).b("histogram", 2, aif.b(Integer.TYPE)).a();
    }

    protected final void c()
    {
    }

    protected final void e()
    {
        int ai[] = new int[mNumBins];
        for (int i = 0; i < mNumBins; i++)
        {
            ai[i] = 1;
        }

        aju aju1 = b("histogram");
        aih aih1 = aju1.a(null).e();
        aih1.b(ai);
        aju1.a(aih1);
    }
}
