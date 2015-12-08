// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import al;
import am;
import an;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.spotlets.FeatureIdentifier;
import cu;
import da;
import dmz;
import dtw;
import fko;
import fkp;
import fpe;
import fxy;
import fyw;
import gcj;
import gck;
import gms;
import java.util.Locale;

// Referenced classes of package com.spotify.mobile.android.spotlets.user:
//            ProfileModel, ProfileListModel

public final class ProfilesListFragment extends al
    implements fxy, gck
{

    private ListView Y;
    private Parcelable Z;
    private DeferredResolver aa;
    private ProfileModel ab[];
    private String ac;
    private String ad;
    private NotAvailableViewManager ae;
    private an af;
    private fkp b;

    public ProfilesListFragment()
    {
        af = new an() {

            private final String a[] = {
                "current_user"
            };
            private ProfilesListFragment b;

            public final da a(Bundle bundle)
            {
                return new cu(b.k(), dtw.a, a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                boolean flag = false;
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    obj = ((Cursor) (obj)).getString(0);
                    if (!((String) (obj)).equals(ProfilesListFragment.g(b)))
                    {
                        flag = true;
                    }
                    ProfilesListFragment.a(b, ((String) (obj)));
                    if (flag)
                    {
                        b.H();
                    }
                }
            }

            
            {
                b = ProfilesListFragment.this;
                super();
            }
        };
    }

    public static ProfilesListFragment a(String s, Type type, Flags flags)
    {
        ProfilesListFragment profileslistfragment = new ProfilesListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("uri", s);
        bundle.putSerializable("type", type);
        profileslistfragment.f(bundle);
        fyw.a(profileslistfragment, flags);
        return profileslistfragment;
    }

    static String a(ProfilesListFragment profileslistfragment, String s)
    {
        profileslistfragment.ad = s;
        return s;
    }

    static ProfileModel[] a(ProfilesListFragment profileslistfragment)
    {
        return profileslistfragment.ab;
    }

    static ProfileModel[] a(ProfilesListFragment profileslistfragment, ProfileModel aprofilemodel[])
    {
        profileslistfragment.ab = aprofilemodel;
        return aprofilemodel;
    }

    static void b(ProfilesListFragment profileslistfragment)
    {
        profileslistfragment.b = new fkp(profileslistfragment.k(), profileslistfragment.ab, profileslistfragment.ad);
        profileslistfragment.a(profileslistfragment.b);
        profileslistfragment.ae.a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.d);
        profileslistfragment.Y.post(profileslistfragment. new Runnable() {

            private ProfilesListFragment a;

            public final void run()
            {
                if (ProfilesListFragment.d(a) != null)
                {
                    ProfilesListFragment.e(a).onRestoreInstanceState(ProfilesListFragment.d(a));
                    ProfilesListFragment.f(a);
                }
            }

            
            {
                a = ProfilesListFragment.this;
                super();
            }
        });
    }

    static NotAvailableViewManager c(ProfilesListFragment profileslistfragment)
    {
        return profileslistfragment.ae;
    }

    static Parcelable d(ProfilesListFragment profileslistfragment)
    {
        return profileslistfragment.Z;
    }

    static ListView e(ProfilesListFragment profileslistfragment)
    {
        return profileslistfragment.Y;
    }

    static Parcelable f(ProfilesListFragment profileslistfragment)
    {
        profileslistfragment.Z = null;
        return null;
    }

    static String g(ProfilesListFragment profileslistfragment)
    {
        return profileslistfragment.ad;
    }

    public final void B()
    {
        aa.destroy();
        if (b != null)
        {
            fkp fkp1 = b;
            FollowManager followmanager = (FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager);
            ProfileModel aprofilemodel[] = fkp1.a;
            int j = aprofilemodel.length;
            for (int i = 0; i < j; i++)
            {
                followmanager.b(aprofilemodel[i].getUri(), fkp1);
            }

        }
        super.B();
    }

    public final Fragment F()
    {
        return this;
    }

    protected final void H()
    {
        Type type;
        if (ae.a().booleanValue())
        {
            return;
        }
        ae.a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.b);
        ac = g().getString("uri");
        type = (Type)g().getSerializable("type");
        final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[Type.values().length];
                try
                {
                    a[Type.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Type.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[type.ordinal()];
        JVM INSTR tableswitch 1 2: default 80
    //                   1 143
    //                   2 143;
           goto _L1 _L2 _L2
_L1:
        Object obj = fko.c(ac);
_L4:
        obj = RequestBuilder.get(String.format(Locale.US, type.mHermesUrlTemplate, new Object[] {
            obj
        })).build();
        aa.resolve(((com.spotify.cosmos.router.Request) (obj)), new JsonHttpCallbackReceiver(new Handler(Looper.getMainLooper()), com/spotify/mobile/android/spotlets/user/ProfileListModel) {

            private ProfilesListFragment a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.b(throwable, "Profile List failed to load", new Object[0]);
                ProfilesListFragment.c(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.c);
            }

            protected final void onResolved(Response response, Object obj1)
            {
                response = (ProfileListModel)obj1;
                ProfilesListFragment.a(a, response.getProfiles());
                if (ProfilesListFragment.a(a) != null)
                {
                    ProfilesListFragment.b(a);
                    return;
                } else
                {
                    ProfilesListFragment.c(a).a(com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager.DataState.d);
                    return;
                }
            }

            
            {
                a = ProfilesListFragment.this;
                super(handler, class1);
            }
        });
        return;
_L2:
        obj = Uri.encode(ad);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String I()
    {
        return ac;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300cf, null);
        Y = (ListView)viewgroup.findViewById(0x102000a);
        ae = new NotAvailableViewManager(k(), layoutinflater, Y, viewgroup);
        u().a(0x7f110096, null, new gcj(k(), this));
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return "";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aa = Cosmos.getResolver(k());
        fyw.a(this);
        if (bundle != null && bundle.containsKey("list"))
        {
            Z = bundle.getParcelable("list");
        }
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        listview = ((ProfileModel)b.getItem(i)).getUri();
        a(gms.a(k(), listview).a);
    }

    public final void c()
    {
        super.c();
        aa.connect();
    }

    public final void d()
    {
        super.d();
        aa.disconnect();
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        int i = ((Type)g().getSerializable("type")).mTitleResource;
        bundle = l().getString(i);
        ((fpe)k()).a(this, bundle);
        u().a(0x7f11009c, null, af);
    }

    public final void d(boolean flag)
    {
        ae.a(flag);
        if (flag && ad != null)
        {
            H();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (Y != null)
        {
            bundle.putParcelable("list", Y.onSaveInstanceState());
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.au;
    }

    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        private static final Type e[];
        final String mHermesUrlTemplate;
        final int mTitleResource;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/user/ProfilesListFragment$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])e.clone();
        }

        static 
        {
            a = new Type("FOLLOWERS", 0, "hm://user-profile-view/v2/android/profile/%s/followers", 0x7f080425);
            b = new Type("FOLLOWING", 1, "hm://user-profile-view/v2/android/profile/%s/following", 0x7f080426);
            c = new Type("FOLLOW_FACEBOOK", 2, "hm://follow-suggestions-view/v1/android/suggestions/%s/people/facebook_friends", 0x7f0802f7);
            d = new Type("FOLLOW_ARTISTS", 3, "hm://follow-suggestions-view/v1/android/suggestions/%s/people/most_played_artists", 0x7f0802f6);
            e = (new Type[] {
                a, b, c, d
            });
        }

        private Type(String s, int i, String s1, int j)
        {
            super(s, i);
            mHermesUrlTemplate = s1;
            mTitleResource = j;
        }
    }

}
