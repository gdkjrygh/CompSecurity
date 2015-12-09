// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Type;
import com.fitbit.e.a;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.data.b;
import com.fitbit.util.bf;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecentSummary

class a
    implements Comparator
{

    final a a;

    public int a(ActivityLogEntry activitylogentry, ActivityLogEntry activitylogentry1)
    {
        return activitylogentry.e().compareTo(activitylogentry1.e());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ActivityLogEntry)obj, (ActivityLogEntry)obj1);
    }

    nicationException(nicationException nicationexception)
    {
        a = nicationexception;
        super();
    }

    // Unreferenced inner class com/fitbit/runtrack/ui/RecentSummary$1

/* anonymous class */
    class RecentSummary._cls1 extends bf
    {

        final RecentSummary a;

        protected List a()
        {
            Object obj;
            Object obj1;
            obj = Collections.emptyList();
            obj1 = Calendar.getInstance();
            ((Calendar) (obj1)).setTime(com.fitbit.runtrack.ui.RecentSummary.a(a).c());
            ((Calendar) (obj1)).add(5, 1);
            obj1 = new com.fitbit.data.bl.ActivityBusinessLogic.Request(((Calendar) (obj1)).getTime(), 0, 10, Integer.valueOf((int)com.fitbit.runtrack.ui.RecentSummary.a(a).h()));
            obj1 = new ArrayList(ActivityBusinessLogic.a().a(((com.fitbit.data.bl.ActivityBusinessLogic.Request) (obj1))));
            Iterator iterator = ((List) (obj1)).iterator();
_L2:
            obj = obj1;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj = (ActivityLogEntry)iterator.next();
            Date date = ((ActivityLogEntry) (obj)).e();
            if (!((ActivityLogEntry) (obj)).f() || date.after(com.fitbit.runtrack.ui.RecentSummary.a(a).c()))
            {
                iterator.remove();
            }
            if (true) goto _L2; else goto _L1
            ServerCommunicationException servercommunicationexception;
            servercommunicationexception;
            obj = obj1;
            obj1 = servercommunicationexception;
_L4:
            com.fitbit.e.a.e(com.fitbit.runtrack.ui.RecentSummary.a(), "Communication error fetching recents", ((Throwable) (obj1)), new Object[0]);
_L1:
            Collections.sort(((List) (obj)), new RecentSummary._cls1._cls1(this));
            if (((List) (obj)).size() > 5)
            {
                obj1 = ((List) (obj)).iterator();
                for (; ((List) (obj)).size() > 5; ((Iterator) (obj1)).remove())
                {
                    ((Iterator) (obj1)).next();
                }

            }
            obj1 = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                ActivityLogEntry activitylogentry = (ActivityLogEntry)((Iterator) (obj1)).next();
                if (activitylogentry.f() && activitylogentry.p() == null)
                {
                    try
                    {
                        ActivityBusinessLogic.a().a(activitylogentry);
                        ActivityBusinessLogic.a().a(Collections.singletonList(activitylogentry));
                    }
                    catch (Exception exception)
                    {
                        com.fitbit.e.a.f(com.fitbit.runtrack.ui.RecentSummary.a(), "Error refreshing details.", exception, new Object[0]);
                    }
                }
            } while (true);
            b b1 = new b();
            obj1 = new ArrayList();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj2 = (ActivityLogEntry)((Iterator) (obj)).next();
                if (((ActivityLogEntry) (obj2)).p() != null)
                {
                    obj2 = ((ActivityLogEntry) (obj2)).p();
                    Type type = ((com.fitbit.data.domain.b) (obj2)).b();
                    switch (com.fitbit.runtrack.ui.RecentSummary._cls4.b[type.ordinal()])
                    {
                    case 1: // '\001'
                        obj2 = b1.a(UUID.fromString(((com.fitbit.data.domain.b) (obj2)).a()));
                        if (obj2 != null)
                        {
                            ((List) (obj1)).add(Pair.create(obj2, b1.g(((ExerciseSession) (obj2))).first));
                        }
                        break;
                    }
                }
            } while (true);
            if (((List) (obj1)).isEmpty())
            {
                obj = null;
            } else
            {
                obj = ((ExerciseSession)((Pair)((List) (obj1)).get(((List) (obj1)).size() - 1)).first).getUuid();
            }
            if (obj == null || !com.fitbit.runtrack.ui.RecentSummary.a(a).getUuid().equals(obj))
            {
                obj = (ExerciseStat)a.getArguments().getParcelable("stats");
                ((List) (obj1)).add(Pair.create(com.fitbit.runtrack.ui.RecentSummary.a(a), obj));
                if (((List) (obj1)).size() > 5)
                {
                    ((List) (obj1)).remove(0);
                }
            }
            return ((List) (obj1));
            obj1;
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected Object f_()
        {
            return a();
        }

            
            {
                a = recentsummary;
                super(context);
            }
    }

}
