// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.os.Handler;
import android.support.v4.util.LongSparseArray;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.e.a;
import com.fitbit.util.bf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseListActivity

private static class b extends bf
{
    public static interface a
    {

        public abstract void a(List list);
    }


    private final int a = 1;
    private final a b;
    private final Handler c = new Handler();
    private final long d[];

    static a a(a a1)
    {
        return a1.b;
    }

    private void a(List list)
    {
        c.post(new Runnable(list) {

            final List a;
            final ExerciseListActivity.c b;

            public void run()
            {
                if (com.fitbit.runtrack.ui.ExerciseListActivity.c.a(b) != null)
                {
                    com.fitbit.runtrack.ui.ExerciseListActivity.c.a(b).a(a);
                }
            }

            
            {
                b = ExerciseListActivity.c.this;
                a = list;
                super();
            }
        });
    }

    protected List a()
    {
        ArrayList arraylist = new ArrayList();
        long al[] = d;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            ActivityLogEntry activitylogentry = ActivityBusinessLogic.a().c(l);
            if (activitylogentry != null)
            {
                arraylist.add(activitylogentry);
            }
        }

        ArrayList arraylist1 = new ArrayList();
        Iterator iterator = arraylist.iterator();
        do
        {
            ActivityLogEntry activitylogentry1;
label0:
            {
                if (iterator.hasNext())
                {
                    activitylogentry1 = (ActivityLogEntry)iterator.next();
                    if (!isAbandoned())
                    {
                        break label0;
                    }
                }
                return arraylist;
            }
            try
            {
                ActivityBusinessLogic.a().a(activitylogentry1);
                ActivityBusinessLogic.a().a(Collections.singletonList(activitylogentry1));
                arraylist1.add(activitylogentry1);
            }
            catch (Exception exception)
            {
                ExerciseListActivity.f().append(activitylogentry1.getServerId(), Boolean.valueOf(true));
                com.fitbit.e.a.f(ExerciseListActivity.e(), "Error refreshing details.", exception, new Object[0]);
            }
            if (arraylist1.size() >= 1)
            {
                a(((List) (new ArrayList(arraylist1))));
                arraylist1.clear();
            }
        } while (true);
    }

    protected Object f_()
    {
        return a();
    }

    public a(Context context, long al[], a a1)
    {
        super(context);
        d = al;
        b = a1;
    }
}
