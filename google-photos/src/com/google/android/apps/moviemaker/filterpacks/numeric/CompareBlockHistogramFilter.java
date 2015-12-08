// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.numeric;

import ahn;
import ahs;
import aht;
import ahu;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public class CompareBlockHistogramFilter extends ahn
{

    public CompareBlockHistogramFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private native float compareHistograms(IntBuffer intbuffer, IntBuffer intbuffer1, int i, IntBuffer intbuffer2);

    public final ajw b()
    {
        aif aif1 = aif.b(102);
        aif aif2 = aif.a(102);
        return (new ajw()).a("histograms1", 2, aif1).a("histograms2", 2, aif1).b("values", 2, aif2).a();
    }

    protected final void e()
    {
        ahs ahs1 = a("histograms1").a();
        ahs ahs2 = a("histograms2").a();
        ahu ahu1 = ahs1.g();
        ahu ahu2 = ahs2.g();
        if (ahs1 == ahs2)
        {
            return;
        }
        if (ahu1.m() != ahu2.m())
        {
            throw new RuntimeException("Can only compare an equal number of histograms");
        } else
        {
            aht aht1 = b("values").a(new int[] {
                ahu1.m()
            }).f();
            IntBuffer intbuffer = ahu1.a(1).asIntBuffer();
            IntBuffer intbuffer1 = ahu2.a(1).asIntBuffer();
            Object obj = aht1.a(2);
            ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
            obj = ((ByteBuffer) (obj)).asIntBuffer();
            compareHistograms(intbuffer, intbuffer1, ahu1.m(), ((IntBuffer) (obj)));
            ahu1.k();
            ahu2.k();
            aht1.k();
            b("values").a(aht1);
            return;
        }
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
