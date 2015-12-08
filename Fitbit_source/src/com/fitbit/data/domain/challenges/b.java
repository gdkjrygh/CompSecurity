// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import android.text.TextUtils;
import com.fitbit.data.domain.k;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.challenges:
//            ChallengeMessage

public class b
    implements k
{

    private final String a;

    public b(String s)
    {
        a = s;
    }

    public Object a(JSONObject jsonobject)
        throws JSONException
    {
        return b(jsonobject);
    }

    public ChallengeMessage b(JSONObject jsonobject)
        throws JSONException
    {
        ChallengeMessage challengemessage = new ChallengeMessage();
        if (jsonobject != null)
        {
            challengemessage.initFromPublicApiJsonObject(jsonobject);
        }
        if (!TextUtils.isEmpty(a))
        {
            challengemessage.a(a);
        }
        return challengemessage;
    }
}
