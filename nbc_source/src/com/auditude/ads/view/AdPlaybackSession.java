// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import com.auditude.ads.model.IAsset;
import com.auditude.ads.model.IClick;
import com.auditude.ads.session.IPlaybackSession;
import com.auditude.ads.view.model.AdViewSource;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.view:
//            AdView

public class AdPlaybackSession
    implements IPlaybackSession
{
    public static interface OnAdPlaybackSessionEventListener
    {

        public abstract void onAdPlaybackSessionEvent(PlaybackConstants playbackconstants, AdViewSource adviewsource, AdView adview, HashMap hashmap);
    }

    public static final class PlaybackConstants extends Enum
    {

        public static final PlaybackConstants CLICK;
        public static final PlaybackConstants COMPLETE;
        private static final PlaybackConstants ENUM$VALUES[];
        public static final PlaybackConstants ERROR;
        public static final PlaybackConstants NOTIFY;
        public static final PlaybackConstants PAUSE;
        public static final PlaybackConstants PROGRESS;
        public static final PlaybackConstants RESUME;
        public static final PlaybackConstants SKIP;
        public static final PlaybackConstants START;
        public static final PlaybackConstants STOP;

        public static PlaybackConstants valueOf(String s)
        {
            return (PlaybackConstants)Enum.valueOf(com/auditude/ads/view/AdPlaybackSession$PlaybackConstants, s);
        }

        public static PlaybackConstants[] values()
        {
            PlaybackConstants aplaybackconstants[] = ENUM$VALUES;
            int i = aplaybackconstants.length;
            PlaybackConstants aplaybackconstants1[] = new PlaybackConstants[i];
            System.arraycopy(aplaybackconstants, 0, aplaybackconstants1, 0, i);
            return aplaybackconstants1;
        }

        static 
        {
            START = new PlaybackConstants("START", 0);
            PAUSE = new PlaybackConstants("PAUSE", 1);
            RESUME = new PlaybackConstants("RESUME", 2);
            STOP = new PlaybackConstants("STOP", 3);
            COMPLETE = new PlaybackConstants("COMPLETE", 4);
            ERROR = new PlaybackConstants("ERROR", 5);
            CLICK = new PlaybackConstants("CLICK", 6);
            SKIP = new PlaybackConstants("SKIP", 7);
            PROGRESS = new PlaybackConstants("PROGRESS", 8);
            NOTIFY = new PlaybackConstants("NOTIFY", 9);
            ENUM$VALUES = (new PlaybackConstants[] {
                START, PAUSE, RESUME, STOP, COMPLETE, ERROR, CLICK, SKIP, PROGRESS, NOTIFY
            });
        }

        private PlaybackConstants(String s, int i)
        {
            super(s, i);
        }
    }


    private OnAdPlaybackSessionEventListener listener;
    private AdViewSource source;
    private AdView view;

    public AdPlaybackSession(AdViewSource adviewsource, AdView adview, OnAdPlaybackSessionEventListener onadplaybacksessioneventlistener)
    {
        source = adviewsource;
        view = adview;
        listener = onadplaybacksessioneventlistener;
    }

    public final OnAdPlaybackSessionEventListener getOnAdPlaybackSessionEventListener()
    {
        return listener;
    }

    public final void notify(String s, HashMap hashmap)
    {
        listener.onAdPlaybackSessionEvent(PlaybackConstants.NOTIFY, source, view, hashmap);
    }

    public final void notifyClick()
    {
        if (source != null && source.getAsset() != null && source.getAsset().getClick() != null && source.getAsset().getClick().getUrl() != null && source.getAsset().getClick().getUrl().length() > 0)
        {
            listener.onAdPlaybackSessionEvent(PlaybackConstants.CLICK, source, view, null);
        }
    }

    public final void notifyComplete()
    {
        listener.onAdPlaybackSessionEvent(PlaybackConstants.COMPLETE, source, view, null);
    }

    public final void notifyError(RuntimeException runtimeexception)
    {
        HashMap hashmap = new HashMap();
        if (runtimeexception != null)
        {
            hashmap.put("error", runtimeexception);
        }
        listener.onAdPlaybackSessionEvent(PlaybackConstants.ERROR, source, view, hashmap);
    }

    public final void notifyPause()
    {
        listener.onAdPlaybackSessionEvent(PlaybackConstants.PAUSE, source, view, null);
    }

    public final void notifyProgress(int i, int j)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("position", Integer.valueOf(i));
        hashmap.put("duration", Integer.valueOf(j));
        listener.onAdPlaybackSessionEvent(PlaybackConstants.PROGRESS, source, view, hashmap);
    }

    public final void notifyResume()
    {
        listener.onAdPlaybackSessionEvent(PlaybackConstants.RESUME, source, view, null);
    }

    public final void notifySkip()
    {
        listener.onAdPlaybackSessionEvent(PlaybackConstants.SKIP, source, view, null);
    }

    public final void notifyStart()
    {
        listener.onAdPlaybackSessionEvent(PlaybackConstants.START, source, view, null);
    }

    public final void notifyStop()
    {
        listener.onAdPlaybackSessionEvent(PlaybackConstants.STOP, source, view, null);
    }

    public final void setOnAdPlaybackSessionEventListener(OnAdPlaybackSessionEventListener onadplaybacksessioneventlistener)
    {
        listener = onadplaybacksessioneventlistener;
    }
}
