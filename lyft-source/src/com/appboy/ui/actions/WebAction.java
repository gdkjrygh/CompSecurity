// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.ui.AppboyWebViewActivity;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.appboy.ui.actions:
//            IAction

public final class WebAction
    implements IAction
{

    private static final List sSupportedSchemes = Collections.unmodifiableList(Arrays.asList(new String[] {
        "http", "https", "ftp", "ftps", "about", "javascript"
    }));
    private final Bundle mExtras;
    private final String mTargetUrl;

    public WebAction(String s)
    {
        this(s, null);
    }

    public WebAction(String s, Bundle bundle)
    {
        mTargetUrl = s;
        mExtras = bundle;
    }

    public static List getSupportedSchemes()
    {
        return sSupportedSchemes;
    }

    public void execute(Context context)
    {
        Intent intent = new Intent(context, com/appboy/ui/AppboyWebViewActivity);
        if (mExtras != null)
        {
            intent.putExtras(mExtras);
        }
        intent.putExtra("url", mTargetUrl);
        context.startActivity(intent);
    }

}
