// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.e.a;
import com.fitbit.util.bf;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseListActivity

private static class a extends bf
{

    private final com.fitbit.data.bl.equest a;

    protected List a()
    {
        List list = Collections.emptyList();
        List list1;
        try
        {
            com.fitbit.e.a.a(ExerciseListActivity.e(), "Looking up activity Log Request %s", new Object[] {
                a
            });
            if (a.a)
            {
                return ActivityBusinessLogic.a().b(a);
            }
            list1 = ActivityBusinessLogic.a().c(a);
        }
        catch (ServerCommunicationException servercommunicationexception)
        {
            com.fitbit.e.a.e(ExerciseListActivity.e(), "Communication error loading activity list", servercommunicationexception, new Object[0]);
            return list;
        }
        return list1;
    }

    protected Object f_()
    {
        return a();
    }

    st(Context context, com.fitbit.data.bl.equest equest)
    {
        super(context);
        a = equest;
    }
}
