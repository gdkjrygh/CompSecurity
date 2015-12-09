// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.fitbit.data.domain.challenges.ChallengeType;
import java.util.ArrayList;
import java.util.Date;

// Referenced classes of package com.fitbit.challenges.ui:
//            AddPlayersActivity_

public static class a
{

    private Context a;
    private final Intent b;
    private Fragment c;

    public Intent a()
    {
        return b;
    }

    public b a(int i)
    {
        b.setFlags(i);
        return this;
    }

    public  a(ChallengeType challengetype)
    {
        b.putExtra("challengeType", challengetype);
        return this;
    }

    public b a(String s)
    {
        b.putExtra("challengeId", s);
        return this;
    }

    public b a(ArrayList arraylist)
    {
        b.putExtra("participants", arraylist);
        return this;
    }

    public b a(Date date)
    {
        b.putExtra("startTime", date);
        return this;
    }

    public b b(ArrayList arraylist)
    {
        b.putExtra("invites", arraylist);
        return this;
    }

    public void b()
    {
        a.startActivity(b);
    }

    public void b(int i)
    {
        if (c != null)
        {
            c.startActivityForResult(b, i);
            return;
        }
        if (a instanceof Activity)
        {
            ((Activity)a).startActivityForResult(b, i);
            return;
        } else
        {
            a.startActivity(b);
            return;
        }
    }

    public b c(int i)
    {
        b.putExtra("maxPlayers", i);
        return this;
    }

    public b d(int i)
    {
        b.putExtra("minPlayers", i);
        return this;
    }

    public (Context context)
    {
        a = context;
        b = new Intent(context, com/fitbit/challenges/ui/AddPlayersActivity_);
    }

    public b(Fragment fragment)
    {
        c = fragment;
        a = fragment.getActivity();
        b = new Intent(a, com/fitbit/challenges/ui/AddPlayersActivity_);
    }
}
