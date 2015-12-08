// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;


// Referenced classes of package com.skype.android.calling:
//            d

static final class IVESTATUS
{

    static final int a[];
    static final int b[];
    static final int c[];

    static 
    {
        c = new int[com.skype.icipant.VOICE_STATUS.values().length];
        try
        {
            c[com.skype.icipant.VOICE_STATUS.VOICE_STOPPED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            c[com.skype.icipant.VOICE_STATUS.VOICE_CONNECTING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            c[com.skype.icipant.VOICE_STATUS.RINGING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            c[com.skype.icipant.VOICE_STATUS.EARLY_MEDIA.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            c[com.skype.icipant.VOICE_STATUS.LISTENING.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            c[com.skype.icipant.VOICE_STATUS.SPEAKING.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            c[com.skype.icipant.VOICE_STATUS.VOICE_NA.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            c[com.skype.icipant.VOICE_STATUS.VOICE_UNKNOWN.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            c[com.skype.icipant.VOICE_STATUS.VOICE_AVAILABLE.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            c[com.skype.icipant.VOICE_STATUS.VOICE_ON_HOLD.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        b = new int[com.skype.ersation.LOCAL_LIVESTATUS.values().length];
        try
        {
            b[com.skype.ersation.LOCAL_LIVESTATUS.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[com.skype.o.STATUS.values().length];
        try
        {
            a[com.skype.o.STATUS.RUNNING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.skype.o.STATUS.PAUSED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.skype.o.STATUS.AVAILABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
