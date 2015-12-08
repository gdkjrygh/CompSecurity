// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.contacts;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.contacts:
//            Contact

public class ContactsInterface
{

    private static final String METHOD_GET_LIST = "flickr.contacts.getList";
    private static final String METHOD_GET_LIST_RECENTLY_UPLOADED = "flickr.contacts.getListRecentlyUploaded";
    private static final String METHOD_GET_PUBLIC_LIST = "flickr.contacts.getPublicList";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public ContactsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public Collection getList()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.contacts.getList"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        obj = ((Response) (obj)).getData().getJSONObject("contacts").getJSONArray("contact");
        int i = 0;
        do
        {
            if (i >= ((JSONArray) (obj)).length())
            {
                return arraylist;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            Contact contact = new Contact();
            contact.setId(jsonobject.getString("nsid"));
            contact.setUsername(jsonobject.getString("username"));
            contact.setRealName(jsonobject.getString("realname"));
            contact.setFriend("1".equals(jsonobject.getString("friend")));
            contact.setFamily("1".equals(jsonobject.getString("family")));
            contact.setIgnored("1".equals(jsonobject.getString("ignored")));
            contact.setPathAlias(jsonobject.getString("path_alias"));
            if (jsonobject.has("location"))
            {
                contact.setLocation(jsonobject.getString("location"));
            }
            contact.setIconFarm(jsonobject.getString("iconfarm"));
            contact.setIconServer(jsonobject.getString("iconserver"));
            arraylist.add(contact);
            i++;
        } while (true);
    }

    public Collection getListRecentlyUploaded(Date date, String s)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(new Parameter("method", "flickr.contacts.getListRecentlyUploaded"));
        arraylist1.add(new Parameter("oauth_consumer_key", apiKey));
        if (date != null)
        {
            arraylist1.add(new Parameter("date_lastupload", date.getTime() / 1000L));
        }
        if (s != null)
        {
            arraylist1.add(new Parameter("filter", s));
        }
        OAuthUtils.addOAuthToken(arraylist1);
        date = transportAPI.postJSON(sharedSecret, arraylist1);
        if (date.isError())
        {
            throw new FlickrException(date.getErrorCode(), date.getErrorMessage());
        }
        date = date.getData().getJSONObject("contacts").getJSONArray("contact");
        int i = 0;
        do
        {
            if (i >= date.length())
            {
                return arraylist;
            }
            s = date.getJSONObject(i);
            Contact contact = new Contact();
            contact.setId(s.getString("nsid"));
            contact.setUsername(s.getString("username"));
            contact.setRealName(s.getString("realname"));
            contact.setFriend("1".equals(s.getString("friend")));
            contact.setFamily("1".equals(s.getString("family")));
            if (s.has("ignored"))
            {
                contact.setIgnored("1".equals(s.getString("ignored")));
            }
            contact.setIconFarm(s.getString("iconfarm"));
            contact.setIconServer(s.getString("iconserver"));
            arraylist.add(contact);
            i++;
        } while (true);
    }

    public Collection getPublicList(String s)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(new Parameter("method", "flickr.contacts.getPublicList"));
        arraylist1.add(new Parameter("api_key", apiKey));
        arraylist1.add(new Parameter("user_id", s));
        s = transportAPI.get(transportAPI.getPath(), arraylist1);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData().getJSONObject("contacts").getJSONArray("contact");
        int i = 0;
        do
        {
            if (i >= s.length())
            {
                return arraylist;
            }
            JSONObject jsonobject = s.getJSONObject(i);
            Contact contact = new Contact();
            contact.setId(jsonobject.getString("nsid"));
            contact.setUsername(jsonobject.getString("username"));
            contact.setIgnored("1".equals(jsonobject.getString("ignored")));
            contact.setIconFarm(jsonobject.getString("iconfarm"));
            contact.setIconServer(jsonobject.getString("iconserver"));
            arraylist.add(contact);
            i++;
        } while (true);
    }
}
