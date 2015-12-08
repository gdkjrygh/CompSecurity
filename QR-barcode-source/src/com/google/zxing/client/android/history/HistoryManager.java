// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.history;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.client.android.result.ResultHandler;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.google.zxing.client.android.history:
//            DBHelper, HistoryItem

public final class HistoryManager
{

    private static final String COLUMNS[] = {
        "text", "display", "format", "timestamp", "details"
    };
    private static final String COUNT_COLUMN[] = {
        "COUNT(1)"
    };
    private static final DateFormat EXPORT_DATE_TIME_FORMAT = DateFormat.getDateTimeInstance(2, 2);
    private static final String ID_COL_PROJECTION[] = {
        "id"
    };
    private static final String ID_DETAIL_COL_PROJECTION[] = {
        "id", "details"
    };
    private static final int MAX_ITEMS = 2000;
    private static final String TAG = com/google/zxing/client/android/history/HistoryManager.getSimpleName();
    private final Activity activity;

    public HistoryManager(Activity activity1)
    {
        activity = activity1;
    }

    private static void close(Cursor cursor, SQLiteDatabase sqlitedatabase)
    {
        if (cursor != null)
        {
            cursor.close();
        }
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
    }

    private void deletePrevious(String s)
    {
        SQLiteDatabase sqlitedatabase;
        Object obj;
        obj = new DBHelper(activity);
        sqlitedatabase = null;
        obj = ((SQLiteOpenHelper) (obj)).getWritableDatabase();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        ((SQLiteDatabase) (obj)).delete("history", "text=?", new String[] {
            s
        });
        close(null, ((SQLiteDatabase) (obj)));
        return;
        s;
        close(null, sqlitedatabase);
        throw s;
    }

