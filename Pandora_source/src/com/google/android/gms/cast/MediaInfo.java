// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzhz;
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

        private final MediaInfo zzMp;

        public MediaInfo build()
            throws IllegalArgumentException
        {
            zzMp.zzjS();
            return zzMp;
        }

        public Builder setContentType(String s)
            throws IllegalArgumentException
        {
            zzMp.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            zzMp.setCustomData(jsonobject);
            return this;
        }

        public Builder setMediaTracks(List list)
        {
            zzMp.zzk(list);
            return this;
        }

        public Builder setMetadata(MediaMetadata mediametadata)
        {
            zzMp.zza(mediametadata);
            return this;
        }

        public Builder setStreamDuration(long l)
            throws IllegalArgumentException
        {
            zzMp.zzv(l);
            return this;
        }

        public Builder setStreamType(int i)
            throws IllegalArgumentException
        {
            zzMp.setStreamType(i);
            return this;
        }

        public Builder setTextTrackStyle(TextTrackStyle texttrackstyle)
        {
            zzMp.setTextTrackStyle(texttrackstyle);
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
                zzMp = new MediaInfo(s);
                return;
            }
        }
    }


    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    public static final long UNKNOWN_DURATION = -1L;
    private final String zzMh;
    private int zzMi;
    private String zzMj;
    private MediaMetadata zzMk;
    private long zzMl;
    private List zzMm;
    private TextTrackStyle zzMn;
    private JSONObject zzMo;

    MediaInfo(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else
        {
            zzMh = s;
            zzMi = -1;
            zzMl = -1L;
            return;
        }
    }

    MediaInfo(JSONObject jsonobject)
        throws JSONException
    {
        int i = 0;
        super();
        zzMh = jsonobject.getString("contentId");
        Object obj = jsonobject.getString("streamType");
        if ("NONE".equals(obj))
        {
            zzMi = 0;
        } else
        if ("BUFFERED".equals(obj))
        {
            zzMi = 1;
        } else
        if ("LIVE".equals(obj))
        {
            zzMi = 2;
        } else
        {
            zzMi = -1;
        }
        zzMj = jsonobject.getString("contentType");
        if (jsonobject.has("metadata"))
        {
            obj = jsonobject.getJSONObject("metadata");
            zzMk = new MediaMetadata(((JSONObject) (obj)).getInt("metadataType"));
            zzMk.zzf(((JSONObject) (obj)));
        }
        zzMl = -1L;
        if (jsonobject.has("duration") && !jsonobject.isNull("duration"))
        {
            double d = jsonobject.optDouble("duration", 0.0D);
            if (!Double.isNaN(d) && !Double.isInfinite(d))
            {
                zzMl = zzf.zzc(d);
            }
        }
        if (jsonobject.has("tracks"))
        {
            zzMm = new ArrayList();
            for (obj = jsonobject.getJSONArray("tracks"); i < ((JSONArray) (obj)).length(); i++)
            {
                MediaTrack mediatrack = new MediaTrack(((JSONArray) (obj)).getJSONObject(i));
                zzMm.add(mediatrack);
            }

        } else
        {
            zzMm = null;
        }
        if (jsonobject.has("textTrackStyle"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("textTrackStyle");
            TextTrackStyle texttrackstyle = new TextTrackStyle();
            texttrackstyle.zzf(jsonobject1);
            zzMn = texttrackstyle;
        } else
        {
            zzMn = null;
        }
        zzMo = jsonobject.optJSONObject("customData");
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
        if (zzMo == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaInfo) (obj)).zzMo == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (zzMo == null || ((MediaInfo) (obj)).zzMo == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!zzhz.zzd(zzMo, ((MediaInfo) (obj)).zzMo)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (zzf.zza(zzMh, ((MediaInfo) (obj)).zzMh) && zzMi == ((MediaInfo) (obj)).zzMi && zzf.zza(zzMj, ((MediaInfo) (obj)).zzMj) && zzf.zza(zzMk, ((MediaInfo) (obj)).zzMk) && zzMl == ((MediaInfo) (obj)).zzMl)
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
        return zzMh;
    }

    public String getContentType()
    {
        return zzMj;
    }

    public JSONObject getCustomData()
    {
        return zzMo;
    }

    public List getMediaTracks()
    {
        return zzMm;
    }

    public MediaMetadata getMetadata()
    {
        return zzMk;
    }

    public long getStreamDuration()
    {
        return zzMl;
    }

    public int getStreamType()
    {
        return zzMi;
    }

    public TextTrackStyle getTextTrackStyle()
    {
        return zzMn;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzMh, Integer.valueOf(zzMi), zzMj, zzMk, Long.valueOf(zzMl), String.valueOf(zzMo)
        });
    }

    void setContentType(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        } else
        {
            zzMj = s;
            return;
        }
    }

    void setCustomData(JSONObject jsonobject)
    {
        zzMo = jsonobject;
    }

    void setStreamType(int i)
        throws IllegalArgumentException
    {
        if (i < -1 || i > 2)
        {
            throw new IllegalArgumentException("invalid stream type");
        } else
        {
            zzMi = i;
            return;
        }
    }

    public void setTextTrackStyle(TextTrackStyle texttrackstyle)
    {
        zzMn = texttrackstyle;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("contentId", zzMh);
        zzMi;
        JVM INSTR tableswitch 1 2: default 232
    //                   1 241
    //                   2 247;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_247;
_L12:
        Object obj;
        jsonobject.put("streamType", obj);
        if (zzMj != null)
        {
            jsonobject.put("contentType", zzMj);
        }
        if (zzMk != null)
        {
            jsonobject.put("metadata", zzMk.toJson());
        }
        if (zzMl > -1L) goto _L5; else goto _L4
_L4:
        jsonobject.put("duration", JSONObject.NULL);
_L9:
        if (zzMm == null) goto _L7; else goto _L6
_L6:
        obj = new JSONArray();
        for (Iterator iterator = zzMm.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((MediaTrack)iterator.next()).toJson())) { }
          goto _L8
_L5:
        jsonobject.put("duration", zzf.zzy(zzMl));
          goto _L9
_L8:
        jsonobject.put("tracks", obj);
_L7:
        if (zzMn != null)
        {
            jsonobject.put("textTrackStyle", zzMn.toJson());
        }
        if (zzMo == null) goto _L11; else goto _L10
_L10:
        jsonobject.put("customData", zzMo);
        return jsonobject;
_L1:
        obj = "NONE";
          goto _L12
        obj;
_L11:
        return jsonobject;
_L2:
        obj = "BUFFERED";
          goto _L12
        obj = "LIVE";
          goto _L12
    }

    void zza(MediaMetadata mediametadata)
    {
        zzMk = mediametadata;
    }

    void zzjS()
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(zzMh))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if (TextUtils.isEmpty(zzMj))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if (zzMi == -1)
        {
            throw new IllegalArgumentException("a valid stream type must be specified");
        } else
        {
            return;
        }
    }

    void zzk(List list)
    {
        zzMm = list;
    }

    void zzv(long l)
        throws IllegalArgumentException
    {
        if (l < 0L && l != -1L)
        {
            throw new IllegalArgumentException("Invalid stream duration");
        } else
        {
            zzMl = l;
            return;
        }
    }
}
