// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import android.content.Context;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.o;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.offline.a:
//            i

public final class p extends i
{

    private final List a;

    public p(List list, o o, Context context, Runnable runnable)
    {
        super(null, o, context, null, runnable, false);
        a = list;
    }

    protected final void a(boolean flag)
    {
        a(flag, true, (OfflinePackage[])a.toArray(new OfflinePackage[0]));
    }
}
