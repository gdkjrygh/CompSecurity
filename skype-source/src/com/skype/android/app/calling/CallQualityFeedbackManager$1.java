// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;


// Referenced classes of package com.skype.android.app.calling:
//            CallQualityFeedbackManager

static final class Type
{

    static final int $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType[];

    static 
    {
        $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType = new int[Type.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType[Type.MPV.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType[Type.MPA.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType[Type.SKYPE_TO_SKYPE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$calling$CallQualityFeedbackRating$CQFType[Type.SKYPE_OUT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
