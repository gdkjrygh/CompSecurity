// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            cg, ch

class ci
{

    final cg a;
    private TextView b;

    private ci(cg cg)
    {
        a = cg;
        super();
    }

    ci(cg cg, ch ch)
    {
        this(cg);
    }

    static TextView a(ci ci1)
    {
        return ci1.b;
    }

    static TextView a(ci ci1, TextView textview)
    {
        ci1.b = textview;
        return textview;
    }
}
