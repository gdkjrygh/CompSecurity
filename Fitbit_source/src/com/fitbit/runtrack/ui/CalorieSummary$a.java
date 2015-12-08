// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.e.a;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.b;
import com.fitbit.util.bf;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            CalorieSummary

private static class e extends bf
{

    private static final String a = "CalorieSummary";
    private final Date b;
    private final Date c;
    private final String d;
    private final ExerciseSession e;

    public List a()
    {
        Object obj1;
        obj1 = Collections.emptyList();
        Object obj = obj1;
        b b1;
        Iterator iterator;
        try
        {
            b1 = new b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            com.fitbit.e.a.f("CalorieSummary", ((ServerCommunicationException) (obj1)).getMessage(), ((Throwable) (obj1)), new Object[0]);
            return ((List) (obj));
        }
        obj = obj1;
        obj1 = fs.a().a(com.fitbit.data.domain.TimeSeriesResourceType.CALORIES_INTRADAY, b, c, d);
        obj = obj1;
        if (e == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        iterator = ((List) (obj1)).iterator();
_L3:
        obj = obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (b1.a(((TimeSeriesObject)iterator.next()).a(), e))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        iterator.remove();
        if (true) goto _L3; else goto _L2
_L2:
        return ((List) (obj1));
    }

    public Object f_()
    {
        return a();
    }

    public (Context context, Date date, Date date1, String s, ExerciseSession exercisesession)
    {
        super(context);
        b = date;
        c = date1;
        d = s;
        e = exercisesession;
    }
}
