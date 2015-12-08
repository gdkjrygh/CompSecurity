// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.looksery.core;

import android.media.MediaPlayer;

// Referenced classes of package com.looksery.core:
//            LSSoundManager

static final class a
    implements android.media.orListener
{

    private String a;

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        LSSoundManager.stop(a, false);
        return true;
    }

    stener(String s)
    {
        a = s;
        super();
    }
}
