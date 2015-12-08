// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ajt
{

    public ajt()
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
                context = file.list(new akd());
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

    public static void a(aif aif1, String s, int i, String s1)
    {
        Object obj;
        Object obj1;
        ajx ajx1;
        int j;
        obj1 = aif1.C;
        ajx1 = aif1.b;
        obj = null;
        aif1 = null;
        j = ajy.a(ajx1.b(s), 0);
        obj1 = ((Context) (obj1)).openFileOutput(s, i);
        aif1 = ((aif) (obj1));
        obj = obj1;
        ((FileOutputStream) (obj1)).write(s1.getBytes());
        aif1 = ((aif) (obj1));
        obj = obj1;
        ajx1.a(s, String.valueOf(j + 1));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        ((FileOutputStream) (obj1)).close();
_L2:
        return;
        aif1;
        ajn.a(aif1);
        return;
        s;
        obj = aif1;
        ajn.b(ajt, (new StringBuilder("Exception in writeEvent:")).append(s.getLocalizedMessage()).toString());
        obj = aif1;
        ajn.a(s);
        if (aif1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            aif1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aif aif1)
        {
            ajn.a(aif1);
        }
        return;
        aif1;
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ajn.a(s);
            }
        }
        throw aif1;
    }

    public static boolean a(aif aif1, String s)
    {
        Context context = aif1.C;
        aif1 = aif1.b;
        boolean flag = context.deleteFile(s);
        if (flag)
        {
            ajn.a(ajt, (new StringBuilder("File")).append(s).append(" was removed").toString());
            aif1.c(s);
        }
        return flag;
    }

    public static String[] a(Context context, String s)
    {
        Object obj;
        LinkedList linkedlist;
        linkedlist = new LinkedList();
        obj = null;
        s = new BufferedReader(new InputStreamReader(context.openFileInput(s)));
_L2:
        context = s;
        obj = s.readLine();
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = s;
        linkedlist.add(obj);
        if (true) goto _L2; else goto _L1
        obj;
_L6:
        context = s;
        ajn.a(((Exception) (obj)));
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ajn.a(context);
            }
        }
        context = new String[linkedlist.size()];
        linkedlist.toArray(context);
        return context;
_L1:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ajn.a(context);
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        context;
        s = ((String) (obj));
_L4:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ajn.a(s);
            }
        }
        throw context;
        obj;
        s = context;
        context = ((Context) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        s = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
