// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import com.spotify.android.paste.app.FontSupport;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.music.spotlets.tracking.Tracking;

public abstract class fou extends u
    implements edc, fuc
{

    private dxc d;
    public ggl e;
    public dwh f;
    public boolean g;
    public edb h;
    private final BroadcastReceiver i = new BroadcastReceiver() {

        private fou a;

        public final void onReceive(Context context, Intent intent)
        {
            a.startService(dvv.a(a.getApplicationContext(), "com.spotify.mobile.android.service.action.client.FOREGROUND"));
        }

            
            {
                a = fou.this;
                super();
            }
    };
    private final BroadcastReceiver j = new BroadcastReceiver() {

        public final void onReceive(Context context, Intent intent)
        {
            CollectionService.a(context, intent);
        }

    };
    private boolean k;

    public fou()
    {
        dmz.a(dxd);
        d = dxd.a(this);
        dmz.a(edd);
        h = edd.a(this);
    }

    private static IntentFilter a(String s)
    {
        s = new IntentFilter(s);
        s.addCategory("android.intent.category.DEFAULT");
        return s;
    }

    public edb c()
    {
        return h;
    }

    public final boolean n()
    {
        return !g;
    }

    public void onCreate(Bundle bundle)
    {
        FontSupport.a(this);
        super.onCreate(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
        }
        f = new dwh(this);
        setVolumeControlStream(3);
        dmz.a(gjj);
        gjj.a(this);
    }

    public boolean onKeyDown(int l, KeyEvent keyevent)
    {
        return gci.a(f, keyevent, this) || super.onKeyDown(l, keyevent);
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (intent != null)
        {
            intent.setExtrasClassLoader(getClassLoader());
        }
    }

    public void onPause()
    {
        super.onPause();
        if (e != null)
        {
            e.b();
        }
        ((Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking)).c();
    }

    public void onResume()
    {
        super.onResume();
        if (e != null)
        {
            e.a();
        }
        startService(dvv.a(this, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
        g = false;
        ((Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking)).b();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        g = true;
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        super.onStart();
        f.a();
        d.a();
        h.a();
        Tracking tracking = (Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking);
        tracking.a(d);
        tracking.a(h);
        registerReceiver(i, a("android.intent.action.USER_PRESENT"));
        registerReceiver(j, a("com.spotify.mobile.android.spotlets.collection.cosmos.service.COLLECTION_ERROR"));
        k = true;
    }

    public void onStop()
    {
        f.b();
        g = true;
        d.b();
        Tracking tracking = (Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking);
        tracking.b(d);
        h.b();
        tracking.b(h);
        if (k)
        {
            unregisterReceiver(i);
            unregisterReceiver(j);
        }
        super.onStop();
    }
}
