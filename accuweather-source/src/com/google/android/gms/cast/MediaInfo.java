// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.gj;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.io;
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

        private final MediaInfo Ay;

        public MediaInfo build()
            throws IllegalArgumentException
        {
            Ay.dT();
            return Ay;
        }

        public Builder setContentType(String s)
            throws IllegalArgumentException
        {
            Ay.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            Ay.setCustomData(jsonobject);
            return this;
        }

        public Builder setMediaTracks(List list)
        {
            Ay.b(list);
            return this;
        }

        public Builder setMetadata(MediaMetadata mediametadata)
        {
            Ay.a(mediametadata);
            return this;
        }

        public Builder setStreamDuration(long l)
            throws IllegalArgumentException
        {
            Ay.m(l);
            return this;
        }

        public Builder setStreamType(int i)
            throws IllegalArgumentException
        {
            Ay.setStreamType(i);
            return this;
        }

        public Builder setTextTrackStyle(TextTrackStyle texttrackstyle)
        {
            Ay.setTextTrackStyle(texttrackstyle);
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
                Ay = new MediaInfo(s);
                return;
            }
        }
    }


    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    private final String Aq;
    private int Ar;
    private String As;
    private MediaMetadata At;
    private long Au;
    private List Av;
    private TextTrackStyle Aw;
    private JSONObject Ax;

    MediaInfo(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else
        {
            Aq = s;
            Ar = -1;
            return;
        }
    }

    MediaInfo(JSONObject jsonobject)
        throws JSONException
    {
        int i = 0;
        super();
        Aq = jsonobject.getString("contentId");
        Object obj = jsonobject.getString("streamType");
        if ("NONE".equals(obj))
        {
            Ar = 0;
        } else
        if ("BUFFERED".equals(obj))
        {
            Ar = 1;
        } else
        if ("LIVE".equals(obj))
        {
            Ar = 2;
        } else
        {
            Ar = -1;
        }
        As = jsonobject.getString("contentType");
        if (jsonobject.has("metadata"))
        {
            obj = jsonobject.getJSONObject("metadata");
            At = new MediaMetadata(((JSONObject) (obj)).getInt("metadataType"));
            At.b(((JSONObject) (obj)));
        }
        Au = gj.b(jsonobject.optDouble("duration", 0.0D));
        if (jsonobject.has("tracks"))
        {
            Av = new ArrayList();
            for (obj = jsonobject.getJSONArray("tracks"); i < ((JSONArray) (obj)).length(); i++)
            {
                MediaTrack mediatrack = new MediaTrack(((JSONArray) (obj)).getJSONObject(i));
                Av.add(mediatrack);
            }

        } else
        {
            Av = null;
        }
        if (jsonobject.has("textTrackStyle"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("textTrackStyle");
            TextTrackStyle texttrackstyle = new TextTrackStyle();
            texttrackstyle.b(jsonobject1);
            Aw = texttrackstyle;
        } else
        {
            Aw = null;
        }
        Ax = jsonobject.optJSONObject("customData");
    }

    void a(MediaMetadata mediametadata)
    {
        At = mediametadata;
    }

    void b(List list)
    {
        Av = list;
    }

    void dT()
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(Aq))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if (TextUtils.isEmpty(As))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if (Ar == -1)
        {
            throw new IllegalArgumentException("a valid stream type must be specified");
        } else
        {
            return;
        }
    }

    public JSONObject dU()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("contentId", Aq);
        Ar;
        JVM INSTR tableswitch 1 2: default 208
    //                   1 217
    //                   2 223;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_223;
_L8:
        Object obj;
        jsonobject.put("streamType", obj);
        if (As != null)
        {
            jsonobject.put("contentType", As);
        }
        if (At != null)
        {
            jsonobject.put("metadata", At.dU());
        }
        jsonobject.put("duration", gj.o(Au));
        if (Av == null) goto _L5; else goto _L4
_L4:
        obj = new JSONArray();
        for (Iterator iterator = Av.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((MediaTrack)iterator.next()).dU())) { }
        jsonobject.put("tracks", obj);
_L5:
        if (Aw != null)
        {
            jsonobject.put("textTrackStyle", Aw.dU());
        }
        if (Ax == null) goto _L7; else goto _L6
_L6:
        jsonobject.put("customData", Ax);
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
        if (Ax == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaInfo) (obj)).Ax == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (Ax == null || ((MediaInfo) (obj)).Ax == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!io.d(Ax, ((MediaInfo) (obj)).Ax)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (gj.a(Aq, ((MediaInfo) (obj)).Aq) && Ar == ((MediaInfo) (obj)).Ar && gj.a(As, ((MediaInfo) (obj)).As) && gj.a(At, ((MediaInfo) (obj)).At) && Au == ((MediaInfo) (obj)).Au)
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
        return Aq;
    }

    public String getContentType()
    {
        return As;
    }

    public JSONObject getCustomData()
    {
        return Ax;
    }

    public List getMediaTracks()
    {
        return Av;
    }

    public MediaMetadata getMetadata()
    {
        return At;
    }

    public long getStreamDuration()
    {
        return Au;
    }

    public int getStreamType()
    {
        return Ar;
    }

    public TextTrackStyle getTextTrackStyle()
    {
        return Aw;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Aq, Integer.valueOf(Ar), As, At, Long.valueOf(Au), String.valueOf(Ax)
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
            Au = l;
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
            As = s;
            return;
        }
    }

    void setCustomData(JSONObject jsonobject)
    {
        Ax = jsonobject;
    }

    void setStreamType(int i)
        throws IllegalArgumentException
    {
        if (i < -1 || i > 2)
        {
            throw new IllegalArgumentException("invalid stream type");
        } else
        {
            Ar = i;
            return;
        }
    }

    public void setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        Aw = texttrackstyle;
    }
}
