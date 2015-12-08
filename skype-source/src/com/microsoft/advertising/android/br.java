// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.microsoft.advertising.android:
//            u, p, al, av

public final class br
    implements Runnable
{
    public static interface a
    {

        public abstract void a(String s);
    }


    a a;
    private String b;

    public br(String s, a a1)
    {
        b = s;
        a = a1;
    }

    public final void run()
    {
        Object obj;
        byte abyte0[];
        ByteArrayOutputStream bytearrayoutputstream;
        obj = new HttpGet(b);
        ((HttpGet) (obj)).setHeader(u.J.a(), p.a().g());
        al.a();
        obj = al.a(((HttpGet) (obj))).b();
        abyte0 = new byte[1024];
        bytearrayoutputstream = new ByteArrayOutputStream();
_L1:
        int i = ((InputStream) (obj)).read(abyte0);
label0:
        {
            if (i <= 0)
            {
                break label0;
            }
            try
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            }
            catch (Exception exception)
            {
                av.c("RendererRequest", (new StringBuilder("Incorrect URL. Failed to send request. ")).append(exception.toString()).toString());
                a.a("exception");
                return;
            }
        }
          goto _L1
        String s = Base64.encodeToString(bytearrayoutputstream.toByteArray(), 2);
        a.a(s);
        return;
    }
}
