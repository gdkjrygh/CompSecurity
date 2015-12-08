// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.camera.model.CameraModel;
import com.squareup.otto.Bus;
import java.util.List;

public final class qG extends qI
{

    protected CameraModel a;
    private View b;

    public qG(View view)
    {
        SnapchatApplication.getDIComponent().a(this);
        b = view;
    }

    private android.hardware.Camera.Parameters a(android.hardware.Camera.Parameters parameters)
    {
        qP.b b1 = a.i;
        android.hardware.Camera.Parameters parameters1;
        if (b1 == null)
        {
            parameters1 = null;
        } else
        {
            parameters1 = parameters;
            if (parameters == null)
            {
                return b1.c();
            }
        }
        return parameters1;
    }

    public final void a(android.hardware.Camera.Parameters parameters, boolean flag)
    {
        qP.b b1;
        boolean flag2;
        flag2 = false;
        b1 = a.i;
        if (a.a()) goto _L2; else goto _L1
_L1:
        if (b1 != null) goto _L4; else goto _L3
_L3:
        boolean flag1 = flag2;
_L9:
        if (flag1 && b1 != null) goto _L5; else goto _L2
_L2:
        return;
_L4:
        android.hardware.Camera.Parameters parameters1;
        Object obj = b1.c();
        flag1 = flag2;
        if (obj != null)
        {
            obj = ((android.hardware.Camera.Parameters) (obj)).getSupportedFlashModes();
            flag1 = flag2;
            if (obj != null)
            {
                flag1 = ((List) (obj)).contains("on");
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if ((parameters1 = a(parameters)) == null) goto _L2; else goto _L6
_L6:
        if (flag)
        {
            parameters1.setFlashMode("on");
            List list = parameters1.getSupportedFocusModes();
            if (list != null && list.contains("auto"))
            {
                parameters1.setFocusMode("auto");
            }
        } else
        {
            parameters1.setFlashMode("off");
        }
        if (parameters != null) goto _L2; else goto _L7
_L7:
        b1.a(parameters1);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            Mf.a().a(new Mn(1.0F));
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(200L);
            alphaanimation.setFillAfter(true);
            b.setVisibility(0);
            b.startAnimation(alphaanimation);
            return;
        } else
        {
            Mf.a().a(new Mn(-1F));
            b.clearAnimation();
            b.setVisibility(8);
            return;
        }
    }

    public final void b(boolean flag)
    {
        qP.b b1 = a.i;
        android.hardware.Camera.Parameters parameters = a(((android.hardware.Camera.Parameters) (null)));
        if (parameters == null || b1 == null)
        {
            return;
        }
        if (flag)
        {
            List list = parameters.getSupportedFlashModes();
            if (list != null && list.contains("torch"))
            {
                parameters.setFlashMode("torch");
            }
        } else
        {
            parameters.setFlashMode("off");
        }
        b1.a(parameters);
    }
}
