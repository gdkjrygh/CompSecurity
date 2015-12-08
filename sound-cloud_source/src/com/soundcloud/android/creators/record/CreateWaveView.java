// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.soundcloud.android.utils.images.ImageUtils;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder, RecordStream, AmplitudeData

public class CreateWaveView extends View
{
    static class CurrentAmplitudeHelper
    {

        private float accumulated;
        private float accumulations;
        private int barWidth;
        private float dumpIndex;
        private float groupIndex;
        private float groupValue;
        private final float spaceWidth;

        private void calculateGroupValue()
        {
            groupValue = getCurrentAverage();
            accumulations = 0.0F;
            accumulated = 0.0F;
        }

        private float getCurrentAverage()
        {
            return accumulated / accumulations;
        }

        float currentValue()
        {
            return groupValue;
        }

        void reset()
        {
            dumpIndex = -1F;
            groupValue = -1F;
            accumulations = 0.0F;
            accumulated = 0.0F;
            groupIndex = 0.0F;
        }

        boolean shouldShowSpace()
        {
            return dumpIndex > 0.0F;
        }

        void updateAmplitude(float f)
        {
            accumulated = accumulated + f;
            accumulations = accumulations + 1.0F;
            if (dumpIndex >= 0.0F)
            {
                if (dumpIndex == 0.0F)
                {
                    calculateGroupValue();
                }
                dumpIndex = dumpIndex + 1.0F;
                if (dumpIndex == spaceWidth)
                {
                    dumpIndex = -1F;
                }
            } else
            {
                if (groupIndex == 0.0F && getCurrentAverage() > groupValue)
                {
                    calculateGroupValue();
                }
                groupIndex = groupIndex + 1.0F;
                if (groupIndex == (float)barWidth)
                {
                    dumpIndex = 0.0F;
                    groupIndex = 0.0F;
                    return;
                }
            }
        }

        CurrentAmplitudeHelper(int i, float f)
        {
            groupValue = -1F;
            groupIndex = 0.0F;
            dumpIndex = -1F;
            accumulated = 0.0F;
            accumulations = 0.0F;
            barWidth = i;
            spaceWidth = f;
        }
    }

    static class DrawData
    {

        private MergedAmplitudeData ampData;
        private final float baselineRatio;
        private final CurrentAmplitudeHelper currentAmplitudeHelper;
        private int endIndex;
        public int height;
        public int lastDrawX;
        public int recIndex;
        public int size;
        private int startIndex;

        private int getAmplitudePoints(float af[], float af1[], float af2[], float af3[])
        {
            int i = 0;
            float f = (float)height * baselineRatio;
            float f1 = height;
            float f2 = height;
            float f3 = baselineRatio;
            currentAmplitudeHelper.reset();
            int j = 0;
            while (i < lastDrawX && j < af.length + 3) 
            {
                currentAmplitudeHelper.updateAmplitude(getInterpolatedValue(i, lastDrawX));
                float f4 = currentAmplitudeHelper.currentValue();
                float af4[];
                float af5[];
                if (currentAmplitudeHelper.shouldShowSpace())
                {
                    af4 = af2;
                } else
                {
                    af4 = af;
                }
                if (currentAmplitudeHelper.shouldShowSpace())
                {
                    af5 = af3;
                } else
                {
                    af5 = af1;
                }
                af4[j] = i;
                af4[j + 1] = f - f4 * f;
                af4[j + 2] = i;
                af4[j + 3] = f;
                af5[j] = i;
                af5[j + 1] = f;
                af5[j + 2] = i;
                af5[j + 3] = f4 * (f1 - f2 * f3) + f;
                j += 4;
                i++;
            }
            return lastDrawX * 4;
        }

