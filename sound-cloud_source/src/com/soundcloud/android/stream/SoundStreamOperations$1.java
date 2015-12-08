// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.PlayableItem;
import com.soundcloud.java.collections.PropertySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

final class 
    implements f
{

    public final volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public final List call(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            PropertySet propertyset = (PropertySet)list.next();
            if (((Urn)propertyset.get(EntityProperty.URN)).isPlayable())
            {
                arraylist.add(PlayableItem.from(propertyset));
            }
        } while (true);
        return arraylist;
    }

    ()
    {
    }
}
