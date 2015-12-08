// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.androidcompat.AndroidCompat;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.soloader:
//            DirectorySoSource, SysUtil, FileLocker

public class ApkSoSource extends DirectorySoSource
{

    public ApkSoSource(Context context)
    {
        Object obj;
        super(SysUtil.c(context), 1);
        obj = new JarFile(context.getApplicationInfo().publicSourceDir);
        File file;
        Object obj1;
        Object obj2;
        file = super.a;
        obj2 = a(((JarFile) (obj)));
        obj1 = SysUtil.a(context);
        context = file.listFiles();
        int i = 0;
_L21:
        if (i >= context.length) goto _L2; else goto _L1
_L1:
        Object obj3 = context[i];
        Object obj4;
        SoInfo soinfo;
        obj4 = ((File) (obj3)).getName();
        soinfo = (SoInfo)((Map) (obj2)).get(obj4);
        if (soinfo == null) goto _L4; else goto _L3
_L3:
        if (soinfo.b.getSize() == ((File) (obj3)).length() && soinfo.b.getTime() == ((File) (obj3)).lastModified()) goto _L5; else goto _L4
_L20:
        Throwable throwable;
        if (soinfo != null && !flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        SysUtil.a(((File) (obj3)));
        if (!flag1) goto _L7; else goto _L6
_L6:
        ((Map) (obj2)).remove(obj4);
          goto _L7
_L2:
        context = ((Map) (obj2)).values().iterator();
_L10:
        if (!context.hasNext()) goto _L9; else goto _L8
_L8:
        obj3 = (SoInfo)context.next();
        obj4 = ((SoInfo) (obj3)).b;
        obj2 = ((JarFile) (obj)).getInputStream(((java.util.zip.ZipEntry) (obj4)));
        SysUtil.a(((InputStream) (obj2)), new File(file, ((SoInfo) (obj3)).a), ((JarEntry) (obj4)).getSize(), ((JarEntry) (obj4)).getTime());
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        ((InputStream) (obj2)).close();
        SysUtil.a();
          goto _L10
        throwable;
        throw throwable;
        context;
_L22:
        if (obj1 == null) goto _L12; else goto _L11
_L11:
        if (throwable == null) goto _L14; else goto _L13
_L13:
        ((FileLocker) (obj1)).close();
_L12:
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        throw throwable;
        context;
_L23:
        if (throwable != null)
        {
            try
            {
                ((JarFile) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                AndroidCompat.a(throwable, ((Throwable) (obj)));
            }
        } else
        {
            ((JarFile) (obj)).close();
        }
        throw context;
        throwable;
        throw throwable;
        context;
_L19:
        if (obj2 == null) goto _L16; else goto _L15
_L15:
        if (throwable == null) goto _L18; else goto _L17
_L17:
        ((InputStream) (obj2)).close();
_L16:
        throw context;
        obj2;
        AndroidCompat.a(throwable, ((Throwable) (obj2)));
        continue; /* Loop/switch isn't completed */
_L18:
        ((InputStream) (obj2)).close();
        if (true) goto _L16; else goto _L9
_L9:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        ((FileLocker) (obj1)).close();
        ((JarFile) (obj)).close();
        return;
        obj1;
        AndroidCompat.a(throwable, ((Throwable) (obj1)));
          goto _L12
_L14:
        ((FileLocker) (obj1)).close();
          goto _L12
        context;
        throwable = null;
          goto _L19
_L4:
        flag = true;
          goto _L20
_L7:
        i++;
          goto _L21
_L5:
        flag = false;
          goto _L20
        context;
        throwable = null;
          goto _L22
        context;
        throwable = null;
          goto _L23
    }

    private static Map a(JarFile jarfile)
    {
        Pattern pattern = Pattern.compile("^lib/([^/]+)/([^/]+\\.so)$");
        HashMap hashmap = new HashMap();
        String as[] = SysUtil.b();
        jarfile = jarfile.entries();
        do
        {
            if (!jarfile.hasMoreElements())
            {
                break;
            }
            JarEntry jarentry = (JarEntry)jarfile.nextElement();
            Object obj = pattern.matcher(jarentry.getName());
            if (((Matcher) (obj)).matches())
            {
                String s = ((Matcher) (obj)).group(1);
                obj = ((Matcher) (obj)).group(2);
                int i = SysUtil.a(as, s);
                if (i >= 0)
                {
                    SoInfo soinfo = (SoInfo)hashmap.get(obj);
                    if (soinfo == null || i < soinfo.c)
                    {
                        hashmap.put(obj, new SoInfo(((String) (obj)), jarentry, i));
                    }
                }
            }
        } while (true);
        return hashmap;
    }

    private class SoInfo
    {

        public final String a;
        public final JarEntry b;
        public final int c;

        SoInfo(String s, JarEntry jarentry, int i)
        {
            a = s;
            b = jarentry;
            c = i;
        }
    }

}
