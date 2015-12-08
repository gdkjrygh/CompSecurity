// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Sets, ImmutableSet, ImmutableList

private class dividend
{

    final ImmutableSet choices;
    final ImmutableList choicesList;
    final int dividend;
    final choices this$0;

    boolean contains(Object obj)
    {
        return choices.contains(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof choices)
        {
            obj = (choices)obj;
            return choices.equals(((choices) (obj)).choices);
        } else
        {
            return false;
        }
    }

    Object getForIndex(int i)
    {
        return choicesList.get((i / dividend) % size());
    }

    public int hashCode()
    {
        return (this._cls0.this.size / choices.size()) * choices.hashCode();
    }

    int size()
    {
        return choices.size();
    }

    (Set set, int i)
    {
        this$0 = this._cls0.this;
        super();
        choices = ImmutableSet.copyOf(set);
        choicesList = choices.asList();
        dividend = i;
    }
}
