// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Colors;
import com.pinterest.base.Device;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.GifDecoder;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.ui.grid.pin:
//            PinCellDrawable

public class PinCinematicDrawable extends PinCellDrawable
{

    protected static final int MAX_PIN_HEIGHT_CROP = Math.round(Device.dpToPixel(420F));
    private static final String TAG = com/pinterest/ui/grid/pin/PinCinematicDrawable.getName();
    protected int MAX_PIN_HEIGHT;
    private GifDecoder _gifDecoder;
    private DownloadGifTask _gifDownloadTask;
    private volatile Status _gifStatus;
    private Bitmap _image;
    private boolean _memoryMappingFinish;
    private boolean _renderLargePin;
    private int _screenLocation[];
    private int alpha;
    private final Paint dividerPaint = new Paint(1);
    private int finalFrameCount;
    private Set framesSeen;
    private int gifFrameIndex;
    private float gifLoopCount;
    private float numberOfFramesShown;
    private View parent;
    private int pinImageHeight;
    private int pinImageWidth;
    private int previousScreenLocation;
    private float scale;

    public PinCinematicDrawable(View view)
    {
        _gifStatus = Status.RESET;
        _screenLocation = new int[2];
        previousScreenLocation = 0;
        numberOfFramesShown = 0.0F;
        gifFrameIndex = 0;
        MAX_PIN_HEIGHT = MAX_PIN_HEIGHT_CROP;
        _renderLargePin = false;
        _memoryMappingFinish = false;
        alpha = 0;
        scale = 1.0F;
        pinImageWidth = 0;
        pinImageHeight = 0;
        parent = view;
        dividerPaint.setColor(Colors.LIGHT_GRAY);
        dividerPaint.setAntiAlias(true);
        dividerPaint.setStyle(android.graphics.Paint.Style.FILL);
    }

    private void addNumberofFramesShown(int i)
    {
        if (!framesSeen.contains(String.valueOf(i)))
        {
            framesSeen.add(String.valueOf(i));
            numberOfFramesShown = numberOfFramesShown + 1.0F;
            if (finalFrameCount != 0 && (framesSeen.size() == finalFrameCount || i == finalFrameCount - 1))
            {
                gifLoopCount = gifLoopCount + 1.0F;
                numberOfFramesShown = 0.0F;
                framesSeen.clear();
                return;
            }
        }
    }

    private int getIndex(int i, int j, int k)
    {
        if (j > i)
        {
            return k + 1;
        } else
        {
            return k - 1;
        }
    }

    private void updateHeight()
    {
        int i = pinImageWidth;
        int j = pinImageHeight;
        if (i == 0 || j == 0)
        {
            return;
        }
        float f = (float)j / (float)i;
        j = (int)Math.ceil((float)(width - padding.left - padding.right) * f) + 1;
        int k = (int)((float)j / f);
        if (j > MAX_PIN_HEIGHT)
        {
            i = MAX_PIN_HEIGHT;
        } else
        {
            i = j;
        }
        if (_renderLargePin)
        {
            i = Math.min(k, j);
        }
        setHeight(i + padding.top);
    }

    public void draw(Canvas canvas)
    {
        parent.getLocationInWindow(_screenLocation);
        if (previousScreenLocation == 0)
        {
            previousScreenLocation = _screenLocation[1];
        }
        if (_image != null)
        {
            scale = (float)(width - padding.left - padding.right) / (float)_image.getWidth();
            if (alpha < 255)
            {
                blankPaint.setAlpha(alpha);
                alpha = alpha + 67;
                parent.postInvalidateDelayed(56L);
            }
            scale = (float)height / (float)_image.getHeight();
            sharedRect.left = 0;
            sharedRect.top = 0;
            sharedRect.right = _image.getWidth();
            sharedRect.bottom = _image.getHeight();
            sharedRectF.set(sharedRect);
            int i = Math.abs(_screenLocation[1] - previousScreenLocation);
            if (_gifDecoder != null && _memoryMappingFinish && i >= 10)
            {
                gifFrameIndex = getIndex(_screenLocation[1], previousScreenLocation, gifFrameIndex);
                _image = _gifDecoder.getConcurrentFrame(Math.abs(gifFrameIndex));
                addNumberofFramesShown(Math.abs(gifFrameIndex));
                previousScreenLocation = _screenLocation[1];
            }
            sharedMatrix.reset();
            sharedMatrix.postScale(scale, scale);
            sharedMatrix.postTranslate(padding.left, padding.top);
            sharedMatrix.mapRect(sharedRectF);
            if (_image != null)
            {
                canvas.drawBitmap(_image, sharedRect, sharedRectF, blankPaint);
            }
            blankPaint.setAlpha(255);
            if (pressed)
            {
                touchPaint.setColor(Colors.BG_TOUCH_IMAGE);
                canvas.drawRect(getBounds(), touchPaint);
                touchPaint.setColor(Colors.BG_TOUCH);
            }
        } else
        {
            PLog.warn(TAG, new Object[] {
                "Image was null here "
            });
        }
        canvas.drawRect(getBounds().left + 1, getBounds().bottom - 1, getBounds().right - 1, getBounds().bottom, dividerPaint);
    }

