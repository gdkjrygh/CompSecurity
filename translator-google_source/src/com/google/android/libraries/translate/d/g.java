// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.d;

import android.content.Context;
import com.google.android.libraries.translate.e.d;
import java.io.InputStream;

// Referenced classes of package com.google.android.libraries.translate.d:
//            c, d

public final class g extends c
{

    private static final Object b = new Object();
    private final com.google.android.libraries.translate.d.d c;

    public g(String s, com.google.android.libraries.translate.d.d d1)
    {
        super(s);
        c = d1;
    }

    public final InputStream a(Context context)
    {
        d.a(a, c.b(context), b);
        return c.a(context);
    }

}
