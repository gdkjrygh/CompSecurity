// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            ExecuteSingleGLCommandProcessor, CommandBase, Pulse3DView

class this._cls0
    implements Runnable
{

    final ExecuteSingleGLCommandProcessor this$0;

    public void run()
    {
        command_.execute();
        if (GLES20.glGetError() == 0)
        {
            viewController_.reportSuccess(serial_, command_.stringifyResult());
            return;
        } else
        {
            viewController_.reportError(serial_, "");
            return;
        }
    }

    ()
    {
        this$0 = ExecuteSingleGLCommandProcessor.this;
        super();
    }
}
