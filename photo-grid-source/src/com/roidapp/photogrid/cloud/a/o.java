// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            w, t

public final class o extends w
{

    private String j;

    public o(Context context, t t)
    {
        int k = 0x7f0702ee;
        super(context, 6, t);
        boolean flag;
        int i;
        if (Math.random() < 0.5D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i = 0x7f020274;
        } else
        {
            i = 0x7f020273;
        }
        a = i;
        if (flag)
        {
            i = 0x7f0702ee;
        } else
        {
            i = 0x7f0702e9;
        }
        b = i;
        if (flag)
        {
            i = 0x7f070129;
        } else
        {
            i = 0x7f070127;
        }
        g = i;
        if (flag)
        {
            i = k;
        } else
        {
            i = 0x7f0702e9;
        }
        h = i;
        if (flag)
        {
            context = "http://instagram.com/photogridorg";
        } else
        {
            context = "https://m.facebook.com/photogridorg";
        }
        j = context;
    }

    public final volatile View a(LayoutInflater layoutinflater, View view, ViewGroup viewgroup)
    {
        return super.a(layoutinflater, view, viewgroup);
    }

    public final void onClick(View view)
    {
        if (d != null && j != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(j));
            intent.setFlags(0x10000000);
            try
            {
                d.startActivity(intent);
            }
            catch (ActivityNotFoundException activitynotfoundexception) { }
        }
        super.onClick(view);
    }
}
