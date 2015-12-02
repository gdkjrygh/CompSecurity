// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.f;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class h
{

    public static Object a(String s)
    {
        Object obj;
        try
        {
            s = new ByteArrayInputStream(s.getBytes("ISO-8859-1"));
            ObjectInputStream objectinputstream = new ObjectInputStream(s);
            obj = objectinputstream.readObject();
            objectinputstream.close();
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("SerializeTools", "Exception", s);
            return null;
        }
        return obj;
    }

    public static String a(Object obj)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
            objectoutputstream.writeObject(obj);
            obj = bytearrayoutputstream.toByteArray();
            objectoutputstream.flush();
            objectoutputstream.close();
            obj = new String(((byte []) (obj)), "ISO-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("SerializeTools", "IOException", ((Throwable) (obj)));
            return "";
        }
        return ((String) (obj));
    }
}