    public float getNumberOfFramesShown(String s)
    {
        if (finalFrameCount != 0)
        {
            numberOfFramesShown = numberOfFramesShown / (float)finalFrameCount;
            float f = gifLoopCount + numberOfFramesShown;
            Preferences.persisted().set((new StringBuilder()).append(s).append("PREF_CINEMATIC_PIN_LOOPCOUNT").toString(), (float)Math.round(f * 100F) / 100F);
            Preferences.persisted().set((new StringBuilder()).append(s).append("PREF_CINEMATIC_PIN_FRAMES").toString(), framesSeen);
            return (float)Math.round(f * 100F) / 100F;
        } else
        {
            return gifLoopCount;
        }
    }

    public void initLogging(String s)
    {
        if (Preferences.persisted().getStringSet((new StringBuilder()).append(s).append("PREF_CINEMATIC_PIN_FRAMES").toString(), null) == null)
        {
            framesSeen = new HashSet();
        } else
        {
            framesSeen = Preferences.persisted().getStringSet((new StringBuilder()).append(s).append("PREF_CINEMATIC_PIN_FRAMES").toString(), null);
        }
        gifLoopCount = Preferences.persisted().getFloat((new StringBuilder()).append(s).append("PREF_CINEMATIC_PIN_LOOPCOUNT").toString(), 0.0F);
    }

    public void loadImage(String s)
    {
        if (_gifStatus != Status.RESET)
        {
            if (StringUtils.isBlank(s))
            {
                _gifStatus = Status.ERROR;
            }
            return;
        } else
        {
            _gifDownloadTask = new DownloadGifTask(s, new _cls1());
            _gifDownloadTask.execute();
            return;
        }
    }

    public void measure()
    {
        updateHeight();
    }

    public void prepareForReuse()
    {
        super.prepareForReuse();
        if (_gifDownloadTask != null)
        {
            _gifDownloadTask.cancel();
            _gifDownloadTask = null;
        }
        _image = null;
        _gifDecoder = null;
        _gifStatus = Status.RESET;
    }

    public void setImageHeight(int i)
    {
        pinImageHeight = i;
    }

    public void setImageWidth(int i)
    {
        pinImageWidth = i;
    }

    public void setPin(Pin pin)
    {
        int j = 0;
        if (pin != null)
        {
            int i;
            if (pin.getCinematicPinHeight() == null)
            {
                i = 0;
            } else
            {
                i = pin.getCinematicPinHeight().intValue();
            }
            if (pin.getCinematicPinWidth() != null)
            {
                j = pin.getCinematicPinWidth().intValue();
            }
            if (i != 0 && j != 0)
            {
                setImageWidth(j);
                setImageHeight(i);
                return;
            }
        }
    }



/*
    static Status access$002(PinCinematicDrawable pincinematicdrawable, Status status)
    {
        pincinematicdrawable._gifStatus = status;
        return status;
    }

*/


/*
    static GifDecoder access$102(PinCinematicDrawable pincinematicdrawable, GifDecoder gifdecoder)
    {
        pincinematicdrawable._gifDecoder = gifdecoder;
        return gifdecoder;
    }

*/


/*
    static Bitmap access$202(PinCinematicDrawable pincinematicdrawable, Bitmap bitmap)
    {
        pincinematicdrawable._image = bitmap;
        return bitmap;
    }

*/


/*
    static boolean access$302(PinCinematicDrawable pincinematicdrawable, boolean flag)
    {
        pincinematicdrawable._memoryMappingFinish = flag;
        return flag;
    }

*/


/*
    static int access$402(PinCinematicDrawable pincinematicdrawable, int i)
    {
        pincinematicdrawable.finalFrameCount = i;
        return i;
    }

*/

