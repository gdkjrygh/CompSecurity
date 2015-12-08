// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.i;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.activities.login.FbLoginForReadActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.view.a.r;
import com.facebook.AccessToken;
import java.lang.ref.WeakReference;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            s

public class ad extends Fragment
    implements android.widget.AdapterView.OnItemClickListener, com.cardinalblue.android.piccollage.view.a.r.a
{

    protected WeakReference a;
    private int b;
    private r c;
    private ViewSwitcher d;
    private ViewSwitcher e;
    private View f;
    private boolean g;
    private View h;

    public ad()
    {
        g = false;
    }

    private String a(boolean flag)
    {
        switch (b)
        {
        default:
            if (flag)
            {
                return "other_profile";
            } else
            {
                return "own_profile";
            }

        case 2: // '\002'
            return "collage_likers_list";

        case 4: // '\004'
            return "find_facebook_friend";

        case 3: // '\003'
            return "find_featured_friend";

        case 5: // '\005'
            return "invite_friend";

        case 0: // '\0'
            if (flag)
            {
                return "other_profile_following_list";
            } else
            {
                return "owner_profile_following_list";
            }

        case 1: // '\001'
            break;
        }
        if (flag)
        {
            return "other_profile_follower_list";
        } else
        {
            return "owner_profile_follower_list";
        }
    }

    static void a(ad ad1)
    {
        ad1.g();
    }

    private transient boolean b(String as[])
    {
        if (!k.b(getActivity()))
        {
            k.a(getActivity(), 0x7f07021d, 1);
            return false;
        } else
        {
            c.a(as);
            return true;
        }
    }

    private void f()
    {
        ImageView imageview = (ImageView)f.findViewById(0x7f1001e6);
        TextView textview = (TextView)f.findViewById(0x7f1001e7);
        Button button = (Button)f.findViewById(0x7f10014d);
        switch (b)
        {
        default:
            return;

        case 3: // '\003'
            textview.setText(0x7f0701b2);
            button.setText(0x7f070278);
            button.setBackgroundResource(0x7f02028e);
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final ad a;

                public void onClick(View view)
                {
                    view = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
                    view.putExtra("key_pic_login_purpose", PicLoginActivity.c);
                    view.putExtra("from", "find friend");
                    if (a.a != null)
                    {
                        s s1 = (s)a.a.get();
                        if (s1 != null)
                        {
                            s1.a(a, view, 1, null);
                        }
                        return;
                    } else
                    {
                        a.startActivityForResult(view, 1);
                        return;
                    }
                }

            
            {
                a = ad.this;
                super();
            }
            });
            return;

        case 4: // '\004'
            imageview.setImageResource(0x7f020221);
            break;
        }
        textview.setText(0x7f0701b2);
        button.setBackgroundResource(0x7f02028c);
        button.setText(0x7f070118);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final ad a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.K();
                view = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/login/FbLoginForReadActivity);
                if (a.a != null)
                {
                    s s1 = (s)a.a.get();
                    if (s1 != null)
                    {
                        s1.a(a, view, 1, null);
                    }
                    return;
                } else
                {
                    a.startActivityForResult(view, 1);
                    return;
                }
            }

            
            {
                a = ad.this;
                super();
            }
        });
    }

    private void g()
    {
        e.setDisplayedChild(0);
    }

    public void a()
    {
        e.setDisplayedChild(1);
        g = false;
        h.setVisibility(8);
    }

    public void a(r r1, PicUser picuser)
    {
        Object obj;
        Object obj1;
        String s;
        String s1;
        boolean flag;
        if (!picuser.isMe())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = a(flag);
        s1 = picuser.getId();
        if (picuser.isFollowing().booleanValue())
        {
            picuser = com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.UNFOLLOW;
        } else
        {
            picuser = com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.FOLLOWING;
        }
        obj1 = PicAuth.h();
        obj = ((PicAuth) (obj1)).i();
        b;
        JVM INSTR tableswitch 3 4: default 76
    //                   3 164
    //                   4 118;
           goto _L1 _L2 _L3
_L1:
        i.a(s1, picuser, s).a(new bolts.i(s, r1, s1) {

            final String a;
            final r b;
            final String c;
            final ad d;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d())
                {
                    if (j1.f() instanceof com.cardinalblue.android.piccollage.auth.PicAuth.a)
                    {
                        ad.a(d);
                        j1 = new Intent(d.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
                        j1.putExtra("from", a);
                        d.startActivityForResult(j1, 3);
                    } else
                    {
                        k.a(d.getActivity(), 0x7f0700f8, 1);
                    }
                    b.a(c);
                }
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                d = ad.this;
                a = s;
                b = r1;
                c = s1;
                super();
            }
        }, k.a);
        return;