        public void configure(MergedAmplitudeData mergedamplitudedata, float f, boolean flag, boolean flag1, int i, int j)
        {
            ampData = mergedamplitudedata;
            height = i;
            if (flag1)
            {
                i = ampData.preRecSize;
            } else
            {
                i = mergedamplitudedata.recordStartIndexWithTrim;
            }
            if (flag)
            {
                if (ampData.totalSize < j)
                {
                    startIndex = (int)((float)i - (float)i * f);
                } else
                if (ampData.writtenSize < j)
                {
                    startIndex = i - (int)((float)(j - ampData.writtenSize) * f);
                } else
                {
                    startIndex = Math.max(0, i + (int)((float)(ampData.writtenSize - j) * f));
                }
            } else
            if (ampData.totalSize < j)
            {
                startIndex = Math.max(0, (int)((float)i * f));
            } else
            {
                int k = ampData.totalSize;
                startIndex = (int)Math.max(0.0F, (float)(ampData.totalSize - j) - (float)(k - j - i) * f);
            }
            if (flag1)
            {
                i = ampData.totalSize;
            } else
            {
                i = mergedamplitudedata.recordEndIndexWithTrim;
            }
            endIndex = i;
            size = endIndex - startIndex;
            recIndex = Math.max(0, ampData.preRecSize - startIndex);
            if (flag)
            {
                i = j;
                if (size < j)
                {
                    i = (int)((float)j - (float)(j - size) * f);
                }
                lastDrawX = i;
                return;
            }
            i = j;
            if (size < j)
            {
                i = (int)((float)size + (float)(j - size) * f);
            }
            lastDrawX = i;
        }

        public float get(int i)
        {
            return ampData.get(startIndex + i);
        }

        public float getInterpolatedValue(int i, int j)
        {
            if (size > j)
            {
                return get((int)Math.min(size - 1, ((float)i / (float)j) * (float)size));
            } else
            {
                float f = Math.min(size - 1, ((float)size * (float)i) / (float)j);
                float f1 = get((int)Math.floor(f));
                float f2 = get((int)Math.ceil(f));
                return (f - (float)(int)f) * (f2 - f1) + f1;
            }
        }


        public DrawData(float f, CurrentAmplitudeHelper currentamplitudehelper)
        {
            baselineRatio = f;
            currentAmplitudeHelper = currentamplitudehelper;
        }
    }

    static class MergedAmplitudeData
    {

        private AmplitudeData preRecData;
        public int preRecSize;
        private AmplitudeData recData;
        public int recordEndIndexWithTrim;
        public int recordStartIndexWithTrim;
        public int totalSize;
        public int writtenSize;

        public void configure(RecordStream recordstream, float af[])
        {
            preRecData = recordstream.getPreRecordAmplitudeData();
            recData = recordstream.getAmplitudeData();
            int i;
            if (preRecData == null)
            {
                i = 0;
            } else
            {
                i = preRecData.size();
            }
            preRecSize = i;
            if (recData == null)
            {
                i = 0;
            } else
            {
                i = recData.size();
            }
            writtenSize = i;
            totalSize = preRecSize + writtenSize;
            recordStartIndexWithTrim = (int)((float)preRecSize + af[0] * (float)writtenSize);
            recordEndIndexWithTrim = (int)((double)totalSize - (double)writtenSize * (1.0D - (double)af[1]));
        }

        public float get(int i)
        {
            if (i < preRecData.size())
            {
                return preRecData.get(i);
            }
            if (i - preRecData.size() < recData.size())
            {
                return recData.get(i - preRecData.size());
            } else
            {
                return 0.0F;
            }
        }

        MergedAmplitudeData()
        {
        }
    }


    private static final long ANIMATION_ZOOM_TIME = 400L;
    private static final Paint BITMAP_PAINT;
    private static final Paint CLEAR_PAINT;
    private static final Interpolator SHOW_FULL_INTERPOLATOR = new DecelerateInterpolator();
    private static final int SPACE_ALPHA = 40;
    private float amplitudeAboveBarPoints[];
    private float amplitudeAboveSpacePoints[];
    private float amplitudeBelowBarPoints[];
    private float amplitudeBelowSpacePoints[];
    private final MergedAmplitudeData amplitudeData = new MergedAmplitudeData();
    private final float baselineRatio;
    private final CurrentAmplitudeHelper currentAmplitudeHelper;
    private float currentProgress;
    private final Paint darkAbovePaint = new Paint();
    private final Paint darkBelowPaint = new Paint();
    private final DrawData drawData;
    private final Paint grayAbovePaint = new Paint();
    private final Paint grayAboveSpacePaint = new Paint();
    private final Paint grayBelowPaint = new Paint();
    private final Paint grayBelowSpacePaint = new Paint();
    private boolean isEditing;
    private int mode;
    private int nextBitmapX;
    private final int orangeAboveEnd;
    private Paint orangeAbovePaint;
    private Paint orangeAboveSpacePaint;
    private final int orangeAboveStart;
    private final Paint orangeBelowPaint = new Paint();
    private final Paint orangeBelowSpacePaint = new Paint();
    private final Paint trimLinePaint = new Paint();
    private long zoomAnimationStartTime;
    private Bitmap zoomBitmap1;
    private Bitmap zoomBitmap2;

