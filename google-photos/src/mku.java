// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONArray;

final class mku extends mky
{

    mku()
    {
        super((byte)0);
    }

    protected final Object a(JSONArray jsonarray)
    {
        return Float.valueOf((float)jsonarray.optDouble(1));
    }
}
