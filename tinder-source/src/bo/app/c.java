// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.SharedPreferences;
import com.appboy.Appboy;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.support.AppboyLogger;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package bo.app:
//            ec, aw

public final class c
    implements Runnable
{

    final Appboy a;

    public c(Appboy appboy)
    {
        a = appboy;
        super();
    }

    public final void run()
    {
        try
        {
            aw aw1 = Appboy.b(a);
            ec ec1 = a.b;
            String s = ec1.b.getString("uid", "");
            aw1.a(ec1.a(new JSONArray(ec1.b.getString("cards", "[]")), s, true, ec1.b.getLong("cards_timestamp", -1L)), com/appboy/events/FeedUpdatedEvent);
            return;
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.w(Appboy.a(), "Failed to retrieve and publish feed from offline cache.", jsonexception);
        }
    }
}
