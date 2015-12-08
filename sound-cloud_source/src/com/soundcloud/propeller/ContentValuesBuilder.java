// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;

import android.content.ContentValues;
import com.soundcloud.propeller.schema.Column;

public final class ContentValuesBuilder
{

    private final ContentValues values;

    private ContentValuesBuilder(ContentValues contentvalues)
    {
        values = contentvalues;
    }

    public static ContentValuesBuilder values()
    {
        return new ContentValuesBuilder(new ContentValues());
    }

    public static ContentValuesBuilder values(int i)
    {
        return new ContentValuesBuilder(new ContentValues(i));
    }

    public final ContentValues get()
    {
        return values;
    }

    public final ContentValuesBuilder put(Column column, double d)
    {
        values.put(column.name(), Double.valueOf(d));
        return this;
    }

    public final ContentValuesBuilder put(Column column, float f)
    {
        values.put(column.name(), Float.valueOf(f));
        return this;
    }

    public final ContentValuesBuilder put(Column column, int i)
    {
        values.put(column.name(), Integer.valueOf(i));
        return this;
    }

    public final ContentValuesBuilder put(Column column, long l)
    {
        values.put(column.name(), Long.valueOf(l));
        return this;
    }

    public final ContentValuesBuilder put(Column column, String s)
    {
        values.put(column.name(), s);
        return this;
    }

    public final ContentValuesBuilder put(Column column, boolean flag)
    {
        values.put(column.name(), Boolean.valueOf(flag));
        return this;
    }

    public final ContentValuesBuilder put(String s, double d)
    {
        values.put(s, Double.valueOf(d));
        return this;
    }

    public final ContentValuesBuilder put(String s, float f)
    {
        values.put(s, Float.valueOf(f));
        return this;
    }

    public final ContentValuesBuilder put(String s, int i)
    {
        values.put(s, Integer.valueOf(i));
        return this;
    }

    public final ContentValuesBuilder put(String s, long l)
    {
        values.put(s, Long.valueOf(l));
        return this;
    }

    public final ContentValuesBuilder put(String s, String s1)
    {
        values.put(s, s1);
        return this;
    }

    public final ContentValuesBuilder put(String s, boolean flag)
    {
        values.put(s, Boolean.valueOf(flag));
        return this;
    }
}
