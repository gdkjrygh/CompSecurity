// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.SourceCollection;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.EventUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.controller:
//            SourceSelector, NoSourceFoundException

public class DefaultSourceSelectionController extends AbstractComponent
    implements SourceSelector, Component
{
    final class a
        implements EventListener
    {

        private DefaultSourceSelectionController a;

        public final void processEvent(Event event)
        {
            Video video = (Video)event.properties.get("video");
            try
            {
                Source source = a.selectSource(video);
                event.properties.put("source", source);
                DefaultSourceSelectionController.a(a).respond(event);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Event event)
            {
                event = DefaultSourceSelectionController.TAG;
            }
            (new StringBuilder("no usable Source could be found for Video: ")).append(video.toString());
            EventUtil.emit(DefaultSourceSelectionController.b(a), "sourceNotFound", video);
        }

        private a()
        {
            a = DefaultSourceSelectionController.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    public static final String TAG = com/brightcove/player/controller/DefaultSourceSelectionController.getSimpleName();
    private final Integer a = Integer.valueOf(0x40000);
    private boolean b;

    public DefaultSourceSelectionController(EventEmitter eventemitter)
    {
        super(eventemitter, com/brightcove/player/controller/DefaultSourceSelectionController);
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        addListener("selectSource", new a((byte)0));
    }

    static EventEmitter a(DefaultSourceSelectionController defaultsourceselectioncontroller)
    {
        return defaultsourceselectioncontroller.eventEmitter;
    }

    static EventEmitter b(DefaultSourceSelectionController defaultsourceselectioncontroller)
    {
        return defaultsourceselectioncontroller.eventEmitter;
    }

    public Source findBestSourceByBitRate(SourceCollection sourcecollection, Integer integer)
    {
        if (sourcecollection.getSources() != null && sourcecollection.getSources().size() != 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Source) (obj));
_L2:
        obj = (Source)sourcecollection.getSources().iterator().next();
        int i = 0x7fffffff;
        Iterator iterator = sourcecollection.getSources().iterator();
        sourcecollection = ((SourceCollection) (obj));
        do
        {
            obj = sourcecollection;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (Source)iterator.next();
            if (((Source) (obj)).getBitRate() != null && ((Source) (obj)).getBitRate().intValue() > 0)
            {
                int j = Math.abs(((Source) (obj)).getBitRate().intValue() - integer.intValue());
                if (j <= i)
                {
                    sourcecollection = ((SourceCollection) (obj));
                    i = j;
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Source selectSource(Video video)
    {
        Object obj = null;
        if (video == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("videoRequired"));
        }
        Map map = video.getSourceCollections();
        if (map == null || map.size() == 0)
        {
            throw new NoSourceFoundException();
        }
        video = ((Video) (obj));
        if (b)
        {
            video = ((Video) (obj));
            if (map.containsKey(DeliveryType.HLS))
            {
                Set set1 = ((SourceCollection)map.get(DeliveryType.HLS)).getSources();
                video = ((Video) (obj));
                if (set1 != null)
                {
                    video = ((Video) (obj));
                    if (set1.size() > 0)
                    {
                        video = (Source)set1.iterator().next();
                    }
                }
            }
        }
        obj = video;
        if (video == null)
        {
            obj = video;
            if (map.containsKey(DeliveryType.MP4))
            {
                obj = findBestSourceByBitRate((SourceCollection)map.get(DeliveryType.MP4), a);
            }
        }
        video = ((Video) (obj));
        if (obj == null)
        {
            video = ((Video) (obj));
            if (map.containsKey(DeliveryType.DASH))
            {
                Set set2 = ((SourceCollection)map.get(DeliveryType.DASH)).getSources();
                video = ((Video) (obj));
                if (set2 != null)
                {
                    video = ((Video) (obj));
                    if (set2.size() > 0)
                    {
                        video = (Source)set2.iterator().next();
                    }
                }
            }
        }
        if (video == null && map.containsKey(DeliveryType.UNKNOWN))
        {
            Set set = ((SourceCollection)map.get(DeliveryType.UNKNOWN)).getSources();
            if (set != null && set.size() > 0)
            {
                video = (Source)set.iterator().next();
            }
        }
        if (video == null || video.getUrl() == null)
        {
            throw new NoSourceFoundException();
        } else
        {
            return video;
        }
    }

}
