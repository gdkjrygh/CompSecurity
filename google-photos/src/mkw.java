// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONArray;

final class mkw extends mky
{

    mkw()
    {
        super((byte)0);
    }

    protected final Object a(JSONArray jsonarray)
    {
        return Integer.valueOf(jsonarray.optInt(1));
    }
}
