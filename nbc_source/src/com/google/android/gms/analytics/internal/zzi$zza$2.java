// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzi

class zzKf
    implements Runnable
{

    final zzKf zzKe;
    final ComponentName zzKf;

    public void run()
    {
        zzi.zza(zzKe.Ka, zzKf);
    }

    _cls9(_cls9 _pcls9, ComponentName componentname)
    {
        zzKe = _pcls9;
        zzKf = componentname;
        super();
    }
}
