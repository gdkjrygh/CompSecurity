// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.Subscriber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleService, SplashData

class this._cls2
    implements Predicate
{

    final g this$2;

    public boolean evaluate(g g)
    {
        while (g.extendedInfo == null || g.extendedInfo.gameId != gameId) 
        {
            return false;
        }
        return true;
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((g)obj);
    }

    gameId()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/premierleague/schedule/ScheduleService$1

/* anonymous class */
    class ScheduleService._cls1
        implements rx.Observable.OnSubscribe
    {

        final ScheduleService this$0;
        final int val$gameId;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            Request request = (new com.squareup.okhttp.Request.Builder()).url(ScheduleService.access$000(ScheduleService.this)).build();
            ScheduleService.access$200(ScheduleService.this).newCall(request).enqueue(subscriber. new ScheduleService._cls1._cls1());
        }

            
            {
                this$0 = final_scheduleservice;
                gameId = I.this;
                super();
            }
    }


    // Unreferenced inner class com/nbcsports/liveextra/ui/player/premierleague/schedule/ScheduleService$1$1

/* anonymous class */
    class ScheduleService._cls1._cls1
        implements Callback
    {

        final ScheduleService._cls1 this$1;
        final Subscriber val$subscriber;

        public void onFailure(Request request, IOException ioexception)
        {
            subscriber.onError(ioexception);
        }

        public void onResponse(Response response)
            throws IOException
        {
            try
            {
                response = (SplashData.EventListing)CollectionUtils.find(((SplashData)ScheduleService.access$100(this$0).fromJson(response.body().charStream(), com/nbcsports/liveextra/ui/player/premierleague/schedule/SplashData)).eventListings, new ScheduleService._cls1._cls1._cls1());
                subscriber.onNext(response);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                subscriber.onError(response);
            }
        }

            
            {
                this$1 = final__pcls1;
                subscriber = Subscriber.this;
                super();
            }
    }

}
