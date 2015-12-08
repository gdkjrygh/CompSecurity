// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.ColorOptionList;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            TextActivity

private static class 
{

    private static b a = null;
    private final ColorOptionList b;

    public static  a(Context context)
    {
        if (a == null)
        {
            a = new <init>(context);
        }
        return a;
    }

    public ColorOptionList a()
    {
        return b;
    }


    private (Context context)
    {
        b = (ColorOptionList)k.a(context.getResources(), 0x7f060001, com/cardinalblue/android/piccollage/model/gson/ColorOptionList);
    }
}
