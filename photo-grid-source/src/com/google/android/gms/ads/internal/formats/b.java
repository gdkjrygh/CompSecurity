// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.text.TextUtils;
import com.google.android.gms.internal.fz;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.zzja;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh, c

final class b
    implements fz
{

    final zzh a;

    b(zzh zzh1)
    {
        a = zzh1;
        super();
    }

    public final void zza(ry ry1, Map map)
    {
        zzh.c(a).k().zza(new c(this, map));
        ry1 = (String)map.get("overlayHtml");
        map = (String)map.get("baseUrl");
        if (TextUtils.isEmpty(map))
        {
            zzh.c(a).loadData(ry1, "text/html", "UTF-8");
            return;
        } else
        {
            zzh.c(a).loadDataWithBaseURL(map, ry1, "text/html", "UTF-8", null);
            return;
        }
    }
}
