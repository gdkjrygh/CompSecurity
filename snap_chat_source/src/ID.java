// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;

public final class ID
{

    public static final String EMPTY_SERIALIZED_MAP = "{}";
    public static final Type MAP_STRING_STRING = (new TypeToken() {

    }).getType();
    private static final Gson sGson = It.a();

    public static Object a(String s, Type type)
    {
        return sGson.fromJson(s, type);
    }

    public static String a(Map map)
    {
        return sGson.toJson(map);
    }

}
