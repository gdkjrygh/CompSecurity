// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            l

final class m
    implements com.mopub.common.CloseableLayout.OnCloseListener
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public final void onClose()
    {
        a.finish();
    }
}
