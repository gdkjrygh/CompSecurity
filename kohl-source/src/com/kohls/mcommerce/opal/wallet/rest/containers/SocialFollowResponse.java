// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import com.kohls.mcommerce.opal.wallet.rest.responses.ResponseBase;
import java.util.List;

public class SocialFollowResponse extends ResponseBase
{

    private List mErrors;
    private String mSuccess;
    private String mUniqueResponseId;

    public SocialFollowResponse()
    {
    }

    public List getErrors()
    {
        return mErrors;
    }

    public String getId()
    {
        return mUniqueResponseId;
    }

    public String getSuccess()
    {
        return mSuccess;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = (new StringBuilder()).append("mUniqueResponseId = ").append(mUniqueResponseId).append(" , mSuccess = ").append(mSuccess).append(" , mErrors = ");
        String s;
        if (mErrors != null && !mErrors.isEmpty())
        {
            s = mErrors.toString();
        } else
        {
            s = null;
        }
        stringbuilder.append(stringbuilder1.append(s).toString());
        return stringbuilder.toString();
    }
}
