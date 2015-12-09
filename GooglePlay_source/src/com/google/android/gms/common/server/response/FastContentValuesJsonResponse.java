// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.content.ContentValues;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse

public abstract class FastContentValuesJsonResponse extends FastJsonResponse
{

    public final ContentValues mValues = new ContentValues();

    public FastContentValuesJsonResponse()
    {
    }

    protected final Object getValueObject(String s)
    {
        return mValues.get(s);
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return mValues.containsKey(s);
    }

    public final void setBoolean(String s, boolean flag)
    {
        mValues.put(s, Boolean.valueOf(flag));
    }

    protected final void setDecodedBytes(String s, byte abyte0[])
    {
        mValues.put(s, abyte0);
    }

    protected final void setDouble(String s, double d)
    {
        mValues.put(s, Double.valueOf(d));
    }

    protected final void setFloat(String s, float f)
    {
        mValues.put(s, Float.valueOf(f));
    }

    protected final void setInteger(String s, int i)
    {
        mValues.put(s, Integer.valueOf(i));
    }

    public final void setLong(String s, long l)
    {
        mValues.put(s, Long.valueOf(l));
    }

    public final void setString(String s, String s1)
    {
        mValues.put(s, s1);
    }
}
