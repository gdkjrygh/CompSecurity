// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import java.lang.ref.WeakReference;

// Referenced classes of package com.mopub.mobileads:
//            AdViewController

abstract class c
{

    WeakReference a;

    c(AdViewController adviewcontroller)
    {
        a = new WeakReference(adviewcontroller);
    }

    abstract void a();
}
