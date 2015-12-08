// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.user.ProfileModel;

public final class fkp extends BaseAdapter
    implements esp
{

    public final ProfileModel a[];
    private final Context b;
    private final String c;
    private final gji d;

    public fkp(Context context, ProfileModel aprofilemodel[], String s)
    {
        b = context;
        a = aprofilemodel;
        c = s;
        aprofilemodel = (FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager);
        s = a;
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            ProfileModel profilemodel = s[i];
            aprofilemodel.a(profilemodel.getFollowData());
            aprofilemodel.a(profilemodel.getUri(), this);
        }

        dmz.a(gjj);
        d = gjj.a(context);
    }

    public final void a(eso eso1)
    {
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a.length;
    }

    public final Object getItem(int i)
    {
        return a[i];
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        ProfileModel profilemodel = (ProfileModel)getItem(i);
        eso eso1 = profilemodel.getFollowData();
        Resources resources = b.getResources();
        dhu dhu1 = dhu.b(view);
        View view1;
        gji gji1;
        android.widget.ImageView imageview;
        if (dhu1 == null)
        {
            dhu1 = dhv.e(b, viewgroup);
            dhu1.e(true);
            viewgroup = esn.a(b);
            dhu1.a(viewgroup);
        } else
        {
            viewgroup = dhu1.x();
        }
        view = profilemodel.getImageHttpUrl();
        if (view != null)
        {
            view = view.trim();
        }
        gji1 = d;
        imageview = ((dib)dhu1.u()).d();
        view1 = view;
        if (TextUtils.isEmpty(view))
        {
            view1 = null;
        }
        gji1.b(imageview, view1);
        ((dib)dhu1.u()).a(profilemodel.getDisplayName());
        i = eso1.c;
        view = resources.getQuantityString(0x7f09001b, i, new Object[] {
            Integer.valueOf(i)
        });
        ((dib)dhu1.u()).c(view);
        ((Checkable)viewgroup).setChecked(eso1.d);
        viewgroup.setOnClickListener(new android.view.View.OnClickListener(profilemodel, viewgroup) {

            private ProfileModel a;
            private View b;

            public final void onClick(View view2)
            {
                ((FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager)).a(a.getUri(), ((Checkable)b).isChecked());
            }

            
            {
                a = profilemodel;
                b = view;
                super();
            }
        });
        view = profilemodel.getUsername();
        if (view != null && view.equals(c))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            viewgroup.setVisibility(8);
        } else
        {
            viewgroup.setVisibility(0);
        }
        return dhu1.v();
    }
}
