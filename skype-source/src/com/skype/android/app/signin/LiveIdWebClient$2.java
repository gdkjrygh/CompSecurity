// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.signin:
//            LiveIdWebClient

final class atarSize
    implements Callable
{

    final LiveIdWebClient this$0;
    final String val$cid;
    final atarSize val$size;

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public final byte[] call()
        throws Exception
    {
        return LiveIdWebClient.access$000(LiveIdWebClient.this, val$cid, val$size);
    }

    atarSize()
    {
        this$0 = final_liveidwebclient;
        val$cid = s;
        val$size = atarSize.this;
        super();
    }
}
