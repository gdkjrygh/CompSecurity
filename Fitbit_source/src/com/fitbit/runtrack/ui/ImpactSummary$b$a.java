// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ImpactSummary

private static class wable
{

    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public (View view)
    {
        a = (ImageView)view.findViewById(0x7f1100c4);
        b = (TextView)view.findViewById(0x7f110429);
        c = (TextView)view.findViewById(0x7f11042a);
          = new nit>(100);
        view = view.getContext();
        .nit>(view.getResources().getColor(0x7f0f008d), 5F);
        int ai[] = new int[4];
        int[] _tmp = ai;
        ai[0] = 0x30000;
        ai[1] = 0x40000;
        ai[2] = 0x20000;
        ai[3] = 0x70000;
        int ai1[] = new int[7];
        ai1[0] = view.getResources().getColor(0x7f0f008c);
        for (int i = 1; i < ai1.length; i++)
        {
            ai1[i] = ai1[i - 1] + ai[(i - 1) % ai.length];
        }

        .nit>(ai1);
        a.setBackgroundDrawable();
    }
}
