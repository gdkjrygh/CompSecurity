// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.looksery.core;

import android.media.MediaPlayer;

// Referenced classes of package com.looksery.core:
//            LSSoundManager

static final class a
    implements android.media.pletionListener
{

    private int a;
    private int b;
    private String c;

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (b == 0x40000000)
        {
            return;
        }
        if (a < b)
        {
            a = a + 1;
            return;
        } else
        {
            LSSoundManager.stop(c, false);
            return;
        }
    }

    ionListener(int i, String s)
    {
        b = i;
        c = s;
        super();
        a = 0;
    }
}
