// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.MusicPlayer;

import com.arist.entity.Music;
import java.util.Comparator;

// Referenced classes of package com.arist.MusicPlayer:
//            MainActivity

class this._cls0
    implements Comparator
{

    final MainActivity this$0;

    public int compare(Music music, Music music1)
    {
        return music.getTitle().compareTo(music1.getTitle()) <= 0 ? -1 : 1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Music)obj, (Music)obj1);
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
