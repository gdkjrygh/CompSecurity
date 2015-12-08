// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Context;
import android.content.res.Resources;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.activerecorbase.Database;
import com.hmobile.activerecorbase.DatabaseBuilder;
import com.hmobile.common.Utils;
import com.hmobile.model.BookInfo;
import com.hmobile.model.BookMarkInfo;
import com.hmobile.model.FavoriteInfo;
import com.hmobile.model.VerseInfo;
import com.hmobile.model.WidgetSettingInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

// Referenced classes of package com.hmobile.biblekjv:
//            HolyBibleApplication

public class DataBaseHelper extends SQLiteOpenHelper
{

    private static String DB_NAME = "hmobile.db";
    private String DB_PATH;
    boolean isOpen;
    ActiveRecordBase mDatabase;
    public SQLiteDatabase myDataBase;
    private Context mycontext;

    public DataBaseHelper(Context context)
        throws IOException
    {
        super(context, DB_NAME, null, 1);
        DB_PATH = "/data/data/com.hmobile.biblekjv/databases/";
        isOpen = false;
        mycontext = context;
        if (!checkdatabase())
        {
            System.out.println("Database doesn't exist");
            createdatabase();
        }
    }

    private boolean checkdatabase()
    {
        boolean flag;
        try
        {
            flag = (new File((new StringBuilder(String.valueOf(DB_PATH))).append(DB_NAME).toString())).exists();
        }
        catch (SQLiteException sqliteexception)
        {
            System.out.println("Database doesn't exist");
            return false;
        }
        return flag;
    }

    private void copydatabase()
        throws IOException
    {
        ZipInputStream zipinputstream = new ZipInputStream(HolyBibleApplication.getContext().getResources().openRawResource(0x7f060000));
_L1:
        Object obj;
        Object obj1;
        int i;
        do
        {
            obj = zipinputstream.getNextEntry();
            if (obj == null)
            {
                zipinputstream.close();
                return;
            }
        } while (!((ZipEntry) (obj)).getName().equalsIgnoreCase("hmobile.db"));
        obj1 = new DatabaseBuilder("hmobile.db");
        ((DatabaseBuilder) (obj1)).addClass(com/hmobile/model/BookInfo);
        ((DatabaseBuilder) (obj1)).addClass(com/hmobile/model/VerseInfo);
        ((DatabaseBuilder) (obj1)).addClass(com/hmobile/model/BookMarkInfo);
        ((DatabaseBuilder) (obj1)).addClass(com/hmobile/model/FavoriteInfo);
        ((DatabaseBuilder) (obj1)).addClass(com/hmobile/model/WidgetSettingInfo);
        Database.setBuilder(((DatabaseBuilder) (obj1)));
        try
        {
            mDatabase = ActiveRecordBase.open(mycontext, "hmobile.db", 3);
            isOpen = true;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((ActiveRecordException) (obj1)).printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Utils.LogException(((Exception) (obj1)));
        }
        obj = new FileOutputStream((new StringBuilder(String.valueOf(DB_PATH))).append(((ZipEntry) (obj)).getName()).toString());
        obj1 = new byte[1024];
_L2:
label0:
        {
            i = zipinputstream.read(((byte []) (obj1)));
            if (i > 0)
            {
                break label0;
            }
            zipinputstream.closeEntry();
            ((FileOutputStream) (obj)).flush();
            ((FileOutputStream) (obj)).close();
        }
          goto _L1
        ((FileOutputStream) (obj)).write(((byte []) (obj1)), 0, i);
          goto _L2
    }

    public ActiveRecordBase Connection()
    {
        if (isOpen)
        {
            return mDatabase;
        }
        try
        {
            mDatabase = ActiveRecordBase.open(mycontext, "hmobile.db", 3);
            isOpen = true;
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
        }
        catch (Exception exception)
        {
            Utils.LogException(exception);
        }
        return mDatabase;
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (myDataBase != null)
        {
            myDataBase.close();
        }
        super.close();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void createdatabase()
        throws IOException
    {
        if (checkdatabase())
        {
            System.out.println(" Database exists.");
            return;
        }
        try
        {
            copydatabase();
            return;
        }
        catch (IOException ioexception)
        {
            throw new Error("Error copying database");
        }
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    public void opendatabase()
        throws SQLException
    {
        myDataBase = SQLiteDatabase.openDatabase((new StringBuilder(String.valueOf(DB_PATH))).append(DB_NAME).toString(), null, 0);
    }

}
