// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

// Referenced classes of package com.accuweather.android.utilities:
//            PreferenceUtils, Logger, DataIOException

public class PersistanceUtils
{

    private static Gson gson = (new GsonBuilder()).enableComplexMapKeySerialization().create();

    public PersistanceUtils()
    {
    }

    public static Object getObjectFromFile(String s, Class class1, Context context)
        throws IOException
    {
        Object obj = getObjectFromSharedPreferences(s, class1, context);
        if (obj != null)
        {
            return obj;
        }
        com/accuweather/android/utilities/PreferenceUtils;
        JVM INSTR monitorenter ;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = obj2;
        Object obj3 = new File(context.getFilesDir(), s);
        obj1 = obj2;
        if (!((File) (obj3)).exists())
        {
            break MISSING_BLOCK_LABEL_107;
        }
        obj1 = obj2;
        obj3 = new BufferedReader(new InputStreamReader(new FileInputStream(((File) (obj3))), Charset.defaultCharset()));
        obj2 = obj3;
        obj1 = gson.fromJson(((java.io.Reader) (obj3)), class1);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        Exception exception;
        try
        {
            ((BufferedReader) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        com/accuweather/android/utilities/PreferenceUtils;
        JVM INSTR monitorexit ;
        return obj1;
        if (true)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1) { }
        com/accuweather/android/utilities/PreferenceUtils;
        JVM INSTR monitorexit ;
        if (Logger.isDebugEnabled())
        {
            Logger.d(com/accuweather/android/utilities/PersistanceUtils.getName(), (new StringBuilder()).append("End getObjectFromSharedPreferences(), returning null because no data exists for ").append(s).toString());
        }
        return null;
        exception;
        obj1 = null;
_L8:
        obj2 = obj1;
        Logger.d(com/accuweather/android/utilities/PersistanceUtils.getName(), (new StringBuilder()).append("Could not read from: ").append(s).append("because of: ").append(exception).toString());
        obj2 = obj1;
        context = new File(context.getFilesDir(), s);
        obj2 = obj1;
        context = new File((new StringBuilder()).append(context.getPath()).append(".bak").toString());
        obj2 = obj1;
        if (!context.exists())
        {
            break MISSING_BLOCK_LABEL_313;
        }
        obj2 = obj1;
        context = new BufferedReader(new InputStreamReader(new FileInputStream(context), Charset.defaultCharset()));
        obj1 = context;
        class1 = ((Class) (gson.fromJson(context, class1)));
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        com/accuweather/android/utilities/PreferenceUtils;
        JVM INSTR monitorexit ;
        return class1;
        class1 = ((Class) (obj1));
_L1:
        if (class1 != null)
        {
            try
            {
                class1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Class class1) { }
            finally { }
        }
        break MISSING_BLOCK_LABEL_119;
        obj2;
        class1 = ((Class) (obj1));
_L6:
        obj1 = class1;
        Logger.d(com/accuweather/android/utilities/PersistanceUtils.getName(), (new StringBuilder()).append("Could not read from backed-up: ").append(s).append("because of: ").append(obj2).toString());
          goto _L1
        s;
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_385;
        }
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1) { }
        throw s;
_L3:
        throw s;
        s;
        if (true) goto _L3; else goto _L2
_L2:
        s;
        obj1 = obj2;
        if (true) goto _L5; else goto _L4
_L4:
        obj2;
        class1 = context;
          goto _L6
        exception;
        obj1 = obj3;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static Object getObjectFromSharedPreferences(String s, Class class1, Context context)
    {
        Object obj = null;
        context = PreferenceUtils.get(context, s, null);
        s = obj;
        if (context != null)
        {
            s = ((String) (gson.fromJson(context, class1)));
        }
        return s;
    }

    public static void saveObjectToFile(String s, Object obj, Context context)
        throws DataIOException
    {
        com/accuweather/android/utilities/PreferenceUtils;
        JVM INSTR monitorenter ;
        File file;
        File file1;
        File file2;
        file = new File(context.getFilesDir(), s);
        file1 = new File((new StringBuilder()).append(file.getPath()).append(".tmp").toString());
        file2 = new File((new StringBuilder()).append(file.getPath()).append(".bak").toString());
        Object obj1;
        s = null;
        obj1 = null;
        context = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1), Charset.defaultCharset()));
        context.write(gson.toJson(obj));
        if (file.exists() && !file.renameTo(file2))
        {
            throw new DataIOException((new StringBuilder()).append("Error renaming target file ").append(file).append(" to bak file ").append(file2).toString());
        }
          goto _L1
        s;
        obj = context;
        context = s;
_L6:
        s = ((String) (obj));
        Logger.e(com/accuweather/android/utilities/PersistanceUtils.getName(), "Error in writeFileLocked", context);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        try
        {
            ((BufferedWriter) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        com/accuweather/android/utilities/PreferenceUtils;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!file1.renameTo(file))
        {
            throw new DataIOException((new StringBuilder()).append("Error renaming tmp file ").append(file1).append(" to target file ").append(file).toString());
        }
          goto _L2
        s;
_L4:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw s;
        com/accuweather/android/utilities/PreferenceUtils;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            finally { }
        }
        break MISSING_BLOCK_LABEL_205;
        obj;
        context = s;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        context;
        obj = obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void saveObjectToSharedPreferences(String s, Object obj, Context context)
    {
        PreferenceUtils.save(context, s, gson.toJson(obj));
    }

}
