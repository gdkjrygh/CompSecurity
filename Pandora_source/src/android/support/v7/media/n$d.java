// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            n

static class f extends n
{
    final class a extends c.d
    {

        final n.d a;

        public void a(int i)
        {
            n.d.a(a).setStreamVolume(3, i, 0);
            n.d.b(a);
        }

        public void b(int i)
        {
            int j = n.d.a(a).getStreamVolume(3);
            if (Math.min(n.d.a(a).getStreamMaxVolume(3), Math.max(0, j + i)) != j)
            {
                n.d.a(a).setStreamVolume(3, j, 0);
            }
            n.d.b(a);
        }

        a()
        {
            a = n.d.this;
            super();
        }
    }

    final class b extends BroadcastReceiver
    {

        final n.d a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3)
            {
                int i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                if (i >= 0 && i != n.d.c(a))
                {
                    n.d.b(a);
                }
            }
        }

        b()
        {
            a = n.d.this;
            super();
        }
    }


    private static final ArrayList a;
    private final AudioManager b;
    private final b c = new b();
    private int d;

    static AudioManager a(b.a a1)
    {
        return a1.b;
    }

    static void b(b b1)
    {
        b1.f();
    }

    static int c(f f1)
    {
        return f1.d;
    }

    private void f()
    {
        Object obj = a().getResources();
        int i = b.getStreamMaxVolume(3);
        d = b.getStreamVolume(3);
        obj = (new <init>("DEFAULT_ROUTE", ((Resources) (obj)).getString(android.support.v7.mediarouter.ring.mr_system_route_name))).a(a).b(3).a(0).e(1).d(i).c(d).a();
        a((new <init>()).a(((android.support.v7.media.a) (obj))).a());
    }

    public a a(String s)
    {
        if (s.equals("DEFAULT_ROUTE"))
        {
            return new a();
        } else
        {
            return null;
        }
    }

    static 
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
        a = new ArrayList();
        a.add(intentfilter);
    }

    public iver(Context context)
    {
        super(context);
        d = -1;
        b = (AudioManager)context.getSystemService("audio");
        context.registerReceiver(c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        f();
    }
}
