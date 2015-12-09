// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class elf extends elg
{

    private final String b;
    private final String c;
    private final fyx d;

    public elf(Context context, elb elb, String s, String s1, String s2, fyx fyx1)
    {
        super(context, elb, s, RequestType.c, fyx1);
        b = s1;
        c = s2;
        d = fyx1;
    }

    public final String a()
    {
        return (new StringBuilder("/v3/space/")).append(c).toString();
    }

    public final List a(JSONObject jsonobject)
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.getJSONArray("items");
        for (int i = 0; i < jsonobject.length(); i++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i).getJSONObject("playlist");
            String s = jsonobject1.optString("title", "");
            String s1 = jsonobject1.optString("description", "");
            String s2 = jsonobject1.optString("uri", "");
            String s3 = jsonobject1.optString("image", "");
            int j = jsonobject1.optInt("numSubscribers", 0);
            arraylist.add(new Playlist(b, s, s1, s2, s3, j));
        }

        return arraylist;
    }

    public final Map a(Map map)
    {
        if (!b.equals(c))
        {
            map.put("filter", b);
        }
        Object obj = d.a();
        if (((Integer)((Flags) (obj)).a(fys.i)).intValue() == 1)
        {
            obj = "highlights-1";
        } else
        if (((Integer)((Flags) (obj)).a(fys.i)).intValue() == 2)
        {
            obj = "highlights-2";
        } else
        {
            obj = "highlights-0";
        }
        map.put("ab", obj);
        return map;
    }
}
