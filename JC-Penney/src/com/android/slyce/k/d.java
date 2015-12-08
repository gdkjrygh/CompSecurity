// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.k;

import android.media.SoundPool;

// Referenced classes of package com.android.slyce.k:
//            c

class d
    implements android.media.SoundPool.OnLoadCompleteListener
{

    final c a;

    d(c c)
    {
        a = c;
        super();
    }

    public void onLoadComplete(SoundPool soundpool, int i, int j)
    {
        soundpool.play(i, 1.0F, 1.0F, 1, 0, 1.0F);
    }
}
