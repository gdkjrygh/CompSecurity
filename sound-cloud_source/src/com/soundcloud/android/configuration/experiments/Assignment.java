// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.experiments;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.configuration.experiments:
//            Layer

public class Assignment
{

    private static final Assignment EMPTY = new Assignment(Collections.emptyList());
    private final List layers;

    public Assignment(List list)
    {
        layers = list;
    }

    public static Assignment empty()
    {
        return EMPTY;
    }

    public List getLayers()
    {
        return layers;
    }

    public boolean isEmpty()
    {
        return layers.isEmpty();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(500);
        stringbuilder.append("Assignment: ").append(layers.size()).append(" layer(s)\n");
        for (Iterator iterator = layers.iterator(); iterator.hasNext(); stringbuilder.append((Layer)iterator.next())) { }
        return stringbuilder.toString();
    }

}
