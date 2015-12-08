// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk;


// Referenced classes of package com.apptentive.android.sdk:
//            ApptentiveInternal, Log

public static final class  extends Enum
{

    private static final unknown $VALUES[];
    public static final unknown pmc;
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
            Log.d((new StringBuilder()).append("Error parsing unknown PushAction: ").append(s).toString(), new Object[0]);
            return unknown;
        }
        return ;
    }

    public static unknown valueOf(String s)
    {
        return (unknown)Enum.valueOf(com/apptentive/android/sdk/ApptentiveInternal$PushAction, s);
    }

    public static unknown[] values()
    {
        return (unknown[])$VALUES.clone();
    }

    static 
    {
        pmc = new <init>("pmc", 0);
        unknown = new <init>("unknown", 1);
        $VALUES = (new .VALUES[] {
            pmc, unknown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
