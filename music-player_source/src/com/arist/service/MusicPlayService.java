// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.IBinder;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.arist.activity.EqualizerActivity;
import com.arist.activity.MyApplication;
import com.arist.b.b;
import com.arist.b.c;
import com.arist.c.a;
import com.arist.c.e;
import com.arist.model.equize.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Timer;

// Referenced classes of package com.arist.service:
//            e, i, g, p, 
//            h, l, b, f, 
//            k, j, m, DeskLrcService, 
//            o

public class MusicPlayService extends Service
{

    public static ArrayList a = new ArrayList();
    public static boolean b = false;
    com.arist.service.b c;
    private k d;
    private int e;
    private SensorManager f;
    private boolean g;
    private int h;
    private Timer i;
    private b j;
    private boolean k;
    private Handler l;
    private AudioManager m;
    private Random n;
    private com.arist.model.b.c o;
    private p p;
    private o q;
    private ArrayList r;
    private int s;
    private SensorEventListener t;
    private boolean u;

    public MusicPlayService()
    {
        g = false;
        k = false;
        r = new ArrayList();
        t = new com.arist.service.e(this);
        u = false;
    }

    private void a(int i1)
    {
        l.post(new i(this, i1));
    }

    static void a(MusicPlayService musicplayservice)
    {
        Log.i("MusicPlayService", "\u4E0B\u4E00\u9996");
        if (a.size() <= 0)
        {
            musicplayservice.a(0x7f0900c6);
            return;
        }
        musicplayservice.k = true;
        musicplayservice.e = MyApplication.h;
        MyApplication.i;
        JVM INSTR tableswitch 4 4: default 56
    //                   4 99;
           goto _L1 _L2
_L1:
        int i1 = musicplayservice.e + 1;
        musicplayservice.e = i1;
        if (i1 > a.size() - 1)
        {
            i1 = 0;
        } else
        {
            i1 = musicplayservice.e;
        }
_L4:
        musicplayservice.e = i1;
        MyApplication.h = musicplayservice.e;
        musicplayservice.a();
        return;
_L2:
        i1 = musicplayservice.b();
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(MusicPlayService musicplayservice, int i1)
    {
        musicplayservice.h = i1;
    }

    static void a(MusicPlayService musicplayservice, long l1)
    {
        Log.i("MusicPlayService", "\u6536\u5230\u6709\u6548\u7761\u7720\u5E7F\u64AD");
        if (musicplayservice.i != null)
        {
            musicplayservice.i.cancel();
            musicplayservice.i = null;
        }
        if (l1 > 0L)
        {
            musicplayservice.i = new Timer();
            musicplayservice.i.schedule(new g(musicplayservice), 60L * l1 * 1000L);
        }
    }

    static void a(MusicPlayService musicplayservice, boolean flag)
    {
        musicplayservice.u = flag;
    }

    private int b()
    {
        int i1;
        int j1;
        i1 = 0;
        if (a.size() < 2)
        {
            return n.nextInt(a.size());
        }
        if (!r.isEmpty() && a.size() == s)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        j1 = 1;
        r.clear();
        s = a.size();
_L7:
        if (i1 < s) goto _L2; else goto _L1
_L1:
        int k1;
        k1 = n.nextInt(r.size());
        i1 = ((Integer)r.get(k1)).intValue();
        if (j1 == 0) goto _L4; else goto _L3
_L3:
        j1 = k1;
_L8:
        if (i1 == e) goto _L6; else goto _L5
_L5:
        r.remove(j1);
        return i1;
_L2:
        r.add(Integer.valueOf(i1));
        i1++;
          goto _L7
_L6:
        j1 = n.nextInt(r.size());
        i1 = ((Integer)r.get(j1)).intValue();
          goto _L8
_L4:
        j1 = k1;
          goto _L5
        j1 = 0;
          goto _L1
    }

    static void b(MusicPlayService musicplayservice)
    {
        Log.i("tag", "previous()");
        if (a.isEmpty())
        {
            MyApplication.f = 0;
            MyApplication.g = 0;
            MyApplication.h = 0;
            a.clear();
            a.addAll(MyApplication.f().f());
            if (!a.isEmpty())
            {
                musicplayservice.a();
                return;
            } else
            {
                musicplayservice.a(0x7f0900c6);
                return;
            }
        }
        musicplayservice.k = true;
        musicplayservice.e = MyApplication.h;
        MyApplication.i;
        JVM INSTR tableswitch 4 4: default 104
    //                   4 169;
           goto _L1 _L2
_L1:
        int i1 = musicplayservice.e - 1;
        musicplayservice.e = i1;
        if (i1 < 0)
        {
            i1 = a.size() - 1;
        } else
        {
            i1 = musicplayservice.e;
        }
_L4:
        musicplayservice.e = i1;
        Log.i("MusicPlayService", (new StringBuilder()).append(musicplayservice.e).toString());
        MyApplication.h = musicplayservice.e;
        musicplayservice.a();
        return;
_L2:
        i1 = musicplayservice.b();
        if (true) goto _L4; else goto _L3
_L3:
    }

    static o c(MusicPlayService musicplayservice)
    {
        return musicplayservice.q;
    }

    private void c()
    {
        if (MyApplication.a == null)
        {
            return;
        }
        try
        {
            MyApplication.j = 1;
            MyApplication.a.stop();
            j = new b();
        }
        catch (Exception exception) { }
        sendBroadcast(new Intent(a.l));
    }

    static AudioManager d(MusicPlayService musicplayservice)
    {
        return musicplayservice.m;
    }

    static void e(MusicPlayService musicplayservice)
    {
        musicplayservice.c();
    }

    static boolean f(MusicPlayService musicplayservice)
    {
        return musicplayservice.u;
    }

    static boolean g(MusicPlayService musicplayservice)
    {
        return musicplayservice.g;
    }

    static p h(MusicPlayService musicplayservice)
    {
        return musicplayservice.p;
    }

    static void i(MusicPlayService musicplayservice)
    {
        musicplayservice.k = true;
    }

    static void j(MusicPlayService musicplayservice)
    {
        Log.i("MusicPlayService", "\u81EA\u52A8\u4E0B\u4E00\u9996");
        a.clear();
        a.addAll(MyApplication.f().f());
        if (a.size() > 0) goto _L2; else goto _L1
_L1:
        musicplayservice.a(0x7f0900c6);
_L7:
        return;
_L2:
        musicplayservice.e = MyApplication.h;
        MyApplication.i;
        JVM INSTR tableswitch 1 4: default 84
    //                   1 107
    //                   2 84
    //                   3 149
    //                   4 96;
           goto _L3 _L4 _L3 _L5 _L6
_L3:
        MyApplication.h = musicplayservice.e;
        musicplayservice.a();
        return;
_L6:
        musicplayservice.e = musicplayservice.b();
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = musicplayservice.e + 1;
        musicplayservice.e = i1;
        if (i1 > a.size() - 1)
        {
            i1 = 0;
        } else
        {
            i1 = musicplayservice.e;
        }
        musicplayservice.e = i1;
        if (true) goto _L3; else goto _L5
_L5:
        int j1;
        j1 = musicplayservice.e + 1;
        musicplayservice.e = j1;
        if (j1 > a.size() - 1) goto _L7; else goto _L3
    }

    static int k(MusicPlayService musicplayservice)
    {
        return musicplayservice.h;
    }

    public final void a()
    {
        Log.i("MusicPlayService", "\u64AD\u653E/\u6682\u505C");
        Object obj;
        g = true;
        m.requestAudioFocus(null, 3, 1);
        obj = MyApplication.g();
        a.clear();
        a.addAll(MyApplication.f().f());
        if (!com.arist.c.c.a(((b) (obj)).e()))
        {
            a(0x7f0900cb);
            return;
        }
        if (a.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        if (!((b) (obj)).e().equals(j.e())) goto _L2; else goto _L1
_L1:
        if (k) goto _L4; else goto _L3
_L3:
        if (!MyApplication.d()) goto _L6; else goto _L5
_L5:
        k = false;
        if (MyApplication.a != null)
        {
            MyApplication.a.pause();
            MyApplication.j = 3;
        }
_L9:
        if (p == null) goto _L8; else goto _L7
_L7:
        p p1;
        p.a(((b) (obj)));
        p1 = p;
        boolean flag;
        if (2 == MyApplication.j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p1.a(flag);
_L8:
        sendBroadcast(new Intent(a.l));
        if (obj != null)
        {
            try
            {
                j = ((b) (obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
        l.postDelayed(new h(this), 100L);
        return;
_L6:
        k = false;
        MyApplication.a.start();
        MyApplication.j = 2;
          goto _L9
_L4:
        k = false;
        MyApplication.a.reset();
        MyApplication.a.setDataSource(((b) (obj)).e());
        MyApplication.a.prepare();
        MyApplication.a.start();
        MyApplication.j = 2;
        MyApplication.a();
        sendBroadcast(new Intent(a.j));
          goto _L9
_L2:
        k = false;
        MyApplication.a.reset();
        MyApplication.a.setDataSource(((b) (obj)).e());
        o.a(((b) (obj)).c(), System.currentTimeMillis());
        if (MyApplication.f != 0 || MyApplication.g != 1)
        {
            ((c)MyApplication.p.get(1)).e();
            ((c)MyApplication.p.get(1)).a(o.e());
        }
        MyApplication.a.prepare();
        MyApplication.a.start();
        MyApplication.j = 2;
        MyApplication.a();
        sendBroadcast(new Intent(a.j));
          goto _L9
        a(0x7f0900c6);
        c();
          goto _L9
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        Log.i("MusicPlayService", "onCreate()");
        long l1 = System.currentTimeMillis();
        o = new com.arist.model.b.c(getApplicationContext());
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            p = new p(getApplicationContext());
            p.a();
            p.c();
        }
        Object obj = getApplicationContext();
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            obj = new l(((android.content.Context) (obj)));
        } else
        {
            obj = new m(((android.content.Context) (obj)));
        }
        q = ((o) (obj));
        c = new com.arist.service.b();
        c.a(this);
        j = new b();
        j.d("last");
        l = new Handler();
        n = new Random();
        a.clear();
        a.addAll(MyApplication.f().f());
        if (MyApplication.a == null)
        {
            MyApplication.a = com.arist.c.e.a();
        }
        com.arist.model.equize.j.a().a(getApplicationContext(), MyApplication.a.getAudioSessionId());
        MyApplication.a.setOnCompletionListener(new f(this));
        d = new k(this);
        obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction(a.b);
        ((IntentFilter) (obj)).addAction(a.q);
        ((IntentFilter) (obj)).addAction(a.e);
        ((IntentFilter) (obj)).addAction(a.f);
        ((IntentFilter) (obj)).addAction(a.g);
        ((IntentFilter) (obj)).addAction(a.s);
        ((IntentFilter) (obj)).addAction(a.i);
        ((IntentFilter) (obj)).addAction(a.h);
        ((IntentFilter) (obj)).addAction(a.k);
        registerReceiver(d, ((IntentFilter) (obj)));
        m = (AudioManager)getSystemService("audio");
        obj = new com.arist.service.j(this, (byte)0);
        ((TelephonyManager)getSystemService("phone")).listen(((android.telephony.PhoneStateListener) (obj)), 32);
        f = (SensorManager)getSystemService("sensor");
        f.registerListener(t, f.getDefaultSensor(1), 3);
        Log.i("MusicPlayService", (new StringBuilder("onCreate() \u6267\u884C\u65F6\u95F4: ")).append(System.currentTimeMillis() - l1).toString());
    }

    public void onDestroy()
    {
        Log.i("MusicPlayService", "onDestory()");
        stopService(new Intent(MyApplication.q, com/arist/service/DeskLrcService));
        sendBroadcast(new Intent(a.l));
        b = false;
        stopForeground(true);
        q.b();
        Iterator iterator = MyApplication.d.b.iterator();
        do
        {
            Activity activity;
            do
            {
                if (!iterator.hasNext())
                {
                    com.arist.model.equize.j.a().c();
                    unregisterReceiver(d);
                    if (p != null)
                    {
                        p.b();
                        p.d();
                        p = null;
                    }
                    if (c != null)
                    {
                        c.a(this);
                        c = null;
                    }
                    if (f != null)
                    {
                        f.unregisterListener(t);
                        f = null;
                    }
                    if (MyApplication.a != null)
                    {
                        Log.i("MusicPlayService", "\u91CA\u653EMediaPlayer");
                        MyApplication.a.release();
                        MyApplication.a = null;
                    }
                    if (i != null)
                    {
                        i.cancel();
                        i = null;
                    }
                    super.onDestroy();
                    MyApplication.d.h();
                    return;
                }
                activity = (Activity)iterator.next();
            } while (activity == null || !(activity instanceof EqualizerActivity));
            activity.finish();
        } while (true);
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        StringBuilder stringbuilder = new StringBuilder("onStartCommand : ");
        boolean flag;
        if (intent == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.i("MusicPlayService", stringbuilder.append(flag).append("----").append(i1).append("-------").append(j1).toString());
        super.onStartCommand(intent, i1, j1);
        if (intent != null)
        {
            b = true;
        }
        return 2;
    }

}
