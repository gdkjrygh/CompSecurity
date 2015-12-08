// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package au.com.bytecode.opencsv.bean;

import au.com.bytecode.opencsv.CSVReader;
import java.io.IOException;

// Referenced classes of package au.com.bytecode.opencsv.bean:
//            HeaderColumnNameMappingStrategy

public class ColumnPositionMappingStrategy extends HeaderColumnNameMappingStrategy
{

    private String columnMapping[];

    public ColumnPositionMappingStrategy()
    {
        columnMapping = new String[0];
    }

    public void captureHeader(CSVReader csvreader)
        throws IOException
    {
    }

    public String[] getColumnMapping()
    {
        if (columnMapping != null)
        {
            return (String[])columnMapping.clone();
        } else
        {
            return null;
        }
    }

    protected String getColumnName(int i)
    {
        if (columnMapping != null && i < columnMapping.length)
        {
            return columnMapping[i];
        } else
        {
            return null;
        }
    }

    public void setColumnMapping(String as[])
    {
        if (as != null)
        {
            as = (String[])as.clone();
        } else
        {
            as = null;
        }
        columnMapping = as;
    }
}
