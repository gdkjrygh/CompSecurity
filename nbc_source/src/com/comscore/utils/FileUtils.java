// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.content.Context;
import com.comscore.analytics.Core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

// Referenced classes of package com.comscore.utils:
//            CSLog, Storage, d, Utils

public class FileUtils
{

    public FileUtils()
    {
    }

    public static boolean deleteFile(Core core, String s)
    {
        Context context = core.getAppContext();
        core = core.getStorage();
        boolean flag = context.deleteFile(s);
        if (flag)
        {
            CSLog.d(com/comscore/utils/FileUtils, (new StringBuilder()).append("File").append(s).append(" was removed").toString());
            core.remove(s);
        }
        return flag;
    }

    public static ArrayList getFileList(Context context)
    {
        Object obj = null;
        File file = context.getFilesDir();
        context = obj;
        if (file != null)
        {
            context = obj;
            if (file.isDirectory())
            {
                context = file.list(new d());
                if (context != null)
                {
                    Arrays.sort(context);
                } else
                {
                    context = new String[0];
                }
            }
        }
        return new ArrayList(Arrays.asList(context));
    }

    public static String[] readCachedEvents(Context context, String s)
    {
        Object obj;
        LinkedList linkedlist;
        linkedlist = new LinkedList();
        obj = null;
        s = new BufferedReader(new InputStreamReader(context.openFileInput(s)));
_L4:
        context = s;
        obj = s.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        context = s;
        linkedlist.add(obj);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
_L8:
        context = s;
        CSLog.printStackTrace(((Exception) (obj)));
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                CSLog.printStackTrace(context);
            }
        }
        context = new String[linkedlist.size()];
        linkedlist.toArray(context);
        return context;
_L2:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                CSLog.printStackTrace(context);
            }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        context;
        s = ((String) (obj));
_L6:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                CSLog.printStackTrace(s);
            }
        }
        throw context;
        obj;
        s = context;
        context = ((Context) (obj));
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        s = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void writeEvent(Core core, String s, int i, String s1)
    {
        Object obj;
        Object obj1;
        Storage storage;
        int j;
        obj1 = core.getAppContext();
        storage = core.getStorage();
        obj = null;
        core = null;
        j = Utils.getInteger(storage.get(s), 0);
        obj1 = ((Context) (obj1)).openFileOutput(s, i);
        core = ((Core) (obj1));
        obj = obj1;
        ((FileOutputStream) (obj1)).write(s1.getBytes());
        core = ((Core) (obj1));
        obj = obj1;
        storage.set(s, String.valueOf(j + 1));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        ((FileOutputStream) (obj1)).close();
_L2:
        return;
        core;
        CSLog.printStackTrace(core);
        return;
        s;
        obj = core;
        CSLog.e(com/comscore/utils/FileUtils, (new StringBuilder()).append("Exception in writeEvent:").append(s.getLocalizedMessage()).toString());
        obj = core;
        CSLog.printStackTrace(s);
        if (core == null) goto _L2; else goto _L1
_L1:
        try
        {
            core.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Core core)
        {
            CSLog.printStackTrace(core);
        }
        return;
        core;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                CSLog.printStackTrace(s);
            }
        }
        throw core;
    }
}
