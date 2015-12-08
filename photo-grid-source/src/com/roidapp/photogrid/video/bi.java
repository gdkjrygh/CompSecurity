// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;

public final class bi
{

    private static final char a[] = "0123456789abcdef".toCharArray();

    public static String a(String s)
    {
        int i = 0;
        if (s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        s = new FileInputStream(s);
        byte abyte0[];
        Object obj1;
        abyte0 = new byte[4096];
        obj1 = MessageDigest.getInstance("MD5");
_L5:
        int j = s.read(abyte0);
        if (j == -1) goto _L4; else goto _L3
_L3:
        ((MessageDigest) (obj1)).update(abyte0, 0, j);
          goto _L5
        Object obj;
        obj;
_L12:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return null;
        }
          goto _L6
_L4:
        obj = ((MessageDigest) (obj1)).digest();
        obj1 = new StringBuilder(32);
        j = obj.length;
_L8:
        byte byte0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = obj[i];
        ((StringBuilder) (obj1)).append(a[byte0 >> 4 & 0xf]);
        ((StringBuilder) (obj1)).append(a[byte0 & 0xf]);
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        String s1 = ((StringBuilder) (obj1)).toString();
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        return s1;
        s1;
        s = null;
_L10:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw s1;
        s1;
        if (true) goto _L10; else goto _L9
_L9:
        s;
        s = null;
        if (true) goto _L12; else goto _L11
_L11:
_L6:
        if (true) goto _L1; else goto _L13
_L13:
    }

    public static boolean a(String s, String s1)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        obj = new File(s);
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        ((File) (obj)).createNewFile();
        obj = new BufferedWriter(new FileWriter(s));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        s = ((String) (obj));
        break MISSING_BLOCK_LABEL_54;
_L3:
        s = ((String) (obj));
        ((BufferedWriter) (obj)).write(s1);
        try
        {
            ((BufferedWriter) (obj)).flush();
            ((BufferedWriter) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return true;
        }
        return true;
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        s = ((String) (obj));
        "roidapp".length();
          goto _L3
        s;
        Object obj1;
        s1 = ((String) (obj));
        obj1 = s;
_L7:
        s = s1;
        ((IOException) (obj1)).printStackTrace();
        if (s1 == null) goto _L1; else goto _L4
_L4:
        try
        {
            s1.flush();
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return false;
        }
        return false;
        s1;
        s = null;
_L6:
        if (s != null)
        {
            try
            {
                s.flush();
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw s1;
        s1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        s1 = null;
          goto _L7
        s1 = null;
          goto _L3
    }

    public static String b(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!(s = new File(s)).exists()) goto _L1; else goto _L3
_L3:
        Object obj1 = new StringBuilder();
        Object obj = new BufferedReader(new FileReader(s));
_L5:
        s = ((String) (obj));
        String s1 = ((BufferedReader) (obj)).readLine();
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((String) (obj));
        ((StringBuilder) (obj1)).append((new StringBuilder()).append(s1).append("\n").toString());
        if (true) goto _L5; else goto _L4
        obj1;
_L9:
        s = ((String) (obj));
        ((IOException) (obj1)).printStackTrace();
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
_L4:
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return b(((StringBuilder) (obj1)).toString(), "roidapp");
        obj;
        s = null;
_L7:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        throw obj;
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static String b(String s, String s1)
    {
        String s2;
        if (s == null || s.length() == 0)
        {
            s2 = null;
        } else
        {
            s2 = s;
            if (s1.length() == 0)
            {
                return s;
            }
        }
        return s2;
    }

    public static String c(String s)
    {
        return b(s, "roidapp");
    }

}
