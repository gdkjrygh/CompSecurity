// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import com.tremorvideo.sdk.android.videoad.ct;
import com.tremorvideo.sdk.android.videoad.eb;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class a
{

    public String a;
    private eb b;
    private Context c;
    private boolean d;
    private boolean e;

    public a(Context context)
    {
        d = false;
        e = false;
        c = context;
        if (c.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", c.getApplicationContext().getPackageName()) == 0)
        {
            e = true;
        } else
        {
            e = false;
        }
        context = Environment.getExternalStorageDirectory();
        a = (new StringBuilder()).append(context.getAbsolutePath()).append("/tremor/mraid/").toString();
        context = new File(a);
        if (!context.exists())
        {
            context.mkdirs();
        }
    }

    private void a(File file)
    {
        if (file.isDirectory())
        {
            file = file.listFiles();
            int j = file.length;
            for (int i = 0; i < j; i++)
            {
                a(file[i]);
            }

        } else
        {
            file.delete();
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

    private String d(String s)
    {
        FileInputStream fileinputstream;
        ZipInputStream zipinputstream;
        Object obj;
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            d = true;
        } else
        {
            d = false;
        }
        if (!d || !e) goto _L2; else goto _L1
_L1:
        ZipEntry zipentry;
        try
        {
            fileinputstream = new FileInputStream(s);
            zipinputstream = new ZipInputStream(new BufferedInputStream(fileinputstream));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ct.a(s);
            d = false;
            return null;
        }
        s = null;
_L8:
        zipentry = zipinputstream.getNextEntry();
        if (zipentry == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj = zipentry.getName();
        if (!((String) (obj)).equals("main.js")) goto _L4; else goto _L3
_L3:
        s = "main.js";
_L6:
        if (!zipentry.isDirectory())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        a(((String) (obj)), a);
        break MISSING_BLOCK_LABEL_57;
_L4:
        if (((String) (obj)).equals("main.html"))
        {
            s = "main.html";
        }
        if (true) goto _L6; else goto _L5
_L5:
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
        obj = new FileOutputStream((new StringBuilder()).append(a).append(((String) (obj))).toString());
_L7:
        int i = zipinputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        bytearrayoutputstream.write(abyte0, 0, i);
        bytearrayoutputstream.toByteArray();
        ((FileOutputStream) (obj)).write(bytearrayoutputstream.toByteArray());
        bytearrayoutputstream.reset();
          goto _L7
        ((FileOutputStream) (obj)).close();
        zipinputstream.closeEntry();
        bytearrayoutputstream.close();
          goto _L8
        zipinputstream.close();
        fileinputstream.close();
_L10:
        return s;
_L2:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public String a(String s)
    {
        return d(s);
    }

    public void a()
    {
        a(new File(a));
    }

    public void a(eb eb)
    {
        b = eb;
    }

    public String b(String s)
    {
        String s1;
        ByteArrayOutputStream bytearrayoutputstream;
        FileOutputStream fileoutputstream;
        s1 = s.substring(s.lastIndexOf("/"));
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        byte abyte0[];
        int i;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            fileoutputstream = new FileOutputStream((new StringBuilder()).append(a).append(s1).toString());
            s = defaulthttpclient.execute(new HttpGet(s)).getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ct.a(s);
            return s1;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        s = s.getContent();
        abyte0 = new byte[4096];
_L1:
        i = s.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        bytearrayoutputstream.write(abyte0, 0, i);
        bytearrayoutputstream.toByteArray();
        fileoutputstream.write(bytearrayoutputstream.toByteArray());
        bytearrayoutputstream.reset();
          goto _L1
        fileoutputstream.close();
        bytearrayoutputstream.close();
        return s1;
    }

    public boolean b()
    {
        return d && e;
    }

    public void c()
    {
    }

    public void c(String s)
    {
        d(s);
    }
}
