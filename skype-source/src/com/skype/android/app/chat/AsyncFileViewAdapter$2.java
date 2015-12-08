// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            AsyncFileViewAdapter

static final class 
{

    static final int $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[];
    static final int $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[];

    static 
    {
        $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS = new int[values().length];
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[DOWNLOAD_NOT_STARTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[DOWNLOADING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[DOWNLOAD_COMPLETED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[NO_NETWORK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[ERROR.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[EXPIRED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$RECEIVER_STATUS[CANCELED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS = new int[values().length];
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[QUEUED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[UPLOADING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[SCANNING_MALWARE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[UPLOAD_COMPLETED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[UPLOAD_FAILED_TOO_BIG.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[MALWARE_DETECTED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[UPLOAD_FAILED_GENERIC.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$chat$AsyncFileViewAdapter$SENDER_STATUS[NO_NETWORK.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
