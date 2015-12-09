// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzek, zzbh, zzbe

public class zzem
    implements zzek.zza
{

    public zzem()
    {
    }

    public zzbi.zza zza(zzek zzek1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        return zzc(zzek1, jsonobject);
    }

    public zzbh zzc(zzek zzek1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        zzfv zzfv = zzek1.zza(jsonobject, "image", true);
        zzfv zzfv1 = zzek1.zza(jsonobject, "secondary_image", false);
        zzek1 = zzek1.zze(jsonobject);
        return new zzbh(jsonobject.getString("headline"), (Drawable)zzfv.get(), jsonobject.getString("body"), (Drawable)zzfv1.get(), jsonobject.getString("call_to_action"), jsonobject.getString("advertiser"), (zzbe)zzek1.get());
    }
}
