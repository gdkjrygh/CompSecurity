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
import java.nio.FloatBuffer;

public class ColorCorrelationMatrixFilter extends ahn
{

    private static final boolean SAVE_TO_MATLAB = false;

    public ColorCorrelationMatrixFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    private native void computeColorCorrelationMatrix(ByteBuffer bytebuffer, int i, int j, FloatBuffer floatbuffer);

    public final ajw b()
    {
        aif aif1 = aif.a(301, 1);
        aif aif2 = aif.b(200);
        return (new ajw()).a("input", 2, aif1).b("colorCorrelationMatrix", 2, aif2).a();
    }

    protected final void e()
    {
        ahu ahu1 = a("input").a().g();
        ahu ahu2 = b("colorCorrelationMatrix").a(new int[] {
            4, 3
        }).g();
        ByteBuffer bytebuffer = ahu1.a(1);
        Object obj = ahu2.a(2);
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        obj = ((ByteBuffer) (obj)).asFloatBuffer();
        computeColorCorrelationMatrix(bytebuffer, ahu1.m(), ahu1.n(), ((FloatBuffer) (obj)));
        ahu1.k();
        ahu2.k();
        b("colorCorrelationMatrix").a(ahu2);
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
