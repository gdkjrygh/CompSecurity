// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;

// Referenced classes of package com.apptentive.android.sdk.model:
//            Payload

public static final class  extends Enum
{

    private static final survey $VALUES[];
    public static final survey app_release;
    public static final survey device;
    public static final survey event;
    public static final survey message;
    public static final survey person;
    public static final survey sdk;
    public static final survey survey;
    public static final survey unknown;

    public static  parse(String s)
    {
         ;
        try
        {
             = valueOf(s);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.v((new StringBuilder()).append("Error parsing unknown Payload.BaseType: ").append(s).toString(), new Object[0]);
            return unknown;
        }
        return ;
    }

    public static unknown valueOf(String s)
    {
        return (unknown)Enum.valueOf(com/apptentive/android/sdk/model/Payload$BaseType, s);
    }

    public static unknown[] values()
    {
        return (unknown[])$VALUES.clone();
    }

    static 
    {
        message = new <init>("message", 0);
        event = new <init>("event", 1);
        device = new <init>("device", 2);
        sdk = new <init>("sdk", 3);
        app_release = new <init>("app_release", 4);
        person = new <init>("person", 5);
        unknown = new <init>("unknown", 6);
        survey = new <init>("survey", 7);
        $VALUES = (new .VALUES[] {
            message, event, device, sdk, app_release, person, unknown, survey
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
