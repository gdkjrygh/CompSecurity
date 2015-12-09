// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.e;

import android.content.Context;
import com.fitbit.e.a;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class c
{

    public c()
    {
    }

    public static String a(Context context, String s)
        throws IOException
    {
        s = context.openFileInput(s);
        context = new StringBuffer(1000);
        s = new BufferedReader(new InputStreamReader(s));
        char ac[] = new char[1024];
_L3:
        int i = s.read(ac);
        if (i == -1) goto _L2; else goto _L1
_L1:
        context.append(ac, 0, i);
          goto _L3
        context;
_L5:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.fitbit.e.a.a("FileUtils", s.toString(), new Object[0]);
            }
        }
        throw context;
_L2:
        context = context.toString();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.fitbit.e.a.a("FileUtils", s.toString(), new Object[0]);
                return context;
            }
        }
        return context;
        context;
        s = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void a(Context context, String s, String s1)
        throws IOException
    {
        a(context, s, s1.getBytes());
    }

    public static void a(Context context, String s, byte abyte0[])
        throws IOException
    {
        Context context1 = null;
        context = context.openFileOutput(s, 0);
        context1 = context;
        context.write(abyte0);
        context1 = context;
        context.getFD().sync();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        context.close();
        return;
        context;
        throw new RuntimeException(context);
        context;
        if (context1 != null)
        {
            try
            {
                context1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new RuntimeException(context);
            }
        }
        throw context;
    }

    public static void b(Context context, String s)
    {
        context.deleteFile(s);
    }
}
