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
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            HeartRateSummary

private static class e extends bf
{

    private static final String a = "HeartRateSummaryLoader";
    private final Date b;
    private final Date c;
    private final String d;
    private final ExerciseSession e;

    public List a()
    {
        List list;
        b b1;
        ServerCommunicationException servercommunicationexception;
        try
        {
            b1 = new b();
            list = fs.a().a(com.fitbit.data.domain.meSeriesResourceType.HEART_RATE_INTRADAY, b, c, d);
            break MISSING_BLOCK_LABEL_30;
        }
        // Misplaced declaration of an exception variable
        catch (ServerCommunicationException servercommunicationexception)
        {
            list = null;
        }
          goto _L1
        servercommunicationexception;
_L3:
        com.fitbit.e.a.f("HeartRateSummaryLoader", servercommunicationexception.getMessage(), servercommunicationexception, new Object[0]);
        return list;
        if (e != null)
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (!b1.a(((TimeSeriesObject)iterator.next()).a(), e))
                {
                    iterator.remove();
                }
            } while (true);
        }
        return list;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public Object f_()
    {
        return a();
    }

    public icationException(Context context, Date date, Date date1, String s, ExerciseSession exercisesession)
    {
        super(context);
        b = date;
        c = date1;
        d = s;
        e = exercisesession;
    }
}
