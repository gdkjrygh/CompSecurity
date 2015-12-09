// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.os.Bundle;
import android.support.v4.widget.CBSwipeRefreshLayout;
import android.view.View;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.NotificationResponse;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            f

public class b extends com.cardinalblue.android.piccollage.view.fragments.f
{

    private boolean b;

    public b()
    {
    }

    protected void a(int i, com.android.volley.m.b b1, com.android.volley.m.a a1)
    {
        if (b)
        {
            f.b(getActivity(), i, b1, a1);
            return;
        } else
        {
            f.a(getActivity(), i, b1, a1);
            return;
        }
    }

    protected void a(View view)
    {
        b = getArguments().getBoolean("extra_is_global_feed", false);
    }

    protected int b()
    {
        return 0x7f0300b0;
    }

    public void onRefresh()
    {
        a(0, new com.android.volley.m.b() {

            final b a;

            public void a(NotificationResponse notificationresponse)
            {
                a.a(notificationresponse);
                if (a.a.isRefreshing())
                {
                    a.a.setRefreshing(false);
                }
            }

            public volatile void a(Object obj)
            {
                a((NotificationResponse)obj);
            }

            
            {
                a = b.this;
                super();
            }
        }, this);
    }

    public void onStart()
    {
        super.onStart();
        d.b(this);
    }

    public void onStop()
    {
        super.onStop();
        d.a(this);
    }
}