    public CreateWaveView(Context context)
    {
        super(context);
        nextBitmapX = -1;
        currentProgress = -1F;
        TypedValue typedvalue = new TypedValue();
        getResources().getValue(0x7f0b00e7, typedvalue, true);
        baselineRatio = typedvalue.getFloat();
        orangeAboveStart = context.getResources().getColor(0x7f0e00c0);
        orangeAboveEnd = context.getResources().getColor(0x7f0e00bf);
        int i = context.getResources().getColor(0x7f0e00c1);
        int j = context.getResources().getColor(0x7f0e00bd);
        int k = context.getResources().getColor(0x7f0e00be);
        int l = context.getResources().getColor(0x7f0e00bb);
        int i1 = context.getResources().getColor(0x7f0e00bc);
        int j1 = context.getResources().getColor(0x7f0e00c2);
        orangeAbovePaint = new Paint();
        orangeAboveSpacePaint = new Paint();
        orangeBelowPaint.setColor(i);
        orangeBelowSpacePaint.setColor(i);
        orangeBelowSpacePaint.setAlpha(40);
        grayAbovePaint.setColor(j);
        grayAboveSpacePaint.setColor(j);
        grayAboveSpacePaint.setAlpha(40);
        grayBelowPaint.setColor(k);
        grayBelowSpacePaint.setColor(k);
        grayBelowSpacePaint.setAlpha(40);
        darkAbovePaint.setColor(l);
        darkBelowPaint.setColor(i1);
        trimLinePaint.setColor(j1);
        i = context.getResources().getDimensionPixelSize(0x7f0b00e8);
        j = context.getResources().getDimensionPixelSize(0x7f0b00e6);
        drawData = new DrawData(baselineRatio, new CurrentAmplitudeHelper(j, i));
        currentAmplitudeHelper = new CurrentAmplitudeHelper(j, i);
        reset();
    }

    private void drawAmplitude(Canvas canvas, int i, float f, Paint paint, Paint paint1)
    {
        float f1 = (float)getHeight() * baselineRatio;
        float f2 = getHeight();
        float f3 = baselineRatio;
        canvas.drawLine(i, f1 - f * f1, i, f1, paint);
        canvas.drawLine(i, f1, i, f1 + f * (f2 * (1.0F - f3)), paint1);
    }

