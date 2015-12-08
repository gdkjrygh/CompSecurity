// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fitbit.data.bl.exceptions.JsonException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.data.domain.challenges.ChallengeMessage;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.data.domain.challenges.b;
import com.fitbit.data.domain.challenges.c;
import com.fitbit.data.domain.challenges.d;
import com.fitbit.data.domain.l;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            ao, ChallengesUtils

public class i
{

    public static final String a = "ChallengesBusinessLogic";
    private static final int b = 10;
    private static i c;
    private final PublicAPI d = new PublicAPI(ServerGateway.a());
    private final ao e = new ao();
    private List f;
    private List g;
    private final Object h = new Object();

    private i()
    {
    }

    public static i a()
    {
        com/fitbit/data/bl/i;
        JVM INSTR monitorenter ;
        i j;
        if (c == null)
        {
            c = new i();
        }
        j = c;
        com/fitbit/data/bl/i;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        throw exception;
    }

    public Challenge a(Challenge challenge, Date date)
        throws ServerCommunicationException
    {
        Challenge challenge1;
        date = d.d(challenge.g(), date);
        challenge1 = (new c()).b(date.getJSONObject("challenge"));
        synchronized (h)
        {
            g.remove(challenge);
            g.add(challenge);
            g.add(challenge1);
        }
        return challenge1;
        challenge;
        date;
        JVM INSTR monitorexit ;
        try
        {
            throw challenge;
        }
        // Misplaced declaration of an exception variable
        catch (Challenge challenge)
        {
            throw new JsonException(challenge);
        }
    }

    public Challenge a(String s)
        throws ServerCommunicationException, JSONException
    {
        s = d.w(s);
        return (new c()).b(s.getJSONObject("challenge"));
    }

    public Challenge a(String s, Date date, Set set)
        throws ServerCommunicationException, JSONException
    {
        s = d.a(s, date, set).getJSONObject("challenge");
        return (new c()).b(s);
    }

    public ChallengeMessage a(ChallengeMessage challengemessage)
        throws ServerCommunicationException
    {
        ChallengeMessage challengemessage1 = null;
        try
        {
            JSONObject jsonobject = d.c(challengemessage.b(), challengemessage.c());
            if (!jsonobject.isNull("message"))
            {
                challengemessage1 = (new b(challengemessage.b())).b(jsonobject.getJSONObject("message"));
            }
        }
        // Misplaced declaration of an exception variable
        catch (ChallengeMessage challengemessage)
        {
            throw new JsonException(challengemessage);
        }
        return challengemessage1;
    }

    public List a(String s, int j)
        throws ServerCommunicationException
    {
        Object obj = new ArrayList();
        try
        {
            JSONObject jsonobject = d.b(s, j, 10);
            if (!jsonobject.isNull("messages"))
            {
                obj = l.a(jsonobject.getJSONArray("messages"), new b(s));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JsonException(s);
        }
        return ((List) (obj));
    }

    public void a(String s, Context context)
        throws ServerCommunicationException, JSONException
    {
        d.x(s);
    }

    public void a(String s, ChallengeMessage challengemessage)
        throws ServerCommunicationException
    {
        if (challengemessage == null) goto _L2; else goto _L1
_L1:
        try
        {
            s = d.b(s, challengemessage.g());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JsonException(s);
        }
        if (s == null) goto _L4; else goto _L3
_L3:
        s = s.getJSONObject("message");
_L7:
        if (s == null) goto _L2; else goto _L5
_L5:
        challengemessage.initFromPublicApiJsonObject(s);
_L2:
        return;
_L4:
        s = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(String s, String s1)
        throws ServerCommunicationException, JSONException
    {
        d.a(s, s1);
    }

    public void a(String s, Set set)
        throws ServerCommunicationException, JSONException
    {
        d.a(s, set);
    }

    public void a(String s, boolean flag)
        throws ServerCommunicationException, JSONException
    {
        if (flag)
        {
            d.A(s);
            return;
        } else
        {
            d.B(s);
            return;
        }
    }

    public boolean a(Challenge challenge)
    {
        return !TextUtils.isEmpty(challenge.f());
    }

    public ChallengeType b(String s)
        throws ServerCommunicationException, JSONException
    {
        for (Iterator iterator = f().iterator(); iterator.hasNext();)
        {
            ChallengeType challengetype = (ChallengeType)iterator.next();
            if (TextUtils.equals(s, challengetype.f()))
            {
                return challengetype;
            }
        }

        return null;
    }

    public void b()
        throws ServerCommunicationException, JSONException
    {
        Object obj1;
        com.fitbit.e.a.a("ChallengesBusinessLogic", "loadRemoteChallengesAndTypes", new Object[0]);
        obj1 = d.o();
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!((JSONObject) (obj1)).isNull("challenges"))
        {
            g = l.a(((JSONObject) (obj1)).getJSONArray("challenges"), new c());
            Iterator iterator = g.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Challenge challenge = (Challenge)iterator.next();
                if (challenge.i() == com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.UNKNOWN)
                {
                    iterator.remove();
                    com.fitbit.e.a.e("ChallengesBusinessLogic", "Removing Challenge from list of returned challenges since it seems to be unusable in the current app", new Object[] {
                        challenge.g()
                    });
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_129;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (!((JSONObject) (obj1)).isNull("challengeTypes"))
        {
            f = l.a(((JSONObject) (obj1)).getJSONArray("challengeTypes"), new d());
        }
        obj;
        JVM INSTR monitorexit ;
        z.a(new Intent("com.fitbit.home.ui.ACTION_SIDE_BAR_DATASET_CHANGED"));
        return;
    }

    public void b(Challenge challenge)
        throws ServerCommunicationException, JSONException
    {
        d.y(challenge.g());
    }

    public List c()
    {
        synchronized (h)
        {
            if (f == null)
            {
                f = Collections.emptyList();
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c(Challenge challenge)
        throws ServerCommunicationException, JSONException
    {
        synchronized (h)
        {
            g.remove(challenge);
        }
        d.z(challenge.g());
        return;
        challenge;
        obj;
        JVM INSTR monitorexit ;
        throw challenge;
    }

    public List d()
    {
        synchronized (h)
        {
            if (g == null)
            {
                g = Collections.emptyList();
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int e()
    {
        Iterator iterator = d().iterator();
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Challenge challenge = (Challenge)iterator.next();
            if (challenge.i() == com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED && !ChallengesUtils.e(challenge))
            {
                j++;
            }
        } while (true);
        return j;
    }

    public List f()
        throws ServerCommunicationException, JSONException
    {
        List list = Collections.emptyList();
        JSONObject jsonobject = d.p();
        if (!jsonobject.isNull("challengeTypes"))
        {
            list = l.a(jsonobject.getJSONArray("challengeTypes"), new d());
        }
        return list;
    }

    public void g()
    {
        synchronized (h)
        {
            f = null;
            g = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
