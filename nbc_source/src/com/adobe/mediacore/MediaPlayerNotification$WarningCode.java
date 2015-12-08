// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerNotification

public static final class _code extends Enum
    implements Code
{

    private static final UNDEFINED_TIME_RANGES $VALUES[];
    public static final UNDEFINED_TIME_RANGES AD_MANIFEST_LOAD_FAILED;
    public static final UNDEFINED_TIME_RANGES AD_RESOLVER_FAIL;
    public static final UNDEFINED_TIME_RANGES AD_RESOLVER_RETURNED_NO_ADS;
    public static final UNDEFINED_TIME_RANGES BACKGROUND_MANIFEST_WARNING;
    public static final UNDEFINED_TIME_RANGES GENERIC_WARNING;
    public static final UNDEFINED_TIME_RANGES INVALID_SEEK_WARNING;
    public static final UNDEFINED_TIME_RANGES NATIVE_WARNING;
    public static final UNDEFINED_TIME_RANGES PLAYBACK_OPERATION_FAIL;
    public static final UNDEFINED_TIME_RANGES TRICKPLAY_RATE_CHANGE_FAIL;
    public static final UNDEFINED_TIME_RANGES UNDEFINED_TIME_RANGES;
    private final long _code;

    public static Code valueOf(String s)
    {
        return (Code)Enum.valueOf(com/adobe/mediacore/MediaPlayerNotification$WarningCode, s);
    }

    public static Code[] values()
    {
        return (Code[])$VALUES.clone();
    }

    public long getCode()
    {
        return _code;
    }

    public String getName()
    {
        return name();
    }

    static 
    {
        PLAYBACK_OPERATION_FAIL = new <init>("PLAYBACK_OPERATION_FAIL", 0, 0x30d40L);
        AD_RESOLVER_FAIL = new <init>("AD_RESOLVER_FAIL", 1, 0x31128L);
        AD_MANIFEST_LOAD_FAILED = new <init>("AD_MANIFEST_LOAD_FAILED", 2, 0x3112aL);
        AD_RESOLVER_RETURNED_NO_ADS = new <init>("AD_RESOLVER_RETURNED_NO_ADS", 3, 0x3112bL);
        BACKGROUND_MANIFEST_WARNING = new <init>("BACKGROUND_MANIFEST_WARNING", 4, 0x31ce0L);
        INVALID_SEEK_WARNING = new <init>("INVALID_SEEK_WARNING", 5, 0x31ce1L);
        NATIVE_WARNING = new <init>("NATIVE_WARNING", 6, 0x330ccL);
        TRICKPLAY_RATE_CHANGE_FAIL = new <init>("TRICKPLAY_RATE_CHANGE_FAIL", 7, 0x445c0L);
        GENERIC_WARNING = new <init>("GENERIC_WARNING", 8, 0x493dfL);
        UNDEFINED_TIME_RANGES = new <init>("UNDEFINED_TIME_RANGES", 9, 0x3a980L);
        $VALUES = (new .VALUES[] {
            PLAYBACK_OPERATION_FAIL, AD_RESOLVER_FAIL, AD_MANIFEST_LOAD_FAILED, AD_RESOLVER_RETURNED_NO_ADS, BACKGROUND_MANIFEST_WARNING, INVALID_SEEK_WARNING, NATIVE_WARNING, TRICKPLAY_RATE_CHANGE_FAIL, GENERIC_WARNING, UNDEFINED_TIME_RANGES
        });
    }

    private Code(String s, int i, long l)
    {
        super(s, i);
        _code = l;
    }
}
