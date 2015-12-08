// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d;

import com.c.b.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.c.c;

// Referenced classes of package com.kik.d:
//            a, c

public class b
    implements a
{

    private static final org.c.b a = org.c.c.a(com/kik/d/b);
    private final String b;
    private final File c;
    private final com.kik.d.c d;
    private final boolean e;

    public b(String s, File file, boolean flag)
    {
        e = flag;
        c = file;
        b = s;
        if (s != null)
        {
            d = new com.kik.d.c(s, file);
            return;
        } else
        {
            d = null;
            return;
        }
    }

    public final void a(String s, String s1, String s2, String s3, List list)
    {
        int i = 4096;
        if (c.isDirectory() || c.mkdirs()) goto _L2; else goto _L1
_L1:
        a.b("Could not create metrics directory");
_L4:
        return;
_L2:
        Object obj;
        obj = (new StringBuilder()).append(System.currentTimeMillis()).append(".met").toString();
        obj = new File(c, ((String) (obj)));
        FileOutputStream fileoutputstream = new FileOutputStream(((File) (obj)));
        obj = fileoutputstream;
        s1 = com.kik.d.b.a.g.l().a(s).d(s1).b(s2).a(list).c(s3).r();
        obj = fileoutputstream;
        int j = s1.b();
        if (j <= 4096)
        {
            i = j;
        }
        obj = fileoutputstream;
        s2 = h.a(fileoutputstream, i);
        obj = fileoutputstream;
        s1.a(s2);
        obj = fileoutputstream;
        s2.b();
        i = 1;
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a.a("Failed to close file", s1);
        }
_L5:
        if (i != 0 && d != null)
        {
            d.a((new StringBuilder()).append(b).append("?user=").append(s).toString());
            d.a();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        s2;
        s1 = null;
_L8:
        obj = s1;
        a.b("Failed to write metrics log", s2);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        s1.close();
        i = 0;
          goto _L5
        s1;
        a.a("Failed to close file", s1);
        i = 0;
          goto _L5
        s;
        obj = null;
_L7:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                a.a("Failed to close file", s1);
            }
        }
        throw s;
        s;
        if (true) goto _L7; else goto _L6
_L6:
        s2;
        s1 = fileoutputstream;
          goto _L8
    }

}
