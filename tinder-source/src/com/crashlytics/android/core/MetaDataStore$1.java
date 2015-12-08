// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//            MetaDataStore, UserMetaData

static final class a extends JSONObject
{

    final UserMetaData a;

    (UserMetaData usermetadata)
        throws JSONException
    {
        a = usermetadata;
        super();
        put("userId", a.b);
        put("userName", a.c);
        put("userEmail", a.d);
    }
}
