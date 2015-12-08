// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import Br;
import PB;
import PW;
import PX;
import TT;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.database.table.DbTable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tA;
import ts;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            EditionChunkTable, EditionStatus

public final class EditionTable extends DbTable
{
    public static final class EditionSchema extends Enum
        implements tt
    {

        private static final EditionSchema $VALUES[];
        public static final EditionSchema ID;
        public static final EditionSchema PUBLISHER_NAME;
        public static final EditionSchema STATUS;
        public static final EditionSchema TIME_ADDED;
        private String a;
        private DataType b;
        private String c;

        static String a(EditionSchema editionschema)
        {
            return editionschema.a;
        }

        static DataType b(EditionSchema editionschema)
        {
            return editionschema.b;
        }

        public static EditionSchema valueOf(String s)
        {
            return (EditionSchema)Enum.valueOf(com/snapchat/android/discover/model/database/table/EditionTable$EditionSchema, s);
        }

        public static EditionSchema[] values()
        {
            return (EditionSchema[])$VALUES.clone();
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
            ID = new EditionSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            PUBLISHER_NAME = new EditionSchema("PUBLISHER_NAME", 1, "publisher_name", DataType.TEXT);
            TIME_ADDED = new EditionSchema("TIME_ADDED", 2, "time_added", DataType.INTEGER);
            STATUS = new EditionSchema("STATUS", 3, "status", DataType.TEXT);
            $VALUES = (new EditionSchema[] {
                ID, PUBLISHER_NAME, TIME_ADDED, STATUS
            });
        }

        private EditionSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private EditionSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }

