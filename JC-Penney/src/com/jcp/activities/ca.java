// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.jcp.b.b;
import com.jcp.productentity.Image;
import com.jcp.productentity.OptionValueEntity;
import com.jcp.util.au;

// Referenced classes of package com.jcp.activities:
//            ViewPagerWithZoomActivity, cb

class ca
    implements android.view.View.OnClickListener
{

    final ViewPagerWithZoomActivity a;

    ca(ViewPagerWithZoomActivity viewpagerwithzoomactivity)
    {
        a = viewpagerwithzoomactivity;
        super();
    }

    public void onClick(View view)
    {
        if (b.a(a))
        {
            ViewPagerWithZoomActivity.a(a, (OptionValueEntity)view.getTag());
            if (!TextUtils.isEmpty(ViewPagerWithZoomActivity.a(a).getImage().getUrl()))
            {
                ViewPagerWithZoomActivity.a(a, ViewPagerWithZoomActivity.a(a).getUrl());
                (new cb(a, com.jcp.activities.ViewPagerWithZoomActivity.b(a))).execute(new Void[0]);
            }
            return;
        } else
        {
            au.a(a, a.getResources().getString(0x7f0702b9), a.getResources().getString(0x7f0702b8));
            return;
        }
    }
}
