// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.d;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.text.TextUtils;
import com.qihoo.security.engine.FileInfo;
import com.qihoo360.common.a.b;
import com.qihoo360.common.utils.FileUtil;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo.security.engine.d:
//            c, b

public class d extends c
    implements android.media.MediaScannerConnection.MediaScannerConnectionClient
{
    class a
        implements FilenameFilter
    {

        final ArrayList a;
        final d b;

        public boolean accept(File file, String s)
        {
            File file1 = new File(file, s);
            if (d.a(b).isEmpty()) goto _L2; else goto _L1
_L1:
            Iterator iterator;
            file = file1.getAbsolutePath();
            iterator = a.iterator();
_L6:
            if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
            file = file.toLowerCase(Locale.getDefault());
            iterator = d.a(b).iterator();
_L8:
            if (iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
_L2:
            String s1;
            if (file1.isDirectory())
            {
                return true;
            } else
            {
                return s.toLowerCase(Locale.US).endsWith(".apk");
            }
_L4:
            s1 = (String)iterator.next();
            if (!file.startsWith(s1)) goto _L6; else goto _L5
_L5:
            file = file.substring(s1.length());
              goto _L3
            if (!file.startsWith(((String)iterator.next()).toLowerCase(Locale.getDefault()))) goto _L8; else goto _L7
_L7:
            return false;
              goto _L3
        }

        a(Context context)
        {
            b = d.this;
            super();
            a = FileUtil.getInternalAndExternalStoragePath(context);
        }
    }


    final Context c;
    private final FilenameFilter d;
    private final File e;
    private int f;
    private final AtomicInteger g = new AtomicInteger(0);
    private int h;
    private int i;
    private final ArrayList j = new ArrayList();
    private final MediaScannerConnection k = null;

    public d(Context context, String s, c.a a1)
    {
        super(a1);
        f = 0;
        h = 0;
        i = 10;
        c = context;
        if (TextUtils.isEmpty(s))
        {
            e = null;
        } else
        {
            e = new File(s);
        }
        d = new a(context);
    }

    private int a(String s)
    {
        s = Uri.parse(String.format("content://media/%s/file", new Object[] {
            s
        }));
        s = c.getContentResolver().query(s, new String[] {
            "_id", "_data", "_size"
        }, "_data like ?", new String[] {
            "%.apk"
        }, null);
        if (s != null)
        {
            int l = s.getCount();
            s.close();
            return l;
        } else
        {
            return 0;
        }
    }

    static ArrayList a(d d1)
    {
        return d1.j;
    }

    private void a(File file)
    {
_L2:
        return;
        if (b || !file.exists()) goto _L2; else goto _L1
_L1:
        if (file.isFile() && file.canRead())
        {
            b(file.getAbsolutePath());
            return;
        }
        if (!file.isDirectory()) goto _L2; else goto _L3
_L3:
        int l;
        d(file.getAbsolutePath());
        try
        {
            file = file.listFiles(d);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file = null;
        }
        if (file == null || file.length == 0 || h > i) goto _L2; else goto _L4
_L4:
        h = h + 1;
_L6:
        for (l = 0; l >= file.length || b;)
        {
            h = h - 1;
            return;
        }

        if (file[l].canRead())
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        l++;
        if (true) goto _L6; else goto _L5
_L5:
        if (file[l].isDirectory())
        {
            a(file[l]);
        }
        if (file[l].isFile())
        {
            b(file[l].getAbsolutePath());
        }
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    private void b(String s)
    {
        if (k != null && k.isConnected())
        {
            k.scanFile(s, null);
        }
        c(s);
    }

    private void c(String s)
    {
        try
        {
            s = new FileInfo(s, 1, 0);
            com.qihoo.security.engine.d.b b1 = new com.qihoo.security.engine.d.b(4, 2);
            b1.c = s;
            g.incrementAndGet();
            a.a(b1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private void d(String s)
    {
        try
        {
            s = new FileInfo(s, 0, 0);
            com.qihoo.security.engine.d.b b1 = new com.qihoo.security.engine.d.b(4, 2);
            b1.c = s;
            a.a(b1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private void g()
    {
        if (e == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                f = a("external") + a("internal");
                return;
            } else
            {
                f = 100;
                return;
            }
        }
        if (!e.isDirectory())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        File afile[];
        try
        {
            afile = e.listFiles();
        }
        catch (Throwable throwable)
        {
            return;
        }
        if (afile == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        f = afile.length;
        return;
        f = 0;
        return;
        f = 1;
        return;
    }

    public int a()
    {
        return 4;
    }

    public int a(String s, String s1)
    {
        if (!"101".equals(s)) goto _L2; else goto _L1
_L1:
        int l = Integer.parseInt(s1);
        if (l <= 0) goto _L4; else goto _L3
_L3:
        i = l;
_L6:
        return 0;
_L4:
        return 0x80070057;
_L2:
        if ("102".equals(s))
        {
            s = com.qihoo360.common.a.b.a(s1);
            if (TextUtils.isEmpty(s))
            {
                return 0x80070057;
            }
            s = s.split(":");
            int j1 = s.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                s1 = s[i1];
                j.add(s1);
                i1++;
            }
        } else
        {
            return 0x80004001;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int b()
    {
        if (k != null)
        {
            k.connect();
        }
        g();
        return 0;
    }

    public int c()
    {
        if (k != null)
        {
            k.disconnect();
        }
        return 0;
    }

    public int d()
    {
        Iterator iterator;
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        iterator = FileUtil.getInternalAndExternalStoragePath(c).iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        f = g.get();
        return 0;
_L2:
        String s = (String)iterator.next();
        if (!b);
        h = 0;
        a(new File(s));
          goto _L3
        h = 0;
        a(e);
          goto _L1
    }

    public int e()
    {
        return f;
    }

    public void onMediaScannerConnected()
    {
    }

    public void onScanCompleted(String s, Uri uri)
    {
    }
}
