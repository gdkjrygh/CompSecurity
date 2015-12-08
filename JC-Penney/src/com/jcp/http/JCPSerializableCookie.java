// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.http;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.HttpCookie;

public class JCPSerializableCookie
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private HttpCookie cookie;

    public JCPSerializableCookie(HttpCookie httpcookie)
    {
        cookie = httpcookie;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        cookie = new HttpCookie((String)objectinputstream.readObject(), (String)objectinputstream.readObject());
        cookie.setComment((String)objectinputstream.readObject());
        cookie.setDomain((String)objectinputstream.readObject());
        cookie.setPath((String)objectinputstream.readObject());
        cookie.setVersion(objectinputstream.readInt());
        cookie.setSecure(objectinputstream.readBoolean());
        cookie.setMaxAge(objectinputstream.readLong());
        cookie.setPortlist((String)objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(cookie.getName());
        objectoutputstream.writeObject(cookie.getValue());
        objectoutputstream.writeObject(cookie.getComment());
        objectoutputstream.writeObject(cookie.getDomain());
        objectoutputstream.writeObject(cookie.getPath());
        objectoutputstream.writeInt(cookie.getVersion());
        objectoutputstream.writeBoolean(cookie.getSecure());
        objectoutputstream.writeLong(cookie.getMaxAge());
        objectoutputstream.writeObject(cookie.getPortlist());
    }

    public HttpCookie getCookie()
    {
        return cookie;
    }
}
