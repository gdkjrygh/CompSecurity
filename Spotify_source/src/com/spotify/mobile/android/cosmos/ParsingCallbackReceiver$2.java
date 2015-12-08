// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;


// Referenced classes of package com.spotify.mobile.android.cosmos:
//            ParsingCallbackReceiver

class rorCause
    implements Runnable
{

    final ParsingCallbackReceiver this$0;
    final rorCause val$cause;
    final Throwable val$error;

    public void run()
    {
        onError(val$error, val$cause);
    }

    rorCause()
    {
        this$0 = final_parsingcallbackreceiver;
        val$error = throwable;
        val$cause = rorCause.this;
        super();
    }
}
