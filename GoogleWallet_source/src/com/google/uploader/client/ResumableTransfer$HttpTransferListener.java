// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;


// Referenced classes of package com.google.uploader.client:
//            TransferListener, ResumableTransfer, Transfer

final class outerTransfer extends TransferListener
{

    private TransferListener outerListener;
    private Transfer outerTransfer;
    final ResumableTransfer this$0;

    public final void onUploadProgress(Transfer transfer)
    {
        outerListener.onUploadProgress(outerTransfer);
    }

    public (Transfer transfer, TransferListener transferlistener)
    {
        this$0 = ResumableTransfer.this;
        super();
        outerListener = transferlistener;
        outerTransfer = transfer;
    }
}
