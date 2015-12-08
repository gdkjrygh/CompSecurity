// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.a.i;
import com.crashlytics.android.Crashlytics;
import com.tinder.a.f;
import com.tinder.activities.ActivityAddPhoto;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.e.s;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.model.FacebookAlbum;
import com.tinder.parse.c;
import com.tinder.utils.v;
import com.tinder.views.CustomActionBar;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            a

public final class e extends Fragment
    implements android.view.View.OnClickListener, s
{

    com.tinder.managers.f a;
    private ProgressBar b;
    private ListView c;
    private TextView d;
    private com.tinder.adapters.c e;
    private String f;
    private String g;

    public e()
    {
    }

    static ProgressBar a(e e1)
    {
        return e1.b;
    }

    static void a(e e1, JSONObject jsonobject)
    {
        ArrayList arraylist;
        int j;
        j = 0;
        arraylist = new ArrayList();
        FacebookAlbum facebookalbum;
        arraylist.addAll(com.tinder.parse.c.a(jsonobject, e1.g));
        facebookalbum = new FacebookAlbum();
        if (jsonobject.has("photos"))
        {
            jsonobject = jsonobject.getJSONObject("photos");
            if (jsonobject.has("data"))
            {
                jsonobject = jsonobject.getJSONArray("data");
                facebookalbum.thumbnailUrl = jsonobject.getJSONObject(0).getString("picture");
                facebookalbum.count = jsonobject.length();
                facebookalbum.id = "tagged";
                facebookalbum.name = "Photos of Me";
            }
        }
        e1.e.a(arraylist);
        if (facebookalbum.id != null)
        {
            e1.e.a(facebookalbum);
        }
        e1.b.setVisibility(8);
        if (e1.e.getCount() != 0)
        {
            j = 8;
        }
        e1.d.setVisibility(j);
        e1.b();
        return;
        jsonobject;
        v.b(jsonobject.getMessage());
        e1.e.a(arraylist);
        throw new NullPointerException();
        jsonobject;
        e1.e.a(arraylist);
        throw new NullPointerException();
    }

    static TextView b(e e1)
    {
        return e1.d;
    }

    private void b()
    {
        c.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final e a;

            public final void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                adapterview = com.tinder.fragments.e.c(a).a(j).id;
                view = com.tinder.fragments.e.c(a).a(j).name;
                ActivityAddPhoto activityaddphoto = (ActivityAddPhoto)a.getActivity();
                (new StringBuilder("albumId=")).append(adapterview).append(", albumName=").append(view);
                Bundle bundle = new Bundle();
                bundle.putString("id", adapterview);
                bundle.putString("name", view);
                activityaddphoto.c.setArguments(bundle);
                activityaddphoto.c(activityaddphoto.c);
                activityaddphoto.H().setMenu(activityaddphoto.d);
                activityaddphoto.e = false;
            }

            
            {
                a = e.this;
                super();
            }
        });
    }

    static com.tinder.adapters.c c(e e1)
    {
        return e1.e;
    }

    public final void a()
    {
        d.setVisibility(8);
        i j = new i(f, new com.android.volley.i.b() {

            final e a;

            public final volatile void a(Object obj)
            {
                obj = (JSONObject)obj;
                e.a(a, ((JSONObject) (obj)));
            }

            
            {
                a = e.this;
                super();
            }
        }, new com.android.volley.i.a() {

            final e a;

            public final void a(VolleyError volleyerror)
            {
                if (volleyerror != null && volleyerror.getMessage() != null)
                {
                    Crashlytics.a(volleyerror.toString());
                    v.b(volleyerror.getMessage());
                }
                e.a(a).setVisibility(8);
                e.b(a).setVisibility(0);
            }

            
            {
                a = e.this;
                super();
            }
        });
        j.j = new com.android.volley.c(10000, 0, 1.0F);
        ManagerApp.b().a(j);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        ManagerApp.h().a(this);
    }

    public final void onClick(View view)
    {
        getActivity().onBackPressed();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(0x7f03008d, viewgroup, false);
        b = (ProgressBar)layoutinflater.findViewById(0x7f0e00a3);
        d = (TextView)layoutinflater.findViewById(0x7f0e021f);
        c = (ListView)layoutinflater.findViewById(0x7f0e0220);
        if (e == null)
        {
            e = new com.tinder.adapters.c(getActivity());
        }
        c.setAdapter(e);
        if (!e.isEmpty())
        {
            b.setVisibility(8);
        }
        g = com.tinder.managers.f.a();
        viewgroup = g;
        f = (new StringBuilder("https://graph.facebook.com/me?fields=albums.limit(5000).fields(id,name,count),photos.limit(5000).fields(id,picture)&access_token=")).append(viewgroup).toString();
        ((ActivitySignedInBase)getActivity()).H().setMenu(this);
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
    }

    public final void onMenuItemClick(int j)
    {
        switch (j)
        {
        default:
            return;

        case 2130837995: 
            getActivity().onBackPressed();
            break;
        }
    }

    public final void onResume()
    {
        super.onResume();
        ((ActivitySignedInBase)getActivity()).H().setMenu(this);
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a();
    }
}
