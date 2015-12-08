// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public abstract class dta extends ViewGroup
{

    private final dtc a;

    public dta(Context context, AttributeSet attributeset, dtc dtc1)
    {
        super((Context)ctz.a(context), attributeset, 0);
        a = (dtc)ctz.a(dtc1);
    }

    static void a(dta dta1, int i, int j)
    {
        dta1.setMeasuredDimension(i, j);
    }

    public void onMeasure(int i, int j)
    {
        a.a(i, j, getSuggestedMinimumWidth(), getSuggestedMinimumHeight(), new dtb(this));
    }
}
