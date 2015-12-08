// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.pandora.android.activity:
//            NowPlaying

class a
    implements Runnable
{

    final NowPlaying a;

    public void run()
    {
        NowPlaying.a(a);
        Bundle bundle = new Bundle();
        bundle.putBoolean("suppressScroll", true);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        a.setResult(-1, intent);
        a.finish();
    }

    (NowPlaying nowplaying)
    {
        a = nowplaying;
        super();
    }
}
