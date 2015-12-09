// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationFragmentActivity

private final class <init>
    implements android.support.v4.widget.AppDrawerListener
{

    final DestinationFragmentActivity this$0;

    public final void onDrawerClosed(View view)
    {
        DestinationFragmentActivity.access$100(DestinationFragmentActivity.this).onDrawerClosed(view);
        DestinationFragmentActivity.this.onDrawerClosed();
    }

    public final void onDrawerOpened(View view)
    {
        DestinationFragmentActivity.access$100(DestinationFragmentActivity.this).onDrawerOpened(view);
        if (!SharedPrefsConfig.getBoolean(DestinationFragmentActivity.this, "drawerHasBeenOpened", false))
        {
            SharedPrefsConfig.setBoolean(DestinationFragmentActivity.this, "drawerHasBeenOpened", true);
        }
        DestinationFragmentActivity.this.onDrawerOpened();
    }

    public final void onDrawerSlide(View view, float f)
    {
        DestinationFragmentActivity.access$100(DestinationFragmentActivity.this).onDrawerSlide(view, f);
        DestinationFragmentActivity.onDrawerSlide$5359e7dd();
    }

    public final void onDrawerStateChanged(int i)
    {
        ActionBarDrawerToggle _tmp = DestinationFragmentActivity.access$100(DestinationFragmentActivity.this);
    }

    private ()
    {
        this$0 = DestinationFragmentActivity.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
