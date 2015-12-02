// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            Fragment

final class ac
{

    private final String a;
    private final Class b;
    private final Bundle c;
    private Fragment d;

    static Fragment a(ac ac1)
    {
        return ac1.d;
    }

    static Fragment a(ac ac1, Fragment fragment)
    {
        ac1.d = fragment;
        return fragment;
    }

    static String b(ac ac1)
    {
        return ac1.a;
    }

    static Class c(ac ac1)
    {
        return ac1.b;
    }

    static Bundle d(ac ac1)
    {
        return ac1.c;
    }
}
