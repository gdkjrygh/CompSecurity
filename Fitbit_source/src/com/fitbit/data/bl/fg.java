// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.e;
import com.fitbit.util.o;
import com.fitbit.util.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            c, an, ew, by, 
//            bp, fb, cd, bs

public class fg extends c
{

    private static final String d = "SyncTrackerGoalOperation";

    public fg(bs bs, boolean flag)
    {
        super(bs, flag);
        Profile profile = an.a().b();
        Object obj1;
        if (profile != null)
        {
            if ((obj1 = profile.s()) == null || ((List) (obj1)).isEmpty())
            {
                continue;
            }
            Object obj = new ArrayList();
            if (p.n())
            {
                ((List) (obj)).add(TrackerGoalType.STEPS);
            }
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                Object obj2 = ((Device)((Iterator) (obj1)).next()).o();
                if (obj2 != null)
                {
                    obj2 = ((TrackerSettings) (obj2)).a(TrackerOption.PRIMARY_GOAL);
                    if (obj2 != null && ((e) (obj2)).c() != null)
                    {
                        ((List) (obj)).add(((e) (obj2)).c());
                    }
                }
            } while (true);
            obj1 = new Date();
            Date date = o.a(((Date) (obj1)));
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue;
                }
                TrackerGoalType trackergoaltype = (TrackerGoalType)((Iterator) (obj)).next();
    /* anonymous class not found */
    class _anm1 {}

                switch (_cls1.a[trackergoaltype.ordinal()])
                {
                case 1: // '\001'
                    a(new ew(bs, date, ((Date) (obj1)), flag));
                    break;

                case 2: // '\002'
                    a(new by(bs, date, ((Date) (obj1)), flag));
                    break;

                case 3: // '\003'
                    a(new bp(bs, date, ((Date) (obj1)), flag));
                    break;

                case 4: // '\004'
                    a(new fb(bs, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE, date, ((Date) (obj1)), flag));
                    break;

                case 5: // '\005'
                    a(new cd(bs, date, ((Date) (obj1)), flag));
                    break;
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_330;
        while (true) 
        {
            return;
        }
    }

    public String c()
    {
        return "SyncTrackerGoalOperation";
    }
}
