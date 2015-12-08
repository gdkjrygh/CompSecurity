// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.social;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.main.b;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;

// Referenced classes of package com.roidapp.photogrid.social:
//            SuggestFriendPage, b

public final class a extends b
    implements android.view.View.OnClickListener
{

    private p a;
    private x b;

    public a()
    {
    }

    static void a(a a1)
    {
        al.g().a(a1.getActivity(), "SNS", "click", "SNS/Profile/Logout", Long.valueOf(1L));
        if (af.a(a1.getActivity()))
        {
            q.a(a1.a.a, a1.b.a).a(a1);
            af.b(a1.getActivity());
            if (a1.getActivity() != null)
            {
                com.roidapp.cloudlib.sns.g.b.a().c();
            }
        }
    }

    public final View a(Context context)
    {
        t = new ab(context);
        t.a(u);
        t.d();
        return t;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0d03db)
        {
            SuggestFriendPage.a(getActivity(), false, 11);
        } else
        {
            if (view.getId() == 0x7f0d03dc)
            {
                an.a(getActivity(), "suggest users");
                return;
            }
            if (view.getId() == 0x7f0d03dd)
            {
                view = new com.roidapp.cloudlib.sns.h.a();
                n.a(getActivity().getSupportFragmentManager(), view, com/roidapp/cloudlib/sns/h/a.getSimpleName());
                return;
            }
            if (view.getId() == 0x7f0d03de)
            {
                (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f0700bf).setMessage(0x7f07036b).setPositiveButton(0x7f0700a6, new com.roidapp.photogrid.social.b(this)).setNegativeButton(0x7f07005f, null).create().show();
                return;
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
        if (a != null)
        {
            b = a.b;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300f7, null);
        layoutinflater.findViewById(0x7f0d03db).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d03dc).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d03dd).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d03de).setOnClickListener(this);
        return layoutinflater;
    }
}
