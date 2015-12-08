// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.b.a;
import com.bumptech.glide.b.b;
import com.bumptech.glide.b.e;
import com.bumptech.glide.i.d;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.bitmap.c;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            s, a, b

public final class r
    implements f
{

    private static final s a = new s();
    private final b b;
    private final com.bumptech.glide.load.b.a.e c;
    private final s d;

    public r(com.bumptech.glide.load.b.a.e e1)
    {
        this(e1, a);
    }

    private r(com.bumptech.glide.load.b.a.e e1, s s1)
    {
        c = e1;
        b = new com.bumptech.glide.load.resource.c.a(e1);
        d = s1;
    }

    private boolean a(x x1, OutputStream outputstream)
    {
        g g1;
        long l;
        boolean flag;
        flag = false;
        l = com.bumptech.glide.i.d.a();
        x1 = (com.bumptech.glide.load.resource.c.b)x1.b();
        g1 = x1.c();
        if (!(g1 instanceof com.bumptech.glide.load.resource.d)) goto _L2; else goto _L1
_L1:
        flag = a(x1.d(), outputstream);
_L6:
        return flag;
_L2:
        Object obj;
        com.bumptech.glide.c.a a1;
        int i;
        byte abyte0[] = x1.d();
        obj = new e();
        ((e) (obj)).a(abyte0);
        com.bumptech.glide.b.d d1 = ((e) (obj)).b();
        obj = new a(b);
        ((a) (obj)).a(d1, abyte0);
        ((a) (obj)).a();
        a1 = new com.bumptech.glide.c.a();
        if (!a1.a(outputstream))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
_L4:
        if (i >= ((a) (obj)).c())
        {
            break; /* Loop/switch isn't completed */
        }
        c c1 = new c(((a) (obj)).f(), c);
        outputstream = g1.a(c1, x1.getIntrinsicWidth(), x1.getIntrinsicHeight());
        if (!c1.equals(outputstream))
        {
            c1.d();
        }
        flag = a1.a((Bitmap)outputstream.b());
        if (!flag)
        {
            outputstream.d();
            return false;
        }
        a1.a(((a) (obj)).a(((a) (obj)).d()));
        ((a) (obj)).a();
        outputstream.d();
        i++;
        if (true) goto _L4; else goto _L3
        x1;
        outputstream.d();
        throw x1;
_L3:
        boolean flag1 = a1.a();
        flag = flag1;
        if (Log.isLoggable("GifEncoder", 2))
        {
            (new StringBuilder("Encoded gif with ")).append(((a) (obj)).c()).append(" frames and ").append(x1.d().length).append(" bytes in ").append(com.bumptech.glide.i.d.a(l)).append(" ms");
            return flag1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static boolean a(byte abyte0[], OutputStream outputstream)
    {
        try
        {
            outputstream.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.isLoggable("GifEncoder", 3);
            return false;
        }
        return true;
    }

    public final String a()
    {
        return "";
    }

    public final volatile boolean a(Object obj, OutputStream outputstream)
    {
        return a((x)obj, outputstream);
    }

}
