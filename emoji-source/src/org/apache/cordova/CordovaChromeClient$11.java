// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


// Referenced classes of package org.apache.cordova:
//            CordovaChromeClient

static class sageType
{

    static final int $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType[];

    static 
    {
        $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType = new int[org.xwalk.core.tMessageType.values().length];
        try
        {
            $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType[org.xwalk.core.tMessageType.JAVASCRIPT_ALERT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType[org.xwalk.core.tMessageType.JAVASCRIPT_CONFIRM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType[org.xwalk.core.tMessageType.JAVASCRIPT_PROMPT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$org$xwalk$core$XWalkUIClient$JavascriptMessageType[org.xwalk.core.tMessageType.JAVASCRIPT_BEFOREUNLOAD.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
