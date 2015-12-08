// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class eld extends elg
{

    private final Resources b;

    public eld(Context context, elb elb, String s, Resources resources, fyx fyx)
    {
        super(context, elb, s, RequestType.b, fyx);
        b = resources;
    }

    public final String a()
    {
        return "/v3/space/genres";
    }

    public final List a(JSONObject jsonobject)
    {
        ArrayList arraylist;
        JSONArray jsonarray1;
        int i;
        arraylist = new ArrayList();
        jsonarray1 = jsonobject.getJSONArray("items");
        i = 0;
_L3:
        if (i >= jsonarray1.length()) goto _L2; else goto _L1
_L1:
        String s;
        Object obj;
        String s1;
        Object obj1;
        String s3;
        String s4;
        String s5;
        JSONObject jsonobject1;
        jsonobject1 = jsonarray1.getJSONObject(i).getJSONObject("genre");
        s3 = jsonobject1.getString("id");
        s4 = jsonobject1.getString("templateName");
        s = jsonobject1.getString("name");
        s5 = jsonobject1.optString("iconUrl");
        String s2 = jsonobject1.optString("iconImageUrl");
        obj1 = jsonobject1.optString("moodImageUrl");
        Genre genre = elw.a(s4, b);
        obj = s;
        s1 = s2;
        if (genre == null)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        jsonobject = s;
        if (TextUtils.isEmpty(s))
        {
            jsonobject = s;
            if (!TextUtils.isEmpty(genre.a()))
            {
                jsonobject = genre.a();
            }
        }
        s = s2;
        if (TextUtils.isEmpty(s2))
        {
            s = s2;
            if (!TextUtils.isEmpty(genre.d))
            {
                s = genre.d;
            }
        }
        obj = jsonobject;
        s1 = s;
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_348;
        }
        obj = jsonobject;
        s1 = s;
        if (TextUtils.isEmpty(genre.e))
        {
            break MISSING_BLOCK_LABEL_348;
        }
        s1 = genre.e;
        obj = jsonobject;
        jsonobject = s1;
_L4:
        s1 = jsonobject1.optString("playlistUri");
        JSONArray jsonarray = jsonobject1.optJSONArray("subGenres");
        if (jsonarray != null)
        {
            for (int j = 0; j < jsonarray.length(); j++)
            {
                obj1 = jsonarray.getJSONObject(j);
                arraylist.add(new Genre(null, ((JSONObject) (obj1)).getString("key"), s4, ((JSONObject) (obj1)).getString("name"), null, null, null, null));
            }

        }
        arraylist.add(new Genre(s3, s4, null, ((String) (obj)), s5, s, jsonobject, s1));
        i++;
          goto _L3
_L2:
        return arraylist;
        jsonobject = ((JSONObject) (obj1));
        s = s1;
          goto _L4
    }
}
