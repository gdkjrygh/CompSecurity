// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.scan;

import java.util.Arrays;

// Referenced classes of package com.kik.scan:
//            KikCode

public class RemoteKikCode extends KikCode
{

    private byte _payloadId[];

    public RemoteKikCode(byte abyte0[], int i)
    {
        super(2, i);
        _payloadId = abyte0;
    }

    public byte[] encode()
    {
        if (!_isLoaded)
        {
            return null;
        } else
        {
            return encodeInternal();
        }
    }

    protected native byte[] encodeInternal();

    public boolean equals(Object obj)
    {
        if (!(obj instanceof RemoteKikCode))
        {
            return false;
        }
        RemoteKikCode remotekikcode = (RemoteKikCode)obj;
        if (!super.equals(obj))
        {
            return false;
        }
        if (_payloadId == null || remotekikcode._payloadId == null)
        {
            if (_payloadId != remotekikcode._payloadId)
            {
                return false;
            }
        } else
        if (!Arrays.equals(_payloadId, remotekikcode._payloadId))
        {
            return false;
        }
        return true;
    }

    public byte[] getPayloadId()
    {
        return _payloadId;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(", payloadId=").append(_payloadId).toString();
    }
}
