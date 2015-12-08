// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


// Referenced classes of package com.mopub.mraid:
//            MraidController

final class i
    implements com.mopub.common.CloseableLayout.OnCloseListener
{

    final MraidController a;

    i(MraidController mraidcontroller)
    {
        a = mraidcontroller;
        super();
    }

    public final void onClose()
    {
        a.d();
    }
}
