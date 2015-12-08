// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.numeric;

import ahn;
import ahs;
import ahu;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public class BlockHistogramFilter extends ahn
{

    private static final int NUM_BINS = 255;
    int mNumColumns;
    int mNumRows;

    public BlockHistogramFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mNumRows = 3;
        mNumColumns = 12;
    }

    private native float computeBlockHistogram(ByteBuffer bytebuffer, int i, int j, int k, IntBuffer intbuffer);

    public ajw b()
    {
        aif aif1 = aif.b(100);
        aif aif2 = aif.b(102);
        return (new ajw()).a("input", 2, aif1).a("rows", 1, aif.a(Integer.TYPE)).a("cols", 1, aif.a(Integer.TYPE)).b("histograms", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("rows"))
        {
            ajo1.a("mNumRows");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("cols"))
        {
            ajo1.a("mNumColumns");
            ajo1.g = true;
            return;
        }
    }

    protected final void e()
    {
        ahu ahu1 = a("input").a().g();
        ahu ahu2 = b("histograms").a(new int[] {
            mNumRows * mNumColumns, 255
        }).g();
        ByteBuffer bytebuffer = ahu1.a(1);
        Object obj = ahu2.a(2);
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        obj = ((ByteBuffer) (obj)).asIntBuffer();
        computeBlockHistogram(bytebuffer, ahu1.m(), mNumRows, mNumColumns, ((IntBuffer) (obj)));
        ahu1.k();
        ahu2.k();
        b("histograms").a(ahu2);
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
