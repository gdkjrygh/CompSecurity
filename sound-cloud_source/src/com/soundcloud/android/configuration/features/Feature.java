// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.features;

import com.soundcloud.java.objects.MoreObjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Feature
{

    public final boolean enabled;
    public final String name;
    public final List plans;

    public Feature(String s, boolean flag, List list)
    {
        name = s;
        enabled = flag;
        if (list == null)
        {
            list = new ArrayList(0);
        }
        plans = Collections.unmodifiableList(list);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Feature)obj;
            if (!MoreObjects.equal(name, ((Feature) (obj)).name) || !MoreObjects.equal(Boolean.valueOf(enabled), Boolean.valueOf(((Feature) (obj)).enabled)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            name, Boolean.valueOf(enabled)
        });
    }
}
