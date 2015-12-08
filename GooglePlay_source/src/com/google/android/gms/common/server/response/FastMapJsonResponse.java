// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse

public abstract class FastMapJsonResponse extends FastJsonResponse
{

    public final HashMap mValues = new HashMap();

    public FastMapJsonResponse()
    {
    }

    public final Object getValueObject(String s)
    {
        return mValues.get(s);
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return mValues.containsKey(s);
    }

    public final void setBigDecimal(String s, BigDecimal bigdecimal)
    {
        mValues.put(s, bigdecimal);
    }

    public final void setBigDecimals(String s, ArrayList arraylist)
    {
        mValues.put(s, arraylist);
    }

    public final void setBigInteger(String s, BigInteger biginteger)
    {
        mValues.put(s, biginteger);
    }

    public final void setBigIntegers(String s, ArrayList arraylist)
    {
        mValues.put(s, arraylist);
    }

    public final void setBoolean(String s, boolean flag)
    {
        mValues.put(s, Boolean.valueOf(flag));
    }

    public final void setBooleans(String s, ArrayList arraylist)
    {
        mValues.put(s, arraylist);
    }

    public final void setDecodedBytes(String s, byte abyte0[])
    {
        mValues.put(s, abyte0);
    }

    public final void setDouble(String s, double d)
    {
        mValues.put(s, Double.valueOf(d));
    }

    public final void setDoubles(String s, ArrayList arraylist)
    {
        mValues.put(s, arraylist);
    }

    protected final void setFloat(String s, float f)
    {
        mValues.put(s, Float.valueOf(f));
    }

    protected final void setFloats(String s, ArrayList arraylist)
    {
        mValues.put(s, arraylist);
    }

    public final void setInteger(String s, int i)
    {
        mValues.put(s, Integer.valueOf(i));
    }

    public final void setIntegers(String s, ArrayList arraylist)
    {
        mValues.put(s, arraylist);
    }

    public final void setLong(String s, long l)
    {
        mValues.put(s, Long.valueOf(l));
    }

    public final void setLongs(String s, ArrayList arraylist)
    {
        mValues.put(s, arraylist);
    }

    public final void setString(String s, String s1)
    {
        mValues.put(s, s1);
    }

    public final void setStringMap(String s, Map map)
    {
        mValues.put(s, map);
    }

    public final void setStrings(String s, ArrayList arraylist)
    {
        mValues.put(s, arraylist);
    }
}
