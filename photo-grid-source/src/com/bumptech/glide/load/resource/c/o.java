// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.b.a;
import com.bumptech.glide.b.d;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            q, p, a, e, 
//            b

public final class o
    implements e
{

    private static final q a = new q();
    private static final p b = new p();
    private final Context c;
    private final q d;
    private final com.bumptech.glide.load.b.a.e e;
    private final p f;
    private final com.bumptech.glide.load.resource.c.a g;

    public o(Context context, com.bumptech.glide.load.b.a.e e1)
    {
        this(context, e1, a, b);
    }

    private o(Context context, com.bumptech.glide.load.b.a.e e1, q q1, p p1)
    {
        c = context;
        e = e1;
        f = p1;
        g = new com.bumptech.glide.load.resource.c.a(e1);
        d = q1;
    }

    private com.bumptech.glide.load.resource.c.e a(InputStream inputstream, int i, int j)
    {
        Object obj;
        com.bumptech.glide.b.e e1;
        a a1;
        byte abyte0[];
        obj = null;
        abyte0 = a(inputstream);
        e1 = d.a(abyte0);
        a1 = f.a(g);
        d d1 = e1.b();
        inputstream = obj;
        if (d1.a() <= 0) goto _L2; else goto _L1
_L1:
        int k = d1.b();
        if (k == 0) goto _L4; else goto _L3
_L3:
        inputstream = obj;
_L2:
        d.a(e1);
        f.a(a1);
        return inputstream;
_L4:
        android.graphics.Bitmap bitmap;
        a1.a(d1, abyte0);
        a1.a();
        bitmap = a1.f();
        inputstream = obj;
        if (bitmap == null) goto _L2; else goto _L5
_L5:
        inputstream = com.bumptech.glide.load.resource.d.b();
        inputstream = new com.bumptech.glide.load.resource.c.e(new b(c, g, e, inputstream, i, j, d1, abyte0, bitmap));
          goto _L2
        inputstream;
        d.a(e1);
        f.a(a1);
        throw inputstream;
    }

    private static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(16384);
        byte abyte0[] = new byte[16384];
_L3:
        int i = inputstream.read(abyte0);
        if (i == -1) goto _L2; else goto _L1
_L1:
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L3
_L5:
        return bytearrayoutputstream.toByteArray();
_L2:
        try
        {
            bytearrayoutputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.w("GifResourceDecoder", "Error reading data from stream", inputstream);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final volatile x a(Object obj, int i, int j)
    {
        return a((InputStream)obj, i, j);
    }

    public final String a()
    {
        return "";
    }

}
