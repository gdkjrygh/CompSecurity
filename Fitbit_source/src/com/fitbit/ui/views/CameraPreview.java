// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.views;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.TextureView;
import com.fitbit.e.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class CameraPreview extends TextureView
    implements android.view.TextureView.SurfaceTextureListener
{

    private static String a = "CameraPreview";
    private Camera b;
    private int c;
    private int d;

    public CameraPreview(Context context)
    {
        this(context, null);
    }

    public CameraPreview(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setSurfaceTextureListener(this);
    }

    private Pair a(List list)
    {
        list = list.iterator();
        int j = 0;
        int i = 0;
        while (list.hasNext()) 
        {
            android.hardware.Camera.Size size = (android.hardware.Camera.Size)list.next();
            int k;
            if (size.width * size.height > i * j)
            {
                j = size.width;
                i = size.height;
            } else
            {
                int l = i;
                i = j;
                j = l;
            }
            k = j;
            j = i;
            i = k;
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(j));
    }

    private void a()
    {
        if (b != null)
        {
            b.stopPreview();
            b.release();
            b = null;
        }
    }

    private void a(int i, int j)
    {
        android.hardware.Camera.Parameters parameters = b.getParameters();
        Object obj = parameters.getSupportedFocusModes();
        parameters.setFocusMode((String)((List) (obj)).get(0));
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            if (s.equals("continuous-picture"))
            {
                parameters.setFocusMode(s);
            }
        } while (true);
        obj = a(parameters.getSupportedPreviewSizes());
        parameters.setPreviewSize(((Integer)((Pair) (obj)).first).intValue(), ((Integer)((Pair) (obj)).second).intValue());
        c = parameters.getPreviewSize().height;
        d = parameters.getPreviewSize().width;
        b.setParameters(parameters);
        b(i, j);
    }

    private void b(int i, int j)
    {
        int k = c;
        float f = (float)d / (float)j;
        float f1 = (float)k / (float)i;
        float f2 = 1.0F / Math.min(f1, f);
        Matrix matrix = new Matrix();
        matrix.setScale(f1 * f2, f * f2, i / 2, j / 2);
        setTransform(matrix);
    }

    public void a(Camera camera)
    {
        if (b != camera)
        {
            a();
            b = camera;
            if (b != null)
            {
                requestLayout();
                try
                {
                    a(getWidth(), getHeight());
                    b.setPreviewTexture(getSurfaceTexture());
                }
                // Misplaced declaration of an exception variable
                catch (Camera camera)
                {
                    com.fitbit.e.a.f(a, camera);
                }
                b.startPreview();
                return;
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, i);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        if (b == null)
        {
            return;
        }
        try
        {
            a(i, j);
            b.setPreviewTexture(surfacetexture);
            b.startPreview();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceTexture surfacetexture)
        {
            com.fitbit.e.a.f(a, surfacetexture);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        if (b != null)
        {
            b.stopPreview();
            return true;
        } else
        {
            return false;
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        try
        {
            b.stopPreview();
        }
        catch (Exception exception)
        {
            com.fitbit.e.a.f(a, exception);
        }
        b(i, j);
        try
        {
            b.setPreviewTexture(surfacetexture);
            b.startPreview();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceTexture surfacetexture)
        {
            com.fitbit.e.a.f(a, surfacetexture);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

}
