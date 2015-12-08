// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.widget:
//            j, k

public class i extends LinearLayout
{

    private WeakReference a;

    public i(Activity activity)
    {
        super(activity);
        a = new WeakReference(null);
        a(activity);
    }

    static WeakReference a(i l)
    {
        return l.a;
    }

    private void a(Activity activity)
    {
        a = new WeakReference(activity);
        activity = inflate(activity, 0x7f0300bb, this);
        activity.findViewById(0x7f0e03a7).setOnClickListener(new j(this));
        activity.findViewById(0x7f0e03a8).setOnClickListener(new k(this));
    }
}
