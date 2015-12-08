// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.c;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.TextureView;
import com.kik.sdkutils.y;
import java.io.IOException;
import kik.android.util.bx;

// Referenced classes of package kik.android.c:
//            b

public class e extends b
    implements android.view.TextureView.SurfaceTextureListener
{

    boolean e;
    private final TextureView f;
    private Camera g;

    public e(TextureView textureview, b.c c1)
    {
        f = textureview;
        f.setSurfaceTextureListener(this);
        b = c1;
    }

    public final void a(Camera camera)
    {
        super.a(camera);
        g = camera;
        SurfaceTexture surfacetexture;
        if (camera != null && e)
        {
            if ((surfacetexture = f.getSurfaceTexture()) != null)
            {
                try
                {
                    camera.setPreviewTexture(surfacetexture);
                    camera.startPreview();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Camera camera) { }
                // Misplaced declaration of an exception variable
                catch (Camera camera) { }
                bx.c(camera);
                if (c != null)
                {
                    c.a();
                    return;
                }
            }
        }
    }

    public final boolean a()
    {
        return e;
    }

    public final void b()
    {
        g = null;
    }

    public final Camera c()
    {
        return g;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        e = true;
        a(g);
        if (y.a(14))
        {
            f.setOnTouchListener(a);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        e = false;
        if (b != null)
        {
            b.a();
        }
        surfacetexture.release();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        a(g);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }
}
