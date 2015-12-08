// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public final class oqs
{

    private static final ThreadLocal a = new oqt();

    public static String a(long l)
    {
        if (l < 1024L)
        {
            return (new StringBuilder(22)).append(l).append(" B").toString();
        } else
        {
            int i = (int)(Math.log(l) / Math.log(1024D));
            return String.format("%.1f %sB", new Object[] {
                Double.valueOf((double)l / Math.pow(1024D, i)), Character.valueOf("KMGTPE".charAt(i - 1))
            });
        }
    }

    private static String a(InputStream inputstream)
    {
        String s = (new BufferedReader(new InputStreamReader(inputstream))).readLine();
        if (s == null)
        {
            s = "";
        }
        inputstream.close();
        return s;
        Exception exception;
        exception;
        inputstream.close();
        throw exception;
    }

    public static String a(String s)
    {
        return a(((InputStream) (new FileInputStream(s))));
    }

    public static StringBuilder a()
    {
        oqu oqu1 = (oqu)a.get();
        oqu1.b = oqu1.b + 1;
        if (oqu1.b == 1)
        {
            return oqu1.a;
        } else
        {
            return new StringBuilder(256);
        }
    }

    public static void a(String s, String s1)
    {
        FileOutputStream fileoutputstream = new FileOutputStream(s);
        s = fileoutputstream;
_L2:
        s = new BufferedWriter(new OutputStreamWriter(s));
        s.write(s1);
        s.close();
        return;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        File file = (new File(s)).getParentFile();
        if (file != null && !file.exists())
        {
            file.mkdirs();
            s = new FileOutputStream(s);
        } else
        {
            throw filenotfoundexception;
        }
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        s.close();
        throw s1;
    }

    public static void a(StringBuilder stringbuilder)
    {
        oqu oqu1 = (oqu)a.get();
        if (oqu1.b <= 0)
        {
            throw new IllegalStateException("Cannot release more StringBuilders than have been acquired");
        }
        if (oqu1.b == 1 && stringbuilder != oqu1.a)
        {
            throw new IllegalArgumentException("Tried to release wrong StringBuilder instance");
        } else
        {
            stringbuilder.setLength(0);
            oqu1.b = oqu1.b - 1;
            return;
        }
    }

    public static String b(StringBuilder stringbuilder)
    {
        String s = stringbuilder.toString();
        a(stringbuilder);
        return s;
    }

    static 
    {
        new Random();
        "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
