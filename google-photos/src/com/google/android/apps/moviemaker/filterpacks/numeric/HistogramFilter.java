// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.numeric;

import aif;
import ajr;
import ajw;

// Referenced classes of package com.google.android.apps.moviemaker.filterpacks.numeric:
//            BlockHistogramFilter

public class HistogramFilter extends BlockHistogramFilter
{

    private static final aif INPUT_TYPE = aif.b(100);
    private static final aif OUTPUT_TYPE = aif.a(102);

    public HistogramFilter(ajr ajr, String s)
    {
        super(ajr, s);
        super.mNumRows = 1;
        super.mNumColumns = 1;
    }

    public final ajw b()
    {
        return (new ajw()).a("input", 2, INPUT_TYPE).b("histograms", 2, OUTPUT_TYPE).a();
    }

}
