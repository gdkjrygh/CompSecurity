// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.media.MediaPlayer;
import android.os.Handler;
import kik.a.d.s;
import kik.android.util.DeviceUtils;

// Referenced classes of package com.kik.view.adapters:
//            bf, bv

final class bu
    implements android.media.MediaPlayer.OnCompletionListener
{

    final bf.b a;
    final s b;
    final bf c;

    bu(bf bf1, bf.b b1, s s)
    {
        c = bf1;
        a = b1;
        b = s;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        c.s.post(new bv(this));
        DeviceUtils.f();
    }
}