    private static String massageHistoryField(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return s.replace("\"", "\"\"");
        }
    }

    static Uri saveHistory(String s)
    {
        Object obj;
        Object obj2;
        obj2 = null;
        obj = new File(new File(Environment.getExternalStorageDirectory(), "BarcodeScanner"), "History");
        if (((File) (obj)).exists() || ((File) (obj)).mkdirs()) goto _L2; else goto _L1
_L1:
        Log.w(TAG, (new StringBuilder("Couldn't make dir ")).append(obj).toString());
        obj = obj2;
_L4:
        return ((Uri) (obj));
_L2:
        Object obj3;
        File file;
        file = new File(((File) (obj)), (new StringBuilder("history-")).append(System.currentTimeMillis()).append(".csv").toString());
        obj = null;
        obj3 = null;
        Object obj1 = new OutputStreamWriter(new FileOutputStream(file), Charset.forName("UTF-8"));
        ((OutputStreamWriter) (obj1)).write(s);
        s = Uri.parse((new StringBuilder("file://")).append(file.getAbsolutePath()).toString());
        obj = s;
        if (obj1 != null)
        {
            try
            {
                ((OutputStreamWriter) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return s;
            }
            return s;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        s = obj3;
_L8:
        obj = s;
        Log.w(TAG, (new StringBuilder("Couldn't access file ")).append(file).append(" due to ").append(obj1).toString());
        obj = obj2;
        if (s == null) goto _L4; else goto _L5
_L5:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return null;
        s;
_L7:
        if (obj != null)
        {
            try
            {
                ((OutputStreamWriter) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw s;
        s;
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
        IOException ioexception;
        ioexception;
        s = ((String) (obj1));
        obj1 = ioexception;
          goto _L8
    }

    public void addHistoryItem(Result result, ResultHandler resulthandler)
    {
        ContentValues contentvalues;
        if (!activity.getIntent().getBooleanExtra("SAVE_HISTORY", true) || resulthandler.areContentsSecure())
        {
            return;
        }
        if (!PreferenceManager.getDefaultSharedPreferences(activity).getBoolean("preferences_remember_duplicates", false))
        {
            deletePrevious(result.getText());
        }
        contentvalues = new ContentValues();
        contentvalues.put("text", result.getText());
        contentvalues.put("format", result.getBarcodeFormat().toString());
        contentvalues.put("display", resulthandler.getDisplayContents().toString());
        contentvalues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        resulthandler = new DBHelper(activity);
        result = null;
        resulthandler = resulthandler.getWritableDatabase();
        result = resulthandler;
        resulthandler.insert("history", "timestamp", contentvalues);
        close(null, resulthandler);
        return;
        resulthandler;
        close(null, result);
        throw resulthandler;
    }

    public void addHistoryItemDetails(String s, String s1)
    {
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        String s2;
        Object obj;
        obj = new DBHelper(activity);
        sqlitedatabase = null;
        s2 = null;
        cursor = s2;
        obj = ((SQLiteOpenHelper) (obj)).getWritableDatabase();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = s2;
        Cursor cursor1 = ((SQLiteDatabase) (obj)).query("history", ID_DETAIL_COL_PROJECTION, "text=?", new String[] {
            s
        }, null, null, "timestamp DESC", "1");
        s2 = null;
        s = null;
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        if (!cursor1.moveToNext()) goto _L2; else goto _L1
_L1:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        s2 = cursor1.getString(0);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        s = cursor1.getString(1);
          goto _L2
_L8:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        s1 = new ContentValues();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        s1.put("details", s);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        ((SQLiteDatabase) (obj)).update("history", s1, "id=?", new String[] {
            s2
        });
_L4:
        close(cursor1, ((SQLiteDatabase) (obj)));
        return;
_L6:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        if (s.contains(s1))
        {
            s = null;
            continue; /* Loop/switch isn't completed */
        }
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        s = (new StringBuilder(String.valueOf(s))).append(" : ").append(s1).toString();
        continue; /* Loop/switch isn't completed */
        s;
        close(cursor, sqlitedatabase);
        throw s;
_L2:
        if (s2 == null) goto _L4; else goto _L3
_L3:
        if (s != null) goto _L6; else goto _L5
_L5:
        s = s1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    CharSequence buildHistory()
    {
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        Cursor cursor1;
        Object obj;
        obj = new DBHelper(activity);
        sqlitedatabase = null;
        cursor1 = null;
        cursor = cursor1;
        obj = ((SQLiteOpenHelper) (obj)).getWritableDatabase();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        cursor1 = ((SQLiteDatabase) (obj)).query("history", COLUMNS, null, null, null, null, "timestamp DESC");
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        StringBuilder stringbuilder = new StringBuilder(1000);
_L2:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        boolean flag = cursor1.moveToNext();
        if (!flag)
        {
            close(cursor1, ((SQLiteDatabase) (obj)));
            return stringbuilder;
        }
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        stringbuilder.append('"').append(massageHistoryField(cursor1.getString(0))).append("\",");
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        stringbuilder.append('"').append(massageHistoryField(cursor1.getString(1))).append("\",");
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        stringbuilder.append('"').append(massageHistoryField(cursor1.getString(2))).append("\",");
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        stringbuilder.append('"').append(massageHistoryField(cursor1.getString(3))).append("\",");
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        long l = cursor1.getLong(3);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        stringbuilder.append('"').append(massageHistoryField(EXPORT_DATE_TIME_FORMAT.format(new Date(l)))).append("\",");
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        stringbuilder.append('"').append(massageHistoryField(cursor1.getString(4))).append("\"\r\n");
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        close(cursor, sqlitedatabase);
        throw exception;
    }

    public HistoryItem buildHistoryItem(int i)
    {
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        Object obj;
        Cursor cursor1;
        obj = new DBHelper(activity);
        sqlitedatabase = null;
        cursor1 = null;
        cursor = cursor1;
        obj = ((SQLiteOpenHelper) (obj)).getReadableDatabase();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        cursor1 = ((SQLiteDatabase) (obj)).query("history", COLUMNS, null, null, null, null, "timestamp DESC");
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        cursor1.move(i + 1);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        Object obj1 = cursor1.getString(0);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        String s = cursor1.getString(1);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        String s1 = cursor1.getString(2);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        long l = cursor1.getLong(3);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        String s2 = cursor1.getString(4);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        obj1 = new HistoryItem(new Result(((String) (obj1)), null, null, BarcodeFormat.valueOf(s1), l), s, s2);
        close(cursor1, ((SQLiteDatabase) (obj)));
        return ((HistoryItem) (obj1));
        Exception exception;
        exception;
        close(cursor, sqlitedatabase);
        throw exception;
    }

    public List buildHistoryItems()
    {
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        Object obj;
        Cursor cursor1;
        ArrayList arraylist;
        obj = new DBHelper(activity);
        arraylist = new ArrayList();
        sqlitedatabase = null;
        cursor1 = null;
        cursor = cursor1;
        obj = ((SQLiteOpenHelper) (obj)).getReadableDatabase();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        cursor1 = ((SQLiteDatabase) (obj)).query("history", COLUMNS, null, null, null, null, "timestamp DESC");
_L2:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        boolean flag = cursor1.moveToNext();
        if (!flag)
        {
            close(cursor1, ((SQLiteDatabase) (obj)));
            return arraylist;
        }
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        String s = cursor1.getString(0);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        String s1 = cursor1.getString(1);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        String s2 = cursor1.getString(2);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        long l = cursor1.getLong(3);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        String s3 = cursor1.getString(4);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        arraylist.add(new HistoryItem(new Result(s, null, null, BarcodeFormat.valueOf(s2), l), s1, s3));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        close(cursor, sqlitedatabase);
        throw exception;
    }

    void clearHistory()
    {
        SQLiteDatabase sqlitedatabase;
        Object obj;
        obj = new DBHelper(activity);
        sqlitedatabase = null;
        obj = ((SQLiteOpenHelper) (obj)).getWritableDatabase();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        ((SQLiteDatabase) (obj)).delete("history", null, null);
        close(null, ((SQLiteDatabase) (obj)));
        return;
        Exception exception;
        exception;
        close(null, sqlitedatabase);
        throw exception;
    }

    public void deleteHistoryItem(int i)
    {
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        Cursor cursor1;
        Object obj;
        obj = new DBHelper(activity);
        sqlitedatabase = null;
        cursor1 = null;
        cursor = cursor1;
        obj = ((SQLiteOpenHelper) (obj)).getWritableDatabase();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        cursor1 = ((SQLiteDatabase) (obj)).query("history", ID_COL_PROJECTION, null, null, null, null, "timestamp DESC");
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        cursor1.move(i + 1);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        ((SQLiteDatabase) (obj)).delete("history", (new StringBuilder("id=")).append(cursor1.getString(0)).toString(), null);
        close(cursor1, ((SQLiteDatabase) (obj)));
        return;
        Exception exception;
        exception;
        close(cursor, sqlitedatabase);
        throw exception;
    }

    public boolean hasHistoryItems()
    {
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        Cursor cursor1;
        Object obj;
        obj = new DBHelper(activity);
        sqlitedatabase = null;
        cursor1 = null;
        cursor = cursor1;
        obj = ((SQLiteOpenHelper) (obj)).getReadableDatabase();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        cursor1 = ((SQLiteDatabase) (obj)).query("history", COUNT_COLUMN, null, null, null, null, null);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        cursor1.moveToFirst();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor1;
        int i = cursor1.getInt(0);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        close(cursor1, ((SQLiteDatabase) (obj)));
        return flag;
        Exception exception;
        exception;
        close(cursor, sqlitedatabase);
        throw exception;
    }

    public void trimHistory()
    {
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        SQLiteDatabase sqlitedatabase1;
        Cursor cursor1;
        Object obj;
        Cursor cursor2;
        String s;
        obj = new DBHelper(activity);
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        s = null;
        cursor2 = null;
        cursor = cursor2;
        cursor1 = s;
        obj = ((SQLiteOpenHelper) (obj)).getWritableDatabase();
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor2;
        sqlitedatabase1 = ((SQLiteDatabase) (obj));
        cursor1 = s;
        cursor2 = ((SQLiteDatabase) (obj)).query("history", ID_COL_PROJECTION, null, null, null, null, "timestamp DESC");
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor2;
        sqlitedatabase1 = ((SQLiteDatabase) (obj));
        cursor1 = cursor2;
        cursor2.move(2000);
_L2:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor2;
        sqlitedatabase1 = ((SQLiteDatabase) (obj));
        cursor1 = cursor2;
        boolean flag = cursor2.moveToNext();
        if (!flag)
        {
            close(cursor2, ((SQLiteDatabase) (obj)));
            return;
        }
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor2;
        sqlitedatabase1 = ((SQLiteDatabase) (obj));
        cursor1 = cursor2;
        s = cursor2.getString(0);
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor2;
        sqlitedatabase1 = ((SQLiteDatabase) (obj));
        cursor1 = cursor2;
        Log.i(TAG, (new StringBuilder("Deleting scan history ID ")).append(s).toString());
        sqlitedatabase = ((SQLiteDatabase) (obj));
        cursor = cursor2;
        sqlitedatabase1 = ((SQLiteDatabase) (obj));
        cursor1 = cursor2;
        ((SQLiteDatabase) (obj)).delete("history", (new StringBuilder("id=")).append(s).toString(), null);
        if (true) goto _L2; else goto _L1
_L1:
        SQLiteException sqliteexception;
        sqliteexception;
        sqlitedatabase1 = sqlitedatabase;
        cursor1 = cursor;
        Log.w(TAG, sqliteexception);
        close(cursor, sqlitedatabase);
        return;
        Exception exception;
        exception;
        close(cursor1, sqlitedatabase1);
        throw exception;
    }

}
