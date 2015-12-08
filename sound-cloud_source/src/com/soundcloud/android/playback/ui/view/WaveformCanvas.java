// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.soundcloud.android.waveform.WaveformData;

public class WaveformCanvas extends TextureView
    implements android.view.TextureView.SurfaceTextureListener
{

    private Paint abovePaint;
    private int barWidth;
    private int baseline;
    private Paint belowPaint;
    private int spaceWidth;
    private boolean surfaceAvailable;
    private WaveformData waveformData;

    public WaveformCanvas(Context context)
    {
        this(context, null);
    }

    public WaveformCanvas(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public WaveformCanvas(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        surfaceAvailable = false;
        setSurfaceTextureListener(this);
        setOpaque(false);
    }

    private void drawBar(Canvas canvas, int i, float f, Paint paint, Paint paint1)
    {
        int j = baseline;
        int k = (int)(((float)baseline * f) / (float)waveformData.maxAmplitude);
        int l = baseline;
        int i1 = (int)(((float)(getHeight() - baseline) * f) / (float)waveformData.maxAmplitude);
        int j1 = spaceWidth;
        canvas.drawRect(i, j - k, barWidth + i, baseline, paint);
        canvas.drawRect(i, baseline + spaceWidth, barWidth + i, (l + i1) - j1, paint1);
    }

    public void drawCanvas()
    {
        Canvas canvas;
        if (surfaceAvailable)
        {
            if ((canvas = lockCanvas()) != null)
            {
                canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                if (waveformData != null)
                {
                    int k = barWidth;
                    int l = spaceWidth;
                    int i = 0;
                    int j = 0;
                    for (; i < waveformData.samples.length; i++)
                    {
                        drawBar(canvas, j, Math.max(spaceWidth, waveformData.samples[i]), abovePaint, belowPaint);
                        j += k + l;
                    }

                }
                unlockCanvasAndPost(canvas);
                return;
            }
        }
    }

    public void initialize(WaveformData waveformdata, Paint paint, Paint paint1, int i, int j, int k)
    {
        waveformData = waveformdata;
        abovePaint = paint;
        belowPaint = paint1;
        barWidth = i;
        spaceWidth = j;
        baseline = k;
        drawCanvas();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        surfaceAvailable = true;
        drawCanvas();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        surfaceAvailable = false;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        drawCanvas();
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }
}
