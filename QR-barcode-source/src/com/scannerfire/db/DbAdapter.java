// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.db;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;
import au.com.bytecode.opencsv.CSVWriter;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.scannerfire.model.QRModel;
import com.scannerfire.utils.Utils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.scannerfire.db:
//            DatabaseHelper

public class DbAdapter
{

    private static final String DATABASE_TABLE = "scans";
    public static final String KEY_BYTE = "byte";
    public static final String KEY_DATE = "date";
    public static final String KEY_FORMAT = "format";
    public static final String KEY_RECORDID = "_id";
    public static final String KEY_RESULT_X = "result_x";
    public static final String KEY_RESULT_Y = "result_y";
    public static final String KEY_TEXT = "text";
    public static final String KEY_TIME = "time";
    private static final String LOG_TAG = com/scannerfire/db/DbAdapter.getSimpleName();
    private Context context;
    private SQLiteDatabase database;
    private DatabaseHelper dbHelper;

    public DbAdapter(Context context1)
    {
        context = context1;
    }

    private ContentValues createContentValues(Result result, String s, String s1)
    {
        if (result == null)
        {
            return null;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("text", result.getText());
        contentvalues.put("byte", result.getRawBytes());
        if (result.getResultPoints() != null && result.getResultPoints()[0] != null)
        {
            contentvalues.put("result_x", Float.valueOf(result.getResultPoints()[0].getX()));
            contentvalues.put("result_y", Float.valueOf(result.getResultPoints()[0].getY()));
        }
        contentvalues.put("format", result.getBarcodeFormat().toString());
        contentvalues.put("time", s);
        contentvalues.put("date", s1);
        return contentvalues;
    }

    public void close()
    {
        dbHelper.close();
    }

    public long createRecord(Result result, String s, String s1)
    {
        result = createContentValues(result, s, s1);
        if (result == null)
        {
            Utils.showToastNotification((Activity)context, "Error: impossible to save into database");
            return -1L;
        } else
        {
            return database.insertOrThrow("scans", null, result);
        }
    }

    public void deleteAll()
    {
        database.delete("scans", null, null);
    }

    public boolean deleteRecord(long l)
    {
        return database.delete("scans", (new StringBuilder("_id=")).append(l).toString(), null) > 0;
    }

    public Cursor fetchAllRecords()
    {
        Log.d("", " QUERY EFFETTUTATA ");
        return database.query("scans", new String[] {
            "_id", "text", "byte", "result_x", "result_y", "format", "time", "date"
        }, null, null, null, null, "date ASC");
    }

    public List getStringValues()
    {
        ArrayList arraylist;
        Cursor cursor;
        arraylist = new ArrayList();
        arraylist.add(new String[] {
            "FORMAT", "TEXT", "TIME", "DATE"
        });
        cursor = database.rawQuery("SELECT * FROM scans", null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        int i;
        cursor.moveToFirst();
        i = 0;
_L5:
        if (i < cursor.getCount()) goto _L3; else goto _L2
_L2:
        return arraylist;
_L3:
        String s = cursor.getString(5);
        String s1 = (new StringBuilder(String.valueOf('"'))).append(cursor.getString(1).replaceAll("(\r\n|\n)", " ")).append('"').toString();
        Log.d("", (new StringBuilder("Result Text -> ")).append(s1).toString());
        arraylist.add(new String[] {
            s, s1, cursor.getString(6), cursor.getString(7)
        });
        cursor.moveToNext();
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public ArrayList getValues()
    {
        ArrayList arraylist;
        Cursor cursor;
        arraylist = new ArrayList();
        cursor = database.rawQuery("SELECT * FROM scans ORDER BY _id DESC", null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        int i;
        cursor.moveToFirst();
        i = 0;
_L5:
        if (i < cursor.getCount()) goto _L3; else goto _L2
_L2:
        return arraylist;
_L3:
        QRModel qrmodel = new QRModel();
        ResultPoint resultpoint = new ResultPoint(cursor.getFloat(3), cursor.getFloat(4));
        BarcodeFormat barcodeformat = BarcodeFormat.valueOf(cursor.getString(5));
        qrmodel.setId(cursor.getInt(0));
        qrmodel.setResult(new Result(cursor.getString(1), cursor.getBlob(2), new ResultPoint[] {
            resultpoint
        }, barcodeformat));
        qrmodel.setTime(cursor.getString(6));
        qrmodel.setDate(cursor.getString(7));
        arraylist.add(qrmodel);
        cursor.moveToNext();
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public DbAdapter open()
        throws SQLException
    {
        dbHelper = new DatabaseHelper(context);
        database = dbHelper.getWritableDatabase();
        return this;
    }

    public boolean saveCSV(String s)
    {
        try
        {
            open();
            List list = getStringValues();
            File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            Log.d("", (new StringBuilder("Cartella di esportazione CSV -> ")).append(file.getAbsolutePath()).toString());
            if (!file.exists())
            {
                file.mkdirs();
            }
            s = new File(file, s);
            s.createNewFile();
            s = new CSVWriter(new FileWriter(s));
            s.writeAll(list);
            s.close();
            close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MainActivity", s.getMessage(), s);
            Toast.makeText(context, "SQLException", 0).show();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MainActivity", s.getMessage(), s);
            return false;
        }
        Toast.makeText(context, 0x7f080151, 0).show();
        return true;
    }

}
