// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.audio;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import p.cw.c;
import p.cy.b;
import p.dd.bh;

public class a
{

    private static volatile a a = null;

    private a()
    {
        if (p.cy.b.a() && android.os.Build.VERSION.SDK_INT < 18)
        {
            com.pandora.android.provider.b b1 = com.pandora.android.provider.b.a;
            b1.b().b(this);
            b1.e().c(this);
        }
    }

    public static void a()
    {
        if (a != null)
        {
            throw new UnsupportedOperationException("RemoteControlClientManager.init() can only be called once");
        } else
        {
            a = new a();
            return;
        }
    }

    private void a(aa aa1)
    {
        a(aa1.s(), aa1.u(), aa1.t());
    }

    private void a(aa aa1, boolean flag)
    {
        if (aa1.M())
        {
            a(com.pandora.android.provider.b.a.h().getString(0x7f08007d));
            return;
        } else
        {
            a(aa1);
            return;
        }
    }

    private void a(String s1)
    {
        a(s1, "", "");
    }

    private void a(String s1, String s2, String s3)
    {
        Application application = com.pandora.android.provider.b.a.h();
        Intent intent = new Intent("com.android.music.metachanged");
        intent.putExtra("track", s.d(s1));
        intent.putExtra("album", s.d(s2));
        intent.putExtra("artist", s.d(s3));
        intent.putExtra("id", 12345);
        application.sendBroadcast(intent);
    }

    public static void b()
    {
        a = null;
    }

    public void onTrackState(bh bh1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1.a[bh1.a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a(bh1.b, bh1.a());
            break;
        }
    }

}
