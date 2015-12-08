// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


// Referenced classes of package com.mopub.mraid:
//            MraidJavascriptCommand

final class g
{

    static final int a[];

    static 
    {
        a = new int[MraidJavascriptCommand.values().length];
        try
        {
            a[MraidJavascriptCommand.CLOSE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[MraidJavascriptCommand.RESIZE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[MraidJavascriptCommand.EXPAND.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[MraidJavascriptCommand.USE_CUSTOM_CLOSE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[MraidJavascriptCommand.OPEN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[MraidJavascriptCommand.SET_ORIENTATION_PROPERTIES.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[MraidJavascriptCommand.PLAY_VIDEO.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[MraidJavascriptCommand.STORE_PICTURE.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[MraidJavascriptCommand.CREATE_CALENDAR_EVENT.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[MraidJavascriptCommand.UNSPECIFIED.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
