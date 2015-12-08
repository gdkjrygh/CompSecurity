// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

static final class > extends Thread
{

    public final void run()
    {
        if (!Ka.GEO_LENSES_METADATA_CACHE.f())
        {
            Ka.GEO_LENSES_METADATA_CACHE.a(new HashMap());
        }
        if (!Ka.SCHEDULED_LENSES_METADATA_CACHE.f())
        {
            Ka.SCHEDULED_LENSES_METADATA_CACHE.a(new HashMap());
        }
        if (!Ka.PROMO_LENSES_METADATA_CACHE.f())
        {
            Ka.PROMO_LENSES_METADATA_CACHE.a(new HashMap());
        }
        if (!Ka.PURCHASED_LENSES_METADATA_CACHE.f())
        {
            Ka.PURCHASED_LENSES_METADATA_CACHE.a(new HashMap());
        }
    }

    >()
    {
    }
}
