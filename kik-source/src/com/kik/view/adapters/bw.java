// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.media.MediaPlayer;
import android.os.Handler;
import android.view.TextureView;
import kik.a.d.s;

// Referenced classes of package com.kik.view.adapters:
//            bf, bx

final class bw
    implements android.media.MediaPlayer.OnErrorListener
{

    final bf.b a;
    final s b;
    final TextureView c;
    final bf d;

    bw(bf bf1, bf.b b1, s s, TextureView textureview)
    {
        d = bf1;
        a = b1;
        b = s;
        c = textureview;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        d.s.post(new bx(this, i));
        return false;
    }
}
