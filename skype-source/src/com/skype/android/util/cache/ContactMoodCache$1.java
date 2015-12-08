// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.cache;

import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.util.cache:
//            ContactMoodCache

final class d
    implements Callable
{

    final int a;
    final String b;
    final String c;
    final int d;
    final ContactMoodCache e;

    public final Object call()
        throws Exception
    {
        return ContactMoodCache.a(e, a, b, c, d);
    }

    (ContactMoodCache contactmoodcache, int i, String s, String s1, int j)
    {
        e = contactmoodcache;
        a = i;
        b = s;
        c = s1;
        d = j;
        super();
    }
}
