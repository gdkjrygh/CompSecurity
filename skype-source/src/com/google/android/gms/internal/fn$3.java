// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            fn, fp, hi

static final class a
    implements Runnable
{

    final fp a;

    public final void run()
    {
        fp fp1 = a;
        if (fp1.a != null)
        {
            fp1.a.destroy();
            fp1.a = null;
        }
        if (a.b != null)
        {
            a.b.a();
        }
    }

    (fp fp1)
    {
        a = fp1;
        super();
    }
}
