// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionsheet;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.ui.actionsheet:
//            ShareExtensionFragment

class this._cls0
    implements android.view.nsionFragment._cls2
{

    final ShareExtensionFragment this$0;

    public void onClick(View view)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Resources.string(0x7f07074d)));
        intent.addFlags(0x10000000);
        intent.setPackage("com.android.chrome");
        view = view.getContext();
        if (ShareExtensionFragment.access$000(ShareExtensionFragment.this) != null)
        {
            ShareExtensionFragment.access$000(ShareExtensionFragment.this).b();
        }
        try
        {
            view.startActivity(intent);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            intent.setPackage(null);
            view.startActivity(intent);
        }
        ShareExtensionFragment.access$200(ShareExtensionFragment.this);
    }

    ()
    {
        this$0 = ShareExtensionFragment.this;
        super();
    }
}
