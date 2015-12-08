// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fi

final class fn
    implements Runnable
{

    final Dialog a;
    final a.a b;
    final fi c;

    fn(Dialog dialog, a.a a1, fi fi1)
    {
        a = dialog;
        b = a1;
        c = fi1;
        super();
    }

    public void run()
    {
        fi.a(a, b, c);
    }
}
