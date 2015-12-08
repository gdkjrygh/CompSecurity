// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Set;

public final class ColumnSpec
{
    public static final class Builder
    {

        final ArrayMap mColumns;

        public final ColumnSpec build()
        {
            return new ColumnSpec(this, (byte)0);
        }

        public final Builder withColumn(String s, DataType datatype)
        {
            if (mColumns.containsKey(s))
            {
                boolean flag;
                if ((DataType)mColumns.get(s) == datatype)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Cannot add the same column with different types!");
            }
            mColumns.put(s, datatype);
            return this;
        }

        public final Builder withColumnsFrom(ColumnSpec columnspec)
        {
            String s;
            for (Iterator iterator = columnspec.mColumns.keySet().iterator(); iterator.hasNext(); withColumn(s, (DataType)columnspec.mColumns.get(s)))
            {
                s = (String)iterator.next();
            }

            return this;
        }

        private Builder()
        {
            mColumns = new ArrayMap();
        }

        Builder(byte byte0)
        {
            this();
        }
    }

    public static final class DataType extends Enum
    {

        private static final DataType $VALUES[];
        public static final DataType BLOB;
        public static final DataType BOOLEAN;
        public static final DataType INTEGER;
        public static final DataType LONG;
        public static final DataType STRING;

        public static DataType valueOf(String s)
        {
            return (DataType)Enum.valueOf(com/google/android/gms/games/provider/ColumnSpec$DataType, s);
        }

        public static DataType[] values()
        {
            return (DataType[])$VALUES.clone();
        }

        public final String toSQLiteDataType()
        {
            static final class _cls1
            {

                static final int $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[];

                static 
                {
                    $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType = new int[DataType.values().length];
                    try
                    {
                        $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[DataType.BOOLEAN.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[DataType.INTEGER.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[DataType.LONG.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[DataType.BLOB.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[DataType.STRING.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.google.android.gms.games.provider.ColumnSpec.DataType[ordinal()])
            {
            default:
                return "TEXT";

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                return "INTEGER";

            case 4: // '\004'
                return "BLOB";
            }
        }

        static 
        {
            STRING = new DataType("STRING", 0);
            BOOLEAN = new DataType("BOOLEAN", 1);
            INTEGER = new DataType("INTEGER", 2);
            LONG = new DataType("LONG", 3);
            BLOB = new DataType("BLOB", 4);
            $VALUES = (new DataType[] {
                STRING, BOOLEAN, INTEGER, LONG, BLOB
            });
        }

        private DataType(String s, int i)
        {
            super(s, i);
        }
    }


    public final String mColumnNames[];
    final ArrayMap mColumns;

    private ColumnSpec(Builder builder1)
    {
        mColumns = builder1.mColumns;
        mColumnNames = new String[mColumns.size()];
        int i = 0;
        for (builder1 = mColumns.keySet().iterator(); builder1.hasNext();)
        {
            String s = (String)builder1.next();
            mColumnNames[i] = s;
            i++;
        }

    }

    ColumnSpec(Builder builder1, byte byte0)
    {
        this(builder1);
    }

    public static Builder builder()
    {
        return new Builder((byte)0);
    }

    public final ContentValues extractRowValues(Cursor cursor)
    {
        ContentValues contentvalues;
        int i;
        contentvalues = new ContentValues();
        i = 0;
_L7:
        String s;
        DataType datatype;
        int j;
        if (i >= mColumnNames.length)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        s = mColumnNames[i];
        j = cursor.getColumnIndex(s);
        datatype = getColumnDataType(s);
        _cls1..SwitchMap.com.google.android.gms.games.provider.ColumnSpec.DataType[datatype.ordinal()];
        JVM INSTR tableswitch 1 5: default 88
    //                   1 173
    //                   2 135
    //                   3 154
    //                   4 88
    //                   5 113;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L2:
        break MISSING_BLOCK_LABEL_173;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Type should not be in cursor: ")).append(datatype).toString());
_L5:
        contentvalues.put(s, cursor.getString(j));
_L8:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        contentvalues.put(s, Integer.valueOf(cursor.getInt(j)));
          goto _L8
_L4:
        contentvalues.put(s, Long.valueOf(cursor.getLong(j)));
          goto _L8
        boolean flag;
        if (cursor.getLong(j) == 1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        contentvalues.put(s, Boolean.valueOf(flag));
          goto _L8
        return contentvalues;
    }

    public final DataType getColumnDataType(String s)
    {
        Preconditions.checkState(mColumns.containsKey(s), "No entry for column %s", new Object[] {
            s
        });
        return (DataType)mColumns.get(s);
    }
}
