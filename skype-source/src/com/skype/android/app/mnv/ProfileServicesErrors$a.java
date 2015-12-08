// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            ProfileServicesErrors

static final class hasSkip extends Enum
{

    private static final UNSUPPORTED $VALUES[];
    public static final UNSUPPORTED INVALID;
    public static final UNSUPPORTED NO_CODE;
    public static final UNSUPPORTED PHONE;
    public static final UNSUPPORTED PIN;
    public static final UNSUPPORTED RETRY;
    public static final UNSUPPORTED UNABLE;
    public static final UNSUPPORTED UNSUPPORTED;
    private final boolean hasSkip;

    public static hasSkip valueOf(String s)
    {
        return (hasSkip)Enum.valueOf(com/skype/android/app/mnv/ProfileServicesErrors$a, s);
    }

    public static hasSkip[] values()
    {
        return (hasSkip[])$VALUES.clone();
    }

    public final boolean hasSkip()
    {
        return hasSkip;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(name()).append(" : ").append(Boolean.toString(hasSkip)).toString();
    }

    static 
    {
        NO_CODE = new <init>("NO_CODE", 0, false);
        RETRY = new <init>("RETRY", 1, true);
        UNABLE = new <init>("UNABLE", 2, false);
        PHONE = new <init>("PHONE", 3, false);
        PIN = new <init>("PIN", 4, false);
        INVALID = new <init>("INVALID", 5, false);
        UNSUPPORTED = new <init>("UNSUPPORTED", 6, false);
        $VALUES = (new .VALUES[] {
            NO_CODE, RETRY, UNABLE, PHONE, PIN, INVALID, UNSUPPORTED
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        name();
        hasSkip = flag;
    }
}
