// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos.licenses;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.photos.licenses:
//            License

public class LicensesInterface
{

    public static final String METHOD_GET_INFO = "flickr.photos.licenses.getInfo";
    public static final String METHOD_SET_LICENSE = "flickr.photos.licenses.setLicense";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public LicensesInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public Collection getInfo()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.licenses.getInfo"));
        arraylist.add(new Parameter("api_key", apiKey));
        Object obj = transportAPI.get(transportAPI.getPath(), arraylist);
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        arraylist = new ArrayList();
        obj = ((Response) (obj)).getData().getJSONObject("licenses").optJSONArray("license");
        int i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return arraylist;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            License license = new License();
            license.setId(jsonobject.getString("id"));
            license.setName(jsonobject.getString("name"));
            license.setUrl(jsonobject.getString("url"));
            arraylist.add(license);
            i++;
        } while (true);
    }

    public void setLicense(String s, int i)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.licenses.setLicense"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("license_id", i));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return;
        }
    }
}
