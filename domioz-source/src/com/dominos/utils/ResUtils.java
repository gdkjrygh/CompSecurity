// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import android.content.res.Resources;
import java.util.HashMap;

public class ResUtils
{

    Context context;
    private HashMap optionToQuantityMap;

    public ResUtils(Context context1)
    {
        context = context1;
    }

    public String convertOptionQuantityToName(double d)
    {
        if (d == 0.0D)
        {
            return context.getResources().getString(0x7f0801e0);
        }
        if (d == 0.5D)
        {
            return context.getResources().getString(0x7f08018b);
        }
        if (d == 1.0D)
        {
            return context.getResources().getString(0x7f0801e2);
        }
        if (d == 1.5D)
        {
            return context.getResources().getString(0x7f080121);
        }
        if (d == 2D)
        {
            return context.getResources().getString(0x7f080103);
        }
        if (d == 3D)
        {
            return context.getResources().getString(0x7f080328);
        } else
        {
            return "";
        }
    }

    public HashMap getOptionToQuantityMap()
    {
        if (optionToQuantityMap == null)
        {
            optionToQuantityMap = new _cls1();
        }
        return optionToQuantityMap;
    }

    private class _cls1 extends HashMap
    {

        final ResUtils this$0;

        _cls1()
        {
            this$0 = ResUtils.this;
            super();
            put(Double.valueOf(0.0D), context.getResources().getString(0x7f0801e0));
            put(Double.valueOf(0.5D), context.getResources().getString(0x7f08018b));
            put(Double.valueOf(1.0D), context.getResources().getString(0x7f0801e2));
            put(Double.valueOf(1.5D), context.getResources().getString(0x7f080121));
            put(Double.valueOf(2D), context.getResources().getString(0x7f080103));
            put(Double.valueOf(3D), context.getResources().getString(0x7f080328));
        }
    }

}
