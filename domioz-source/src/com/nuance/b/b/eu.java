// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.media.MediaPlayer;

// Referenced classes of package com.nuance.b.b:
//            et

final class eu
    implements android.media.MediaPlayer.OnCompletionListener
{

    final et a;

    eu(et et1)
    {
        a = et1;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        et.a(a);
    }
}
