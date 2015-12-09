// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.share.model.SharePhoto;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            OpenGraphJSONUtility

public static interface I
{

    public abstract JSONObject toJSONObject(SharePhoto sharephoto);
}
