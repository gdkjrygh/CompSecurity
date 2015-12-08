// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.tab;

import android.app.Activity;

// Referenced classes of package com.hmobile.tab:
//            TabView

public abstract class TabHostProvider
{

    public Activity context;

    public TabHostProvider(Activity activity)
    {
        context = activity;
    }

    public abstract TabView getTabHost(String s);
}
