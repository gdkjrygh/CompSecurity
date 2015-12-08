// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.party.json.TracksJacksonModel;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Iterator;
import java.util.List;

public final class eyq
{

    private final Handler a;
    private Resolver b;

    public eyq(Resolver resolver, Handler handler)
    {
        b = resolver;
        a = handler;
    }

    public final void a(String s, int i, List list, eyr eyr)
    {
        StringBuilder stringbuilder = new StringBuilder("hm://group-moments/v1/tracks");
        stringbuilder.append("?preset=");
        stringbuilder.append(Uri.encode(s));
        stringbuilder.append("&energy=");
        stringbuilder.append(i);
        stringbuilder.append("&safe=");
        stringbuilder.append(0);
        stringbuilder.append("&limit=");
        stringbuilder.append(0);
        if (list != null && !list.isEmpty())
        {
            stringbuilder.append("&usernames=");
            boolean flag = true;
            list = list.iterator();
            while (list.hasNext()) 
            {
                String s1 = (String)list.next();
                if (flag)
                {
                    flag = false;
                } else
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append(Uri.encode(s1));
            }
        }
        list = stringbuilder.toString();
        s = new JsonCallbackReceiver(a, com/spotify/mobile/android/spotlets/party/json/TracksJacksonModel, s, i, eyr) {

            private String a;
            private int b;
            private eyr c;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.c("Failed to load tracks: %s", new Object[] {
                    errorcause.toString()
                });
            }

            protected final void onResolved(Response response, Object obj)
            {
                int j = 0;
                response = (TracksJacksonModel)obj;
                obj = a;
                int k = b;
                if (response != null)
                {
                    j = ((TracksJacksonModel) (response)).tracks.size();
                }
                c.a(response);
            }

            
            {
                a = s;
                b = i;
                c = eyr1;
                super(handler, class1);
            }
        };
        b.resolve(RequestBuilder.get(list).build(), s);
    }
}
