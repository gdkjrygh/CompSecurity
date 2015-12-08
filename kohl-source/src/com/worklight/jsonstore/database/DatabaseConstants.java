// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;


public class DatabaseConstants
{

    public static final String ASCENDING = "ASC";
    public static final String DB_PATH_EXT = ".sqlite";
    public static final String DB_SUB_DIR = "wljsonstore";
    public static final String DEFAULT_USERNAME = "jsonstore";
    public static final String DESCENDING = "DESC";
    public static final String FIELD_DELETED = "_deleted";
    public static final String FIELD_DIRTY = "_dirty";
    public static final String FIELD_ID = "_id";
    public static final String FIELD_JSON = "json";
    public static final String FIELD_OPERATION = "_operation";
    public static final String JSONSTORE_PREFS = "JsonstorePrefs";
    public static final String JSONSTORE_VERSION_PREF = "JsonstoreVer";
    public static final String OLD_DB_PATH = "com.ibm.worklight.database";
    public static final String OPERATION_ADD = "add";
    public static final String OPERATION_REMOVE = "remove";
    public static final String OPERATION_REPLACE = "replace";
    public static final String OPERATION_STORE = "store";
    public static final int RC_COULD_NOT_MARK_DOCUMENT_PUSHED = 15;
    public static final int RC_DB_NOT_OPEN = -50;
    public static final int RC_DESTROY_FAILED_FILE_ERROR = -18;
    public static final int RC_DESTROY_FAILED_METADATA_REMOVAL_FAILURE = -19;
    public static final int RC_DESTROY_FILE_FAILED = -5;
    public static final int RC_DESTROY_KEYS_FAILED = -4;
    public static final int RC_ERROR_CHANGING_PASSWORD = 24;
    public static final int RC_ERROR_CLEARING_COLLECTION = 26;
    public static final int RC_ERROR_CLOSING_ALL = 23;
    public static final int RC_ERROR_DURING_DESTROY = 25;
    public static final int RC_ERROR_INVALID_FILTER_ARRAY = 29;
    public static final int RC_ERROR_INVALID_SORT_OBJECT = 28;
    public static final int RC_FIPS_FAILURE = -40;
    public static final int RC_INVALID_SEARCH_FIELD = 22;
    public static final int RC_NO_TRANSACTION_IN_PROGRESS = -42;
    public static final int RC_TABLE_CREATED = 0;
    public static final int RC_TABLE_EXISTS = 1;
    public static final int RC_TABLE_FAILURE = -1;
    public static final int RC_TABLE_KEY_FAILURE = -3;
    public static final int RC_TABLE_SCHEMA_MISMATCH = -2;
    public static final int RC_TRANSACTION_DURING_INIT = -44;
    public static final int RC_TRANSACTION_FAILURE = -43;
    public static final int RC_TRANSACTION_FAILURE_DURING_CLOSE_ALL = -45;
    public static final int RC_TRANSACTION_FAILURE_DURING_DESTROY = -46;
    public static final int RC_TRANSACTION_FAILURE_DURING_REMOVE_COLLECTION = -47;
    public static final int RC_TRANSACTION_FAILURE_DURING_ROLLBACK = -48;
    public static final int RC_TRANSACTION_IN_PROGRESS = -41;
    public static final int RC_USERNAME_MISMATCH_DETECTED = -6;
    public static final String SQL_ALL = "*";
    public static final String SQL_AND = " AND ";
    public static final String SQL_BETWEEN = " BETWEEN ? AND ? ";
    public static final String SQL_COUNT = "count(*)";
    public static final String SQL_EQ = " = ?";
    public static final String SQL_FROM = " FROM ";
    public static final String SQL_GT = " > ?";
    public static final String SQL_GTE = " >= ?";
    public static final String SQL_IN = " IN ";
    public static final String SQL_LIKE = " LIKE ?";
    public static final String SQL_LIMIT = " LIMIT ";
    public static final String SQL_LT = " < ?";
    public static final String SQL_LTE = " <= ?";
    public static final String SQL_NOT_BETWEEN = " NOT BETWEEN ? AND ? ";
    public static final String SQL_NOT_EQ = " != ?";
    public static final String SQL_NOT_IN = " NOT IN ";
    public static final String SQL_NOT_LIKE = " NOT LIKE ?";
    public static final String SQL_OFFSET = " OFFSET ";
    public static final String SQL_OR = " OR ";
    public static final String SQL_SELECT = " SELECT ";
    public static final String SQL_SET = " SET ";
    public static final String SQL_SORT = " ORDER BY ";
    public static final String SQL_UPDATE = " UPDATE ";
    public static final String SQL_WHERE = " WHERE ";

    private DatabaseConstants()
    {
    }
}
