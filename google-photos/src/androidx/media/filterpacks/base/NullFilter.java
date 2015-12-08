// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import aif;
import ajo;
import ajr;
import ajw;

public final class NullFilter extends ahn
{

    public NullFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        ajw ajw1 = (new ajw()).a("input", 2, aif.a());
        ajw1.c = false;
        return ajw1;
    }

    protected final void e()
    {
        a("input").a();
    }
}
