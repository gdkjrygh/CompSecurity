// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            MMSDK, MMAdImpl, RequestListener, MMLog

static final class val.adImpl
    implements Runnable
{

    final MMAdImpl val$adImpl;

    public void run()
    {
        if (val$adImpl == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        val$adImpl.isOverlayLaunched = false;
        if (val$adImpl.requestListener == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        val$adImpl.requestListener.MMAdOverlayClosed(val$adImpl.getCallingAd());
        return;
        Exception exception;
        exception;
        MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
        return;
    }

    r(MMAdImpl mmadimpl)
    {
        val$adImpl = mmadimpl;
        super();
    }
}
