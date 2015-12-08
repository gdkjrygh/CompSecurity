// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.roidapp.baselib.e:
//            f, d

public final class c extends f
{

    private File b;
    private String c;
    private d d;
    private int e;

    public c(String s, String s1, String s2, d d1)
    {
        super(s);
        c = s2;
        b = new File(s1);
        d = d1;
    }

    private boolean a(OutputStream outputstream, File file)
    {
        float f1;
        float f3;
        long l;
        if (file == null || outputstream == null)
        {
            return false;
        }
        f3 = e;
        f1 = e;
        l = file.length();
        Object obj = new FileInputStream(file);
        file = ((File) (obj));
        byte abyte0[] = new byte[4096];
_L4:
        file = ((File) (obj));
        int i = ((InputStream) (obj)).read(abyte0);
        if (i < 0) goto _L2; else goto _L1
_L1:
        file = ((File) (obj));
        outputstream.write(abyte0, 0, i);
        file = ((File) (obj));
        float f2 = f1 + ((float)i * (90F - f3)) / (float)l;
        i = (int)f2;
        f1 = f2;
        file = ((File) (obj));
        if (i == e) goto _L4; else goto _L3
_L3:
        file = ((File) (obj));
        e = i;
        f1 = f2;
        file = ((File) (obj));
        if (d == null) goto _L4; else goto _L5
_L5:
        file = ((File) (obj));
        d.a(i);
        f1 = f2;
          goto _L4
        file;
        outputstream = ((OutputStream) (obj));
        obj = file;
_L9:
        file = outputstream;
        ((IOException) (obj)).printStackTrace();
        file = outputstream;
        throw obj;
        outputstream;
_L7:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw outputstream;
_L2:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream) { }
        return true;
        outputstream;
        file = null;
        if (true) goto _L7; else goto _L6
_L6:
        obj;
        outputstream = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    final void a(OutputStream outputstream)
    {
        outputstream.write((new StringBuilder("Content-Disposition: form-data; name=\"")).append(a).append("\"; filename=\"").append(b.getName()).append("\"\r\n").toString().getBytes());
        if (c != null)
        {
            outputstream.write((new StringBuilder("Content-Type: ")).append(c).append("\r\n").toString().getBytes());
        }
        outputstream.write("\r\n".getBytes());
        a(outputstream, b);
    }
}
