// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound.ui;

import android.widget.SeekBar;
import android.widget.TextView;
import cQ;
import cV;
import java.text.DecimalFormat;

// Referenced classes of package com.facebook.rebound.ui:
//            SpringConfiguratorView

final class <init>
    implements android.widget.stener
{

    private SpringConfiguratorView a;

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (seekbar == SpringConfiguratorView.c(a))
        {
            float f = ((float)i * 200F) / 100000F + 0.0F;
            SpringConfiguratorView.b(a).b = cQ.a(f);
            String s = SpringConfiguratorView.a().format(f);
            SpringConfiguratorView.d(a).setText((new StringBuilder("T:")).append(s).toString());
        }
        if (seekbar == SpringConfiguratorView.e(a))
        {
            float f1 = ((float)i * 50F) / 100000F + 0.0F;
            SpringConfiguratorView.b(a).a = cQ.b(f1);
            seekbar = SpringConfiguratorView.a().format(f1);
            SpringConfiguratorView.f(a).setText((new StringBuilder("F:")).append(seekbar).toString());
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    private (SpringConfiguratorView springconfiguratorview)
    {
        a = springconfiguratorview;
        super();
    }

    a(SpringConfiguratorView springconfiguratorview, byte byte0)
    {
        this(springconfiguratorview);
    }
}
