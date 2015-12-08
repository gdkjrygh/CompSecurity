// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.stickers;

import android.content.Context;
import com.kik.android.c.e;
import com.kik.android.c.f;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kik.a.d.x;
import kik.a.e.u;
import kik.android.util.DeviceUtils;
import org.c.b;
import org.c.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.android.stickers:
//            b

public class MediaItemPlugin extends d
{

    private static final b a = c.a("MediaItemPlugin");
    private final boolean b;
    private final u d;
    private final f e;
    private Pattern f;

    public MediaItemPlugin(u u1, f f1, Context context)
    {
        super("MediaItems");
        f = Pattern.compile("^(https://stickers\\.kik\\.com|https://cards\\-sticker\\.herokuapp\\.com|https://cards\\-sticker\\-dev\\.herokuapp\\.com|https://my\\.kik\\.com)(.*)", 2);
        d = u1;
        b = DeviceUtils.d(context);
        e = f1;
    }

    public final boolean a(String s)
    {
        if (b)
        {
            return true;
        }
        if (s != null)
        {
            return f.matcher(s).matches();
        } else
        {
            return false;
        }
    }

    public j addItemsToCache(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optJSONArray("urls");
        if (jsonobject != null)
        {
            int k = jsonobject.length();
            int i = 0;
            while (i < k) 
            {
                try
                {
                    String s = jsonobject.getString(i);
                    d.a(s);
                }
                catch (JSONException jsonexception)
                {
                    a.b((new StringBuilder("Error attempting to cache sticker URL")).append(jsonexception).toString());
                }
                i++;
            }
        }
        return new j();
    }

    public j deleteAlternateSmileys(JSONObject jsonobject)
    {
        jsonobject = jsonobject.optJSONArray("ids");
        if (jsonobject != null)
        {
            for (int i = 0; i < jsonobject.length(); i++)
            {
                String s = jsonobject.optString(i);
                if (s != null)
                {
                    e.c(s);
                }
            }

        }
        return new j(new JSONObject());
    }

    public j getAlternateSmileys(JSONObject jsonobject)
    {
        return new j(com.kik.android.c.f.a(e.f()));
    }

    public j getInstalledStickerPacks(JSONObject jsonobject)
    {
        JSONArray jsonarray;
        jsonobject = d.a();
        jsonarray = new JSONArray();
        for (jsonobject = jsonobject.iterator(); jsonobject.hasNext(); jsonarray.put(((x)jsonobject.next()).d())) { }
        jsonobject = new JSONObject();
        jsonobject.put("links", jsonarray);
_L2:
        return new j(jsonobject);
        JSONException jsonexception;
        jsonexception;
        jsonobject = null;
_L3:
        a.b((new StringBuilder("Error firing back event: ")).append(jsonexception).toString());
        if (true) goto _L2; else goto _L1
_L1:
        jsonexception;
          goto _L3
    }

    public j installAlternateSmileys(JSONObject jsonobject)
    {
        e.a(jsonobject);
        return new j(new JSONObject());
    }

    public j installStickerPack(JSONObject jsonobject)
    {
        jsonobject = com.kik.android.stickers.b.a(jsonobject);
        d.a(jsonobject);
        return new j();
    }

    public j preloadAlternateSmileys(JSONObject jsonobject)
    {
        com.kik.android.c.f.b(jsonobject);
        return new j(new JSONObject());
    }

    public j setActiveSmiley(JSONObject jsonobject)
    {
        String s = jsonobject.optString("alternateId");
        jsonobject = jsonobject.optString("categoryId");
        e e1 = e.d(s);
        if (e1 == null || jsonobject == null || s == null || s.length() < 2 || !jsonobject.equalsIgnoreCase(e1.g()))
        {
            return new j(400, new JSONObject());
        } else
        {
            e.a(e1);
            return new j(new JSONObject());
        }
    }

}
