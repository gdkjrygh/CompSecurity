// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;

// Referenced classes of package com.amazonaws.mobileconnectors.s3.transfermanager:
//            Transfer

public interface a
    extends Transfer
{

    public abstract com.amazonaws.mobileconnectors.s3.transfermanager.b.a a()
        throws AmazonClientException, AmazonServiceException, InterruptedException;
}
