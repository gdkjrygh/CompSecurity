// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.datastore;


public final class Column extends Enum
{
    public static final class ColumnType extends Enum
    {

        private static final ColumnType $VALUES[];
        public static final ColumnType BLOB;
        public static final ColumnType INTEGER;
        public static final ColumnType LONG;
        public static final ColumnType REAL;
        public static final ColumnType TEXT;
        private String defaultValue;

        public static ColumnType valueOf(String s)
        {
            return (ColumnType)Enum.valueOf(com/google/android/apps/wallet/datastore/Column$ColumnType, s);
        }

        public static ColumnType[] values()
        {
            return (ColumnType[])$VALUES.clone();
        }

        protected final String getDefaultValue()
        {
            return defaultValue;
        }

        static 
        {
            BLOB = new ColumnType("BLOB", 0, "NULL");
            INTEGER = new ColumnType("INTEGER", 1, "0");
            LONG = new ColumnType("LONG", 2, "0");
            REAL = new ColumnType("REAL", 3, "0.0");
            TEXT = new ColumnType("TEXT", 4, "NULL");
            $VALUES = (new ColumnType[] {
                BLOB, INTEGER, LONG, REAL, TEXT
            });
        }

        private ColumnType(String s, int i, String s1)
        {
            super(s, i);
            defaultValue = s1;
        }
    }


    private static final Column $VALUES[];
    public static final Column DISPLAY_ORDER;
    public static final Column FB_ADDRESS;
    public static final Column HEAD_STATE;
    public static final Column ID;
    public static final Column INTEGER_ID;
    public static final Column IS_INSIDE_CACHE_HEAD;
    public static final Column NEXT_PAGE_TOKEN;
    public static final Column NOTIFICATION_TIME;
    public static final Column NOTIFICATION_TYPE;
    public static final Column PROTO;
    public static final Column SORT_KEY;
    public static final Column WOB_CATEGORY;
    private final String columnName;
    private final ColumnType columnType;
    private final boolean indexed;

    private Column(String s, int i, String s1, ColumnType columntype)
    {
        this(s, i, s1, columntype, false);
    }

    private Column(String s, int i, String s1, ColumnType columntype, boolean flag)
    {
        super(s, i);
        columnName = s1;
        columnType = columntype;
        indexed = flag;
    }

    public static Column valueOf(String s)
    {
        return (Column)Enum.valueOf(com/google/android/apps/wallet/datastore/Column, s);
    }

    public static Column[] values()
    {
        return (Column[])$VALUES.clone();
    }

    public final String getColumnName()
    {
        return columnName;
    }

    public final ColumnType getColumnType()
    {
        return columnType;
    }

    public final String getDefaultValue()
    {
        return columnType.getDefaultValue();
    }

    public final boolean isIndexed()
    {
        return indexed;
    }

    static 
    {
        ID = new Column("ID", 0, "id", ColumnType.TEXT);
        INTEGER_ID = new Column("INTEGER_ID", 1, "id", ColumnType.INTEGER);
        PROTO = new Column("PROTO", 2, "proto", ColumnType.BLOB);
        DISPLAY_ORDER = new Column("DISPLAY_ORDER", 3, "display_order", ColumnType.LONG);
        FB_ADDRESS = new Column("FB_ADDRESS", 4, "address", ColumnType.INTEGER);
        NOTIFICATION_TYPE = new Column("NOTIFICATION_TYPE", 5, "notification_type", ColumnType.LONG);
        NOTIFICATION_TIME = new Column("NOTIFICATION_TIME", 6, "notification_time", ColumnType.LONG);
        SORT_KEY = new Column("SORT_KEY", 7, "sort_key", ColumnType.TEXT);
        WOB_CATEGORY = new Column("WOB_CATEGORY", 8, "wob_category", ColumnType.LONG, true);
        NEXT_PAGE_TOKEN = new Column("NEXT_PAGE_TOKEN", 9, "next_page_token", ColumnType.BLOB);
        HEAD_STATE = new Column("HEAD_STATE", 10, "head_state", ColumnType.BLOB);
        IS_INSIDE_CACHE_HEAD = new Column("IS_INSIDE_CACHE_HEAD", 11, "is_inside_cache_head", ColumnType.INTEGER);
        $VALUES = (new Column[] {
            ID, INTEGER_ID, PROTO, DISPLAY_ORDER, FB_ADDRESS, NOTIFICATION_TYPE, NOTIFICATION_TIME, SORT_KEY, WOB_CATEGORY, NEXT_PAGE_TOKEN, 
            HEAD_STATE, IS_INSIDE_CACHE_HEAD
        });
    }
}
