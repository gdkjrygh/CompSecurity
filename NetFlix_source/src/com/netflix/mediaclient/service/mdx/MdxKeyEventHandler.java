// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.view.KeyEvent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.mdx.MdxTargetCapabilities;
import com.netflix.mediaclient.ui.mdx.RemotePlayer;
import com.netflix.mediaclient.util.LastKeyEvent;
import com.netflix.mediaclient.util.MdxUtils;

public class MdxKeyEventHandler
{
    public static interface MdxKeyEventCallbacks
    {

        public abstract int getVolumeAsPercent();

        public abstract void onVolumeSet(int i);
    }


    private static final String TAG = "nf_key";
    private static final int VOLUME_DELTA = 10;
    private final MdxKeyEventCallbacks callbacks;
    private final LastKeyEvent lastKey = new LastKeyEvent();

    public MdxKeyEventHandler(MdxKeyEventCallbacks mdxkeyeventcallbacks)
    {
        callbacks = mdxkeyeventcallbacks;
    }

    private boolean isPlayerInValidState(RemotePlayer remoteplayer)
    {
        String s;
        if (remoteplayer == null)
        {
            s = "null player";
        } else
        {
            s = String.valueOf(remoteplayer.getCapabilities());
        }
        Log.v("nf_key", s);
        return remoteplayer != null && remoteplayer.getCapabilities() != null && remoteplayer.getCapabilities().isVolumeControl();
    }

    public boolean handleKeyEvent(KeyEvent keyevent, ServiceManager servicemanager, final RemotePlayer player)
    {
        if (player != null)
        {
            if (!MdxUtils.isCurrentMdxTargetAvailable(servicemanager))
            {
                Log.d("nf_key", "Current mdx target is not available - not handling key event");
                return false;
            }
            if (keyevent.getAction() == 0)
            {
                switch (keyevent.getKeyCode())
                {
                default:
                    return false;

                case 24: // '\030'
                    if (isPlayerInValidState(player))
                    {
                        if (lastKey.shouldIgnore(keyevent))
                        {
                            Log.d("nf_key", "Volume key up is pressed, ignored");
                        } else
                        {
                            Log.d("nf_key", "Volume key up is pressed, sending...");
                            (new BackgroundTask()).execute(new Runnable() {

                                final MdxKeyEventHandler this$0;
                                final RemotePlayer val$player;

                                public void run()
                                {
                                    int i = callbacks.getVolumeAsPercent();
                                    player.setVolume(i + 10);
                                    callbacks.onVolumeSet(player.getVolume());
                                }

            
            {
                this$0 = MdxKeyEventHandler.this;
                player = remoteplayer;
                super();
            }
                            });
                        }
                        return true;
                    } else
                    {
                        Log.d("nf_key", "Volume key up is pressed, pass it");
                        return false;
                    }

                case 25: // '\031'
                    break;
                }
                if (isPlayerInValidState(player))
                {
                    if (lastKey.shouldIgnore(keyevent))
                    {
                        Log.d("nf_key", "Volume key down is pressed, ignored");
                    } else
                    {
                        Log.d("nf_key", "Volume key down is pressed, sending...");
                        (new BackgroundTask()).execute(new Runnable() {

                            final MdxKeyEventHandler this$0;
                            final RemotePlayer val$player;

                            public void run()
                            {
                                int i = callbacks.getVolumeAsPercent();
                                player.setVolume(i - 10);
                                callbacks.onVolumeSet(player.getVolume());
                            }

            
            {
                this$0 = MdxKeyEventHandler.this;
                player = remoteplayer;
                super();
            }
                        });
                    }
                    return true;
                } else
                {
                    Log.d("nf_key", "Volume key down is pressed, pass it");
                    return false;
                }
            }
        }
        return false;
    }

}
