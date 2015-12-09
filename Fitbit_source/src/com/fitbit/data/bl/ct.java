// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Friendship;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.repo.an;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.serverinteraction.PublicAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, aq, EntityMerger, bs, 
//            ao, s, y, ez, 
//            dg

public class ct extends e
{

    public static final String a = "SyncFriendsOperation";
    private String b;
    private long d;

    public ct(bs bs1, boolean flag, String s1)
    {
        super(bs1, flag);
        b = s1;
    }

    public ct(dg dg, boolean flag, long l)
    {
        super(dg, flag);
        d = l;
    }

    static String a(ct ct1)
    {
        return ct1.b;
    }

    public static String a(String s1)
    {
        if (s1 == null)
        {
            return "SyncFriendsOperation";
        } else
        {
            return (new StringBuilder()).append("SyncFriendsOperation-").append(s1).toString();
        }
    }

    private void a(List list)
    {
        Object obj = aq.a().z();
        com.fitbit.data.repo.y y1 = aq.a().A();
        obj = ((an) (obj)).getByEncodedId(b);
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            RankedUser rankeduser = (RankedUser)list.next();
            if (!rankeduser.F().equals(((RankedUser) (obj)).F()))
            {
                arraylist.add(new Friendship(rankeduser.getEntityId().longValue(), ((RankedUser) (obj)).getEntityId().longValue()));
                arraylist.add(new Friendship(((RankedUser) (obj)).getEntityId().longValue(), rankeduser.getEntityId().longValue()));
            }
        } while (true);
        for (list = arraylist.iterator(); list.hasNext(); ((Friendship)list.next()).setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED)) { }
        list = new EntityMerger(arraylist, y1, new _cls1(((RankedUser) (obj))));
        list.a(new _cls2());
        list.a();
    }

    private boolean a(List list, String s1)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((RankedUser)list.next()).F().equals(s1))
            {
                return true;
            }
        }

        return false;
    }

    private List b()
        throws ServerCommunicationException, JSONException
    {
        Object obj;
        if (b == null)
        {
            obj = new ArrayList();
        } else
        {
            obj = e().a().u(b);
            List list = e().b().a(((org.json.JSONObject) (obj)), com.fitbit.data.domain.RankedUser.Relation.STRANGER);
            obj = list;
            if (!a(list, b))
            {
                obj = list;
                if (s.a(FitBitApplication.a()).b(b) == null)
                {
                    obj = list;
                    if (b(b))
                    {
                        obj = e().a().c(b);
                        RankedUser rankeduser = e().b().Q(((org.json.JSONObject) (obj)));
                        obj = list;
                        if (rankeduser != null)
                        {
                            list.add(rankeduser);
                            return list;
                        }
                    }
                }
            }
        }
        return ((List) (obj));
    }

    private void b(List list)
    {
        list = new EntityMerger(list, aq.a().z(), new _cls3());
        list.a(new _cls4());
        list.a(new _cls5());
        list.a(new _cls6());
    }

    private boolean b(String s1)
    {
        return !e().c().f(y.a(s1));
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        boolean flag1 = true;
        an an1 = aq.a().z();
        if (b != null) goto _L2; else goto _L1
_L1:
        Object obj = an1.getUserByInviteId(d);
        a1 = ((h.a) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        b = ((RankedUser) (obj)).F();
        a1 = ((h.a) (obj));
_L3:
        obj = b;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        obj = null;
        List list = b();
        obj = list;
_L5:
        b(((List) (obj)));
        a(((List) (obj)));
        boolean flag;
        flag = flag1;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        a1.a(Boolean.valueOf(true));
        an1.save(a1);
        flag = flag1;
_L6:
        ServerCommunicationException servercommunicationexception;
        if (flag)
        {
            LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.c, b, com.fitbit.savedstate.LoadSavedState.Status.b);
            return;
        } else
        {
            LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.c, b, com.fitbit.savedstate.LoadSavedState.Status.c, com.fitbit.savedstate.LoadSavedState.Status.a);
            return;
        }
_L2:
        a1 = an1.getByEncodedId(b);
          goto _L3
        servercommunicationexception;
        if (servercommunicationexception.e() != 401) goto _L5; else goto _L4
_L4:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        a1.a(Boolean.valueOf(false));
        an1.save(a1);
        throw servercommunicationexception;
        a1;
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.c, b, com.fitbit.savedstate.LoadSavedState.Status.c, com.fitbit.savedstate.LoadSavedState.Status.a);
        throw a1;
        flag = false;
          goto _L6
    }

    public String c()
    {
        return a(b);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}

}
