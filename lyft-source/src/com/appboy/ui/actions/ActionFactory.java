// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.actions;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.ui.support.StringUtils;
import java.util.List;

// Referenced classes of package com.appboy.ui.actions:
//            WebAction, ActivityAction, ViewAction, IAction

public class ActionFactory
{

    public ActionFactory()
    {
    }

    public static IAction createUriAction(Context context, String s)
    {
        return createUriAction(context, s, null);
    }

    public static IAction createUriAction(Context context, String s, Bundle bundle)
    {
        if (!StringUtils.isNullOrBlank(s))
        {
            Uri uri = Uri.parse(s);
            if (WebAction.getSupportedSchemes().contains(uri.getScheme()))
            {
                return new WebAction(s, bundle);
            }
            if ("intent".equals(uri.getScheme()))
            {
                return new ActivityAction(context.getPackageName(), uri, bundle);
            } else
            {
                return new ViewAction(uri, bundle);
            }
        } else
        {
            return null;
        }
    }

    public static IAction createViewUriAction(String s, Bundle bundle)
    {
        if (!StringUtils.isNullOrBlank(s))
        {
            return new ViewAction(Uri.parse(s), bundle);
        } else
        {
            return null;
        }
    }
}
