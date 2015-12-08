// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module;

import com.apptentive.android.sdk.Log;

// Referenced classes of package com.apptentive.android.sdk.module:
//            ActivityContent

public static final class  extends Enum
{

    private static final unknown $VALUES[];
    public static final unknown ABOUT;
    public static final unknown INTERACTION;
    public static final unknown MESSAGE_CENTER;
    public static final unknown unknown;

    public static  parse(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
          = valueOf(s);
        return ;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        Log.v((new StringBuilder()).append("Error parsing unknown ActivityContent.Type: ").append(s).toString(), new Object[0]);
        return unknown;
    }

    public static unknown valueOf(String s)
    {
        return (unknown)Enum.valueOf(com/apptentive/android/sdk/module/ActivityContent$Type, s);
    }

    public static unknown[] values()
    {
        return (unknown[])$VALUES.clone();
    }

    static 
    {
        ABOUT = new <init>("ABOUT", 0);
        MESSAGE_CENTER = new <init>("MESSAGE_CENTER", 1);
        INTERACTION = new <init>("INTERACTION", 2);
        unknown = new <init>("unknown", 3);
        $VALUES = (new .VALUES[] {
            ABOUT, MESSAGE_CENTER, INTERACTION, unknown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
