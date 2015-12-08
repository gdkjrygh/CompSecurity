// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import com.google.gson.Gson;

public class SerializationUtils
{

    static Gson gson;

    public SerializationUtils()
    {
    }

    public static Object clone(Object obj)
    {
        try
        {
            String s = gson.a(obj);
            obj = gson.a(s, obj.getClass());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return obj;
    }

    public static String serialize(Object obj)
    {
        return gson.a(obj);
    }
}
