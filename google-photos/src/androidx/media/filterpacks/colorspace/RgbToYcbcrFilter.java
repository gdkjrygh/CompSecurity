// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.colorspace;

import ahn;
import ahs;
import ahv;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import androidx.media.filterfw.ColorSpace;

public class RgbToYcbcrFilter extends ahn
{

    public RgbToYcbcrFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).b("image", 2, aif2).a();
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        int ai[] = ahv1.l();
        ahv ahv2 = aju1.a(ai).h();
        ColorSpace.b(ahv1.a(1), ahv2.a(1), ai[0], ai[1]);
        ahv1.k();
        ahv2.k();
        aju1.a(ahv2);
    }
}
