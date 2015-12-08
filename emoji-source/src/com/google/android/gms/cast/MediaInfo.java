// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.in;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaMetadata, MediaTrack, TextTrackStyle

public final class MediaInfo
{
    public static class Builder
    {

        private final MediaInfo AB;

        public MediaInfo build()
            throws IllegalArgumentException
        {
            AB.dY();
            return AB;
        }

        public Builder setContentType(String s)
            throws IllegalArgumentException
        {
            AB.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            AB.setCustomData(jsonobject);
            return this;
        }

        public Builder setMediaTracks(List list)
        {
            AB.b(list);
            return this;
        }

        public Builder setMetadata(MediaMetadata mediametadata)
        {
            AB.a(mediametadata);
            return this;
        }

        public Builder setStreamDuration(long l)
            throws IllegalArgumentException
        {
            AB.m(l);
            return this;
        }

        public Builder setStreamType(int i)
            throws IllegalArgumentException
        {
            AB.setStreamType(i);
            return this;
        }

        public Builder setTextTrackStyle(TextTrackStyle texttrackstyle)
        {
            AB.setTextTrackStyle(texttrackstyle);
            return this;
        }

        public Builder(String s)
            throws IllegalArgumentException
        {
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("Content ID cannot be empty");
            } else
            {
                AB = new MediaInfo(s);
                return;
            }
        }
    }


    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    private JSONObject AA;
    private final String At;
    private int Au;
    private String Av;
    private MediaMetadata Aw;
    private long Ax;
    private List Ay;
    private TextTrackStyle Az;

    MediaInfo(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else
        {
            At = s;
            Au = -1;
            return;
        }
    }

    MediaInfo(JSONObject jsonobject)
        throws JSONException
    {
        int i = 0;
        super();
        At = jsonobject.getString("contentId");
        Object obj = jsonobject.getString("streamType");
        if ("NONE".equals(obj))
        {
            Au = 0;
        } else
        if ("BUFFERED".equals(obj))
        {
            Au = 1;
        } else
        if ("LIVE".equals(obj))
        {
            Au = 2;
        } else
        {
            Au = -1;
        }
        Av = jsonobject.getString("contentType");
        if (jsonobject.has("metadata"))
        {
            obj = jsonobject.getJSONObject("metadata");
            Aw = new MediaMetadata(((JSONObject) (obj)).getInt("metadataType"));
            Aw.b(((JSONObject) (obj)));
        }
        Ax = gi.b(jsonobject.optDouble("duration", 0.0D));
        if (jsonobject.has("tracks"))
        {
            Ay = new ArrayList();
            for (obj = jsonobject.getJSONArray("tracks"); i < ((JSONArray) (obj)).length(); i++)
            {
                MediaTrack mediatrack = new MediaTrack(((JSONArray) (obj)).getJSONObject(i));
                Ay.add(mediatrack);
            }

        } else
        {
            Ay = null;
        }
        if (jsonobject.has("textTrackStyle"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("textTrackStyle");
            TextTrackStyle texttrackstyle = new TextTrackStyle();
            texttrackstyle.b(jsonobject1);
            Az = texttrackstyle;
        } else
        {
            Az = null;
        }
        AA = jsonobject.optJSONObject("customData");
    }

    void a(MediaMetadata mediametadata)
    {
        Aw = mediametadata;
    }

    void b(List list)
    {
        Ay = list;
    }

    void dY()
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(At))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if (TextUtils.isEmpty(Av))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if (Au == -1)
        {
            throw new IllegalArgumentException("a valid stream type must be specified");
        } else
        {
            return;
        }
    }

    public JSONObject dZ()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("contentId", At);
        Au;
        JVM INSTR tableswitch 1 2: default 208
    //                   1 217
    //                   2 223;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_223;
_L8:
        Object obj;
        jsonobject.put("streamType", obj);
        if (Av != null)
        {
            jsonobject.put("contentType", Av);
        }
        if (Aw != null)
        {
            jsonobject.put("metadata", Aw.dZ());
        }
        jsonobject.put("duration", gi.o(Ax));
        if (Ay == null) goto _L5; else goto _L4
_L4:
        obj = new JSONArray();
        for (Iterator iterator = Ay.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((MediaTrack)iterator.next()).dZ())) { }
        jsonobject.put("tracks", obj);
_L5:
        if (Az != null)
        {
            jsonobject.put("textTrackStyle", Az.dZ());
        }
        if (AA == null) goto _L7; else goto _L6
_L6:
        jsonobject.put("customData", AA);
        return jsonobject;
_L1:
        obj = "NONE";
          goto _L8
        obj;
_L7:
        return jsonobject;
_L2:
        obj = "BUFFERED";
          goto _L8
        obj = "LIVE";
          goto _L8
    }

    public boolean equals(Object obj)
    {
        boolean flag4;
        boolean flag5;
        flag4 = true;
        flag5 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag2 = true;
_L4:
        return flag2;
_L2:
        flag2 = flag5;
        if (!(obj instanceof MediaInfo)) goto _L4; else goto _L3
_L3:
        obj = (MediaInfo)obj;
        boolean flag;
        boolean flag1;
        if (AA == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaInfo) (obj)).AA == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (AA == null || ((MediaInfo) (obj)).AA == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!in.d(AA, ((MediaInfo) (obj)).AA)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (gi.a(At, ((MediaInfo) (obj)).At) && Au == ((MediaInfo) (obj)).Au && gi.a(Av, ((MediaInfo) (obj)).Av) && gi.a(Aw, ((MediaInfo) (obj)).Aw) && Ax == ((MediaInfo) (obj)).Ax)
        {
            flag3 = flag4;
        } else
        {
            flag3 = false;
        }
        return flag3;
    }

    public String getContentId()
    {
        return At;
    }

    public String getContentType()
    {
        return Av;
    }

    public JSONObject getCustomData()
    {
        return AA;
    }

    public List getMediaTracks()
    {
        return Ay;
    }

    public MediaMetadata getMetadata()
    {
        return Aw;
    }

    public long getStreamDuration()
    {
        return Ax;
    }

    public int getStreamType()
    {
        return Au;
    }

    public TextTrackStyle getTextTrackStyle()
    {
        return Az;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            At, Integer.valueOf(Au), Av, Aw, Long.valueOf(Ax), String.valueOf(AA)
        });
    }

    void m(long l)
        throws IllegalArgumentException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("Stream duration cannot be negative");
        } else
        {
            Ax = l;
            return;
        }
    }

    void setContentType(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        } else
        {
            Av = s;
            return;
        }
    }

    void setCustomData(JSONObject jsonobject)
    {
        AA = jsonobject;
    }

    void setStreamType(int i)
        throws IllegalArgumentException
    {
        if (i < -1 || i > 2)
        {
            throw new IllegalArgumentException("invalid stream type");
        } else
        {
            Au = i;
            return;
        }
    }

    public void setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        Az = texttrackstyle;
    }
}
