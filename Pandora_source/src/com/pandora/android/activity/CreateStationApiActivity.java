// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import com.pandora.android.PandoraService;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity, p, PandoraIntent, HomeTabsActivity

public class CreateStationApiActivity extends BaseFragmentActivity
    implements ServiceConnection, p
{

    private String o;
    private Intent p;
    private boolean q;
    private String z;

    public CreateStationApiActivity()
    {
    }

    protected String Y()
    {
        return z;
    }

    protected void a(Context context, Intent intent, String s1)
    {
    }

    protected void a(Intent intent, String s1)
    {
        z = s1;
        S();
        b.a.a(this, intent);
        bindService(intent, this, 0);
        q = true;
    }

    protected IntentFilter l()
    {
        return null;
    }

    public void onCreate(Bundle bundle)
    {
        Object obj = getIntent();
        String s1 = ((Intent) (obj)).getAction();
        boolean flag;
        if ("android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(s1) && s.l())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u = flag;
        super.onCreate(bundle);
        p = new Intent(this, com/pandora/android/PandoraService);
        if ("android.intent.action.MEDIA_SEARCH".equals(s1))
        {
            o = ((Intent) (obj)).getStringExtra("query");
            if ("android.intent.action.MEDIA_SEARCH".equals(s1))
            {
                bundle = ((Intent) (obj)).getStringExtra("android.intent.extra.focus");
                s1 = ((Intent) (obj)).getStringExtra("android.intent.extra.artist");
                String s2 = ((Intent) (obj)).getStringExtra("android.intent.extra.album");
                obj = ((Intent) (obj)).getStringExtra("android.intent.extra.title");
                if (!s.a(bundle))
                {
                    if (bundle.startsWith("audio/") && !s.a(((String) (obj))))
                    {
                        o = ((String) (obj));
                    } else
                    if (bundle.equals("vnd.android.cursor.item/album"))
                    {
                        if (!s.a(s2))
                        {
                            o = s2;
                        }
                    } else
                    if (bundle.equals("vnd.android.cursor.item/artist") && !s.a(s1))
                    {
                        o = s1;
                    }
                }
            }
        } else
        if ("android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(s1))
        {
            o = ((Intent) (obj)).getStringExtra("query");
            if (u)
            {
                bundle = new PandoraIntent("cmd_music_search_to_create_station");
                bundle.putExtra("intent_search_seed", o);
                bundle.putExtra("intent_station_creation_source", p.cx.x.e.c.ordinal());
                b.a.a(bundle);
            }
        }
        if (!s.a(o))
        {
            p.setAction("cmd_music_search_to_create_station");
            p.putExtra("intent_search_seed", o);
            p.putExtra("intent_station_creation_source", p.cx.x.e.c.ordinal());
            a(p, String.format(getString(0x7f080289), new Object[] {
                o
            }));
            return;
        } else
        {
            s.a(this, getResources().getString(0x7f08016e), com/pandora/android/activity/HomeTabsActivity, 0x24000000, null);
            return;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (q)
        {
            unbindService(this);
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }
}
