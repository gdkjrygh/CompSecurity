// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.media.MediaPlayer;
import android.view.View;

public interface n
{
    public static interface a
        extends android.widget.MediaController.MediaPlayerControl
    {
    }


    public abstract void a();

    public abstract void a(int i);

    public abstract void a(int i, int j);

    public abstract void a(View view, MediaPlayer mediaplayer);

    public abstract void b(int i, int j);

    public abstract void b(View view, MediaPlayer mediaplayer);

    public abstract boolean b();

    public abstract void c();

    public abstract void d();
}
