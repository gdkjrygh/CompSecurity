// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.f.f.z;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase

final class mb
    implements Runnable
{

    final z a;
    final KikIqFragmentBase b;

    mb(KikIqFragmentBase kikiqfragmentbase, z z1)
    {
        b = kikiqfragmentbase;
        a = z1;
        super();
    }

    public final void run()
    {
        b.a(b.R, (String)a.m());
    }
}
