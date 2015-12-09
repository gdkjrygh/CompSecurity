// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.activityfeed.model.StoryModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.StreamsModel;

public final class edo
{

    public Resolver a;
    public boolean b;
    private Context c;

    public edo(Context context)
    {
        c = context;
        b = true;
    }

    public final void a()
    {
        if (a != null)
        {
            a.destroy();
        }
    }

    public final void a(StoryModel storymodel, com.spotify.cosmos.android.Resolver.CallbackReceiver callbackreceiver)
    {
        if (!b)
        {
            storymodel.getStreams().setIncludeRequestingUser(true);
            String s = storymodel.getId();
            storymodel = new com.spotify.cosmos.android.Resolver.CallbackReceiver(new Handler(), callbackreceiver, storymodel) {

                private com.spotify.cosmos.android.Resolver.CallbackReceiver a;
                private StoryModel b;

                protected final void onError(Throwable throwable)
                {
                    b.getStreams().setIncludeRequestingUser(false);
                    a.sendOnError(throwable);
                }

                protected final void onResolved(Response response)
                {
                    a.sendOnResolved(response);
                }

            
            {
                a = callbackreceiver;
                b = storymodel;
                super(handler);
            }
            };
            b().resolve(RequestBuilder.post(String.format("hm://bouncer/stream/%s", new Object[] {
                s
            })).build(), storymodel);
        }
    }

    public final Resolver b()
    {
        if (a == null)
        {
            a = Cosmos.getResolver(c);
            a.connect();
        }
        return a;
    }
}