    private void drawFullView(Canvas canvas, float af[], float af1[], float af2[], float af3[], int i, float af4[])
    {
        int l = getWidth();
        if (!isEditing)
        {
            int j = (int)(currentProgress * (float)l);
            if (j < 0)
            {
                drawPointsOnCanvas(canvas, af, i, orangeAbovePaint, 0, -1);
                drawPointsOnCanvas(canvas, af1, i, orangeBelowPaint, 0, -1);
                drawPointsOnCanvas(canvas, af2, i, orangeAboveSpacePaint, 0, -1);
                drawPointsOnCanvas(canvas, af3, i, orangeBelowSpacePaint, 0, -1);
                return;
            } else
            {
                drawPointsOnCanvas(canvas, af, i, orangeAbovePaint, 0, j);
                drawPointsOnCanvas(canvas, af1, i, orangeBelowPaint, 0, j);
                drawPointsOnCanvas(canvas, af2, i, orangeAboveSpacePaint, 0, j);
                drawPointsOnCanvas(canvas, af3, i, orangeBelowSpacePaint, 0, j);
                drawPointsOnCanvas(canvas, af, i, grayAbovePaint, j, -1);
                drawPointsOnCanvas(canvas, af1, i, grayBelowPaint, j, -1);
                drawPointsOnCanvas(canvas, af2, i, grayAboveSpacePaint, j, -1);
                drawPointsOnCanvas(canvas, af3, i, grayBelowSpacePaint, j, -1);
                return;
            }
        }
        int i1 = (int)(af4[0] * (float)l);
        int j1 = (int)(af4[1] * (float)l);
        int k;
        if (currentProgress == -1F)
        {
            k = -1;
        } else
        {
            k = (int)((float)i1 + (float)(j1 - i1) * currentProgress);
        }
        drawPointsOnCanvas(canvas, af, i, darkAbovePaint, 0, Math.max(i1 - 1, 0));
        drawPointsOnCanvas(canvas, af1, i, darkBelowPaint, 0, Math.max(i1 - 1, 0));
        if (k < 0)
        {
            drawPointsOnCanvas(canvas, af, i, orangeAbovePaint, Math.max(i1, 1), j1 - 1);
            drawPointsOnCanvas(canvas, af1, i, orangeBelowPaint, Math.max(i1, 1), j1 - 1);
            drawPointsOnCanvas(canvas, af2, i, orangeAboveSpacePaint, Math.max(i1, 1), j1 - 1);
            drawPointsOnCanvas(canvas, af3, i, orangeBelowSpacePaint, Math.max(i1, 1), j1 - 1);
        } else
        {
            int k1 = Math.max(i1 + 1, k);
            drawPointsOnCanvas(canvas, af, i, orangeAbovePaint, i1 + 1, k1);
            drawPointsOnCanvas(canvas, af1, i, orangeBelowPaint, i1 + 1, k1);
            drawPointsOnCanvas(canvas, af2, i, orangeAboveSpacePaint, i1 + 1, k1);
            drawPointsOnCanvas(canvas, af3, i, orangeBelowSpacePaint, i1 + 1, k1);
            drawPointsOnCanvas(canvas, af, i, grayAbovePaint, Math.min(j1 - 1, Math.max(k1, k)), j1 - 1);
            drawPointsOnCanvas(canvas, af1, i, grayBelowPaint, Math.min(j1 - 1, Math.max(k1, k)), j1 - 1);
            drawPointsOnCanvas(canvas, af2, i, grayAboveSpacePaint, Math.min(j1 - 1, Math.max(k1, k)), j1 - 1);
            drawPointsOnCanvas(canvas, af3, i, grayBelowSpacePaint, Math.min(j1 - 1, Math.max(k1, k)), j1 - 1);
        }
        drawPointsOnCanvas(canvas, af, i, darkAbovePaint, Math.min(l - 1, j1), -1);
        drawPointsOnCanvas(canvas, af1, i, darkBelowPaint, Math.min(l - 1, j1), -1);
        canvas.drawRect(0.0F, 0.0F, Math.max(i1, 1), getHeight(), trimLinePaint);
        canvas.drawRect(Math.max(j1, 0), 0.0F, l - 1, getHeight(), trimLinePaint);
    }

    private void drawLastAmplitude(boolean flag)
    {
        if (getHeight() == 0)
        {
            return;
        }
        int i = getWidth();
        if (nextBitmapX != -1 && zoomBitmap1 != null && zoomBitmap2 != null)
        {
            nextBitmapX = nextBitmapX + 1;
            boolean flag1 = currentAmplitudeHelper.shouldShowSpace();
            float f;
            Paint paint;
            Paint paint1;
            if (flag)
            {
                if (flag1)
                {
                    paint = orangeAboveSpacePaint;
                } else
                {
                    paint = orangeAbovePaint;
                }
                if (flag1)
                {
                    paint1 = orangeBelowSpacePaint;
                } else
                {
                    paint1 = orangeBelowPaint;
                }
            } else
            {
                if (flag1)
                {
                    paint = grayAboveSpacePaint;
                } else
                {
                    paint = grayAbovePaint;
                }
                if (flag1)
                {
                    paint1 = grayBelowSpacePaint;
                } else
                {
                    paint1 = grayBelowPaint;
                }
            }
            f = currentAmplitudeHelper.currentValue();
            if (nextBitmapX < i)
            {
                drawAmplitude(new Canvas(zoomBitmap1), nextBitmapX, f, paint, paint1);
            } else
            if (nextBitmapX < i * 2)
            {
                drawAmplitude(new Canvas(zoomBitmap2), nextBitmapX - i, f, paint, paint1);
            } else
            {
                (new Canvas(zoomBitmap1)).drawRect(0.0F, 0.0F, i, getHeight(), CLEAR_PAINT);
                Bitmap bitmap = zoomBitmap1;
                zoomBitmap1 = zoomBitmap2;
                zoomBitmap2 = bitmap;
                nextBitmapX = i;
                drawAmplitude(new Canvas(zoomBitmap2), nextBitmapX - i, f, paint, paint1);
            }
        }
        invalidate();
    }

