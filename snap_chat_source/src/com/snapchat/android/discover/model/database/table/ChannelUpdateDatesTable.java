// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import Br;
import PB;
import alV;
import als;
import android.content.ContentValues;
import android.database.Cursor;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.table.DbTable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tA;
import tt;
import vn;
import vo;

public final class ChannelUpdateDatesTable extends DbTable
{
    public static final class ChannelUpdateDatesSchema extends Enum
        implements tt
    {

        private static final ChannelUpdateDatesSchema $VALUES[];
        public static final ChannelUpdateDatesSchema DATE_UPDATED;
        public static final ChannelUpdateDatesSchema ID;
        public static final ChannelUpdateDatesSchema PUBLISHER_INTERNATIONAL_NAME;
        public static final ChannelUpdateDatesSchema PUBLISHER_NAME;
        private String a;
        private DataType b;
        private String c;

        public static ChannelUpdateDatesSchema valueOf(String s)
        {
            return (ChannelUpdateDatesSchema)Enum.valueOf(com/snapchat/android/discover/model/database/table/ChannelUpdateDatesTable$ChannelUpdateDatesSchema, s);
        }

        public static ChannelUpdateDatesSchema[] values()
        {
            return (ChannelUpdateDatesSchema[])$VALUES.clone();
        }

        public final String getColumnName()
        {
            return a;
        }

        public final int getColumnNumber()
        {
            return ordinal();
        }

        public final String getConstraints()
        {
            return c;
        }

        public final DataType getDataType()
        {
            return b;
        }

        static 
        {
            ID = new ChannelUpdateDatesSchema("ID", "_id", DataType.INTEGER, "PRIMARY KEY");
            PUBLISHER_NAME = new ChannelUpdateDatesSchema("PUBLISHER_NAME", 1, "publisher_name", DataType.TEXT);
            PUBLISHER_INTERNATIONAL_NAME = new ChannelUpdateDatesSchema("PUBLISHER_INTERNATIONAL_NAME", 2, "publisher_international_name", DataType.TEXT);
            DATE_UPDATED = new ChannelUpdateDatesSchema("DATE_UPDATED", 3, "date_updated", DataType.LONG);
            $VALUES = (new ChannelUpdateDatesSchema[] {
                ID, PUBLISHER_NAME, PUBLISHER_INTERNATIONAL_NAME, DATE_UPDATED
            });
        }

        private ChannelUpdateDatesSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private ChannelUpdateDatesSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }

    public static final class a
    {

        public final String a;
        public final String b;
        public final long c;

        public a(String s, String s1, long l)
        {
            a = s;
            b = s1;
            c = l;
        }
    }

