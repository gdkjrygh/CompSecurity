// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.entity;

import org.apache.http.HttpMessage;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;

public class DisallowIdentityContentLengthStrategy
    implements ContentLengthStrategy
{

    private final ContentLengthStrategy contentLengthStrategy;

    public DisallowIdentityContentLengthStrategy(ContentLengthStrategy contentlengthstrategy)
    {
        contentLengthStrategy = contentlengthstrategy;
    }

    public long determineLength(HttpMessage httpmessage)
    {
        long l = contentLengthStrategy.determineLength(httpmessage);
        if (l == -1L)
        {
            throw new ProtocolException("Identity transfer encoding cannot be used");
        } else
        {
            return l;
        }
    }
}
