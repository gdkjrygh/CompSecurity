// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aly
    implements ComponentCallbacks2
{

    private static volatile aly e;
    public final aqm a;
    final ama b;
    public final aqp c = new aqp();
    final List d = new ArrayList();
    private final arq f;
    private final amc g;
    private final aqh h;

    aly(apf apf1, arq arq1, aqm aqm1, aqh aqh1, Context context, int i, ayt ayt1)
    {
        a = aqm1;
        h = aqh1;
        f = arq1;
        new asc(arq1, aqm1, (ana)((aym) (ayt1)).p.a(avp.a));
        arq1 = context.getResources();
        avp avp1 = new avp(arq1.getDisplayMetrics(), aqm1, c);
        aqh1 = new awo(context, aqm1, aqh1);
        g = (new amc(context)).a(java/nio/ByteBuffer, new aso()).a(java/io/InputStream, new aub(c)).a(java/nio/ByteBuffer, android/graphics/Bitmap, new avh(avp1)).a(java/io/InputStream, android/graphics/Bitmap, new awa(avp1, c)).a(android/os/ParcelFileDescriptor, android/graphics/Bitmap, new awd(aqm1)).a(android/graphics/Bitmap, new avd()).a(java/nio/ByteBuffer, android/graphics/drawable/BitmapDrawable, new ava(arq1, aqm1, new avh(avp1))).a(java/io/InputStream, android/graphics/drawable/BitmapDrawable, new ava(arq1, aqm1, new awa(avp1, c))).a(android/os/ParcelFileDescriptor, android/graphics/drawable/BitmapDrawable, new ava(arq1, aqm1, new awd(aqm1))).a(android/graphics/drawable/BitmapDrawable, new avb(aqm1, new avd())).b(java/io/InputStream, awr, new axc(aqh1, c)).b(java/nio/ByteBuffer, awr, aqh1).a(awr, new awt()).a(amu, amu, new aug()).a(amu, android/graphics/Bitmap, new axb(aqm1)).a(new awi()).a(java/io/File, java/nio/ByteBuffer, new asr()).a(java/io/File, java/io/InputStream, new asy()).a(java/io/File, java/io/File, new awm()).a(java/io/File, android/os/ParcelFileDescriptor, new asu()).a(java/io/File, java/io/File, new aug()).a(new aoa(c)).a(Integer.TYPE, java/io/InputStream, new aua()).a(Integer.TYPE, android/os/ParcelFileDescriptor, new atz()).a(java/lang/Integer, java/io/InputStream, new aua()).a(java/lang/Integer, android/os/ParcelFileDescriptor, new atz()).a(java/lang/String, java/io/InputStream, new aue()).a(java/lang/String, android/os/ParcelFileDescriptor, new aud()).a(android/net/Uri, java/io/InputStream, new aur()).a(android/net/Uri, java/io/InputStream, new asg()).a(android/net/Uri, android/os/ParcelFileDescriptor, new asf()).a(android/net/Uri, java/io/InputStream, new aut()).a(android/net/Uri, java/io/InputStream, new auv()).a(android/net/Uri, java/io/InputStream, new aul()).a(android/net/Uri, android/os/ParcelFileDescriptor, new auj()).a(android/net/Uri, java/io/InputStream, new aun()).a(java/net/URL, java/io/InputStream, new aux()).a(android/net/Uri, java/io/File, new ath()).a(ata, java/io/InputStream, new aup()).a([B, java/nio/ByteBuffer, new asi()).a([B, java/io/InputStream, new asm()).a(android/graphics/Bitmap, android/graphics/drawable/BitmapDrawable, new axe(arq1, aqm1)).a(android/graphics/Bitmap, [B, new axd()).a(awr, [B, new axf());
        arq1 = new azd();
        b = new ama(context, g, arq1, ayt1, apf1, this, i);
    }

    public static amh a(am am1)
    {
        axw axw1 = axw.a();
        if (am1.O_() == null)
        {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (bag.d())
        {
            return axw1.a(am1.O_().getApplicationContext());
        } else
        {
            ay ay = am1.h();
            return axw1.a(am1.O_(), ay, am1);
        }
    }

    public static amh a(Activity activity)
    {
        return axw.a().a(activity);
    }

    public static amh a(ar ar1)
    {
        return axw.a().a(ar1);
    }

    public static File a(Context context)
    {
        context = context.getCacheDir();
        if (context == null) goto _L2; else goto _L1
_L1:
        context = new File(context, "image_manager_disk_cache");
        if (context.mkdirs() || context.exists() && context.isDirectory()) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return context;
_L2:
        if (Log.isLoggable("Glide", 6))
        {
            Log.e("Glide", "default disk cache dir is null");
            return null;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static aly b(Context context)
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        aly;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        context = context.getApplicationContext();
        obj = (new ayd(context)).a();
        obj1 = new alz(context);
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); ((ayc)iterator.next()).a(context, ((alz) (obj1)))) { }
        break MISSING_BLOCK_LABEL_82;
        context;
        aly;
        JVM INSTR monitorexit ;
        throw context;
        if (((alz) (obj1)).f == null)
        {
            obj1.f = new arw("source", Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (((alz) (obj1)).g == null)
        {
            obj1.g = new arw("disk-cache", 1);
        }
        if (((alz) (obj1)).i == null)
        {
            obj1.i = (new art(((alz) (obj1)).a)).a();
        }
        if (((alz) (obj1)).c == null)
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                break MISSING_BLOCK_LABEL_409;
            }
            obj1.c = new aqv(((alz) (obj1)).i.a);
        }
_L3:
        if (((alz) (obj1)).d == null)
        {
            obj1.d = new aqh(((alz) (obj1)).i.c);
        }
        if (((alz) (obj1)).e == null)
        {
            obj1.e = new arp(((alz) (obj1)).i.b);
        }
        if (((alz) (obj1)).h == null)
        {
            obj1.h = new arn(((alz) (obj1)).a);
        }
        if (((alz) (obj1)).b == null)
        {
            obj1.b = new apf(((alz) (obj1)).e, ((alz) (obj1)).h, ((alz) (obj1)).g, ((alz) (obj1)).f);
        }
        apf apf1 = ((alz) (obj1)).b;
        arq arq1 = ((alz) (obj1)).e;
        aqm aqm1 = ((alz) (obj1)).c;
        aqh aqh1 = ((alz) (obj1)).d;
        Context context1 = ((alz) (obj1)).a;
        int i = ((alz) (obj1)).j;
        obj1 = ((alz) (obj1)).k;
        obj1.s = true;
        e = new aly(apf1, arq1, aqm1, aqh1, context1, i, (ayt)obj1);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ayc)((Iterator) (obj)).next()).a(context, e.g)) { }
        break MISSING_BLOCK_LABEL_423;
        obj1.c = new aqn();
          goto _L3
        aly;
        JVM INSTR monitorexit ;
_L2:
        return e;
    }

    public static amh c(Context context)
    {
        return axw.a().a(context);
    }

    final void a(azh azh)
    {
label0:
        {
            synchronized (d)
            {
                Iterator iterator = d.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (!((amh)iterator.next()).b(azh));
            }
            return;
        }
        list;
        JVM INSTR monitorexit ;
        throw new IllegalStateException("Failed to remove target from managers");
        azh;
        list;
        JVM INSTR monitorexit ;
        throw azh;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public void onLowMemory()
    {
        a.a();
        f.a();
        h.a();
    }

    public void onTrimMemory(int i)
    {
        a.a(i);
        f.a(i);
        h.a(i);
    }
}
