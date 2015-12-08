// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;


// Referenced classes of package com.skype.android.mediacontent:
//            MediaContentRoster

static final class _cls9
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.skype.TATUS.values().length];
        try
        {
            b[com.skype.TATUS.MEDIA_LOADED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[com.skype.TATUS.MEDIA_NOT_AVAILABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.skype.TATUS.MEDIA_BAD_CONTENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[com.skype.T_TYPE.values().length];
        try
        {
            a[com.skype.T_TYPE.MEDIA_EMOTICON.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.skype.T_TYPE.MEDIA_PACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.skype.T_TYPE.MEDIA_FLIK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
