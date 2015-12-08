// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            UserVerifiedIdentity

public final class UserVerifiedIdentity__JsonHelper
{

    public static UserVerifiedIdentity a(JsonParser jsonparser)
    {
        UserVerifiedIdentity userverifiedidentity = new UserVerifiedIdentity();
        if (jsonparser.c() == JsonToken.b) goto _L2; else goto _L1
_L1:
        Object obj;
        jsonparser.b();
        obj = null;
_L4:
        return ((UserVerifiedIdentity) (obj));
_L2:
        do
        {
            obj = userverifiedidentity;
            if (jsonparser.a() == JsonToken.c)
            {
                continue;
            }
            obj = jsonparser.d();
            jsonparser.a();
            if ("verified".equals(obj))
            {
                userverifiedidentity.a = Boolean.valueOf(jsonparser.l());
            }
            jsonparser.b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
