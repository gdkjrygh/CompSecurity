// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.apps.gsa.a.c.d;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.android.apps.gsa.shared.util.f;
import com.google.android.apps.gsa.speech.audio.AudioUtils;
import com.google.android.apps.gsa.speech.audio.i;
import com.google.android.apps.gsa.speech.c.a.b;
import com.google.common.base.s;
import com.google.common.util.concurrent.u;
import com.google.f.e.c;
import com.google.f.e.k;
import java.io.InputStream;
import java.util.UUID;

// Referenced classes of package com.google.android.apps.gsa.a.a:
//            b, c, d

public class a
    implements b
{

    public final com.google.android.apps.gsa.speech.b.a a;
    public final f b;
    public final int c;
    public final int d;
    public com.google.android.apps.gsa.speech.audio.d e;
    private final Context f;
    private final com.google.android.apps.gsa.a.a.d g;
    private final String h;
    private final String i;
    private final String j = b();
    private final s k = new com.google.android.apps.gsa.a.a.b(this);
    private final com.google.android.apps.gsa.speech.a.b l = new com.google.android.apps.gsa.speech.a.a();

    public a(Context context, com.google.android.apps.gsa.a.a.d d1, String s1, com.google.android.apps.gsa.speech.b.a a1, f f1, int i1)
    {
        f = context;
        g = d1;
        h = s1;
        i = f.getPackageName();
        a = a1;
        b = f1;
        c = i1;
        d = AudioUtils.a(i1);
    }

    private String b()
    {
        String s1;
        try
        {
            s1 = f.getPackageManager().getPackageInfo(i, 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            L.a(5, "AudioS3RequestProducerFactory", "Could not get application version for %s", new Object[] {
                i
            });
            return null;
        }
        return s1;
    }

    public com.google.android.apps.gsa.speech.audio.b a(int i1)
    {
        return new i(AudioUtils.a(i1));
    }

    public final com.google.android.apps.gsa.speech.c.a.c a()
    {
        u u1 = u.a();
        k k1 = (new k()).a("").b("Android").c(Build.DISPLAY).d(i).f(Build.MODEL);
        if (j != null)
        {
            k1.e(j);
        }
        WindowManager windowmanager = (WindowManager)f.getSystemService("window");
        Object obj;
        if (windowmanager == null)
        {
            obj = null;
        } else
        {
            obj = new DisplayMetrics();
            windowmanager.getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        }
        if (obj != null)
        {
            k1.e = ((DisplayMetrics) (obj)).widthPixels;
            k1.b = k1.b | 0x80;
            k1.f = ((DisplayMetrics) (obj)).heightPixels;
            k1.b = k1.b | 0x100;
            k1.g = ((DisplayMetrics) (obj)).densityDpi;
            k1.b = k1.b | 0x200;
        }
        u1.a(k1);
        obj = new c();
        obj.d = c;
        obj.c = ((c) (obj)).c | 1;
        obj.e = d;
        obj.c = ((c) (obj)).c | 2;
        return new com.google.android.apps.gsa.speech.c.a.c(new d[] {
            new com.google.android.apps.gsa.a.a.c(u1, ((c) (obj)), UUID.randomUUID().toString(), h, g), new com.google.android.apps.gsa.speech.c.a.a((InputStream)k.get(), c, l)
        });
    }
}
