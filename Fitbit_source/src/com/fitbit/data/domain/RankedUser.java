// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import java.io.Serializable;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            User

public class RankedUser extends User
    implements Serializable
{
    public static final class ActiveState extends Enum
    {

        private static final ActiveState $VALUES[];
        public static final ActiveState ACTIVE;
        public static final ActiveState INACTIVE;
        public static final ActiveState UNKNOWN;

        public static ActiveState valueOf(String s1)
        {
            return (ActiveState)Enum.valueOf(com/fitbit/data/domain/RankedUser$ActiveState, s1);
        }

        public static ActiveState[] values()
        {
            return (ActiveState[])$VALUES.clone();
        }

        static 
        {
            ACTIVE = new ActiveState("ACTIVE", 0);
            INACTIVE = new ActiveState("INACTIVE", 1);
            UNKNOWN = new ActiveState("UNKNOWN", 2);
            $VALUES = (new ActiveState[] {
                ACTIVE, INACTIVE, UNKNOWN
            });
        }

        private ActiveState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class Relation extends Enum
    {

        private static final Relation $VALUES[];
        public static final Relation FRIEND;
        public static final Relation REQUEST_RECEIVE;
        public static final Relation REQUEST_SENT;
        public static final Relation STRANGER;

        public static Relation valueOf(String s1)
        {
            return (Relation)Enum.valueOf(com/fitbit/data/domain/RankedUser$Relation, s1);
        }

        public static Relation[] values()
        {
            return (Relation[])$VALUES.clone();
        }

        static 
        {
            STRANGER = new Relation("STRANGER", 0);
            REQUEST_SENT = new Relation("REQUEST_SENT", 1);
            REQUEST_RECEIVE = new Relation("REQUEST_RECEIVE", 2);
            FRIEND = new Relation("FRIEND", 3);
            $VALUES = (new Relation[] {
                STRANGER, REQUEST_SENT, REQUEST_RECEIVE, FRIEND
            });
        }

        private Relation(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private ActiveState active;
    private Boolean areFriendshipsPublic;
    private boolean challengesBeta;
    private long contactId;
    private String email;
    private Date inviteDate;
    private long inviteId;
    private boolean isFromContactBook;
    private boolean isFromFacebook;
    private Date joinedDate;
    private boolean newInvite;
    private Relation oldRelation;
    private String postal;
    private Relation relation;
    private String state;
    private long stepsAverage;
    private long stepsSummary;

    public RankedUser()
    {
        active = ActiveState.UNKNOWN;
    }

    public long a()
    {
        return stepsSummary;
    }

    public void a(long l1)
    {
        stepsSummary = l1;
    }

    public void a(ActiveState activestate)
    {
        active = activestate;
    }

    public void a(Relation relation1)
    {
        relation = relation1;
    }

    public void a(Boolean boolean1)
    {
        areFriendshipsPublic = boolean1;
    }

    public void a(String s1)
    {
        state = s1;
    }

    public void a(Date date)
    {
        joinedDate = date;
    }

    public void a(boolean flag)
    {
        newInvite = flag;
    }

    public long b()
    {
        return stepsAverage;
    }

    public void b(long l1)
    {
        stepsAverage = l1;
    }

    public void b(Relation relation1)
    {
        oldRelation = relation1;
    }

    public void b(String s1)
    {
        email = s1;
    }

    public void b(Date date)
    {
        inviteDate = date;
    }

    public void b(boolean flag)
    {
        isFromContactBook = flag;
    }

    public Relation c()
    {
        return relation;
    }

    public void c(long l1)
    {
        contactId = l1;
    }

    public void c(String s1)
    {
        postal = s1;
    }

    public void c(boolean flag)
    {
        challengesBeta = flag;
    }

    public Relation d()
    {
        return oldRelation;
    }

    public void d(long l1)
    {
        inviteId = l1;
    }

    public void d(boolean flag)
    {
        isFromFacebook = flag;
    }

    public String e()
    {
        return state;
    }

    public String f()
    {
        return email;
    }

    public String g()
    {
        return postal;
    }

    public long getServerId()
    {
        if (F() != null)
        {
            return super.I();
        } else
        {
            return h();
        }
    }

    public long h()
    {
        return contactId;
    }

    public long i()
    {
        return inviteId;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        super.initFromPublicApiJsonObject(jsonobject);
        Relation relation1;
        if (jsonobject.optBoolean("friend"))
        {
            relation1 = Relation.FRIEND;
        } else
        {
            relation1 = Relation.STRANGER;
        }
        a(relation1);
        if (jsonobject.optBoolean("friend"))
        {
            jsonobject = Relation.FRIEND;
        } else
        {
            jsonobject = Relation.STRANGER;
        }
        b(jsonobject);
    }

    public boolean j()
    {
        return newInvite;
    }

    public Date k()
    {
        return joinedDate;
    }

    public Date l()
    {
        return inviteDate;
    }

    public String m()
    {
        if (P() != null && P().trim().length() > 0)
        {
            return P();
        }
        if (E() != null && E().trim().length() > 0)
        {
            return E();
        } else
        {
            return null;
        }
    }

    public String n()
    {
        if (P() != null && P().trim().length() > 0)
        {
            return P();
        }
        if (E() != null && E().trim().length() > 0)
        {
            return E();
        }
        if (f() != null && f().trim().length() > 0)
        {
            String as[] = f().split("@");
            if (as != null && as.length > 0)
            {
                return as[0];
            }
        }
        return null;
    }

    public boolean p()
    {
        return isFromContactBook;
    }

    public boolean q()
    {
        return challengesBeta;
    }

    public boolean r()
    {
        return isFromFacebook;
    }

    public boolean s()
    {
        return active == ActiveState.ACTIVE || active == ActiveState.UNKNOWN && a() > 0L;
    }

    public ActiveState t()
    {
        return active;
    }

    public Boolean u()
    {
        return areFriendshipsPublic;
    }
}
