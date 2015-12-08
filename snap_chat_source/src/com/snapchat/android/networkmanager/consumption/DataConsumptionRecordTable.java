// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.networkmanager.consumption;

import Br;
import Ch;
import Cn;
import Co;
import android.content.ContentValues;
import android.database.Cursor;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.table.DbTable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import tA;
import tt;

public final class DataConsumptionRecordTable extends DbTable
{
    public static final class DataConsumptionRecordSchema extends Enum
        implements tt
    {

        private static final DataConsumptionRecordSchema $VALUES[];
        public static final DataConsumptionRecordSchema EXPIRATION;
        public static final DataConsumptionRecordSchema ID;
        public static final DataConsumptionRecordSchema MEDIA_TYPE;
        public static final DataConsumptionRecordSchema REQUEST_ID;
        public static final DataConsumptionRecordSchema SIZE_IN_BYTES;
        public static final DataConsumptionRecordSchema TYPE;
        private int a;
        private String b;
        private DataType c;
        private String d;

        public static DataConsumptionRecordSchema valueOf(String s)
        {
            return (DataConsumptionRecordSchema)Enum.valueOf(com/snapchat/android/networkmanager/consumption/DataConsumptionRecordTable$DataConsumptionRecordSchema, s);
        }

        public static DataConsumptionRecordSchema[] values()
        {
            return (DataConsumptionRecordSchema[])$VALUES.clone();
        }

        public final String getColumnName()
        {
            return b;
        }

        public final int getColumnNumber()
        {
            return a;
        }

        public final String getConstraints()
        {
            return d;
        }

        public final DataType getDataType()
        {
            return c;
        }

        static 
        {
            ID = new DataConsumptionRecordSchema("ID", "contentKey", DataType.TEXT, "PRIMARY KEY");
            REQUEST_ID = new DataConsumptionRecordSchema("REQUEST_ID", 1, 1, "requestId", DataType.TEXT);
            TYPE = new DataConsumptionRecordSchema("TYPE", 2, 2, "type", DataType.TEXT);
            EXPIRATION = new DataConsumptionRecordSchema("EXPIRATION", 3, 3, "expiration", DataType.LONG);
            SIZE_IN_BYTES = new DataConsumptionRecordSchema("SIZE_IN_BYTES", 4, 4, "size_bytes", DataType.INTEGER);
            MEDIA_TYPE = new DataConsumptionRecordSchema("MEDIA_TYPE", 5, 5, "media_type", DataType.TEXT);
            $VALUES = (new DataConsumptionRecordSchema[] {
                ID, REQUEST_ID, TYPE, EXPIRATION, SIZE_IN_BYTES, MEDIA_TYPE
            });
        }

        private DataConsumptionRecordSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }

        private DataConsumptionRecordSchema(String s, String s1, DataType datatype, String s2)
        {
            super(s, 0);
            a = 0;
            b = s1;
            c = datatype;
            d = s2;
        }
    }


    private static final DataConsumptionRecordTable a = new DataConsumptionRecordTable();
    private final Co b;

    private DataConsumptionRecordTable()
    {
        this(Ch.a().a);
    }

    private DataConsumptionRecordTable(Co co)
    {
        b = co;
    }

    public static DataConsumptionRecordTable a()
    {
        return a;
    }

    protected final ContentValues a(Object obj)
    {
        obj = (Cn)obj;
        if (obj == null)
        {
            return null;
        } else
        {
            tA ta = new tA();
            ta.a(DataConsumptionRecordSchema.ID, ((Cn) (obj)).a);
            ta.a(DataConsumptionRecordSchema.REQUEST_ID, ((Cn) (obj)).b);
            ta.a(DataConsumptionRecordSchema.TYPE, ((Cn) (obj)).e);
            ta.a(DataConsumptionRecordSchema.MEDIA_TYPE, ((Cn) (obj)).f);
            ta.a(DataConsumptionRecordSchema.SIZE_IN_BYTES, ((Cn) (obj)).d);
            ta.a(DataConsumptionRecordSchema.EXPIRATION, ((Cn) (obj)).c);
            return ta.a;
        }
    }

    protected final Object a(Cursor cursor)
    {
        return new Cn(cursor.getString(DataConsumptionRecordSchema.ID.getColumnNumber()), cursor.getString(DataConsumptionRecordSchema.REQUEST_ID.getColumnNumber()), cursor.getString(DataConsumptionRecordSchema.TYPE.getColumnNumber()), cursor.getString(DataConsumptionRecordSchema.MEDIA_TYPE.getColumnNumber()), null, cursor.getInt(DataConsumptionRecordSchema.SIZE_IN_BYTES.getColumnNumber()), cursor.getLong(DataConsumptionRecordSchema.EXPIRATION.getColumnNumber()));
    }

    protected final Collection a(Br br)
    {
        return b.a();
    }

    public final void b(Br br)
    {
        Co co;
        Object obj;
        co = b;
        obj = a(null, null);
        br = ((Br) (co.b));
        br;
        JVM INSTR monitorenter ;
        obj = ((Collection) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Cn cn = (Cn)((Iterator) (obj)).next();
            if (cn.c > System.currentTimeMillis())
            {
                co.a.put(Co.a(cn), cn);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_83;
        Exception exception;
        exception;
        br;
        JVM INSTR monitorexit ;
        throw exception;
        br;
        JVM INSTR monitorexit ;
    }

    public final tt[] b()
    {
        return DataConsumptionRecordSchema.values();
    }

    public final String c()
    {
        return "DataConsumptionRecord";
    }

}
