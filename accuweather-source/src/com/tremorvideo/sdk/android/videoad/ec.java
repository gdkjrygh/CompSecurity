// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.os.Bundle;
import com.tremorvideo.a.a;
import com.tremorvideo.a.d;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            eb, eh, ef, ed

class ec
    implements com.tremorvideo.a.b.a
{

    final eb a;

    ec(eb eb1)
    {
        a = eb1;
        super();
    }

    public void a()
    {
        com.tremorvideo.sdk.android.videoad.eb.a(a, true);
    }

    public void a(Bundle bundle)
    {
        a.b.runOnUiThread(new eh(this));
    }

    public void a(a a1)
    {
        a.b.runOnUiThread(new ef(this));
    }

    public void a(d d)
    {
        a.b.runOnUiThread(new ed(this));
    }
}
