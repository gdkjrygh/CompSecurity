// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import java.util.concurrent.Future;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzgt, zzcm

public class zzgv
    implements zzgt.zza
{

    public zzgv()
    {
    }

    public zzcn.zza zza(zzgt zzgt1, JSONObject jsonobject)
    {
        return zzc(zzgt1, jsonobject);
    }

    public zzcm zzc(zzgt zzgt1, JSONObject jsonobject)
    {
        Future future = zzgt1.zza(jsonobject, "image", true);
        zzgt1 = zzgt1.zza(jsonobject, "secondary_image", false);
        return new zzcm(jsonobject.getString("headline"), (Drawable)future.get(), jsonobject.getString("body"), (Drawable)zzgt1.get(), jsonobject.getString("call_to_action"), jsonobject.getString("attribution"));
    }
}
