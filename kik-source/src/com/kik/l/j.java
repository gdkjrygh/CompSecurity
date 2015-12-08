// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.Context;
import com.android.volley.toolbox.d;
import java.io.File;
import java.util.Hashtable;
import kik.a.d.k;
import kik.android.util.bx;

// Referenced classes of package com.kik.l:
//            f

final class j
    implements Runnable
{

    final Hashtable a;
    final Context b;
    final f c;

    j(f f1, Hashtable hashtable, Context context)
    {
        c = f1;
        a = hashtable;
        b = context;
        super();
    }

    public final void run()
    {
        if (a != null && b != null) goto _L2; else goto _L1
_L1:
        File afile[];
        return;
_L2:
        int i;
        if ((afile = (new File(b.getCacheDir(), "profpics")).listFiles()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
_L4:
        File file;
        if (i >= afile.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        file = afile[i];
        String s = file.getName();
        Object obj = null;
        if (s.length() >= 16)
        {
            obj = s.substring(0, s.length() - 16);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        obj = (k)a.get(obj);
        if (obj != null)
        {
            try
            {
                if (((k) (obj)).r() != null)
                {
                    obj = com.kik.cache.k.a(((k) (obj)));
                    com.android.volley.b.a a1 = new com.android.volley.b.a();
                    a1.d = System.currentTimeMillis() + 0x41353000L;
                    a1.e = System.currentTimeMillis() + 0x41353000L;
                    a1.a = f.a(file);
                    com.kik.l.f.d(c).a(((String) (obj)), a1);
                }
            }
            catch (Exception exception)
            {
                bx.a(exception);
            }
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }
}
