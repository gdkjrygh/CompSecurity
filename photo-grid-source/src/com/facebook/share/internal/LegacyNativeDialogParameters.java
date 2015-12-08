// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
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

public class LegacyNativeDialogParameters
{

    public LegacyNativeDialogParameters()
    {
    }

    private static Bundle create(ShareLinkContent sharelinkcontent, boolean flag)
    {
        Bundle bundle = createBaseParameters(sharelinkcontent, flag);
        Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.TITLE", sharelinkcontent.getContentTitle());
        Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.DESCRIPTION", sharelinkcontent.getContentDescription());
        Utility.putUri(bundle, "com.facebook.platform.extra.IMAGE", sharelinkcontent.getImageUrl());
        return bundle;
    }

    private static Bundle create(ShareOpenGraphContent shareopengraphcontent, JSONObject jsonobject, boolean flag)
    {
        Bundle bundle = createBaseParameters(shareopengraphcontent, flag);
        Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareopengraphcontent.getPreviewPropertyName());
        Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.ACTION_TYPE", shareopengraphcontent.getAction().getActionType());
        Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.ACTION", jsonobject.toString());
        return bundle;
    }

    private static Bundle create(SharePhotoContent sharephotocontent, List list, boolean flag)
    {
        sharephotocontent = createBaseParameters(sharephotocontent, flag);
        sharephotocontent.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(list));
        return sharephotocontent;
    }

    private static Bundle create(ShareVideoContent sharevideocontent, boolean flag)
    {
        return null;
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
                return create((ShareVideoContent)sharecontent, flag);
            }
            if (sharecontent instanceof ShareOpenGraphContent)
            {
                sharecontent = (ShareOpenGraphContent)sharecontent;
                ShareOpenGraphAction shareopengraphaction = sharecontent.getAction();
                try
                {
                    uuid = create(((ShareOpenGraphContent) (sharecontent)), ShareInternalUtility.toJSONObjectForCall(uuid, shareopengraphaction), flag);
                }
                // Misplaced declaration of an exception variable
                catch (UUID uuid)
                {
                    throw new FacebookException((new StringBuilder("Unable to create a JSON Object from the provided ShareOpenGraphContent: ")).append(uuid.getMessage()).toString());
                }
                return uuid;
            }
        }
        return bundle;
    }

    private static Bundle createBaseParameters(ShareContent sharecontent, boolean flag)
    {
        Bundle bundle = new Bundle();
        Utility.putUri(bundle, "com.facebook.platform.extra.LINK", sharecontent.getContentUrl());
        Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.PLACE", sharecontent.getPlaceId());
        Utility.putNonEmptyString(bundle, "com.facebook.platform.extra.REF", sharecontent.getRef());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", flag);
        sharecontent = sharecontent.getPeopleIds();
        if (!Utility.isNullOrEmpty(sharecontent))
        {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(sharecontent));
        }
        return bundle;
    }
}
