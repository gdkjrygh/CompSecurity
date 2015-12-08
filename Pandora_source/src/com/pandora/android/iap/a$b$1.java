// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.radio.data.o;
import java.util.List;
import p.cc.e;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.android.iap:
//            a, d, c

class a
    implements p.cm.bject
{

    final e a;
    final b b;

    public void a(p.dc.a a1, List list)
    {
        if (a1 != null && com.pandora.android.iap.andoraIntent().d().a(a))
        {
            p.df.a.c("ALaCarteSubscriptionManager", "GoogleALaCarte AlaCarte was successful");
            b.b.a(new PandoraIntent("iap_complete"));
        } else
        {
            p.df.a.c("ALaCarteSubscriptionManager", "GoogleALaCarte AlaCarte failed");
            b.b.a(new PandoraIntent("iap_error"));
        }
        com.pandora.android.iap.a.e(b.b).b().j().a(false);
        com.pandora.android.iap..b().d().a(false);
        com.pandora.android.iap.a.a(b.b, a1);
        b.b.a(a1);
        b.b.c();
    }

    ( , e e)
    {
        b = ;
        a = e;
        super();
    }
}
