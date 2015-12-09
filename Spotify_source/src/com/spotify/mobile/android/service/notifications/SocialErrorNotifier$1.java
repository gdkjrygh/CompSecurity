// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.notifications;

import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import com.spotify.mobile.android.ui.activity.FacebookWebPermissionsActivity;
import ctz;
import dd;

// Referenced classes of package com.spotify.mobile.android.service.notifications:
//            SocialErrorNotifier

final class a
    implements dd
{

    private SocialErrorNotifier a;

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        ctz.a(obj);
        if (((Cursor) (obj)).moveToFirst())
        {
            if (!TextUtils.isEmpty(((Cursor) (obj)).getString(0)))
            {
                Intent intent = new Intent(a.getApplicationContext(), com/spotify/mobile/android/ui/activity/FacebookWebPermissionsActivity);
                intent.putExtra("auth_url", ((Cursor) (obj)).getString(1));
                intent.putExtra("success_url", ((Cursor) (obj)).getString(2));
                SocialErrorNotifier.a(a, intent);
            }
            a.stopSelf();
        }
    }

    (SocialErrorNotifier socialerrornotifier)
    {
        a = socialerrornotifier;
        super();
    }
}
