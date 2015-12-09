// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.services.s3.model.br;
import com.amazonaws.util.json.JsonUtils;
import com.amazonaws.util.json.b;
import com.amazonaws.util.u;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

// Referenced classes of package com.amazonaws.mobileconnectors.s3.transfermanager:
//            i, k

public abstract class j
{

    public j()
    {
    }

    public static j a(InputStream inputstream)
    {
        String s;
        long al[];
        br br1;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        b b1;
        long l;
        long l1;
        boolean flag;
        s4 = null;
        s3 = null;
        s2 = null;
        s = null;
        s5 = null;
        l1 = -1L;
        l = -1L;
        s1 = null;
        al = null;
        br1 = null;
        flag = false;
        b1 = JsonUtils.a(new BufferedReader(new InputStreamReader(inputstream)));
        try
        {
            b1.c();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new IllegalStateException(inputstream);
        }
        inputstream = s5;
_L4:
        do
        {
label0:
            {
                if (!b1.f())
                {
                    break MISSING_BLOCK_LABEL_573;
                }
                s5 = b1.g();
                if (!s5.equals("pauseType"))
                {
                    break label0;
                }
                s4 = b1.h();
            }
        } while (true);
label1:
        {
            if (!s5.equals("bucketName"))
            {
                break label1;
            }
            s3 = b1.h();
        }
        break MISSING_BLOCK_LABEL_64;
label2:
        {
            if (!s5.equals("key"))
            {
                break label2;
            }
            s2 = b1.h();
        }
        break MISSING_BLOCK_LABEL_64;
label3:
        {
            if (!s5.equals("file"))
            {
                break label3;
            }
            s = b1.h();
        }
        break MISSING_BLOCK_LABEL_64;
label4:
        {
            if (!s5.equals("multipartUploadId"))
            {
                break label4;
            }
            inputstream = b1.h();
        }
        break MISSING_BLOCK_LABEL_64;
label5:
        {
            if (!s5.equals("partSize"))
            {
                break label5;
            }
            l1 = Long.parseLong(b1.h());
        }
        break MISSING_BLOCK_LABEL_64;
label6:
        {
            if (!s5.equals("mutlipartUploadThreshold"))
            {
                break label6;
            }
            l = Long.parseLong(b1.h());
        }
        break MISSING_BLOCK_LABEL_64;
label7:
        {
            if (!s5.equals("versionId"))
            {
                break label7;
            }
            s1 = b1.h();
        }
        break MISSING_BLOCK_LABEL_64;
label8:
        {
            if (!s5.equals("range"))
            {
                break label8;
            }
            b1.a();
            al = new long[2];
            al[0] = Long.parseLong(b1.h());
            al[1] = Long.parseLong(b1.h());
            b1.b();
        }
        break MISSING_BLOCK_LABEL_64;
        if (!s5.equals("responseHeaders"))
        {
            break MISSING_BLOCK_LABEL_538;
        }
        br1 = new br();
        b1.c();
_L3:
        if (!b1.f())
        {
            break MISSING_BLOCK_LABEL_528;
        }
        s5 = b1.g();
        if (!s5.equals("contentType")) goto _L2; else goto _L1
_L1:
        br1.b(b1.h());
          goto _L3
_L2:
label9:
        {
            if (!s5.equals("contentLanguage"))
            {
                break label9;
            }
            br1.d(b1.h());
        }
          goto _L3
label10:
        {
            if (!s5.equals("expires"))
            {
                break label10;
            }
            br1.f(b1.h());
        }
          goto _L3
label11:
        {
            if (!s5.equals("cacheControl"))
            {
                break label11;
            }
            br1.h(b1.h());
        }
          goto _L3
label12:
        {
            if (!s5.equals("contentDisposition"))
            {
                break label12;
            }
            br1.j(b1.h());
        }
          goto _L3
label13:
        {
            if (!s5.equals("contentEncoding"))
            {
                break label13;
            }
            br1.l(b1.h());
        }
          goto _L3
        b1.j();
          goto _L3
        b1.d();
          goto _L4
label14:
        {
            if (!s5.equals("isRequesterPays"))
            {
                break label14;
            }
            flag = Boolean.parseBoolean(b1.h());
        }
          goto _L4
        b1.j();
          goto _L4
        b1.d();
        if ("download".equals(s4))
        {
            return new i(s3, s2, s1, al, br1, flag, s);
        }
        if ("upload".equals(s4))
        {
            return new k(s3, s2, s, inputstream, l1, l);
        } else
        {
            throw new UnsupportedOperationException((new StringBuilder()).append("Unsupported paused transfer type: ").append(s4).toString());
        }
    }

    public static j a(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = new ByteArrayInputStream(s.getBytes(u.a));
        j j1 = a(((InputStream) (s)));
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return j1;
        }
        return j1;
        Exception exception;
        exception;
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw exception;
    }

    public final void a(OutputStream outputstream)
        throws IOException
    {
        outputstream.write(i().getBytes(u.a));
        outputstream.flush();
    }

    public abstract String i();
}
