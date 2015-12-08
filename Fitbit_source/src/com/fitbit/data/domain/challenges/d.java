// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import com.fitbit.data.domain.k;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            ChallengeType

public class d
    implements k
{

    public d()
    {
    }

    public Object a(JSONObject jsonobject)
        throws JSONException
    {
        return b(jsonobject);
    }

    public ChallengeType b(JSONObject jsonobject)
        throws JSONException
    {
        ChallengeType challengetype = new ChallengeType();
        challengetype.initFromPublicApiJsonObject(jsonobject);
        return challengetype;
    }
}
