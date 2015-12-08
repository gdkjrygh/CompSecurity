// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.data.repo.av;
import com.fitbit.galileo.GalileoTrackerType;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            aq

public class o
{
    private static class a
    {

        public static o a = new o();


        private a()
        {
        }
    }


    private final av a;

    private o()
    {
        a = aq.a().I();
    }


    public static o a()
    {
        return a.a;
    }

    public TrackerType a(String s)
    {
label0:
        {
            Object obj = b();
            if (obj == null || ((List) (obj)).isEmpty())
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            TrackerType trackertype;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                trackertype = (TrackerType)((Iterator) (obj)).next();
            } while (!GalileoTrackerType.a(trackertype.a()).equals(GalileoTrackerType.a(s)));
            return trackertype;
        }
        return null;
    }

    public List b()
    {
        return a.a();
    }
}
