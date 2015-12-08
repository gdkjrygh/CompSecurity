// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts.network;

import android.media.MediaPlayer;
import com.google.android.libraries.translate.tts.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g
    implements android.media.MediaPlayer.OnCompletionListener
{

    public final List a;
    private final e b;

    public g(List list, e e1)
    {
        a = new ArrayList(list);
        b = e1;
        a();
    }

    protected void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((MediaPlayer)iterator.next()).setOnCompletionListener(this)) { }
    }

    protected final void b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((MediaPlayer)iterator.next()).release()) { }
        if (b != null)
        {
            b.j();
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        int i = a.indexOf(mediaplayer) + 1;
        if (i >= a.size())
        {
            b();
            return;
        } else
        {
            ((MediaPlayer)a.get(i)).start();
            return;
        }
    }
}
