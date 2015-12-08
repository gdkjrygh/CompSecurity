// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.eo;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.gp;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaMetadata

public final class MediaInfo
{
    public static class Builder
    {

        private final MediaInfo yo;

        public MediaInfo build()
            throws IllegalArgumentException
        {
            yo.dA();
            return yo;
        }

        public Builder setContentType(String s)
            throws IllegalArgumentException
        {
            yo.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            yo.b(jsonobject);
            return this;
        }

        public Builder setMetadata(MediaMetadata mediametadata)
        {
            yo.a(mediametadata);
            return this;
        }

        public Builder setStreamDuration(long l)
            throws IllegalArgumentException
        {
            yo.k(l);
            return this;
        }

        public Builder setStreamType(int i)
            throws IllegalArgumentException
        {
            yo.setStreamType(i);
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
                yo = new MediaInfo(s);
                return;
            }
        }
    }


    public static final int STREAM_TYPE_BUFFERED = 1;
    public static final int STREAM_TYPE_INVALID = -1;
    public static final int STREAM_TYPE_LIVE = 2;
    public static final int STREAM_TYPE_NONE = 0;
    private final String yi;
    private int yj;
    private String yk;
    private MediaMetadata yl;
    private long ym;
    private JSONObject yn;

    MediaInfo(String s)
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else
        {
            yi = s;
            yj = -1;
            return;
        }
    }

    MediaInfo(JSONObject jsonobject)
        throws JSONException
    {
        yi = jsonobject.getString("contentId");
        Object obj = jsonobject.getString("streamType");
        if ("NONE".equals(obj))
        {
            yj = 0;
        } else
        if ("BUFFERED".equals(obj))
        {
            yj = 1;
        } else
        if ("LIVE".equals(obj))
        {
            yj = 2;
        } else
        {
            yj = -1;
        }
        yk = jsonobject.getString("contentType");
        if (jsonobject.has("metadata"))
        {
            obj = jsonobject.getJSONObject("metadata");
            yl = new MediaMetadata(((JSONObject) (obj)).getInt("metadataType"));
            yl.c(((JSONObject) (obj)));
        }
        ym = eo.b(jsonobject.optDouble("duration", 0.0D));
        yn = jsonobject.optJSONObject("customData");
    }

    void a(MediaMetadata mediametadata)
    {
        yl = mediametadata;
    }

    void b(JSONObject jsonobject)
    {
        yn = jsonobject;
    }

    void dA()
        throws IllegalArgumentException
    {
        if (TextUtils.isEmpty(yi))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if (TextUtils.isEmpty(yk))
        {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if (yj == -1)
        {
            throw new IllegalArgumentException("a valid stream type must be specified");
        } else
        {
            return;
        }
    }

    public JSONObject dB()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("contentId", yi);
        yj;
        JVM INSTR tableswitch 1 2: default 134
    //                   1 142
    //                   2 125;
           goto _L1 _L2 _L3
_L2:
        break MISSING_BLOCK_LABEL_142;
_L6:
        Object obj;
        jsonobject.put("streamType", obj);
        if (yk != null)
        {
            jsonobject.put("contentType", yk);
        }
        if (yl != null)
        {
            jsonobject.put("metadata", yl.dB());
        }
        jsonobject.put("duration", eo.m(ym));
        if (yn == null) goto _L5; else goto _L4
_L4:
        jsonobject.put("customData", yn);
        return jsonobject;
_L3:
        obj = "LIVE";
          goto _L6
        obj;
        return jsonobject;
_L1:
        obj = "NONE";
          goto _L6
_L5:
        return jsonobject;
        obj = "BUFFERED";
          goto _L6
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
        if (yn == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaInfo) (obj)).yn == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (yn == null || ((MediaInfo) (obj)).yn == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!gp.d(yn, ((MediaInfo) (obj)).yn)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (eo.a(yi, ((MediaInfo) (obj)).yi) && yj == ((MediaInfo) (obj)).yj && eo.a(yk, ((MediaInfo) (obj)).yk) && eo.a(yl, ((MediaInfo) (obj)).yl) && ym == ((MediaInfo) (obj)).ym)
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
        return yi;
    }

    public String getContentType()
    {
        return yk;
    }

    public JSONObject getCustomData()
    {
        return yn;
    }

    public MediaMetadata getMetadata()
    {
        return yl;
    }

    public long getStreamDuration()
    {
        return ym;
    }

    public int getStreamType()
    {
        return yj;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            yi, Integer.valueOf(yj), yk, yl, Long.valueOf(ym), String.valueOf(yn)
        });
    }

    void k(long l)
        throws IllegalArgumentException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("Stream duration cannot be negative");
        } else
        {
            ym = l;
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
            yk = s;
            return;
        }
    }

    void setStreamType(int i)
        throws IllegalArgumentException
    {
        if (i < -1 || i > 2)
        {
            throw new IllegalArgumentException("invalid stream type");
        } else
        {
            yj = i;
            return;
        }
    }
}
