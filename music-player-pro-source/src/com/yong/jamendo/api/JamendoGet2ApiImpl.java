// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.jamendo.api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.yong.jamendo.api:
//            JamendoGet2Api, WSError, Caller, JamendoMusicBuilder

public class JamendoGet2ApiImpl
    implements JamendoGet2Api
{

    private static String GET_API_URL = "http://api.jamendo.com/v3.0/tracks/?client_id=13dd2d60&format=json&limit=50&order=downloads_total&include=stats&imagesize=200&groupby=artist_id&namesearch=";

    public JamendoGet2ApiImpl()
    {
    }

    private String doGet(String s)
        throws WSError
    {
        return Caller.doGet((new StringBuilder(String.valueOf(GET_API_URL))).append(s).toString());
    }

    public static ArrayList getMusics(JSONArray jsonarray)
        throws JSONException
    {
        int j = jsonarray.length();
        ArrayList arraylist = new ArrayList();
        JamendoMusicBuilder jamendomusicbuilder = new JamendoMusicBuilder();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            arraylist.add(jamendomusicbuilder.build(jsonarray.getJSONObject(i)));
            i++;
        } while (true);
    }

    public ArrayList searchForTracksByTag(String s)
        throws JSONException, WSError
    {
        try
        {
            s = getMusics((new JSONObject(doGet(URLEncoder.encode(s, "UTF-8")))).getJSONArray("results"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            throw new JSONException(s.getLocalizedMessage());
        }
        return s;
    }

}
