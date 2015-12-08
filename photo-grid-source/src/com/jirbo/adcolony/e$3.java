// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.widget.MediaController;

// Referenced classes of package com.jirbo.adcolony:
//            e

class 
    implements android.media.aPlayer.OnCompletionListener
{

    final e a;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        a.o = 5;
        a.p = 5;
        if (a.w != null)
        {
            a.w.hide();
        }
        if (a.x != null)
        {
            a.x.onCompletion(a.r);
        }
    }

    er(e e1)
    {
        a = e1;
        super();
    }
}
