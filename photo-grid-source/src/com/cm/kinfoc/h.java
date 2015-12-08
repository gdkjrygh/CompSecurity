// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import java.io.File;

public final class h
{

    public static void a(String s)
    {
        try
        {
            b(s);
            (new File(s.toString())).delete();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    private static boolean b(String s)
    {
        int i = 0;
        File file;
        if (s != null && s.length() > 0)
        {
            if ((file = new File(s)).exists() && file.isDirectory())
            {
                String as[] = file.list();
                boolean flag1;
                if (as != null)
                {
                    boolean flag = false;
                    do
                    {
                        flag1 = flag;
                        if (i >= as.length)
                        {
                            break;
                        }
                        File file1;
                        if (s.endsWith(File.separator))
                        {
                            file1 = new File((new StringBuilder()).append(s).append(as[i]).toString());
                        } else
                        {
                            file1 = new File((new StringBuilder()).append(s).append(File.separator).append(as[i]).toString());
                        }
                        if (file1.isFile())
                        {
                            file1.delete();
                        }
                        if (file1.isDirectory())
                        {
                            b((new StringBuilder()).append(s).append(File.separatorChar).append(as[i]).toString());
                            a((new StringBuilder()).append(s).append(File.separatorChar).append(as[i]).toString());
                            flag = true;
                        }
                        i++;
                    } while (true);
                } else
                {
                    flag1 = false;
                }
                return flag1;
            }
        }
        return false;
    }
}
