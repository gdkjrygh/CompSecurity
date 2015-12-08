// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;

import android.util.Log;
import java.io.IOException;
import p.q.e;
import p.s.k;
import p.x.g;

public class m
    implements e
{

    private final e a;
    private final e b;

    public m(e e1, e e2)
    {
        a = e1;
        b = e2;
    }

    public String a()
    {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }

    public volatile k a(Object obj, int i, int j)
        throws IOException
    {
        return a((g)obj, i, j);
    }

    public k a(g g1, int i, int j)
        throws IOException
    {
        Object obj = g1.a();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = a.a(obj, i, j);
_L4:
        Object obj1 = obj;
        if (obj == null)
        {
            g1 = g1.b();
            obj1 = obj;
            if (g1 != null)
            {
                obj1 = b.a(g1, i, j);
            }
        }
        return ((k) (obj1));
        obj;
        if (Log.isLoggable("ImageVideoDecoder", 2))
        {
            Log.v("ImageVideoDecoder", "Failed to load image from stream, trying FileDescriptor", ((Throwable) (obj)));
        }
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
