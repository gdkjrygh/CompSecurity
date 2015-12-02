// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.a.a.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.qihoo.a.a.a:
//            h, f

class a
{

    public static long a(Context context, String s)
    {
        Object obj = null;
        try
        {
            context = context.openFileInput((new StringBuilder(String.valueOf(s))).append(".timestamp").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
        }
        return a(((InputStream) (context)));
    }

    private static long a(InputStream inputstream)
    {
        long l = 0L;
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        Object obj = new DataInputStream(inputstream);
        long l1 = Long.parseLong(((DataInputStream) (obj)).readLine());
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return l1;
            }
        }
        l = l1;
        if (inputstream == null) goto _L1; else goto _L3
_L3:
        inputstream.close();
        return l1;
        obj;
        obj = null;
_L7:
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return 0L;
            }
        }
        if (inputstream == null) goto _L1; else goto _L4
_L4:
        inputstream.close();
        return 0L;
        Object obj1;
        obj1;
        obj = null;
_L6:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        ((DataInputStream) (obj)).close();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        throw obj1;
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
          goto _L7
    }

    public static final boolean a(Context context, String s, String s1, String s2)
    {
        context = h.a(context, s);
        if (!TextUtils.isEmpty(context))
        {
            if (!TextUtils.isEmpty(s = h.a(s1, s2)))
            {
                return context.equals(s);
            }
        }
        return false;
    }

    public static final boolean a(Context context, String s, String s1, String s2, String s3)
    {
        File file;
        File file1;
        Object obj;
        file = new File((new StringBuilder(String.valueOf(s1))).append("/").append(s2).toString());
        file1 = new File((new StringBuilder(String.valueOf(s1))).append("/").append(s2).append(".timestamp").toString());
        obj = file.getParentFile();
        break MISSING_BLOCK_LABEL_76;
label0:
        for (; file.exists(); file1.delete())
        {
            do
            {
                do
                {
                    do
                    {
                        return false;
                    } while (!((File) (obj)).exists() && !((File) (obj)).mkdirs() || !((File) (obj)).exists() || !((File) (obj)).isDirectory());
                    if (!file.exists())
                    {
                        break label0;
                    }
                    if (a(context, file.getName()) >= b(context, s))
                    {
                        return true;
                    }
                    if (!s2.endsWith(".jar") && !s2.endsWith(".apk") || TextUtils.isEmpty(s3))
                    {
                        break;
                    }
                    obj = s2.substring(0, s2.length() - 4);
                    s3 = new File((new StringBuilder(String.valueOf(s3))).append("/").append(((String) (obj))).append(".dex").toString());
                    if (!s3.exists())
                    {
                        break;
                    }
                    s3.delete();
                } while (s3.exists());
            } while (!file.delete());
        }

        boolean flag = a(context, s, s1, s2, ((byte []) (null)));
        a(context, (new StringBuilder(String.valueOf(s))).append(".timestamp").toString(), s1, (new StringBuilder(String.valueOf(s2))).append(".timestamp").toString(), ((byte []) (null)));
        return flag;
    }

    public static final boolean a(Context context, String s, String s1, String s2, byte abyte0[])
    {
        Object obj;
        obj = null;
        s1 = new File((new StringBuilder(String.valueOf(s1))).append("/").append(s2).toString());
        context = context.getAssets().open(s);
        int i;
        int j;
        int k;
        int l;
        try
        {
            s1 = new FileOutputStream(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = obj;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            s1 = null;
        }
        s = new byte[4096];
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        if (abyte0.length <= 0) goto _L2; else goto _L3
_L3:
        i = 0;
_L7:
        l = context.read(s);
        if (l >= 0) goto _L5; else goto _L4
_L4:
        f.a(context);
        f.a(s1);
        return true;
_L5:
        if (l <= 0) goto _L7; else goto _L6
_L6:
        j = 0;
_L14:
        if (j < l)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s1.write(s, 0, l);
          goto _L7
        byte byte0 = s[j];
        k = i + 1;
        s[j] = (byte)(abyte0[i] ^ byte0);
        i = k;
        if (k >= abyte0.length)
        {
            i = 0;
        }
          goto _L8
_L10:
        if (i <= 0) goto _L2; else goto _L9
_L9:
        s1.write(s, 0, i);
_L2:
        i = context.read(s);
        if (i >= 0) goto _L10; else goto _L4
        context;
        context = null;
        s = obj;
_L13:
        f.a(context);
        f.a(s);
        return false;
        s;
        s1 = null;
        context = null;
_L12:
        f.a(context);
        f.a(s1);
        throw s;
        s;
        if (true) goto _L12; else goto _L11
_L11:
        s;
        s = s1;
        if (true) goto _L13; else goto _L8
_L8:
        j++;
          goto _L14
    }

    public static long b(Context context, String s)
    {
        Object obj = null;
        try
        {
            context = context.getAssets().open((new StringBuilder(String.valueOf(s))).append(".timestamp").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
        }
        return a(context);
    }
}
