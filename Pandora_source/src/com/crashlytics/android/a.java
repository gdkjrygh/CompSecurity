// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.cm;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            bc

final class a
    implements Callable
{

    private bc a;

    a(bc bc1)
    {
        a = bc1;
        super();
    }

    public final Object call()
        throws Exception
    {
        bc.d(a).createNewFile();
        cm.a().b().a("Crashlytics", "Initialization marker file created.");
        return null;
    }
}
