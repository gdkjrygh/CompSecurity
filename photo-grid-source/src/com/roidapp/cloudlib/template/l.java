// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template;

import com.roidapp.baselib.d.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.template:
//            a, j

final class l
    implements Runnable
{

    final boolean a;

    l(boolean flag)
    {
        a = flag;
        super();
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        Object obj2;
        com.roidapp.cloudlib.template.a a1;
        obj1 = null;
        obj = null;
        a1 = new com.roidapp.cloudlib.template.a();
        obj2 = new File((new StringBuilder()).append(com.roidapp.baselib.d.a.b()).append("/.Template").toString());
        if (!((File) (obj2)).exists())
        {
            ((File) (obj2)).mkdirs();
        }
        obj2 = new File(((File) (obj2)), "/favourite");
        if (!((File) (obj2)).exists()) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder = new StringBuilder();
        obj2 = new BufferedReader(new FileReader(((File) (obj2))));
        obj1 = obj;
_L4:
        obj = obj2;
        Object obj3 = ((BufferedReader) (obj2)).readLine();
        if (obj3 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj3;
        obj = obj2;
        stringbuilder.append(((String) (obj3)));
        obj1 = obj3;
        if (true) goto _L4; else goto _L3
        obj3;
_L8:
        obj = obj2;
        ((IOException) (obj3)).printStackTrace();
        obj = obj1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        ((BufferedReader) (obj2)).close();
        obj = obj1;
_L5:
        if (obj != null)
        {
            obj = j.b(((String) (obj)));
            if (obj != null && !((List) (obj)).isEmpty())
            {
                a1.a(((List) (obj)));
            }
        }
_L2:
        if (a)
        {
            a1.b();
            return;
        } else
        {
            a1.c();
            return;
        }
_L3:
        obj1 = obj3;
        obj = obj2;
        obj3 = stringbuilder.toString();
        obj = obj3;
        try
        {
            ((BufferedReader) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
          goto _L5
        obj1;
        obj = null;
_L6:
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw obj1;
        ioexception;
        ioexception = ((IOException) (obj1));
          goto _L5
        obj1;
          goto _L6
        obj3;
        obj2 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
