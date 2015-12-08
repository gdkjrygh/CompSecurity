// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import android.util.Pair;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            ShareInternalUtility

public class NativeDialogParameters
{

    public NativeDialogParameters()
    {
    }

    private static Bundle create(ShareLinkContent sharelinkcontent, boolean flag)
    {
        Bundle bundle = createBaseParameters(sharelinkcontent, flag);
        Utility.putNonEmptyString(bundle, "TITLE", sharelinkcontent.getContentTitle());
        Utility.putNonEmptyString(bundle, "DESCRIPTION", sharelinkcontent.getContentDescription());
        Utility.putUri(bundle, "IMAGE", sharelinkcontent.getImageUrl());
        return bundle;
    }

    private static Bundle create(ShareOpenGraphContent shareopengraphcontent, JSONObject jsonobject, boolean flag)
    {
        Bundle bundle = createBaseParameters(shareopengraphcontent, flag);
        Utility.putNonEmptyString(bundle, "PREVIEW_PROPERTY_NAME", (String)ShareInternalUtility.getFieldNameAndNamespaceFromFullName(shareopengraphcontent.getPreviewPropertyName()).second);
        Utility.putNonEmptyString(bundle, "ACTION_TYPE", shareopengraphcontent.getAction().getActionType());
        Utility.putNonEmptyString(bundle, "ACTION", jsonobject.toString());
        return bundle;
    }

    private static Bundle create(SharePhotoContent sharephotocontent, List list, boolean flag)
    {
        sharephotocontent = createBaseParameters(sharephotocontent, flag);
        sharephotocontent.putStringArrayList("PHOTOS", new ArrayList(list));
        return sharephotocontent;
    }

    private static Bundle create(ShareVideoContent sharevideocontent, String s, boolean flag)
    {
        Bundle bundle = createBaseParameters(sharevideocontent, flag);
        Utility.putNonEmptyString(bundle, "TITLE", sharevideocontent.getContentTitle());
        Utility.putNonEmptyString(bundle, "DESCRIPTION", sharevideocontent.getContentDescription());
        Utility.putNonEmptyString(bundle, "VIDEO", s);
        return bundle;
    }

    public static Bundle create(UUID uuid, ShareContent sharecontent, boolean flag)
    {
        Validate.notNull(sharecontent, "shareContent");
        Validate.notNull(uuid, "callId");
        Bundle bundle = null;
        if (sharecontent instanceof ShareLinkContent)
        {
            bundle = create((ShareLinkContent)sharecontent, flag);
        } else
        {
            if (sharecontent instanceof SharePhotoContent)
            {
                sharecontent = (SharePhotoContent)sharecontent;
                return create(((SharePhotoContent) (sharecontent)), ShareInternalUtility.getPhotoUrls(sharecontent, uuid), flag);
            }
            if (sharecontent instanceof ShareVideoContent)
            {
                sharecontent = (ShareVideoContent)sharecontent;
                return create(((ShareVideoContent) (sharecontent)), ShareInternalUtility.getVideoUrl(sharecontent, uuid), flag);
            }
            if (sharecontent instanceof ShareOpenGraphContent)
            {
                sharecontent = (ShareOpenGraphContent)sharecontent;
                try
                {
                    uuid = create(((ShareOpenGraphContent) (sharecontent)), ShareInternalUtility.removeNamespacesFromOGJsonObject(ShareInternalUtility.toJSONObjectForCall(uuid, sharecontent), false), flag);
                }
                // Misplaced declaration of an exception variable
                catch (UUID uuid)
                {
                    throw new FacebookException((new StringBuilder()).append("Unable to create a JSON Object from the provided ShareOpenGraphContent: ").append(uuid.getMessage()).toString());
                }
                return uuid;
            }
        }
        return bundle;
    }

    private static Bundle createBaseParameters(ShareContent sharecontent, boolean flag)
    {
        Bundle bundle = new Bundle();
        Utility.putUri(bundle, "LINK", sharecontent.getContentUrl());
        Utility.putNonEmptyString(bundle, "PLACE", sharecontent.getPlaceId());
        Utility.putNonEmptyString(bundle, "REF", sharecontent.getRef());
        bundle.putBoolean("DATA_FAILURES_FATAL", flag);
        sharecontent = sharecontent.getPeopleIds();
        if (!Utility.isNullOrEmpty(sharecontent))
        {
            bundle.putStringArrayList("FRIENDS", new ArrayList(sharecontent));
        }
        return bundle;
    }
}
