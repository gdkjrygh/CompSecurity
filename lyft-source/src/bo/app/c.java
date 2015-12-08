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
//            ei, bb

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
            bb bb1 = Appboy.b(a);
            ei ei1 = a.b;
            String s = ei1.b.getString("uid", "");
            bb1.a(ei1.a(new JSONArray(ei1.b.getString("cards", "[]")), s, true, ei1.b.getLong("cards_timestamp", -1L)), com/appboy/events/FeedUpdatedEvent);
            return;
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.w(Appboy.a(), "Failed to retrieve and publish feed from offline cache.", jsonexception);
        }
    }
}
