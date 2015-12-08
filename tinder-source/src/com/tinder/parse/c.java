// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.tinder.model.FacebookAlbum;
import com.tinder.model.FacebookPhoto;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{

    public static ArrayList a(JSONObject jsonobject)
        throws JSONException
    {
        int i = 0;
        if (jsonobject.has("data"))
        {
            jsonobject = jsonobject.getJSONArray("data");
            ArrayList arraylist = new ArrayList(jsonobject.length());
            for (; i < jsonobject.length(); i++)
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject(i);
                FacebookPhoto facebookphoto = new FacebookPhoto();
                facebookphoto.sourceUrl = jsonobject1.getString("source");
                facebookphoto.id = jsonobject1.getString("id");
                facebookphoto.thumbnailUrl = jsonobject1.getString("picture");
                if (facebookphoto.id != null)
                {
                    arraylist.add(facebookphoto);
                }
            }

            return arraylist;
        } else
        {
            return new ArrayList(0);
        }
    }

    public static ArrayList a(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.has("albums"))
        {
            jsonobject = jsonobject.getJSONObject("albums");
            if (jsonobject.has("data"))
            {
                jsonobject = jsonobject.getJSONArray("data");
                ArrayList arraylist = new ArrayList(jsonobject.length());
                int i = 0;
                while (i < jsonobject.length()) 
                {
                    Object obj = jsonobject.getJSONObject(i);
                    FacebookAlbum facebookalbum = new FacebookAlbum();
                    facebookalbum.id = ((JSONObject) (obj)).optString("id");
                    facebookalbum.name = ((JSONObject) (obj)).optString("name");
                    obj = ((JSONObject) (obj)).optString("count");
                    int j;
                    if (((String) (obj)).length() > 0)
                    {
                        j = Integer.parseInt(((String) (obj)));
                    } else
                    {
                        j = 0;
                    }
                    facebookalbum.count = j;
                    obj = facebookalbum.id;
                    facebookalbum.thumbnailUrl = (new StringBuilder("https://graph.facebook.com/")).append(((String) (obj))).append("/picture?type=album&access_token=").append(s).toString();
                    if (facebookalbum.id != null)
                    {
                        arraylist.add(facebookalbum);
                    }
                    i++;
                }
                return arraylist;
            } else
            {
                return new ArrayList(0);
            }
        } else
        {
            return new ArrayList(0);
        }
    }
}
