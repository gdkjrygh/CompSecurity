// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.media.MediaPlayer;

// Referenced classes of package com.jirbo.adcolony:
//            e

class 
    implements android.media.aPlayer.OnBufferingUpdateListener
{

    final e a;

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        a.z = i;
    }

    er(e e1)
    {
        a = e1;
        super();
    }
}
