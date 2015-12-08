// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahn;
import ahs;
import ahv;
import aif;
import ajo;
import ajr;
import aju;
import ajv;
import ajw;
import android.opengl.GLES20;
import java.util.Arrays;

public class FixedColorSource extends ahn
{

    private float mColor[] = {
        0.0F, 0.0F, 0.0F, 1.0F
    };
    private int mHeight;
    private ahv mImageFrame;
    private aif mImageType;
    private float mLastColor[];
    private int mLastHeight;
    private int mLastWidth;
    private int mWidth;

    public FixedColorSource(ajr ajr, String s)
    {
        super(ajr, s);
        mLastColor = null;
        mWidth = 1;
        mHeight = 1;
        mLastWidth = 0;
        mLastHeight = 0;
        mImageType = null;
        mImageFrame = null;
    }

    public final ajw b()
    {
        mImageType = aif.a(301, 16);
        return (new ajw()).a("color", 1, aif.b(Float.TYPE)).a("width", 2, aif.a(Integer.TYPE)).a("height", 2, aif.a(Integer.TYPE)).b("image", 2, mImageType).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("color"))
        {
            ajo1.a("mColor");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("width"))
            {
                ajo1.a("mWidth");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("height"))
            {
                ajo1.a("mHeight");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void e()
    {
        aju aju1 = b("image");
        if (!Arrays.equals(mLastColor, mColor) || mWidth != mLastWidth || mHeight != mLastHeight)
        {
            int i = mWidth;
            int j = mHeight;
            if (mImageFrame != null)
            {
                mImageFrame.i();
            }
            mImageFrame = ahs.a(mImageType, new int[] {
                i, j
            }).h();
            mImageFrame.p().b();
            GLES20.glClearColor(mColor[0], mColor[1], mColor[2], mColor[3]);
            GLES20.glClear(16384);
            mImageFrame.k();
            mLastColor = mColor;
            mLastWidth = mWidth;
            mLastHeight = mHeight;
        }
        aju1.a(mImageFrame);
    }

    protected final void g()
    {
        if (mImageFrame != null)
        {
            mImageFrame.i();
        }
    }
}
