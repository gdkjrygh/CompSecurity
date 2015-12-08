// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            MediaMessageViewAdapter

static final class 
{

    static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];
    static final int $SwitchMap$com$skype$MediaDocument$STATUS[];
    static final int $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS[];

    static 
    {
        $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype..values().length];
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype..MEDIA_LOADING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype..MEDIA_NOT_AVAILABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype..MEDIA_BAD_CONTENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        $SwitchMap$com$skype$MediaDocument$STATUS = new int[com.skype.s().length];
        try
        {
            $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.S_DENIED.al()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.VAILABLE.al()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.REATED.al()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.ED.al()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.ED.al()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$STATUS[com.skype.ABLE.al()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS = new int[com.skype.S.values().length];
        try
        {
            $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS[com.skype.S.UPLOAD_FAILED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS[com.skype.S.UPLOAD_IN_PROGRESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS[com.skype.S.UPLOAD_QUEUED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$UPLOAD_STATUS[com.skype.S.UPLOAD_COMPLETED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
