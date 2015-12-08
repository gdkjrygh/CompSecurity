// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;

import android.content.ContentValues;

// Referenced classes of package com.soundcloud.propeller:
//            WriteResult, PropellerWriteException

public class ChangeResult extends WriteResult
{

    private final int rowsAffected;

    public ChangeResult(int i)
    {
        rowsAffected = i;
    }

    static ChangeResult failedDelete(String s, Throwable throwable)
    {
        return (ChangeResult)unchanged().fail(new PropellerWriteException((new StringBuilder("DELETE from ")).append(s).append(" failed").toString(), throwable));
    }

    static ChangeResult failedUpdate(String s, Throwable throwable, ContentValues contentvalues)
    {
        return (ChangeResult)unchanged().fail(new PropellerWriteException((new StringBuilder("UPDATE ")).append(s).append(" failed").toString(), contentvalues, throwable));
    }

    static ChangeResult unchanged()
    {
        return new ChangeResult(0);
    }

    public int getNumRowsAffected()
    {
        return rowsAffected;
    }
}
