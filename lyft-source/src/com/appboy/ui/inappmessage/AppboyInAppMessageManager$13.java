// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.enums.inappmessage.ClickAction;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageManager, InAppMessageOperation

class 
{

    static final int $SwitchMap$com$appboy$enums$inappmessage$ClickAction[];
    static final int $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[];

    static 
    {
        $SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[ClickAction.values().length];
        try
        {
            $SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NEWS_FEED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.URI.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation = new int[InAppMessageOperation.values().length];
        try
        {
            $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$appboy$ui$inappmessage$InAppMessageOperation[InAppMessageOperation.DISCARD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
