// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.appprotocol.model:
//            AppProtocol

public class canShuffle
    implements JacksonModel
{

    public static final canShuffle EMPTY = new <init>("", "", null, null, "no_context", null, null, null, null, null, null);
    public final Boolean canRepeatContext;
    public final Boolean canRepeatTrack;
    public final Boolean canShuffle;
    public final String id;
    public final Boolean repeatContext;
    public final Boolean repeatTrack;
    public final Boolean shuffle;
    public final String subtitle;
    public final String title;
    public final String type;
    public final String uri;

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (canShuffle)obj;
        if (id == null ? ((id) (obj)).id != null : !id.equals(((id) (obj)).id))
        {
            return false;
        }
        if (uri == null ? ((uri) (obj)).uri != null : !uri.equals(((uri) (obj)).uri))
        {
            return false;
        }
        if (title == null ? ((title) (obj)).title != null : !title.equals(((title) (obj)).title))
        {
            return false;
        }
        if (subtitle == null ? ((subtitle) (obj)).subtitle != null : !subtitle.equals(((subtitle) (obj)).subtitle))
        {
            return false;
        }
        if (repeatTrack == null ? ((repeatTrack) (obj)).repeatTrack != null : !repeatTrack.equals(((repeatTrack) (obj)).repeatTrack))
        {
            return false;
        }
        if (repeatContext == null ? ((repeatContext) (obj)).repeatContext != null : !repeatContext.equals(((repeatContext) (obj)).repeatContext))
        {
            return false;
        }
        if (shuffle == null ? ((shuffle) (obj)).shuffle != null : !shuffle.equals(((shuffle) (obj)).shuffle))
        {
            return false;
        }
        if (canRepeatTrack == null ? ((canRepeatTrack) (obj)).canRepeatTrack != null : !canRepeatTrack.equals(((canRepeatTrack) (obj)).canRepeatTrack))
        {
            return false;
        }
        if (canRepeatContext == null ? ((canRepeatContext) (obj)).canRepeatContext != null : !canRepeatContext.equals(((canRepeatContext) (obj)).canRepeatContext))
        {
            return false;
        }
        if (canShuffle == null) goto _L4; else goto _L3
_L3:
        if (canShuffle.equals(((canShuffle) (obj)).canShuffle)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((canShuffle) (obj)).canShuffle == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (id != null)
        {
            i = id.hashCode();
        } else
        {
            i = 0;
        }
        if (uri != null)
        {
            j = uri.hashCode();
        } else
        {
            j = 0;
        }
        if (title != null)
        {
            k = title.hashCode();
        } else
        {
            k = 0;
        }
        if (subtitle != null)
        {
            l = subtitle.hashCode();
        } else
        {
            l = 0;
        }
        if (repeatTrack != null)
        {
            i1 = repeatTrack.hashCode();
        } else
        {
            i1 = 0;
        }
        if (repeatContext != null)
        {
            j1 = repeatContext.hashCode();
        } else
        {
            j1 = 0;
        }
        if (shuffle != null)
        {
            k1 = shuffle.hashCode();
        } else
        {
            k1 = 0;
        }
        if (canRepeatTrack != null)
        {
            l1 = canRepeatTrack.hashCode();
        } else
        {
            l1 = 0;
        }
        if (canRepeatContext != null)
        {
            i2 = canRepeatContext.hashCode();
        } else
        {
            i2 = 0;
        }
        if (canShuffle != null)
        {
            j2 = canShuffle.hashCode();
        }
        return (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j2;
    }

    public String toString()
    {
        String s;
        try
        {
            s = AppProtocol.a().writeValueAsString(this);
        }
        catch (JsonProcessingException jsonprocessingexception)
        {
            return (new StringBuilder("{")).append(getClass().getSimpleName()).append("}").toString();
        }
        return s;
    }


    public (String s, String s1, String s2, String s3, String s4, Boolean boolean1, Boolean boolean2, 
            Boolean boolean3, Boolean boolean4, Boolean boolean5, Boolean boolean6)
    {
        id = s;
        uri = s1;
        title = s2;
        subtitle = s3;
        type = s4;
        repeatTrack = boolean1;
        repeatContext = boolean2;
        shuffle = boolean3;
        canRepeatTrack = boolean4;
        canRepeatContext = boolean5;
        canShuffle = boolean6;
    }
}