    private class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status DECODED;
        public static final Status DECODING;
        public static final Status DOWNLOADED;
        public static final Status DOWNLOADING;
        public static final Status ERROR;
        public static final Status RESET;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/pinterest/ui/grid/pin/PinCinematicDrawable$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            RESET = new Status("RESET", 0);
            DOWNLOADING = new Status("DOWNLOADING", 1);
            DOWNLOADED = new Status("DOWNLOADED", 2);
            DECODING = new Status("DECODING", 3);
            DECODED = new Status("DECODED", 4);
            ERROR = new Status("ERROR", 5);
            $VALUES = (new Status[] {
                RESET, DOWNLOADING, DOWNLOADED, DECODING, DECODED, ERROR
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    private class DownloadGifTask extends BackgroundTask
    {

        private final Listener _listener;
        private boolean _shouldExit;
        private final String _url;

        private boolean shouldExit()
        {
            return _shouldExit;
        }

        public void cancel()
        {
            _shouldExit = true;
        }

        public void onFinish()
        {
        }

        public void run()
        {
            if (!shouldExit()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            Object obj = ApiHttpClient.cacheGifResponse(_url);
            if (obj == null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = new ByteArrayInputStream(((Response) (obj)).g().e());
            if (shouldExit())
            {
                continue; /* Loop/switch isn't completed */
            }
            _listener.onStatusChanged(Status.DOWNLOADED);
_L4:
            Object obj1;
            if (!shouldExit())
            {
                if (!AppUtils.hasEnoughHeapSpace())
                {
                    System.gc();
                }
                if (AppUtils.hasEnoughHeapSpace() && obj != null)
                {
                    _listener.onStatusChanged(Status.DECODING);
                    obj1 = GifDecoder.instance((new StringBuilder("Cinematic")).append(_url).toString());
                    DiskCache.ensureDirectory("Cinematic");
                    if (BooleanUtils.isFalse(Boolean.valueOf(DiskCache.cacheFileExists(_url, "Cinematic"))) && !((GifDecoder) (obj1)).isStatusOk())
                    {
                        ((GifDecoder) (obj1)).read(((java.io.InputStream) (obj)), _listener);
                    } else
                    {
                        ((GifDecoder) (obj1)).getFirstFrame(_listener);
                    }
                    if (!shouldExit())
                    {
                        _listener.onDecoderReady(((GifDecoder) (obj1)));
                        return;
                    }
                }
            }
            if (true) goto _L1; else goto _L3
            obj1;
            obj = null;
_L5:
            if (shouldExit())
            {
                continue; /* Loop/switch isn't completed */
            }
            _listener.onStatusChanged(Status.ERROR);
            _shouldExit = true;
            PLog.error(((Throwable) (obj1)), "exception occurred", new Object[0]);
              goto _L4
            obj1;
              goto _L5
_L3:
            obj = null;
              goto _L4
        }

        public DownloadGifTask(String s, Listener listener)
        {
            _url = s;
            _listener = listener;
            class Listener
            {

                public abstract void onDecodeFinished(int i);

                public abstract void onDecoderReady(GifDecoder gifdecoder);

                public abstract void onFirstFrameReady(Bitmap bitmap);

                public abstract void onMemoryMappedFinish();

                public abstract void onStatusChanged(Status status);

                public Listener()
                {
                }
            }

            _listener.onStatusChanged(Status.DOWNLOADING);
        }
    }


    private class _cls1 extends DownloadGifTask.Listener
    {

        final PinCinematicDrawable this$0;

        public void onDecodeFinished(int i)
        {
            finalFrameCount = i;
        }

        public void onDecoderReady(GifDecoder gifdecoder)
        {
            _gifDecoder = gifdecoder;
        }

        public void onFirstFrameReady(Bitmap bitmap)
        {
            _image = bitmap;
            _memoryMappingFinish = true;
            invalidateSelf();
        }

        public void onMemoryMappedFinish()
        {
            _memoryMappingFinish = true;
            invalidateSelf();
        }

        public void onStatusChanged(Status status)
        {
            _gifStatus = status;
        }

        _cls1()
        {
            this$0 = PinCinematicDrawable.this;
            super();
        }
    }

}
