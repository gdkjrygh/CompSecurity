// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos.comments;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.PhotoList;
import com.googlecode.flickrjandroid.photos.PhotoUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.photos.comments:
//            Comment

public class CommentsInterface
{

    public static final String METHOD_ADD_COMMENT = "flickr.photos.comments.addComment";
    public static final String METHOD_DELETE_COMMENT = "flickr.photos.comments.deleteComment";
    public static final String METHOD_EDIT_COMMENT = "flickr.photos.comments.editComment";
    public static final String METHOD_GET_LIST = "flickr.photos.comments.getList";
    public static final String METHOD_GET_RECENT = "flickr.photos.comments.getRecentForContacts";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public CommentsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public String addComment(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.comments.addComment"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        arraylist.add(new Parameter("comment_text", s1));
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            return s.getData().getJSONObject("comment").getString("id");
        }
    }

    public void deleteComment(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.comments.deleteComment"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("comment_id", s));
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

    public void editComment(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.comments.editComment"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("comment_id", s));
        arraylist.add(new Parameter("comment_text", s1));
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

    public List getList(String s, Date date, Date date1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.comments.getList"));
        boolean flag = OAuthUtils.hasSigned();
        if (flag)
        {
            arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        } else
        {
            arraylist.add(new Parameter("api_key", apiKey));
        }
        arraylist.add(new Parameter("photo_id", s));
        if (date != null)
        {
            arraylist.add(new Parameter("min_comment_date", date.getTime() / 1000L));
        }
        if (date1 != null)
        {
            arraylist.add(new Parameter("max_comment_date", date1.getTime() / 1000L));
        }
        if (flag)
        {
            OAuthUtils.addOAuthToken(arraylist);
        }
        if (flag)
        {
            s = transportAPI.postJSON(sharedSecret, arraylist);
        } else
        {
            s = transportAPI.get(transportAPI.getPath(), arraylist);
        }
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        date = new ArrayList();
        s = s.getData().getJSONObject("comments").optJSONArray("comment");
        int i = 0;
        do
        {
            if (s == null || i >= s.length())
            {
                return date;
            }
            date1 = new Comment();
            JSONObject jsonobject = s.getJSONObject(i);
            date1.setId(jsonobject.getString("id"));
            date1.setAuthor(jsonobject.getString("author"));
            date1.setAuthorName(jsonobject.getString("authorname"));
            date1.setIconServer(jsonobject.getInt("iconserver"));
            date1.setIconFarm(jsonobject.getInt("iconfarm"));
            date1.setPermaLink(jsonobject.getString("permalink"));
            date1.setDateCreate(new Date(jsonobject.optLong("datecreate") * 1000L));
            date1.setText(jsonobject.getString("_content"));
            date.add(date1);
            i++;
        } while (true);
    }

    public PhotoList getRecentForContacts(Date date, List list, Set set, int i, int j)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.getNotInSet"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        if (date != null)
        {
            arraylist.add(new Parameter("last_comment", String.valueOf(date.getTime() / 1000L)));
        }
        if (set != null && !set.isEmpty())
        {
            arraylist.add(new Parameter("extras", StringUtilities.join(set, ",")));
        }
        if (list != null && !list.isEmpty())
        {
            arraylist.add(new Parameter("contacts_filter", StringUtilities.join(list, ",")));
        }
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", i));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", j));
        }
        OAuthUtils.addOAuthToken(arraylist);
        date = transportAPI.postJSON(sharedSecret, arraylist);
        if (date.isError())
        {
            throw new FlickrException(date.getErrorCode(), date.getErrorMessage());
        } else
        {
            return PhotoUtils.createPhotoList(date.getData());
        }
    }
}
