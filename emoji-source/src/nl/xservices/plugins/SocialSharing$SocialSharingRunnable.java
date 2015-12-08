// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package nl.xservices.plugins;

import org.apache.cordova.CallbackContext;

// Referenced classes of package nl.xservices.plugins:
//            SocialSharing

private abstract class callbackContext
    implements Runnable
{

    public CallbackContext callbackContext;
    final SocialSharing this$0;

    (CallbackContext callbackcontext)
    {
        this$0 = SocialSharing.this;
        super();
        callbackContext = callbackcontext;
    }
}
