// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Message

public static final class  extends Enum
{

    private static final unknown $VALUES[];
    public static final unknown AutomatedMessage;
    public static final unknown FileMessage;
    public static final unknown TextMessage;
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
            Log.v((new StringBuilder()).append("Error parsing unknown Message.Type: ").append(s).toString(), new Object[0]);
            return unknown;
        }
        return ;
    }

    public static unknown valueOf(String s)
    {
        return (unknown)Enum.valueOf(com/apptentive/android/sdk/model/Message$Type, s);
    }

    public static unknown[] values()
    {
        return (unknown[])$VALUES.clone();
    }

    static 
    {
        TextMessage = new <init>("TextMessage", 0);
        FileMessage = new <init>("FileMessage", 1);
        AutomatedMessage = new <init>("AutomatedMessage", 2);
        unknown = new <init>("unknown", 3);
        $VALUES = (new .VALUES[] {
            TextMessage, FileMessage, AutomatedMessage, unknown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
