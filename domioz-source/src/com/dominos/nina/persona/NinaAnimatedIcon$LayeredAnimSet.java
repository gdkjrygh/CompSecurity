// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class name extends name
{

    private final String name;
    private List sets;

    void append(name name1)
    {
        sets.add(name1);
    }

    int count()
    {
        return sets.size();
    }

    boolean forward()
    {
        for (Iterator iterator = sets.iterator(); iterator.hasNext(); ((sets)iterator.next()).()) { }
        return isFinished();
    }

    String getName()
    {
        return name;
    }

    boolean isFinished()
    {
        for (Iterator iterator = sets.iterator(); iterator.hasNext();)
        {
            if (!((sets)iterator.next()).hed())
            {
                return false;
            }
        }

        return true;
    }

    void render(Canvas canvas)
    {
        for (Iterator iterator = sets.iterator(); iterator.hasNext(); ((sets)iterator.next()).sets(canvas)) { }
    }

    void reset()
    {
        for (Iterator iterator = sets.iterator(); iterator.hasNext(); ((sets)iterator.next()).sets()) { }
    }

    (String s)
    {
        super(null);
        sets = new ArrayList();
        name = s;
    }
}
