// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.NewRelease;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ele extends elg
{

    public ele(Context context, elb elb, String s, fyx fyx)
    {
        super(context, elb, s, RequestType.e, fyx);
    }

    public final String a()
    {
        return "/v3/space/new-releases";
    }

    public final List a(JSONObject jsonobject)
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.getJSONArray("items");
        for (int i = 0; i < jsonobject.length(); i++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i).getJSONObject("release");
            arraylist.add(new NewRelease(jsonobject1.optString("albumName", ""), jsonobject1.optString("uri", ""), jsonobject1.optString("image", ""), jsonobject1.optString("artistName", "")));
        }

        return arraylist;
    }
}
