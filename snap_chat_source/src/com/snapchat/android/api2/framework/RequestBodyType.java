// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.framework;

import java.io.File;
import oL;
import oY;
import pd;
import pm;

public final class RequestBodyType extends Enum
{

    private static final RequestBodyType $VALUES[];
    public static final RequestBodyType BYTE_ARRAY;
    public static final RequestBodyType FILE;
    public static final RequestBodyType FORM_ENCODED;
    public static final RequestBodyType JSON_ENCODED;
    public static final RequestBodyType MULTI_PART_ENCODED;
    public static final RequestBodyType UNKNOWN;

    private RequestBodyType(String s, int i)
    {
        super(s, i);
    }

    public static RequestBodyType typeOf(Object obj)
    {
        Class class1 = obj.getClass();
        if (obj instanceof pm)
        {
            return ((pm)obj).mType;
        }
        if (class1.getAnnotation(oY) != null)
        {
            return JSON_ENCODED;
        }
        if (class1.getAnnotation(oL) != null)
        {
            return FORM_ENCODED;
        }
        if (class1.getAnnotation(pd) != null)
        {
            return MULTI_PART_ENCODED;
        }
        if (obj instanceof byte[])
        {
            return BYTE_ARRAY;
        }
        if (obj instanceof File)
        {
            return FILE;
        } else
        {
            return UNKNOWN;
        }
    }

    public static RequestBodyType valueOf(String s)
    {
        return (RequestBodyType)Enum.valueOf(com/snapchat/android/api2/framework/RequestBodyType, s);
    }

    public static RequestBodyType[] values()
    {
        return (RequestBodyType[])$VALUES.clone();
    }

    static 
    {
        FORM_ENCODED = new RequestBodyType("FORM_ENCODED", 0);
        JSON_ENCODED = new RequestBodyType("JSON_ENCODED", 1);
        MULTI_PART_ENCODED = new RequestBodyType("MULTI_PART_ENCODED", 2);
        BYTE_ARRAY = new RequestBodyType("BYTE_ARRAY", 3);
        FILE = new RequestBodyType("FILE", 4);
        UNKNOWN = new RequestBodyType("UNKNOWN", 5);
        $VALUES = (new RequestBodyType[] {
            FORM_ENCODED, JSON_ENCODED, MULTI_PART_ENCODED, BYTE_ARRAY, FILE, UNKNOWN
        });
    }
}
