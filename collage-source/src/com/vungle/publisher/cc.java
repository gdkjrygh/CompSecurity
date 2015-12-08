// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import com.vungle.log.Logger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class cc
{

    static final Pattern a = Pattern.compile("[|\\\\?*<\":>+'&\\[\\]]");

    public static transient String a(Object aobj[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < 2; i++)
        {
            Object obj = aobj[i];
            if (obj == null)
            {
                throw new IllegalArgumentException((new StringBuilder("null path element at index ")).append(i).toString());
            }
            stringbuilder.append(obj);
            int j = stringbuilder.length();
            if (j > 0 && i + 1 < 2 && stringbuilder.charAt(j - 1) != File.separatorChar)
            {
                stringbuilder.append(File.separatorChar);
            }
        }

        return stringbuilder.toString();
    }

    public static boolean a(File file)
    {
        if (file == null)
        {
            Logger.w("VungleFile", "null directory path");
            return false;
        }
        if (file.mkdirs())
        {
            Logger.d("VungleFile", (new StringBuilder("created directory: ")).append(file).toString());
            return true;
        }
        if (file.isDirectory())
        {
            Logger.v("VungleFile", (new StringBuilder("directory exists: ")).append(file).toString());
            return true;
        } else
        {
            Logger.d("VungleFile", (new StringBuilder("unable to create directory: ")).append(file).toString());
            return false;
        }
    }

    public static boolean a(File file, File file1)
        throws IOException
    {
        file1 = file1.getCanonicalPath();
        file = file.getCanonicalPath();
        return file1 != null && !file1.equals(file) && file1.startsWith(file);
    }

    public static boolean a(String s)
    {
        s = new File(s);
        boolean flag = c(s);
        if (flag)
        {
            Logger.d("VungleFile", (new StringBuilder("successfully deleted: ")).append(s).toString());
            return flag;
        } else
        {
            Logger.w("VungleFile", (new StringBuilder("could not delete: ")).append(s).toString());
            return flag;
        }
    }

    public static boolean b(File file)
    {
        boolean flag;
label0:
        {
            flag = false;
            file = file.getParentFile();
            if (a(file))
            {
                flag = file.canWrite();
                if (!flag)
                {
                    break label0;
                }
                Logger.v("VungleFile", (new StringBuilder("directory is writeable: ")).append(file).toString());
            }
            return flag;
        }
        Logger.d("VungleFile", (new StringBuilder("directory not writeable: ")).append(file).toString());
        return flag;
    }

    public static boolean b(String s)
    {
        return !a.matcher(s).find();
    }

    public static String c(String s)
    {
        Matcher matcher = a.matcher(s);
        String s1 = s;
        if (matcher.find())
        {
            s1 = matcher.replaceAll("_");
            Logger.i("VungleFile", (new StringBuilder("Unsafe character(s) found / replaced in filepath: ")).append(s).append(" --> ").append(s1).toString());
        }
        return s1;
    }

    private static boolean c(File file)
    {
        ArrayDeque arraydeque;
        boolean flag;
        arraydeque = new ArrayDeque();
        arraydeque.push(file);
        file = (File)arraydeque.peek();
        flag = true;
_L8:
        if (file == null) goto _L2; else goto _L1
_L1:
        if (!file.isDirectory()) goto _L4; else goto _L3
_L3:
        File afile[] = file.listFiles();
        if (afile.length <= 0) goto _L4; else goto _L5
_L5:
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            arraydeque.push(afile[i]);
        }

_L6:
        file = (File)arraydeque.peek();
        continue; /* Loop/switch isn't completed */
_L4:
        arraydeque.pop();
        if (flag && (!file.exists() || file.delete()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (true) goto _L6; else goto _L2
_L2:
        return flag;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
