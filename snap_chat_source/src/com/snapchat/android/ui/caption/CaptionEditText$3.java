// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.os.Handler;

// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText

final class b
    implements Runnable
{

    private Handler a;
    private Runnable b;
    private CaptionEditText c;

    public final void run()
    {
        c.setVisibility(4);
        c.setY(0.0F);
        a.postDelayed(b, 10L);
    }

    (CaptionEditText captionedittext, Handler handler, Runnable runnable)
    {
        c = captionedittext;
        a = handler;
        b = runnable;
        super();
    }
}
