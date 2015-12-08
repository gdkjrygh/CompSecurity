// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template;

import com.roidapp.baselib.d.a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

final class k
    implements Runnable
{

    final ArrayList a;
    final String b;

    k(ArrayList arraylist, String s)
    {
        a = arraylist;
        b = s;
        super();
    }

    public final void run()
    {
        Object obj2;
        String s;
        Object obj = new HashMap();
        ((HashMap) (obj)).put("data", a);
        s = (new com.google.a.k()).a(obj);
        obj = new File((new StringBuilder()).append(com.roidapp.baselib.d.a.b()).append("/.Template").toString());
        obj2 = new File(((File) (obj)), b);
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        if (((File) (obj2)).exists())
        {
            ((File) (obj2)).delete();
        }
        obj2 = new FileWriter(((File) (obj2)));
        Object obj1 = obj2;
        ((FileWriter) (obj2)).write(s);
        ((FileWriter) (obj2)).close();
_L2:
        return;
        IOException ioexception2;
        ioexception2;
        obj2 = null;
_L5:
        obj1 = obj2;
        ioexception2.printStackTrace();
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        try
        {
            ((FileWriter) (obj2)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            return;
        }
        Exception exception;
        exception;
        obj1 = null;
_L4:
        IOException ioexception;
        if (obj1 != null)
        {
            try
            {
                ((FileWriter) (obj1)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw exception;
        ioexception;
        return;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
        ioexception2;
          goto _L5
    }
}
