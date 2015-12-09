// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;


// Referenced classes of package com.google.android.libraries.bind.data:
//            DataException

public final class DataChange
{

    public static final DataChange AFFECTS_PRIMARY_KEY = new DataChange(false, true);
    public static final DataChange DOESNT_AFFECT_PRIMARY_KEY = new DataChange(false, false);
    public static final DataChange INVALIDATION = new DataChange(true, true);
    public final boolean affectsPrimaryKey;
    public final boolean hasRefreshException;
    public final boolean isInvalidation;
    public final DataException refreshException;

    public DataChange(DataException dataexception)
    {
        isInvalidation = true;
        affectsPrimaryKey = true;
        hasRefreshException = true;
        refreshException = dataexception;
    }

    private DataChange(boolean flag, boolean flag1)
    {
        isInvalidation = flag;
        affectsPrimaryKey = flag1;
        hasRefreshException = false;
        refreshException = null;
    }

    public final String toString()
    {
        return String.format("isInvalidation: %b, affectsPrimaryKey: %b, exception: %s", new Object[] {
            Boolean.valueOf(isInvalidation), Boolean.valueOf(affectsPrimaryKey), refreshException
        });
    }

}
