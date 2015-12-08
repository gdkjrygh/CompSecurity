// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import com.aviary.android.feather.cds.h;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.l;
import com.aviary.android.feather.headless.moa.MoaHD;
import com.aviary.android.feather.headless.moa.c;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.utils.CameraUtils;
import com.aviary.android.feather.library.c.e;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BaseContextService, IAviaryController

public final class HiResBackgroundService extends BaseContextService
{
    private final class a extends Handler
    {

        final HiResBackgroundService a;
        private AtomicInteger b;
        private AtomicInteger c;
        private AtomicBoolean d;

        private void a(int i1)
        {
            com.aviary.android.feather.library.services.HiResBackgroundService.a(a).b((new StringBuilder()).append("InternalHandler::handleResize: ").append(i1).toString());
            if (d.get())
            {
                if (com.aviary.android.feather.library.services.HiResBackgroundService.d(a) != null && com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a() && i1 > 0)
                {
                    com.aviary.android.feather.library.services.HiResBackgroundService.a(a).a((new StringBuilder()).append("need to resize to ").append(i1).toString());
                    d d1 = com.aviary.android.feather.headless.moa.c.a(new String[] {
                        "resize"
                    });
                    com.aviary.android.feather.headless.moa.b b1 = d1.a(0);
                    b1.a("size", i1);
                    b1.a("sizeInMegaPixels", true);
                    a(d1);
                }
                return;
            } else
            {
                com.aviary.android.feather.library.services.HiResBackgroundService.a(a).c("hires is not enabled, skipping resize");
                return;
            }
        }

