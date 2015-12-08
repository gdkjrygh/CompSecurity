// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.util.ErrorUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.model:
//            SourceAwareMetadataObject, Source

public class SourceCollection extends SourceAwareMetadataObject
{

    private Set b;

    public SourceCollection(Source source, DeliveryType deliverytype)
    {
        super(new HashMap());
        if (source == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("sourceRequired"));
        } else
        {
            b = new HashSet();
            b.add(source);
            a(deliverytype);
            return;
        }
    }

    public SourceCollection(Map map)
    {
        super(map);
    }

    public SourceCollection(Map map, Set set)
    {
        super(map);
        if (set == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("sourcesRequired"));
        } else
        {
            b = set;
            return;
        }
    }

    public SourceCollection(Set set, DeliveryType deliverytype)
    {
        super(new HashMap());
        if (set == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("sourcesRequired"));
        } else
        {
            b = set;
            a(deliverytype);
            return;
        }
    }

    public Set getSources()
    {
        return b;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SourceCollection{");
        stringbuilder.append(" deliveryType:").append(getDeliveryType().toString());
        StringBuilder stringbuilder1 = stringbuilder.append(" sources:");
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.size();
        }
        stringbuilder1.append(i);
        stringbuilder.append("} ");
        return stringbuilder.toString();
    }
}
