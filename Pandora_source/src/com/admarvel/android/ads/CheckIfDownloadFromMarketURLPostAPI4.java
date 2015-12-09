// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.admarvel.android.util.Logging;
import java.net.URISyntaxException;

// Referenced classes of package com.admarvel.android.ads:
//            Utils, AdMarvelActivity

class CheckIfDownloadFromMarketURLPostAPI4
{

    CheckIfDownloadFromMarketURLPostAPI4()
    {
    }

    static boolean handleUrl(String s, Context context)
    {
        boolean flag1 = true;
        boolean flag;
        if (context == null || s == null)
        {
            flag = false;
        } else
        {
            Intent intent;
            try
            {
                intent = Intent.parseUri(s, 1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Logging.log((new StringBuilder("Bad URI ")).append(s).append(": ").append(context.getMessage()).toString());
                return false;
            }
            if (context.getPackageManager().resolveActivity(intent, 0) == null)
            {
                s = intent.getPackage();
                if (s != null)
                {
                    Logging.log((new StringBuilder(" going for market in shouldOverrideUrlLoading on internalwebview ")).append(s).toString());
                    s = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("market://search?q=pname:")).append(s).toString()));
                    s.addFlags(0x10000000);
                    s.addCategory("android.intent.category.BROWSABLE");
                    if (Utils.isIntentAvailable(context, s))
                    {
                        context.startActivity(s);
                    }
                    flag = flag1;
                    if (context != null)
                    {
                        flag = flag1;
                        if (context instanceof Activity)
                        {
                            s = (Activity)context;
                            flag = flag1;
                            if (s != null)
                            {
                                flag = flag1;
                                if (s instanceof AdMarvelActivity)
                                {
                                    s = (AdMarvelActivity)s;
                                    flag = flag1;
                                    if (s != null)
                                    {
                                        s.closeActivity();
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                } else
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return flag;
    }
}
