// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            ba

final class bb
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final ba a;

    bb(ba ba1)
    {
        a = ba1;
        super();
    }

    public final boolean onPreDraw()
    {
        a.c();
        return true;
    }
}
