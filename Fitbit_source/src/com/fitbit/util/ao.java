// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.data.domain.Length;

public class ao
{

    public ao()
    {
    }

    public static Length a(Length length, Length length1)
    {
        return a(length, length1, (com.fitbit.data.domain.Length.LengthUnits)length.a());
    }

    public static Length a(Length length, Length length1, com.fitbit.data.domain.Length.LengthUnits lengthunits)
    {
        return new Length(length.a(lengthunits).b() + length1.a(lengthunits).b(), lengthunits);
    }

    public static Length b(Length length, Length length1)
    {
        return b(length, length1, (com.fitbit.data.domain.Length.LengthUnits)length.a());
    }

    public static Length b(Length length, Length length1, com.fitbit.data.domain.Length.LengthUnits lengthunits)
    {
        return new Length(length.a(lengthunits).b() - length1.a(lengthunits).b(), lengthunits);
    }
}
