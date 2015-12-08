// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.view.View;

// Referenced classes of package com.facebook.share.widget:
//            LikeView

final class c
    implements android.view.View.OnClickListener
{

    final LikeView a;

    c(LikeView likeview)
    {
        a = likeview;
        super();
    }

    public final void onClick(View view)
    {
        LikeView.a(a);
    }
}
