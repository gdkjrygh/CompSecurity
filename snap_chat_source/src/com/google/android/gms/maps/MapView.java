// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.zza;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class MapView extends FrameLayout
{
    static class zzb extends zza
    {

        private final Context mContext;
        private final List zzaqb = new ArrayList();
        private final ViewGroup zzaqh;
        private final GoogleMapOptions zzaqi;

        zzb(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            zzaqh = viewgroup;
            mContext = context;
            zzaqi = googlemapoptions;
        }
    }


    private final zzb zzaqc;

    public MapView(Context context)
    {
        super(context);
        zzaqc = new zzb(this, context, null);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaqc = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaqc = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }
}
