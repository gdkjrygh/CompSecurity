// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.media.MediaPlayer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.res:
//            Sounds

final class a
    implements android.media.er.OnErrorListener
{

    final int a;
    final Sounds b;

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        Sounds.d().warning((new StringBuilder("MediaPlayer onError id:")).append(a).append(" what:").append(i).append(" extra:").append(j).toString());
        mediaplayer.release();
        Sounds.a(b).remove(Integer.valueOf(a));
        return true;
    }

    HashMap(Sounds sounds, int i)
    {
        b = sounds;
        a = i;
        super();
    }
}
