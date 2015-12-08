// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import android.util.Pair;
import com.facebook.internal.M;
import com.facebook.internal.U;
import com.facebook.internal.Y;
import com.facebook.p;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            G

public final class y
{

    private static Bundle a(ShareContent sharecontent, boolean flag)
    {
        Bundle bundle = new Bundle();
        U.a(bundle, "LINK", sharecontent.h);
        U.a(bundle, "PLACE", sharecontent.j);
        U.a(bundle, "REF", sharecontent.k);
        bundle.putBoolean("DATA_FAILURES_FATAL", flag);
        sharecontent = sharecontent.i;
        if (!U.a(sharecontent))
        {
            bundle.putStringArrayList("FRIENDS", new ArrayList(sharecontent));
        }
        return bundle;
    }

    public static Bundle a(UUID uuid, ShareContent sharecontent, boolean flag)
    {
        Object obj = null;
        ShareVideoContent sharevideocontent = null;
        Y.a(sharecontent, "shareContent");
        Y.a(uuid, "callId");
        if (sharecontent instanceof ShareLinkContent)
        {
            uuid = (ShareLinkContent)sharecontent;
            obj = a(((ShareContent) (uuid)), flag);
            U.a(((Bundle) (obj)), "TITLE", ((ShareLinkContent) (uuid)).b);
            U.a(((Bundle) (obj)), "DESCRIPTION", ((ShareLinkContent) (uuid)).a);
            U.a(((Bundle) (obj)), "IMAGE", ((ShareLinkContent) (uuid)).c);
        } else
        {
            if (sharecontent instanceof SharePhotoContent)
            {
                sharecontent = (SharePhotoContent)sharecontent;
                uuid = G.a(sharecontent, uuid);
                sharecontent = a(sharecontent, flag);
                sharecontent.putStringArrayList("PHOTOS", new ArrayList(uuid));
                return sharecontent;
            }
            if (sharecontent instanceof ShareVideoContent)
            {
                sharevideocontent = (ShareVideoContent)sharecontent;
                sharecontent = ((ShareContent) (obj));
                if (sharevideocontent != null)
                {
                    if (sharevideocontent.d == null)
                    {
                        sharecontent = ((ShareContent) (obj));
                    } else
                    {
                        uuid = M.a(uuid, sharevideocontent.d.b);
                        sharecontent = new ArrayList(1);
                        sharecontent.add(uuid);
                        M.a(sharecontent);
                        sharecontent = ((com.facebook.internal.M.a) (uuid)).b;
                    }
                }
                uuid = a(((ShareContent) (sharevideocontent)), flag);
                U.a(uuid, "TITLE", sharevideocontent.b);
                U.a(uuid, "DESCRIPTION", sharevideocontent.a);
                U.a(uuid, "VIDEO", sharecontent);
                return uuid;
            }
            obj = sharevideocontent;
            if (sharecontent instanceof ShareOpenGraphContent)
            {
                sharecontent = (ShareOpenGraphContent)sharecontent;
                Bundle bundle;
                try
                {
                    uuid = G.a(G.a(uuid, sharecontent), false);
                    bundle = a(sharecontent, flag);
                    U.a(bundle, "PREVIEW_PROPERTY_NAME", (String)G.a(((ShareOpenGraphContent) (sharecontent)).b).second);
                    U.a(bundle, "ACTION_TYPE", ((ShareOpenGraphContent) (sharecontent)).a.a());
                    U.a(bundle, "ACTION", uuid.toString());
                }
                // Misplaced declaration of an exception variable
                catch (UUID uuid)
                {
                    throw new p((new StringBuilder("Unable to create a JSON Object from the provided ShareOpenGraphContent: ")).append(uuid.getMessage()).toString());
                }
                return bundle;
            }
        }
        return ((Bundle) (obj));
    }
}
