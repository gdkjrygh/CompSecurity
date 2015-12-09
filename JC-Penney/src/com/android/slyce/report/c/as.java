// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.view.View;
import java.util.List;

// Referenced classes of package com.android.slyce.report.c:
//            an, at

abstract class as extends an
{

    private final at a;
    private final String b;
    private final boolean c;

    public as(List list, String s, at at1, boolean flag)
    {
        super(list);
        a = at1;
        b = s;
        c = flag;
    }

    protected String b()
    {
        return b;
    }

    protected void c(View view)
    {
        a.a(view, b, c);
    }
}
