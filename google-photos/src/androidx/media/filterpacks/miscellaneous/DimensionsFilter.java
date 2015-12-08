// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.miscellaneous;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;

public final class DimensionsFilter extends ahn
{

    public DimensionsFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        return (new ajw()).a("frame", 2, aif.a()).b("dimensions", 2, aif.b(Integer.TYPE)).a();
    }

    protected final void e()
    {
        ahs ahs1 = a("frame").a();
        aju aju1 = b("dimensions");
        aig aig1 = aju1.a(null).d();
        aig1.a(ahs1.l());
        aju1.a(aig1);
    }
}
