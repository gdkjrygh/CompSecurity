// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.view.View;

// Referenced classes of package com.mopub.common:
//            MoPubBrowser

final class o
    implements android.view.View.OnClickListener
{

    final MoPubBrowser a;

    o(MoPubBrowser mopubbrowser)
    {
        a = mopubbrowser;
        super();
    }

    public final void onClick(View view)
    {
        a.finish();
    }
}
