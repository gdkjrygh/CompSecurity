// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import com.fitbit.FitBitApplication;
import com.fitbit.d.a;
import com.fitbit.data.bl.exceptions.JsonException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Message;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.repo.an;
import com.fitbit.data.repo.ap;
import com.fitbit.home.ui.g;
import com.fitbit.mixpanel.MixPanelTrackingHelper;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            aq, an, l

public class s
{

    public static final String a = "FriendBusinessLogic";
    private static s b;
    private final an c = com.fitbit.data.bl.aq.a().z();
    private final PublicAPI d;

    private s(Context context)
    {
        d = new PublicAPI(FitBitApplication.a(context).b());
    }

    public static s a(Context context)
    {
        com/fitbit/data/bl/s;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new s(context);
        }
        context = b;
        com/fitbit/data/bl/s;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static void a(List list)
    {
        Profile profile = com.fitbit.data.bl.an.a().b();
        if (profile == null)
        {
            return;
        }
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if ((RankedUser)iterator.next() == null)
            {
                iterator.remove();
            }
        } while (true);
        Collections.sort(list, new Comparator(profile) {

            final Profile a;

            public int a(RankedUser rankeduser, RankedUser rankeduser1)
            {
                if (rankeduser.F() == null || !rankeduser.F().equals(a.F())) goto _L2; else goto _L1
_L1:
                return -1;
_L2:
                int i;
                if (rankeduser1.F() != null && rankeduser1.F().equals(a.F()))
                {
                    return 1;
                }
                i = rankeduser.P().compareToIgnoreCase(rankeduser1.P());
                if (i == 0)
                {
                    break; /* Loop/switch isn't completed */
                }
                if (rankeduser.P().length() == 0)
                {
                    return 1;
                }
                if (rankeduser1.P().length() == 0) goto _L1; else goto _L3
_L3:
                return i;
            }

            public int compare(Object obj, Object obj1)
            {
                return a((RankedUser)obj, (RankedUser)obj1);
            }

            
            {
                a = profile;
                super();
            }
        });
    }

    public RankedUser a(long l1)
    {
        return (RankedUser)c.getById(l1);
    }

    public String a()
    {
        return c.getName();
    }

    public List a(String s1)
    {
        return c.getLeaderboard(s1);
    }

    public void a(RankedUser rankeduser, Context context, g g)
    {
        if (rankeduser.c() == com.fitbit.data.domain.RankedUser.Relation.REQUEST_RECEIVE)
        {
            rankeduser.a(com.fitbit.data.domain.RankedUser.Relation.FRIEND);
            com.fitbit.data.bl.l.a(rankeduser, c, context, g);
            MixPanelTrackingHelper.a("Profile", "Accepted");
        }
    }

    public void a(RankedUser rankeduser, Context context, g g, com.fitbit.mixpanel.MixPanelTrackingHelper.FriendRequestProperties friendrequestproperties)
    {
        if (rankeduser.c() == com.fitbit.data.domain.RankedUser.Relation.STRANGER)
        {
            rankeduser.a(com.fitbit.data.domain.RankedUser.Relation.REQUEST_SENT);
            com.fitbit.data.bl.l.a(rankeduser, c, context, g);
            MixPanelTrackingHelper.a(friendrequestproperties);
        }
    }

    public void a(ap ap)
    {
        c.addListener(ap);
    }

    public void a(String s1, com.fitbit.data.domain.Message.MessageType messagetype, String s2, String s3)
        throws JSONException, ServerCommunicationException
    {
        PublicAPI publicapi = new PublicAPI(ServerGateway.a());
        Message message = new Message();
        message.setTimeCreated(new Date());
        message.a(messagetype);
        message.a(com.fitbit.data.bl.an.a().b().F());
        message.b(s1);
        message.c(s2);
        message.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
        message.initFromPublicApiJsonObject(publicapi.a(message.c().name().toLowerCase(), message.b(), message.d()).getJSONObject("message"));
        if (s3 != null)
        {
            MixPanelTrackingHelper.a(messagetype, s3);
        }
    }

    public RankedUser b(long l1)
    {
        return c.getUserByInviteId(l1);
    }

    public RankedUser b(String s1)
    {
        return c.getByEncodedId(s1);
    }

    public List b()
    {
        return c.getUsersOnFitbit();
    }

    public void b(RankedUser rankeduser, Context context, g g)
    {
        if (rankeduser.c() == com.fitbit.data.domain.RankedUser.Relation.REQUEST_RECEIVE)
        {
            rankeduser.a(com.fitbit.data.domain.RankedUser.Relation.STRANGER);
            com.fitbit.data.bl.l.a(rankeduser, c, context, g);
        }
    }

    public void b(ap ap)
    {
        c.removeListener(ap);
    }

    public RankedUser c(String s1)
        throws ServerCommunicationException
    {
        RankedUser rankeduser;
        try
        {
            s1 = com.fitbit.d.a.h(d.c(s1), "user");
            rankeduser = new RankedUser();
            rankeduser.initFromPublicApiJsonObject(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new JsonException(s1);
        }
        return rankeduser;
    }

    public List c()
    {
        return c.getUsersOutOfFitbit();
    }

    public List c(long l1)
    {
        return c.getUserFriendsByInviteId(l1);
    }

    public void c(RankedUser rankeduser, Context context, g g)
    {
        if (rankeduser.c() == com.fitbit.data.domain.RankedUser.Relation.FRIEND)
        {
            rankeduser.a(com.fitbit.data.domain.RankedUser.Relation.STRANGER);
            com.fitbit.data.bl.l.a(rankeduser, c, context, g);
            MixPanelTrackingHelper.a("Profile", "Ignored");
        }
    }

    public List d()
    {
        return c.getInvites();
    }

    public List d(String s1)
    {
        if (s1 == null)
        {
            return Collections.emptyList();
        } else
        {
            s1 = c.getUserFriends(s1);
            a(s1);
            return s1;
        }
    }

    public List e()
    {
        Profile profile = com.fitbit.data.bl.an.a().b();
        List list = c.getAllFitbitUsers();
        if (profile != null)
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((RankedUser)iterator.next()).F().equals(profile.F()))
                {
                    iterator.remove();
                }
            } while (true);
        }
        return list;
    }

    public boolean e(String s1)
    {
        s1 = f(s1);
        return com.fitbit.data.domain.RankedUser.Relation.FRIEND == s1;
    }

    public com.fitbit.data.domain.RankedUser.Relation f(String s1)
    {
        s1 = b(s1);
        if (s1 != null)
        {
            return s1.c();
        } else
        {
            return null;
        }
    }
}
