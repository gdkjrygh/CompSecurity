// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.a.d;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            i

public class l extends i
{

    public l()
    {
    }

    protected View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        setHasOptionsMenu(true);
        return layoutinflater.inflate(0x7f0300d0, viewgroup, false);
    }

    protected d a(CBCollagesResponse cbcollagesresponse)
    {
        return new d(getActivity(), cbcollagesresponse, 0x7f03008b, getResources().getInteger(0x7f09001f));
    }

    protected boolean a(Exception exception)
    {
        if (exception instanceof com.cardinalblue.android.piccollage.controller.network.f.g)
        {
            return true;
        }
        if (exception instanceof com.cardinalblue.android.piccollage.auth.PicAuth.a)
        {
            com.cardinalblue.android.piccollage.a.f.a(exception);
            k.a(getActivity(), 0x7f0700f8, 0);
            return true;
        } else
        {
            return false;
        }
    }

    protected com.cardinalblue.android.piccollage.controller.FeedAccessorFactory.FeedAccessor e()
    {
        return FeedAccessorFactory.a(2, null);
    }

    protected void f()
    {
        h.setImageResource(0x7f020229);
        i.setText(0x7f0700f8);
        j.setText(0x7f070249);
    }

    protected void g()
    {
        a(false);
    }

    protected void h()
    {
        a(false);
    }

    protected int i()
    {
        return 0x7f0300a5;
    }

    protected String j()
    {
        return "contests";
    }

    public void onResume()
    {
        super.onResume();
        a(true);
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
