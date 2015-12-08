// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import java.util.concurrent.Future;

// Referenced classes of package com.google.uploader.client:
//            TransferListener

public interface Transfer
{

    public abstract void attachListener(TransferListener transferlistener, int i);

    public abstract void cancel();

    public abstract long getBytesUploaded();

    public abstract String getTransferHandle();

    public abstract Future send();
}
