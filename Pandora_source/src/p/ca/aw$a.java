// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.pandora.android.activity.PandoraIntent;

// Referenced classes of package p.ca:
//            aw, au

static class a extends BroadcastReceiver
{

    au a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context.equals(PandoraIntent.a("add_music_seed_success")) || context.equals(PandoraIntent.a("reload_backstage_page")))
        {
            a.F().clearCache(false);
            a.F().reload();
        }
    }

    public nt(au au1)
    {
        a = au1;
    }
}
