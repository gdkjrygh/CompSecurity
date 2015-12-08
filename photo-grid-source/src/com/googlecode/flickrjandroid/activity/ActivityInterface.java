// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.activity;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.activity:
//            Item, Event, ItemList

public class ActivityInterface
{

    public static final String METHOD_USER_COMMENTS = "flickr.activity.userComments";
    public static final String METHOD_USER_PHOTOS = "flickr.activity.userPhotos";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public ActivityInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    private Item createItem(JSONObject jsonobject)
    {
        Event event;
        Item item = new Item();
        item.setId(jsonobject.getString("id"));
        item.setSecret(jsonobject.getString("secret"));
        item.setType(jsonobject.getString("type"));
        Object obj = jsonobject.optJSONObject("title");
        if (obj != null)
        {
            item.setTitle(((JSONObject) (obj)).getString("_content"));
        }
        item.setFarm(jsonobject.getString("farm"));
        item.setServer(jsonobject.getString("server"));
        item.setComments(jsonobject.optInt("comments"));
        item.setComments(jsonobject.optInt("notes"));
        item.setComments(jsonobject.optInt("commentsold"));
        item.setComments(jsonobject.optInt("commentsnew"));
        item.setComments(jsonobject.optInt("notesold"));
        item.setComments(jsonobject.optInt("notesnew"));
        item.setViews(jsonobject.getInt("views"));
        item.setFaves(jsonobject.getInt("faves"));
        item.setMore(jsonobject.optInt("more"));
        JSONObject jsonobject1;
        int i;
        try
        {
            obj = jsonobject.getJSONObject("activity");
            jsonobject = new ArrayList();
            obj = ((JSONObject) (obj)).getJSONArray("event");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return item;
        }
        i = 0;
        if (i < ((JSONArray) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_210;
        }
        item.setEvents(jsonobject);
        return item;
        jsonobject1 = ((JSONArray) (obj)).getJSONObject(i);
        event = new Event();
        event.setType(jsonobject1.getString("type"));
        if (!event.getType().equals("comment")) goto _L2; else goto _L1
_L1:
        event.setId(jsonobject1.getString("commentid"));
_L3:
        event.setUser(jsonobject1.getString("user"));
        event.setUsername(jsonobject1.getString("username"));
        event.setDateadded(jsonobject1.getString("dateadded"));
        event.setValue(jsonobject1.optString("_content"));
        jsonobject.add(event);
        i++;
        break MISSING_BLOCK_LABEL_194;
_L2:
label0:
        {
            if (!event.getType().equals("note"))
            {
                break label0;
            }
            event.setId(jsonobject1.getString("noteid"));
        }
          goto _L3
        event.getType().equals("fave");
          goto _L3
    }

    public boolean checkTimeframeArg(String s)
    {
        return Pattern.compile("\\d*(d|h)", 2).matcher(s).matches();
    }

    public ItemList userComments(int i, int j)
    {
        ItemList itemlist = new ItemList();
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.activity.userComments"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        ((List) (obj)).add(new Parameter("per_page", String.valueOf(i)));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        obj = ((Response) (obj)).getData().getJSONObject("items");
        itemlist.setPage(((JSONObject) (obj)).getInt("page"));
        itemlist.setPages(((JSONObject) (obj)).getInt("pages"));
        itemlist.setPerPage(((JSONObject) (obj)).getInt("perpage"));
        itemlist.setTotal(((JSONObject) (obj)).getInt("total"));
        obj = ((JSONObject) (obj)).getJSONArray("item");
        i = 0;
        do
        {
            if (i >= ((JSONArray) (obj)).length())
            {
                return itemlist;
            }
            itemlist.add(createItem(((JSONArray) (obj)).getJSONObject(i)));
            i++;
        } while (true);
    }

    public ItemList userPhotos(int i, int j, String s)
    {
        ItemList itemlist;
label0:
        {
label1:
            {
                itemlist = new ItemList();
                ArrayList arraylist = new ArrayList();
                arraylist.add(new Parameter("method", "flickr.activity.userPhotos"));
                arraylist.add(new Parameter("oauth_consumer_key", apiKey));
                if (i > 0)
                {
                    arraylist.add(new Parameter("per_page", String.valueOf(i)));
                }
                if (j > 0)
                {
                    arraylist.add(new Parameter("page", String.valueOf(j)));
                }
                if (s != null)
                {
                    if (!checkTimeframeArg(s))
                    {
                        break label1;
                    }
                    arraylist.add(new Parameter("timeframe", s));
                }
                OAuthUtils.addOAuthToken(arraylist);
                s = transportAPI.postJSON(sharedSecret, arraylist);
                if (s.isError())
                {
                    throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
                }
                break label0;
            }
            throw new FlickrException("0", "Timeframe-argument to getUserPhotos() not valid");
        }
        s = s.getData().getJSONObject("items");
        itemlist.setPage(s.getInt("page"));
        itemlist.setPages(s.getInt("pages"));
        itemlist.setPerPage(s.getInt("perpage"));
        itemlist.setTotal(s.getInt("total"));
        s = s.getJSONArray("item");
        i = 0;
        do
        {
            if (i >= s.length())
            {
                return itemlist;
            }
            itemlist.add(createItem(s.getJSONObject(i)));
            i++;
        } while (true);
    }
}
