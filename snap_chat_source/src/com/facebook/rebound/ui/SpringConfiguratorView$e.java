// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound.ui;

import android.view.View;
import android.widget.AdapterView;
import cV;
import java.util.List;

// Referenced classes of package com.facebook.rebound.ui:
//            SpringConfiguratorView

final class <init>
    implements android.widget.dListener
{

    private SpringConfiguratorView a;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        SpringConfiguratorView.a(a, (cV)SpringConfiguratorView.a(a).get(i));
        SpringConfiguratorView.b(a, SpringConfiguratorView.b(a));
    }

    public final void onNothingSelected(AdapterView adapterview)
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
