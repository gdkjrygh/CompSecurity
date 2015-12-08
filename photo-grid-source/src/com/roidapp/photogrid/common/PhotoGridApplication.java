// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import a.a.a.a.f;
import a.a.a.a.p;
import android.app.Application;
import android.content.Context;
import com.b.a.b;
import com.cm.kinfoc.a.g;
import com.facebook.FacebookSdk;
import com.roidapp.baselib.c.af;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.q;
import com.roidapp.baselib.c.r;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.sns.f.a;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.photogrid.b.h;
import com.roidapp.photogrid.b.j;
import com.roidapp.photogrid.cloud.s;
import com.roidapp.photogrid.filter.c;
import com.roidapp.photogrid.release.ih;
import com.roidapp.photogrid.video.bk;
import com.roidapp.videolib.e;
import java.lang.reflect.Method;

// Referenced classes of package com.roidapp.photogrid.common:
//            ag

public class PhotoGridApplication extends Application
    implements af, r
{

    private Object a;

    public PhotoGridApplication()
    {
    }

    public final void a(Object obj)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        a.getClass().getMethod("watch", new Class[] {
            java/lang/Object
        }).invoke(a, new Object[] {
            obj
        });
        return;
        obj;
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
    }

    public void onCreate()
    {
        super.onCreate();
        aj.a(this);
        q.a(this);
        FacebookSdk.sdkInitialize(getApplicationContext());
        try
        {
            ih.C();
        }
        catch (VerifyError verifyerror)
        {
            verifyerror.printStackTrace();
        }
        ImageLibrary.a().a(new c());
        al.g().a(new s());
        al.g().a(this);
        e.a().a(new bk());
        com.cm.kinfoc.a.e.a(new com.roidapp.photogrid.b.e());
        g.a(new h());
        com.roidapp.cloudlib.sns.f.a.a().a(new j());
        f.a(this, new p[] {
            (new b()).a((new com.b.a.c.s()).a("release".startsWith("debug")).a()).a()
        });
        if (n.d())
        {
            com.cmcm.adsdk.a.a();
            com.roidapp.photogrid.common.ag.a();
            com.cmcm.adsdk.a.a(this, "209", com.roidapp.photogrid.common.ag.a(this, "cn"));
            com.roidapp.cloudlib.ads.b.a();
        }
        com.roidapp.cloudlib.ads.q.a();
        com.roidapp.baselib.c.b.a(this);
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        com.bumptech.glide.h.b(this).a();
    }

    public void onTrimMemory(int i)
    {
        super.onTrimMemory(i);
        com.bumptech.glide.h.b(this).a(i);
    }
}
