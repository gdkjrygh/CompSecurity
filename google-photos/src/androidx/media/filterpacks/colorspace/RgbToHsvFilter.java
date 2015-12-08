// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.colorspace;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import akr;
import androidx.media.filterfw.ColorSpace;

public class RgbToHsvFilter extends ahn
{

    private akr mConverter;

    public RgbToHsvFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).b("image", 2, aif2).a();
    }

    protected final void c()
    {
        mConverter = new akr(r());
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahv ahv2 = aju1.a(ahv1.l()).h();
        akr akr1 = mConverter;
        if (akr1.a)
        {
            akr1.b.a(ahv1, ahv2);
        } else
        {
            ColorSpace.a(ahv1.a(1), ahv2.a(2), ahv1.m(), ahv1.n());
            ahv1.k();
            ahv2.k();
        }
        aju1.a(ahv2);
    }
}
