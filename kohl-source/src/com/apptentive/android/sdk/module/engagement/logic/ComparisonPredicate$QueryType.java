// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.logic;


// Referenced classes of package com.apptentive.android.sdk.module.engagement.logic:
//            ComparisonPredicate

private static final class  extends Enum
{

    private static final other $VALUES[];
    public static final other app_release;
    public static final other application_build;
    public static final other application_version;
    public static final other code_point;
    public static final other current_time;
    public static final other device;
    public static final other interactions;
    public static final other is_update;
    public static final other other;
    public static final other person;
    public static final other sdk;
    public static final other time_since_install;

    public static  parse(String s)
    {
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return other;
        }
        return s;
    }

    public static other valueOf(String s)
    {
        return (other)Enum.valueOf(com/apptentive/android/sdk/module/engagement/logic/ComparisonPredicate$QueryType, s);
    }

    public static other[] values()
    {
        return (other[])$VALUES.clone();
    }

    static 
    {
        application_version = new <init>("application_version", 0);
        application_build = new <init>("application_build", 1);
        current_time = new <init>("current_time", 2);
        is_update = new <init>("is_update", 3);
        time_since_install = new <init>("time_since_install", 4);
        code_point = new <init>("code_point", 5);
        interactions = new <init>("interactions", 6);
        person = new <init>("person", 7);
        device = new <init>("device", 8);
        app_release = new <init>("app_release", 9);
        sdk = new <init>("sdk", 10);
        other = new <init>("other", 11);
        $VALUES = (new .VALUES[] {
            application_version, application_build, current_time, is_update, time_since_install, code_point, interactions, person, device, app_release, 
            sdk, other
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
