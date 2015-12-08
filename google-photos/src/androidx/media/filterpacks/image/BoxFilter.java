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
import ajw;
import androidx.media.filterfw.imageutils.FastBoxBlur;

public class BoxFilter extends ahn
{

    private FastBoxBlur mBoxBlurOperator;
    private int mFilterHeight;
    private int mFilterWidth;

    public BoxFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).a("filterWidth", 2, aif.a(Integer.TYPE)).a("filterHeight", 2, aif.a(Integer.TYPE)).b("image", 2, aif2).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("filterWidth"))
        {
            ajo1.a("mFilterWidth");
            ajo1.g = true;
        }
        if (ajo1.b.equals("filterHeight"))
        {
            ajo1.a("mFilterHeight");
            ajo1.g = true;
        }
    }

    protected final void c()
    {
        mFilterWidth = mFilterWidth | 1;
        mFilterHeight = mFilterHeight | 1;
        mBoxBlurOperator = new FastBoxBlur(r(), mFilterWidth, mFilterHeight);
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahv ahv2 = aju1.a(ahv1.l()).h();
        if (mFilterHeight > ahv1.n() || mFilterWidth > ahv1.m())
        {
            throw new UnsupportedOperationException("Can not apply a box filter that is largerthan the original image!");
        }
        mBoxBlurOperator.a(ahv1, ahv2);
        if (ahv2 != null)
        {
            aju1.a(ahv2);
        }
    }
}
