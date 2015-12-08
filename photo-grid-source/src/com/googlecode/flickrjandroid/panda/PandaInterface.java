// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.panda;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.panda:
//            Panda

public class PandaInterface
{

    private static final String METHOD_GET_LIST = "flickr.panda.getList";
    private static final String METHOD_GET_PHOTOS = "flickr.panda.getPhotos";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public PandaInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public List getList()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.panda.getList"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        obj = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        obj = ((Response) (obj)).getData().getJSONObject("pandas").optJSONArray("panda");
        int i = 0;
        do
        {
            if (obj == null || i >= ((JSONArray) (obj)).length())
            {
                return arraylist;
            }
            JSONObject jsonobject = ((JSONArray) (obj)).getJSONObject(i);
            Panda panda = new Panda();
            panda.setName(jsonobject.getString("_content"));
            arraylist.add(panda);
            i++;
        } while (true);
    }

    public PhotoList getPhotos(Panda panda, Set set, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.panda.getPhotos"));
        arraylist.add(new Parameter("api_key", apiKey));
        arraylist.add(new Parameter("panda_name", panda.getName()));
        if (set != null && !set.isEmpty())
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        panda = transportAPI.get(transportAPI.getPath(), arraylist);
        if (panda.isError())
        {
            throw new FlickrException(panda.getErrorCode(), panda.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(panda.getData());
        }
    }
}
