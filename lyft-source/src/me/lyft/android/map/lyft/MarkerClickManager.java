// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me.lyft.android.map.lyft.markers.Marker;
import rx.Observable;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.map.lyft:
//            MarkerBank

public final class MarkerClickManager
{

    final HashMap clickMapping = new HashMap();
    final MarkerBank markerBank;

    public MarkerClickManager(MarkerBank markerbank)
    {
        markerBank = markerbank;
    }

    private PublishSubject getMarkerClickSubject(Class class1)
    {
        if (!clickMapping.containsKey(class1))
        {
            clickMapping.put(class1, PublishSubject.create());
        }
        return (PublishSubject)clickMapping.get(class1);
    }

    public Observable observeMarkerClick(Class class1)
    {
        PublishSubject publishsubject1 = (PublishSubject)clickMapping.get(class1);
        PublishSubject publishsubject = publishsubject1;
        if (publishsubject1 == null)
        {
            publishsubject = PublishSubject.create();
            clickMapping.put(class1, publishsubject);
        }
        return publishsubject.asObservable();
    }

    public boolean onMarkerClick(String s)
    {
        Iterator iterator = markerBank.getMarkerMap().entrySet().iterator();
        Class class1;
        Marker marker;
label0:
        do
        {
            if (iterator.hasNext())
            {
                class1 = (Class)((java.util.Map.Entry)iterator.next()).getKey();
                Iterator iterator1 = markerBank.getMarkersByType(class1).values().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                    marker = (Marker)iterator1.next();
                } while (!marker.getClickId().equals(s));
                break;
            } else
            {
                return true;
            }
        } while (true);
        getMarkerClickSubject(class1).onNext(marker);
        return marker.consumeClick();
    }
}
