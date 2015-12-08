// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.serverinteraction.PublicAPI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            e, aq, EntityMerger, dg, 
//            ez, bs, ao, an

public class cv extends e
{

    private static final String a = "SyncFriendsOperation";

    public cv(bs bs1, boolean flag)
    {
        super(bs1, flag, false);
    }

    private void a(List list)
    {
        com.fitbit.data.repo.an an1 = aq.a().z();
        list = new EntityMerger(list, an1, new _cls1());
        list.a(new _cls2());
        list.a(new _cls3(an1));
        list.a(new _cls4());
    }

    public static void b()
    {
        dg.d().c().d("SyncFriendsOperation");
    }

    private List d()
        throws ServerCommunicationException, JSONException
    {
        JSONObject jsonobject = e().a().z();
        List list = e().b().N(jsonobject);
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((RankedUser)iterator.next()).a(true)) { }
        list.addAll(e().b().O(jsonobject));
        return list;
    }

    private List j()
        throws ServerCommunicationException, JSONException
    {
        JSONObject jsonobject = e().a().a(true);
        List list = e().b().a(jsonobject, com.fitbit.data.domain.RankedUser.Relation.FRIEND);
        Profile profile = an.a().b();
        if (profile != null)
        {
            boolean flag = jsonobject.optBoolean("hideMeFromLeaderboard");
            if (flag != profile.c())
            {
                profile.a(flag);
                an.a().b(profile);
            }
        }
        return list;
    }

    private List k()
        throws ServerCommunicationException, JSONException
    {
        Object obj = j();
        ((List) (obj)).addAll(d());
        HashMap hashmap = new HashMap();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            RankedUser rankeduser = (RankedUser)((Iterator) (obj)).next();
            if (hashmap.containsKey(rankeduser.F()))
            {
                RankedUser rankeduser1 = (RankedUser)hashmap.get(rankeduser.F());
                if (rankeduser.c().ordinal() > rankeduser1.c().ordinal())
                {
                    hashmap.remove(rankeduser.F());
                    hashmap.put(rankeduser.F(), rankeduser);
                }
            } else
            {
                hashmap.put(rankeduser.F(), rankeduser);
            }
        } while (true);
        return new ArrayList(hashmap.values());
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        a(k());
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.c, com.fitbit.savedstate.LoadSavedState.Status.b);
        UISavedState.e(true);
        LoadSavedState.c(com.fitbit.savedstate.LoadSavedState.DataType.c);
        return;
        a1;
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.c, com.fitbit.savedstate.LoadSavedState.Status.c, com.fitbit.savedstate.LoadSavedState.Status.a);
        LoadSavedState.c(com.fitbit.savedstate.LoadSavedState.DataType.c);
        throw a1;
    }

    public String c()
    {
        return "SyncFriendsOperation";
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
