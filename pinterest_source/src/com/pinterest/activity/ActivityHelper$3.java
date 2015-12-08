// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Social;
import com.pinterest.base.SocialUtils;
import com.pinterest.experiment.Experiments;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.invites.InviteCategory;
import com.pinterest.schemas.invites.InviteObject;
import java.util.List;

// Referenced classes of package com.pinterest.activity:
//            ActivityHelper

final class val.apiTag
    implements com.pinterest.activity.task.dialog.ogClickListener
{

    final String val$apiTag;
    final List val$apps;
    final Context val$context;
    final Bundle val$extras;
    final Intent val$intent;
    final PackageManager val$pm;
    final String val$toShare;

    public final void onClick(BaseDialog basedialog, int i)
    {
        Object obj = ((ResolveInfo)val$apps.get(i)).activityInfo;
        String s = ((ActivityInfo) (obj)).packageName;
        Object obj1 = ActivityHelper.getElementTypeByPackageName(s);
        if (obj1 == null)
        {
            Pinalytics.a(ElementType.SHARE_SOCIAL_BUTTON, ComponentType.MODAL_DIALOG, s);
        } else
        {
            String s1 = val$intent.getExtras().getString("com.pinterest.EXTRA_PIN_ID");
            Pinalytics.a(((ElementType) (obj1)), ComponentType.MODAL_DIALOG, s1);
        }
        obj = (String)val$pm.getApplicationLabel(((ActivityInfo) (obj)).applicationInfo);
        if (!Experiments.L())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj1 = val$intent;
        if (i != 0)
        {
            obj = (new StringBuilder()).append(val$toShare).append(SocialUtils.getMedium(((String) (obj)))).toString();
        } else
        {
            obj = val$toShare;
        }
        ((Intent) (obj1)).putExtra("android.intent.extra.TEXT", ((String) (obj)));
        val$intent.setPackage(s);
        val$context.startActivity(val$intent);
        if (Experiments.L())
        {
            UserApi.a(InviteCategory.MESSAGE, InviteObject.findByValue(val$extras.getInt("invite_object")), Social.getInviteChannelFromAppPackage(s), "send_share_more_apps_dialog", val$extras.getString("invite_code"), val$apiTag);
        }
        basedialog.dismiss();
    }

    ialog()
    {
        val$apps = list;
        val$intent = intent1;
        val$pm = packagemanager;
        val$toShare = s;
        val$context = context1;
        val$extras = bundle;
        val$apiTag = s1;
        super();
    }
}
