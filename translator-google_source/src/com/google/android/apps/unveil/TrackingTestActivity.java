// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil;

import android.os.Bundle;
import android.view.SurfaceHolder;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.gl.GLCameraPreview;
import com.google.android.apps.unveil.nonstop.DebugView;
import com.google.android.apps.unveil.nonstop.a;
import com.google.android.apps.unveil.nonstop.e;
import com.google.android.apps.unveil.sensors.CameraManager;
import com.google.android.apps.unveil.tracking.TrackingTestView;
import com.google.android.apps.unveil.tracking.f;
import com.google.android.apps.unveil.tracking.g;
import com.google.android.apps.unveil.tracking.i;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.unveil:
//            GogglesPreviewLoopingActivity, i, k, PreviewLoopingActivity, 
//            e, d, j

public class TrackingTestActivity extends GogglesPreviewLoopingActivity
    implements g
{

    private static final af g = new af();
    private TrackingTestView h;
    private f i;
    private j j;
    private boolean k;

    public TrackingTestActivity()
    {
    }

    static f a(TrackingTestActivity trackingtestactivity)
    {
        return trackingtestactivity.i;
    }

    private void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (k)
        {
            a();
            if (j != null)
            {
                j = null;
            }
            (new Thread(new com.google.android.apps.unveil.i(this))).run();
            k = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void a(com.google.android.apps.unveil.nonstop.f f1)
    {
        if (a.d())
        {
            Object obj = a.c();
            i = new f(getResources(), ((String) (obj)), this);
            f1.a(i, 0);
            f1 = i;
            obj = super.e;
            ((DebugView) (obj)).a.add(f1);
            ((DebugView) (obj)).post(new a(((DebugView) (obj))));
            a(((com.google.android.apps.unveil.ui.c) (i)));
            return;
        } else
        {
            h.getHolder().setFormat(-3);
            Object obj1 = h;
            obj1.getClass();
            obj1 = new i(((TrackingTestView) (obj1)));
            f1.a(((com.google.android.apps.unveil.nonstop.c) (obj1)), 0);
            a(((com.google.android.apps.unveil.ui.c) (obj1)));
            h.setBoundingBoxLayer(f.getBoundingBoxLayer());
            f1.a(new e(c), 1);
            return;
        }
    }

    public final void h()
    {
        this;
        JVM INSTR monitorenter ;
        k = true;
        i();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = false;
        a(e.tracking_test);
        h = (TrackingTestView)findViewById(d.tracking_view);
        if (a.d())
        {
            h.setVisibility(8);
        }
    }

    protected void onStop()
    {
        c.e();
        a();
        super.onStop();
    }

}
