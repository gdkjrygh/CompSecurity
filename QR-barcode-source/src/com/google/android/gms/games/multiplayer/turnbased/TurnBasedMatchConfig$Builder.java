// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.internal.o;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfig

public static final class <init>
{

    int acD;
    int acd;
    Bundle acs;
    ArrayList acv;

    public <init> addInvitedPlayer(String s)
    {
        o.i(s);
        acv.add(s);
        return this;
    }

    public acv addInvitedPlayers(ArrayList arraylist)
    {
        o.i(arraylist);
        acv.addAll(arraylist);
        return this;
    }

    public TurnBasedMatchConfig build()
    {
        return new TurnBasedMatchConfig(this, null);
    }

    public acv setAutoMatchCriteria(Bundle bundle)
    {
        acs = bundle;
        return this;
    }

    public acs setVariant(int i)
    {
        boolean flag;
        if (i == -1 || i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
        acd = i;
        return this;
    }

    private ()
    {
        acd = -1;
        acv = new ArrayList();
        acs = null;
        acD = 2;
    }

    acD(acD acd1)
    {
        this();
    }
}
