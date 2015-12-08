// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photosets.comments;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.comments.Comment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class PhotosetsCommentsInterface
{

    public static final String METHOD_ADD_COMMENT = "flickr.photosets.comments.addComment";
    public static final String METHOD_DELETE_COMMENT = "flickr.photosets.comments.deleteComment";
    public static final String METHOD_EDIT_COMMENT = "flickr.photosets.comments.editComment";
    public static final String METHOD_GET_LIST = "flickr.photosets.comments.getList";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public PhotosetsCommentsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public String addComment(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photosets.comments.addComment"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photoset_id", s));
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
        arraylist.add(new Parameter("method", "flickr.photosets.comments.deleteComment"));
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
        arraylist.add(new Parameter("method", "flickr.photosets.comments.editComment"));
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

    public List getList(String s)
    {
        Object obj;
        int i;
        obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.photosets.comments.getList"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("photoset_id", s));
        obj = transportAPI.get(transportAPI.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        s = new ArrayList();
        obj = ((Response) (obj)).getData().getJSONObject("comments").optJSONArray("comment");
        i = 0;
_L2:
        Comment comment;
        JSONObject jsonobject;
        long l;
        if (obj == null || i >= ((JSONArray) (obj)).length())
        {
            return s;
        }
        comment = new Comment();
        jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        comment.setId(jsonobject.getString("id"));
        comment.setAuthor(jsonobject.getString("author"));
        comment.setAuthorName(jsonobject.getString("authorname"));
        comment.setPermaLink(jsonobject.getString("permalink"));
        l = 0L;
        long l1 = Long.parseLong(jsonobject.getString("datecreate"));
        l = l1;
_L3:
        comment.setDateCreate(new Date(l * 1000L));
        comment.setText(jsonobject.getString("_content"));
        s.add(comment);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception.printStackTrace();
          goto _L3
    }
}