    private static void drawPointsOnCanvas(Canvas canvas, float af[], int i, Paint paint, int j, int k)
    {
        j *= 4;
        if (k != -1)
        {
            i = k * 4;
        }
        canvas.drawLines(af, j, i - j, paint);
    }

    private void drawZoomView(Canvas canvas, DrawData drawdata)
    {
        int i = getWidth();
        if (nextBitmapX == -1)
        {
            Canvas canvas1 = new Canvas(zoomBitmap1);
            i = Math.min(i, drawdata.size);
            nextBitmapX = 0;
            while (nextBitmapX < i) 
            {
                int j = (drawdata.size - i) + nextBitmapX;
                currentAmplitudeHelper.updateAmplitude(drawdata.get(j));
                boolean flag = currentAmplitudeHelper.shouldShowSpace();
                Paint paint;
                Paint paint1;
                if (drawdata.recIndex == -1 || j < drawdata.recIndex)
                {
                    if (flag)
                    {
                        paint = grayAboveSpacePaint;
                    } else
                    {
                        paint = grayAbovePaint;
                    }
                    if (flag)
                    {
                        paint1 = grayBelowSpacePaint;
                    } else
                    {
                        paint1 = grayBelowPaint;
                    }
                } else
                {
                    if (flag)
                    {
                        paint = orangeAboveSpacePaint;
                    } else
                    {
                        paint = orangeAbovePaint;
                    }
                    if (flag)
                    {
                        paint1 = orangeBelowSpacePaint;
                    } else
                    {
                        paint1 = orangeBelowPaint;
                    }
                }
                drawAmplitude(canvas1, nextBitmapX, currentAmplitudeHelper.currentValue(), paint, paint1);
                nextBitmapX = nextBitmapX + 1;
            }
            nextBitmapX = nextBitmapX - 1;
        }
        drawdata = new Matrix();
        if (nextBitmapX > getWidth())
        {
            drawdata.setTranslate(getWidth() - nextBitmapX, 0.0F);
            canvas.drawBitmap(zoomBitmap1, drawdata, BITMAP_PAINT);
            drawdata.setTranslate(getWidth() * 2 - nextBitmapX, 0.0F);
            canvas.drawBitmap(zoomBitmap2, drawdata, BITMAP_PAINT);
            return;
        } else
        {
            drawdata.setTranslate(0.0F, 0.0F);
            canvas.drawBitmap(zoomBitmap1, drawdata, BITMAP_PAINT);
            return;
        }
    }

    private void recreateZoomBitmaps(int i, int j)
    {
        if (zoomBitmap1 != null)
        {
            zoomBitmap1.recycle();
        }
        if (zoomBitmap2 != null)
        {
            zoomBitmap2.recycle();
        }
        zoomBitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        zoomBitmap2 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
    }

    private void resetZoomBitmaps()
    {
        nextBitmapX = -1;
        if (zoomBitmap1 != null)
        {
            (new Canvas(zoomBitmap1)).drawRect(0.0F, 0.0F, zoomBitmap1.getWidth(), zoomBitmap1.getHeight(), CLEAR_PAINT);
        }
        if (zoomBitmap2 != null)
        {
            (new Canvas(zoomBitmap2)).drawRect(0.0F, 0.0F, zoomBitmap2.getWidth(), zoomBitmap2.getHeight(), CLEAR_PAINT);
        }
    }

    public void onDestroy()
    {
        ImageUtils.clearBitmap(zoomBitmap1);
        ImageUtils.clearBitmap(zoomBitmap2);
        zoomBitmap2 = null;
        zoomBitmap1 = null;
    }

