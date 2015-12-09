// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.findfriends.model.IndexModel;
import java.util.Collections;

final class esf
{

    Resolver a;
    private final Context b;

    public esf(Context context)
    {
        ctz.a(context);
        b = context;
    }

    static Request a()
    {
        Object obj = new esk();
        obj.a = Collections.emptyList();
        ctz.a(((esk) (obj)).a);
        obj = new IndexModel(((esk) (obj)).a, null);
        try
        {
            obj = RequestBuilder.post("hm://find-friends/v1/friends", ((com.spotify.mobile.android.cosmos.JacksonModel) (obj))).build();
        }
        catch (Exception exception)
        {
            return null;
        }
        return ((Request) (obj));
    }

    static Request b()
    {
        Request request;
        try
        {
            request = RequestBuilder.get("hm://follow-suggestions-view/v1/editorial/people").build();
        }
        catch (Exception exception)
        {
            return null;
        }
        return request;
    }

    final Resolver c()
    {
        if (a == null)
        {
            a = Cosmos.getResolver(b);
            a.connect();
        }
        return a;
    }
}
