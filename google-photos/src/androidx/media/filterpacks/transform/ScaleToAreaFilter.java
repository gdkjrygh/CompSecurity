// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.transform;

import aif;
import ajo;
import ajr;
import ajw;

// Referenced classes of package androidx.media.filterpacks.transform:
//            ResizeFilter

public class ScaleToAreaFilter extends ResizeFilter
{

    private int mHeightMultiple;
    private int mTargetArea;
    private int mWidthMultiple;

    public ScaleToAreaFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mTargetArea = 0x12c00;
        mWidthMultiple = 4;
        mHeightMultiple = 4;
    }

    private float c(int i, int j)
    {
        return (float)Math.sqrt((float)mTargetArea / (float)(i * j));
    }

    protected final int a(int i, int j)
    {
        i = Math.round(c(i, j) * (float)i);
        return i + (mWidthMultiple - i % mWidthMultiple) % mWidthMultiple;
    }

    protected final int b(int i, int j)
    {
        i = Math.round(c(i, j) * (float)j);
        return i + (mHeightMultiple - i % mHeightMultiple) % mHeightMultiple;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("targetArea", 1, aif.a(Integer.TYPE)).a("widthMultiple", 1, aif.a(Integer.TYPE)).a("heightMultiple", 1, aif.a(Integer.TYPE)).a("useMipmaps", 1, aif.a(Boolean.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("targetArea"))
        {
            ajo1.a("mTargetArea");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("useMipmaps"))
            {
                ajo1.a("mUseMipmaps");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("widthMultiple"))
            {
                ajo1.a("mWidthMultiple");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("heightMultiple"))
            {
                ajo1.a("mHeightMultiple");
                ajo1.g = true;
                return;
            }
        }
    }
}
