// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music;

import android.app.AlarmManager;
import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import dmz;
import dzj;
import dzo;
import efb;
import fya;
import gmo;
import gmp;
import gps;
import hff;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.spotify.music:
//            MainActivity

final class a extends hff
{

    private MainActivity a;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        Assertion.a("Failed loading feature flags", new Exception(throwable));
    }

    public final void onNext(Object obj)
    {
        Object obj1 = (Flags)obj;
        obj = a;
        MethodTraceScope.e.a();
        obj.g = ((Flags) (obj1));
        ((MainActivity) (obj)).i.a = ((MainActivity) (obj)).g;
        ((MainActivity) (obj)).i();
        ((MainActivity) (obj)).h.a = ((MainActivity) (obj)).g;
        ((MainActivity) (obj)).f.sendEmptyMessage(1);
        if (((MainActivity) (obj)).d != null)
        {
            ((MainActivity) (obj)).d.a(((MainActivity) (obj)).g);
        }
        obj1 = (gps)dmz.a(gps);
        obj1.b = Optional.b(((MainActivity) (obj)).g);
        if (!((gps) (obj1)).a.isEmpty())
        {
            Intent intent;
            for (Iterator iterator = ((gps) (obj1)).a.iterator(); iterator.hasNext(); ((gps) (obj1)).a(intent))
            {
                intent = (Intent)iterator.next();
                iterator.remove();
            }

        }
        obj1 = ((MainActivity) (obj)).getApplicationContext();
        Flags flags = ((MainActivity) (obj)).g;
        if (dzo.b().a(flags))
        {
            boolean flag;
            if (dzj.a(((android.content.Context) (obj1)), 0x20000000) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                long l = (long)((new Random()).nextDouble() * (double)dzo.a);
                TimeUnit.MILLISECONDS.toMinutes(l);
                long l1 = System.currentTimeMillis();
                dzj.a(((android.content.Context) (obj1))).setInexactRepeating(1, l + l1, 0x5265c00L, dzj.a(((android.content.Context) (obj1)), 0));
            }
        }
        ((MainActivity) (obj)).f.post(((MainActivity) (obj)).i);
        MethodTraceScope.e.b();
    }

    s.MethodTraceScope(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }
}
