// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import com.android.volley.toolbox.d;
import java.io.File;
import kik.android.util.bx;

// Referenced classes of package com.kik.l:
//            p

final class t
    implements Runnable
{

    final File a;
    final p b;

    t(p p1, File file)
    {
        b = p1;
        a = file;
        super();
    }

    public final void run()
    {
        File afile[] = (new File(a, "chatPicsBig")).listFiles();
        if (afile != null)
        {
            int j = afile.length;
            int i = 0;
            while (i < j) 
            {
                File file = afile[i];
                try
                {
                    String s = file.getName();
                    com.android.volley.b.a a1 = new com.android.volley.b.a();
                    a1.d = System.currentTimeMillis() + 0x41353000L;
                    a1.e = System.currentTimeMillis() + 0x41353000L;
                    a1.a = p.b(file);
                    com.kik.l.p.d(b).a(s, a1);
                }
                catch (Exception exception)
                {
                    bx.a(exception);
                }
                i++;
            }
        }
    }
}
