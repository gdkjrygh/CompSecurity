// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.SourceCollection;
import com.brightcove.player.model.Video;
import com.brightcove.player.util.ErrorUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.controller:
//            SourceSelector, f, NoSourceFoundException

public class DefaultSourceSelectionController extends AbstractComponent
    implements SourceSelector, Component
{

    public static final String TAG = com/brightcove/player/controller/DefaultSourceSelectionController.getSimpleName();
    boolean a;
    private final Integer b = Integer.valueOf(0x40000);

    public DefaultSourceSelectionController(EventEmitter eventemitter)
    {
        super(eventemitter, com/brightcove/player/controller/DefaultSourceSelectionController);
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        b();
    }

    static EventEmitter a(DefaultSourceSelectionController defaultsourceselectioncontroller)
    {
        return defaultsourceselectioncontroller.F;
    }

    static EventEmitter b(DefaultSourceSelectionController defaultsourceselectioncontroller)
    {
        return defaultsourceselectioncontroller.F;
    }

    int a()
    {
        return 14;
    }

    protected void b()
    {
        addListener("selectSource", new f(this, null));
    }

    public Source findBestSourceByBitRate(SourceCollection sourcecollection, Integer integer)
    {
        if (sourcecollection.getSources() == null || sourcecollection.getSources().size() == 0)
        {
            throw new NoSourceFoundException();
        }
        Source source = (Source)sourcecollection.getSources().iterator().next();
        int i = 0x7fffffff;
        Iterator iterator = sourcecollection.getSources().iterator();
        sourcecollection = source;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Source source1 = (Source)iterator.next();
            if (source1.getBitRate() != null && source1.getBitRate().intValue() > 0)
            {
                int j = Math.abs(source1.getBitRate().intValue() - integer.intValue());
                if (j <= i)
                {
                    sourcecollection = source1;
                    i = j;
                }
            }
        } while (true);
        return sourcecollection;
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
        if (true)
        {
            video = ((Video) (obj));
            if (a)
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
        }
        obj = video;
        if (video == null)
        {
            obj = video;
            if (map.containsKey(DeliveryType.MP4))
            {
                obj = findBestSourceByBitRate((SourceCollection)map.get(DeliveryType.MP4), b);
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
