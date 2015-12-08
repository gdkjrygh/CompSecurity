// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui;

import android.view.View;
import android.widget.TabHost;

final class val.host
    implements android.widget.ntentFactory
{

    final TabHost val$host;

    public final View createTabContent(String s)
    {
        return new View(val$host.getContext());
    }

    entFactory()
    {
        val$host = tabhost;
        super();
    }
}
