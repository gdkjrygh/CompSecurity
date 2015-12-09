// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cr;

import android.content.Intent;
import android.net.Uri;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.util.p;
import java.util.List;

public class n
    implements k.c
{

    public n()
    {
    }

    public p.cp.b.c a(Uri uri)
    {
        List list = uri.getPathSegments();
        if (list.size() >= 2)
        {
            if (((String)list.get(1)).contentEquals("edit"))
            {
                uri = (new PandoraIntent("action_show_station_personalization")).putExtra("intent_page_name", p.f).putExtra("intent_station_token", (String)list.get(2));
            } else
            if (((String)list.get(1)).contentEquals("thumb_up_history"))
            {
                uri = (new PandoraIntent("action_show_station_personalization")).putExtra("intent_page_name", p.J).putExtra("intent_station_token", (String)list.get(2));
            } else
            if (((String)list.get(1)).contentEquals("thumb_down_history"))
            {
                uri = (new PandoraIntent("action_show_station_personalization")).putExtra("intent_page_name", p.K).putExtra("intent_station_token", (String)list.get(2));
            } else
            if (((String)list.get(1)).contentEquals("add_variety"))
            {
                uri = (new PandoraIntent("action_show_station_personalization")).putExtra("intent_page_name", p.L).putExtra("intent_station_token", (String)list.get(2));
            } else
            {
                uri = (new PandoraIntent("action_show_station_personalization")).putExtra("intent_page_name", p.e).putExtra("intent_station_token", (String)list.get(1));
            }
            return new p.cp.b.c(uri);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Non-conforming pandora scheme URI: ").append(uri).toString());
        }
    }
}
