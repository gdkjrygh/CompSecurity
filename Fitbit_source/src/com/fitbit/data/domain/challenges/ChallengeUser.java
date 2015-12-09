// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.d.b;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.User;
import com.fitbit.data.domain.s;
import com.fitbit.util.format.e;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            ChallengeUserParticipantStatus, ChallengeUserRank, g

public class ChallengeUser
    implements Parcelable, b
{
    public static final class ChallengeParticipationType extends Enum
        implements s
    {

        private static final ChallengeParticipationType $VALUES[];
        public static final ChallengeParticipationType DECLINED;
        public static final ChallengeParticipationType INVITED;
        public static final ChallengeParticipationType PARTICIPANT;
        public static final ChallengeParticipationType QUITTER;
        private final String serializableName;

        public static ChallengeParticipationType valueOf(String s1)
        {
            return (ChallengeParticipationType)Enum.valueOf(com/fitbit/data/domain/challenges/ChallengeUser$ChallengeParticipationType, s1);
        }

        public static ChallengeParticipationType[] values()
        {
            return (ChallengeParticipationType[])$VALUES.clone();
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        static 
        {
            PARTICIPANT = new ChallengeParticipationType("PARTICIPANT", 0, "PARTICIPANT");
            INVITED = new ChallengeParticipationType("INVITED", 1, "INVITED");
            QUITTER = new ChallengeParticipationType("QUITTER", 2, "QUITTER");
            DECLINED = new ChallengeParticipationType("DECLINED", 3, "DECLINED");
            $VALUES = (new ChallengeParticipationType[] {
                PARTICIPANT, INVITED, QUITTER, DECLINED
            });
        }

        private ChallengeParticipationType(String s1, int l, String s2)
        {
            super(s1, l);
            serializableName = s2;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String a;
    private String b;
    private String c;
    private String d;
    private Date e;
    private Date f;
    private Date g;
    private ChallengeParticipationType h;
    private ChallengeUserRank i;
    private ChallengeUserParticipantStatus j;
    private boolean k;

    public ChallengeUser()
    {
    }

    static ChallengeParticipationType a(ChallengeUser challengeuser, ChallengeParticipationType challengeparticipationtype)
    {
        challengeuser.h = challengeparticipationtype;
        return challengeparticipationtype;
    }

    static ChallengeUserParticipantStatus a(ChallengeUser challengeuser, ChallengeUserParticipantStatus challengeuserparticipantstatus)
    {
        challengeuser.j = challengeuserparticipantstatus;
        return challengeuserparticipantstatus;
    }

    static ChallengeUserRank a(ChallengeUser challengeuser, ChallengeUserRank challengeuserrank)
    {
        challengeuser.i = challengeuserrank;
        return challengeuserrank;
    }

    static String a(ChallengeUser challengeuser, String s)
    {
        challengeuser.a = s;
        return s;
    }

    static Date a(ChallengeUser challengeuser, Date date)
    {
        challengeuser.e = date;
        return date;
    }

    static boolean a(ChallengeUser challengeuser, boolean flag)
    {
        challengeuser.k = flag;
        return flag;
    }

    static String b(ChallengeUser challengeuser, String s)
    {
        challengeuser.b = s;
        return s;
    }

    static Date b(ChallengeUser challengeuser, Date date)
    {
        challengeuser.f = date;
        return date;
    }

    static String c(ChallengeUser challengeuser, String s)
    {
        challengeuser.c = s;
        return s;
    }

    static Date c(ChallengeUser challengeuser, Date date)
    {
        challengeuser.g = date;
        return date;
    }

    static String d(ChallengeUser challengeuser, String s)
    {
        challengeuser.d = s;
        return s;
    }

    public Date a()
    {
        return e;
    }

    public void a(ChallengeParticipationType challengeparticipationtype)
    {
        h = challengeparticipationtype;
    }

    public void a(ChallengeUserParticipantStatus challengeuserparticipantstatus)
    {
        j = challengeuserparticipantstatus;
    }

    public void a(ChallengeUserRank challengeuserrank)
    {
        i = challengeuserrank;
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(Date date)
    {
        e = date;
    }

    public void a(boolean flag)
    {
        k = flag;
    }

    public boolean a(Profile profile)
    {
        return profile != null && profile.F().equals(f());
    }

    public Date b()
    {
        return f;
    }

    public void b(String s)
    {
        b = s;
    }

    public void b(Date date)
    {
        f = date;
    }

    public Date c()
    {
        return g;
    }

    public void c(String s)
    {
        c = s;
    }

    public void c(Date date)
    {
        g = date;
    }

    public ChallengeParticipationType d()
    {
        return h;
    }

    public void d(String s)
    {
        d = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return c;
    }

    public boolean e(String s)
    {
        return s != null && s.equals(f());
    }

    public String f()
    {
        return d;
    }

    public User g()
    {
        User user = new User();
        user.f(d);
        user.g(a);
        user.k(b);
        return user;
    }

    public boolean h()
    {
        return a(an.a().b());
    }

    public ChallengeUserRank i()
    {
        return i;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        String s = null;
        if (jsonobject.has("lastUpdatedTime"))
        {
            a(com.fitbit.util.format.e.d(jsonobject.getString("lastUpdatedTime")));
        }
        if (jsonobject.has("join"))
        {
            b(com.fitbit.util.format.e.d(jsonobject.getString("join")));
        }
        if (jsonobject.has("completed"))
        {
            c(com.fitbit.util.format.e.d(jsonobject.getString("completed")));
        }
        a(jsonobject.optBoolean("isPushNotificationsEnabled"));
        String s1 = jsonobject.optString("encodedId");
        JSONObject jsonobject1 = jsonobject.optJSONObject("user");
        Object obj1;
        if (jsonobject1 != null)
        {
            Object obj;
            int ai[];
            int l;
            if (jsonobject1.has("avatar"))
            {
                obj = jsonobject1.optString("avatar");
            } else
            {
                obj = null;
            }
            obj1 = obj;
            if (jsonobject1.has("displayName"))
            {
                s = jsonobject1.optString("displayName");
                obj1 = obj;
            }
        } else
        {
            obj1 = null;
        }
        d(s1);
        a(((String) (obj1)));
        b(s);
        obj = new ChallengeUserParticipantStatus();
        obj1 = jsonobject.optJSONObject("participantStatus");
        if (obj1 != null)
        {
            ((ChallengeUserParticipantStatus) (obj)).a(((JSONObject) (obj1)).optBoolean("succeeded"));
            ((ChallengeUserParticipantStatus) (obj)).a(((JSONObject) (obj1)).getInt("activeDayIndex"));
            ((ChallengeUserParticipantStatus) (obj)).c(((JSONObject) (obj1)).getInt("dailyObjectiveCompletionCount"));
            ((ChallengeUserParticipantStatus) (obj)).b(((JSONObject) (obj1)).getInt("dailyTarget"));
            obj1 = ((JSONObject) (obj1)).getJSONArray("dailySummary");
            ai = new int[((JSONArray) (obj1)).length()];
            for (l = 0; l < ((JSONArray) (obj1)).length(); l++)
            {
                ai[l] = ((JSONArray) (obj1)).getInt(l);
            }

            ((ChallengeUserParticipantStatus) (obj)).a(ai);
        }
        a(((ChallengeUserParticipantStatus) (obj)));
        obj = new ChallengeUserRank();
        jsonobject = jsonobject.optJSONObject("rank");
        if (jsonobject != null)
        {
            ((ChallengeUserRank) (obj)).a(jsonobject.optString("datatype"));
            ((ChallengeUserRank) (obj)).a(jsonobject.optInt("rank"));
            ((ChallengeUserRank) (obj)).b(jsonobject.optInt("value"));
        }
        a(((ChallengeUserRank) (obj)));
    }

    public ChallengeUserParticipantStatus j()
    {
        return j;
    }

    public boolean k()
    {
        return k;
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new IllegalStateException("ToJSON method not supposed to be called.");
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        com.fitbit.data.domain.challenges.g.a(parcel, e);
        com.fitbit.data.domain.challenges.g.a(parcel, f);
        com.fitbit.data.domain.challenges.g.a(parcel, g);
        com.fitbit.data.domain.challenges.g.a(parcel, h);
        parcel.writeParcelable(i, l);
        parcel.writeParcelable(j, l);
        com.fitbit.data.domain.challenges.g.a(parcel, Boolean.valueOf(k));
    }


    /* member class not found */
    class _cls1 {}

}
