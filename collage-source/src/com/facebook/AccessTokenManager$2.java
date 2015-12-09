// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.util.Log;
import com.facebook.internal.Utility;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            AccessTokenManager, GraphResponse

class val.declinedPermissions
    implements 
{

    final AccessTokenManager this$0;
    final Set val$declinedPermissions;
    final Set val$permissions;
    final AtomicBoolean val$permissionsCallSucceeded;

    public void onCompleted(GraphResponse graphresponse)
    {
        graphresponse = graphresponse.getJSONObject();
        if (graphresponse != null)
        {
            if ((graphresponse = graphresponse.optJSONArray("data")) != null)
            {
                val$permissionsCallSucceeded.set(true);
                int i = 0;
                while (i < graphresponse.length()) 
                {
                    Object obj = graphresponse.optJSONObject(i);
                    if (obj != null)
                    {
                        String s = ((JSONObject) (obj)).optString("permission");
                        obj = ((JSONObject) (obj)).optString("status");
                        if (!Utility.isNullOrEmpty(s) && !Utility.isNullOrEmpty(((String) (obj))))
                        {
                            obj = ((String) (obj)).toLowerCase(Locale.US);
                            if (((String) (obj)).equals("granted"))
                            {
                                val$permissions.add(s);
                            } else
                            if (((String) (obj)).equals("declined"))
                            {
                                val$declinedPermissions.add(s);
                            } else
                            {
                                Log.w("AccessTokenManager", (new StringBuilder()).append("Unexpected status: ").append(((String) (obj))).toString());
                            }
                        }
                    }
                    i++;
                }
            }
        }
    }

    Boolean()
    {
        this$0 = final_accesstokenmanager;
        val$permissionsCallSucceeded = atomicboolean;
        val$permissions = set;
        val$declinedPermissions = Set.this;
        super();
    }
}
