// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.internal.hn;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfig

public static final class <init>
{

    int SV;
    Bundle Tl;
    ArrayList To;
    int Tw;

    public <init> addInvitedPlayer(String s)
    {
        hn.f(s);
        To.add(s);
        return this;
    }

    public To addInvitedPlayers(ArrayList arraylist)
    {
        hn.f(arraylist);
        To.addAll(arraylist);
        return this;
    }

    public TurnBasedMatchConfig build()
    {
        return new TurnBasedMatchConfig(this, null);
    }

    public To setAutoMatchCriteria(Bundle bundle)
    {
        Tl = bundle;
        return this;
    }

    public Tl setVariant(int i)
    {
        boolean flag;
        if (i == -1 || i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
        SV = i;
        return this;
    }

    private ()
    {
        SV = -1;
        To = new ArrayList();
        Tl = null;
        Tw = 2;
    }

    Tw(Tw tw)
    {
        this();
    }
}
