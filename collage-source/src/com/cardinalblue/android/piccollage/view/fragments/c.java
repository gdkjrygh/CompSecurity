// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewSwitcher;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.FbFriendListActivity;
import com.cardinalblue.android.piccollage.activities.FbPhotoListActivity;
import com.cardinalblue.android.piccollage.activities.login.FbLoginForReadActivity;
import com.cardinalblue.android.piccollage.controller.network.d;
import com.cardinalblue.android.piccollage.model.gson.FbAlbum;
import com.cardinalblue.android.piccollage.view.a.g;
import com.cardinalblue.android.piccollage.view.a.s;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends Fragment
    implements android.widget.AdapterView.OnItemClickListener, com.cardinalblue.android.piccollage.view.a.s.a
{

    private ViewSwitcher a;
    private GraphRequest b;
    private GraphRequestAsyncTask c;
    private s d;
    private String e;
    private View f;
    private View g;
    private final android.view.View.OnClickListener h = new android.view.View.OnClickListener() {

        final c a;

        public void onClick(View view)
        {
            a.d();
        }

            
            {
                a = c.this;
                super();
            }
    };
    private final android.view.View.OnClickListener i = new android.view.View.OnClickListener() {

        final c a;

        public void onClick(View view)
        {
            a.c();
        }

            
            {
                a = c.this;
                super();
            }
    };

    public c()
    {
    }

    static List a(c c1, String s1)
        throws JSONException
    {
        return c1.a(s1);
    }

    private List a(String s1)
        throws JSONException
    {
        List list = com.cardinalblue.android.piccollage.controller.network.d.a(s1);
        if (list.isEmpty())
        {
            e = "";
            return list;
        }
        for (int j = 0; j < list.size(); j++)
        {
            FbAlbum fbalbum = (FbAlbum)list.get(j);
            if (fbalbum.getCount() == 0)
            {
                list.remove(fbalbum);
            }
        }

        FbAlbum fbalbum1 = new FbAlbum();
        fbalbum1.setCoverPhotoUrl(null);
        fbalbum1.setName(getResources().getString(0x7f0701b9));
        fbalbum1.setId("<friends_albums>");
        list.add(0, fbalbum1);
        s1 = new JSONObject(s1);
        if (s1 != null)
        {
            s1 = s1.getJSONObject("paging");
            if (s1 != null)
            {
                s1 = s1.getJSONObject("cursors");
                if (s1 != null)
                {
                    e = s1.getString("after");
                }
            }
        }
        return list;
    }

    static void a(c c1)
    {
        c1.h();
    }

    static void a(c c1, FacebookRequestError facebookrequesterror)
    {
        c1.a(facebookrequesterror);
    }

    private void a(FacebookRequestError facebookrequesterror)
    {
        if (facebookrequesterror.getCategory() == com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE)
        {
            b();
            return;
        } else
        {
            e();
            com.cardinalblue.android.piccollage.a.f.a(facebookrequesterror.getException());
            return;
        }
    }

    private void a(String s1, com.facebook.GraphRequest.Callback callback)
    {
        i();
        Bundle bundle = new Bundle();
        bundle.putString("fields", "picture{url},name,count");
        bundle.putString("limit", "25");
        bundle.putString("after", s1);
        b = GraphRequest.newGraphPathRequest(AccessToken.getCurrentAccessToken(), "me/albums", callback);
        b.setParameters(bundle);
        c = b.executeAsync();
    }

    static s b(c c1)
    {
        return c1.d;
    }

    static String c(c c1)
    {
        return c1.e;
    }

    private void e()
    {
        g();
        f.setVisibility(0);
        g.setVisibility(8);
        Button button = (Button)f.findViewById(0x7f1001ae);
        ImageView imageview = (ImageView)f.findViewById(0x7f1001ac);
        if (!k.b(getActivity()))
        {
            imageview.setImageResource(0x7f020227);
            button.setText(0x7f070249);
            button.setOnClickListener(h);
            return;
        } else
        {
            imageview.setImageResource(0x7f020222);
            button.setText(0x7f070118);
            button.setOnClickListener(i);
            return;
        }
    }

    private void f()
    {
        g();
        g.setVisibility(0);
        f.setVisibility(8);
    }

    private void g()
    {
        boolean flag;
        if (a.getCurrentView().getId() == 0x7f1001bb)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            a.showNext();
        }
    }

    private void h()
    {
        boolean flag;
        if (a.getCurrentView().getId() == 0x102000a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            a.showNext();
        }
    }

    private void i()
    {
        if (b != null)
        {
            b.setCallback(null);
            b = null;
        }
        if (c != null)
        {
            c.cancel(true);
            c = null;
        }
    }

    public void a()
    {
        f();
        a(e, new com.facebook.GraphRequest.Callback() {

            final c a;

            public void onCompleted(GraphResponse graphresponse)
            {
                if (!k.a(a.getActivity()))
                {
                    return;
                }
                com.cardinalblue.android.piccollage.view.fragments.c.b(a).b();
                c.a(a);
                if (graphresponse.getError() != null)
                {
                    c.a(a, graphresponse.getError());
                    return;
                }
                graphresponse = c.a(a, graphresponse.getRawResponse());
                ((g)com.cardinalblue.android.piccollage.view.fragments.c.b(a).c()).addAll(graphresponse);
                graphresponse = com.cardinalblue.android.piccollage.view.fragments.c.b(a);
                boolean flag;
                if (!TextUtils.isEmpty(c.c(a)))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                try
                {
                    graphresponse.a(flag);
                    com.cardinalblue.android.piccollage.view.fragments.c.b(a).notifyDataSetChanged();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (GraphResponse graphresponse)
                {
                    com.cardinalblue.android.piccollage.a.f.a(graphresponse);
                }
                return;
            }

            
            {
                a = c.this;
                super();
            }
        });
    }

    public void b()
    {
        com.cardinalblue.android.piccollage.a.c.a(getActivity());
        c();
    }

    public void c()
    {
        com.cardinalblue.android.piccollage.a.b.ba();
        com.cardinalblue.android.piccollage.a.b.aj("facebook photos");
        Intent intent = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/login/FbLoginForReadActivity);
        getActivity().startActivityForResult(intent, 200);
    }

    public void d()
    {
        f();
        a("", new com.facebook.GraphRequest.Callback() {

            final c a;

            public void onCompleted(GraphResponse graphresponse)
            {
                if (!k.a(a.getActivity()))
                {
                    return;
                }
                c.a(a);
                if (graphresponse.getError() != null)
                {
                    c.a(a, graphresponse.getError());
                    return;
                }
                graphresponse = c.a(a, graphresponse.getRawResponse());
                ((g)com.cardinalblue.android.piccollage.view.fragments.c.b(a).c()).clear();
                ((g)com.cardinalblue.android.piccollage.view.fragments.c.b(a).c()).addAll(graphresponse);
                graphresponse = com.cardinalblue.android.piccollage.view.fragments.c.b(a);
                boolean flag;
                if (!TextUtils.isEmpty(c.c(a)))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                try
                {
                    graphresponse.a(flag);
                    com.cardinalblue.android.piccollage.view.fragments.c.b(a).notifyDataSetChanged();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (GraphResponse graphresponse)
                {
                    com.cardinalblue.android.piccollage.a.f.a(graphresponse);
                }
                return;
            }

            
            {
                a = c.this;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b1, viewgroup, false);
        a = (ViewSwitcher)layoutinflater.findViewById(0x7f1000c1);
        int j = getResources().getDimensionPixelSize(0x7f0b0137);
        d = new s(getActivity(), new g(getActivity(), j), j, j);
        d.b(this);
        viewgroup = (ListView)layoutinflater.findViewById(0x7f1001bc);
        viewgroup.setAdapter(d);
        viewgroup.setOnItemClickListener(this);
        f = layoutinflater.findViewById(0x7f1001bb);
        g = layoutinflater.findViewById(0x7f10019b);
        if (AccessToken.getCurrentAccessToken() == null)
        {
            e();
            return layoutinflater;
        } else
        {
            h();
            d();
            return layoutinflater;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        d.a(this);
        i();
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        adapterview = (FbAlbum)((g)d.c()).getItem(j);
        if (adapterview.getId().equals("<friends_albums>"))
        {
            adapterview = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/FbFriendListActivity);
            adapterview.putExtra("max_choices", getArguments().getInt("max_choices"));
            getActivity().startActivityForResult(adapterview, 201);
            return;
        } else
        {
            view = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/FbPhotoListActivity);
            view.putExtra("extra_album", adapterview);
            view.putExtra("max_choices", getArguments().getInt("max_choices"));
            getActivity().startActivityForResult(view, 201);
            return;
        }
    }
}
