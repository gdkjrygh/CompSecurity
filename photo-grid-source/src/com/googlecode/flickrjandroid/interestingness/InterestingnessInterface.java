// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.interestingness;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.photos.Extras;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.googlecode.flickrjandroid.interestingness:
//            a

public class InterestingnessInterface
{

    private static final ThreadLocal DATE_FORMATS = new a();
    private static final String KEY_API_KEY = "api_key";
    private static final String KEY_DATE = "date";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_METHOD = "method";
    private static final String KEY_PAGE = "page";
    private static final String KEY_PER_PAGE = "per_page";
    public static final String METHOD_GET_LIST = "flickr.interestingness.getList";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public InterestingnessInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public PhotoList getList()
    {
        return getList(((String) (null)), Extras.ALL_EXTRAS, 500, 1);
    }

    public PhotoList getList(String s, Set set, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.interestingness.getList"));
        arraylist.add(new Parameter("api_key", apiKey));
        if (s != null)
        {
            arraylist.add(new Parameter("date", s));
        }
        if (set != null)
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", String.valueOf(j)));
        }
        s = transportAPI.get(transportAPI.getPath(), arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(s.getData());
        }
    }

    public PhotoList getList(Date date, Set set, int i, int j)
    {
        String s = null;
        if (date != null)
        {
            s = ((DateFormat)DATE_FORMATS.get()).format(date);
        }
        return getList(s, set, i, j);
    }

}
