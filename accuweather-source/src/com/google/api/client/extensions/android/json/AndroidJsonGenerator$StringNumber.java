// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.extensions.android.json;


// Referenced classes of package com.google.api.client.extensions.android.json:
//            AndroidJsonGenerator

static final class encodedValue extends Number
{

    private static final long serialVersionUID = 1L;
    private final String encodedValue;

    public double doubleValue()
    {
        return 0.0D;
    }

    public float floatValue()
    {
        return 0.0F;
    }

    public int intValue()
    {
        return 0;
    }

    public long longValue()
    {
        return 0L;
    }

    public String toString()
    {
        return encodedValue;
    }

    (String s)
    {
        encodedValue = s;
    }
}
