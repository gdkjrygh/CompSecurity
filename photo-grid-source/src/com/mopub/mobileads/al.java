// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.mopub.mobileads:
//            CustomEventRewardedVideo, am

final class al
{

    private final Map a = new TreeMap();
    private final Map b = new HashMap();
    private final Set c = new HashSet();

    al()
    {
    }

    final CustomEventRewardedVideo a(String s)
    {
        return (CustomEventRewardedVideo)a.get(s);
    }

    final Set a(Class class1, String s)
    {
        if (s == null)
        {
            s = new HashSet();
            Iterator iterator = b.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (class1 == ((am)entry.getKey()).a)
                {
                    s.addAll((Collection)entry.getValue());
                }
            } while (true);
            return s;
        }
        class1 = new am(class1, s);
        if (b.containsKey(class1))
        {
            return (Set)b.get(class1);
        } else
        {
            return Collections.emptySet();
        }
    }

    final void a(String s, CustomEventRewardedVideo customeventrewardedvideo, CustomEventRewardedVideo.CustomEventRewardedVideoListener customeventrewardedvideolistener, String s1)
    {
        a.put(s, customeventrewardedvideo);
        c.add(customeventrewardedvideolistener);
        s1 = new am(customeventrewardedvideo.getClass(), s1);
        customeventrewardedvideo = b.entrySet().iterator();
        do
        {
            if (!customeventrewardedvideo.hasNext())
            {
                break;
            }
            customeventrewardedvideolistener = (java.util.Map.Entry)customeventrewardedvideo.next();
            if (((am)customeventrewardedvideolistener.getKey()).equals(s1) || !((Set)customeventrewardedvideolistener.getValue()).contains(s))
            {
                continue;
            }
            ((Set)customeventrewardedvideolistener.getValue()).remove(s);
            if (((Set)customeventrewardedvideolistener.getValue()).isEmpty())
            {
                customeventrewardedvideo.remove();
            }
            break;
        } while (true);
        customeventrewardedvideolistener = (Set)b.get(s1);
        customeventrewardedvideo = customeventrewardedvideolistener;
        if (customeventrewardedvideolistener == null)
        {
            customeventrewardedvideo = new HashSet();
            b.put(s1, customeventrewardedvideo);
        }
        customeventrewardedvideo.add(s);
    }
}
