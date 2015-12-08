// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.media.MediaPlayer;
import com.nuance.b.b.a.ae;
import com.nuance.b.b.a.af;
import com.nuance.b.c.b;

// Referenced classes of package com.nuance.b.b:
//            et, es

final class ev
    implements android.media.MediaPlayer.OnErrorListener
{

    final b a;
    final int b;
    final et c;

    ev(et et1, b b1, int i)
    {
        c = et1;
        a = b1;
        b = i;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        com.nuance.b.b.et.b(c);
        boolean flag = c.d.a();
        a.b(new ae(a.b(), af.g, null, (new StringBuilder("Unable to play audio file (")).append(b).append(")").toString(), flag));
        return true;
    }
}
