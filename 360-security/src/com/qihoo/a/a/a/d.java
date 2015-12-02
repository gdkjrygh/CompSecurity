// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.a.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.qihoo360.mobilesafe.opti.i.IFunctionManager;
import com.qihoo360.mobilesafe.opti.i.plugins.ISharedPreferences;
import com.qihoo360.mobilesafe.opti.i.plugins.IUpdate;

class d
{

    private static final String a = com/qihoo/a/a/a/d.getSimpleName();
    private final Context b;
    private final IFunctionManager c;
    private SharedPreferences d;
    private final BroadcastReceiver e = new BroadcastReceiver() {

        final d a;

        public void onReceive(Context context1, Intent intent)
        {
            while (intent == null || !"android.intent.action.SCREEN_ON".equals(intent.getAction())) 
            {
                return;
            }
            d.a(a);
        }

            
            {
                a = d.this;
                super();
            }
    };

    public d(Context context, IFunctionManager ifunctionmanager)
    {
        b = context;
        c = ifunctionmanager;
        if (b() == null)
        {
            throw new RuntimeException("no foud IUpdate implement class , please add");
        } else
        {
            return;
        }
    }

    private SharedPreferences a(String s)
    {
        if (c != null)
        {
            Object obj = c.query(com/qihoo360/mobilesafe/opti/i/plugins/ISharedPreferences);
            if (obj != null && (obj instanceof ISharedPreferences))
            {
                obj = (ISharedPreferences)obj;
                if (s == null)
                {
                    return ((ISharedPreferences) (obj)).getDefaultSharedPreferences();
                } else
                {
                    return ((ISharedPreferences) (obj)).getSharedPreferences(s);
                }
            }
        }
        return null;
    }

    static void a(d d1)
    {
        d1.c();
    }

    static SharedPreferences b(d d1)
    {
        return d1.d;
    }

    private IUpdate b()
    {
        if (c != null)
        {
            Object obj = c.query(com/qihoo360/mobilesafe/opti/i/plugins/IUpdate);
            if (obj != null && (obj instanceof IUpdate))
            {
                return (IUpdate)obj;
            }
        }
        return null;
    }

    private void c()
    {
        d = a(((String) (null)));
        if (d == null)
        {
            Object obj = b;
            byte byte0;
            long l;
            long l1;
            if (android.os.Build.VERSION.SDK_INT >= 10)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            d = ((Context) (obj)).getSharedPreferences("shared_pref_clear_sdk", byte0);
        }
        l = d.getLong("clear_s_u_t", 0L);
        l1 = System.currentTimeMillis();
        if (l1 - l >= 0x1ee6280L || l1 < l)
        {
            obj = b();
            if (obj != null)
            {
                ((IUpdate) (obj)).doUpdate(new com.qihoo360.mobilesafe.opti.i.plugins.IUpdate.UpdateCallback() {

                    final d a;

                    public void onFinished(int i)
                    {
                        if (i == 1)
                        {
                            android.content.SharedPreferences.Editor editor = d.b(a).edit();
                            editor.putLong("clear_s_u_t", System.currentTimeMillis());
                            editor.commit();
                        }
                    }

            
            {
                a = d.this;
                super();
            }
                });
            }
        }
    }

    public void a()
    {
        c();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        b.registerReceiver(e, intentfilter);
    }

}
