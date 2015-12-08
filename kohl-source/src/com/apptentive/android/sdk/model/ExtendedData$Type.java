// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;

// Referenced classes of package com.apptentive.android.sdk.model:
//            ExtendedData

protected static final class  extends Enum
{

    private static final unknown $VALUES[];
    public static final unknown commerce;
    public static final unknown location;
    public static final unknown time;
    public static final unknown unknown;

    public static  parse(String s)
    {
         ;
        try
        {
             = valueOf(s);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.v((new StringBuilder()).append("Error parsing unknown ExtendedData.BaseType: ").append(s).toString(), new Object[0]);
            return unknown;
        }
        return ;
    }

    public static unknown valueOf(String s)
    {
        return (unknown)Enum.valueOf(com/apptentive/android/sdk/model/ExtendedData$Type, s);
    }

    public static unknown[] values()
    {
        return (unknown[])$VALUES.clone();
    }

    static 
    {
        time = new <init>("time", 0);
        location = new <init>("location", 1);
        commerce = new <init>("commerce", 2);
        unknown = new <init>("unknown", 3);
        $VALUES = (new .VALUES[] {
            time, location, commerce, unknown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
