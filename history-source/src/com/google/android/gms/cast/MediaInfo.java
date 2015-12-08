// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.in;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.li;
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

        private final MediaInfo Gb;

        public MediaInfo build()
            throws IllegalArgumentException
        {
            Gb.fQ();
            return Gb;
        }

        public Builder setContentType(String s)
            throws IllegalArgumentException
        {
            Gb.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            Gb.setCustomData(jsonobject);
            return this;
        }

        public Builder setMediaTracks(List list)
        {
            Gb.d(list);
            return this;
        }

        public Builder setMetadata(MediaMetadata mediametadata)
        {
            Gb.a(mediametadata);
            return this;
        }

        public Builder setStreamDuration(long l)
            throws IllegalArgumentException
        {
            Gb.m(l);
            return this;
        }

        public Builder setStreamType(int i)
            throws IllegalArgumentException
        {
            Gb.setStreamType(i);
            return this;
        }

        public Builder setTextTrackStyle(TextTrackStyle texttrackstyle)
        {
            Gb.setTextTrackStyle(texttrackstyle);
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
                Gb = new MediaInfo(s);
                return;
            }
        }
    }


    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    public static final long UNKNOWN_DURATION = -1L;
    private final String FT;
    private int FU;
    private String FV;
    private MediaMetadata FW;
    private long FX;
    private List FY;
    private TextTrackStyle FZ;
    private JSONObject Ga;

    MediaInfo(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else
        {
            FT = s;
            FU = -1;
            return;
        }
    }

    MediaInfo(JSONObject jsonobject)
        throws JSONException
    {
        int i = 0;
        super();
        FT = jsonobject.getString("contentId");
        Object obj = jsonobject.getString("streamType");
        if ("NONE".equals(obj))
        {
            FU = 0;
        } else
        if ("BUFFERED".equals(obj))
        {
            FU = 1;
        } else
        if ("LIVE".equals(obj))
        {
            FU = 2;
        } else
        {
            FU = -1;
        }
        FV = jsonobject.getString("contentType");
        if (jsonobject.has("metadata"))
        {
            obj = jsonobject.getJSONObject("metadata");
            FW = new MediaMetadata(((JSONObject) (obj)).getInt("metadataType"));
            FW.c(((JSONObject) (obj)));
        }
        FX = -1L;
        if (jsonobject.has("duration") && !jsonobject.isNull("duration"))
        {
            double d1 = jsonobject.optDouble("duration", 0.0D);
            if (!Double.isNaN(d1) && !Double.isInfinite(d1))
            {
                FX = in.b(d1);
            }
        }
        if (jsonobject.has("tracks"))
        {
            FY = new ArrayList();
            for (obj = jsonobject.getJSONArray("tracks"); i < ((JSONArray) (obj)).length(); i++)
            {
                MediaTrack mediatrack = new MediaTrack(((JSONArray) (obj)).getJSONObject(i));
                FY.add(mediatrack);
            }

        } else
        {
            FY = null;
        }
        if (jsonobject.has("textTrackStyle"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("textTrackStyle");
            TextTrackStyle texttrackstyle = new TextTrackStyle();
            texttrackstyle.c(jsonobject1);
            FZ = texttrackstyle;
        } else
        {
            FZ = null;
        }
        Ga = jsonobject.optJSONObject("customData");
    }

    void a(MediaMetadata mediametadata)
    {
        FW = mediametadata;
    }

    void d(List list)
    {
        FY = list;
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
        if (Ga == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaInfo) (obj)).Ga == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (Ga == null || ((MediaInfo) (obj)).Ga == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!li.d(Ga, ((MediaInfo) (obj)).Ga)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (in.a(FT, ((MediaInfo) (obj)).FT) && FU == ((MediaInfo) (obj)).FU && in.a(FV, ((MediaInfo) (obj)).FV) && in.a(FW, ((MediaInfo) (obj)).FW) && FX == ((MediaInfo) (obj)).FX)
        {
            flag3 = flag4;
        } else
        {
            flag3 = false;
        }
        return flag3;
    }

    void fQ()
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(FT))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if (TextUtils.isEmpty(FV))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if (FU == -1)
        {
            throw new IllegalArgumentException("a valid stream type must be specified");
        } else
        {
            return;
        }
    }

    public String getContentId()
    {
        return FT;
    }

    public String getContentType()
    {
        return FV;
    }

    public JSONObject getCustomData()
    {
        return Ga;
    }

    public List getMediaTracks()
    {
        return FY;
    }

    public MediaMetadata getMetadata()
    {
        return FW;
    }

    public long getStreamDuration()
    {
        return FX;
    }

    public int getStreamType()
    {
        return FU;
    }

    public TextTrackStyle getTextTrackStyle()
    {
        return FZ;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            FT, Integer.valueOf(FU), FV, FW, Long.valueOf(FX), String.valueOf(Ga)
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
            FX = l;
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
            FV = s;
            return;
        }
    }

    void setCustomData(JSONObject jsonobject)
    {
        Ga = jsonobject;
    }

    void setStreamType(int i)
        throws IllegalArgumentException
    {
        if (i < -1 || i > 2)
        {
            throw new IllegalArgumentException("invalid stream type");
        } else
        {
            FU = i;
            return;
        }
    }

    public void setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        FZ = texttrackstyle;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("contentId", FT);
        FU;
        JVM INSTR tableswitch 1 2: default 208
    //                   1 217
    //                   2 223;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_223;
_L8:
        Object obj;
        jsonobject.put("streamType", obj);
        if (FV != null)
        {
            jsonobject.put("contentType", FV);
        }
        if (FW != null)
        {
            jsonobject.put("metadata", FW.toJson());
        }
        jsonobject.put("duration", in.o(FX));
        if (FY == null) goto _L5; else goto _L4
_L4:
        obj = new JSONArray();
        for (Iterator iterator = FY.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((MediaTrack)iterator.next()).toJson())) { }
        jsonobject.put("tracks", obj);
_L5:
        if (FZ != null)
        {
            jsonobject.put("textTrackStyle", FZ.toJson());
        }
        if (Ga == null) goto _L7; else goto _L6
_L6:
        jsonobject.put("customData", Ga);
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
}
