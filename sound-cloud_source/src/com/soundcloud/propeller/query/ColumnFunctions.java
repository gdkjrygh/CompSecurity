// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;

import com.soundcloud.propeller.schema.Column;

// Referenced classes of package com.soundcloud.propeller.query:
//            Count, Exists, Query

public final class ColumnFunctions
{

    private ColumnFunctions()
    {
    }

    static void aliasColumn(StringBuilder stringbuilder, String s)
    {
        if (s != null)
        {
            stringbuilder.append(" AS ").append(s);
        }
    }

    public static Count count(Column column)
    {
        return new Count(column.qualifiedName());
    }

    public static Count count(String s)
    {
        return new Count(s);
    }

    public static Exists exists(Query query)
    {
        return new Exists(query);
    }
}
