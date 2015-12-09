// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.FitBitApplication;
import com.fitbit.d.a;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.TimeZone;
import com.fitbit.data.repo.t;
import com.fitbit.data.repo.v;
import com.fitbit.mixpanel.f;
import com.fitbit.runtrack.data.b;
import com.fitbit.savedstate.d;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.util.al;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, aq, ce, ek, 
//            cb, dh, ck, cg, 
//            fb, cn, bs, an, 
//            ao, BadgesBusinessLogic

public class ef extends e
{

    private static final String a = "SyncProfileOperation";
    private final boolean b;

    public ef(bs bs1, boolean flag)
    {
        this(bs1, flag, false);
    }

    public ef(bs bs1, boolean flag, boolean flag1)
    {
        super(bs1, flag);
        b = flag1;
    }

    private void b()
    {
        com.fitbit.data.bl.aq.a().f().unpopulateAll();
        com.fitbit.data.bl.aq.a().e().clear(true);
        com.fitbit.data.bl.ce.d();
        com.fitbit.data.bl.ek.b();
        com.fitbit.data.bl.cb.b();
        com.fitbit.data.bl.dh.b();
        com.fitbit.data.bl.ck.b();
        com.fitbit.data.bl.cg.d();
        com.fitbit.data.bl.fb.a(com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES);
        FitBitApplication.a().startService(com.fitbit.data.bl.cn.a(FitBitApplication.a(), true));
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        a1 = null;
        Profile profile;
        e().a(true);
        profile = com.fitbit.data.bl.an.a().b();
        if (profile != null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        profile = new Profile();
        profile.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
        TimeZone timezone = null;
_L1:
        if (profile.getEntityStatus() != com.fitbit.data.domain.Entity.EntityStatus.SYNCED)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        profile.initFromPublicApiJsonObject(com.fitbit.d.a.h(e().a().c(null), "user"));
        if (al.c(profile.m()))
        {
            b();
        }
        al.b(profile.O());
        if (!b)
        {
            profile.a(e().b().H(e().a().w()));
        }
        com.fitbit.data.bl.an.a().a(profile);
        com.fitbit.data.bl.BadgesBusinessLogic.a().a(profile);
        if (timezone == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        if (timezone.c() != null && !timezone.c().equals(profile.L().c()))
        {
            d.b(false);
        }
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        if (!a1.equals(profile.t()))
        {
            (new b()).a();
        }
        f.b();
        f.e();
        e().a(false);
        return;
        timezone = profile.L();
        a1 = profile.t();
          goto _L1
        a1;
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return "SyncProfileOperation";
    }
}
