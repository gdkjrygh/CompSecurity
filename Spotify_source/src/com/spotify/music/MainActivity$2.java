// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music;

import android.content.Intent;
import fow;

// Referenced classes of package com.spotify.music:
//            MainActivity

final class a
    implements fow
{

    private MainActivity a;

    public final void a(Intent intent)
    {
        a.onNewIntent(intent);
    }

    (MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }
}
