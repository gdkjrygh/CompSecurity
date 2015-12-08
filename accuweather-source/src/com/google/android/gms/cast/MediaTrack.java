// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.gj;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.io;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
{
    public static class Builder
    {

        private final MediaTrack AS;

        public MediaTrack build()
        {
            return AS;
        }

        public Builder setContentId(String s)
        {
            AS.setContentId(s);
            return this;
        }

        public Builder setContentType(String s)
        {
            AS.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            AS.setCustomData(jsonobject);
            return this;
        }

        public Builder setLanguage(String s)
        {
            AS.setLanguage(s);
            return this;
        }

        public Builder setLanguage(Locale locale)
        {
            AS.setLanguage(gj.b(locale));
            return this;
        }

        public Builder setName(String s)
        {
            AS.setName(s);
            return this;
        }

        public Builder setSubtype(int i)
            throws IllegalArgumentException
        {
            AS.R(i);
            return this;
        }

        public Builder(long l, int i)
            throws IllegalArgumentException
        {
            AS = new MediaTrack(l, i);
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
    private long AP;
    private int AQ;
    private int AR;
    private String Ao;
    private String Aq;
    private String As;
    private JSONObject Ax;
    private String mName;

    MediaTrack(long l, int i)
        throws IllegalArgumentException
    {
        clear();
        AP = l;
        if (i <= 0 || i > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid type ").append(i).toString());
        } else
        {
            AQ = i;
            return;
        }
    }

    MediaTrack(JSONObject jsonobject)
        throws JSONException
    {
        b(jsonobject);
    }

    private void b(JSONObject jsonobject)
        throws JSONException
    {
        clear();
        AP = jsonobject.getLong("trackId");
        String s = jsonobject.getString("type");
        if ("TEXT".equals(s))
        {
            AQ = 1;
        } else
        if ("AUDIO".equals(s))
        {
            AQ = 2;
        } else
        if ("VIDEO".equals(s))
        {
            AQ = 3;
        } else
        {
            throw new JSONException((new StringBuilder()).append("invalid type: ").append(s).toString());
        }
        Aq = jsonobject.optString("trackContentId", null);
        As = jsonobject.optString("trackContentType", null);
        mName = jsonobject.optString("name", null);
        Ao = jsonobject.optString("language", null);
        if (jsonobject.has("subtype"))
        {
            s = jsonobject.getString("subtype");
            if ("SUBTITLES".equals(s))
            {
                AR = 1;
            } else
            if ("CAPTIONS".equals(s))
            {
                AR = 2;
            } else
            if ("DESCRIPTIONS".equals(s))
            {
                AR = 3;
            } else
            if ("CHAPTERS".equals(s))
            {
                AR = 4;
            } else
            if ("METADATA".equals(s))
            {
                AR = 5;
            } else
            {
                throw new JSONException((new StringBuilder()).append("invalid subtype: ").append(s).toString());
            }
        } else
        {
            AR = 0;
        }
        Ax = jsonobject.optJSONObject("customData");
    }

    private void clear()
    {
        AP = 0L;
        AQ = 0;
        Aq = null;
        mName = null;
        Ao = null;
        AR = -1;
        Ax = null;
    }

    void R(int i)
        throws IllegalArgumentException
    {
        if (i <= -1 || i > 5)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid subtype ").append(i).toString());
        }
        if (i != 0 && AQ != 1)
        {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        } else
        {
            AR = i;
            return;
        }
    }

    public JSONObject dU()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("trackId", AP);
        AQ;
        JVM INSTR tableswitch 1 3: default 276
    //                   1 180
    //                   2 192
    //                   3 204;
           goto _L1 _L2 _L3 _L4
_L1:
        if (Aq != null)
        {
            jsonobject.put("trackContentId", Aq);
        }
        if (As != null)
        {
            jsonobject.put("trackContentType", As);
        }
        if (mName != null)
        {
            jsonobject.put("name", mName);
        }
        if (!TextUtils.isEmpty(Ao))
        {
            jsonobject.put("language", Ao);
        }
        AR;
        JVM INSTR tableswitch 1 5: default 279
    //                   1 216
    //                   2 228
    //                   3 240
    //                   4 252
    //                   5 264;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        if (Ax == null) goto _L12; else goto _L11
_L11:
        jsonobject.put("customData", Ax);
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
        if (Ax == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaTrack) (obj)).Ax == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (Ax == null || ((MediaTrack) (obj)).Ax == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!io.d(Ax, ((MediaTrack) (obj)).Ax)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (AP == ((MediaTrack) (obj)).AP && AQ == ((MediaTrack) (obj)).AQ && gj.a(Aq, ((MediaTrack) (obj)).Aq) && gj.a(As, ((MediaTrack) (obj)).As) && gj.a(mName, ((MediaTrack) (obj)).mName) && gj.a(Ao, ((MediaTrack) (obj)).Ao) && AR == ((MediaTrack) (obj)).AR)
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

    public long getId()
    {
        return AP;
    }

    public String getLanguage()
    {
        return Ao;
    }

    public String getName()
    {
        return mName;
    }

    public int getSubtype()
    {
        return AR;
    }

    public int getType()
    {
        return AQ;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Long.valueOf(AP), Integer.valueOf(AQ), Aq, As, mName, Ao, Integer.valueOf(AR), Ax
        });
    }

    public void setContentId(String s)
    {
        Aq = s;
    }

    public void setContentType(String s)
    {
        As = s;
    }

    void setCustomData(JSONObject jsonobject)
    {
        Ax = jsonobject;
    }

    void setLanguage(String s)
    {
        Ao = s;
    }

    void setName(String s)
    {
        mName = s;
    }
}
