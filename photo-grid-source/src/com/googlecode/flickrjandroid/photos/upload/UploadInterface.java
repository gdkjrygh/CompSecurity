// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos.upload;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.photos.upload:
//            Ticket

public class UploadInterface
{

    public static final String METHOD_CHECK_TICKETS = "flickr.photos.upload.checkTickets";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public UploadInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public List checkTickets(Set set)
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.photos.upload.checkTickets"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        StringBuffer stringbuffer = new StringBuffer();
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                ((List) (obj)).add(new Parameter("tickets", stringbuffer.toString()));
                OAuthUtils.addOAuthToken(((List) (obj)));
                obj = transportAPI.postJSON(sharedSecret, ((List) (obj)));
                if (((Response) (obj)).isError())
                {
                    throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
                }
                break;
            }
            if (stringbuffer.length() > 0)
            {
                stringbuffer.append(",");
            }
            Object obj1 = set.next();
            if (obj1 instanceof Ticket)
            {
                stringbuffer.append(((Ticket)obj1).getTicketId());
            } else
            {
                stringbuffer.append(obj1);
            }
        } while (true);
        set = new ArrayList();
        obj = ((Response) (obj)).getData().getJSONObject("uploader").optJSONArray("ticket");
        int i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return set;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            String s = jsonobject.getString("id");
            String s1 = jsonobject.getString("complete");
            String s2 = jsonobject.getString("photoid");
            Ticket ticket = new Ticket();
            ticket.setTicketId(s);
            if (jsonobject.has("invalid"))
            {
                ticket.setInvalid("1".equals(jsonobject.getString("invalid")));
            }
            ticket.setStatus(Integer.parseInt(s1));
            ticket.setPhotoId(s2);
            set.add(ticket);
            i++;
        } while (true);
    }
}
