// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.widget.RadioButton;
import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            az, ba

class bb
{

    final az a;
    private TextView b;
    private RadioButton c;

    private bb(az az)
    {
        a = az;
        super();
    }

    bb(az az, ba ba)
    {
        this(az);
    }

    static RadioButton a(bb bb1)
    {
        return bb1.c;
    }

    static RadioButton a(bb bb1, RadioButton radiobutton)
    {
        bb1.c = radiobutton;
        return radiobutton;
    }

    static TextView a(bb bb1, TextView textview)
    {
        bb1.b = textview;
        return textview;
    }

    static TextView b(bb bb1)
    {
        return bb1.b;
    }
}
