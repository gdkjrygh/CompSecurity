// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            FragmentTabHost, Fragment

static final class 
{

    private final String a;
    private final Class b;
    private final Bundle c;
    private Fragment d;

    static Fragment a( )
    {
        return .d;
    }

    static Fragment a(d d1, Fragment fragment)
    {
        d1.d = fragment;
        return fragment;
    }

    static String b(d d1)
    {
        return d1.a;
    }

    static Class c(a a1)
    {
        return a1.b;
    }

    static Bundle d(b b1)
    {
        return b1.c;
    }
}
