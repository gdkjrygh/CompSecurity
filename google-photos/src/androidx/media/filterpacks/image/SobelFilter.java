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
import androidx.media.filterfw.imageutils.SobelOperator;

public class SobelFilter extends ahn
{

    private SobelOperator mSobelOperator;

    public SobelFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).b("gradientX", 1, aif2).b("gradientY", 1, aif2).b("direction", 1, aif2).b("magnitude", 1, aif2).a();
    }

    protected final void c()
    {
        mSobelOperator = new SobelOperator(r());
    }

    protected final void e()
    {
        ahv ahv4 = null;
        aju aju1 = b("gradientX");
        aju aju2 = b("gradientY");
        aju aju3 = b("magnitude");
        aju aju4 = b("direction");
        ahv ahv5 = a("image").a().h();
        int ai[] = ahv5.l();
        ahv ahv1;
        ahv ahv2;
        ahv ahv3;
        if (aju3 != null)
        {
            ahv1 = aju3.a(ai).h();
        } else
        {
            ahv1 = null;
        }
        if (aju4 != null)
        {
            ahv2 = aju4.a(ai).h();
        } else
        {
            ahv2 = null;
        }
        if (aju1 != null)
        {
            ahv3 = aju1.a(ai).h();
        } else
        {
            ahv3 = null;
        }
        if (aju2 != null)
        {
            ahv4 = aju2.a(ai).h();
        }
        mSobelOperator.a(ahv5, ahv3, ahv4, ahv1, ahv2);
        if (ahv1 != null)
        {
            aju3.a(ahv1);
        }
        if (ahv2 != null)
        {
            aju4.a(ahv2);
        }
        if (aju1 != null)
        {
            aju1.a(ahv3);
        }
        if (aju2 != null)
        {
            aju2.a(ahv4);
        }
    }
}
