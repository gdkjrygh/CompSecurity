// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.net.Uri;

// Referenced classes of package com.facebook.orca.d:
//            ag, af, ao

class ah
    implements Runnable
{

    final ag a;

    ah(ag ag1)
    {
        a = ag1;
        super();
    }

    public void run()
    {
        android.net.Uri.Builder builder = Uri.fromFile(af.b(a.a)).buildUpon().scheme("file");
        af.c(a.a).a(builder.build(), 60000);
    }
}
