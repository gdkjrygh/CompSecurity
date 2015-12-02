// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.v5.UpdateService;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.zip.InflaterInputStream;

public class a
{

    public static String a = null;
    private static a b = null;
    private static Context c;

    private a()
    {
        c = SecurityApplication.a();
    }

    public static a a()
    {
        if (b == null)
        {
            b = new a();
        }
        return b;
    }

    public static void c()
    {
        Object obj;
        Object obj3;
        int j;
        Object obj2 = null;
        obj3 = null;
        System.currentTimeMillis();
        obj = c.getFilesDir().getAbsolutePath();
        (new StringBuilder()).append(((String) (obj))).append("/").append("c_t.config").toString();
        Object obj1;
        Object obj4;
        InputStreamReader inputstreamreader;
        BufferedReader bufferedreader;
        try
        {
            obj = new FileInputStream(Utils.pathAppend(c.getFilesDir().getAbsolutePath(), "c_t.config"));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        obj4 = obj;
        if (obj == null)
        {
            try
            {
                obj4 = c.getAssets().open("c_t.config");
            }
            catch (Exception exception)
            {
                obj4 = obj;
            }
        }
        inputstreamreader = new InputStreamReader(new InflaterInputStream(((InputStream) (obj4))), "UTF-8");
        bufferedreader = new BufferedReader(inputstreamreader);
        obj1 = null;
        obj = null;
        obj2 = obj3;
_L6:
        obj3 = bufferedreader.readLine();
        if (obj3 == null) goto _L2; else goto _L1
_L1:
        if (!((String) (obj3)).startsWith("up:")) goto _L4; else goto _L3
_L3:
        obj2 = obj3;
          goto _L5
_L4:
        if (((String) (obj3)).contains("#"))
        {
            obj1 = obj3;
        } else
        {
            obj = obj3;
        }
_L5:
        if (true) goto _L6; else goto _L2
_L2:
        if (obj == null) goto _L8; else goto _L7
_L7:
        j = ((String) (obj)).split(";").length;
        int i = 0;
        while (i < j) 
        {
            i++;
        }
          goto _L9
_L8:
        if (obj2 == null) goto _L11; else goto _L10
_L10:
        obj3 = ((String) (obj2)).split(":");
        if (obj3.length > 1 && obj3[1] != null)
        {
            obj2 = obj3[1];
        } else
        {
            obj2 = "";
        }
_L12:
        ((InputStream) (obj4)).close();
        inputstreamreader.close();
        obj3 = obj2;
        obj2 = obj;
        obj = obj3;
_L13:
        SharedPref.a(c, "clear_title_id", ((String) (obj2)));
        a = ((String) (obj1));
        SharedPref.a(c, "clear_up", ((String) (obj)));
        SharedPref.a(c, "clear_timestamp", System.currentTimeMillis());
        return;
_L11:
        obj2 = "";
          goto _L12
        obj3;
        obj3 = obj;
        obj = obj2;
        obj2 = obj3;
          goto _L13
        obj;
        inputstreamreader = null;
        obj1 = null;
        obj = null;
_L16:
        ((InputStream) (obj4)).close();
        inputstreamreader.close();
        obj3 = obj;
        obj = obj2;
        obj2 = obj3;
          goto _L13
        obj3;
        obj3 = obj;
        obj = obj2;
        obj2 = obj3;
          goto _L13
        obj;
        inputstreamreader = null;
_L15:
        try
        {
            ((InputStream) (obj4)).close();
            inputstreamreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        throw obj;
        obj;
        if (true) goto _L15; else goto _L14
_L14:
        obj;
        obj1 = null;
        obj = null;
          goto _L16
        obj3;
          goto _L16
_L9:
        if (true) goto _L8; else goto _L17
_L17:
    }

    public void b()
    {
        if (Calendar.getInstance().get(12) % 30 != 0)
        {
            long l = SharedPref.b(c, "clear_timestamp", 0L);
            long l1 = System.currentTimeMillis();
            if (l1 <= l || l1 - l > 0x1b77400L)
            {
                Intent intent = new Intent(c, com/qihoo/security/v5/UpdateService);
                intent.setAction("com.qihoo.security.action.ACTION_CHECK_UPDATE");
                intent.putExtra("type", 4001);
                c.startService(intent);
                return;
            }
        }
    }

}
