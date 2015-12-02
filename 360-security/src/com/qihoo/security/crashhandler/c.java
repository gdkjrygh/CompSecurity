// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.crashhandler;

import android.content.Context;
import com.qihoo.security.d.a;
import com.qihoo360.common.utils.FileUtil;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.common.utils.ZipUtil;
import com.qihoo360.mobilesafe.b.o;
import java.io.File;
import java.io.FileOutputStream;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

public class c
    implements com.qihoo.security.g.a.a
{

    private static final String a = com/qihoo/security/crashhandler/c.getSimpleName();
    private String b;
    private final String c;
    private final String d;
    private HttpClient e;
    private Context f;

    public c(Context context)
    {
        b = "http://%s/%s/%s";
        e = null;
        f = context;
        e = com.qihoo.security.g.a.a(com.qihoo.security.g.a.a(f, new a(f)));
        context = f.getFileStreamPath("dump");
        if (Utils.makeSurePathExists(context))
        {
            c = Utils.pathAppend(context.getAbsolutePath(), "dump.cache");
            d = Utils.pathAppend(context.getAbsolutePath(), "f2u.tmp");
            return;
        } else
        {
            c = f.getFileStreamPath("dump.cache").getAbsolutePath();
            d = f.getFileStreamPath("dump.cache").getAbsolutePath();
            return;
        }
    }

    private String a()
    {
        a a1 = new a(f);
        b = String.format(b, new Object[] {
            a1.a("crash", "host"), a1.a("crash", "pam1"), a1.a("crash", "pam2")
        });
        return (new StringBuilder()).append(b).append(String.format("?k3=%s&k2=%s&k1=%s&k5=%s", new Object[] {
            "andr_ms_400", "Android", Utils.getMD5(o.b(f)), "1.0.8.3742"
        })).toString();
    }

    public int a(File file)
    {
        File file1 = new File(d);
        boolean flag;
        file1.delete();
        if (ZipUtil.ZipDirGzip(file, file1, 0x200000, 0x500000) == com.qihoo360.common.utils.ZipUtil.SizeLimitZipResult.SizeLimitZipResult_NotFound)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        flag = file1.exists();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        Object obj;
        int i = -2000;
        byte abyte0[];
        int j;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return -2000;
            }
        }
        return i;
        file = new FileOutputStream(c);
        abyte0 = FileUtil.readFileByte(file1);
        j = com.qihoo.security.g.a.a(e, a(), abyte0, file, this);
        file.close();
        file1.delete();
        (new File(c)).delete();
        i = j;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return j;
            }
            return j;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_60;
_L1:
        file;
        file = null;
_L6:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return -99;
        obj;
        file = null;
_L4:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(int i, String s)
    {
    }

    public void a(long l, long l1)
        throws InterruptedException
    {
    }

    public void a(HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
    }

    public void a(HttpResponse httpresponse)
    {
    }

}
