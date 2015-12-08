// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import android.app.Activity;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonObject;
import io.branch.referral.Branch;

// Referenced classes of package com.pinterest.analytics:
//            BranchMetaData

public class PinterestDeepLinkMetaData
{

    public PinterestDeepLinkMetaData()
    {
    }

    public static PinterestJsonObject a()
    {
        return BranchMetaData.a();
    }

    public static PinterestJsonObject a(Activity activity)
    {
        return BranchMetaData.a(activity);
    }

    public static PinterestJsonObject b()
    {
        return BranchMetaData.b();
    }

    public static void b(Activity activity)
    {
        BranchMetaData.a(Branch.a(), activity, null);
    }

    public static String c()
    {
        return Preferences.persisted().getString("PREF_BRANCH_DATA", null);
    }
}
