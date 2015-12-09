// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

// Referenced classes of package twitter4j:
//            TwitterException, JSONException, ParseUtil, JSONObject

public final class UploadedMedia
    implements Serializable
{

    private static final long serialVersionUID = 0x4ad81d1659e17caeL;
    private int imageHeight;
    private String imageType;
    private int imageWidth;
    private long mediaId;
    private long size;

    UploadedMedia(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        mediaId = ParseUtil.getLong("media_id", jsonobject);
        size = ParseUtil.getLong("size", jsonobject);
        try
        {
            if (!jsonobject.isNull("image"))
            {
                jsonobject = jsonobject.getJSONObject("image");
                imageWidth = ParseUtil.getInt("w", jsonobject);
                imageHeight = ParseUtil.getInt("h", jsonobject);
                imageType = ParseUtil.getUnescapedString("image_type", jsonobject);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new TwitterException(jsonobject);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UploadedMedia)obj;
            if (imageWidth != ((UploadedMedia) (obj)).imageWidth)
            {
                return false;
            }
            if (imageHeight != ((UploadedMedia) (obj)).imageHeight)
            {
                return false;
            }
            if (imageType != ((UploadedMedia) (obj)).imageType)
            {
                return false;
            }
            if (mediaId != ((UploadedMedia) (obj)).mediaId)
            {
                return false;
            }
            if (size != ((UploadedMedia) (obj)).size)
            {
                return false;
            }
        }
        return true;
    }

    public int getImageHeight()
    {
        return imageHeight;
    }

    public String getImageType()
    {
        return imageType;
    }

    public int getImageWidth()
    {
        return imageWidth;
    }

    public long getMediaId()
    {
        return mediaId;
    }

    public long getSize()
    {
        return size;
    }

    public int hashCode()
    {
        int j = (int)(mediaId ^ mediaId >>> 32);
        int k = imageWidth;
        int l = imageHeight;
        int i;
        if (imageType != null)
        {
            i = imageType.hashCode();
        } else
        {
            i = 0;
        }
        return (i + ((j * 31 + k) * 31 + l) * 31) * 31 + (int)(size ^ size >>> 32);
    }

    public String toString()
    {
        return (new StringBuilder()).append("UploadedMedia{mediaId=").append(mediaId).append(", imageWidth=").append(imageWidth).append(", imageHeight=").append(imageHeight).append(", imageType='").append(imageType).append('\'').append(", size=").append(size).append('}').toString();
    }
}
