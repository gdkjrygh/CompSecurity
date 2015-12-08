// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfig, TurnBasedMatchConfigImpl

public static final class <init>
{

    int adW;
    ArrayList ael;
    Bundle aem;
    int aew;

    public <init> addInvitedPlayer(String s)
    {
        jx.i(s);
        ael.add(s);
        return this;
    }

    public ael addInvitedPlayers(ArrayList arraylist)
    {
        jx.i(arraylist);
        ael.addAll(arraylist);
        return this;
    }

    public TurnBasedMatchConfig build()
    {
        return new TurnBasedMatchConfigImpl(this);
    }

    public t> setAutoMatchCriteria(Bundle bundle)
    {
        aem = bundle;
        return this;
    }

    public aem setVariant(int i)
    {
        boolean flag;
        if (i == -1 || i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
        adW = i;
        return this;
    }

    private ()
    {
        adW = -1;
        ael = new ArrayList();
        aem = null;
        aew = 2;
    }

    aew(aew aew1)
    {
        this();
    }
}
