// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            ah, ai

class aj
{

    final ah a;
    private TextView b;
    private LinearLayout c;

    private aj(ah ah)
    {
        a = ah;
        super();
    }

    aj(ah ah, ai ai)
    {
        this(ah);
    }

    static LinearLayout a(aj aj1, LinearLayout linearlayout)
    {
        aj1.c = linearlayout;
        return linearlayout;
    }

    static TextView a(aj aj1)
    {
        return aj1.b;
    }

    static TextView a(aj aj1, TextView textview)
    {
        aj1.b = textview;
        return textview;
    }

    static LinearLayout b(aj aj1)
    {
        return aj1.c;
    }
}
