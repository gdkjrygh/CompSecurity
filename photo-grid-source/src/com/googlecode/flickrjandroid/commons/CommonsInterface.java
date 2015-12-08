// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.commons;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.commons:
//            Institution

public class CommonsInterface
{

    public static final String METHOD_GET_INSTITUTIONS = "flickr.commons.getInstitutions";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public CommonsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    private Institution parseInstitution(JSONObject jsonobject)
    {
        Institution institution;
        int i;
        institution = new Institution();
        institution.setId(jsonobject.getString("nsid"));
        institution.setDateLaunch(jsonobject.getLong("date_launch"));
        institution.setName(jsonobject.getJSONObject("name").getString("_content"));
        jsonobject = jsonobject.getJSONObject("urls").getJSONArray("url");
        i = 0;
_L2:
        JSONObject jsonobject1;
        if (i >= jsonobject.length())
        {
            return institution;
        }
        jsonobject1 = jsonobject.getJSONObject(i);
        if (!jsonobject1.getString("type").equals("site"))
        {
            break; /* Loop/switch isn't completed */
        }
        institution.setSiteUrl(jsonobject1.getString("_content"));
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (jsonobject1.getString("type").equals("license"))
        {
            institution.setLicenseUrl(jsonobject1.getString("_content"));
        } else
        if (jsonobject1.getString("type").equals("flickr"))
        {
            institution.setFlickrUrl(jsonobject1.getString("_content"));
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public List getInstitutions()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.commons.getInstitutions"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        obj = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        obj = ((Response) (obj)).getData().getJSONObject("institutions").getJSONArray("institution");
        int i = 0;
        do
        {
            if (i >= ((JSONArray) (obj)).length())
            {
                return arraylist;
            }
            arraylist.add(parseInstitution(((JSONArray) (obj)).getJSONObject(i)));
            i++;
        } while (true);
    }
}
