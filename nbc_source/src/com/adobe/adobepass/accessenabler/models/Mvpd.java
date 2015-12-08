// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.models;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Mvpd
    implements Serializable
{

    private boolean authPerAggregator;
    private String displayName;
    private String id;
    private String logoUrl;
    private boolean passiveAuthnEnabled;
    private String spUrl;

    public Mvpd()
    {
    }

    public Mvpd(String s, String s1, String s2, String s3, boolean flag, boolean flag1)
    {
        id = s;
        displayName = s1;
        logoUrl = s2;
        spUrl = s3;
        authPerAggregator = flag;
        passiveAuthnEnabled = flag1;
    }

    public static Mvpd deserialze(String s)
        throws IOException, ClassNotFoundException
    {
        s = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(s, 0)));
        Mvpd mvpd = (Mvpd)s.readObject();
        s.close();
        return mvpd;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Mvpd))
        {
            return false;
        } else
        {
            return id.equals(((Mvpd)obj).getId());
        }
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getId()
    {
        return id;
    }

    public String getLogoUrl()
    {
        return logoUrl;
    }

    public String getSpUrl()
    {
        return spUrl;
    }

    public boolean hasAuthPerAggregator()
    {
        return authPerAggregator;
    }

    public boolean hasPassiveAuthnEnabled()
    {
        return passiveAuthnEnabled;
    }

    public String serialize()
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(this);
        objectoutputstream.close();
        return new String(Base64.encode(bytearrayoutputstream.toByteArray(), 0));
    }

    public void setDisplayName(String s)
    {
        displayName = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLogoUrl(String s)
    {
        logoUrl = s;
    }

    public void setSpUrl(String s)
    {
        spUrl = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append(id).append("(^)").append(displayName).append("(^)").append(logoUrl).append("(^)").append(spUrl).toString();
    }
}
