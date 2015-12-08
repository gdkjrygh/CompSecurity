// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.roidapp.photogrid.common.q;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            w, t

public final class n extends w
{

    private Activity j;
    private String k;

    public n(Activity activity, t t, String s)
    {
        super(activity, 8, t);
        j = activity;
        a = 0x7f0203eb;
        b = 0x7f07015b;
        g = 0x7f07015a;
        h = 0x7f070159;
        k = s;
    }

    public final volatile View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        return super.a(layoutinflater, view, viewgroup);
    }

    public final void onClick(View view)
    {
        if (j != null && view != null)
        {
            q.a(j);
            super.onClick(view);
        }
    }
}
