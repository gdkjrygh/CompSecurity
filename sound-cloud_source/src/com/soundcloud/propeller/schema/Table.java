// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.schema;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public interface Table
{
    public static final class PrimaryKey
        implements Iterable
    {

        private final List columns;

        public static transient PrimaryKey of(String as[])
        {
            return new PrimaryKey(as);
        }

        public final Iterator iterator()
        {
            return columns.iterator();
        }

        transient PrimaryKey(String as[])
        {
            columns = Arrays.asList(as);
        }
    }


    public abstract String name();

    public abstract PrimaryKey primaryKey();
}
