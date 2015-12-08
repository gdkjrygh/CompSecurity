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
//            StreetViewPanoramaOptions

public class StreetViewPanoramaView extends FrameLayout
{
    static class zzb extends zza
    {

        private final Context mContext;
        private final StreetViewPanoramaOptions zzaqG;
        private final ViewGroup zzaqh;
        private final List zzaqu = new ArrayList();

        zzb(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
        {
            zzaqh = viewgroup;
            mContext = context;
            zzaqG = streetviewpanoramaoptions;
        }
    }


    private final zzb zzaqC;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
        zzaqC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaqC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaqC = new zzb(this, context, null);
    }
}
