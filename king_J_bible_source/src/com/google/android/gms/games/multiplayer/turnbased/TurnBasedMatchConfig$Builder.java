// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.internal.fq;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfig

public static final class <init>
{

    Bundle MO;
    ArrayList MR;
    int MZ;
    int My;

    public <init> addInvitedPlayer(String s)
    {
        fq.f(s);
        MR.add(s);
        return this;
    }

    public MR addInvitedPlayers(ArrayList arraylist)
    {
        fq.f(arraylist);
        MR.addAll(arraylist);
        return this;
    }

    public TurnBasedMatchConfig build()
    {
        return new TurnBasedMatchConfig(this, null);
    }

    public MR setAutoMatchCriteria(Bundle bundle)
    {
        MO = bundle;
        return this;
    }

    public MO setMinPlayers(int i)
    {
        MZ = i;
        return this;
    }

    public MZ setVariant(int i)
    {
        boolean flag;
        if (i == -1 || i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.b(flag, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
        My = i;
        return this;
    }

    private ()
    {
        My = -1;
        MR = new ArrayList();
        MO = null;
        MZ = 2;
    }

    MZ(MZ mz)
    {
        this();
    }
}
