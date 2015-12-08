// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzhz;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
{
    public static class Builder
    {

        private final MediaTrack zzMI;

        public MediaTrack build()
        {
            return zzMI;
        }

        public Builder setContentId(String s)
        {
            zzMI.setContentId(s);
            return this;
        }

        public Builder setContentType(String s)
        {
            zzMI.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            zzMI.setCustomData(jsonobject);
            return this;
        }

        public Builder setLanguage(String s)
        {
            zzMI.setLanguage(s);
            return this;
        }

        public Builder setLanguage(Locale locale)
        {
            zzMI.setLanguage(com.google.android.gms.cast.internal.zzf.zzb(locale));
            return this;
        }

        public Builder setName(String s)
        {
            zzMI.setName(s);
            return this;
        }

        public Builder setSubtype(int i)
            throws IllegalArgumentException
        {
            zzMI.zzaj(i);
            return this;
        }

        public Builder(long l, int i)
            throws IllegalArgumentException
        {
            zzMI = new MediaTrack(l, i);
        }
    }


    public static final int SUBTYPE_CAPTIONS = 2;
    public static final int SUBTYPE_CHAPTERS = 4;
    public static final int SUBTYPE_DESCRIPTIONS = 3;
    public static final int SUBTYPE_METADATA = 5;
    public static final int SUBTYPE_NONE = 0;
    public static final int SUBTYPE_SUBTITLES = 1;
    public static final int SUBTYPE_UNKNOWN = -1;
    public static final int TYPE_AUDIO = 2;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_VIDEO = 3;
    private String mName;
    private long zzKv;
    private int zzMG;
    private int zzMH;
    private String zzMf;
    private String zzMh;
    private String zzMj;
    private JSONObject zzMo;

    MediaTrack(long l, int i)
        throws IllegalArgumentException
    {
        clear();
        zzKv = l;
        if (i <= 0 || i > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid type ").append(i).toString());
        } else
        {
            zzMG = i;
            return;
        }
    }

    MediaTrack(JSONObject jsonobject)
        throws JSONException
    {
        zzf(jsonobject);
    }

    private void clear()
    {
        zzKv = 0L;
        zzMG = 0;
        zzMh = null;
        mName = null;
        zzMf = null;
        zzMH = -1;
        zzMo = null;
    }

    private void zzf(JSONObject jsonobject)
        throws JSONException
    {
        clear();
        zzKv = jsonobject.getLong("trackId");
        String s = jsonobject.getString("type");
        if ("TEXT".equals(s))
        {
            zzMG = 1;
        } else
        if ("AUDIO".equals(s))
        {
            zzMG = 2;
        } else
        if ("VIDEO".equals(s))
        {
            zzMG = 3;
        } else
        {
            throw new JSONException((new StringBuilder()).append("invalid type: ").append(s).toString());
        }
        zzMh = jsonobject.optString("trackContentId", null);
        zzMj = jsonobject.optString("trackContentType", null);
        mName = jsonobject.optString("name", null);
        zzMf = jsonobject.optString("language", null);
        if (jsonobject.has("subtype"))
        {
            s = jsonobject.getString("subtype");
            if ("SUBTITLES".equals(s))
            {
                zzMH = 1;
            } else
            if ("CAPTIONS".equals(s))
            {
                zzMH = 2;
            } else
            if ("DESCRIPTIONS".equals(s))
            {
                zzMH = 3;
            } else
            if ("CHAPTERS".equals(s))
            {
                zzMH = 4;
            } else
            if ("METADATA".equals(s))
            {
                zzMH = 5;
            } else
            {
                throw new JSONException((new StringBuilder()).append("invalid subtype: ").append(s).toString());
            }
        } else
        {
            zzMH = 0;
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
        if (!(obj instanceof MediaTrack)) goto _L4; else goto _L3
_L3:
        obj = (MediaTrack)obj;
        boolean flag;
        boolean flag1;
        if (zzMo == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaTrack) (obj)).zzMo == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (zzMo == null || ((MediaTrack) (obj)).zzMo == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!zzhz.zzd(zzMo, ((MediaTrack) (obj)).zzMo)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (zzKv == ((MediaTrack) (obj)).zzKv && zzMG == ((MediaTrack) (obj)).zzMG && com.google.android.gms.cast.internal.zzf.zza(zzMh, ((MediaTrack) (obj)).zzMh) && com.google.android.gms.cast.internal.zzf.zza(zzMj, ((MediaTrack) (obj)).zzMj) && com.google.android.gms.cast.internal.zzf.zza(mName, ((MediaTrack) (obj)).mName) && com.google.android.gms.cast.internal.zzf.zza(zzMf, ((MediaTrack) (obj)).zzMf) && zzMH == ((MediaTrack) (obj)).zzMH)
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

    public long getId()
    {
        return zzKv;
    }

    public String getLanguage()
    {
        return zzMf;
    }

    public String getName()
    {
        return mName;
    }

    public int getSubtype()
    {
        return zzMH;
    }

    public int getType()
    {
        return zzMG;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Long.valueOf(zzKv), Integer.valueOf(zzMG), zzMh, zzMj, mName, zzMf, Integer.valueOf(zzMH), zzMo
        });
    }

    public void setContentId(String s)
    {
        zzMh = s;
    }

    public void setContentType(String s)
    {
        zzMj = s;
    }

    void setCustomData(JSONObject jsonobject)
    {
        zzMo = jsonobject;
    }

    void setLanguage(String s)
    {
        zzMf = s;
    }

    void setName(String s)
    {
        mName = s;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("trackId", zzKv);
        zzMG;
        JVM INSTR tableswitch 1 3: default 276
    //                   1 180
    //                   2 192
    //                   3 204;
           goto _L1 _L2 _L3 _L4
_L1:
        if (zzMh != null)
        {
            jsonobject.put("trackContentId", zzMh);
        }
        if (zzMj != null)
        {
            jsonobject.put("trackContentType", zzMj);
        }
        if (mName != null)
        {
            jsonobject.put("name", mName);
        }
        if (!TextUtils.isEmpty(zzMf))
        {
            jsonobject.put("language", zzMf);
        }
        zzMH;
        JVM INSTR tableswitch 1 5: default 279
    //                   1 216
    //                   2 228
    //                   3 240
    //                   4 252
    //                   5 264;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        if (zzMo == null) goto _L12; else goto _L11
_L11:
        jsonobject.put("customData", zzMo);
        return jsonobject;
_L2:
        try
        {
            jsonobject.put("type", "TEXT");
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        jsonobject.put("type", "AUDIO");
        continue; /* Loop/switch isn't completed */
_L4:
        jsonobject.put("type", "VIDEO");
        continue; /* Loop/switch isn't completed */
_L6:
        jsonobject.put("subtype", "SUBTITLES");
          goto _L5
_L7:
        jsonobject.put("subtype", "CAPTIONS");
          goto _L5
_L8:
        jsonobject.put("subtype", "DESCRIPTIONS");
          goto _L5
_L9:
        jsonobject.put("subtype", "CHAPTERS");
          goto _L5
_L10:
        jsonobject.put("subtype", "METADATA");
          goto _L5
_L12:
        return jsonobject;
        if (true) goto _L1; else goto _L13
_L13:
    }

    void zzaj(int i)
        throws IllegalArgumentException
    {
        if (i <= -1 || i > 5)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid subtype ").append(i).toString());
        }
        if (i != 0 && zzMG != 1)
        {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        } else
        {
            zzMH = i;
            return;
        }
    }
}
