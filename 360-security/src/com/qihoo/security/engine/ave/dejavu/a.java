// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.ave.dejavu;

import android.content.Context;
import android.text.TextUtils;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.env.QVSEnv;
import com.qihoo.security.services.ScanResult;
import com.qihoo360.common.utils.HashUtil;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class a
{

    final Context a;
    final Method b;
    final Method c;

    public a(Context context)
    {
        a = context;
        File file1 = new File(context.getFileStreamPath("ave"), "heurmod_v2.jar");
        File file = file1;
        if (QVSEnv.bEvalMode)
        {
            File file2 = context.getFileStreamPath("ave_e");
            file = file1;
            if (file2.exists())
            {
                file = file1;
                if (file2.listFiles() != null)
                {
                    file = file1;
                    if (file2.listFiles().length > 0)
                    {
                        file = new File(context.getFileStreamPath("ave_e"), "heurmod_v2.jar");
                    }
                }
            }
        }
        if (file.isFile() && a(context, file))
        {
            context = a(file);
        } else
        {
            context = null;
        }
        if (context != null)
        {
            c = context[0];
            b = context[1];
            return;
        } else
        {
            b = null;
            c = null;
            return;
        }
    }

    private boolean a(Context context, File file)
    {
        Object obj = null;
        context = new JarFile(file);
        file = context.entries();
_L2:
        boolean flag = file.hasMoreElements();
        if (!flag)
        {
            InputStream inputstream;
            byte abyte0[];
            int i;
            boolean flag1;
            if (context != null)
            {
                try
                {
                    context.close();
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
            }
            return true;
        }
        obj = (JarEntry)file.nextElement();
        if (((JarEntry) (obj)).isDirectory() || ((JarEntry) (obj)).getName().startsWith("META-INF/")) goto _L2; else goto _L1
_L1:
        inputstream = context.getInputStream(((java.util.zip.ZipEntry) (obj)));
        for (abyte0 = new byte[1024]; inputstream.read(abyte0) >= 0;) { }
        inputstream.close();
        obj = ((JarEntry) (obj)).getCertificates();
        if (obj == null) goto _L4; else goto _L3
_L3:
        i = obj.length;
        if (i != 0) goto _L5; else goto _L4
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return false;
_L5:
        flag1 = Arrays.equals(com.qihoo.security.engine.ave.a.a, HashUtil.getHash("MD5", obj[0].getEncoded()));
        if (flag1) goto _L2; else goto _L4
        context;
        context = ((Context) (obj));
_L9:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return false;
        file;
        context = null;
_L7:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw file;
        file;
        if (true) goto _L7; else goto _L6
_L6:
        file;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private Method[] a(File file)
    {
        file = new DexClassLoader(file.getAbsolutePath(), file.getParentFile().getAbsolutePath(), null, getClass().getClassLoader());
        Object obj;
        try
        {
            obj = file.loadClass("com.qihoo.security.engine.heur.Scanner");
            file = ((Class) (obj)).getMethod("preScan", new Class[] {
                android/content/Context, com/qihoo/security/services/ScanResult
            });
            obj = ((Class) (obj)).getMethod("scan", new Class[] {
                android/content/Context, com/qihoo/security/services/ScanResult
            });
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return null;
        }
        return (new Method[] {
            file, obj
        });
    }

    public int a(Context context, ScanResult scanresult)
    {
        return a(context, c, scanresult);
    }

    public int a(Context context, Method method, ScanResult scanresult)
    {
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        int i = ((Integer)method.invoke(null, new Object[] {
            context, scanresult
        })).intValue();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (!TextUtils.isEmpty(scanresult.fileInfo.trojanName));
        scanresult.fileInfo.apkInfo.timestamp = 1000;
        return i;
        context;
_L2:
        return scanresult.fileInfo.apkInfo.maliceRank;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int b(Context context, ScanResult scanresult)
    {
        return a(context, b, scanresult);
    }
}
