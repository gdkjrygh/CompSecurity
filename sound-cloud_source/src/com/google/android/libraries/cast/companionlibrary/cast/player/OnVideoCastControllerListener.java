// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import android.view.View;
import android.widget.SeekBar;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.tracks.OnTracksSelectedListener;

public interface OnVideoCastControllerListener
    extends OnTracksSelectedListener
{

    public abstract void onConfigurationChanged();

    public abstract void onPlayPauseClicked(View view)
        throws CastException, TransientNetworkDisconnectionException, NoConnectionException;

    public abstract void onProgressChanged(SeekBar seekbar, int i, boolean flag);

    public abstract void onSkipNextClicked(View view)
        throws TransientNetworkDisconnectionException, NoConnectionException;

    public abstract void onSkipPreviousClicked(View view)
        throws TransientNetworkDisconnectionException, NoConnectionException;

    public abstract void onStartTrackingTouch(SeekBar seekbar);

    public abstract void onStopTrackingTouch(SeekBar seekbar);
}
