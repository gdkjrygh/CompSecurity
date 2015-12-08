// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;

// Referenced classes of package com.android.volley.toolbox:
//            i

final class j
    implements com.android.volley.r.b
{

    final String a;
    final i b;

    j(i k, String s)
    {
        b = k;
        a = s;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Bitmap)obj;
        b.a(a, ((Bitmap) (obj)));
    }
}
