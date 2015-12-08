// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.database.sqlite.SQLiteDiskIOException;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SQLiteErrors
{

    private static Pattern CODE = Pattern.compile(".* \\(code (\\d+)\\)\\Z");
    private static final int SQLITE_IOERR = 10;
    private static final int SQLITE_IOERR_ACCESS = 3338;
    private static final int SQLITE_IOERR_BLOCKED = 2826;
    private static final int SQLITE_IOERR_CHECKRESERVEDLOCK = 3594;
    private static final int SQLITE_IOERR_CLOSE = 4106;
    private static final int SQLITE_IOERR_DELETE = 2570;
    private static final int SQLITE_IOERR_DIR_CLOSE = 4362;
    private static final int SQLITE_IOERR_DIR_FSYNC = 1290;
    private static final int SQLITE_IOERR_FSTAT = 1802;
    private static final int SQLITE_IOERR_FSYNC = 1034;
    private static final int SQLITE_IOERR_LOCK = 3850;
    private static final int SQLITE_IOERR_NOMEM = 3082;
    private static final int SQLITE_IOERR_RDLOCK = 2314;
    private static final int SQLITE_IOERR_READ = 266;
    private static final int SQLITE_IOERR_SEEK = 5642;
    private static final int SQLITE_IOERR_SHMLOCK = 5130;
    private static final int SQLITE_IOERR_SHMMAP = 5386;
    private static final int SQLITE_IOERR_SHMOPEN = 4618;
    private static final int SQLITE_IOERR_SHMSIZE = 4874;
    private static final int SQLITE_IOERR_SHORT_READ = 522;
    private static final int SQLITE_IOERR_TRUNCATE = 1546;
    private static final int SQLITE_IOERR_UNLOCK = 2058;
    private static final int SQLITE_IOERR_WRITE = 778;

    private SQLiteErrors()
    {
    }

    public static String convertToErrorMessage(SQLiteDiskIOException sqlitediskioexception)
    {
        return convertToErrorMessage(sqlitediskioexception.getMessage());
    }

    public static String convertToErrorMessage(String s)
    {
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = CODE.matcher(s);
        if (!s.matches()) goto _L2; else goto _L3
_L3:
        Integer.parseInt(s.group(1));
        JVM INSTR lookupswitch 22: default 216
    //                   266: 218
    //                   522: 221
    //                   778: 224
    //                   1034: 227
    //                   1290: 230
    //                   1546: 233
    //                   1802: 236
    //                   2058: 239
    //                   2314: 242
    //                   2570: 245
    //                   2826: 248
    //                   3082: 251
    //                   3338: 254
    //                   3594: 257
    //                   3850: 260
    //                   4106: 263
    //                   4362: 266
    //                   4618: 269
    //                   4874: 272
    //                   5130: 275
    //                   5386: 278
    //                   5642: 281;
           goto _L2 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25
_L2:
        return null;
_L4:
        return "IOERR_READ";
_L5:
        return "IOERR_SHORT_READ";
_L6:
        return "IOERR_WRITE";
_L7:
        return "IOERR_FSYNC";
_L8:
        return "IOERR_DIR_FSYNC";
_L9:
        return "IOERR_TRUNCATE";
_L10:
        return "IOERR_FSTAT";
_L11:
        return "IOERR_UNLOCK";
_L12:
        return "IOERR_RDLOCK";
_L13:
        return "IOERR_DELETE";
_L14:
        return "IOERR_BLOCKED";
_L15:
        return "IOERR_NOMEM";
_L16:
        return "IOERR_ACCESS";
_L17:
        return "IOERR_CHECKRESERVEDLOCK";
_L18:
        return "IOERR_LOCK";
_L19:
        return "IOERR_CLOSE";
_L20:
        return "IOERR_DIR_CLOSE";
_L21:
        return "IOERR_SHMOPEN";
_L22:
        return "IOERR_SHMSIZE";
_L23:
        return "IOERR_SHMLOCK";
_L24:
        return "IOERR_SHMMAP";
_L25:
        return "IOERR_SEEK";
    }

}
