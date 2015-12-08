// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            nb, mv, rl, dw

public final class nd
    implements nb
{

    private final boolean a;
    private final boolean b;

    public nd(boolean flag, boolean flag1)
    {
        a = flag;
        b = flag1;
    }

    public final com.google.android.gms.ads.internal.formats.zzh.zza a(mv mv1, JSONObject jsonobject)
    {
        Object obj = mv1.a(jsonobject, "images", true, a, b);
        rl rl1 = mv1.a(jsonobject, "app_icon", true, a);
        mv1 = mv1.a(jsonobject);
        ArrayList arraylist = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((rl)((Iterator) (obj)).next()).get())) { }
        return new zzd(jsonobject.getString("headline"), arraylist, jsonobject.getString("body"), (dw)rl1.get(), jsonobject.getString("call_to_action"), jsonobject.optDouble("rating", -1D), jsonobject.optString("store"), jsonobject.optString("price"), (zza)mv1.get(), new Bundle());
    }
}
