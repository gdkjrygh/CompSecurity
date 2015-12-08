// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.java.collections.PropertySet;
import java.util.Iterator;
import java.util.List;
import rx.b.g;

final class 
    implements g
{

    public final volatile Object call(Object obj, Object obj1)
    {
        return call((List)obj, (String)obj1);
    }

    public final List call(List list, String s)
    {
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PropertySet propertyset = (PropertySet)iterator.next();
            if (((Boolean)propertyset.getOrElse(PlayableProperty.IS_REPOSTED, Boolean.valueOf(false))).booleanValue())
            {
                propertyset.put(PostProperty.REPOSTER, s);
            }
        } while (true);
        return list;
    }

    ()
    {
    }
}
