// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;


// Referenced classes of package org.chromium.media:
//            MediaDrmBridge

class val.sessionId
    implements Runnable
{

    final MediaDrmBridge this$0;
    final int val$sessionId;

    public void run()
    {
        MediaDrmBridge.access$900(MediaDrmBridge.this, MediaDrmBridge.access$600(MediaDrmBridge.this), val$sessionId);
    }

    ()
    {
        this$0 = final_mediadrmbridge;
        val$sessionId = I.this;
        super();
    }
}
