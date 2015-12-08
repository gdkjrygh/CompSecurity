// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.net.Uri;
import com.facebook.share.model.SharePhoto;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            GraphRequest, FacebookException

static final class rePhoto
    implements com.facebook.share.internal.ility.PhotoJSONProcessor
{

    public JSONObject toJSONObject(SharePhoto sharephoto)
    {
        sharephoto = sharephoto.getImageUrl();
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", sharephoto.toString());
        }
        // Misplaced declaration of an exception variable
        catch (SharePhoto sharephoto)
        {
            throw new FacebookException("Unable to attach images", sharephoto);
        }
        return jsonobject;
    }

    rePhoto()
    {
    }
}
