// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.activityfeed.model.ActivityFeedModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.StoryModel;

public final class edk
{

    static final gip a = gip.b("activity_feed_last_story_id");
    public static final gip b = gip.b("activity_feed_last_new_story_count");
    public String c;
    public gin d;
    public com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment.Type e;
    private Context f;
    private boolean g;
    private Resolver h;

    public edk(Context context)
    {
        this(context, null);
        g = true;
    }

    public edk(Context context, String s)
    {
        f = context;
        c = s;
        g = false;
        d = ((giq)dmz.a(giq)).b(context);
    }

    static String a(edk edk1, String s)
    {
        edk1.c = s;
        return s;
    }

    static boolean a(edk edk1)
    {
        return edk1.g;
    }

    static com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment.Type b(edk edk1)
    {
        return edk1.e;
    }

    static boolean c(edk edk1)
    {
        edk1.g = false;
        return false;
    }

    public final void a()
    {
        if (h != null)
        {
            f().connect();
        }
    }

    protected final void a(int i)
    {
        d.b().a(b, i).b();
    }

    public final void a(edm edm1)
    {
        String s = d.a(a, null);
        if (s != null)
        {
            Resolver resolver = f();
            StringBuilder stringbuilder = new StringBuilder("hm://social-feed-view/v2/android/feed");
            if (s != null)
            {
                stringbuilder.append('?').append("newer_than=").append(s);
            }
            resolver.resolve(RequestBuilder.get(stringbuilder.toString()).build(), new JsonCallbackReceiver(new Handler(), com/spotify/mobile/android/spotlets/activityfeed/model/ActivityFeedModel, edm1) {

                private edm a;
                private edk b;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    b.a(0);
                    a.a();
                }

                protected final void onResolved(Response response, Object obj)
                {
                    response = (ActivityFeedModel)obj;
                    b.a(response.getStories().length);
                    a.a(response.getStories().length);
                }

            
            {
                b = edk.this;
                a = edm1;
                super(handler, class1);
            }
            });
            return;
        } else
        {
            a(0);
            edm1.a(0);
            return;
        }
    }

    public final void b()
    {
        if (h != null)
        {
            f().disconnect();
        }
    }

    public final void c()
    {
        if (h != null)
        {
            f().destroy();
        }
    }

    public final void d()
    {
        g = true;
        c = null;
    }

    public final boolean e()
    {
        return !g && c == null;
    }

    public final Resolver f()
    {
        if (h == null)
        {
            h = Cosmos.getResolver(f);
            a();
        }
        return h;
    }


    // Unreferenced inner class edk$2

/* anonymous class */
    public final class _cls2
        implements edl
    {

        private edl a;
        private edk b;

        public final void a(ActivityFeedModel activityfeedmodel)
        {
            if (edk.a(b))
            {
                ctz.a(edk.b(b));
                if (edk.b(b) == com.spotify.mobile.android.spotlets.activityfeed.ActivityFeedFragment.Type.a)
                {
                    edk edk1 = b;
                    Object obj = null;
                    String s = obj;
                    if (activityfeedmodel != null)
                    {
                        StoryModel astorymodel[] = activityfeedmodel.getStories();
                        s = obj;
                        if (astorymodel.length > 0)
                        {
                            s = astorymodel[0].getId();
                        }
                    }
                    edk1.d.b().a(edk.a, s).b();
                }
                edk.c(b);
            }
            edk.a(b, activityfeedmodel.getNextPagePath());
            a.a(activityfeedmodel);
        }

        public final void a(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            a.a(throwable, errorcause);
        }

            public 
            {
                b = edk.this;
                a = edl1;
                super();
            }
    }


    // Unreferenced inner class edk$3

/* anonymous class */
    public final class _cls3 extends JsonCallbackReceiver
    {

        private edn a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            a.a();
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (StoryModel)obj;
            a.a(response);
        }

            public 
            {
                a = edn1;
                super(handler, class1);
            }
    }


    // Unreferenced inner class edk$4

/* anonymous class */
    public final class _cls4 extends JsonCallbackReceiver
    {

        private edl a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            a.a(throwable, errorcause);
        }

        protected final void onResolved(Response response, Object obj)
        {
            response = (ActivityFeedModel)obj;
            a.a(response);
        }

            public 
            {
                a = edl1;
                super(handler, class1);
            }
    }

}
