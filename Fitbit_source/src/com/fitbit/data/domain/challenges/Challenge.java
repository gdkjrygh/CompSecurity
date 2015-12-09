// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.data.domain.User;
import com.fitbit.data.domain.s;
import com.fitbit.e.a;
import com.fitbit.util.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            ChallengeUser, g, Achievement, ChallengeMessage

public class Challenge
    implements Parcelable
{
    public static final class ChallengeStatus extends Enum
        implements s
    {

        private static final ChallengeStatus $VALUES[];
        public static final ChallengeStatus ACTIVE;
        public static final ChallengeStatus COMPLETE;
        public static final ChallengeStatus INVITED;
        public static final ChallengeStatus UNKNOWN;
        private final String serializableName;

        public static ChallengeStatus getSafeChallengeStatusFromString(String s1)
        {
            ChallengeStatus challengestatus = UNKNOWN;
            try
            {
                s1 = (ChallengeStatus)com.fitbit.util.w.a(s1, com/fitbit/data/domain/challenges/Challenge$ChallengeStatus);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.fitbit.e.a.e("Challenge", com.fitbit.e.a.a(s1), new Object[0]);
                return challengestatus;
            }
            return s1;
        }

        public static ChallengeStatus valueOf(String s1)
        {
            return (ChallengeStatus)Enum.valueOf(com/fitbit/data/domain/challenges/Challenge$ChallengeStatus, s1);
        }

        public static ChallengeStatus[] values()
        {
            return (ChallengeStatus[])$VALUES.clone();
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        static 
        {
            ACTIVE = new ChallengeStatus("ACTIVE", 0, "ACTIVE");
            INVITED = new ChallengeStatus("INVITED", 1, "INVITED");
            COMPLETE = new ChallengeStatus("COMPLETE", 2, "COMPLETE");
            UNKNOWN = new ChallengeStatus("UNKNOWN", 3, "UNKNOWN");
            $VALUES = (new ChallengeStatus[] {
                ACTIVE, INVITED, COMPLETE, UNKNOWN
            });
        }

        private ChallengeStatus(String s1, int i1, String s2)
        {
            super(s1, i1);
            serializableName = s2;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Challenge a(Parcel parcel)
        {
            Challenge challenge = new Challenge();
            com.fitbit.data.domain.challenges.Challenge.a(challenge, parcel.readString());
            Challenge.b(challenge, parcel.readString());
            com.fitbit.data.domain.challenges.Challenge.a(challenge, (ChallengeStatus)com.fitbit.data.domain.challenges.g.a(parcel, com/fitbit/data/domain/challenges/Challenge$ChallengeStatus));
            com.fitbit.data.domain.challenges.Challenge.a(challenge, com.fitbit.data.domain.challenges.g.c(parcel));
            com.fitbit.data.domain.challenges.Challenge.a(challenge, parcel.createTypedArrayList(ChallengeUser.CREATOR));
            Challenge.b(challenge, parcel.createTypedArrayList(ChallengeMessage.CREATOR));
            com.fitbit.data.domain.challenges.Challenge.a(challenge, com.fitbit.data.domain.challenges.g.b(parcel));
            Challenge.b(challenge, com.fitbit.data.domain.challenges.g.b(parcel));
            Challenge.c(challenge, parcel.readString());
            Challenge.d(challenge, parcel.readString());
            Challenge.e(challenge, parcel.readString());
            Challenge.f(challenge, parcel.readString());
            Challenge.g(challenge, parcel.readString());
            Challenge.h(challenge, parcel.readString());
            Challenge.i(challenge, parcel.readString());
            Challenge.j(challenge, parcel.readString());
            Challenge.k(challenge, parcel.readString());
            com.fitbit.data.domain.challenges.Challenge.a(challenge, com.fitbit.data.domain.challenges.g.a(parcel));
            Challenge.b(challenge, com.fitbit.data.domain.challenges.g.a(parcel));
            Challenge.c(challenge, com.fitbit.data.domain.challenges.g.a(parcel));
            Challenge.d(challenge, com.fitbit.data.domain.challenges.g.a(parcel));
            Challenge.e(challenge, com.fitbit.data.domain.challenges.g.a(parcel));
            Challenge.f(challenge, com.fitbit.data.domain.challenges.g.a(parcel));
            Challenge.g(challenge, com.fitbit.data.domain.challenges.g.a(parcel));
            com.fitbit.data.domain.challenges.Challenge.a(challenge, (Achievement)parcel.readParcelable(com/fitbit/data/domain/challenges/Achievement.getClassLoader()));
            String as[] = parcel.createStringArray();
            parcel = parcel.createStringArray();
            int i1 = 0;
            for (int j1 = as.length; i1 < j1; i1++)
            {
                com.fitbit.data.domain.challenges.Challenge.a(challenge).put(as[i1], parcel[i1]);
            }

            return challenge;
        }

        public Challenge[] a(int i1)
        {
            return new Challenge[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    private static final String a = "Challenge";
    private Achievement A;
    private final Map B = new HashMap();
    private String b;
    private ChallengeStatus c;
    private Boolean d;
    private List e;
    private List f;
    private Integer g;
    private Integer h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private Date t;
    private Date u;
    private Date v;
    private Date w;
    private Date x;
    private Date y;
    private Date z;

    public Challenge()
    {
    }

    private void J()
    {
        B.clear();
        ChallengeUser challengeuser;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); B.put(challengeuser.f(), challengeuser.g().G()))
        {
            challengeuser = (ChallengeUser)iterator.next();
        }

    }

    static Achievement a(Challenge challenge, Achievement achievement)
    {
        challenge.A = achievement;
        return achievement;
    }

    static ChallengeStatus a(Challenge challenge, ChallengeStatus challengestatus)
    {
        challenge.c = challengestatus;
        return challengestatus;
    }

    static Boolean a(Challenge challenge, Boolean boolean1)
    {
        challenge.d = boolean1;
        return boolean1;
    }

    static Integer a(Challenge challenge, Integer integer)
    {
        challenge.g = integer;
        return integer;
    }

    static String a(Challenge challenge, String s1)
    {
        challenge.j = s1;
        return s1;
    }

    static Date a(Challenge challenge, Date date)
    {
        challenge.t = date;
        return date;
    }

    static List a(Challenge challenge, List list)
    {
        challenge.e = list;
        return list;
    }

    private List a(ChallengeUser.ChallengeParticipationType challengeparticipationtype)
    {
        ArrayList arraylist = new ArrayList();
        if (e != null)
        {
            Iterator iterator = e.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ChallengeUser challengeuser = (ChallengeUser)iterator.next();
                if (challengeuser.d() == challengeparticipationtype)
                {
                    arraylist.add(challengeuser);
                }
            } while (true);
        }
        return arraylist;
    }

    static Map a(Challenge challenge)
    {
        return challenge.B;
    }

    static Integer b(Challenge challenge, Integer integer)
    {
        challenge.h = integer;
        return integer;
    }

    static String b(Challenge challenge, String s1)
    {
        challenge.b = s1;
        return s1;
    }

    static Date b(Challenge challenge, Date date)
    {
        challenge.u = date;
        return date;
    }

    static List b(Challenge challenge, List list)
    {
        challenge.f = list;
        return list;
    }

    private List b(ChallengeUser.ChallengeParticipationType challengeparticipationtype)
    {
        ArrayList arraylist = new ArrayList();
        if (e != null)
        {
            Iterator iterator = e.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ChallengeUser challengeuser = (ChallengeUser)iterator.next();
                if (challengeuser.d() == challengeparticipationtype)
                {
                    arraylist.add(challengeuser.f());
                }
            } while (true);
        }
        return arraylist;
    }

    static String c(Challenge challenge, String s1)
    {
        challenge.k = s1;
        return s1;
    }

    private String c(ChallengeUser.ChallengeParticipationType challengeparticipationtype)
    {
        Iterator iterator = a(challengeparticipationtype).iterator();
        String s1;
        ChallengeUser challengeuser;
        for (s1 = ""; iterator.hasNext(); s1 = (new StringBuilder()).append(s1).append(challengeuser.g().P()).append("(").append(challengeuser.g().F()).append("),").toString())
        {
            challengeuser = (ChallengeUser)iterator.next();
        }

        return (new StringBuilder()).append(challengeparticipationtype.getSerializableName()).append(" = [").append(s1).append("]").toString();
    }

    static Date c(Challenge challenge, Date date)
    {
        challenge.v = date;
        return date;
    }

    static String d(Challenge challenge, String s1)
    {
        challenge.l = s1;
        return s1;
    }

    static Date d(Challenge challenge, Date date)
    {
        challenge.w = date;
        return date;
    }

    static String e(Challenge challenge, String s1)
    {
        challenge.m = s1;
        return s1;
    }

    static Date e(Challenge challenge, Date date)
    {
        challenge.x = date;
        return date;
    }

    static String f(Challenge challenge, String s1)
    {
        challenge.n = s1;
        return s1;
    }

    static Date f(Challenge challenge, Date date)
    {
        challenge.y = date;
        return date;
    }

    static String g(Challenge challenge, String s1)
    {
        challenge.o = s1;
        return s1;
    }

    static Date g(Challenge challenge, Date date)
    {
        challenge.z = date;
        return date;
    }

    static String h(Challenge challenge, String s1)
    {
        challenge.p = s1;
        return s1;
    }

    static String i(Challenge challenge, String s1)
    {
        challenge.q = s1;
        return s1;
    }

    static String j(Challenge challenge, String s1)
    {
        challenge.r = s1;
        return s1;
    }

    static String k(Challenge challenge, String s1)
    {
        challenge.s = s1;
        return s1;
    }

    public Date A()
    {
        return y;
    }

    public Date B()
    {
        return t;
    }

    public Date C()
    {
        return u;
    }

    public Date D()
    {
        return v;
    }

    public Date E()
    {
        return x;
    }

    public Date F()
    {
        return z;
    }

    public String G()
    {
        return i;
    }

    public List H()
    {
        return f;
    }

    public ChallengeUser I()
    {
        return h(p);
    }

    public Achievement a()
    {
        return A;
    }

    public void a(Achievement achievement)
    {
        A = achievement;
    }

    public void a(ChallengeStatus challengestatus)
    {
        c = challengestatus;
    }

    public void a(Boolean boolean1)
    {
        d = boolean1;
    }

    public void a(Integer integer)
    {
        g = integer;
    }

    public void a(String s1)
    {
        s = s1;
    }

    public void a(Date date)
    {
        w = date;
    }

    public void a(List list)
    {
        e = list;
        J();
    }

    public String b()
    {
        return s;
    }

    public void b(Integer integer)
    {
        h = integer;
    }

    public void b(String s1)
    {
        o = s1;
    }

    public void b(Date date)
    {
        y = date;
    }

    public void b(List list)
    {
        f = list;
    }

    public String c()
    {
        return o;
    }

    public void c(String s1)
    {
        p = s1;
    }

    public void c(Date date)
    {
        t = date;
    }

    public String d()
    {
        return p;
    }

    public void d(String s1)
    {
        k = s1;
    }

    public void d(Date date)
    {
        u = date;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return k;
    }

    public void e(String s1)
    {
        b = s1;
    }

    public void e(Date date)
    {
        v = date;
    }

    public String f()
    {
        return b;
    }

    public void f(String s1)
    {
        j = s1;
    }

    public void f(Date date)
    {
        x = date;
    }

    public String g()
    {
        return j;
    }

    public void g(String s1)
    {
        l = s1;
    }

    public void g(Date date)
    {
        z = date;
    }

    public ChallengeUser h(String s1)
    {
label0:
        {
            if (e == null || s1 == null)
            {
                break label0;
            }
            Iterator iterator = e.iterator();
            ChallengeUser challengeuser;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                challengeuser = (ChallengeUser)iterator.next();
            } while (!s1.equals(challengeuser.f()));
            return challengeuser;
        }
        return null;
    }

    public String h()
    {
        return l;
    }

    public ChallengeStatus i()
    {
        return c;
    }

    public void i(String s1)
    {
        m = s1;
    }

    public Boolean j()
    {
        return d;
    }

    public void j(String s1)
    {
        n = s1;
    }

    public List k()
    {
        return a(ChallengeUser.ChallengeParticipationType.QUITTER);
    }

    public void k(String s1)
    {
        q = s1;
    }

    public List l()
    {
        return a(ChallengeUser.ChallengeParticipationType.PARTICIPANT);
    }

    public void l(String s1)
    {
        r = s1;
    }

    public List m()
    {
        return a(ChallengeUser.ChallengeParticipationType.INVITED);
    }

    public void m(String s1)
    {
        i = s1;
    }

    public String n(String s1)
    {
        return (String)B.get(s1);
    }

    public List n()
    {
        return a(ChallengeUser.ChallengeParticipationType.DECLINED);
    }

    public List o()
    {
        return b(ChallengeUser.ChallengeParticipationType.QUITTER);
    }

    public List p()
    {
        return b(ChallengeUser.ChallengeParticipationType.PARTICIPANT);
    }

    public List q()
    {
        return b(ChallengeUser.ChallengeParticipationType.INVITED);
    }

    public List r()
    {
        return b(ChallengeUser.ChallengeParticipationType.DECLINED);
    }

    public List s()
    {
        return e;
    }

    public Integer t()
    {
        return g;
    }

    public String toString()
    {
        return (new StringBuilder()).append("id:").append(G()).append("\n\n").append("challengeId:").append(j).append("\n\n").append("status:").append(c).append("\n\n").append("notificationsOn:").append(d).append("\n\n").append("detail:").append(k).append("\n\n").append("minParticipants:").append(h).append("\n\n").append("maxParticipants:").append(g).append("\n\n").append("challengeStatus:").append(c).append("\n\n").append("name:").append(l).append("\n\n").append("type:").append(n).append("\n\n").append("creator:").append(o).append("\n\n").append("inviter:").append(p).append("\n\n").append("disclaimer:").append(q).append("\n\n").append("intro:").append(r).append("\n\n").append("startTime:").append(t).append("\n\n").append("endTime:").append(u).append("\n\n").append("syncCutoffTime:").append(v).append("\n\n").append("inviteExpirationTime:").append(x).append("\n\n").append("inviteTime:").append(w).append("\n\n").append("joinTime:").append(y).append("\n\n").append(c(ChallengeUser.ChallengeParticipationType.INVITED)).append("\n\n").append(c(ChallengeUser.ChallengeParticipationType.DECLINED)).append("\n\n").append(c(ChallengeUser.ChallengeParticipationType.PARTICIPANT)).append("\n\n").append(c(ChallengeUser.ChallengeParticipationType.QUITTER)).append("\n\n").append("messages:").append(f).append("\n\n").toString();
    }

    public Integer u()
    {
        return h;
    }

    public String v()
    {
        return m;
    }

    public String w()
    {
        return n;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(j);
        parcel.writeString(b);
        com.fitbit.data.domain.challenges.g.a(parcel, c);
        com.fitbit.data.domain.challenges.g.a(parcel, d);
        parcel.writeTypedList(e);
        parcel.writeTypedList(f);
        com.fitbit.data.domain.challenges.g.a(parcel, g);
        com.fitbit.data.domain.challenges.g.a(parcel, h);
        parcel.writeString(k);
        parcel.writeString(l);
        parcel.writeString(m);
        parcel.writeString(n);
        parcel.writeString(o);
        parcel.writeString(p);
        parcel.writeString(q);
        parcel.writeString(r);
        parcel.writeString(s);
        com.fitbit.data.domain.challenges.g.a(parcel, t);
        com.fitbit.data.domain.challenges.g.a(parcel, u);
        com.fitbit.data.domain.challenges.g.a(parcel, v);
        com.fitbit.data.domain.challenges.g.a(parcel, w);
        com.fitbit.data.domain.challenges.g.a(parcel, x);
        com.fitbit.data.domain.challenges.g.a(parcel, y);
        com.fitbit.data.domain.challenges.g.a(parcel, z);
        parcel.writeParcelable(A, i1);
        parcel.writeStringArray((String[])B.keySet().toArray(new String[B.size()]));
        parcel.writeStringArray((String[])B.values().toArray(new String[B.size()]));
    }

    public String x()
    {
        return q;
    }

    public String y()
    {
        return r;
    }

    public Date z()
    {
        return w;
    }

}
