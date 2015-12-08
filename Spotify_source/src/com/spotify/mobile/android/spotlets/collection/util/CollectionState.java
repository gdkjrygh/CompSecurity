// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.util;

import com.spotify.mobile.android.ui.fragments.logic.Flags;
import eom;

public final class CollectionState extends Enum
{

    public static final CollectionState a;
    public static final CollectionState b;
    public static final CollectionState c;
    private static final CollectionState d[];

    private CollectionState(String s, int i)
    {
        super(s, i);
    }

    public static CollectionState a(Flags flags, int i, boolean flag)
    {
        if (eom.b(flags))
        {
            if (flag)
            {
                return a;
            } else
            {
                return c;
            }
        }
        if (i == 0)
        {
            return c;
        }
        if (!flag)
        {
            return b;
        } else
        {
            return a;
        }
    }

    public static CollectionState valueOf(String s)
    {
        return (CollectionState)Enum.valueOf(com/spotify/mobile/android/spotlets/collection/util/CollectionState, s);
    }

    public static CollectionState[] values()
    {
        return (CollectionState[])d.clone();
    }

    static 
    {
        a = new CollectionState("YES", 0);
        b = new CollectionState("PARTIAL", 1);
        c = new CollectionState("NO", 2);
        d = (new CollectionState[] {
            a, b, c
        });
    }
}
