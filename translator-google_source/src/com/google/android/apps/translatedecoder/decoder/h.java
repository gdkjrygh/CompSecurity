// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.a.a;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            g

final class h
    implements Callable
{

    final g a;
    private a b;
    private int c[];

    public h(g g, a a1, int ai[])
    {
        a = g;
        super();
        b = a1;
        c = ai;
    }

    public final Object call()
    {
        return b.a(c);
    }
}
