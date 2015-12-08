// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import com.tremorvideo.sdk.android.a.i;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ea, ct

public class cg
{

    private File a;
    private String b;
    private String c;
    private long d;
    private int e;
    private List f;
    private File g;
    private File h;
    private i i;

    public cg(JSONObject jsonobject)
        throws Exception
    {
        int j = 0;
        super();
        b = jsonobject.getString("xml-url");
        c = jsonobject.getString("template-url");
        if (jsonobject.has("template-crc32"))
        {
            d = jsonobject.getLong("template-crc32");
        } else
        {
            d = 0L;
        }
        if (jsonobject.has("auto-skip-seconds"))
        {
            e = jsonobject.getInt("auto-skip-seconds") * 1000;
        } else
        {
            e = 0;
        }
        if (!jsonobject.has("events"))
        {
            f = new ArrayList();
        } else
        {
            jsonobject = jsonobject.getJSONArray("events");
            f = new ArrayList(jsonobject.length());
            while (j < jsonobject.length()) 
            {
                f.add(new ea(jsonobject.getJSONObject(j)));
                j++;
            }
        }
    }

    private void a(String s, String s1)
    {
        s = new File((new StringBuilder()).append(s1).append(s).toString());
        if (!s.isDirectory())
        {
            s.mkdirs();
        }
    }

    private void c(File file)
    {
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            int k = afile.length;
            for (int j = 0; j < k; j++)
            {
                c(afile[j]);
            }

        }
        file.delete();
    }

    public int a()
    {
        return e;
    }

    public ea a(ea.b b1)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            ea ea1 = (ea)iterator.next();
            if (ea1.a() == b1)
            {
                return ea1;
            }
        }

        return null;
    }

    public ea a(String s)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            ea ea1 = (ea)iterator.next();
            if (ea1.a().toString().equals(s))
            {
                return ea1;
            }
        }

        return null;
    }

    public void a(Context context)
    {
        FileInputStream fileinputstream;
        ZipInputStream zipinputstream;
        fileinputstream = new FileInputStream(h);
        zipinputstream = new ZipInputStream(new BufferedInputStream(fileinputstream));
        a = new File((new StringBuilder()).append(context.getFilesDir()).append("/").append("BuyItNow").toString());
        if (a.exists())
        {
            c(a);
        }
        a.mkdir();
        context = (new StringBuilder()).append(a.getAbsolutePath()).append("/").toString();
_L1:
        Object obj1 = zipinputstream.getNextEntry();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        Object obj;
label0:
        {
            obj = ((ZipEntry) (obj1)).getName();
            if (!((ZipEntry) (obj1)).isDirectory())
            {
                break label0;
            }
            a(((String) (obj)), ((String) (context)));
        }
          goto _L1
        byte abyte0[];
        obj1 = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
        File file = new File((new StringBuilder()).append(context).append(((String) (obj))).toString());
        if (!file.exists())
        {
            file.createNewFile();
        }
        obj = new FileOutputStream((new StringBuilder()).append(context).append(((String) (obj))).toString());
_L2:
        int j = zipinputstream.read(abyte0);
label1:
        {
            if (j == -1)
            {
                break label1;
            }
            try
            {
                ((ByteArrayOutputStream) (obj1)).write(abyte0, 0, j);
                ((ByteArrayOutputStream) (obj1)).toByteArray();
                ((FileOutputStream) (obj)).write(((ByteArrayOutputStream) (obj1)).toByteArray());
                ((ByteArrayOutputStream) (obj1)).reset();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                ct.a(context);
                return;
            }
        }
          goto _L2
        ((FileOutputStream) (obj)).close();
        zipinputstream.closeEntry();
        ((ByteArrayOutputStream) (obj1)).close();
          goto _L1
        zipinputstream.close();
        fileinputstream.close();
        return;
    }

    public void a(Context context, com.tremorvideo.sdk.android.a.i.b b1)
    {
        i = new i(context, b1);
        context = new File((new StringBuilder()).append(h().getAbsolutePath()).append("/index.html").toString());
        i.loadUrl((new StringBuilder()).append("file://").append(context.getAbsolutePath()).toString());
    }

    public void a(File file)
    {
        g = file;
    }

    public String b()
    {
        return b;
    }

    public void b(File file)
    {
        h = file;
    }

    public String c()
    {
        return c;
    }

    public Long d()
    {
        return Long.valueOf(d);
    }

    public void e()
    {
        Object obj = new File((new StringBuilder()).append(a).append("/source.xml").toString());
        FileInputStream fileinputstream;
        byte abyte0[];
        fileinputstream = new FileInputStream(g);
        obj = new FileOutputStream(((File) (obj)));
        abyte0 = new byte[0x100000];
_L1:
        int j = fileinputstream.read(abyte0, 0, 0x100000);
        if (j == -1)
        {
            try
            {
                fileinputstream.close();
                ((OutputStream) (obj)).close();
                return;
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_100;
        }
        ((OutputStream) (obj)).write(abyte0, 0, j);
          goto _L1
    }

    public void f()
    {
        if (i != null)
        {
            i.destroy();
            i = null;
            System.gc();
        }
    }

    public void g()
    {
        if ("BuyItNow" != null)
        {
            c(a);
        }
        f();
    }

    public File h()
    {
        return a;
    }
}
