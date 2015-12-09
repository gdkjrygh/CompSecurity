// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import p.aq.b;

// Referenced classes of package com.comscore.utils:
//            s, n, p, c

public class j
{

    public j()
    {
    }

    public static ArrayList a(Context context)
    {
        Object obj = null;
        File file = context.getFilesDir();
        context = obj;
        if (file != null)
        {
            context = obj;
            if (file.isDirectory())
            {
                context = file.list(new s());
                if (context != null)
                {
                    Arrays.sort(context);
                } else
                {
                    context = new String[0];
                }
            }
        }
        return new ArrayList(Arrays.asList(context));
    }

    public static void a(b b1, String s1, int i, String s2)
    {
        Object obj;
        Object obj1;
        n n1;
        int k;
        obj1 = b1.P();
        n1 = b1.r();
        obj = null;
        b1 = null;
        k = p.a(n1.b(s1), 0);
        obj1 = ((Context) (obj1)).openFileOutput(s1, i);
        b1 = ((b) (obj1));
        obj = obj1;
        ((FileOutputStream) (obj1)).write(s2.getBytes());
        b1 = ((b) (obj1));
        obj = obj1;
        n1.a(s1, String.valueOf(k + 1));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        ((FileOutputStream) (obj1)).close();
_L2:
        return;
        b1;
        c.a(b1);
        return;
        s1;
        obj = b1;
        com.comscore.utils.c.b(com/comscore/utils/j, (new StringBuilder()).append("Exception in writeEvent:").append(s1.getLocalizedMessage()).toString());
        obj = b1;
        c.a(s1);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            b1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            c.a(b1);
        }
        return;
        b1;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                c.a(s1);
            }
        }
        throw b1;
    }

    public static boolean a(b b1, String s1)
    {
        Context context = b1.P();
        b1 = b1.r();
        boolean flag = context.deleteFile(s1);
        if (flag)
        {
            c.a(com/comscore/utils/j, (new StringBuilder()).append("File").append(s1).append(" was removed").toString());
            b1.c(s1);
        }
        return flag;
    }

    public static String[] a(Context context, String s1)
    {
        Object obj;
        LinkedList linkedlist;
        linkedlist = new LinkedList();
        obj = null;
        s1 = new BufferedReader(new InputStreamReader(context.openFileInput(s1)));
_L4:
        context = s1;
        obj = s1.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        context = s1;
        linkedlist.add(obj);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
_L8:
        context = s1;
        c.a(((Exception) (obj)));
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                c.a(context);
            }
        }
        context = new String[linkedlist.size()];
        linkedlist.toArray(context);
        return context;
_L2:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                c.a(context);
            }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        context;
        s1 = ((String) (obj));
_L6:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                c.a(s1);
            }
        }
        throw context;
        obj;
        s1 = context;
        context = ((Context) (obj));
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        s1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
