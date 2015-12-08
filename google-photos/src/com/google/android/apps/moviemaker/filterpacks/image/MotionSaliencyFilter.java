// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.image;

import ahn;
import ahs;
import ahu;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class MotionSaliencyFilter extends ahn
{

    private static final String BLOCK_SIZE_PORT = "blocksize";
    private static final String INPUT_PORT = "image";
    private static final String MAP_PORT = "map";
    private static final String SCORE_PORT = "score";
    private int mBlockSize;
    private ahs mPreviousFrame;

    public MotionSaliencyFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mBlockSize = 10;
    }

    private native float computeMotionSaliency(int i, int j, int k, ByteBuffer bytebuffer, ByteBuffer bytebuffer1, FloatBuffer floatbuffer);

    public final ajw b()
    {
        aif aif1 = aif.a(100, 1);
        aif aif2 = aif.b(200);
        return (new ajw()).a("image", 2, aif1).a("blocksize", 1, aif.a(Integer.TYPE)).b("score", 2, aif.a(Float.TYPE)).b("map", 1, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("blocksize"))
        {
            ajo1.a("mBlockSize");
            ajo1.g = true;
        }
    }

    protected final void e()
    {
        ahs ahs1 = a("image").a();
        int ai[] = ahs1.l();
        if (mPreviousFrame != null)
        {
            int i = ai[0] / mBlockSize;
            int j = ai[1] / mBlockSize;
            ByteBuffer bytebuffer = ahs1.g().a(1);
            ByteBuffer bytebuffer1 = mPreviousFrame.g().a(1);
            aju aju1 = b("map");
            float f;
            Object obj;
            Object obj1;
            if (aju1 != null)
            {
                obj1 = aju1.a(new int[] {
                    i, j
                }).g();
                obj = ((ahu) (obj1)).a(2);
                ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
                obj = ((ByteBuffer) (obj)).asFloatBuffer();
            } else
            {
                obj = null;
                obj1 = null;
            }
            f = computeMotionSaliency(ai[0], ai[1], mBlockSize, bytebuffer, bytebuffer1, ((FloatBuffer) (obj)));
            if (aju1 != null)
            {
                ((ahu) (obj1)).k();
                aju1.a(((ahs) (obj1)));
            }
            mPreviousFrame.k();
            ahs1.k();
            mPreviousFrame.i();
            obj = b("score");
            obj1 = ((aju) (obj)).a(null).d();
            ((aig) (obj1)).a(Float.valueOf(f));
            ((aju) (obj)).a(((ahs) (obj1)));
        }
        mPreviousFrame = ahs1.j();
    }

    protected final void g()
    {
        if (mPreviousFrame != null)
        {
            mPreviousFrame.i();
            mPreviousFrame = null;
        }
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }
}
