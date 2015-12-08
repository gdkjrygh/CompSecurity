// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.d.b;
import com.fitbit.data.domain.s;
import com.fitbit.e.a;
import com.fitbit.util.format.e;
import com.fitbit.util.w;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            g

public class ChallengeMessage
    implements Parcelable, b
{
    public static final class ChallengeMessageType extends Enum
        implements s
    {

        private static final ChallengeMessageType $VALUES[];
        public static final ChallengeMessageType CONTRIBUTE;
        public static final ChallengeMessageType DAILY_GOAL_PROGRESS;
        public static final ChallengeMessageType DAILY_GOAL_PROGRESS_ACHIEVED;
        public static final ChallengeMessageType DAILY_GOAL_PROGRESS_ALERT;
        public static final ChallengeMessageType DAILY_GOAL_STREAK;
        public static final ChallengeMessageType EARN;
        public static final ChallengeMessageType END;
        public static final ChallengeMessageType END_SOON_ALERT;
        public static final ChallengeMessageType EPIC_DAY;
        public static final ChallengeMessageType FINAL_RESULTS;
        public static final ChallengeMessageType INVITE;
        public static final ChallengeMessageType JOIN;
        public static final ChallengeMessageType LEAVE;
        public static final ChallengeMessageType NO_WINNERS;
        public static final ChallengeMessageType PASS;
        public static final ChallengeMessageType QUIT;
        public static final ChallengeMessageType REMATCH;
        public static final ChallengeMessageType START_ALERT;
        public static final ChallengeMessageType TALK;
        public static final ChallengeMessageType UNKNOWN;
        private final String serializableName;

        public static ChallengeMessageType getSafeChallengeStatusFromString(String s1)
        {
            ChallengeMessageType challengemessagetype = UNKNOWN;
            try
            {
                s1 = (ChallengeMessageType)w.a(s1, com/fitbit/data/domain/challenges/ChallengeMessage$ChallengeMessageType);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.fitbit.e.a.e("ChallengeMessage", com.fitbit.e.a.a(s1), new Object[0]);
                return challengemessagetype;
            }
            return s1;
        }

        public static ChallengeMessageType valueOf(String s1)
        {
            return (ChallengeMessageType)Enum.valueOf(com/fitbit/data/domain/challenges/ChallengeMessage$ChallengeMessageType, s1);
        }

        public static ChallengeMessageType[] values()
        {
            return (ChallengeMessageType[])$VALUES.clone();
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        static 
        {
            QUIT = new ChallengeMessageType("QUIT", 0, "QUIT");
            FINAL_RESULTS = new ChallengeMessageType("FINAL_RESULTS", 1, "FINAL_RESULTS");
            TALK = new ChallengeMessageType("TALK", 2, "TALK");
            INVITE = new ChallengeMessageType("INVITE", 3, "INVITE");
            JOIN = new ChallengeMessageType("JOIN", 4, "JOIN");
            LEAVE = new ChallengeMessageType("LEAVE", 5, "LEAVE");
            START_ALERT = new ChallengeMessageType("START_ALERT", 6, "START_ALERT");
            END_SOON_ALERT = new ChallengeMessageType("END_SOON_ALERT", 7, "END_SOON_ALERT");
            END = new ChallengeMessageType("END", 8, "END");
            PASS = new ChallengeMessageType("PASS", 9, "PASS");
            EARN = new ChallengeMessageType("EARN", 10, "EARN");
            EPIC_DAY = new ChallengeMessageType("EPIC_DAY", 11, "EPIC_DAY");
            CONTRIBUTE = new ChallengeMessageType("CONTRIBUTE", 12, "CONTRIBUTE");
            DAILY_GOAL_PROGRESS = new ChallengeMessageType("DAILY_GOAL_PROGRESS", 13, "DAILY_GOAL_PROGRESS");
            DAILY_GOAL_PROGRESS_ACHIEVED = new ChallengeMessageType("DAILY_GOAL_PROGRESS_ACHIEVED", 14, "DAILY_GOAL_PROGRESS_ACHIEVED");
            DAILY_GOAL_PROGRESS_ALERT = new ChallengeMessageType("DAILY_GOAL_PROGRESS_ALERT", 15, "DAILY_GOAL_PROGRESS_ALERT");
            DAILY_GOAL_STREAK = new ChallengeMessageType("DAILY_GOAL_STREAK", 16, "DAILY_GOAL_STREAK");
            NO_WINNERS = new ChallengeMessageType("NO_WINNERS", 17, "NO_WINNERS");
            REMATCH = new ChallengeMessageType("REMATCH", 18, "REMATCH");
            UNKNOWN = new ChallengeMessageType("UNKNOWN", 19, "UNKNOWN");
            $VALUES = (new ChallengeMessageType[] {
                QUIT, FINAL_RESULTS, TALK, INVITE, JOIN, LEAVE, START_ALERT, END_SOON_ALERT, END, PASS, 
                EARN, EPIC_DAY, CONTRIBUTE, DAILY_GOAL_PROGRESS, DAILY_GOAL_PROGRESS_ACHIEVED, DAILY_GOAL_PROGRESS_ALERT, DAILY_GOAL_STREAK, NO_WINNERS, REMATCH, UNKNOWN
            });
        }

        private ChallengeMessageType(String s1, int i1, String s2)
        {
            super(s1, i1);
            serializableName = s2;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final String a = "ChallengeMessage";
    private String b;
    private String c;
    private String d;
    private Date e;
    private ChallengeMessageType f;
    private String g;
    private List h;
    private boolean i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private String p;

    public ChallengeMessage()
    {
    }

    static ChallengeMessageType a(ChallengeMessage challengemessage, ChallengeMessageType challengemessagetype)
    {
        challengemessage.f = challengemessagetype;
        return challengemessagetype;
    }

    static String a(ChallengeMessage challengemessage, String s)
    {
        challengemessage.b = s;
        return s;
    }

    static Date a(ChallengeMessage challengemessage, Date date)
    {
        challengemessage.e = date;
        return date;
    }

    static List a(ChallengeMessage challengemessage, List list)
    {
        challengemessage.h = list;
        return list;
    }

    static boolean a(ChallengeMessage challengemessage, boolean flag)
    {
        challengemessage.i = flag;
        return flag;
    }

    static String b(ChallengeMessage challengemessage, String s)
    {
        challengemessage.c = s;
        return s;
    }

    static boolean b(ChallengeMessage challengemessage, boolean flag)
    {
        challengemessage.o = flag;
        return flag;
    }

    static String c(ChallengeMessage challengemessage, String s)
    {
        challengemessage.d = s;
        return s;
    }

    static String d(ChallengeMessage challengemessage, String s)
    {
        challengemessage.g = s;
        return s;
    }

    static String e(ChallengeMessage challengemessage, String s)
    {
        challengemessage.j = s;
        return s;
    }

    static String f(ChallengeMessage challengemessage, String s)
    {
        challengemessage.k = s;
        return s;
    }

    static String g(ChallengeMessage challengemessage, String s)
    {
        challengemessage.l = s;
        return s;
    }

    static String h(ChallengeMessage challengemessage, String s)
    {
        challengemessage.m = s;
        return s;
    }

    static String i(ChallengeMessage challengemessage, String s)
    {
        challengemessage.n = s;
        return s;
    }

    static String j(ChallengeMessage challengemessage, String s)
    {
        challengemessage.p = s;
        return s;
    }

    public void a(ChallengeMessageType challengemessagetype)
    {
        f = challengemessagetype;
    }

    public void a(String s)
    {
        b = s;
    }

    public void a(Date date)
    {
        e = date;
    }

    public void a(List list)
    {
        h = list;
    }

    public void a(boolean flag)
    {
        o = flag;
    }

    public boolean a()
    {
        return o;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        c = s;
    }

    public void b(boolean flag)
    {
        i = flag;
    }

    public String c()
    {
        return c;
    }

    public void c(String s)
    {
        d = s;
    }

    public String d()
    {
        return d;
    }

    public void d(String s)
    {
        g = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public Date e()
    {
        return e;
    }

    public void e(String s)
    {
        j = s;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (ChallengeMessage)obj;
        if (!b.equals(((ChallengeMessage) (obj)).b))
        {
            return false;
        }
        if (c == null) goto _L4; else goto _L3
_L3:
        if (c.equals(((ChallengeMessage) (obj)).c)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((ChallengeMessage) (obj)).c == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public ChallengeMessageType f()
    {
        return f;
    }

    public void f(String s)
    {
        k = s;
    }

    public String g()
    {
        return g;
    }

    public void g(String s)
    {
        l = s;
    }

    public List h()
    {
        return h;
    }

    public void h(String s)
    {
        m = s;
    }

    public int hashCode()
    {
        return b.hashCode() * 31 + c.hashCode();
    }

    public void i(String s)
    {
        n = s;
    }

    public boolean i()
    {
        return i;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        b(jsonobject.optString("encodedId"));
        if (jsonobject.has("senderEncodedId"))
        {
            c(jsonobject.getString("senderEncodedId"));
        }
        if (jsonobject.has("userEncodedId"))
        {
            e(jsonobject.getString("userEncodedId"));
        }
        a(ChallengeMessageType.getSafeChallengeStatusFromString(jsonobject.optString("type")));
        if (jsonobject.has("sentTime"))
        {
            a(com.fitbit.util.format.e.g(jsonobject.getString("sentTime")));
        }
        d(jsonobject.optString("body"));
        b(jsonobject.optBoolean("cheerable"));
        if (jsonobject.has("passingUserEncodedId"))
        {
            f(jsonobject.getString("passingUserEncodedId"));
        }
        if (jsonobject.has("passedUserEncodedId"))
        {
            g(jsonobject.getString("passedUserEncodedId"));
        }
        if (jsonobject.has("delta"))
        {
            h(jsonobject.getString("delta"));
        }
        JSONArray jsonarray = jsonobject.getJSONArray("cheers");
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < jsonarray.length(); i1++)
        {
            arraylist.add(jsonarray.getString(i1));
        }

        a(arraylist);
        if (jsonobject.has("imageUrl"))
        {
            i(jsonobject.getString("imageUrl"));
        }
        if (jsonobject.has("trigger"))
        {
            a(jsonobject.getBoolean("trigger"));
        }
        if (jsonobject.has("badgeEncodedId"))
        {
            j(jsonobject.getString("badgeEncodedId"));
        }
    }

    public String j()
    {
        return j;
    }

    public void j(String s)
    {
        p = s;
    }

    public String k()
    {
        return k;
    }

    public String l()
    {
        return l;
    }

    public String m()
    {
        return m;
    }

    public String n()
    {
        return n;
    }

    public String o()
    {
        return p;
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new IllegalStateException("ToJSON method not supposed to be called.");
    }

    public String toString()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        com.fitbit.data.domain.challenges.g.a(parcel, e);
        com.fitbit.data.domain.challenges.g.a(parcel, f);
        parcel.writeString(g);
        parcel.writeStringList(h);
        com.fitbit.data.domain.challenges.g.a(parcel, Boolean.valueOf(i));
        parcel.writeString(j);
        parcel.writeString(k);
        parcel.writeString(l);
        parcel.writeString(m);
        parcel.writeString(n);
        com.fitbit.data.domain.challenges.g.a(parcel, Boolean.valueOf(o));
        parcel.writeString(p);
    }


    /* member class not found */
    class _cls1 {}

}
