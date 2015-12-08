// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.q;

// Referenced classes of package com.google.android.gms.cast:
//            r

final class s extends q
{

    final r a;

    s(r r1)
    {
        a = r1;
        super();
    }

    protected final void a()
    {
        r r1 = a;
        if (r1.g != null)
        {
            r1.g.onStatusUpdated();
        }
    }

    protected final void b()
    {
        r r1 = a;
        if (r1.f != null)
        {
            r1.f.onMetadataUpdated();
        }
    }

    protected final void c()
    {
        r r1 = a;
        if (r1.e != null)
        {
            r1.e.onQueueStatusUpdated();
        }
    }

    protected final void d()
    {
        r r1 = a;
        if (r1.d != null)
        {
            r1.d.onPreloadStatusUpdated();
        }
    }
}
