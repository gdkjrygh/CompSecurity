// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import android.net.Uri;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.Assertions;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            PositionHolder, DefaultExtractorInput, Extractor, ExtractorInput

class h
    implements com.google.android.exoplayer.upstream.
{

    private final Uri a;
    private final DataSource b;
    private final b c;
    private final Allocator d;
    private final int e;
    private final PositionHolder f = new PositionHolder();
    private volatile boolean g;
    private boolean h;

    public final void f()
    {
        g = true;
    }

    public final boolean g()
    {
        return g;
    }

    public final void h()
    {
        int i = 0;
_L4:
        if (i != 0 || g)
        {
            break; /* Loop/switch isn't completed */
        }
        long l1;
        long l2;
        l2 = f.a;
        l1 = b.a(new DataSpec(a, l2, -1L, null));
        long l;
        l = l1;
        if (l1 != -1L)
        {
            l = l1 + l2;
        }
        Object obj = new DefaultExtractorInput(b, l2, l);
        Object obj1;
        obj1 = c.c(((ExtractorInput) (obj)));
        if (h)
        {
            ((Extractor) (obj1)).b();
            h = false;
        }
_L2:
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int j;
        if (g)
        {
            break; /* Loop/switch isn't completed */
        }
        d.b(e);
        j = ((Extractor) (obj1)).a(((ExtractorInput) (obj)), f);
        i = j;
        if (true) goto _L2; else goto _L1
_L1:
        if (i == 1)
        {
            i = 0;
        } else
        {
            f.a = ((ExtractorInput) (obj)).b();
        }
        b.a();
        if (true) goto _L4; else goto _L3
        obj;
        obj1 = null;
_L6:
        if (i != 1 && obj1 != null)
        {
            f.a = ((ExtractorInput) (obj1)).b();
        }
        b.a();
        throw obj;
_L3:
        return;
        Exception exception;
        exception;
        Object obj2 = obj;
        obj = exception;
        exception = ((Exception) (obj2));
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        exception = ((Exception) (obj));
        obj = exception1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public (Uri uri, DataSource datasource,  , Allocator allocator, int i, long l)
    {
        a = (Uri)Assertions.a(uri);
        b = (DataSource)Assertions.a(datasource);
        c = (c)Assertions.a();
        d = (Allocator)Assertions.a(allocator);
        e = i;
        f.a = l;
        h = true;
    }
}
