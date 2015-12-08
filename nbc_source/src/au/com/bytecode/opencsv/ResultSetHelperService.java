// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package au.com.bytecode.opencsv;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package au.com.bytecode.opencsv:
//            ResultSetHelper

public class ResultSetHelperService
    implements ResultSetHelper
{

    public static final int CLOBBUFFERSIZE = 2048;
    private static final int LONGNVARCHAR = -16;
    private static final int NCHAR = -15;
    private static final int NCLOB = 2011;
    private static final int NVARCHAR = -9;

    public ResultSetHelperService()
    {
    }

    private String getColumnValue(ResultSet resultset, int i, int j)
        throws SQLException, IOException
    {
        Object obj = "";
        i;
        JVM INSTR lookupswitch 23: default 200
    //                   -16: 350
    //                   -15: 350
    //                   -9: 350
    //                   -7: 217
    //                   -6: 300
    //                   -5: 275
    //                   -1: 350
    //                   1: 350
    //                   2: 285
    //                   3: 285
    //                   4: 300
    //                   5: 300
    //                   6: 285
    //                   7: 285
    //                   8: 285
    //                   12: 350
    //                   16: 232
    //                   91: 310
    //                   92: 320
    //                   93: 335
    //                   2000: 217
    //                   2005: 249
    //                   2011: 249;
           goto _L1 _L2 _L2 _L2 _L3 _L4 _L5 _L2 _L2 _L6 _L6 _L4 _L4 _L6 _L6 _L6 _L2 _L7 _L8 _L9 _L10 _L3 _L11 _L11
_L1:
        resultset = "";
_L13:
        obj = resultset;
        if (resultset == null)
        {
            obj = "";
        }
        return ((String) (obj));
_L3:
        resultset = handleObject(resultset.getObject(j));
        continue; /* Loop/switch isn't completed */
_L7:
        resultset = Boolean.valueOf(resultset.getBoolean(j)).toString();
        continue; /* Loop/switch isn't completed */
_L11:
        Clob clob = resultset.getClob(j);
        resultset = ((ResultSet) (obj));
        if (clob != null)
        {
            resultset = read(clob);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        resultset = handleLong(resultset, j);
        continue; /* Loop/switch isn't completed */
_L6:
        resultset = handleBigDecimal(resultset.getBigDecimal(j));
        continue; /* Loop/switch isn't completed */
_L4:
        resultset = handleInteger(resultset, j);
        continue; /* Loop/switch isn't completed */
_L8:
        resultset = handleDate(resultset, j);
        continue; /* Loop/switch isn't completed */
_L9:
        resultset = handleTime(resultset.getTime(j));
        continue; /* Loop/switch isn't completed */
_L10:
        resultset = handleTimestamp(resultset.getTimestamp(j));
        continue; /* Loop/switch isn't completed */
_L2:
        resultset = resultset.getString(j);
        if (true) goto _L13; else goto _L12
_L12:
    }

    private String handleBigDecimal(BigDecimal bigdecimal)
    {
        if (bigdecimal == null)
        {
            return "";
        } else
        {
            return bigdecimal.toString();
        }
    }

    private String handleDate(ResultSet resultset, int i)
        throws SQLException
    {
        java.sql.Date date = resultset.getDate(i);
        resultset = null;
        if (date != null)
        {
            resultset = (new SimpleDateFormat("dd-MMM-yyyy")).format(date);
        }
        return resultset;
    }

    private String handleInteger(ResultSet resultset, int i)
        throws SQLException
    {
        i = resultset.getInt(i);
        if (resultset.wasNull())
        {
            return "";
        } else
        {
            return Integer.toString(i);
        }
    }

    private String handleLong(ResultSet resultset, int i)
        throws SQLException
    {
        long l = resultset.getLong(i);
        if (resultset.wasNull())
        {
            return "";
        } else
        {
            return Long.toString(l);
        }
    }

    private String handleObject(Object obj)
    {
        if (obj == null)
        {
            return "";
        } else
        {
            return String.valueOf(obj);
        }
    }

    private String handleTime(Time time)
    {
        if (time == null)
        {
            return null;
        } else
        {
            return time.toString();
        }
    }

    private String handleTimestamp(Timestamp timestamp)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        if (timestamp == null)
        {
            return null;
        } else
        {
            return simpledateformat.format(timestamp);
        }
    }

    private static String read(Clob clob)
        throws SQLException, IOException
    {
        StringBuilder stringbuilder = new StringBuilder((int)clob.length());
        clob = clob.getCharacterStream();
        char ac[] = new char[2048];
        do
        {
            int i = clob.read(ac, 0, ac.length);
            if (i != -1)
            {
                stringbuilder.append(ac, 0, i);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    public String[] getColumnNames(ResultSet resultset)
        throws SQLException
    {
        ArrayList arraylist = new ArrayList();
        resultset = resultset.getMetaData();
        for (int i = 0; i < resultset.getColumnCount(); i++)
        {
            arraylist.add(resultset.getColumnName(i + 1));
        }

        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public String[] getColumnValues(ResultSet resultset)
        throws SQLException, IOException
    {
        ArrayList arraylist = new ArrayList();
        ResultSetMetaData resultsetmetadata = resultset.getMetaData();
        for (int i = 0; i < resultsetmetadata.getColumnCount(); i++)
        {
            arraylist.add(getColumnValue(resultset, resultsetmetadata.getColumnType(i + 1), i + 1));
        }

        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }
}
