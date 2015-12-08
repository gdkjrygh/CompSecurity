// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.a.i;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.PicUsersData;
import com.cardinalblue.android.piccollage.view.a.r;

public class ai extends Fragment
    implements com.cardinalblue.android.piccollage.view.a.r.a
{

    protected PicUser a;
    private ViewSwitcher b;
    private r c;
    private ListView d;
    private r e;
    private ListView f;
    private TextView g;
    private String h;

    public ai()
    {
        h = null;
    }

    static r a(ai ai1)
    {
        return ai1.c;
    }

    private void a(PicUser picuser)
    {
        String s = picuser.getId();
        com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation picrelation;
        if (picuser.isFollowing().booleanValue())
        {
            picrelation = com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.UNFOLLOW;
        } else
        {
            picrelation = com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.FOLLOWING;
        }
        i.a(s, picrelation, "collage search user").a(new bolts.i(picuser, s) {

            final PicUser a;
            final String b;
            final ai c;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    if (j1.f() instanceof com.cardinalblue.android.piccollage.auth.PicAuth.a)
                    {
                        c.a = a;
                        j1 = new Intent(c.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
                        j1.putExtra("from", "collage search user");
                        c.startActivityForResult(j1, 1);
                    } else
                    {
                        k.a(c.getActivity(), 0x7f0700f8, 1);
                    }
                    ai.a(c).a(b);
                    com.cardinalblue.android.piccollage.view.fragments.ai.b(c).a(b);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                c = ai.this;
                a = picuser;
                b = s;
                super();
            }
        });
    }

    private void a(String s)
    {
        g.setText(String.format(getActivity().getString(0x7f07020c), new Object[] {
            s
        }));
    }

    static r b(ai ai1)
    {
        return ai1.e;
    }

    static ViewSwitcher c(ai ai1)
    {
        return ai1.b;
    }

    private void c()
    {
        if (!k.b(getActivity()))
        {
            k.a(getActivity(), 0x7f07021d, 1);
            return;
        } else
        {
            c.e();
            return;
        }
    }

    public void a()
    {
    }

    public void a(r r1, PicUser picuser)
    {
        a(picuser);
    }

    public void b()
    {
        k.a(getActivity(), 0x7f0700f8, 1);
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        l;
        JVM INSTR tableswitch 1 1: default 28
    //                   1 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (i1 == -1)
        {
            if (a != null)
            {
                a(a);
                a = null;
            }
            c();
            onQuery(new ah.b(h));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null && bundle.containsKey("saved_try_following_user"))
        {
            a = (PicUser)bundle.getParcelable("saved_try_following_user");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ca, null);
        b = (ViewSwitcher)layoutinflater.findViewById(0x7f1000c1);
        d = (ListView)layoutinflater.findViewById(0x7f100209);
        c = new r(getActivity(), "users/suggested", new com.cardinalblue.android.piccollage.view.a.r.a() {

            final ai a;

            public void a()
            {
            }

            public void a(r r1, PicUser picuser)
            {
                a.a(r1, picuser);
            }

            public void b()
            {
            }

            
            {
                a = ai.this;
                super();
            }
        });
        d.setAdapter(c);
        d.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ai a;

            public void onItemClick(AdapterView adapterview, View view, int l, long l1)
            {
                com.cardinalblue.android.piccollage.a.b.bn();
                view = ai.a(a).a(l);
                if (view == null)
                {
                    return;
                }
                if (view.equals(PicAuth.h().i()))
                {
                    adapterview = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/HomeActivity);
                    adapterview.setAction("piccollage.intent.action.VIEW_PROFILE");
                } else
                {
                    adapterview = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/PicProfileActivity);
                }
                adapterview.putExtra("user", view);
                a.startActivity(adapterview);
            }

            
            {
                a = ai.this;
                super();
            }
        });
        c();
        f = (ListView)layoutinflater.findViewById(0x7f10020a);
        g = (TextView)layoutinflater.findViewById(0x1020004);
        f.setEmptyView(g);
        e = new r(getActivity(), "users/search", this);
        f.setAdapter(e);
        f.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ai a;

            public void onItemClick(AdapterView adapterview, View view, int l, long l1)
            {
                view = com.cardinalblue.android.piccollage.view.fragments.ai.b(a).a(l);
                if (view == null)
                {
                    return;
                }
                if (view.equals(PicAuth.h().i()))
                {
                    adapterview = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/HomeActivity);
                    adapterview.setAction("piccollage.intent.action.VIEW_PROFILE");
                } else
                {
                    adapterview = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/PicProfileActivity);
                }
                adapterview.putExtra("user", view);
                a.startActivity(adapterview);
            }

            
            {
                a = ai.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onQuery(ah.b b1)
    {
        b1 = b1.a;
        if (!TextUtils.isEmpty(b1))
        {
            h = b1;
            a(b1);
            k.a(getActivity(), e.b(new String[] {
                "q", b1
            }), getString(0x7f0701fa)).c(new bolts.i() {

                final ai a;

                public Void a(j j1)
                    throws Exception
                {
                    com.cardinalblue.android.piccollage.view.fragments.ai.b(a).f();
                    com.cardinalblue.android.piccollage.view.fragments.ai.b(a).a((PicUsersData)j1.e());
                    return null;
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = ai.this;
                super();
            }
            }, k.a).a(new bolts.i() {

                final ai a;

                public Void a(j j1)
                    throws Exception
                {
                    if (j1.d() || j1.c())
                    {
                        com.cardinalblue.android.piccollage.a.f.a(j1.f());
                    }
                    ai.c(a).setDisplayedChild(1);
                    return null;
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                a = ai.this;
                super();
            }
            });
            return;
        } else
        {
            h = null;
            b.setDisplayedChild(0);
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (a != null)
        {
            bundle.putParcelable("saved_try_following_user", a);
        }
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
