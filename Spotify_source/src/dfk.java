// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public final class dfk
{

    private static final int a[] = {
        0x1010034, 0x7f01004b
    };

    public static void a(Context context, TextView textview, int i)
    {
        context = context.obtainStyledAttributes(i, dfh.aS);
        boolean flag = context.getBoolean(dfh.aU, false);
        context.recycle();
        a(textview, flag);
    }

    public static void a(Context context, TextView textview, AttributeSet attributeset, int i)
    {
        boolean flag = false;
        dfk;
        JVM INSTR monitorenter ;
        attributeset = context.obtainStyledAttributes(attributeset, a, i, 0);
        i = attributeset.getResourceId(0, -1);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        context = context.obtainStyledAttributes(i, dfh.aS);
        flag = context.getBoolean(dfh.aU, false);
        context.recycle();
        flag = attributeset.getBoolean(1, flag);
        attributeset.recycle();
        a(textview, flag);
        dfk;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static void a(TextView textview, boolean flag)
    {
        if (flag)
        {
            textview.setTransformationMethod(new dfl(textview.getContext()));
        } else
        if (textview.getTransformationMethod() instanceof dfl)
        {
            textview.setTransformationMethod(null);
            return;
        }
    }

}
