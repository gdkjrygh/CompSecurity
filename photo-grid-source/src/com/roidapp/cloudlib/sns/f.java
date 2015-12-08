// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.database.AbstractCursor;

final class f extends AbstractCursor
{

    private String a[];

    private transient f(String as[])
    {
        a = as;
    }

    f(String as[], byte byte0)
    {
        this(as);
    }

    protected final void checkPosition()
    {
        super.checkPosition();
    }

    public final String[] getColumnNames()
    {
        return a;
    }

    public final int getCount()
    {
        return 1;
    }

    public final double getDouble(int i)
    {
        return 0.0D;
    }

    public final float getFloat(int i)
    {
        return 0.0F;
    }

    public final int getInt(int i)
    {
        return 0;
    }

    public final long getLong(int i)
    {
        return 0L;
    }

    public final short getShort(int i)
    {
        return 0;
    }

    public final String getString(int i)
    {
        return null;
    }

    public final boolean isNull(int i)
    {
        return false;
    }
}
