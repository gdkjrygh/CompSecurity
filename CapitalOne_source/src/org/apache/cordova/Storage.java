// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.io.PrintStream;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView

public class Storage extends CordovaPlugin
{

    private static final String ALTER = "alter";
    private static final String CREATE = "create";
    private static final String DROP = "drop";
    private static final String TRUNCATE = "truncate";
    String dbName;
    SQLiteDatabase myDb;
    String path;

    public Storage()
    {
        myDb = null;
        path = null;
        dbName = null;
    }

    private boolean isDDL(String s)
    {
        s = s.toLowerCase();
        return s.startsWith("drop") || s.startsWith("create") || s.startsWith("alter") || s.startsWith("truncate");
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        boolean flag = false;
        if (!s.equals("openDatabase")) goto _L2; else goto _L1
_L1:
        openDatabase(jsonarray.getString(0), jsonarray.getString(1), jsonarray.getString(2), jsonarray.getLong(3));
_L6:
        callbackcontext.success();
        flag = true;
_L4:
        return flag;
_L2:
        if (!s.equals("executeSql")) goto _L4; else goto _L3
_L3:
        if (!jsonarray.isNull(1))
        {
            break; /* Loop/switch isn't completed */
        }
        s = new String[0];
_L8:
        executeSql(jsonarray.getString(0), s, jsonarray.getString(2));
        if (true) goto _L6; else goto _L5
_L5:
        String as[];
        JSONArray jsonarray1;
        int i;
        int j;
        jsonarray1 = jsonarray.getJSONArray(1);
        j = jsonarray1.length();
        as = new String[j];
        i = 0;
_L9:
        s = as;
        if (i >= j) goto _L8; else goto _L7
_L7:
        as[i] = jsonarray1.getString(i);
        i++;
          goto _L9
    }

    public void executeSql(String s, String as[], String s1)
    {
        if (isDDL(s))
        {
            myDb.execSQL(s);
            webView.sendJavascript((new StringBuilder()).append("cordova.require('cordova/plugin/android/storage').completeQuery('").append(s1).append("', '');").toString());
            return;
        }
        try
        {
            s = myDb.rawQuery(s, as);
            processResults(s, s1);
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        System.out.println((new StringBuilder()).append("Storage.executeSql(): Error=").append(s.getMessage()).toString());
        webView.sendJavascript((new StringBuilder()).append("cordova.require('cordova/plugin/android/storage').failQuery('").append(s.getMessage()).append("','").append(s1).append("');").toString());
        return;
    }

    public void onDestroy()
    {
        if (myDb != null)
        {
            myDb.close();
            myDb = null;
        }
    }

    public void onReset()
    {
        onDestroy();
    }

    public void openDatabase(String s, String s1, String s2, long l)
    {
        if (myDb != null)
        {
            myDb.close();
        }
        if (path == null)
        {
            path = cordova.getActivity().getApplicationContext().getDir("database", 0).getPath();
        }
        dbName = (new StringBuilder()).append(path).append(File.separator).append(s).append(".db").toString();
        s = new File((new StringBuilder()).append(path).append(File.pathSeparator).append(s).append(".db").toString());
        if (s.exists())
        {
            s1 = new File(path);
            s2 = new File(dbName);
            s1.mkdirs();
            s.renameTo(s2);
        }
        myDb = SQLiteDatabase.openOrCreateDatabase(dbName, null);
    }

    public void processResults(Cursor cursor, String s)
    {
        Object obj;
        int j;
        obj = "[]";
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        obj = new JSONArray();
        j = cursor.getColumnCount();
_L4:
        JSONObject jsonobject;
        int i;
        jsonobject = new JSONObject();
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject.put(cursor.getColumnName(i), cursor.getString(i));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            ((JSONArray) (obj)).put(jsonobject);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        if (cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        obj = ((JSONArray) (obj)).toString();
        webView.sendJavascript((new StringBuilder()).append("cordova.require('cordova/plugin/android/storage').completeQuery('").append(s).append("', ").append(((String) (obj))).append(");").toString());
        return;
    }
}
