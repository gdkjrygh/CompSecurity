// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;

public final class De extends CQ
    implements oS.a
{

    public Ul a;
    private final double b;
    private final double c;
    private final Float d;
    private final long e;
    private final Uk.a f;

    public De(Intent intent)
    {
        super(intent);
        new com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory();
        b = intent.getDoubleExtra("lat", 4.9406564584124654E-324D);
        c = intent.getDoubleExtra("long", 4.9406564584124654E-324D);
        float f1 = intent.getFloatExtra("accuracyMeters", 1.401298E-45F);
        Float float1;
        if (f1 != 1.401298E-45F)
        {
            float1 = Float.valueOf(f1);
        } else
        {
            float1 = null;
        }
        d = float1;
        e = intent.getLongExtra("totalPollingDurationMillis", 0x8000000000000000L);
        f = (Uk.a)intent.getSerializableExtra("action");
        registerCallback(Ul, this);
    }

    protected final String getPath()
    {
        return "/bq/and/find_nearby_friends";
    }

    public final pn getRequestPayload()
    {
        return new oO(buildAuthPayload((new Uk()).a(Double.valueOf(b)).b(Double.valueOf(c)).a(d).a(Long.valueOf(e)).a(f.toString())));
    }

    public final void onJsonResult(Object obj, pi pi1)
    {
        obj = (Ul)obj;
        if (pi1.mResponseCode == 400)
        {
            com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.a("ANF_RATE_LIMIT").b(true);
        }
        if (pi1.c() && obj != null)
        {
            a = ((Ul) (obj));
            return;
        } else
        {
            a = null;
            return;
        }
    }

    public final void process(Context context)
    {
        boolean flag;
        if (Math.abs(b) > 90D)
        {
            flag = false;
        } else
        if (Math.abs(c) > 180D)
        {
            flag = false;
        } else
        if (e < 0L)
        {
            flag = false;
        } else
        if (f == Uk.a.UNRECOGNIZED_VALUE)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            super.process(context);
            return;
        } else
        {
            Timber.e("FindNearbyFriendsOperation", "Skipping find nearby friends request due to invalid params", new Object[0]);
            return;
        }
    }
}
