// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.qihoo.antivirus.update:
//            f, UpdatePatchInstall

public class g
{

    private static boolean a(Context context, File file, File file1)
    {
        int i = f.a(file, false);
        if (i == f.a(file1, true) && i != -1)
        {
            if ((file1 = f.a(file1)) != null)
            {
                String s = (new StringBuilder(String.valueOf(file.getAbsolutePath()))).append(".tmp").toString();
                if (UpdatePatchInstall.a(context, file1, file.getAbsolutePath(), s) == 0)
                {
                    file.delete();
                    (new File(file1)).delete();
                    (new File(s)).renameTo(file);
                    return true;
                } else
                {
                    (new File(file1)).delete();
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean a(Context context, File file, File file1, int i, int j)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
            return a(context, file, file1);

        case 1: // '\001'
            return a(file, file1, j);
        }
    }

    private static boolean a(File file, File file1, int i)
    {
        File file2;
        Iterator iterator;
        String s;
        ArrayList arraylist;
        iterator = null;
        file2 = null;
        s = null;
        arraylist = new ArrayList(100);
        file1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
_L3:
        s = file1.readLine();
        if (s != null) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1) { }
        }
        arraylist.add("update v_patch SET patch_version = 0");
        arraylist.add(String.format("update v_patch SET final_version = %d", new Object[] {
            Integer.valueOf(i)
        }));
        file1 = iterator;
        try
        {
            file = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 0);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            if (file1 != null)
            {
                file1.close();
            }
            return false;
        }
        finally
        {
            if (file2 == null) goto _L0; else goto _L0
        }
        file1 = file;
        file2 = file;
        iterator = arraylist.iterator();
_L4:
        file1 = file;
        file2 = file;
        flag = iterator.hasNext();
        break MISSING_BLOCK_LABEL_128;
_L2:
        arraylist.add(s);
          goto _L3
        file;
_L6:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return false;
        file;
        file1 = s;
_L5:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1) { }
        }
        throw file;
        if (!flag)
        {
            if (file != null)
            {
                file.close();
            }
            return true;
        }
        file1 = file;
        file2 = file;
        file.execSQL((String)iterator.next());
          goto _L4
        file2.close();
        throw file;
        file;
          goto _L5
        file;
        file1 = null;
          goto _L6
    }
}
