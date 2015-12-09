// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.az;
import java.io.File;

// Referenced classes of package com.crashlytics.android:
//            d, af, ad, bc

final class g extends az
{

    private File a;

    g(bc bc1, File file)
    {
        a = file;
        super();
    }

    public final void a()
    {
        z z = d.a().t();
        if (z != null)
        {
            (new af(z)).a(new ad(a, bc.j()));
        }
    }
}
