// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.a.b;
import com.amazonaws.services.s3.model.bn;

// Referenced classes of package com.amazonaws.mobileconnectors.s3.transfermanager:
//            n

public interface Transfer
{

    public abstract void a(b b1);

    public abstract void a(bn bn);

    public abstract void b(b b1);

    public abstract void b(bn bn);

    public abstract boolean f();

    public abstract void g()
        throws AmazonClientException, AmazonServiceException, InterruptedException;

    public abstract AmazonClientException h()
        throws InterruptedException;

    public abstract String i();

    public abstract TransferState j();

    public abstract n k();

    // Unreferenced inner class com/amazonaws/mobileconnectors/s3/transfermanager/Transfer$TransferState
    /* block-local class not found */
    class TransferState {}

}
