// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import com.arist.activity.MyApplication;
import com.arist.b.b;
import com.arist.c.a;
import com.arist.c.f;
import com.arist.c.g;
import com.arist.model.lrc.DeskLrcView;
import com.arist.model.lrc.d;
import com.arist.model.lrc.e;

// Referenced classes of package com.arist.service:
//            a

public class DeskLrcService extends Service
    implements d
{

    private boolean a;
    private WindowManager b;
    private android.view.WindowManager.LayoutParams c;
    private f d;
    private int e;
    private int f;
    private DeskLrcView g;
    private com.arist.service.a h;

    public DeskLrcService()
    {
        a = false;
    }

    static void a(DeskLrcService desklrcservice, boolean flag)
    {
        desklrcservice.a(flag);
    }

    private void a(boolean flag)
    {
        Log.i("DeskLrcService", (new StringBuilder("showDeskLrc:")).append(flag).toString());
        if (flag && !a)
        {
            a = true;
            b.addView(g, c);
        } else
        if (!flag && a)
        {
            a = false;
            b.removeView(g);
            return;
        }
    }

    public final void a()
    {
        Toast.makeText(this, 0x7f0900eb, 0).show();
        a(false);
        d.e();
    }

    public final void a(int i)
    {
        int j = e + i;
        i = j;
        if (j < 0)
        {
            i = 0;
        }
        j = i;
        if (i > f)
        {
            j = f;
        }
        if (e != j)
        {
            e = j;
            c.y = j;
            b.updateViewLayout(g, c);
        }
    }

    public final void a(b b1)
    {
        com.arist.model.lrc.e.a(b1, g);
    }

    public final void b(int i)
    {
        g.a(i);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        h = new com.arist.service.a(this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction(a.j);
        intentfilter.addAction(a.r);
        intentfilter.addAction(a.C);
        registerReceiver(h, intentfilter);
        d = new f(getApplicationContext());
        f = ((WindowManager)getApplicationContext().getSystemService("window")).getDefaultDisplay().getHeight();
        g = new DeskLrcView(getApplicationContext());
        g.a(this);
        b = (WindowManager)getApplicationContext().getSystemService("window");
        c = new android.view.WindowManager.LayoutParams();
        c.type = 2007;
        c.format = 1;
        c.flags = 40;
        c.gravity = 49;
        c.width = -1;
        c.height = -2;
        e = d.e((f - g.a()) / 2);
        c.y = e;
        a(MyApplication.g());
    }

    public void onDestroy()
    {
        unregisterReceiver(h);
        a(false);
        d.d(e);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        boolean flag1 = false;
        if (intent != null && intent.getAction() != null) goto _L2; else goto _L1
_L1:
        return 2;
_L2:
        String s;
        s = intent.getAction();
        if (!"desk_lrc_action_activity_changed".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = intent.getIntExtra("desk_lrc_action_activity_changed_key", 0);
        Log.i("DeskLrcService", (new StringBuilder("change:")).append(i).toString());
        if (i != 1 && i != 2) goto _L1; else goto _L3
_L3:
        boolean flag = flag1;
        if (i == 2)
        {
            if (com.arist.c.g.a(getApplicationContext()))
            {
                flag = flag1;
            } else
            {
                flag = true;
            }
        }
        a(flag);
        Log.i("DeskLrcService", (new StringBuilder("showDeskLrc:")).append(flag).toString());
        return 2;
        if (!"desk_lrc_action_stop".equals(s)) goto _L1; else goto _L4
_L4:
        a(false);
        stopSelf();
        return 2;
    }
}
