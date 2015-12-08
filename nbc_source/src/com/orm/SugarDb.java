// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.orm:
//            SugarConfig, SugarCursorFactory, SugarRecord, StringUtil, 
//            QueryBuilder, NumberComparator

public class SugarDb extends SQLiteOpenHelper
{

    private Context context;

    public SugarDb(Context context1)
    {
        super(context1, SugarConfig.getDatabaseName(context1), new SugarCursorFactory(SugarConfig.getDebugEnabled(context1)), SugarConfig.getDatabaseVersion(context1));
        context = context1;
    }

    private void createDatabase(SQLiteDatabase sqlitedatabase)
    {
        for (Iterator iterator = getDomainClasses(context).iterator(); iterator.hasNext(); createTable((SugarRecord)iterator.next(), sqlitedatabase)) { }
    }

    private void createTable(SugarRecord sugarrecord, SQLiteDatabase sqlitedatabase)
    {
        Log.i("Sugar", "create table");
        Object obj = sugarrecord.getTableFields();
        StringBuilder stringbuilder = (new StringBuilder("CREATE TABLE ")).append(sugarrecord.getSqlName()).append(" ( ID INTEGER PRIMARY KEY AUTOINCREMENT ");
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (Field)((Iterator) (obj)).next();
            String s = StringUtil.toSQLName(((Field) (obj1)).getName());
            obj1 = QueryBuilder.getColumnType(((Field) (obj1)).getType());
            if (obj1 != null && !s.equalsIgnoreCase("Id"))
            {
                stringbuilder.append(", ").append(s).append(" ").append(((String) (obj1)));
            }
        } while (true);
        stringbuilder.append(" ) ");
        Log.i("Sugar", (new StringBuilder()).append("creating table ").append(sugarrecord.getSqlName()).toString());
        if (!"".equals(stringbuilder.toString()))
        {
            sqlitedatabase.execSQL(stringbuilder.toString());
        }
    }

    private void deleteTables(SQLiteDatabase sqlitedatabase)
    {
        SugarRecord sugarrecord;
        for (Iterator iterator = getDomainClasses(context).iterator(); iterator.hasNext(); sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(sugarrecord.getSqlName()).toString()))
        {
            sugarrecord = (SugarRecord)iterator.next();
        }

    }

    private void doUpgrade(SQLiteDatabase sqlitedatabase)
    {
        for (Iterator iterator = getDomainClasses(context).iterator(); iterator.hasNext();)
        {
            SugarRecord sugarrecord = (SugarRecord)iterator.next();
            try
            {
                sqlitedatabase.query(sugarrecord.tableName, null, null, null, null, null, null);
            }
            catch (SQLiteException sqliteexception)
            {
                Log.i("Sugar", String.format("creating table on update (error was '%s')", new Object[] {
                    sqliteexception.getMessage()
                }));
                createTable(sugarrecord, sqlitedatabase);
            }
        }

    }

    private void executeScript(SQLiteDatabase sqlitedatabase, String s)
    {
        s = new BufferedReader(new InputStreamReader(context.getAssets().open((new StringBuilder()).append("sugar_upgrades/").append(s).toString())));
_L1:
        String s1 = s.readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Log.i("Sugar script", s1);
        sqlitedatabase.execSQL(s1.toString());
          goto _L1
        sqlitedatabase;
        Log.e("Sugar", sqlitedatabase.getMessage());
        Log.i("Sugar", "script executed");
        return;
    }

    private boolean executeSugarUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag = false;
        flag1 = flag2;
        Object obj = Arrays.asList(context.getAssets().list("sugar_upgrades"));
        flag1 = flag2;
        Collections.sort(((List) (obj)), new NumberComparator());
        flag1 = flag2;
        obj = ((List) (obj)).iterator();
_L2:
        flag1 = flag;
        flag2 = flag;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_221;
        }
        flag1 = flag;
        String s = (String)((Iterator) (obj)).next();
        flag1 = flag;
        Log.i("Sugar", (new StringBuilder()).append("filename : ").append(s).toString());
        flag1 = flag;
        int k = Integer.valueOf(s.replace(".sql", "")).intValue();
        if (k <= i || k > j) goto _L2; else goto _L1
_L1:
        flag1 = flag;
        executeScript(sqlitedatabase, s);
        flag = true;
          goto _L2
        NumberFormatException numberformatexception;
        numberformatexception;
        flag1 = flag;
        Log.i("Sugar", (new StringBuilder()).append("not a sugar script. ignored.").append(s).toString());
          goto _L2
        sqlitedatabase;
        Log.e("Sugar", sqlitedatabase.getMessage());
        flag2 = flag1;
        return flag2;
    }

    private Enumeration getAllClasses(Context context1)
        throws android.content.pm.PackageManager.NameNotFoundException, IOException
    {
        return (new DexFile(getSourcePath(context1))).entries();
    }

    private SugarRecord getDomainClass(String s, Context context1)
    {
        Log.i("Sugar", "domain class");
        Object obj = null;
        try
        {
            s = Class.forName(s, true, context1.getClass().getClassLoader());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Sugar", s.getMessage());
            s = obj;
        }
        if (s == null || !com/orm/SugarRecord.isAssignableFrom(s) || Modifier.isAbstract(s.getModifiers()))
        {
            return null;
        }
        s = (SugarRecord)s.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        return s;
        s;
        Log.e("Sugar", s.getMessage());
_L2:
        return null;
        s;
        Log.e("Sugar", s.getMessage());
        continue; /* Loop/switch isn't completed */
        s;
        Log.e("Sugar", s.getMessage());
        continue; /* Loop/switch isn't completed */
        s;
        Log.e("Sugar", s.getMessage());
        if (true) goto _L2; else goto _L1
_L1:
    }

    private List getDomainClasses(Context context1)
    {
        ArrayList arraylist = new ArrayList();
        Enumeration enumeration = getAllClasses(context1);
_L2:
        Object obj;
        do
        {
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break MISSING_BLOCK_LABEL_83;
                }
                obj = (String)enumeration.nextElement();
            } while (!((String) (obj)).startsWith(SugarConfig.getDomainPackageName(context1)));
            obj = getDomainClass(((String) (obj)), context1);
        } while (obj == null);
        arraylist.add(obj);
        if (true) goto _L2; else goto _L1
_L1:
        context1;
        Log.e("Sugar", context1.getMessage());
        return arraylist;
        context1;
        Log.e("Sugar", context1.getMessage());
        return arraylist;
    }

    private String getSourcePath(Context context1)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        return context1.getPackageManager().getApplicationInfo(context1.getPackageName(), 0).sourceDir;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        Log.i("Sugar", "on create");
        createDatabase(sqlitedatabase);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Log.i("Sugar", "upgrading sugar");
        doUpgrade(sqlitedatabase);
        if (!executeSugarUpgrade(sqlitedatabase, i, j))
        {
            deleteTables(sqlitedatabase);
            onCreate(sqlitedatabase);
        }
    }
}
