// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.uploader;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.REST;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;

// Referenced classes of package com.googlecode.flickrjandroid.uploader:
//            UploaderResponse, ImageParameter, UploadMetaData

public class Uploader
{

    public static final String REPLACE_PATH = "/services/replace/";
    public static final String UPLOAD_PATH = "/services/upload/";
    public static final String URL_REPLACE = "https://api.flickr.com/services/replace/";
    public static final String URL_UPLOAD = "https://api.flickr.com/services/upload/";
    private String apiKey;
    private String sharedSecret;
    private Transport transport;

    public Uploader(String s, String s1)
    {
        try
        {
            apiKey = s;
            sharedSecret = s1;
            transport = new REST("api.flickr.com");
            transport.setResponseClass(com/googlecode/flickrjandroid/uploader/UploaderResponse);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s.getMessage(), s);
        }
    }

    public String replace(String s, InputStream inputstream, String s1, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        String s2;
        if (flag)
        {
            s2 = "1";
        } else
        {
            s2 = "0";
        }
        arraylist.add(new Parameter("async", s2));
        arraylist.add(new Parameter("photo_id", s1));
        arraylist.add(new ImageParameter(s, inputstream));
        OAuthUtils.addOAuthToken(arraylist);
        s = (UploaderResponse)transport.replace(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        if (flag)
        {
            return s.getTicketId();
        } else
        {
            return s.getPhotoId();
        }
    }

    public String replace(String s, byte abyte0[], String s1, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        String s2;
        if (flag)
        {
            s2 = "1";
        } else
        {
            s2 = "0";
        }
        arraylist.add(new Parameter("async", s2));
        arraylist.add(new Parameter("photo_id", s1));
        arraylist.add(new ImageParameter(s, abyte0));
        OAuthUtils.addOAuthToken(arraylist);
        s = (UploaderResponse)transport.replace(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        if (flag)
        {
            return s.getTicketId();
        } else
        {
            return s.getPhotoId();
        }
    }

    public String upload(String s, InputStream inputstream, UploadMetaData uploadmetadata)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        Object obj = uploadmetadata.getTitle();
        if (obj != null)
        {
            arraylist.add(new Parameter("title", obj));
        }
        obj = uploadmetadata.getDescription();
        if (obj != null)
        {
            arraylist.add(new Parameter("description", obj));
        }
        obj = uploadmetadata.getTags();
        if (obj != null)
        {
            arraylist.add(new Parameter("tags", StringUtilities.join(((java.util.Collection) (obj)), " ")));
        }
        if (uploadmetadata.isPublicFlag())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        arraylist.add(new Parameter("is_public", obj));
        if (uploadmetadata.isFamilyFlag())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        arraylist.add(new Parameter("is_family", obj));
        if (uploadmetadata.isFriendFlag())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        arraylist.add(new Parameter("is_friend", obj));
        if (uploadmetadata.isAsync())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        arraylist.add(new Parameter("async", obj));
        if (uploadmetadata.getSafetyLevel() != null)
        {
            arraylist.add(new Parameter("safety_level", uploadmetadata.getSafetyLevel()));
        }
        if (uploadmetadata.getContentType() != null)
        {
            arraylist.add(new Parameter("content_type", uploadmetadata.getContentType()));
        }
        arraylist.add(new ImageParameter(s, inputstream));
        OAuthUtils.addOAuthToken(arraylist);
        s = (UploaderResponse)transport.upload(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        if (uploadmetadata.isAsync())
        {
            return s.getTicketId();
        } else
        {
            return s.getPhotoId();
        }
    }

    public String upload(String s, byte abyte0[], UploadMetaData uploadmetadata)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        Object obj = uploadmetadata.getTitle();
        if (obj != null)
        {
            arraylist.add(new Parameter("title", obj));
        }
        obj = uploadmetadata.getDescription();
        if (obj != null)
        {
            arraylist.add(new Parameter("description", obj));
        }
        obj = uploadmetadata.getTags();
        if (obj != null)
        {
            arraylist.add(new Parameter("tags", StringUtilities.join(((java.util.Collection) (obj)), " ")));
        }
        if (uploadmetadata.isPublicFlag())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        arraylist.add(new Parameter("is_public", obj));
        if (uploadmetadata.isFamilyFlag())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        arraylist.add(new Parameter("is_family", obj));
        if (uploadmetadata.isFriendFlag())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        arraylist.add(new Parameter("is_friend", obj));
        arraylist.add(new ImageParameter(s, abyte0));
        if (uploadmetadata.isHidden() != null)
        {
            if (uploadmetadata.isHidden().booleanValue())
            {
                s = "1";
            } else
            {
                s = "0";
            }
            arraylist.add(new Parameter("hidden", s));
        }
        if (uploadmetadata.getSafetyLevel() != null)
        {
            arraylist.add(new Parameter("safety_level", uploadmetadata.getSafetyLevel()));
        }
        if (uploadmetadata.isAsync())
        {
            s = "1";
        } else
        {
            s = "0";
        }
        arraylist.add(new Parameter("async", s));
        if (uploadmetadata.getContentType() != null)
        {
            arraylist.add(new Parameter("content_type", uploadmetadata.getContentType()));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = (UploaderResponse)transport.upload(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        if (uploadmetadata.isAsync())
        {
            return s.getTicketId();
        } else
        {
            return s.getPhotoId();
        }
    }
}
