// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;

// Referenced classes of package com.skype.android.media:
//            SurfaceTextureRenderer

public interface SurfaceWrapper
{

    public abstract Matrix a(Matrix matrix);

    public abstract Surface a();

    public abstract void a(Runnable runnable);

    public abstract SurfaceTexture b();

    public abstract void b(Matrix matrix);

    public abstract View c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract SurfaceTextureRenderer g();
}
