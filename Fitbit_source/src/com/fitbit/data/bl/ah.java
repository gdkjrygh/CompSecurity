// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.Notification;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.repo.ai;
import com.fitbit.savedstate.LoadSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.fitbit.data.bl:
//            aq, s, an

public class ah
{

    private static ah a;
    private ai b;
    private int c;
    private int d;
    private int e;

    public ah()
    {
        b = aq.a().B();
        c = 0;
        d = 0;
        e = 0;
    }

    public static ah a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/fitbit/data/bl/ah;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new ah();
        }
        com/fitbit/data/bl/ah;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/fitbit/data/bl/ah;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Notification a(long l)
    {
        return (Notification)b.getByServerId(l);
    }

    public Notification a(String s1)
    {
        return b.getLastMessageByUser(s1);
    }

    public List a(com.fitbit.FitbitMobile.GCMNotification.Type type)
    {
        ArrayList arraylist = new ArrayList();
        TreeSet treeset = new TreeSet();
        if (type == com.fitbit.FitbitMobile.GCMNotification.Type.d)
        {
            treeset.add(com.fitbit.data.domain.Notification.NotificationType.MESSAGE);
            treeset.add(com.fitbit.data.domain.Notification.NotificationType.CHEER);
            treeset.add(com.fitbit.data.domain.Notification.NotificationType.TAUNT);
        } else
        if (type == com.fitbit.FitbitMobile.GCMNotification.Type.c)
        {
            treeset.add(com.fitbit.data.domain.Notification.NotificationType.INVITE);
        } else
        if (type == com.fitbit.FitbitMobile.GCMNotification.Type.f)
        {
            treeset.add(com.fitbit.data.domain.Notification.NotificationType.CHALLENGE_INVITE);
        } else
        if (type == com.fitbit.FitbitMobile.GCMNotification.Type.g)
        {
            treeset.add(com.fitbit.data.domain.Notification.NotificationType.CHALLENGE_MESSAGE);
        } else
        if (type == com.fitbit.FitbitMobile.GCMNotification.Type.e)
        {
            treeset.add(com.fitbit.data.domain.Notification.NotificationType.CORPORATE);
        } else
        if (type == com.fitbit.FitbitMobile.GCMNotification.Type.h)
        {
            treeset.add(com.fitbit.data.domain.Notification.NotificationType.BADGE);
        } else
        {
            return arraylist;
        }
        type = c().iterator();
        do
        {
            if (!type.hasNext())
            {
                break;
            }
            Notification notification = (Notification)type.next();
            if (treeset.contains(notification.b()))
            {
                arraylist.add(notification);
            }
        } while (true);
        return arraylist;
    }

    public void a(int i)
    {
        c = i;
    }

    public List b()
    {
        return b.getMessages();
    }

    public void b(int i)
    {
        d = i;
    }

    public List c()
    {
        return b.getUnread();
    }

    public boolean d()
    {
        return b.hasNew();
    }

    public void e()
    {
        e = e + 1;
    }

    public void f()
    {
        e = 0;
    }

    public int g()
    {
        boolean flag2 = true;
        ArrayList arraylist = new ArrayList();
        Object obj = new TreeSet();
        ((Set) (obj)).add(com.fitbit.data.domain.Notification.NotificationType.MESSAGE);
        ((Set) (obj)).add(com.fitbit.data.domain.Notification.NotificationType.CHEER);
        ((Set) (obj)).add(com.fitbit.data.domain.Notification.NotificationType.TAUNT);
        Iterator iterator = c().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Notification notification = (Notification)iterator.next();
            if (((Set) (obj)).contains(notification.b()))
            {
                arraylist.add(notification);
            }
        } while (true);
        obj = s.a(FitBitApplication.a()).d();
        boolean flag1;
        if (an.a().b() != null)
        {
            String s1 = an.a().b().F();
            Iterator iterator1 = ((List) (obj)).iterator();
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (!iterator1.hasNext())
                {
                    break;
                }
                if (((RankedUser)iterator1.next()).F().equals(s1))
                {
                    flag = true;
                }
            } while (true);
        } else
        {
            flag1 = false;
        }
        int j = arraylist.size();
        int k = ((List) (obj)).size();
        int i;
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (LoadSavedState.b(com.fitbit.savedstate.LoadSavedState.DataType.c))
        {
            d = k - i;
        }
        if (j > c)
        {
            c = j;
        }
        return Math.max(0, (c + d) - e / 2);
    }
}
