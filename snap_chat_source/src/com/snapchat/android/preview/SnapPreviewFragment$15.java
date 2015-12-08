// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import Px;
import android.content.Context;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.snapchat.android.model.Mediabryo;
import vv;
import wG;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class k.SaveLocation extends Px
{

    private SnapPreviewFragment a;

    protected final void a()
    {
        super.a();
        SnapPreviewFragment.H(a).a(SnapPreviewFragment.p(a));
    }

    protected final void b()
    {
        super.b();
        SnapPreviewFragment.H(a).b(SnapPreviewFragment.p(a));
        SnapPreviewFragment.a(a, (vv)((Mediabryo) (SnapPreviewFragment.p(a))).mMediaExtras, mTotalSizeInByte);
    }

    protected final void c()
    {
        super.c();
        SnapPreviewFragment.H(a).a(((Mediabryo) (SnapPreviewFragment.p(a))).mClientId);
    }

    protected final void d()
    {
        super.d();
        SnapPreviewFragment.I(a);
    }

    k.SaveLocation(SnapPreviewFragment snappreviewfragment, DisplayMetrics displaymetrics, WebView webview, Context context, com.snapchat.android.util.save.SaveLocation savelocation)
    {
        a = snappreviewfragment;
        super(displaymetrics, webview, context, savelocation);
    }
}
