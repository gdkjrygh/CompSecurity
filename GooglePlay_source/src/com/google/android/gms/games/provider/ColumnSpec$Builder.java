// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.provider:
//            ColumnSpec

public static final class <init>
{

    final ArrayMap mColumns;

    public final ColumnSpec build()
    {
        return new ColumnSpec(this, (byte)0);
    }

    public final  withColumn(String s,  )
    {
        if (mColumns.containsKey(s))
        {
            boolean flag;
            if (()mColumns.get(s) == )
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Cannot add the same column with different types!");
        }
        mColumns.put(s, );
        return this;
    }

    public final mColumns withColumnsFrom(ColumnSpec columnspec)
    {
        String s;
        for (Iterator iterator = columnspec.mColumns.keySet().iterator(); iterator.hasNext(); withColumn(s, ()columnspec.mColumns.get(s)))
        {
            s = (String)iterator.next();
        }

        return this;
    }

    private ()
    {
        mColumns = new ArrayMap();
    }

    mColumns(byte byte0)
    {
        this();
    }
}
