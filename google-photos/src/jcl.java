// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.TimeUnit;

public final class jcl
    implements omb, opt, opv
{

    private boolean a;
    private final ar b;
    private ay c;
    private jch d;

    public jcl(ar ar1, opd opd1)
    {
        b = ar1;
        opd1.a(this);
    }

    public final void X_()
    {
        if (a) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if (!((jch) (obj = d)).a(PreferenceManager.getDefaultSharedPreferences(((jch) (obj)).a).getString("com.google.android.apps.photos.update.minimumVersionCode", null))) goto _L1; else goto _L3
_L3:
        c = b.c();
        if (c.a("UpdateAppDialog") != null) goto _L1; else goto _L4
_L4:
        long l;
        obj = new jck();
        l = PreferenceManager.getDefaultSharedPreferences(d.a).getLong("com.google.android.apps.photos.update.updateTimestampMs", 0L);
        if (l == 0L) goto _L6; else goto _L5
_L5:
        long l1 = System.currentTimeMillis();
        if (l1 <= l) goto _L6; else goto _L7
_L7:
        int i = (int)TimeUnit.MILLISECONDS.toDays(l1 - l);
_L9:
        obj.a = i;
        jci jci1 = new jci();
        Bundle bundle = new Bundle();
        bundle.putInt("extra_days_until_required", ((jck) (obj)).a);
        jci1.f(bundle);
        jci1.a(c, "UpdateAppDialog");
        return;
_L6:
        i = 0;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        boolean flag;
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        d = (jch)olm1.a(jch);
    }
}
