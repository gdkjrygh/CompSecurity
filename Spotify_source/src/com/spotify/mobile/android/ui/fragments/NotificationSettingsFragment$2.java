// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import com.spotify.mobile.android.util.logging.Logger;
import dmg;
import dmz;
import ggc;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            NotificationSettingsFragment

final class a
    implements dmg
{

    private NotificationSettingsFragment a;

    private void a()
    {
        NotificationSettingsFragment.b(a);
        if (NotificationSettingsFragment.c(a).isEmpty())
        {
            dmz.a(ggc);
            ggc.a(NotificationSettingsFragment.d(a), 0x7f080560, 1, new Object[0]);
        } else
        {
            dmz.a(ggc);
            ggc.a(NotificationSettingsFragment.d(a), 0x7f080561, 0, new Object[0]);
        }
        NotificationSettingsFragment.a(a, null);
    }

    public final void a(int i, Object obj)
    {
        obj = (JSONArray)obj;
        if (i >= 200 && i < 300)
        {
            int j = ((JSONArray) (obj)).length();
            LinkedHashMap linkedhashmap = new LinkedHashMap(j);
            i = 0;
            while (i < j) 
            {
                try
                {
                    tification tification = com.spotify.mobile.android.ui.fragments.tification.a(((JSONArray) (obj)).getJSONObject(i));
                    linkedhashmap.put(tification.a, tification);
                }
                catch (JSONException jsonexception)
                {
                    Logger.a(jsonexception, "Error parsing item %d", new Object[] {
                        Integer.valueOf(i)
                    });
                }
                i++;
            }
            NotificationSettingsFragment.a(a, linkedhashmap);
            return;
        } else
        {
            a();
            return;
        }
    }

    public final void a(Throwable throwable, String s)
    {
        Logger.a(throwable, s, new Object[0]);
        a();
    }

    tification(NotificationSettingsFragment notificationsettingsfragment)
    {
        a = notificationsettingsfragment;
        super();
    }
}
