// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.scan;

import java.util.Arrays;

// Referenced classes of package com.kik.scan:
//            KikCode

public class GroupKikCode extends KikCode
{

    private byte _inviteCode[];

    public GroupKikCode(byte abyte0[], int i)
    {
        super(3, i);
        _inviteCode = abyte0;
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
        if (!(obj instanceof GroupKikCode))
        {
            return false;
        }
        GroupKikCode groupkikcode = (GroupKikCode)obj;
        if (!super.equals(obj))
        {
            return false;
        }
        if (_inviteCode == null || groupkikcode._inviteCode == null)
        {
            if (_inviteCode != groupkikcode._inviteCode)
            {
                return false;
            }
        } else
        if (!Arrays.equals(_inviteCode, groupkikcode._inviteCode))
        {
            return false;
        }
        return true;
    }

    public byte[] getInviteCode()
    {
        return _inviteCode;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(", inviteCode=").append(_inviteCode).toString();
    }
}
