// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;

import java.security.MessageDigest;
import org.json.JSONObject;

public class AuthDetails
{

    private long expires;
    private String mac;
    private String salt;
    private String signature;
    private String token;
    private long userId;

    public AuthDetails()
    {
    }

    private static String bytesToHexString(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            String s = Integer.toHexString(abyte0[i] & 0xff);
            if (s.length() == 1)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(s);
        }

        return stringbuilder.toString();
    }

    public void calculateSignature(Long long1, String s, String s1)
    {
        long1 = (new StringBuilder()).append(String.valueOf(long1)).append(s1).append(userId).append(salt).append(expires).append(s).toString();
        s = MessageDigest.getInstance("SHA-256");
        s.update(long1.getBytes());
        signature = bytesToHexString(s.digest());
    }

    public Long getExpires()
    {
        return Long.valueOf(expires);
    }

    public String getMac()
    {
        return mac;
    }

    public String getSalt()
    {
        return salt;
    }

    public String getSignature()
    {
        return signature;
    }

    public String getToken()
    {
        return token;
    }

    public Long getUserId()
    {
        return Long.valueOf(userId);
    }

    public void setExpires(Long long1)
    {
        expires = long1.longValue();
    }

    public void setMac(String s)
    {
        mac = s;
    }

    public void setSalt(String s)
    {
        salt = s;
    }

    public void setSignature(String s)
    {
        signature = s;
    }

    public void setToken(String s)
    {
        token = s;
    }

    public void setUserId(Long long1)
    {
        userId = long1.longValue();
    }

    public JSONObject toJSON()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("userId", userId);
        jsonobject.put("expires", expires);
        jsonobject.put("salt", salt);
        jsonobject.put("signature", signature);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder("AuthDetails{userId=")).append(userId).append(", expires=").append(expires).append(", salt='").append(salt).append('\'').append(", signature='").append(signature).append('\'').append('}').toString();
    }
}
