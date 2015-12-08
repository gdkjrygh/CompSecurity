// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.activityfeed.model.StoryModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.StreamsModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.UserModel;
import com.spotify.mobile.android.spotlets.user.ProfileModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class edh extends al
    implements fxy, gck
{

    private String Y;
    private edk Z;
    private Resolver aa;
    private ContentViewManager ab;
    private LoadingView ac;
    private EmptyView ad;
    private UserModel ae;
    private StoryModel af;
    private eda ag;
    private edb ah;
    private String b;

    public edh()
    {
        ag = new eda() {

            private edh a;

            public final void a(SessionState sessionstate)
            {
                if (edh.a(a) == null)
                {
                    edh.a(a, sessionstate.b);
                    edh.b(a);
                }
            }

            
            {
                a = edh.this;
                super();
            }
        };
    }

    private void H()
    {
        String s = String.format("hm://user-profile-view/v1/android/profile/%s", new Object[] {
            Uri.encode(Y)
        });
        aa.resolve(RequestBuilder.get(s).build(), new JsonCallbackReceiver(new Handler(), com/spotify/mobile/android/spotlets/user/ProfileModel) {

            private edh a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                edh.d(a).c(true);
            }

            protected final void onResolved(Response response, Object obj)
            {
                response = (ProfileModel)obj;
                edh.a(a, new UserModel(response.getImageHttpUrl(), response.getDisplayName(), response.getUri()));
                edh.c(a);
            }

            
            {
                a = edh.this;
                super(handler, class1);
            }
        });
    }

    static StoryModel a(edh edh1, StoryModel storymodel)
    {
        edh1.af = storymodel;
        return storymodel;
    }

    static UserModel a(edh edh1, UserModel usermodel)
    {
        edh1.ae = usermodel;
        return usermodel;
    }

    static String a(edh edh1)
    {
        return edh1.Y;
    }

    static String a(edh edh1, String s)
    {
        edh1.Y = s;
        return s;
    }

    public static edh b(Intent intent)
    {
        Bundle bundle = new Bundle();
        bundle.putString("story_id", intent.getStringExtra("spotify:internal:social-feed:reactors:story_id"));
        bundle.putString("username", intent.getStringExtra("spotify:internal:social-feed:reactors:username"));
        intent = new edh();
        intent.f(bundle);
        return intent;
    }

    static void b(edh edh1)
    {
        edh1.H();
    }

    static void c(edh edh1)
    {
        if (edh1.ae == null || edh1.af == null) goto _L2; else goto _L1
_L1:
        if (edh1.af.getStreams().listCount() <= 0) goto _L4; else goto _L3
_L3:
        edj edj1;
        ArrayList arraylist;
        boolean flag;
        boolean flag1;
        edh1.ab.b(null);
        edj1 = (edj)edh1.w_();
        StoryModel storymodel = edh1.af;
        edh1 = edh1.ae;
        arraylist = new ArrayList(Arrays.asList(storymodel.getStreams().getStreamers()));
        flag = arraylist.contains(edh1);
        flag1 = storymodel.getStreams().getIncludeRequestingUser();
        if (!flag1 || flag) goto _L6; else goto _L5
_L5:
        arraylist.add(edh1);
_L7:
        edj1.a((UserModel[])arraylist.toArray(new UserModel[arraylist.size()]));
_L2:
        return;
_L6:
        if (!flag1 && flag)
        {
            arraylist.remove(edh1);
        }
        if (true) goto _L7; else goto _L4
_L4:
        edh1.ab.d(true);
        return;
    }

    static ContentViewManager d(edh edh1)
    {
        return edh1.ab;
    }

    public final void B()
    {
        super.B();
        if (ah != null)
        {
            ah.b(ag);
        }
        Z.c();
        aa.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "spotify:internal:social-feed:reactors";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d2, viewgroup, false);
        ac = LoadingView.a(layoutinflater);
        viewgroup.addView(ac);
        ad = (EmptyView)viewgroup.findViewById(0x7f110348);
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080059);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        b = g().getString("story_id");
        Y = g().getString("username");
        Z = new edk(k());
        aa = Cosmos.getResolver(k());
        aa.connect();
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        a(((android.widget.ListAdapter) (new edj(k()))));
        ab = (new gaa(k(), ad, z_())).b(SpotifyIcon.s, 0x7f080054, 0x7f080055).b(0x7f080058, 0x7f080057).a(0x7f0802ad, 0x7f080056).a();
        view = new gcj(k(), this);
        u().a(0x7f11005a, null, view);
        ah = edb.a(k());
        ah.a(ag);
        if (ah.c())
        {
            Y = ah.g();
            H();
        }
    }

    public final void a(ListView listview, View view, int i, long l)
    {
        listview = (UserModel)view.getTag();
        a(gms.a(k(), listview.getUri()).a);
    }

    public final void d(boolean flag)
    {
        ContentViewManager contentviewmanager = ab;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        contentviewmanager.a(flag1);
        if (flag)
        {
            ab.a(ac);
            edk edk1 = Z;
            String s = b;
            edn edn = new edn() {

                private edh a;

                public final void a()
                {
                    edh.d(a).c(true);
                }

                public final void a(StoryModel storymodel)
                {
                    edh.a(a, storymodel);
                    edh.c(a);
                }

            
            {
                a = edh.this;
                super();
            }
            };
            edk1.f().resolve(RequestBuilder.get(String.format("hm://social-feed-view/v2/android/story/%s/reactions", new Object[] {
                s
            })).build(), new edk._cls3(new Handler(), com/spotify/mobile/android/spotlets/activityfeed/model/StoryModel, edn));
            return;
        } else
        {
            af = null;
            ((edj)w_()).a(new UserModel[0]);
            return;
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.aj;
    }
}
