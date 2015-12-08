// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            Fragment

final class s
{

    private final String a;
    private final Class b;
    private final Bundle c;
    private Fragment d;

    static Fragment a(s s1)
    {
        return s1.d;
    }

    static Fragment a(s s1, Fragment fragment)
    {
        s1.d = fragment;
        return fragment;
    }

    static String b(s s1)
    {
        return s1.a;
    }

    static Class c(s s1)
    {
        return s1.b;
    }

    static Bundle d(s s1)
    {
        return s1.c;
    }
}
