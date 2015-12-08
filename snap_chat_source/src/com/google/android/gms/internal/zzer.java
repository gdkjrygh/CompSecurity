// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

// Referenced classes of package com.google.android.gms.internal:
//            zzbe, zzhw, zzet

public class zzer extends FrameLayout
    implements android.view.View.OnClickListener
{

    private final ImageButton zzuJ;
    private final zzet zzuK;

    public zzer(Context context, int i, zzet zzet1)
    {
        super(context);
        zzuK = zzet1;
        setOnClickListener(this);
        zzuJ = new ImageButton(context);
        zzuJ.setImageResource(0x1080017);
        zzuJ.setBackgroundColor(0);
        zzuJ.setOnClickListener(this);
        zzuJ.setPadding(0, 0, 0, 0);
        zzuJ.setContentDescription("Interstitial close button");
        i = zzbe.zzbD().zzb(context, i);
        addView(zzuJ, new android.widget.FrameLayout.LayoutParams(i, i, 17));
    }

    public void onClick(View view)
    {
        if (zzuK != null)
        {
            zzuK.zzdd();
        }
    }

    public void zza(boolean flag, boolean flag1)
    {
        if (flag1)
        {
            if (flag)
            {
                zzuJ.setVisibility(4);
                return;
            } else
            {
                zzuJ.setVisibility(8);
                return;
            }
        } else
        {
            zzuJ.setVisibility(0);
            return;
        }
    }
}
