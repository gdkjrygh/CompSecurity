// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            Fragment

final class ag
{

    private final String a;
    private final Class b;
    private final Bundle c;
    private Fragment d;

    static Fragment a(ag ag1)
    {
        return ag1.d;
    }

    static Fragment a(ag ag1, Fragment fragment)
    {
        ag1.d = fragment;
        return fragment;
    }

    static String b(ag ag1)
    {
        return ag1.a;
    }

    static Class c(ag ag1)
    {
        return ag1.b;
    }

    static Bundle d(ag ag1)
    {
        return ag1.c;
    }
}
