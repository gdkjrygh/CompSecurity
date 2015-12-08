// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import rx.functions.Func1;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueEngine

class this._cls0
    implements Func1
{

    final PremierLeagueEngine this$0;

    public ConfigurationInfo call(Response response)
    {
        try
        {
            PremierLeagueEngine.access$802(PremierLeagueEngine.this, (ConfigurationInfo)gson.fromJson(response.body().charStream(), com/nbcsports/liveextra/content/models/overlay/premierleague/ConfigurationInfo));
            response = PremierLeagueEngine.access$800(PremierLeagueEngine.this);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            Timber.d(response, "Error retrieving PL configuration", new Object[0]);
            return null;
        }
        return response;
    }

    public volatile Object call(Object obj)
    {
        return call((Response)obj);
    }

    tionInfo()
    {
        this$0 = PremierLeagueEngine.this;
        super();
    }
}
