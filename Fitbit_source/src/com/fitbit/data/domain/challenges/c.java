// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import com.fitbit.data.domain.k;
import com.fitbit.data.domain.l;
import com.fitbit.util.format.e;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            a, Challenge, f, b

public class c
    implements k
{

    private a a;

    public c()
    {
        a = new a();
    }

    public Object a(JSONObject jsonobject)
        throws JSONException
    {
        return b(jsonobject);
    }

    public Challenge b(JSONObject jsonobject)
        throws JSONException
    {
        Challenge challenge = new Challenge();
        if (jsonobject.has("id"))
        {
            challenge.f(jsonobject.optString("id"));
        }
        if (jsonobject.has("detail"))
        {
            challenge.d(jsonobject.optString("detail"));
        }
        if (jsonobject.has("minParticipants"))
        {
            challenge.b(Integer.valueOf(jsonobject.optInt("minParticipants")));
        }
        if (jsonobject.has("maxParticipants"))
        {
            challenge.a(Integer.valueOf(jsonobject.optInt("maxParticipants")));
        }
        if (jsonobject.has("status"))
        {
            challenge.a(Challenge.ChallengeStatus.getSafeChallengeStatusFromString(jsonobject.optString("status")));
        }
        if (jsonobject.has("notificationsOn"))
        {
            challenge.a(Boolean.valueOf(jsonobject.optBoolean("notificationsOn")));
        }
        if (jsonobject.has("name"))
        {
            challenge.g(jsonobject.optString("name"));
        }
        if (jsonobject.has("iconUrl"))
        {
            challenge.i(jsonobject.optString("iconUrl"));
        }
        if (jsonobject.has("type"))
        {
            challenge.j(jsonobject.optString("type"));
        }
        if (jsonobject.has("creator"))
        {
            challenge.b(jsonobject.optString("creator"));
        }
        if (jsonobject.has("inviter"))
        {
            challenge.c(jsonobject.optString("inviter"));
        }
        if (jsonobject.has("disclaimer"))
        {
            challenge.k(jsonobject.optString("disclaimer"));
        }
        if (jsonobject.has("intro"))
        {
            challenge.l(jsonobject.optString("intro"));
        }
        if (jsonobject.has("startTime"))
        {
            challenge.c(e.d(jsonobject.getString("startTime")));
        }
        if (jsonobject.has("endTime"))
        {
            challenge.d(e.d(jsonobject.getString("endTime")));
        }
        if (jsonobject.has("syncCutoffTime"))
        {
            challenge.e(e.d(jsonobject.getString("syncCutoffTime")));
        }
        if (jsonobject.has("inviteTime"))
        {
            challenge.a(e.d(jsonobject.getString("inviteTime")));
        }
        if (jsonobject.has("inviteExpirationTime"))
        {
            challenge.f(e.d(jsonobject.getString("inviteExpirationTime")));
        }
        if (jsonobject.has("joinTime"))
        {
            challenge.b(e.d(jsonobject.getString("joinTime")));
        }
        if (jsonobject.has("gameplay"))
        {
            challenge.a(jsonobject.optString("gameplay"));
        }
        Object obj = new ArrayList();
        if (!jsonobject.isNull("participants"))
        {
            f f1 = new f(challenge, ChallengeUser.ChallengeParticipationType.PARTICIPANT);
            l.a(jsonobject.getJSONArray("participants"), f1, ((java.util.List) (obj)));
        }
        if (!jsonobject.isNull("invited"))
        {
            f f2 = new f(challenge, ChallengeUser.ChallengeParticipationType.INVITED);
            l.a(jsonobject.getJSONArray("invited"), f2, ((java.util.List) (obj)));
        }
        if (!jsonobject.isNull("quitters"))
        {
            f f3 = new f(challenge, ChallengeUser.ChallengeParticipationType.QUITTER);
            l.a(jsonobject.getJSONArray("quitters"), f3, ((java.util.List) (obj)));
        }
        if (!jsonobject.isNull("declined"))
        {
            f f4 = new f(challenge, ChallengeUser.ChallengeParticipationType.DECLINED);
            l.a(jsonobject.getJSONArray("declined"), f4, ((java.util.List) (obj)));
        }
        challenge.a(((java.util.List) (obj)));
        obj = new b(challenge.g());
        if (!jsonobject.isNull("recentMessages"))
        {
            challenge.b(l.a(jsonobject.getJSONArray("recentMessages"), ((k) (obj))));
        }
        if (!jsonobject.isNull("achievement"))
        {
            challenge.a(a.b(jsonobject.getJSONObject("achievement")));
        }
        if (!jsonobject.isNull("rematchId"))
        {
            challenge.e(jsonobject.getString("rematchId"));
        }
        return challenge;
    }
}
