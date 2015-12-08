// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.view.View;
import java.util.List;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            l

private static abstract class c extends l
{

    private final b a;
    private final String b;
    private final boolean c;

    protected void c(View view)
    {
        a.a(view, b, c);
    }

    protected String e()
    {
        return b;
    }

    public (List list, String s,  , boolean flag)
    {
        super(list);
        a = ;
        b = s;
        c = flag;
    }
}
