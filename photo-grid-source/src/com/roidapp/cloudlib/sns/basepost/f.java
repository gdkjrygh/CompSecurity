// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.google.a.k;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.d.a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            d

final class f
    implements Runnable
{

    final d a;

    f(d d1)
    {
        a = d1;
        super();
    }

    public final void run()
    {
        Object obj;
        String s;
        obj = new HashMap();
        ((HashMap) (obj)).put("data", com.roidapp.cloudlib.sns.basepost.d.a(a));
        s = (new k()).a(obj);
        obj = com.roidapp.baselib.d.a.a(aj.a(), "sns_common");
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        obj = new File(((File) (obj)), "recommanded_users");
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        FileWriter filewriter = new FileWriter(((File) (obj)));
        obj = filewriter;
        filewriter.write(s);
        filewriter.close();
_L2:
        return;
        IOException ioexception2;
        ioexception2;
        filewriter = null;
_L5:
        obj = filewriter;
        ioexception2.printStackTrace();
        if (filewriter == null) goto _L2; else goto _L1
_L1:
        try
        {
            filewriter.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        Exception exception;
        exception;
        obj = null;
_L4:
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((FileWriter) (obj)).close();
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
