// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.mobileconnectors.s3.transfermanager.b.b;
import com.amazonaws.mobileconnectors.s3.transfermanager.exception.PauseException;

// Referenced classes of package com.amazonaws.mobileconnectors.s3.transfermanager:
//            Transfer, h, k

public interface o
    extends Transfer
{

    public abstract b a()
        throws AmazonClientException, AmazonServiceException, InterruptedException;

    public abstract h a(boolean flag);

    public abstract k b()
        throws PauseException;

    public abstract void c();
}
