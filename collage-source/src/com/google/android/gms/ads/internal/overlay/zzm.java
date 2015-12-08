// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzo

public class zzm extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final ImageButton zzBk;
    private final zzo zzBl;

    public zzm(Context context, int i, zzo zzo1)
    {
        super(context);
        zzBl = zzo1;
        setOnClickListener(this);
        zzBk = new ImageButton(context);
        zzBk.setImageResource(0x1080017);
        zzBk.setBackgroundColor(0);
        zzBk.setOnClickListener(this);
        zzBk.setPadding(0, 0, 0, 0);
        zzBk.setContentDescription("Interstitial close button");
        i = zzk.zzcE().zzb(context, i);
        addView(zzBk, new android.widget.FrameLayout.LayoutParams(i, i, 17));
    }

    public void onClick(View view)
    {
        if (zzBl != null)
        {
            zzBl.zzey();
        }
    }

    public void zza(boolean flag, boolean flag1)
    {
        if (flag1)
        {
            if (flag)
            {
                zzBk.setVisibility(4);
                return;
            } else
            {
                zzBk.setVisibility(8);
                return;
            }
        } else
        {
            zzBk.setVisibility(0);
            return;
        }
    }
}
