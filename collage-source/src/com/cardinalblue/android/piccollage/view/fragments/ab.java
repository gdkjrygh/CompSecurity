// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;
import com.cardinalblue.android.piccollage.helpers.PICAppRoutesService;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.view.a.d;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            h

public class ab extends h
{

    public ab()
    {
    }

    protected d a(CBCollagesResponse cbcollagesresponse)
    {
        return new d(getActivity(), cbcollagesresponse, 0x7f03008b, getResources().getInteger(0x7f09001f));
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
            k = 0x7f070219;
        } else
        {
            k = 0x7f070214;
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
        return FeedAccessorFactory.a(6, a);
    }

    protected void f()
    {
        h.setImageResource(0x7f020228);
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
            c.a(105, "own profile");
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
        return 0x7f0300ab;
    }

    protected String j()
    {
        return "user_likes";
    }

    public void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.controller.d.b(this);
    }

    public void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a(this);
    }
}
