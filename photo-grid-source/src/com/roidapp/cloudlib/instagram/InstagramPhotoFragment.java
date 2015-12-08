// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ad;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.t;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            n, InstagramListCloud, p, r, 
//            s, q, o

public class InstagramPhotoFragment extends t
{

    private final String o = "InstagramFragment";
    private String p;
    private int q;
    private boolean r;
    private RelativeLayout s;
    private android.content.DialogInterface.OnClickListener t;

    public InstagramPhotoFragment()
    {
        q = 1;
        r = false;
        t = new n(this);
    }

    static void a(InstagramPhotoFragment instagramphotofragment)
    {
        instagramphotofragment.startActivity(new Intent(instagramphotofragment.getActivity(), com/roidapp/cloudlib/instagram/InstagramListCloud));
        instagramphotofragment.getActivity().finish();
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            s.setVisibility(0);
            return;
        } else
        {
            s.setVisibility(8);
            return;
        }
    }

    public final void a(r r1, int i)
    {
        a(false);
        if (r1 != null)
        {
            if (d != null)
            {
                com.roidapp.cloudlib.instagram.p.a((p)d).a.addAll(r1.a);
                d.notifyDataSetChanged();
            }
            q = q + 1;
            return;
        }
        r1 = getActivity();
        if (i == -1)
        {
            i = at.aZ;
        } else
        {
            i = at.T;
        }
        Toast.makeText(r1, i, 0).show();
    }

    public final void d()
    {
        boolean flag;
        for (flag = true; !r && q == 2 || r && q != 1 && !com.roidapp.cloudlib.instagram.r.b() || s.getVisibility() != 8;)
        {
            return;
        }

        a(true);
        com.roidapp.cloudlib.ah ah = null;
        String s1 = ah;
        try
        {
            if (!r)
            {
                break MISSING_BLOCK_LABEL_82;
            }
        }
        catch (Exception exception)
        {
            return;
        }
        s1 = ah;
        if (q == 1)
        {
            s1 = p;
        }
        ah = k;
        if (r)
        {
            flag = false;
        }
        (new Thread(new s(this, ah, flag, s1))).start();
        return;
    }

    public final void g()
    {
        q = 1;
        if (d != null)
        {
            ((p)d).b();
            d = null;
        }
        d = new p(this, getActivity());
        c.setAdapter(d);
        d();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = new p(this, getActivity());
        k = new q(getActivity(), this);
        a(k);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.K, viewgroup, false);
        a(layoutinflater);
        b(layoutinflater);
        s = (RelativeLayout)layoutinflater.findViewById(ar.l);
        if (com.roidapp.cloudlib.common.a.f(getActivity()) == 1)
        {
            viewgroup = com.roidapp.cloudlib.common.a.d(getActivity());
            if (!TextUtils.isEmpty(viewgroup))
            {
                bundle = com.roidapp.cloudlib.common.a.c(getActivity());
                r = true;
                p = (new StringBuilder("https://api.instagram.com/v1/users/")).append(bundle).append("/media/recent/?access_token=").append(viewgroup).toString();
            }
        }
        if (!l.b(getActivity()))
        {
            l.a(getActivity(), t, new o(this));
            return layoutinflater;
        } else
        {
            d();
            return layoutinflater;
        }
    }

    public void onDestroy()
    {
        c.setAdapter(null);
        ((p)d).b();
        d = null;
        super.onDestroy();
    }
}
