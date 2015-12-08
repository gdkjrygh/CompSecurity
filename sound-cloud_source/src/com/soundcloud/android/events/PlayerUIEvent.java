// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import rx.b.f;

public class PlayerUIEvent
{

    public static final int PLAYER_COLLAPSED = 1;
    public static final int PLAYER_EXPANDED = 0;
    public static final f PLAYER_IS_COLLAPSED = new _cls1();
    private final int kind;

    public PlayerUIEvent(int i)
    {
        kind = i;
    }

    public static PlayerUIEvent fromPlayerCollapsed()
    {
        return new PlayerUIEvent(1);
    }

    public static PlayerUIEvent fromPlayerExpanded()
    {
        return new PlayerUIEvent(0);
    }

    public int getKind()
    {
        return kind;
    }

    public String toString()
    {
        return (new StringBuilder("player UI event: ")).append(kind).toString();
    }


    private class _cls1
        implements f
    {

        public final Boolean call(PlayerUIEvent playeruievent)
        {
            boolean flag = true;
            if (playeruievent.getKind() != 1)
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((PlayerUIEvent)obj);
        }

        _cls1()
        {
        }
    }

}
