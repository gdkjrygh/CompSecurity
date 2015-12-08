// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import twitter4j.internal.http.HttpParameter;

// Referenced classes of package twitter4j:
//            GeoLocation

public final class StatusUpdate
    implements Serializable
{

    private static final long serialVersionUID = 0xce1a355ac8548044L;
    private boolean displayCoordinates;
    private long inReplyToStatusId;
    private GeoLocation location;
    private transient InputStream mediaBody;
    private File mediaFile;
    private String mediaName;
    private String placeId;
    private boolean possiblySensitive;
    private String status;

    public StatusUpdate(String s)
    {
        inReplyToStatusId = -1L;
        location = null;
        placeId = null;
        displayCoordinates = true;
        status = s;
    }

    private void appendParameter(String s, double d, List list)
    {
        list.add(new HttpParameter(s, String.valueOf(d)));
    }

    private void appendParameter(String s, long l, List list)
    {
        list.add(new HttpParameter(s, String.valueOf(l)));
    }

    private void appendParameter(String s, String s1, List list)
    {
        if (s1 != null)
        {
            list.add(new HttpParameter(s, s1));
        }
    }

    final HttpParameter[] asHttpParameterArray()
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        appendParameter("status", status, arraylist);
        if (-1L != inReplyToStatusId)
        {
            appendParameter("in_reply_to_status_id", inReplyToStatusId, arraylist);
        }
        if (location != null)
        {
            appendParameter("lat", location.getLatitude(), arraylist);
            appendParameter("long", location.getLongitude(), arraylist);
        }
        appendParameter("place_id", placeId, arraylist);
        if (!displayCoordinates)
        {
            appendParameter("display_coordinates", "false", arraylist);
        }
        if (mediaFile == null) goto _L2; else goto _L1
_L1:
        arraylist.add(new HttpParameter("media[]", mediaFile));
        arraylist.add(new HttpParameter("possibly_sensitive", possiblySensitive));
_L4:
        return (HttpParameter[])arraylist.toArray(new HttpParameter[arraylist.size()]);
_L2:
        if (mediaName != null && mediaBody != null)
        {
            arraylist.add(new HttpParameter("media[]", mediaName, mediaBody));
            arraylist.add(new HttpParameter("possibly_sensitive", possiblySensitive));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final StatusUpdate displayCoordinates(boolean flag)
    {
        setDisplayCoordinates(flag);
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (StatusUpdate)obj;
            if (displayCoordinates != ((StatusUpdate) (obj)).displayCoordinates)
            {
                return false;
            }
            if (inReplyToStatusId != ((StatusUpdate) (obj)).inReplyToStatusId)
            {
                return false;
            }
            if (possiblySensitive != ((StatusUpdate) (obj)).possiblySensitive)
            {
                return false;
            }
            if (location == null ? ((StatusUpdate) (obj)).location != null : !location.equals(((StatusUpdate) (obj)).location))
            {
                return false;
            }
            if (mediaBody == null ? ((StatusUpdate) (obj)).mediaBody != null : !mediaBody.equals(((StatusUpdate) (obj)).mediaBody))
            {
                return false;
            }
            if (mediaFile == null ? ((StatusUpdate) (obj)).mediaFile != null : !mediaFile.equals(((StatusUpdate) (obj)).mediaFile))
            {
                return false;
            }
            if (mediaName == null ? ((StatusUpdate) (obj)).mediaName != null : !mediaName.equals(((StatusUpdate) (obj)).mediaName))
            {
                return false;
            }
            if (placeId == null ? ((StatusUpdate) (obj)).placeId != null : !placeId.equals(((StatusUpdate) (obj)).placeId))
            {
                return false;
            }
            if (status == null ? ((StatusUpdate) (obj)).status != null : !status.equals(((StatusUpdate) (obj)).status))
            {
                return false;
            }
        }
        return true;
    }

    public final long getInReplyToStatusId()
    {
        return inReplyToStatusId;
    }

    public final GeoLocation getLocation()
    {
        return location;
    }

    public final String getPlaceId()
    {
        return placeId;
    }

    public final String getStatus()
    {
        return status;
    }

    public final int hashCode()
    {
        int i1 = 1;
        int l1 = 0;
        int i;
        int j;
        int k;
        int l;
        int j1;
        int k1;
        int i2;
        if (status != null)
        {
            i = status.hashCode();
        } else
        {
            i = 0;
        }
        i2 = (int)(inReplyToStatusId ^ inReplyToStatusId >>> 32);
        if (location != null)
        {
            j = location.hashCode();
        } else
        {
            j = 0;
        }
        if (placeId != null)
        {
            k = placeId.hashCode();
        } else
        {
            k = 0;
        }
        if (displayCoordinates)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (!possiblySensitive)
        {
            i1 = 0;
        }
        if (mediaName != null)
        {
            j1 = mediaName.hashCode();
        } else
        {
            j1 = 0;
        }
        if (mediaBody != null)
        {
            k1 = mediaBody.hashCode();
        } else
        {
            k1 = 0;
        }
        if (mediaFile != null)
        {
            l1 = mediaFile.hashCode();
        }
        return (k1 + (j1 + ((l + (k + (j + (i * 31 + i2) * 31) * 31) * 31) * 31 + i1) * 31) * 31) * 31 + l1;
    }

    public final StatusUpdate inReplyToStatusId(long l)
    {
        setInReplyToStatusId(l);
        return this;
    }

    public final boolean isDisplayCoordinates()
    {
        return displayCoordinates;
    }

    public final boolean isPossiblySensitive()
    {
        return possiblySensitive;
    }

    final boolean isWithMedia()
    {
        return mediaFile != null || mediaName != null;
    }

    public final StatusUpdate location(GeoLocation geolocation)
    {
        setLocation(geolocation);
        return this;
    }

    public final StatusUpdate media(File file)
    {
        setMedia(file);
        return this;
    }

    public final StatusUpdate media(String s, InputStream inputstream)
    {
        setMedia(s, inputstream);
        return this;
    }

    public final StatusUpdate placeId(String s)
    {
        setPlaceId(s);
        return this;
    }

    public final StatusUpdate possiblySensitive(boolean flag)
    {
        setPossiblySensitive(flag);
        return this;
    }

    public final void setDisplayCoordinates(boolean flag)
    {
        displayCoordinates = flag;
    }

    public final void setInReplyToStatusId(long l)
    {
        inReplyToStatusId = l;
    }

    public final void setLocation(GeoLocation geolocation)
    {
        location = geolocation;
    }

    public final void setMedia(File file)
    {
        mediaFile = file;
    }

    public final void setMedia(String s, InputStream inputstream)
    {
        mediaName = s;
        mediaBody = inputstream;
    }

    public final void setPlaceId(String s)
    {
        placeId = s;
    }

    public final void setPossiblySensitive(boolean flag)
    {
        possiblySensitive = flag;
    }

    public final String toString()
    {
        return (new StringBuilder("StatusUpdate{status='")).append(status).append('\'').append(", inReplyToStatusId=").append(inReplyToStatusId).append(", location=").append(location).append(", placeId='").append(placeId).append('\'').append(", displayCoordinates=").append(displayCoordinates).append(", possiblySensitive=").append(possiblySensitive).append(", mediaName='").append(mediaName).append('\'').append(", mediaBody=").append(mediaBody).append(", mediaFile=").append(mediaFile).append('}').toString();
    }
}
