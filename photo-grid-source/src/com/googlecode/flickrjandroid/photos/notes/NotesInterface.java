// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos.notes;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.photos.Note;
import com.googlecode.flickrjandroid.photos.Rectangle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class NotesInterface
{

    public static final String METHOD_ADD = "flickr.photos.notes.add";
    public static final String METHOD_DELETE = "flickr.photos.notes.delete";
    public static final String METHOD_EDIT = "flickr.photos.notes.edit";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public NotesInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public Note add(String s, Note note)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.notes.add"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("photo_id", s));
        s = note.getBounds();
        if (s != null)
        {
            arraylist.add(new Parameter("note_x", String.valueOf(((Rectangle) (s)).x)));
            arraylist.add(new Parameter("note_y", String.valueOf(((Rectangle) (s)).y)));
            arraylist.add(new Parameter("note_w", String.valueOf(((Rectangle) (s)).width)));
            arraylist.add(new Parameter("note_h", String.valueOf(((Rectangle) (s)).height)));
        }
        s = note.getText();
        if (s != null)
        {
            arraylist.add(new Parameter("note_text", s));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        } else
        {
            note.setId(s.getData().getJSONObject("note").getString("id"));
            return note;
        }
    }

    public void delete(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.notes.delete"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("note_id", s));
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

    public void edit(Note note)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.photos.notes.edit"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("note_id", note.getId()));
        Rectangle rectangle = note.getBounds();
        if (rectangle != null)
        {
            arraylist.add(new Parameter("note_x", String.valueOf(rectangle.x)));
            arraylist.add(new Parameter("note_y", String.valueOf(rectangle.y)));
            arraylist.add(new Parameter("note_w", String.valueOf(rectangle.width)));
            arraylist.add(new Parameter("note_h", String.valueOf(rectangle.height)));
        }
        note = note.getText();
        if (note != null)
        {
            arraylist.add(new Parameter("note_text", note));
        }
        OAuthUtils.addOAuthToken(arraylist);
        note = transportAPI.postJSON(sharedSecret, arraylist);
        if (note.isError())
        {
            throw new FlickrException(note.getErrorCode(), note.getErrorMessage());
        } else
        {
            return;
        }
    }
}