        private void a(Uri uri, int i1, int j1)
            throws com.aviary.android.feather.headless.a
        {
            com.aviary.android.feather.library.services.HiResBackgroundService.a(a).b((new StringBuilder()).append("InternalHandler::loadImage: ").append(uri).append(", maxSize: ").append(i1).append(", orientation: ").append(j1).toString());
            Object obj;
            boolean flag;
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d.set(flag);
            if (com.aviary.android.feather.library.services.HiResBackgroundService.d(a) == null)
            {
                com.aviary.android.feather.library.services.HiResBackgroundService.a(a, new MoaHD());
            }
            String s;
            if (com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a())
            {
                try
                {
                    com.aviary.android.feather.library.services.HiResBackgroundService.d(a).b();
                }
                catch (com.aviary.android.feather.headless.a a1) { }
            }
            obj = com.aviary.android.feather.library.services.HiResBackgroundService.e(a);
            if (obj != null) goto _L2; else goto _L1
_L1:
            com.aviary.android.feather.library.services.HiResBackgroundService.a(a).c("Context is gone");
_L4:
            return;
_L2:
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
            s = com.aviary.android.feather.common.utils.d.a(((Context) (obj)), uri);
            if (s == null)
            {
                break; /* Loop/switch isn't completed */
            }
            com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a(s);
_L5:
            if (com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a())
            {
                b(uri, i1, j1);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (com.aviary.android.feather.common.utils.l.b())
            {
                try
                {
                    obj = ((Context) (obj)).getContentResolver().openInputStream(uri);
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    throw com.aviary.android.feather.headless.a.a(1);
                }
                if (obj != null)
                {
                    try
                    {
                        com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a(((java.io.InputStream) (obj)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Uri uri)
                    {
                        throw uri;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Uri uri)
                    {
                        throw com.aviary.android.feather.headless.a.a(8);
                    }
                    com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj)));
                }
            } else
            {
                try
                {
                    obj = ((Context) (obj)).getContentResolver().openFileDescriptor(uri, "r");
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    throw com.aviary.android.feather.headless.a.a(1);
                }
                if (obj != null)
                {
                    try
                    {
                        com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a(((ParcelFileDescriptor) (obj)).getFileDescriptor());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Uri uri)
                    {
                        throw uri;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Uri uri)
                    {
                        throw com.aviary.android.feather.headless.a.a(8);
                    }
                    com.aviary.android.feather.common.utils.d.a(((ParcelFileDescriptor) (obj)));
                }
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        private void a(d d1)
        {
            com.aviary.android.feather.library.services.HiResBackgroundService.a(a).b("InternalHandler::handleActions");
            if (d.get())
            {
                if (com.aviary.android.feather.library.services.HiResBackgroundService.d(a) != null && com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a() && d1 != null)
                {
                    try
                    {
                        com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a(d1);
                        com.aviary.android.feather.library.services.HiResBackgroundService.a(a).a("actions applied..");
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (d d1)
                    {
                        com.aviary.android.feather.library.services.HiResBackgroundService.a(a).d(d1.getMessage());
                        d1.printStackTrace();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (d d1)
                    {
                        com.aviary.android.feather.library.services.HiResBackgroundService.a(a).d(d1.getMessage());
                    }
                    d1.printStackTrace();
                    return;
                } else
                {
                    com.aviary.android.feather.library.services.HiResBackgroundService.a(a).c("moa is not loaded..");
                    return;
                }
            } else
            {
                com.aviary.android.feather.library.services.HiResBackgroundService.a(a).c("hires is not enabled, skipping actions..");
                return;
            }
        }

        private void a(String s, int i1, int j1)
            throws com.aviary.android.feather.headless.a
        {
            com.aviary.android.feather.library.services.HiResBackgroundService.a(a).c("InternalHandler::saveImage: %s, format: %d, quality: %d ", new Object[] {
                s, Integer.valueOf(i1), Integer.valueOf(j1)
            });
            if (d.get())
            {
                if (!com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a())
                {
                    throw com.aviary.android.feather.headless.a.a(3);
                }
                android.graphics.Bitmap.CompressFormat compressformat1 = android.graphics.Bitmap.CompressFormat.JPEG;
                android.graphics.Bitmap.CompressFormat compressformat = compressformat1;
                if (i1 >= 0)
                {
                    compressformat = compressformat1;
                    if (i1 < android.graphics.Bitmap.CompressFormat.values().length)
                    {
                        compressformat = android.graphics.Bitmap.CompressFormat.values()[i1];
                    }
                }
                com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a(s, j1, compressformat);
                return;
            } else
            {
                com.aviary.android.feather.library.services.HiResBackgroundService.a(a).c("hires is not enabled, skipping save");
                return;
            }
        }

        private void b(int i1)
        {
            com.aviary.android.feather.library.services.HiResBackgroundService.a(a).b((new StringBuilder()).append("InternalHandler::handleRotate: ").append(i1).toString());
            if (d.get())
            {
                if (com.aviary.android.feather.library.services.HiResBackgroundService.d(a) != null && com.aviary.android.feather.library.services.HiResBackgroundService.d(a).a())
                {
                    d d1 = com.aviary.android.feather.headless.moa.c.a();
                    if (i1 != 0)
                    {
                        com.aviary.android.feather.headless.moa.b b1 = com.aviary.android.feather.headless.moa.c.a("rotate90");
                        b1.a("angle", i1);
                        d1.a(b1);
                    }
                    if (d1.size() > 0)
                    {
                        a(d1);
                    }
                }
                return;
            } else
            {
                com.aviary.android.feather.library.services.HiResBackgroundService.a(a).c("hires is not enabled, skipping rotate90");
                return;
            }
        }

        private void b(Uri uri, int i1, int j1)
        {
label0:
            {
                com.aviary.android.feather.library.services.HiResBackgroundService.a(a).c("InternalHandler::handleFile: %s, maxSize: %d, orientation: %d", new Object[] {
                    uri, Integer.valueOf(i1), Integer.valueOf(j1)
                });
                uri = com.aviary.android.feather.library.services.HiResBackgroundService.e(a);
                if (uri == null)
                {
                    com.aviary.android.feather.library.services.HiResBackgroundService.a(a).c("Context is gone");
                    return;
                }
                com.aviary.android.feather.library.services.HiResBackgroundService.a(a).a((new StringBuilder()).append("orientation: ").append(j1).toString());
                if (j1 != 0)
                {
                    com.aviary.android.feather.library.services.HiResBackgroundService.a(a).a("need to rotate the image");
                    a.a(j1);
                }
                j1 = i1;
                if (uri == null)
                {
                    break label0;
                }
                uri = com.aviary.android.feather.cds.h.d(uri);
                com.aviary.android.feather.library.services.HiResBackgroundService.a(a).b("permissions: %s", new Object[] {
                    uri
                });
                j1 = i1;
                if (uri.contains(com.aviary.android.feather.cds.a.c.a.name()))
                {
                    break label0;
                }
                if (i1 > 0)
                {
                    j1 = i1;
                    if (i1 <= CameraUtils.a().ordinal())
                    {
                        break label0;
                    }
                }
                com.aviary.android.feather.library.services.HiResBackgroundService.a(a).c("overriding maxSize due to permissions constrains");
                j1 = CameraUtils.a().ordinal();
            }
            com.aviary.android.feather.headless.utils.a a1 = com.aviary.android.feather.headless.utils.a.d;
            uri = a1;
            if (j1 >= 0)
            {
                uri = a1;
                if (j1 < com.aviary.android.feather.headless.utils.a.values().length)
                {
                    uri = com.aviary.android.feather.headless.utils.a.values()[j1];
                }
            }
            com.aviary.android.feather.library.services.HiResBackgroundService.a(a, uri.ordinal());
        }

        public void a()
        {
            c.set(0);
            b.set(0);
        }

        public int b()
        {
            return b.get();
        }

        public int c()
        {
            return c.get();
        }

        public int d()
        {
            return c.incrementAndGet();
        }

        public int e()
        {
            return b.incrementAndGet();
        }

        public boolean f()
        {
            return d.get();
        }

        public void handleMessage(Message message)
        {
            super.handleMessage(message);
            com.aviary.android.feather.library.services.HiResBackgroundService.a(a).b((new StringBuilder()).append("InternalHandler::handleMessage: ").append(message.what).toString());
            com.aviary.android.feather.library.services.HiResBackgroundService.a(a, e(), c());
            switch (message.what)
            {
            default:
                return;

            case 1000: 
                Uri uri = (Uri)message.obj;
                try
                {
                    a(uri, message.arg1, message.arg2);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    com.aviary.android.feather.library.services.HiResBackgroundService.a(a, message);
                }
                return;

            case 1001: 
                a((d)message.obj);
                return;

            case 1002: 
                HiResBackgroundService.b(a);
                return;

            case 1003: 
                try
                {
                    int i1 = message.arg1;
                    int j1 = message.arg2;
                    a((String)message.obj, i1, j1);
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    com.aviary.android.feather.library.services.HiResBackgroundService.a(a).e("handled save error: %s", new Object[] {
                        message
                    });
                    com.aviary.android.feather.library.services.HiResBackgroundService.a(a, message);
                    return;
                }
                com.aviary.android.feather.library.services.HiResBackgroundService.c(a);
                return;

            case 1004: 
                a(message.arg1);
                return;

            case 1005: 
                b(message.arg1);
                return;
            }
        }

        public a(Looper looper)
        {
            a = HiResBackgroundService.this;
            super(looper);
            b = new AtomicInteger(0);
            c = new AtomicInteger(0);
            d = new AtomicBoolean(true);
        }
    }

    public static interface b
    {

        public abstract void a(int i1, int j1);

        public abstract void a(com.aviary.android.feather.headless.a a1);

        public abstract void c();
    }


    private final com.aviary.android.feather.common.a.a.c d;
    private boolean e;
    private volatile Looper f;
    private a g;
    private MoaHD h;
    private b i;
    private final HandlerThread j = new HandlerThread("hires-looper", 10);

    public HiResBackgroundService(IAviaryController iaviarycontroller)
    {
        super(iaviarycontroller);
        d = com.aviary.android.feather.common.a.a.a("HiResBackgroundService", com.aviary.android.feather.common.a.a.d.a);
        j.start();
    }

    static com.aviary.android.feather.common.a.a.c a(HiResBackgroundService hiresbackgroundservice)
    {
        return hiresbackgroundservice.d;
    }

    static MoaHD a(HiResBackgroundService hiresbackgroundservice, MoaHD moahd)
    {
        hiresbackgroundservice.h = moahd;
        return moahd;
    }

    private void a(int i1, int j1)
    {
        d.b((new StringBuilder()).append("dispatchProgress: ").append(i1).append("/").append(j1).toString());
        if (i != null)
        {
            i.a(i1, j1);
        }
    }

    private void a(com.aviary.android.feather.headless.a a1)
    {
        d.c("dispatchError: %d", new Object[] {
            Integer.valueOf(a1.a())
        });
        a1.printStackTrace();
        if (i != null)
        {
            i.a(a1);
            return;
        } else
        {
            d.c("no listeners attached");
            return;
        }
    }

    static void a(HiResBackgroundService hiresbackgroundservice, int i1)
    {
        hiresbackgroundservice.b(i1);
    }

    static void a(HiResBackgroundService hiresbackgroundservice, int i1, int j1)
    {
        hiresbackgroundservice.a(i1, j1);
    }

    static void a(HiResBackgroundService hiresbackgroundservice, com.aviary.android.feather.headless.a a1)
    {
        hiresbackgroundservice.a(a1);
    }

    private void b(int i1)
    {
        d.b((new StringBuilder()).append("resize: ").append(i1).toString());
        if (h != null && i1 > 0)
        {
            int j1 = g.d();
            a(g.b(), j1);
            Message message = g.obtainMessage(1004, i1, -1);
            g.sendMessage(message);
        }
    }

    private void b(Uri uri, int i1, e e1)
    {
        d.b((new StringBuilder()).append("load, size: ").append(i1).toString());
        if (g != null)
        {
            h();
            g.a();
            i1 = Math.min(i1, com.aviary.android.feather.headless.utils.a.E.ordinal());
            int j1 = g.d();
            a(g.b(), j1);
            Message message = g.obtainMessage(1000);
            message.obj = uri;
            message.arg1 = i1;
            message.arg2 = e1.c();
            g.sendMessage(message);
        }
    }

    static void b(HiResBackgroundService hiresbackgroundservice)
    {
        hiresbackgroundservice.l();
    }

    static void c(HiResBackgroundService hiresbackgroundservice)
    {
        hiresbackgroundservice.k();
    }

    static MoaHD d(HiResBackgroundService hiresbackgroundservice)
    {
        return hiresbackgroundservice.h;
    }

    static Context e(HiResBackgroundService hiresbackgroundservice)
    {
        return hiresbackgroundservice.j();
    }

    private Context j()
    {
        IAviaryController iaviarycontroller = d();
        if (iaviarycontroller == null)
        {
            return null;
        } else
        {
            return iaviarycontroller.a();
        }
    }

    private void k()
    {
        if (i != null)
        {
            i.c();
        }
    }

    private void l()
    {
        d.b("quit");
        e = false;
        if (h != null)
        {
            if (h.a())
            {
                try
                {
                    h.b();
                }
                catch (com.aviary.android.feather.headless.a a1) { }
            }
            h.c();
        }
        h = null;
        f.quit();
    }

    public void a()
    {
        d.b("start");
        if (!e)
        {
            f = j.getLooper();
            g = new a(f);
            e = true;
        }
    }

    public void a(int i1)
    {
        d.b((new StringBuilder()).append("rotate90: ").append(i1).toString());
        if (h != null)
        {
            int j1 = g.d();
            a(g.b(), j1);
            Message message = g.obtainMessage(1005, i1, -1);
            g.sendMessage(message);
        }
    }

    public void a(Uri uri, int i1, e e1)
    {
        d.c("load: %s, maxSize: %d", new Object[] {
            uri, Integer.valueOf(i1)
        });
        b(uri, i1, e1);
    }

    public void a(d d1)
    {
        d.b("apply");
        if (g != null)
        {
            int i1 = g.d();
            a(g.b(), i1);
            Message message = g.obtainMessage(1001);
            message.obj = d1;
            g.sendMessage(message);
        }
    }

    public void a(b b1)
    {
        i = b1;
    }

    public void a(String s, android.graphics.Bitmap.CompressFormat compressformat, int i1)
    {
        d.b("save");
        if (g != null)
        {
            int j1 = g.d();
            a(g.b(), j1);
            Message message = g.obtainMessage(1003);
            message.obj = s;
            message.arg1 = compressformat.ordinal();
            message.arg2 = i1;
            g.sendMessage(message);
        }
    }

    public void b()
    {
        d.b("dispose");
        g();
    }

    public boolean c()
    {
        return e;
    }

    public void g()
    {
        d.b("stop");
        h();
        g.sendEmptyMessage(1002);
    }

    protected void h()
    {
        if (g != null)
        {
            g.removeMessages(1000);
            g.removeMessages(1001);
        }
    }

    public boolean i()
    {
        if (g != null)
        {
            return g.f();
        } else
        {
            return false;
        }
    }
}
