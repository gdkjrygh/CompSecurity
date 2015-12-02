// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.net.Uri;

// Referenced classes of package com.facebook.bugreporter:
//            m

class n
    implements Runnable
{

    final Uri a;
    final m b;

    n(m m1, Uri uri)
    {
        b = m1;
        a = uri;
        super();
    }

    public void run()
    {
        b.b(a);
    }
}
