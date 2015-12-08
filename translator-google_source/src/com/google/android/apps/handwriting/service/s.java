// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import com.google.android.libraries.handwriting.base.StrokeList;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            r, HandwritingRecognizer

final class s
    implements Callable
{

    final StrokeList a;
    final r b;

    s(r r1, StrokeList strokelist)
    {
        b = r1;
        a = strokelist;
        super();
    }

    public final Object call()
    {
        return Integer.valueOf(b.e.a(a));
    }
}
