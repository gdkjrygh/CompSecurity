// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.HttpCookie;

public class SerializableHttpCookie
    implements Serializable
{

    private static final long serialVersionUID = 0xac0501b04dfa7c20L;
    transient HttpCookie a;

    public SerializableHttpCookie(HttpCookie httpcookie)
    {
        a = httpcookie;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        a = new HttpCookie((String)objectinputstream.readObject(), (String)objectinputstream.readObject());
        a.setComment((String)objectinputstream.readObject());
        a.setCommentURL((String)objectinputstream.readObject());
        a.setDiscard(objectinputstream.readBoolean());
        a.setDomain((String)objectinputstream.readObject());
        a.setMaxAge(objectinputstream.readLong());
        a.setPath((String)objectinputstream.readObject());
        a.setPortlist((String)objectinputstream.readObject());
        a.setSecure(objectinputstream.readBoolean());
        a.setVersion(objectinputstream.readInt());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeObject(a.getName());
        objectoutputstream.writeObject(a.getValue());
        objectoutputstream.writeObject(a.getComment());
        objectoutputstream.writeObject(a.getCommentURL());
        objectoutputstream.writeBoolean(a.getDiscard());
        objectoutputstream.writeObject(a.getDomain());
        objectoutputstream.writeLong(a.getMaxAge());
        objectoutputstream.writeObject(a.getPath());
        objectoutputstream.writeObject(a.getPortlist());
        objectoutputstream.writeBoolean(a.getSecure());
        objectoutputstream.writeInt(a.getVersion());
    }
}
