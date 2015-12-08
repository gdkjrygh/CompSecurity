// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.domain.User;
import com.fitbit.data.domain.badges.Badge;
import com.fitbit.data.repo.h;
import com.fitbit.data.repo.k;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            aq, ao, s, an

public class BadgesBusinessLogic
{

    public static final long a = 60000L;
    private static final String b = "BadgesBusinessLogic";
    private final h c;
    private final PublicAPI d;
    private final ao e;
    private final k f;
    private volatile boolean g;

    private BadgesBusinessLogic()
    {
        g = false;
        c = aq.a().M();
        f = aq.a().N();
        d = new PublicAPI(ServerGateway.a());
        e = new ao();
    }

    BadgesBusinessLogic(_cls1 _pcls1)
    {
        this();
    }

    public static BadgesBusinessLogic a()
    {
    /* block-local class not found */
    class b {}

        return b.a;
    }

    static h a(BadgesBusinessLogic badgesbusinesslogic)
    {
        return badgesbusinesslogic.c;
    }

    static k b(BadgesBusinessLogic badgesbusinesslogic)
    {
        return badgesbusinesslogic.f;
    }

    public Badge a(String s1, String s2)
        throws ServiceException
    {
label0:
        {
            if (s2 != null)
            {
                Object obj = s.a(FitBitApplication.a()).b(s2);
                if (obj == null)
                {
                    break label0;
                }
                obj = ((RankedUser) (obj)).R().iterator();
                Badge badge1;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    badge1 = (Badge)((Iterator) (obj)).next();
                } while (!s1.equals(badge1.c()));
                return badge1;
            }
            Object obj1 = an.a().b();
            if (obj1 == null)
            {
                break label0;
            }
            obj1 = ((Profile) (obj1)).R().iterator();
            Badge badge2;
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break label0;
                }
                badge2 = (Badge)((Iterator) (obj1)).next();
            } while (!s1.equals(badge2.c()));
            return badge2;
        }
        for (s2 = a(s2).iterator(); s2.hasNext();)
        {
            Badge badge = (Badge)s2.next();
            if (badge.c().equals(s1))
            {
                return badge;
            }
        }

        return null;
    }

    public List a(String s1)
        throws ServiceException
    {
        ArrayList arraylist = new ArrayList();
    /* block-local class not found */
    class ServiceException {}

        try
        {
            s1 = d.b(s1, g);
            arraylist.addAll(e.i(s1.optJSONArray("badges")));
            g = false;
    /* block-local class not found */
    class a {}

            Collections.sort(arraylist, new a(null));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            if (s1.e() == 401)
            {
                throw new ServiceException(s1, 0x7f080067, true);
            } else
            {
                throw new ServiceException(s1, s1.a());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new ServiceException(s1, 0);
        }
        return arraylist;
    }

    public void a(User user)
    {
        if (user != null && user.I() != 0L)
        {
            List list = user.R();
            c.runInTransaction(new _cls1(user, list));
            f.runInTransaction(new _cls2(list, user));
        }
    }

    public boolean a(Badge badge, String s1)
    {
        for (badge = f.getCheeresEncodedIdsByBadge(badge.c()).iterator(); badge.hasNext();)
        {
            if (((String)badge.next()).equals(s1))
            {
                return true;
            }
        }

        return false;
    }

    public void b()
    {
        g = true;
    }

    public void b(String s1, String s2)
        throws ServerCommunicationException, ServiceException
    {
        b();
        try
        {
            d.g(s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new ServerCommunicationException(s1);
        }
        s1 = a(s1, s2);
        if (s1 != null && s1.getEntityId() != null)
        {
            f.runInTransaction(new _cls3(s1));
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
