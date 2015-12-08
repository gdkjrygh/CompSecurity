// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.d;

import com.google.android.libraries.translate.core.Singleton;

// Referenced classes of package com.google.android.libraries.translate.d:
//            c, f

public final class e
{

    private final f a;

    public e(f f1)
    {
        a = f1;
    }

    public final transient Object a(c ac[])
    {
        int i = 0;
_L2:
        Object obj;
        if (i >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ac[i];
        obj = a.a(((c) (obj)).c(Singleton.a()));
        return obj;
        Exception exception;
        exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }
}
