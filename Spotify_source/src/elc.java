// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class elc extends elg
{

    public elc(Context context, elb elb, String s, fyx fyx)
    {
        super(context, elb, s, RequestType.a, fyx);
    }

    public final String a()
    {
        return "/v3/space/featured-playlists";
    }

    public final List a(JSONObject jsonobject)
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.getJSONArray("items");
        for (int i = 0; i < jsonobject.length(); i++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i).getJSONObject("playlist");
            arraylist.add(new Playlist(jsonobject1.optString("subGenreTemplate", ""), jsonobject1.optString("title", ""), jsonobject1.optString("description", ""), jsonobject1.optString("uri", ""), jsonobject1.optString("image", ""), jsonobject1.optInt("numSubscribers", 0)));
        }

        return arraylist;
    }

    public final Map b(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        if (jsonobject.has("label"))
        {
            hashmap.put("label", jsonobject.getString("label"));
        }
        return hashmap;
    }
}
