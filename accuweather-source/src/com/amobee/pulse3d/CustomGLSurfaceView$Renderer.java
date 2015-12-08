// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.amobee.pulse3d:
//            CustomGLSurfaceView

public static interface 
{

    public abstract void onDrawFrame(GL10 gl10);

    public abstract void onSurfaceChanged(GL10 gl10, int i, int j);

    public abstract void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig);
}
