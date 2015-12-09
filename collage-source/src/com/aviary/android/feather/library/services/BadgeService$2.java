// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BadgeService, PreferenceService, IAviaryController

class a
    implements com.aviary.android.feather.common.threading.a
{

    final BadgeService a;

    public volatile Object a(com.aviary.android.feather.common.threading.er er, Object aobj[])
        throws Exception
    {
        return a(er, (Integer[])aobj);
    }

    public transient Set a(com.aviary.android.feather.common.threading.er er, Integer ainteger[])
        throws Exception
    {
        er = a.d();
        if (er == null)
        {
            return null;
        }
        ainteger = new HashSet();
        PreferenceService preferenceservice = (PreferenceService)er.a(com/aviary/android/feather/library/services/PreferenceService);
        if (preferenceservice == null)
        {
            return null;
        }
        if (BadgeService.a(a, er, preferenceservice, com.aviary.android.feather.library.filters.ice, "effect"))
        {
            ainteger.add(com.aviary.android.feather.library.filters.ice);
        }
        if (BadgeService.a(a, er, preferenceservice, com.aviary.android.feather.library.filters.ice, "frame"))
        {
            ainteger.add(com.aviary.android.feather.library.filters.ice);
        }
        if (BadgeService.a(a, er, preferenceservice, com.aviary.android.feather.library.filters.ice, "sticker"))
        {
            ainteger.add(com.aviary.android.feather.library.filters.ice);
        }
        return ainteger;
    }

    er(BadgeService badgeservice)
    {
        a = badgeservice;
        super();
    }
}
