// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;


// Referenced classes of package com.skype.android.util:
//            ConversationUtil

static final class 
{

    static final int a[];
    static final int b[];
    static final int c[];

    static 
    {
        c = new int[com.skype.().length];
        try
        {
            c[com.skype._MEDIA_MESSAGE.l()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            c[com.skype._FLIK_MESSAGE.l()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        b = new int[com.skype.alues().length];
        try
        {
            b[com.skype.IALOG.rdinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[com.skype.ONFERENCE.rdinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        a = new int[com.skype.TATUS.values().length];
        try
        {
            a[com.skype.TATUS.VOICE_AVAILABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[com.skype.TATUS.VOICE_CONNECTING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.skype.TATUS.RINGING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.skype.TATUS.LISTENING.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.skype.TATUS.SPEAKING.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.skype.TATUS.VOICE_ON_HOLD.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
