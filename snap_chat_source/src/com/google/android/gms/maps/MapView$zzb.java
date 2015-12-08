// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.zza;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            MapView, GoogleMapOptions

static class zzaqi extends zza
{

    private final Context mContext;
    private final List zzaqb = new ArrayList();
    private final ViewGroup zzaqh;
    private final GoogleMapOptions zzaqi;

    ions(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        zzaqh = viewgroup;
        mContext = context;
        zzaqi = googlemapoptions;
    }
}
