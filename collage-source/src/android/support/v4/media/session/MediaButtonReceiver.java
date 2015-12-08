// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat, MediaControllerCompat

public class MediaButtonReceiver extends BroadcastReceiver
{

    public MediaButtonReceiver()
    {
    }

    public static KeyEvent handleIntent(MediaSessionCompat mediasessioncompat, Intent intent)
    {
        if (mediasessioncompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT"))
        {
            return null;
        } else
        {
            intent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            mediasessioncompat.getController().dispatchMediaButtonEvent(intent);
            return intent;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj = new Intent("android.intent.action.MEDIA_BUTTON");
        ((Intent) (obj)).setPackage(context.getPackageName());
        obj = context.getPackageManager().queryIntentServices(((Intent) (obj)), 0);
        if (((List) (obj)).size() != 1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected 1 Service that handles android.intent.action.MEDIA_BUTTON, found ").append(((List) (obj)).size()).toString());
        } else
        {
            obj = (ResolveInfo)((List) (obj)).get(0);
            intent.setComponent(new ComponentName(((ResolveInfo) (obj)).serviceInfo.packageName, ((ResolveInfo) (obj)).serviceInfo.name));
            context.startService(intent);
            return;
        }
    }
}
