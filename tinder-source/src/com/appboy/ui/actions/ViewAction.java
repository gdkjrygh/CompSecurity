// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package com.appboy.ui.actions:
//            IAction

public class ViewAction
    implements IAction
{

    private final Intent mIntent;

    public ViewAction(Uri uri)
    {
        this(uri, null);
    }

    public ViewAction(Uri uri, Bundle bundle)
    {
        mIntent = new Intent("android.intent.action.VIEW");
        mIntent.setData(uri);
        if (bundle != null)
        {
            mIntent.putExtras(bundle);
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
