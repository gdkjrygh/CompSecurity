// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.util.Pair;
import com.fitbit.data.bl.exceptions.JsonException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.i;
import com.fitbit.util.bf;
import org.json.JSONException;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeActivity

class a extends bf
{

    final String a;
    final ChallengeActivity b;

    protected Pair a()
    {
        Object obj = null;
        com.fitbit.data.domain.challenges.Challenge challenge;
        try
        {
            challenge = i.a().a(a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            challenge = null;
        }
        catch (JSONException jsonexception)
        {
            jsonexception = new JsonException(jsonexception);
            challenge = null;
        }
        return Pair.create(challenge, obj);
    }

    protected Object f_()
    {
        return a();
    }

    tionException(ChallengeActivity challengeactivity, Context context, String s)
    {
        b = challengeactivity;
        a = s;
        super(context);
    }
}
