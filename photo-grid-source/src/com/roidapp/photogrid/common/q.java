// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.share.widget.AppInviteDialog;
import com.roidapp.baselib.e.l;

// Referenced classes of package com.roidapp.photogrid.common:
//            r, s, t, u, 
//            v

public final class q
{

    public static void a(Activity activity)
    {
        if (!FacebookSdk.isInitialized())
        {
            return;
        }
        if (l.b(activity))
        {
            if (AppInviteDialog.canShow())
            {
                AppInviteDialog.show(activity, (new com.facebook.share.model.AppInviteContent.Builder()).setApplinkUrl("https://fb.me/919120318127803").setPreviewImageUrl("https://fbcdn-sphotos-e-a.akamaihd.net/hphotos-ak-xpt1/v/t1.0-9/p370x247/17414_419123284915587_3522621611379441172_n.jpg?oh=93acf96f54e7480529dd3b61d9448b30&oe=55A44442&__gda__=1437965383_0d315ef202d976451bf20f79d56e7613").build());
                return;
            } else
            {
                Utility.loadAppSettingsAsync(activity, FacebookSdk.getApplicationId());
                r r1 = new r();
                s s1 = new s();
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
                builder.setOnKeyListener(r1);
                builder.setTitle(activity.getString(0x7f070112)).setMessage(activity.getString(0x7f070111)).setPositiveButton(activity.getString(0x7f07003b), s1).show();
                return;
            }
        } else
        {
            l.a(activity, new t(activity), new u(), new v());
            return;
        }
    }
}
