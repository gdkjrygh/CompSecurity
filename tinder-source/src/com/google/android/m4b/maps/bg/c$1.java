// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bg;

import com.google.android.m4b.maps.bs.e;
import java.io.File;

// Referenced classes of package com.google.android.m4b.maps.bg:
//            c

final class b
    implements Runnable
{

    private File a;
    private e b;

    public final void run()
    {
        c.a(c.a(), a, b);
    }

    (File file, e e)
    {
        a = file;
        b = e;
        super();
    }
}
