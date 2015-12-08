// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.widget.TextView;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DGLRenderer

class val.fps
    implements Runnable
{

    final Pulse3DGLRenderer this$0;
    final int val$fps;

    public void run()
    {
        Pulse3DGLRenderer.access$100().setText((new StringBuilder()).append(val$fps).append(" FPS\n").append(Pulse3DGLRenderer.access$000(Pulse3DGLRenderer.this)).toString());
    }

    ()
    {
        this$0 = final_pulse3dglrenderer;
        val$fps = I.this;
        super();
    }
}
