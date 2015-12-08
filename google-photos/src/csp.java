// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class csp
{

    private static final String e = csp.getSimpleName();
    final noz a;
    final File b;
    HashMap c;
    final Object d = new Object();
    private final noz f;
    private final csq g;
    private final csr h;

    public csp(Context context, File file, csq csq1, csr csr1)
    {
        b = file;
        g = csq1;
        h = csr1;
        c = new HashMap();
        a = noz.a(context, 3, e, new String[0]);
        f = noz.a(context, 5, e, new String[0]);
        if (a.a())
        {
            noy.a("cacheDirectory", file.getAbsolutePath());
        }
        a();
    }

    private static cnx a(cqa cqa1, cvn cvn1, Uri uri)
    {
        int i = 0;
        long al[] = new long[cvn1.a.length];
        long l = 0L;
        int ai[] = cvn1.a;
        int k = ai.length;
        int j = 0;
        for (; i < k; i++)
        {
            l += ai[i];
            al[j] = l;
            j++;
        }

        if (cvn1.e == -1)
        {
            i = 4;
        } else
        {
            i = cvn1.e;
        }
        cvn1.e = i;
        return new cnx(cqa1, al, cvn1.b, cvn1.c, cvn1.d, uri, i);
    }

    private void a()
    {
        File afile[];
        int i;
        int j;
        afile = b.listFiles();
        j = afile.length;
        i = 0;
_L2:
        File file;
        int k;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        file = afile[i];
        if (h != null && !h.a(cqc.a(file.getName(), true)))
        {
            if (a.a())
            {
                noy.a("cacheFile", file.getAbsolutePath());
                noy.a("validity", Integer.valueOf(0));
            }
            file.delete();
        } else
        {
label0:
            {
                k = (int)file.length();
                if (k != 0)
                {
                    break label0;
                }
                if (a.a())
                {
                    noy.a("cacheFile", file.getAbsolutePath());
                    noy.a("length", Integer.valueOf(0));
                }
                file.delete();
            }
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        Object obj;
        byte abyte0[];
        abyte0 = new byte[k];
        obj = null;
        Object obj1 = new FileInputStream(file);
        obj = obj1;
        k = ((FileInputStream) (obj1)).read(abyte0);
        obj = obj1;
        if (k == abyte0.length)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        obj = obj1;
        if (!f.a())
        {
            break MISSING_BLOCK_LABEL_232;
        }
        obj = obj1;
        noy.a("numRead", Integer.valueOf(k));
        obj = obj1;
        noy.a("bytes.length", Integer.valueOf(abyte0.length));
        obj = obj1;
        file.delete();
        b.a(((java.io.Closeable) (obj1)));
          goto _L3
        b.a(((java.io.Closeable) (obj1)));
_L4:
        obj = qlo.a(abyte0, 0, abyte0.length);
        obj1 = new cvn();
        ((qlo) (obj)).a(((qlw) (obj1)));
        c.put(cqc.a(file.getName(), true), obj1);
        if (a.a())
        {
            noy.a("filenameToTrackId", cqc.a(file.getName(), true));
        }
          goto _L3
        obj;
        obj1 = null;
_L6:
        obj = obj1;
        if (!f.a())
        {
            break MISSING_BLOCK_LABEL_364;
        }
        obj = obj1;
        noy.a("cacheFile", file.getAbsolutePath());
        obj = obj1;
        noy.a("length", Long.valueOf(file.length()));
        b.a(((java.io.Closeable) (obj1)));
          goto _L4
        Exception exception;
        exception;
_L5:
        b.a(((java.io.Closeable) (obj)));
        throw exception;
        IOException ioexception;
        ioexception;
        file.delete();
          goto _L3
_L1:
        return;
        exception;
          goto _L5
        ioexception;
          goto _L6
    }

    private cnx b(cqa cqa1, Uri uri)
    {
        File file;
        cvn cvn1;
        byte abyte0[];
        qlp qlp1;
        cvn1 = g.a(cqa1);
        cqc cqc1 = cqa1.e;
        abyte0 = new byte[qlp.b(cvn1)];
        qlp1 = qlp.a(abyte0, 0, abyte0.length);
        file = new File(b, cqc1.a());
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        Object obj = fileoutputstream;
        qlp1.a(cvn1);
        obj = fileoutputstream;
        fileoutputstream.write(abyte0);
        b.a(fileoutputstream);
        if (a.a())
        {
            noy.a("trackId", cqa1.e);
        }
        c.put(cqa1.e, cvn1);
        return a(cqa1, cvn1, uri);
        uri;
        uri = null;
_L4:
        obj = uri;
        if (!f.a())
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj = uri;
        noy.a("protoFile", file.getAbsolutePath());
        obj = uri;
        noy.a("trackName", cqa1.b);
        obj = uri;
        file.delete();
        b.a(uri);
        return null;
        cqa1;
        obj = null;
_L2:
        b.a(((java.io.Closeable) (obj)));
        throw cqa1;
        cqa1;
        if (true) goto _L2; else goto _L1
_L1:
        uri;
        uri = fileoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final cnx a(cqa cqa1, Uri uri)
    {
        if (a(cqa1.e))
        {
            if (a.a())
            {
                noy.a("trackName", cqa1.b);
            }
            return a(cqa1, (cvn)c.get(cqa1.e), uri);
        }
        synchronized (d)
        {
            cqa1 = b(cqa1, uri);
        }
        return cqa1;
        cqa1;
        obj;
        JVM INSTR monitorexit ;
        throw cqa1;
    }

    public final boolean a(cqc cqc1)
    {
        if (a.a())
        {
            noy.a("trackId", cqc1);
            boolean flag;
            if (c.get(cqc1) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            noy.a("contains", Boolean.valueOf(flag));
        }
        return c.get(cqc1) != null;
    }

}
