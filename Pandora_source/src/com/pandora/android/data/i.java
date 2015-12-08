// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import android.app.Application;
import android.content.Context;
import com.pandora.android.ads.l;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import p.df.a;

// Referenced classes of package com.pandora.android.data:
//            s, g

public class i extends com.pandora.android.data.s
{

    private final String d;
    private final String e;

    public i(g g1)
        throws l
    {
        super(g1);
        d = g1.d();
        if (s.a(d))
        {
            throw new IllegalArgumentException("FileVideoAdData must be constructed with a non-empty video asset path");
        }
        try
        {
            e = m();
            b((new StringBuilder()).append("Successfully downloaded videoad ").append(d).append(" to ").append(e).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            throw new l(g1);
        }
    }

    public static void a()
    {
        if (b.a.h().deleteFile("movie.mp4"))
        {
            p.df.a.c("FileVideoAdData", "deleted video file: movie.mp4");
        }
    }

    private void a(OutputStream outputstream, InputStream inputstream)
    {
        if (outputstream != null)
        {
            try
            {
                outputstream.flush();
                outputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                return;
            }
        }
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        inputstream.close();
    }

    private void b(String s1)
    {
        p.df.a.c("VIDEO AD", s1);
    }

    private String m()
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj2;
        long l1;
        long l2;
        obj1 = null;
        l2 = System.currentTimeMillis();
        l1 = 0L;
        obj2 = b.a.h();
        obj = new URL((new StringBuilder()).append(d).append("movie.mp4").toString());
        b((new StringBuilder()).append("starting to download videoad content ").append(((URL) (obj)).toString()).toString());
        a();
        ((URL) (obj)).openConnection();
        obj = ((URL) (obj)).openStream();
        obj2 = ((Context) (obj2)).openFileOutput("movie.mp4", 0);
        byte abyte0[] = new byte[0x25800];
_L1:
        int j = ((InputStream) (obj)).read(abyte0);
        if (j <= 0)
        {
            a(((OutputStream) (obj2)), ((InputStream) (obj)));
            b((new StringBuilder()).append("VIDEO AD downloaded ").append(l1 / 1024L).append("kb in ").append(System.currentTimeMillis() - l2).append(" seconds").toString());
            return "movie.mp4";
        }
        ((OutputStream) (obj2)).write(abyte0, 0, j);
        l1 += j;
          goto _L1
        Object obj3;
        obj3;
        a(((OutputStream) (obj2)), ((InputStream) (obj)));
        throw obj3;
        obj;
        obj2 = null;
_L3:
        a(((OutputStream) (obj2)), ((InputStream) (obj1)));
        throw obj;
        obj3;
        obj2 = null;
        obj1 = obj;
        obj = obj3;
        continue; /* Loop/switch isn't completed */
        obj3;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public String b()
    {
        return e;
    }
}
