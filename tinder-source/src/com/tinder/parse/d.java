// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.tinder.model.InstagramDataSet;
import com.tinder.model.InstagramPhoto;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
{

    public static InstagramDataSet a(JSONObject jsonobject)
    {
        int i = 0;
        InstagramDataSet instagramdataset = new InstagramDataSet();
        jsonobject = jsonobject.optJSONObject("instagram");
        if (jsonobject != null)
        {
            Object obj = jsonobject.optString("last_fetch_time");
            String s = jsonobject.optString("profile_picture");
            String s1 = jsonobject.optString("username");
            int j = jsonobject.optInt("media_count", 0);
            instagramdataset.lastFetchTime = ((String) (obj));
            instagramdataset.profileImageUrl = s;
            instagramdataset.username = s1;
            instagramdataset.mediaCount = j;
            obj = jsonobject.optJSONArray("photos");
            jsonobject = new ArrayList(0);
            if (obj != null)
            {
                jsonobject = new ArrayList(((JSONArray) (obj)).length());
                for (; i < ((JSONArray) (obj)).length(); i++)
                {
                    JSONObject jsonobject1 = ((JSONArray) (obj)).optJSONObject(i);
                    InstagramPhoto instagramphoto = new InstagramPhoto();
                    instagramphoto.mUrlLarge = jsonobject1.optString("image");
                    instagramphoto.mUrlSmall = jsonobject1.optString("thumbnail");
                    String s2 = jsonobject1.optString("link");
                    String s3 = jsonobject1.optString("id");
                    instagramphoto.mTimestamp = jsonobject1.optLong("ts") * 1000L;
                    instagramphoto.mLink = s2;
                    instagramphoto.photoId = s3;
                    jsonobject.add(instagramphoto);
                }

            }
            instagramdataset.photos = jsonobject;
        }
        return instagramdataset;
    }
}
