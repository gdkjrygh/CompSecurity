// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.transform;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import ajz;
import b;

public class GridFilter extends ahn
{

    private int mOutputHeight;
    private int mOutputWidth;
    private ajl mShader;
    private ahv mTileFrame;
    private boolean mUseMipmaps;
    private int mXCount;
    private int mYCount;

    public GridFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mXCount = 1;
        mYCount = 1;
        mOutputWidth = 0;
        mOutputHeight = 0;
        mUseMipmaps = true;
        mTileFrame = null;
    }

    private static void a(ahv ahv1, int i, int j)
    {
        ahv1.o().b(i, 10497);
        ahv1.k();
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("xCount", 1, aif.a(Integer.TYPE)).a("yCount", 1, aif.a(Integer.TYPE)).a("useMipmaps", 1, aif.a(Boolean.TYPE)).a("outputWidth", 1, aif.a(Integer.TYPE)).a("outputHeight", 1, aif.a(Integer.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("xCount"))
        {
            ajo1.a("mXCount");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("yCount"))
            {
                ajo1.a("mYCount");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("useMipmaps"))
            {
                ajo1.a("mUseMipmaps");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("outputWidth"))
            {
                ajo1.a("mOutputWidth");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("outputHeight"))
            {
                ajo1.a("mOutputHeight");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void c()
    {
        mShader = ajl.a();
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv2 = a("image").a().h();
        int ai[] = ahv2.l();
        mTileFrame = b.a(mTileFrame, ai);
        a(mTileFrame, 10242, 10497);
        a(mTileFrame, 10243, 10497);
        mShader.a(0.0F, 0.0F, 1.0F, 1.0F);
        mShader.a(ahv2, mTileFrame);
        if (mUseMipmaps)
        {
            ahv ahv3 = mTileFrame;
            ahv3.o().c();
            ahv3.k();
        }
        int ai1[] = new int[2];
        ai1[0] = mOutputWidth;
        ai1[1] = mOutputHeight;
        if (ai1[0] <= 0)
        {
            ai1[0] = ai[0] * mXCount;
        }
        if (ai1[1] <= 0)
        {
            ai1[1] = ai[1] * mYCount;
        }
        ahv ahv1 = aju1.a(ai1).h();
        mShader.a(0.0F, 0.0F, mXCount, mYCount);
        mShader.a(mTileFrame, ahv1);
        aju1.a(ahv1);
    }

    protected final void f()
    {
        if (mTileFrame != null)
        {
            mTileFrame.i();
            mTileFrame = null;
        }
    }
}
