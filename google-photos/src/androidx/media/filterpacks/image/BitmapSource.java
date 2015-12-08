// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahn;
import ahs;
import ahv;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import android.graphics.Bitmap;

public class BitmapSource extends ahn
{

    private boolean mAlwaysRead;
    private ahv mImageFrame;
    private aif mImageType;
    private Bitmap mLastBitmap;
    private long mTimestamp;

    public BitmapSource(ajr ajr, String s)
    {
        super(ajr, s);
        mLastBitmap = null;
        mImageType = null;
        mImageFrame = null;
        mAlwaysRead = false;
        mTimestamp = -1L;
    }

    public final ajw b()
    {
        mImageType = aif.a(301, 8);
        return (new ajw()).a("bitmap", 2, aif.a(android/graphics/Bitmap)).a("alwaysRead", 1, aif.a(Boolean.TYPE)).a("timestamp", 1, aif.a(Long.TYPE)).b("image", 2, mImageType).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("alwaysRead"))
        {
            ajo1.a("mAlwaysRead");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("timestamp"))
        {
            ajo1.a("mTimestamp");
            ajo1.g = true;
            return;
        }
    }

    protected final void e()
    {
        Bitmap bitmap = (Bitmap)a("bitmap").a().d().m();
        aju aju1 = b("image");
        if (mLastBitmap != bitmap || mAlwaysRead)
        {
            if (mImageFrame != null)
            {
                mImageFrame.i();
            }
            int i = bitmap.getWidth();
            int j = bitmap.getHeight();
            mImageFrame = ahs.a(mImageType, new int[] {
                i, j
            }).h();
            mImageFrame.a(bitmap);
            mLastBitmap = bitmap;
        }
        if (mImageFrame == null)
        {
            throw new RuntimeException("BitmapSource trying to push out an undefined frame! Most likely, graph.getVariable(<BitmapSource filter>).setValue(<Bitmap>) has not been called.");
        }
        if (mTimestamp >= 0L)
        {
            mImageFrame.a(mTimestamp);
        }
        aju1.a(mImageFrame);
    }

    protected final void g()
    {
        if (mImageFrame != null)
        {
            mImageFrame.i();
            mImageFrame = null;
        }
    }
}
