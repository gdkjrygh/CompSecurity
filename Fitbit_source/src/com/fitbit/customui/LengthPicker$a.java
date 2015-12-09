// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import com.fitbit.data.domain.Length;

// Referenced classes of package com.fitbit.customui:
//            LengthPicker

public class hUnits extends r.b
{

    final LengthPicker a;

    public hUnits(LengthPicker lengthpicker)
    {
        a = lengthpicker;
        super(lengthpicker);
        a(new Length(0.0D, lengthpicker.c[0][0]));
    }
}
