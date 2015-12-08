// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            CrosshairView

public class BarcodeCrosshairView extends CrosshairView
{
    public static final class CrosshairState extends Enum
    {

        public static final CrosshairState a;
        public static final CrosshairState b;
        private static final CrosshairState c[];

        public static CrosshairState valueOf(String s)
        {
            return (CrosshairState)Enum.valueOf(com/fitbit/food/barcode/ui/BarcodeCrosshairView$CrosshairState, s);
        }

        public static CrosshairState[] values()
        {
            return (CrosshairState[])c.clone();
        }

        static 
        {
            a = new CrosshairState("DEFAULT", 0);
            b = new CrosshairState("FINDED", 1);
            c = (new CrosshairState[] {
                a, b
            });
        }

        private CrosshairState(String s, int i)
        {
            super(s, i);
        }
    }


    private CrosshairState c;

    public BarcodeCrosshairView(Context context)
    {
        super(context);
        c = CrosshairState.a;
    }

    public BarcodeCrosshairView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = CrosshairState.a;
    }

    public BarcodeCrosshairView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = CrosshairState.a;
    }

    public void a()
    {
        a(CrosshairState.b);
    }

    public void a(CrosshairState crosshairstate)
    {
        if (crosshairstate == null || c == crosshairstate) goto _L2; else goto _L1
_L1:
        c = crosshairstate;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[CrosshairState.values().length];
                try
                {
                    a[CrosshairState.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1.a[crosshairstate.ordinal()];
        JVM INSTR tableswitch 1 1: default 44
    //                   1 67;
           goto _L3 _L4
_L3:
        int i = getContext().getResources().getColor(0x7f0f0172);
_L6:
        a(i);
        invalidate();
_L2:
        return;
_L4:
        i = getContext().getResources().getColor(0x7f0f0025);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void b()
    {
        a(CrosshairState.a);
    }

    public CrosshairState c()
    {
        return c;
    }
}
