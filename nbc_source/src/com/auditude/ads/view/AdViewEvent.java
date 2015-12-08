// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import com.auditude.ads.util.event.Event;
import com.auditude.ads.util.event.IEventDispatcher;
import com.auditude.ads.view.model.IAdViewSource;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.view:
//            IAdView

public class AdViewEvent extends Event
{
    public static final class AdViewEventType extends Enum
    {

        public static final AdViewEventType AD_CLICK;
        public static final AdViewEventType AD_COMPLETE;
        public static final AdViewEventType AD_ERROR;
        public static final AdViewEventType AD_LOAD;
        public static final AdViewEventType AD_LOG;
        public static final AdViewEventType AD_PAUSE;
        public static final AdViewEventType AD_PROGRESS;
        public static final AdViewEventType AD_REPLAY;
        public static final AdViewEventType AD_RESUME;
        public static final AdViewEventType AD_SKIP;
        public static final AdViewEventType AD_START;
        public static final AdViewEventType AD_STOP;
        public static final AdViewEventType AD_USER_CLOSE;
        public static final AdViewEventType AD_VOLUME_CHANGE;
        private static final AdViewEventType ENUM$VALUES[];

        public static AdViewEventType valueOf(String s)
        {
            return (AdViewEventType)Enum.valueOf(com/auditude/ads/view/AdViewEvent$AdViewEventType, s);
        }

        public static AdViewEventType[] values()
        {
            AdViewEventType aadvieweventtype[] = ENUM$VALUES;
            int i = aadvieweventtype.length;
            AdViewEventType aadvieweventtype1[] = new AdViewEventType[i];
            System.arraycopy(aadvieweventtype, 0, aadvieweventtype1, 0, i);
            return aadvieweventtype1;
        }

        static 
        {
            AD_START = new AdViewEventType("AD_START", 0);
            AD_REPLAY = new AdViewEventType("AD_REPLAY", 1);
            AD_STOP = new AdViewEventType("AD_STOP", 2);
            AD_COMPLETE = new AdViewEventType("AD_COMPLETE", 3);
            AD_LOAD = new AdViewEventType("AD_LOAD", 4);
            AD_PROGRESS = new AdViewEventType("AD_PROGRESS", 5);
            AD_PAUSE = new AdViewEventType("AD_PAUSE", 6);
            AD_RESUME = new AdViewEventType("AD_RESUME", 7);
            AD_LOG = new AdViewEventType("AD_LOG", 8);
            AD_ERROR = new AdViewEventType("AD_ERROR", 9);
            AD_CLICK = new AdViewEventType("AD_CLICK", 10);
            AD_VOLUME_CHANGE = new AdViewEventType("AD_VOLUME_CHANGE", 11);
            AD_USER_CLOSE = new AdViewEventType("AD_USER_CLOSE", 12);
            AD_SKIP = new AdViewEventType("AD_SKIP", 13);
            ENUM$VALUES = (new AdViewEventType[] {
                AD_START, AD_REPLAY, AD_STOP, AD_COMPLETE, AD_LOAD, AD_PROGRESS, AD_PAUSE, AD_RESUME, AD_LOG, AD_ERROR, 
                AD_CLICK, AD_VOLUME_CHANGE, AD_USER_CLOSE, AD_SKIP
            });
        }

        private AdViewEventType(String s, int i)
        {
            super(s, i);
        }
    }


    private HashMap data;
    private IAdViewSource source;
    private AdViewEventType type;
    private IAdView view;

    public AdViewEvent(IEventDispatcher ieventdispatcher, AdViewEventType advieweventtype, IAdViewSource iadviewsource, IAdView iadview)
    {
        this(ieventdispatcher, advieweventtype, iadviewsource, iadview, null);
    }

    public AdViewEvent(IEventDispatcher ieventdispatcher, AdViewEventType advieweventtype, IAdViewSource iadviewsource, IAdView iadview, HashMap hashmap)
    {
        super(ieventdispatcher);
        type = AdViewEventType.values()[0];
        type = advieweventtype;
        source = iadviewsource;
        view = iadview;
        data = hashmap;
    }

    public final HashMap getData()
    {
        return data;
    }

    public final IAdViewSource getSource()
    {
        return source;
    }

    public final AdViewEventType getType()
    {
        return type;
    }

    public final IAdView getView()
    {
        return view;
    }
}
