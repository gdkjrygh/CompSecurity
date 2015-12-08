// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.scan;


// Referenced classes of package com.kik.scan:
//            KikCode

public class UsernameKikCode extends KikCode
{

    private int _nonce;
    private String _username;

    public UsernameKikCode(String s, int i, int j)
    {
        super(1, j);
        _username = s;
        _nonce = i;
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
        if (!(obj instanceof UsernameKikCode))
        {
            return false;
        }
        UsernameKikCode usernamekikcode = (UsernameKikCode)obj;
        if (!super.equals(obj))
        {
            return false;
        }
        if (_username == null || usernamekikcode._username == null)
        {
            if (_username != usernamekikcode._username)
            {
                return false;
            }
        } else
        {
            if (!_username.equals(usernamekikcode._username))
            {
                return false;
            }
            if (_nonce != usernamekikcode._nonce)
            {
                return false;
            }
        }
        return true;
    }

    public int getNonce()
    {
        return _nonce;
    }

    public String getUsername()
    {
        return _username;
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(", username=").append(_username).append(", nonce=").append(_nonce).toString();
    }
}
