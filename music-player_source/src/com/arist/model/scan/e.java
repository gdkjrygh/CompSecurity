// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.scan;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Handler;
import android.os.Message;
import com.arist.c.a;
import com.arist.c.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.arist.model.scan:
//            a

public final class e extends Thread
{

    private static final Object f = new Object();
    ContentResolver a;
    long b;
    private boolean c;
    private boolean d;
    private List e;
    private List g;
    private Handler h;

    public e(ContentResolver contentresolver, Handler handler, List list)
    {
        c = false;
        d = false;
        e = new ArrayList();
        b = 0L;
        a = contentresolver;
        g = list;
        h = handler;
    }

    private void a(File file)
    {
        boolean flag;
        int k;
        boolean flag1;
        flag1 = true;
        k = 0;
        flag = false;
        if (!c) goto _L2; else goto _L1
_L1:
        return;
_L2:
        File afile[];
        int i;
        if (file.exists() && file.canRead() && !file.isHidden())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!file.isDirectory())
        {
            break; /* Loop/switch isn't completed */
        }
        afile = file.listFiles();
        if (afile != null && afile.length != 0)
        {
            long l = System.currentTimeMillis();
            if (l - b > 100L)
            {
                b = l;
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                h.obtainMessage(0, file.getAbsolutePath()).sendToTarget();
            }
            k = afile.length;
            i = ((flag) ? 1 : 0);
            while (i < k) 
            {
                a(afile[i]);
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (file.getAbsolutePath().toLowerCase().endsWith(".lrc"))
        {
            com.arist.c.c.a(file, new File((new StringBuilder(String.valueOf(a.F))).append(com.arist.c.c.d(file.getAbsolutePath())).append(".lrc").toString()));
            return;
        }
        if (file.length() > 51200L && com.arist.model.scan.a.a(file.getAbsolutePath()))
        {
            Object obj = file.getAbsolutePath();
            int j = k;
            if (a != null)
            {
                obj = a.query(android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[] {
                    "_id"
                }, "_data=?", new String[] {
                    obj
                }, null);
                j = k;
                if (obj != null)
                {
                    if (((Cursor) (obj)).getCount() > 0)
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                    ((Cursor) (obj)).close();
                }
            }
            if (j == 0)
            {
                e.add(file.getAbsolutePath());
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private List b()
    {
        Object obj1 = f;
        obj1;
        JVM INSTR monitorenter ;
        d = true;
        c = false;
        e.clear();
        if (g == null || g.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj = g.iterator();
_L4:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        d = false;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        obj = null;
_L5:
        obj1;
        JVM INSTR monitorexit ;
        return ((List) (obj));
_L3:
        a(new File((String)((Iterator) (obj)).next()));
          goto _L4
        obj;
        throw obj;
        obj = e;
          goto _L5
    }

    public final void a()
    {
        c = true;
        a = null;
    }

    public final void run()
    {
        b();
        String as[] = new String[e.size()];
        int i = 0;
        do
        {
            if (e.isEmpty())
            {
                h.obtainMessage(1, as).sendToTarget();
                return;
            }
            as[i] = (String)e.remove(0);
            i++;
        } while (true);
    }

}
