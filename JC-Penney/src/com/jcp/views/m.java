// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;

// Referenced classes of package com.jcp.views:
//            c

public class m extends c
{

    private double d;

    public m(Number number, Number number1, Number number2, Context context)
    {
        super(number, number1, context);
        d = a(a(number.doubleValue() + number2.doubleValue(), a));
    }
}
