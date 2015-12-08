// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;


// Referenced classes of package com.soundcloud.android.offline:
//            DownloadOperations

class wnloadProgressListener
    implements com.soundcloud.android.crypto.rogressListener
{

    final DownloadOperations this$0;
    final wnloadProgressListener val$listener;

    public void onBytesEncrypted(long l)
    {
        val$listener.onProgress(l);
    }

    wnloadProgressListener()
    {
        this$0 = final_downloadoperations;
        val$listener = wnloadProgressListener.this;
        super();
    }
}
