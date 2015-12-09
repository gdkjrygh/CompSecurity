// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.provider;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

public final class TableJoiner
{

    private String mBaseTableName;
    private final ArrayList mJoinClauses = new ArrayList();

    public TableJoiner()
    {
        mBaseTableName = null;
    }

    public final TableJoiner base(String s)
    {
        boolean flag;
        if (mBaseTableName == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannot add multiple base tables!");
        mBaseTableName = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public final String build()
    {
        StringBuilder stringbuilder;
        boolean flag;
        if (mBaseTableName != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        stringbuilder = new StringBuilder(mBaseTableName);
        for (Iterator iterator = mJoinClauses.iterator(); iterator.hasNext(); stringbuilder.append((String)iterator.next())) { }
        return stringbuilder.toString();
    }

    public final TableJoiner join(String s, String s1, String s2)
    {
        mJoinClauses.add((new StringBuilder(" JOIN ")).append(s).append(" ON ").append(s1).append("=").append(s2).toString());
        return this;
    }

    public final TableJoiner outerJoin(String s, String s1, String s2)
    {
        mJoinClauses.add((new StringBuilder(" LEFT OUTER JOIN ")).append(s).append(" ON ").append(s1).append("=").append(s2).toString());
        return this;
    }
}
