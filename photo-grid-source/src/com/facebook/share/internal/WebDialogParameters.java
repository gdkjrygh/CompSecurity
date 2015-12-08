// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            ShareInternalUtility

public class WebDialogParameters
{

    public WebDialogParameters()
    {
    }

    public static Bundle create(AppGroupCreationContent appgroupcreationcontent)
    {
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "name", appgroupcreationcontent.getName());
        Utility.putNonEmptyString(bundle, "description", appgroupcreationcontent.getDescription());
        Utility.putNonEmptyString(bundle, "privacy", appgroupcreationcontent.getAppGroupPrivacy().toString().toLowerCase(Locale.ENGLISH));
        return bundle;
    }

    public static Bundle create(GameRequestContent gamerequestcontent)
    {
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "message", gamerequestcontent.getMessage());
        Utility.putNonEmptyString(bundle, "to", gamerequestcontent.getTo());
        Utility.putNonEmptyString(bundle, "title", gamerequestcontent.getTitle());
        Utility.putNonEmptyString(bundle, "data", gamerequestcontent.getData());
        if (gamerequestcontent.getActionType() != null)
        {
            Utility.putNonEmptyString(bundle, "action_type", gamerequestcontent.getActionType().toString().toLowerCase(Locale.ENGLISH));
        }
        Utility.putNonEmptyString(bundle, "object_id", gamerequestcontent.getObjectId());
        if (gamerequestcontent.getFilters() != null)
        {
            Utility.putNonEmptyString(bundle, "filters", gamerequestcontent.getFilters().toString().toLowerCase(Locale.ENGLISH));
        }
        Utility.putCommaSeparatedStringList(bundle, "suggestions", gamerequestcontent.getSuggestions());
        return bundle;
    }

    public static Bundle create(ShareLinkContent sharelinkcontent)
    {
        Bundle bundle = new Bundle();
        Utility.putUri(bundle, "href", sharelinkcontent.getContentUrl());
        return bundle;
    }

    public static Bundle create(ShareOpenGraphContent shareopengraphcontent)
    {
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "action_type", shareopengraphcontent.getAction().getActionType());
        try
        {
            shareopengraphcontent = ShareInternalUtility.removeNamespacesFromOGJsonObject(ShareInternalUtility.toJSONObjectForWeb(shareopengraphcontent), false);
        }
        // Misplaced declaration of an exception variable
        catch (ShareOpenGraphContent shareopengraphcontent)
        {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", shareopengraphcontent);
        }
        if (shareopengraphcontent == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        Utility.putNonEmptyString(bundle, "action_properties", shareopengraphcontent.toString());
        return bundle;
    }

    public static Bundle createForFeed(ShareLinkContent sharelinkcontent)
    {
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "name", sharelinkcontent.getContentTitle());
        Utility.putNonEmptyString(bundle, "description", sharelinkcontent.getContentDescription());
        Utility.putNonEmptyString(bundle, "link", Utility.getUriString(sharelinkcontent.getContentUrl()));
        Utility.putNonEmptyString(bundle, "picture", Utility.getUriString(sharelinkcontent.getImageUrl()));
        return bundle;
    }
}
