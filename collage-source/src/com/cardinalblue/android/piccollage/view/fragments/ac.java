// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import java.lang.ref.WeakReference;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            h, s

public class ac extends h
{

    public ac()
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
            k = 0x7f07021a;
        } else
        {
            k = 0x7f070215;
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
        return FeedAccessorFactory.a(5, a);
    }

    protected void f()
    {
        h.setImageResource(0x7f020229);
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
            c.a(104, "own profile");
            return;
        } else
        {
            a(false);
            return;
        }
    }

    protected void h()
    {
        b.aN();
        b.a("profile page");
        b.aM("empty");
        if (!PicAuth.h().b())
        {
            b.aO();
        }
        Intent intent = Collage.a(getActivity());
        ((s)d.get()).a(this, intent, 200, null);
    }

    protected int i()
    {
        return 0x7f0300ac;
    }

    protected String j()
    {
        return "user_posts";
    }

    public void onActivityResult(int k, int l, Intent intent)
    {
        switch (k)
        {
        default:
            super.onActivityResult(k, l, intent);
            return;

        case 200: 
            a(false);
            break;
        }
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
