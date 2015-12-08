// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import com.dominos.android.sdk.common.json.ExceptionErrorListener;
import com.dominos.android.sdk.common.json.JSONValidatingImmutableReader;
import com.dominos.android.sdk.common.json.JSONWriter;
import java.util.Map;

public class Json
{

    private Json()
    {
    }

    public static Map parse(String s)
    {
        return (Map)parseObj(s);
    }

    public static Object parseObj(String s)
    {
        return (new JSONValidatingImmutableReader(new ExceptionErrorListener())).read(s);
    }

    public static boolean same(String s, String s1)
    {
        return parse(s).equals(parse(s1));
    }

    public static String toString(Object obj)
    {
        return (new JSONWriter()).write(obj);
    }
}
