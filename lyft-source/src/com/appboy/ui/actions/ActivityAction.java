// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.ui.support.UriUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.appboy.ui.actions:
//            IAction

public final class ActivityAction
    implements IAction
{

    private final Intent mIntent;

    public ActivityAction(Intent intent)
    {
        mIntent = intent;
    }

    public ActivityAction(String s, Uri uri)
    {
        this(s, uri, null);
    }

    public ActivityAction(String s, Uri uri, Bundle bundle)
    {
        this(new Intent());
        mIntent.setClassName(s, uri.getHost());
        if (bundle != null)
        {
            mIntent.putExtras(bundle);
        }
        for (s = UriUtils.getQueryParameters(uri).entrySet().iterator(); s.hasNext(); mIntent.putExtra((String)uri.getKey(), (String)uri.getValue()))
        {
            uri = (java.util.Map.Entry)s.next();
        }

    }

    public void execute(Context context)
    {
        if (mIntent.resolveActivity(context.getPackageManager()) != null)
        {
            context.startActivity(mIntent);
        }
    }
}
