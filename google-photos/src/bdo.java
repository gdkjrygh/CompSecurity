// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.google.android.apps.consumerphotoeditor.core.EditProcessorInitializationResult;
import com.google.android.apps.consumerphotoeditor.core.Look;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class bdo
{

    public int A;
    private PipelineParams B;
    private guc C;
    public bdp a;
    public final Renderer b = new Renderer();
    public final Renderer c = new Renderer();
    public ReadWriteLock d;
    public volatile PipelineParams e;
    public bds f;
    public PipelineParams g;
    public PipelineParams h;
    public gap i;
    public boolean j;
    public volatile Bitmap k;
    public volatile Bitmap l;
    public float m;
    public int n;
    public int o;
    public RectF p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public Look x[];
    public HashMap y;
    public String z;

    public bdo()
    {
        a = bdp.a;
        d = new ReentrantReadWriteLock();
        e = new PipelineParams();
        B = new PipelineParams();
        i = null;
        m = 0.0F;
        n = -1;
        o = -1;
        p = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
        q = true;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        y = new HashMap();
        b.markProcessorInitialized(false);
    }

    public final EditProcessorInitializationResult a(Context context, Intent intent, Bitmap bitmap, int i1)
    {
        Bitmap bitmap1;
        j = ((gtp)olm.a(context, gtp)).a(i1);
        long l1 = intent.getLongExtra("com.google.android.apps.photos.photoeditor.contract.original_width", -1L);
        long l2 = intent.getLongExtra("com.google.android.apps.photos.photoeditor.contract.original_height", -1L);
        bitmap1 = bitmap;
        if (l1 > 0L)
        {
            bitmap1 = bitmap;
            if (l2 > 0L)
            {
                bitmap1 = bitmap;
                if (Math.max(l1, l2) < (long)Math.max(bitmap.getWidth(), bitmap.getHeight()))
                {
                    bitmap1 = Bitmap.createScaledBitmap(bitmap, (int)l1, (int)l2, false);
                    v = true;
                }
            }
        }
        bitmap = intent.getStringExtra("com.google.android.apps.photos.photoeditor.contract.external_action");
        if (bitmap != null)
        {
            C = guc.valueOf(bitmap);
        }
        if (a(guc.a))
        {
            i1 = intent.getIntExtra("com.google.android.apps.photos.photoeditor.contract.external_crop.aspect_x", -1);
            int j1 = intent.getIntExtra("com.google.android.apps.photos.photoeditor.contract.external_crop.aspect_y", -1);
            if (i1 > 0 && j1 > 0)
            {
                m = (float)i1 / (float)j1;
            }
            i1 = intent.getIntExtra("com.google.android.apps.photos.photoeditor.contract.external_crop.output_x", -1);
            j1 = intent.getIntExtra("com.google.android.apps.photos.photoeditor.contract.external_crop.output_y", -1);
            if (i1 > 0 && j1 > 0)
            {
                n = i1;
                o = j1;
            }
        }
        intent = intent.getByteArrayExtra("com.google.android.apps.photos.photoeditor.contract.edit_list");
        d.readLock().lock();
        if (!u)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        context = new EditProcessorInitializationResult();
        d.readLock().unlock();
        return context;
        intent = b.initialize(context, bitmap1, intent, j);
        b.markProcessorInitialized(true);
        bitmap = b.getPipelineParams();
        if (!((EditProcessorInitializationResult) (intent)).setEditListSuccess) goto _L2; else goto _L1
_L1:
        context = new PipelineParams(bitmap);
_L7:
        B = context;
        if (b.a(m, 0.0F)) goto _L4; else goto _L3
_L3:
        float f1;
        float f2;
        f1 = bitmap1.getWidth();
        f2 = bitmap1.getHeight();
        if (f1 <= m * f2) goto _L6; else goto _L5
_L5:
        bitmap.cropLeft = (f1 - f2 * m) / 2.0F / f1;
        bitmap.cropRight = 1.0F - ((PipelineParams) (bitmap)).cropLeft;
_L8:
        p.set(((PipelineParams) (bitmap)).cropLeft, ((PipelineParams) (bitmap)).cropTop, ((PipelineParams) (bitmap)).cropRight, ((PipelineParams) (bitmap)).cropBottom);
_L4:
        a(((PipelineParams) (bitmap)));
        r = true;
        k = bitmap1;
        d.readLock().unlock();
        return intent;
_L2:
        context = null;
          goto _L7
_L6:
        bitmap.cropTop = (f2 - f1 / m) / 2.0F / f2;
        bitmap.cropBottom = 1.0F - ((PipelineParams) (bitmap)).cropTop;
          goto _L8
        context;
        d.readLock().unlock();
        throw context;
          goto _L7
    }

    public final void a(bdp bdp1)
    {
        a = bdp1;
        d();
    }

    public final void a(PipelineParams pipelineparams)
    {
        e = pipelineparams;
        e();
    }

    public final boolean a()
    {
        boolean flag;
        d.readLock().lock();
        flag = u;
        if (flag)
        {
            d.readLock().unlock();
            return false;
        }
        flag = b.computeEditingData(true);
        d.readLock().unlock();
        return flag;
        Exception exception;
        exception;
        d.readLock().unlock();
        throw exception;
    }

    public final boolean a(Context context)
    {
        boolean flag;
        d.readLock().lock();
        flag = u;
        if (flag)
        {
            d.readLock().unlock();
            return false;
        }
        flag = s;
        if (!flag)
        {
            d.readLock().unlock();
            return false;
        }
        flag = c.initialize(context, l, b.getEditListBytes(), j).jniInitializationSuccess;
        if (!flag)
        {
            d.readLock().unlock();
            return false;
        }
        flag = c.computeEditingData(false);
        if (!flag)
        {
            d.readLock().unlock();
            return false;
        }
        t = true;
        if (l != null)
        {
            l.recycle();
            l = null;
        }
        d.readLock().unlock();
        return true;
        context;
        d.readLock().unlock();
        throw context;
    }

    public final boolean a(guc guc1)
    {
        return C == guc1;
    }

    public final Look[] a(int i1)
    {
        boolean flag;
        d.readLock().lock();
        flag = u;
        if (flag)
        {
            d.readLock().unlock();
            return null;
        }
        Look alook[];
        x = b.getLooks(i1);
        alook = x;
        d.readLock().unlock();
        return alook;
        Exception exception;
        exception;
        d.readLock().unlock();
        throw exception;
    }

    public final bdt b()
    {
        boolean flag;
        d.readLock().lock();
        flag = u;
        if (flag)
        {
            d.readLock().unlock();
            return null;
        }
        bdt bdt1;
        bdt1 = new bdt();
        bdt1.b = b.getEditListBytes();
        if (!t || v) goto _L2; else goto _L1
_L1:
        bdt1.a = c.computeResultImage(f(), true);
_L4:
        d.readLock().unlock();
        return bdt1;
_L2:
        bdt1.a = b.computeResultImage(f(), true);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        d.readLock().unlock();
        throw exception;
    }

    public final PipelineParams b(PipelineParams pipelineparams)
    {
        return b.getAdjustmentsAutoParams(pipelineparams);
    }

    public final PipelineParams c(PipelineParams pipelineparams)
    {
        return b.getCropAndRotateAutoParams(pipelineparams);
    }

    public final boolean c()
    {
        PipelineParams pipelineparams = e;
        PipelineParams pipelineparams1 = B;
        boolean flag;
        if (pipelineparams1 != null && b.a(pipelineparams.lightStrength, pipelineparams1.lightStrength) && b.a(pipelineparams.colorStrength, pipelineparams1.colorStrength) && b.a(pipelineparams.popStrength, pipelineparams1.popStrength) && b.a(pipelineparams.vignetteStrength, pipelineparams1.vignetteStrength) && (b.a(pipelineparams.vignetteStrength, 0.0F) || b.a(pipelineparams.vignetteCenterX, pipelineparams1.vignetteCenterX) && b.a(pipelineparams.vignetteCenterY, pipelineparams1.vignetteCenterY)) && b.a(pipelineparams.rotateAngle, pipelineparams1.rotateAngle) && b.a(pipelineparams.straightenAngle, pipelineparams1.straightenAngle) && b.a(pipelineparams.cropLeft, pipelineparams1.cropLeft) && b.a(pipelineparams.cropTop, pipelineparams1.cropTop) && b.a(pipelineparams.cropRight, pipelineparams1.cropRight) && b.a(pipelineparams.cropBottom, pipelineparams1.cropBottom) && pipelineparams.look == pipelineparams1.look && (pipelineparams.look == 0 || b.a(pipelineparams.lookIntensity, pipelineparams1.lookIntensity)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag;
    }

    public final void d()
    {
        PipelineParams pipelineparams = e;
        float f1;
        boolean flag;
        if (a != bdp.c && a != bdp.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pipelineparams.applyCrop = flag;
        if (e.applyCrop)
        {
            f1 = 0.0F;
        } else
        {
            f1 = w;
        }
        e.marginLeft = f1;
        e.marginTop = f1;
        e.marginRight = f1;
        e.marginBottom = f1;
        e();
    }

    public void e()
    {
        if (f != null)
        {
            f.v_();
        }
    }

    public final PipelineParams f()
    {
        return new PipelineParams(e);
    }

    public final void g()
    {
        g = f();
    }

    public final void h()
    {
        if (g != null)
        {
            g.a(e);
            a(g);
            g = null;
        }
    }

    public final boolean i()
    {
        return h != null;
    }

    public final void j()
    {
        e.zoomScale = 1.0F;
        e.zoomCenterX = 0.5F;
        e.zoomCenterY = 0.5F;
        e();
    }
}
