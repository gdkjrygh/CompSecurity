// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.soloader;

import android.content.Context;
import com.facebook.androidcompat.AndroidCompat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.soloader:
//            DirectorySoSource, SysUtil, FileLocker

public class ExoSoSource extends DirectorySoSource
{

    public ExoSoSource(Context context)
    {
        File file;
        Object obj;
        Map map;
        super(SysUtil.c(context), 1);
        file = super.a;
        map = a(context);
        obj = SysUtil.a(context);
        context = file.listFiles();
        int i = 0;
_L16:
        if (i >= context.length) goto _L2; else goto _L1
_L1:
        Object obj1 = context[i];
        String s;
        File file1;
        s = ((File) (obj1)).getName();
        file1 = (File)map.get(s);
        if (file1 == null) goto _L4; else goto _L3
_L3:
        if (file1.length() == ((File) (obj1)).length() && file1.lastModified() == ((File) (obj1)).lastModified()) goto _L5; else goto _L4
_L15:
        Throwable throwable;
        if (file1 != null && !flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        SysUtil.a(((File) (obj1)));
        if (!flag1) goto _L7; else goto _L6
_L6:
        map.remove(s);
          goto _L7
_L2:
        context = map.keySet().iterator();
_L10:
        if (!context.hasNext()) goto _L9; else goto _L8
_L8:
        s = (String)context.next();
        file1 = (File)map.get(s);
        obj1 = new FileInputStream(file1);
        SysUtil.a(((InputStream) (obj1)), new File(file, s), file1.length(), file1.lastModified());
        ((InputStream) (obj1)).close();
        SysUtil.a();
          goto _L10
        throwable;
        throw throwable;
        context;
_L17:
        if (obj != null)
        {
            if (throwable != null)
            {
                try
                {
                    ((FileLocker) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    AndroidCompat.a(throwable, ((Throwable) (obj)));
                }
            } else
            {
                ((FileLocker) (obj)).close();
            }
        }
        throw context;
        throwable;
        throw throwable;
        context;
_L14:
        if (throwable == null) goto _L12; else goto _L11
_L11:
        ((InputStream) (obj1)).close();
_L13:
        throw context;
        obj1;
        AndroidCompat.a(throwable, ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
_L12:
        ((InputStream) (obj1)).close();
        if (true) goto _L13; else goto _L9
_L9:
        if (obj != null)
        {
            ((FileLocker) (obj)).close();
        }
        return;
        context;
        throwable = null;
        if (true) goto _L14; else goto _L4
_L4:
        flag = true;
          goto _L15
_L7:
        i++;
          goto _L16
_L5:
        flag = false;
          goto _L15
        context;
        throwable = null;
          goto _L17
    }

    private static Map a(Context context)
    {
        Object obj;
        Throwable throwable;
        String as[];
        int i;
        int j;
        throwable = null;
        i = 0;
        context = new File((new StringBuilder("/data/local/tmp/exopackage/")).append(context.getPackageName()).append("/native-libs/").toString());
        obj = new HashMap();
        as = SysUtil.b();
        j = as.length;
_L14:
        if (i >= j) goto _L2; else goto _L1
_L1:
        File file = new File(context, as[i]);
        if (!file.isDirectory()) goto _L4; else goto _L3
_L3:
        Object obj1 = new File(file, "metadata.txt");
        if (!((File) (obj1)).isFile()) goto _L4; else goto _L5
_L5:
        obj1 = new FileReader(((File) (obj1)));
        Object obj2 = new BufferedReader(((java.io.Reader) (obj1)));
_L9:
        String s1 = ((BufferedReader) (obj2)).readLine();
        if (s1 == null) goto _L7; else goto _L6
_L6:
        if (s1.length() == 0) goto _L9; else goto _L8
_L8:
        int k = s1.indexOf(' ');
        if (k != -1) goto _L11; else goto _L10
_L10:
        try
        {
            throw new RuntimeException((new StringBuilder("illegal line in exopackage metadata: [")).append(s1).append("]").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            obj = null;
        }
        throw obj;
        context;
        if (obj == null) goto _L13; else goto _L12
_L12:
        ((BufferedReader) (obj2)).close();
_L15:
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        context;
_L16:
        String s;
        if (obj != null)
        {
            try
            {
                ((FileReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                AndroidCompat.a(((Throwable) (obj)), throwable);
            }
        } else
        {
            ((FileReader) (obj1)).close();
        }
        throw context;
_L11:
        s = (new StringBuilder()).append(s1.substring(0, k)).append(".so").toString();
        s1 = s1.substring(k + 1);
        if (!((HashMap) (obj)).containsKey(s))
        {
            ((HashMap) (obj)).put(s, new File(file, s1));
        }
          goto _L9
_L7:
        ((BufferedReader) (obj2)).close();
        ((FileReader) (obj1)).close();
_L4:
        i++;
          goto _L14
        obj2;
        AndroidCompat.a(((Throwable) (obj)), ((Throwable) (obj2)));
          goto _L15
_L13:
        ((BufferedReader) (obj2)).close();
          goto _L15
_L2:
        return ((Map) (obj));
        context;
        obj = throwable;
          goto _L16
    }
}
