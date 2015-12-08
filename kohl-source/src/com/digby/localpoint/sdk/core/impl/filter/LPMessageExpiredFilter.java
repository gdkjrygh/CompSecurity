// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl.filter;

import com.digby.localpoint.sdk.core.ILPFilter;
import com.digby.localpoint.sdk.core.ILPMessage;
import com.digby.mm.android.library.exception.LPArgumentException;
import java.util.Date;

public class LPMessageExpiredFilter
    implements ILPFilter
{

    private final Date expiryDate;

    public LPMessageExpiredFilter()
    {
        expiryDate = new Date();
    }

    public LPMessageExpiredFilter(Date date)
    {
        expiryDate = date;
    }

    public boolean accept(Object obj)
    {
        if (!(obj instanceof ILPMessage))
        {
            throw new LPArgumentException("Filter can only apply to objects of type ILPMessage");
        } else
        {
            return ((ILPMessage)obj).getExpirationDate().before(expiryDate);
        }
    }
}
