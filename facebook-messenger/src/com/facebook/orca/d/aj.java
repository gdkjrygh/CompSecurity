// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.net.Uri;

// Referenced classes of package com.facebook.orca.d:
//            af, ao

class aj
    implements Runnable
{

    final af a;

    aj(af af1)
    {
        a = af1;
        super();
    }

    public void run()
    {
        android.net.Uri.Builder builder = Uri.fromFile(af.b(a)).buildUpon().scheme("file");
        af.c(a).a(builder.build());
    }
}
