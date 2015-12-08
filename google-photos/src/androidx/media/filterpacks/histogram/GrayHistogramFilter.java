// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.histogram;

import ahn;
import ahs;
import ahv;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public final class GrayHistogramFilter extends ahn
{

    private boolean mHasMask;
    private int mNumBins;

    public GrayHistogramFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mNumBins = 50;
        mHasMask = false;
    }

    private static native void extractHistogram(ByteBuffer bytebuffer, ByteBuffer bytebuffer1, IntBuffer intbuffer);

    public final void a(ajo ajo1)
    {
        if (ajo1.b.equals("mask"))
        {
            mHasMask = true;
        } else
        if (ajo1.b.equals("binsize"))
        {
            ajo1.a("mNumBins");
            ajo1.g = true;
            return;
        }
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 1);
        return (new ajw()).a("image", 2, aif1).a("mask", 1, aif1).a("binsize", 1, aif.b(Integer.TYPE)).b("histogram", 2, aif.b(Integer.TYPE)).a();
    }

    protected final void e()
    {
        Object obj2 = a("image").a().h();
        Object obj;
        Object obj1;
        IntBuffer intbuffer;
        ByteBuffer bytebuffer;
        if (mHasMask)
        {
            obj = a("mask").a().h();
        } else
        {
            obj = null;
        }
        obj1 = ByteBuffer.allocateDirect(mNumBins << 2);
        ((ByteBuffer) (obj1)).order(ByteOrder.nativeOrder());
        intbuffer = ((ByteBuffer) (obj1)).asIntBuffer();
        bytebuffer = ((ahv) (obj2)).a(1);
        if (mHasMask)
        {
            obj1 = ((ahv) (obj)).a(1);
        } else
        {
            obj1 = null;
        }
        extractHistogram(bytebuffer, ((ByteBuffer) (obj1)), intbuffer);
        bytebuffer.rewind();
        ((ahv) (obj2)).k();
        if (mHasMask)
        {
            ((ByteBuffer) (obj1)).rewind();
            ((ahv) (obj)).k();
        }
        intbuffer.rewind();
        obj = new int[mNumBins];
        for (int i = 0; i < mNumBins; i++)
        {
            obj[i] = intbuffer.get();
        }

        obj1 = b("histogram");
        obj2 = ((aju) (obj1)).a(null).e();
        ((aig) (obj2)).a(obj);
        ((aju) (obj1)).a(((ahs) (obj2)));
    }

    static 
    {
        System.loadLibrary("filterframework_jni");
    }
}
