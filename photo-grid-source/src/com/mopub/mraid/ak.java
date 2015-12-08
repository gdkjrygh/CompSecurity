// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.view.View;

// Referenced classes of package com.mopub.mraid:
//            MraidVideoViewController

final class ak
    implements android.view.View.OnClickListener
{

    final MraidVideoViewController a;

    ak(MraidVideoViewController mraidvideoviewcontroller)
    {
        a = mraidvideoviewcontroller;
        super();
    }

    public final void onClick(View view)
    {
        MraidVideoViewController.d(a).onFinish();
    }
}
