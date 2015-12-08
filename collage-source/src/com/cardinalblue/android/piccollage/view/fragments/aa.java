// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.gson.PicUser;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            h

public class aa extends h
{

    public aa()
    {
    }

    protected void a(View view)
    {
        PicUser picuser = PicAuth.h().i();
        if (picuser == null || TextUtils.isEmpty(a))
        {
            return;
        }
        int k;
        if (picuser.getId().equals(a))
        {
            k = 0x7f070217;
        } else
        {
            k = 0x7f070213;
        }
        ((TextView)view.findViewById(0x7f1001ad)).setText(k);
        if (picuser.getId().equals(a))
        {
            k = 0;
        } else
        {
            k = 8;
        }
        view.findViewById(0x7f1001ae).setVisibility(k);
    }

    protected com.cardinalblue.android.piccollage.controller.FeedAccessorFactory.FeedAccessor e()
    {
        return FeedAccessorFactory.a(7, a);
    }

    protected void f()
    {
        h.setImageResource(0x7f02022b);
        if (!PicAuth.h().b())
        {
            i.setText(0x7f0701dc);
            j.setText(0x7f070278);
            return;
        } else
        {
            i.setText(0x7f0700f8);
            j.setText(0x7f070249);
            return;
        }
    }

    protected void g()
    {
        if (!PicAuth.h().b())
        {
            c.a(106, "own profile");
            return;
        } else
        {
            a(false);
            return;
        }
    }

    protected void h()
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("app");
        builder.path("explore/featured");
        PICAppRoutesService.a(getActivity(), builder.toString());
    }

    protected int i()
    {
        return 0x7f0300aa;
    }

    protected String j()
    {
        return "user_echoes";
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
