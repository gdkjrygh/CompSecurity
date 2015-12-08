// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka.dialog;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.media.a;
import android.support.v7.media.c;
import com.connectsdk.device.ConnectableDevice;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.pandora.android.data.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class f extends c
{
    public static final class a extends Enum
    {

        public static final a a;
        private static final a c[];
        private int b;

        public static a a(int i)
        {
            a aa[] = values();
            int k = aa.length;
            for (int j = 0; j < k; j++)
            {
                a a1 = aa[j];
                if (a1.b == i)
                {
                    return a1;
                }
            }

            return null;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/eureka/dialog/f$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("BEEP_SPEAKER", 0, 0);
            c = (new a[] {
                a
            });
        }

        private a(String s, int i, int j)
        {
            super(s, i);
            b = j;
        }
    }


    private static final IntentFilter a;
    private static f b;
    private HashMap c;

    protected f(Context context)
    {
        super(context);
        c = new HashMap();
    }

    public static f a(Context context)
    {
        if (b == null)
        {
            b = new f(context);
        }
        return b;
    }

    protected android.support.v7.media.a a(ConnectableDevice connectabledevice)
    {
        android.support.v7.media.a.a a1 = new android.support.v7.media.a.a(connectabledevice.getUUID(), connectabledevice.getFriendlyName());
        a1.c(connectabledevice.getModelName());
        a1.a(true);
        a1.a(a);
        Bundle bundle = new Bundle();
        bundle.putInt("deviceType", com.pandora.android.eureka.dialog.a.a.ordinal());
        bundle.putString("messageUrl", connectabledevice.getCastChatMessageUrl());
        bundle.putString("deviceUuid", connectabledevice.getUUID());
        a1.a(bundle);
        return a1.a();
    }

    public android.support.v7.media.c.d a(String s)
    {
        return new android.support.v7.media.c.d() {

            final f a;

            public void a()
            {
            }

            public void a(int i)
            {
            }

            public boolean a(Intent intent, android.support.v7.media.g.c c1)
            {
                if (intent.hasCategory("android.media.intent.category.REMOTE_PLAYBACK"))
                {
                    intent = intent.getAction();
                    break MISSING_BLOCK_LABEL_14;
                }
                do
                {
                    return false;
                } while (intent.equals("android.media.intent.action.PLAY") || !intent.equals("android.media.intent.action.PAUSE"));
                return false;
            }

            public void b()
            {
                p.df.a.c("PandoraMediaRouteProvider", "onSelect");
            }

            public void b(int i)
            {
            }

            public void c()
            {
                p.df.a.c("PandoraMediaRouteProvider", "onUnselect");
            }

            
            {
                a = f.this;
                super();
            }
        };
    }

    public ConnectableDevice b(String s)
    {
        return (ConnectableDevice)c.get(s);
    }

    public void b(ConnectableDevice connectabledevice)
    {
        c.put(connectabledevice.getUUID(), connectabledevice);
        f();
    }

    public void c(ConnectableDevice connectabledevice)
    {
        b(connectabledevice);
    }

    public void d(ConnectableDevice connectabledevice)
    {
        c.remove(connectabledevice.getUUID());
        f();
    }

    protected void f()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); arraylist.add(a((ConnectableDevice)((java.util.Map.Entry)iterator.next()).getValue()))) { }
        a((new android.support.v7.media.d.a()).a(arraylist).a());
    }

    static 
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addCategory(CastMediaControlIntent.categoryForCast(d.h));
        intentfilter.addAction("android.media.intent.action.START_SESSION");
        intentfilter.addAction("android.media.intent.action.END_SESSION");
        intentfilter.addAction("android.media.intent.action.GET_STATUS");
        intentfilter.addAction("android.media.intent.action.PLAY");
        intentfilter.addAction("android.media.intent.action.PAUSE");
        intentfilter.addAction("android.media.intent.action.RESUME");
        a = intentfilter;
    }
}
