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
//            Annotations, GeoLocation, Annotation

public final class StatusUpdate
    implements Serializable
{

    private static final long serialVersionUID = 0xce1a355ac8548044L;
    private Annotations annotations;
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
        annotations = null;
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

    public void addAnnotation(Annotation annotation1)
    {
        if (annotations == null)
        {
            annotations = new Annotations();
        }
        annotations.addAnnotation(annotation1);
    }

    public StatusUpdate annotation(Annotation annotation1)
    {
        addAnnotation(annotation1);
        return this;
    }

    public StatusUpdate annotations(Annotations annotations1)
    {
        setAnnotations(annotations1);
        return this;
    }

    HttpParameter[] asHttpParameterArray(HttpParameter httpparameter)
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
        if (annotations != null && !annotations.isEmpty())
        {
            appendParameter("annotations", annotations.asParameterValue(), arraylist);
        }
        arraylist.add(httpparameter);
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

    public StatusUpdate displayCoordinates(boolean flag)
    {
        setDisplayCoordinates(flag);
        return this;
    }

    public boolean equals(Object obj)
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
            if (annotations == null ? ((StatusUpdate) (obj)).annotations != null : !annotations.equals(((StatusUpdate) (obj)).annotations))
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

    public Annotations getAnnotations()
    {
        return annotations;
    }

    public long getInReplyToStatusId()
    {
        return inReplyToStatusId;
    }

    public GeoLocation getLocation()
    {
        return location;
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public String getStatus()
    {
        return status;
    }

    public int hashCode()
    {
        int j1 = 1;
        int i2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int k1;
        int l1;
        int j2;
        if (status != null)
        {
            i = status.hashCode();
        } else
        {
            i = 0;
        }
        j2 = (int)(inReplyToStatusId ^ inReplyToStatusId >>> 32);
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
        if (annotations != null)
        {
            i1 = annotations.hashCode();
        } else
        {
            i1 = 0;
        }
        if (!possiblySensitive)
        {
            j1 = 0;
        }
        if (mediaName != null)
        {
            k1 = mediaName.hashCode();
        } else
        {
            k1 = 0;
        }
        if (mediaBody != null)
        {
            l1 = mediaBody.hashCode();
        } else
        {
            l1 = 0;
        }
        if (mediaFile != null)
        {
            i2 = mediaFile.hashCode();
        }
        return ((((((((i * 31 + j2) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2;
    }

    public StatusUpdate inReplyToStatusId(long l)
    {
        setInReplyToStatusId(l);
        return this;
    }

    public boolean isDisplayCoordinates()
    {
        return displayCoordinates;
    }

    public boolean isPossiblySensitive()
    {
        return possiblySensitive;
    }

    boolean isWithMedia()
    {
        return mediaFile != null || mediaName != null;
    }

    public StatusUpdate location(GeoLocation geolocation)
    {
        setLocation(geolocation);
        return this;
    }

    public StatusUpdate media(File file)
    {
        setMedia(file);
        return this;
    }

    public StatusUpdate media(String s, InputStream inputstream)
    {
        setMedia(s, inputstream);
        return this;
    }

    public StatusUpdate placeId(String s)
    {
        setPlaceId(s);
        return this;
    }

    public StatusUpdate possiblySensitive(boolean flag)
    {
        setPossiblySensitive(flag);
        return this;
    }

    public void setAnnotations(Annotations annotations1)
    {
        annotations = annotations1;
    }

    public void setDisplayCoordinates(boolean flag)
    {
        displayCoordinates = flag;
    }

    public void setInReplyToStatusId(long l)
    {
        inReplyToStatusId = l;
    }

    public void setLocation(GeoLocation geolocation)
    {
        location = geolocation;
    }

    public void setMedia(File file)
    {
        mediaFile = file;
    }

    public void setMedia(String s, InputStream inputstream)
    {
        mediaName = s;
        mediaBody = inputstream;
    }

    public void setPlaceId(String s)
    {
        placeId = s;
    }

    public void setPossiblySensitive(boolean flag)
    {
        possiblySensitive = flag;
    }

    public String toString()
    {
        return "StatusUpdate{status='" + status + '\'' + ", inReplyToStatusId=" + inReplyToStatusId + ", location=" + location + ", placeId='" + placeId + '\'' + ", displayCoordinates=" + displayCoordinates + ", annotations=" + annotations + ", possiblySensitive=" + possiblySensitive + ", mediaName='" + mediaName + '\'' + ", mediaBody=" + mediaBody + ", mediaFile=" + mediaFile + '}';
    }
}
