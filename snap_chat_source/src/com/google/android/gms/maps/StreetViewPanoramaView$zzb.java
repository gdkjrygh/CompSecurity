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
//            StreetViewPanoramaView, StreetViewPanoramaOptions

static class zzaqG extends zza
{

    private final Context mContext;
    private final StreetViewPanoramaOptions zzaqG;
    private final ViewGroup zzaqh;
    private final List zzaqu = new ArrayList();

    (ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        zzaqh = viewgroup;
        mContext = context;
        zzaqG = streetviewpanoramaoptions;
    }
}
