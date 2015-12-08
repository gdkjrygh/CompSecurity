// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package au.com.bytecode.opencsv;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultSetHelper
{

    public abstract String[] getColumnNames(ResultSet resultset)
        throws SQLException;

    public abstract String[] getColumnValues(ResultSet resultset)
        throws SQLException, IOException;
}
