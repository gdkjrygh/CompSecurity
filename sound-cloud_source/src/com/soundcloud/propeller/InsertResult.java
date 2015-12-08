// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;

import android.content.ContentValues;

// Referenced classes of package com.soundcloud.propeller:
//            WriteResult, PropellerWriteException

public class InsertResult extends WriteResult
{

    public static final int ID_NOT_SET = -1;
    private final long rowId;

    public InsertResult(long l)
    {
        rowId = l;
    }

    static InsertResult failedInsert(String s, int i, ContentValues contentvalues, Throwable throwable)
    {
        InsertResult insertresult = new InsertResult(-1L);
        switch (i)
        {
        default:
            return (InsertResult)insertresult.fail(new PropellerWriteException(contentvalues, throwable));

        case 5: // '\005'
            return (InsertResult)insertresult.fail(new PropellerWriteException((new StringBuilder("REPLACE on ")).append(s).append(" failed").toString(), contentvalues, throwable));

        case 4: // '\004'
            return (InsertResult)insertresult.fail(new PropellerWriteException((new StringBuilder("INSERT on ")).append(s).append(" failed (row existed, ignoring)").toString(), contentvalues, throwable));
        }
    }

    public long getRowId()
    {
        return rowId;
    }
}
