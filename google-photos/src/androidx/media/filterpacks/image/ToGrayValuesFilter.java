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
import androidx.media.filterfw.imageutils.GrayValuesExtractor;

public class ToGrayValuesFilter extends ahn
{

    private GrayValuesExtractor mGrayValuesExtractor;

    public ToGrayValuesFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.b(100);
        return (new ajw()).a("image", 2, aif.a(301, 2)).b("image", 2, aif1).a();
    }

    protected final void c()
    {
        mGrayValuesExtractor = new GrayValuesExtractor(r());
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahu ahu = aju1.a(mGrayValuesExtractor.a(ahv1.l())).g();
        mGrayValuesExtractor.a(ahv1, ahu);
        aju1.a(ahu);
    }
}
