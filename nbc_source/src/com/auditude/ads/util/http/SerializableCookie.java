// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.http;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;

public class SerializableCookie
    implements Serializable
{

    private static final long serialVersionUID = 0x58765a8013aeb70cL;
    private transient BasicClientCookie clientCookie;
    private final transient Cookie cookie;

    public SerializableCookie(Cookie cookie1)
    {
        cookie = cookie1;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        clientCookie = new BasicClientCookie((String)objectinputstream.readObject(), (String)objectinputstream.readObject());
        clientCookie.setComment((String)objectinputstream.readObject());
        clientCookie.setDomain((String)objectinputstream.readObject());
        clientCookie.setExpiryDate((Date)objectinputstream.readObject());
        clientCookie.setPath((String)objectinputstream.readObject());
        clientCookie.setVersion(objectinputstream.readInt());
        clientCookie.setSecure(objectinputstream.readBoolean());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeObject(cookie.getName());
        objectoutputstream.writeObject(cookie.getValue());
        objectoutputstream.writeObject(cookie.getComment());
        objectoutputstream.writeObject(cookie.getDomain());
        objectoutputstream.writeObject(cookie.getExpiryDate());
        objectoutputstream.writeObject(cookie.getPath());
        objectoutputstream.writeInt(cookie.getVersion());
        objectoutputstream.writeBoolean(cookie.isSecure());
    }

    public Cookie getCookie()
    {
        Object obj = cookie;
        if (clientCookie != null)
        {
            obj = clientCookie;
        }
        return ((Cookie) (obj));
    }
}
