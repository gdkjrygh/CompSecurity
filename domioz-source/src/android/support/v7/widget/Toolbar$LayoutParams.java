// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;

public class mMargin extends android.support.v7.app.s
{

    int b;

    public ()
    {
        b = 0;
        a = 0x800013;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
    }

    public b(android.support.v7.app.s s)
    {
        super(s);
        b = 0;
    }

    public b(b b1)
    {
        super(b1);
        b = 0;
        b = b1.b;
    }

    public b(android.view.s s)
    {
        super(s);
        b = 0;
    }

    public b(android.view.tParams tparams)
    {
        super(tparams);
        b = 0;
        leftMargin = tparams.leftMargin;
        topMargin = tparams.topMargin;
        rightMargin = tparams.rightMargin;
        bottomMargin = tparams.bottomMargin;
    }
}
