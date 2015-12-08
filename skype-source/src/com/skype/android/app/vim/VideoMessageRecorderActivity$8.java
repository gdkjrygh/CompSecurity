// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;


// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

static final class 
{

    static final int $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[];

    static 
    {
        $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State = new int[values().length];
        try
        {
            $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[PRERECORD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[RECORDING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[REVIEW.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[CANCELED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[INTERRUPTED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
