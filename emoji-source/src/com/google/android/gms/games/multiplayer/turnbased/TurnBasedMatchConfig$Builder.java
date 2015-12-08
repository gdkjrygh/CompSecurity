// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.internal.hm;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfig

public static final class <init>
{

    int SY;
    Bundle To;
    ArrayList Tr;
    int Tz;

    public <init> addInvitedPlayer(String s)
    {
        hm.f(s);
        Tr.add(s);
        return this;
    }

    public Tr addInvitedPlayers(ArrayList arraylist)
    {
        hm.f(arraylist);
        Tr.addAll(arraylist);
        return this;
    }

    public TurnBasedMatchConfig build()
    {
        return new TurnBasedMatchConfig(this, null);
    }

    public Tr setAutoMatchCriteria(Bundle bundle)
    {
        To = bundle;
        return this;
    }

    public To setVariant(int i)
    {
        boolean flag;
        if (i == -1 || i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
        SY = i;
        return this;
    }

    private ()
    {
        SY = -1;
        Tr = new ArrayList();
        To = null;
        Tz = 2;
    }

    Tz(Tz tz)
    {
        this();
    }
}
