// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.jz;
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

        private final MediaInfo Fm;

        public MediaInfo build()
            throws IllegalArgumentException
        {
            Fm.fv();
            return Fm;
        }

        public Builder setContentType(String s)
            throws IllegalArgumentException
        {
            Fm.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            Fm.setCustomData(jsonobject);
            return this;
        }

        public Builder setMediaTracks(List list)
        {
            Fm.c(list);
            return this;
        }

        public Builder setMetadata(MediaMetadata mediametadata)
        {
            Fm.a(mediametadata);
            return this;
        }

        public Builder setStreamDuration(long l)
            throws IllegalArgumentException
        {
            Fm.m(l);
            return this;
        }

        public Builder setStreamType(int i)
            throws IllegalArgumentException
        {
            Fm.setStreamType(i);
            return this;
        }

        public Builder setTextTrackStyle(TextTrackStyle texttrackstyle)
        {
            Fm.setTextTrackStyle(texttrackstyle);
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
                Fm = new MediaInfo(s);
                return;
            }
        }
    }


    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    private final String Fe;
    private int Ff;
    private String Fg;
    private MediaMetadata Fh;
    private long Fi;
    private List Fj;
    private TextTrackStyle Fk;
    private JSONObject Fl;

    MediaInfo(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else
        {
            Fe = s;
            Ff = -1;
            return;
        }
    }

    MediaInfo(JSONObject jsonobject)
        throws JSONException
    {
        int i = 0;
        super();
        Fe = jsonobject.getString("contentId");
        Object obj = jsonobject.getString("streamType");
        if ("NONE".equals(obj))
        {
            Ff = 0;
        } else
        if ("BUFFERED".equals(obj))
        {
            Ff = 1;
        } else
        if ("LIVE".equals(obj))
        {
            Ff = 2;
        } else
        {
            Ff = -1;
        }
        Fg = jsonobject.getString("contentType");
        if (jsonobject.has("metadata"))
        {
            obj = jsonobject.getJSONObject("metadata");
            Fh = new MediaMetadata(((JSONObject) (obj)).getInt("metadataType"));
            Fh.c(((JSONObject) (obj)));
        }
        Fi = ik.b(jsonobject.optDouble("duration", 0.0D));
        if (jsonobject.has("tracks"))
        {
            Fj = new ArrayList();
            for (obj = jsonobject.getJSONArray("tracks"); i < ((JSONArray) (obj)).length(); i++)
            {
                MediaTrack mediatrack = new MediaTrack(((JSONArray) (obj)).getJSONObject(i));
                Fj.add(mediatrack);
            }

        } else
        {
            Fj = null;
        }
        if (jsonobject.has("textTrackStyle"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("textTrackStyle");
            TextTrackStyle texttrackstyle = new TextTrackStyle();
            texttrackstyle.c(jsonobject1);
            Fk = texttrackstyle;
        } else
        {
            Fk = null;
        }
        Fl = jsonobject.optJSONObject("customData");
    }

    void a(MediaMetadata mediametadata)
    {
        Fh = mediametadata;
    }

    public JSONObject bK()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("contentId", Fe);
        Ff;
        JVM INSTR tableswitch 1 2: default 208
    //                   1 217
    //                   2 223;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_223;
_L8:
        Object obj;
        jsonobject.put("streamType", obj);
        if (Fg != null)
        {
            jsonobject.put("contentType", Fg);
        }
        if (Fh != null)
        {
            jsonobject.put("metadata", Fh.bK());
        }
        jsonobject.put("duration", ik.o(Fi));
        if (Fj == null) goto _L5; else goto _L4
_L4:
        obj = new JSONArray();
        for (Iterator iterator = Fj.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((MediaTrack)iterator.next()).bK())) { }
        jsonobject.put("tracks", obj);
_L5:
        if (Fk != null)
        {
            jsonobject.put("textTrackStyle", Fk.bK());
        }
        if (Fl == null) goto _L7; else goto _L6
_L6:
        jsonobject.put("customData", Fl);
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

    void c(List list)
    {
        Fj = list;
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
        if (Fl == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaInfo) (obj)).Fl == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (Fl == null || ((MediaInfo) (obj)).Fl == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!jz.d(Fl, ((MediaInfo) (obj)).Fl)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (ik.a(Fe, ((MediaInfo) (obj)).Fe) && Ff == ((MediaInfo) (obj)).Ff && ik.a(Fg, ((MediaInfo) (obj)).Fg) && ik.a(Fh, ((MediaInfo) (obj)).Fh) && Fi == ((MediaInfo) (obj)).Fi)
        {
            flag3 = flag4;
        } else
        {
            flag3 = false;
        }
        return flag3;
    }

    void fv()
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(Fe))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if (TextUtils.isEmpty(Fg))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if (Ff == -1)
        {
            throw new IllegalArgumentException("a valid stream type must be specified");
        } else
        {
            return;
        }
    }

    public String getContentId()
    {
        return Fe;
    }

    public String getContentType()
    {
        return Fg;
    }

    public JSONObject getCustomData()
    {
        return Fl;
    }

    public List getMediaTracks()
    {
        return Fj;
    }

    public MediaMetadata getMetadata()
    {
        return Fh;
    }

    public long getStreamDuration()
    {
        return Fi;
    }

    public int getStreamType()
    {
        return Ff;
    }

    public TextTrackStyle getTextTrackStyle()
    {
        return Fk;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Fe, Integer.valueOf(Ff), Fg, Fh, Long.valueOf(Fi), String.valueOf(Fl)
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
            Fi = l;
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
            Fg = s;
            return;
        }
    }

    void setCustomData(JSONObject jsonobject)
    {
        Fl = jsonobject;
    }

    void setStreamType(int i)
        throws IllegalArgumentException
    {
        if (i < -1 || i > 2)
        {
            throw new IllegalArgumentException("invalid stream type");
        } else
        {
            Ff = i;
            return;
        }
    }

    public void setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        Fk = texttrackstyle;
    }
}
