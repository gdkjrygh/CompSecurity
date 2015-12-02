// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;


public final class t extends Enum
{

    private static final t $VALUES[];
    public static final t ENTITY;
    public static final t JSON;
    public static final t JSONPARSER;
    public static final t STRING;

    private t(String s, int i)
    {
        super(s, i);
    }

    public static t valueOf(String s)
    {
        return (t)Enum.valueOf(com/facebook/http/protocol/t, s);
    }

    public static t[] values()
    {
        return (t[])$VALUES.clone();
    }

    static 
    {
        STRING = new t("STRING", 0);
        JSON = new t("JSON", 1);
        JSONPARSER = new t("JSONPARSER", 2);
        ENTITY = new t("ENTITY", 3);
        $VALUES = (new t[] {
            STRING, JSON, JSONPARSER, ENTITY
        });
    }
}
