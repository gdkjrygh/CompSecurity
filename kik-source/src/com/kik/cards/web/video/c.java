// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.video;

import android.media.MediaPlayer;
import kik.android.chat.fragment.WebVideoFragment;
import org.json.JSONException;

// Referenced classes of package com.kik.cards.web.video:
//            b

final class c
    implements android.media.MediaPlayer.OnErrorListener
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        if (b.a(a) != null)
        {
            b.a(a).c();
        }
        try
        {
            a.b(j);
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayer mediaplayer) { }
        b.a(a, true);
        return true;
    }
}
