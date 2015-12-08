// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class bxp
{

    private static final String a = bxp.getSimpleName();
    private final noz b;
    private final noz c;
    private final File d;
    private HashMap e;

    public bxp(Context context)
    {
        b = noz.a(context, 3, a, new String[0]);
        c = noz.a(context, 5, a, new String[0]);
        d = context.getDir("StoryboardCache", 0);
        e = new HashMap();
        if (b.a())
        {
            noy.a("cacheDirectory", d.getAbsolutePath());
        }
        a();
    }

    private void a()
    {
        e.clear();
        File afile[] = d.listFiles();
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            if ((int)file.length() == 0)
            {
                file.delete();
            } else
            {
                e.put(file.getName(), new bxq(file));
                if (b.a())
                {
                    noy.a("cacheFile", file.getName());
                }
            }
            i++;
        }
    }

    public static boolean a(pkk pkk1, String s)
    {
        b.a(s, "cloudVersionId", null);
        if (pkk1 == null || pkk1.c == null)
        {
            return false;
        } else
        {
            return s.equals(pkk1.c.a);
        }
    }

    public final pkk a(String s)
    {
        bxq bxq1;
        byte abyte0[];
        int i;
        bxq1 = (bxq)e.get(s);
        if (bxq1 == null || !bxq1.a.exists())
        {
            return null;
        }
        i = (int)bxq1.a.length();
        if (i == 0)
        {
            bxq1.a.delete();
            e.remove(s);
            return null;
        }
        abyte0 = new byte[i];
        Object obj1 = new FileInputStream(bxq1.a);
        Object obj = obj1;
        if (((FileInputStream) (obj1)).read(abyte0) == i)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj = obj1;
        bxq1.a.delete();
        obj = obj1;
        e.remove(s);
        b.a(((java.io.Closeable) (obj1)));
        return null;
        b.a(((java.io.Closeable) (obj1)));
        obj1 = qlo.a(abyte0, 0, abyte0.length);
        obj = new pkk();
        ((qlo) (obj1)).a(((qlw) (obj)));
        s = ((String) (obj));
_L1:
        return s;
        obj;
        obj1 = null;
_L3:
        obj = obj1;
        if (!c.a())
        {
            break MISSING_BLOCK_LABEL_189;
        }
        obj = obj1;
        noy.a("cacheFile", bxq1.a.getAbsolutePath());
        obj = obj1;
        e.remove(s);
        obj = obj1;
        bxq1.a.delete();
        b.a(((java.io.Closeable) (obj1)));
        return null;
        s;
        obj = null;
_L2:
        b.a(((java.io.Closeable) (obj)));
        throw s;
        IOException ioexception;
        ioexception;
        if (c.a())
        {
            noy.a("cacheFile", bxq1.a.getAbsolutePath());
        }
        bxq1.a.delete();
        e.remove(s);
        s = null;
          goto _L1
        s;
          goto _L2
        ioexception;
          goto _L3
    }

    public final boolean a(pkk pkk1)
    {
        String s;
        File file;
        byte abyte0[];
        qlp qlp1;
        s = (String)b.a(pkk1.a.c, "mediaKey", null);
        file = new File(d, s);
        abyte0 = new byte[qlp.b(pkk1)];
        qlp1 = qlp.a(abyte0, 0, abyte0.length);
        Object obj = new FileOutputStream(file);
        qlp1.a(pkk1);
        ((FileOutputStream) (obj)).write(abyte0);
        e.put(s, new bxq(file));
        b.a(((java.io.Closeable) (obj)));
        return true;
        obj;
        pkk1 = null;
_L4:
        if (c.a())
        {
            noy.a("message", ((IOException) (obj)).getMessage());
            noy.a("cacheFile", file.getAbsolutePath());
        }
        file.delete();
        b.a(pkk1);
        return false;
        obj;
        pkk1 = null;
_L2:
        b.a(pkk1);
        throw obj;
        Object obj1;
        obj1;
        pkk1 = ((pkk) (obj));
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        pkk1 = ((pkk) (obj));
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(String s)
    {
        bxq bxq1 = (bxq)e.get(s);
        if (bxq1 != null && bxq1.a.exists())
        {
            bxq1.a.delete();
            e.remove(s);
            if (b.a())
            {
                noy.a("filename", s);
                return;
            }
        }
    }

}
