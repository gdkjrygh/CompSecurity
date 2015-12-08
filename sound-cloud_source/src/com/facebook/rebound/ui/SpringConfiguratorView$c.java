// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound.ui;

import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.rebound.f;
import com.facebook.rebound.j;
import java.text.DecimalFormat;

// Referenced classes of package com.facebook.rebound.ui:
//            SpringConfiguratorView

private final class <init>
    implements android.widget.stener
{

    final SpringConfiguratorView a;

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (seekbar == SpringConfiguratorView.c(a))
        {
            float f1 = ((float)i * 200F) / 100000F + 0.0F;
            SpringConfiguratorView.b(a).b = f.a(f1);
            String s = SpringConfiguratorView.a().format(f1);
            SpringConfiguratorView.d(a).setText((new StringBuilder("T:")).append(s).toString());
        }
        if (seekbar == SpringConfiguratorView.e(a))
        {
            float f2 = ((float)i * 50F) / 100000F + 0.0F;
            SpringConfiguratorView.b(a).a = f.b(f2);
            seekbar = SpringConfiguratorView.a().format(f2);
            com.facebook.rebound.ui.SpringConfiguratorView.f(a).setText((new StringBuilder("F:")).append(seekbar).toString());
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