    protected void onDraw(Canvas canvas)
    {
        boolean flag1 = true;
        Object obj = SoundRecorder.getInstance(getContext());
        float af[] = ((SoundRecorder) (obj)).getTrimWindow();
        float f = Math.min(1.0F, (float)(System.currentTimeMillis() - zoomAnimationStartTime) / 400F);
        float f1 = SHOW_FULL_INTERPOLATOR.getInterpolation(f);
        MergedAmplitudeData mergedamplitudedata;
        boolean flag;
        if (f < 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        amplitudeData.configure(((SoundRecorder) (obj)).getRecordStream(), af);
        obj = drawData;
        mergedamplitudedata = amplitudeData;
        if (mode != 0)
        {
            flag1 = false;
        }
        ((DrawData) (obj)).configure(mergedamplitudedata, f1, flag1, isEditing, getHeight(), getWidth());
        if (drawData.size > 0)
        {
            if (amplitudeAboveBarPoints == null)
            {
                int i = canvas.getWidth() * 4;
                amplitudeAboveBarPoints = new float[i];
                amplitudeBelowBarPoints = new float[i];
                amplitudeAboveSpacePoints = new float[i];
                amplitudeBelowSpacePoints = new float[i];
            }
            int k = drawData.getAmplitudePoints(amplitudeAboveBarPoints, amplitudeBelowBarPoints, amplitudeAboveSpacePoints, amplitudeBelowSpacePoints);
            if (flag)
            {
                if (drawData.recIndex == 0)
                {
                    canvas.drawLines(amplitudeAboveBarPoints, 0, k, orangeAbovePaint);
                    canvas.drawLines(amplitudeBelowBarPoints, 0, k, orangeBelowPaint);
                    canvas.drawLines(amplitudeAboveSpacePoints, 0, k, orangeAboveSpacePaint);
                    canvas.drawLines(amplitudeBelowSpacePoints, 0, k, orangeBelowSpacePaint);
                } else
                {
                    int j;
                    if (amplitudeData.writtenSize >= getWidth())
                    {
                        j = drawData.recIndex * 4;
                    } else
                    {
                        j = Math.round(((float)drawData.recIndex * (float)drawData.lastDrawX) / (float)drawData.size) * 4;
                    }
                    canvas.drawLines(amplitudeAboveBarPoints, 0, j, grayAbovePaint);
                    canvas.drawLines(amplitudeBelowBarPoints, 0, j, grayBelowPaint);
                    canvas.drawLines(amplitudeAboveBarPoints, j, k - j, orangeAbovePaint);
                    canvas.drawLines(amplitudeBelowBarPoints, j, k - j, orangeBelowPaint);
                    canvas.drawLines(amplitudeAboveSpacePoints, 0, j, grayAboveSpacePaint);
                    canvas.drawLines(amplitudeBelowSpacePoints, 0, j, grayBelowSpacePaint);
                    canvas.drawLines(amplitudeAboveSpacePoints, j, k - j, orangeAboveSpacePaint);
                    canvas.drawLines(amplitudeBelowSpacePoints, j, k - j, orangeBelowSpacePaint);
                }
            } else
            if (mode == 0)
            {
                drawZoomView(canvas, drawData);
            } else
            {
                drawFullView(canvas, amplitudeAboveBarPoints, amplitudeBelowBarPoints, amplitudeAboveSpacePoints, amplitudeBelowSpacePoints, k, af);
            }
        }
        if (flag)
        {
            invalidate();
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (i != 0 && j != 0)
        {
            recreateZoomBitmaps(i, j);
            nextBitmapX = -1;
            orangeAbovePaint.setShader(new LinearGradient(0.0F, 0.0F, 0.0F, baselineRatio * (float)j, orangeAboveStart, orangeAboveEnd, android.graphics.Shader.TileMode.MIRROR));
            orangeAboveSpacePaint.setShader(new LinearGradient(0.0F, 0.0F, 0.0F, baselineRatio * (float)j, orangeAboveStart, orangeAboveEnd, android.graphics.Shader.TileMode.MIRROR));
            orangeAboveSpacePaint.setAlpha(40);
        }
    }

    public final void reset()
    {
        currentProgress = -1F;
        zoomAnimationStartTime = -1L;
        mode = 0;
        isEditing = false;
        resetZoomBitmaps();
        invalidate();
    }

    public void setIsEditing(boolean flag)
    {
        isEditing = flag;
        invalidate();
    }

    public void setMode(int i, boolean flag)
    {
        if (mode != i)
        {
            mode = i;
            currentProgress = -1F;
            if (flag)
            {
                zoomAnimationStartTime = System.currentTimeMillis();
            }
            invalidate();
        }
    }

    public void setPlaybackProgress(float f)
    {
        currentProgress = f;
        invalidate();
    }

    public void updateAmplitude(float f, boolean flag)
    {
        currentAmplitudeHelper.updateAmplitude(f);
        drawLastAmplitude(flag);
    }

    static 
    {
        Paint paint = new Paint();
        BITMAP_PAINT = paint;
        paint.setAntiAlias(true);
        paint = new Paint();
        CLEAR_PAINT = paint;
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        CLEAR_PAINT.setColor(0);
    }
}