_L3:
        if (obj != null)
        {
            obj = String.valueOf(((PicUser) (obj)).getFollowingCount());
        } else
        {
            obj = "-1";
        }
        if (((PicAuth) (obj1)).b())
        {
            obj1 = "yes";
        } else
        {
            obj1 = "no";
        }
        com.cardinalblue.android.piccollage.a.b.b(((String) (obj)), ((String) (obj1)));
        continue; /* Loop/switch isn't completed */
_L2:
        if (obj != null)
        {
            obj = String.valueOf(((PicUser) (obj)).getFollowingCount());
        } else
        {
            obj = "-1";
        }
        if (((PicAuth) (obj1)).b())
        {
            obj1 = "yes";
        } else
        {
            obj1 = "no";
        }
        com.cardinalblue.android.piccollage.a.b.c(((String) (obj)), ((String) (obj1)));
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void a(s s)
    {
        a = new WeakReference(s);
    }

    public transient void a(String as[])
    {
        g();
        c.f();
        if (!b(as))
        {
            e.setDisplayedChild(1);
            h.setVisibility(0);
            g = false;
        }
    }

    public void b()
    {
        g = false;
        k.a(getActivity(), 0x7f0700f8, 1);
        h.setVisibility(0);
    }

    public void c()
    {
        d.setDisplayedChild(1);
    }

    public void d()
    {
        d.setDisplayedChild(0);
    }

    public void e()
    {
        if (b == 4 && AccessToken.getCurrentAccessToken() == null)
        {
            c();
        } else
        {
            if (b == 6)
            {
                a();
                return;
            }
            if (!g && c != null)
            {
                g = true;
                g();
                if (!b(new String[0]))
                {
                    e.setDisplayedChild(1);
                    h.setVisibility(0);
                    g = false;
                    return;
                }
            }
        }
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        l;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 37
    //                   3 51;
           goto _L1 _L2 _L2 _L3
_L1:
        return;
_L2:
        if (i1 == -1)
        {
            d();
            e();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (i1 == -1)
        {
            e();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300c5, viewgroup, false);
        viewgroup = getArguments();
        b = viewgroup.getInt("type");
        viewgroup = viewgroup.getString("user_list_path");
        d = (ViewSwitcher)layoutinflater.findViewById(0x7f1001ff);
        e = (ViewSwitcher)layoutinflater.findViewById(0x7f100200);
        c = new r(getActivity(), viewgroup, this);
        viewgroup = (ListView)layoutinflater.findViewById(0x7f100201);
        viewgroup.setAdapter(c);
        viewgroup.setOnItemClickListener(this);
        h = layoutinflater.findViewById(0x7f100202);
        h.setVisibility(8);
        ((TextView)layoutinflater.findViewById(0x7f1001ad)).setText(0x7f0700f8);
        viewgroup = (Button)layoutinflater.findViewById(0x7f1001ae);
        viewgroup.setText(0x7f070249);
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            final ad a;

            public void onClick(View view)
            {
                a.e();
            }

            
            {
                a = ad.this;
                super();
            }
        });
        f = layoutinflater.findViewById(0x7f100203);
        b;
        JVM INSTR tableswitch 0 6: default 224
    //                   0 243
    //                   1 230
    //                   2 256
    //                   3 280
    //                   4 273
    //                   5 224
    //                   6 287;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7
_L1:
        e();
        return layoutinflater;
_L3:
        getActivity().setTitle(0x7f0701b4);
        continue; /* Loop/switch isn't completed */
_L2:
        getActivity().setTitle(0x7f0701b5);
        continue; /* Loop/switch isn't completed */
_L4:
        getActivity().setTitle(getString(0x7f0700ed));
        continue; /* Loop/switch isn't completed */
_L6:
        f();
        continue; /* Loop/switch isn't completed */
_L5:
        f();
        continue; /* Loop/switch isn't completed */
_L7:
        getActivity().setTitle(getString(0x7f0701b0));
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (c != null)
        {
            c.d();
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
        PicUser picuser = c.a(l);
        if (picuser == null)
        {
            return;
        }
        if (picuser.equals(PicAuth.h().i()))
        {
            adapterview = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/HomeActivity);
            adapterview.setAction("piccollage.intent.action.VIEW_PROFILE");
        } else
        {
            adapterview = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/PicProfileActivity);
        }
        adapterview.putExtra("user", picuser);
        view = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), view.findViewById(0x7f10022d), getString(0x7f0703aa));
        ActivityCompat.startActivity(getActivity(), adapterview, view.toBundle());
    }

    public void onStart()
    {
        super.onStart();
        if (c != null)
        {
            c.c();
        }
    }

    public void onStop()
    {
        super.onStop();
        if (c != null)
        {
            c.b();
        }
    }

    public String toString()
    {
        switch (b)
        {
        default:
            return "PicUserListFragment";

        case 0: // '\0'
            return "Following List";

        case 1: // '\001'
            return "Follower List";

        case 2: // '\002'
            return "Likers List";
        }
    }
}
