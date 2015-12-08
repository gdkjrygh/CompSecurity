// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;


// Referenced classes of package com.skype.android.app.contacts:
//            ContactItem

static final class ntactableType
{

    static final int $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType[];

    static 
    {
        $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType = new int[ntactableType.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType[ntactableType.PHONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType[ntactableType.EMAIL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
