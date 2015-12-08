// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            ShareInternalUtility

final class val.attachments
    implements otoJSONProcessor
{

    final ArrayList val$attachments;
    final UUID val$callId;

    public final JSONObject toJSONObject(SharePhoto sharephoto)
    {
        Object obj = ShareInternalUtility.access$300(val$callId, sharephoto);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((JSONObject) (obj));
_L2:
        val$attachments.add(obj);
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", ((com.facebook.internal.Store.Attachment) (obj)).getAttachmentUrl());
        }
        // Misplaced declaration of an exception variable
        catch (SharePhoto sharephoto)
        {
            throw new FacebookException("Unable to attach images", sharephoto);
        }
        obj = jsonobject;
        if (!sharephoto.getUserGenerated()) goto _L4; else goto _L3
_L3:
        jsonobject.put("user_generated", true);
        return jsonobject;
    }

    Attachment()
    {
        val$callId = uuid;
        val$attachments = arraylist;
        super();
    }
}
