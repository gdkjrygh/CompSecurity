// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.os.Bundle;
import com.tremorvideo.a.a;
import com.tremorvideo.a.b;
import com.tremorvideo.a.d;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ez, dm, fb, ea

final class fa
    implements com.tremorvideo.a.b.a
{

    final Activity a;
    final b b;
    final com.tremorvideo.a.b.a c;
    final ea d;

    fa(Activity activity, b b1, com.tremorvideo.a.b.a a1, ea ea)
    {
        a = activity;
        b = b1;
        c = a1;
        d = ea;
        super();
    }

    public void a()
    {
        com.tremorvideo.sdk.android.videoad.ez.a(a, b);
        c.a();
        com.tremorvideo.sdk.android.videoad.ez.a(null);
    }

    public void a(Bundle bundle)
    {
        dm dm1 = com.tremorvideo.sdk.android.videoad.dm.a(a);
        dm1.setIndeterminate(true);
        dm1.setMessage("Please Wait...");
        dm1.setCancelable(false);
        dm1.show();
        (new Thread(new fb(this, dm1, bundle))).start();
    }

    public void a(a a1)
    {
        com.tremorvideo.sdk.android.videoad.ez.a(a, b);
        c.a(a1);
        com.tremorvideo.sdk.android.videoad.ez.a(null);
    }

    public void a(d d1)
    {
        com.tremorvideo.sdk.android.videoad.ez.a(a, b);
        c.a(d1);
        com.tremorvideo.sdk.android.videoad.ez.a(null);
    }
}
