// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.graphics.Bitmap;
import com.pinterest.base.Events;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.log.PLog;
import com.pinterest.reporting.CrashReporting;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import org.apache.commons.io.IOUtils;

// Referenced classes of package com.pinterest.kit.utils:
//            AppUtils

public class GifDecoder
{

    protected static final int MAX_STACK_SIZE = 4096;
    public static final int OFFSET_DATA_COUNT = 12;
    public static final int STATUS_COMPLETE = 3;
    public static final int STATUS_FORMAT_ERROR = 1;
    public static final int STATUS_OK = 0;
    public static final int STATUS_OPEN_ERROR = 2;
    private static GifDecoder _instance;
    private static String cachePath;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    FileChannel _fileChannel;
    private com.pinterest.ui.grid.pin.PinCinematicDrawable.DownloadGifTask.Listener _listener;
    MappedByteBuffer _mappedByteBuffer;
    RandomAccessFile _randomAccessFile;
    protected int act[];
    protected int bgColor;
    protected int bgIndex;
    protected byte block[];
    protected int blockSize;
    protected int delay;
    protected int dispose;
    byte frameBytes[];
    protected int frameCount;
    protected int gct[];
    protected boolean gctFlag;
    protected int gctSize;
    public int height;
    protected int ih;
    protected Bitmap image;
    protected InputStream in;
    protected boolean interlace;
    private boolean isFirstFrameReady;
    protected int iw;
    protected int ix;
    protected int iy;
    protected int lastBgColor;
    protected Bitmap lastBitmap;
    protected int lastDispose;
    protected int lct[];
    protected boolean lctFlag;
    protected int lctSize;
    protected int loopCount;
    protected int lrh;
    protected int lrw;
    protected int lrx;
    protected int lry;
    int offsetData[];
    protected int pixelAspect;
    protected byte pixelStack[];
    protected byte pixels[];
    int position;
    protected short prefix[];
    DownloadFrameTask readFrameTask;
    protected int status;
    protected byte suffix[];
    protected int transIndex;
    protected boolean transparency;
    public int width;

    public GifDecoder(String s)
    {
        isFirstFrameReady = false;
        loopCount = 1;
        block = new byte[256];
        blockSize = 0;
        dispose = 0;
        lastDispose = 0;
        transparency = false;
        delay = 0;
        _eventsSubscriber = new _cls2();
        cachePath = s;
    }

    private int initializeImageData()
    {
        java.io.File file = DiskCache.getDirectoryCacheFile(cachePath, "Cinematic");
        int i;
        _randomAccessFile = new RandomAccessFile(file, "rw");
        _fileChannel = _randomAccessFile.getChannel();
        width = readChannel(_fileChannel, 0L);
        height = readChannel(_fileChannel, 4L);
        frameCount = readChannel(_fileChannel, 8L);
        _mappedByteBuffer = _fileChannel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, 0L, getBufferSize());
        _mappedByteBuffer.rewind();
        i = _mappedByteBuffer.position();
        return i;
        Object obj;
        obj;
        PLog.info((new StringBuilder("Exception while trying to find the file ")).append(com/pinterest/kit/utils/GifDecoder.toString()).toString(), new Object[0]);
_L2:
        return -1;
        obj;
        PLog.info((new StringBuilder("Exception while mapping ")).append(com/pinterest/kit/utils/GifDecoder.toString()).toString(), new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static GifDecoder instance(String s)
    {
        if (_instance == null || !cachePath.equals(s))
        {
            _instance = new GifDecoder(s);
        }
        return _instance;
    }

    private int readChannel(FileChannel filechannel, long l)
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(4);
        int i;
        try
        {
            filechannel.read(bytebuffer, l);
        }
        // Misplaced declaration of an exception variable
        catch (FileChannel filechannel)
        {
            PLog.info((new StringBuilder("Exception while reading the first 12 bytes ")).append(com/pinterest/kit/utils/GifDecoder.toString()).toString(), new Object[0]);
        }
        bytebuffer.rewind();
        i = bytebuffer.getInt();
        bytebuffer.clear();
        return i;
    }

    private void writeFrameToDisk()
    {
        if (frameCount > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (image == null) goto _L1; else goto _L3
_L3:
        long l = (frameCount - 1) * getImageSize();
        ByteBuffer bytebuffer = ByteBuffer.allocate(getImageSize());
        image.copyPixelsToBuffer(bytebuffer);
        bytebuffer.rewind();
        if (_fileChannel.write(bytebuffer, l + 12L) != getImageSize())
        {
            PLog.info("Number of bytes read were not as same as the image size", new Object[0]);
            return;
        }
          goto _L1
        Exception exception;
        exception;
        PLog.info("Exception while writing the frame to Disk", new Object[0]);
        exception.printStackTrace();
        return;
    }

    protected void decodeBitmapData()
    {
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i5;
        int j5;
        int k5;
        i5 = iw * ih;
        if (pixels == null || pixels.length < i5)
        {
            pixels = new byte[i5];
        }
        if (prefix == null)
        {
            prefix = new short[4096];
        }
        if (suffix == null)
        {
            suffix = new byte[4096];
        }
        if (pixelStack == null)
        {
            pixelStack = new byte[4097];
        }
        j5 = read();
        k5 = 1 << j5;
        l1 = k5 + 2;
        j1 = -1;
        k = j5 + 1;
        l = (1 << k) - 1;
        for (int i = 0; i < k5; i++)
        {
            prefix[i] = 0;
            suffix[i] = (byte)i;
        }

        i3 = 0;
        i1 = 0;
        i2 = 0;
        boolean flag = false;
        l3 = 0;
        j3 = 0;
        k1 = 0;
        k3 = 0;
        j = j1;
        j1 = ((flag) ? 1 : 0);
_L2:
        if (l3 >= i5)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_674;
        }
        if (k1 < k)
        {
            int j2 = j3;
            if (j3 == 0)
            {
                j2 = readBlock();
                if (j2 <= 0)
                {
                    break; /* Loop/switch isn't completed */
                }
                k3 = 0;
            }
            j1 += (block[k3] & 0xff) << k1;
            k1 += 8;
            k3++;
            j3 = j2 - 1;
            continue; /* Loop/switch isn't completed */
        }
        int k2 = j1 & l;
        int i4 = j1 >> k;
        k1 -= k;
        if (k2 > l1 || k2 == k5 + 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k2 == k5)
        {
            k = j5 + 1;
            l = (1 << k) - 1;
            l1 = k5 + 2;
            j = -1;
            j1 = i4;
            continue; /* Loop/switch isn't completed */
        }
        if (j == -1)
        {
            pixelStack[i1] = suffix[k2];
            i1++;
            j = k2;
            i2 = k2;
            j1 = i4;
            continue; /* Loop/switch isn't completed */
        }
        int l4;
        if (k2 == l1)
        {
            byte abyte0[] = pixelStack;
            int k4 = i1 + 1;
            abyte0[i1] = (byte)i2;
            j1 = j;
            i1 = k4;
        } else
        {
            j1 = k2;
        }
        while (j1 > k5) 
        {
            pixelStack[i1] = suffix[j1];
            j1 = prefix[j1];
            i1++;
        }
        l4 = suffix[j1] & 0xff;
        if (l1 >= 4096)
        {
            break; /* Loop/switch isn't completed */
        }
        pixelStack[i1] = (byte)l4;
        prefix[l1] = (short)j;
        suffix[l1] = (byte)l4;
        i2 = l1 + 1;
        j = k;
        j1 = l;
        if ((i2 & l) == 0)
        {
            j = k;
            j1 = l;
            if (i2 < 4096)
            {
                j = k + 1;
                j1 = l + i2;
            }
        }
        l = i4;
        l1 = j1;
        j1 = l4;
        i4 = i1 + 1;
        k = i2;
        i1 = l1;
        l1 = j;
        j = k2;
        i2 = i4;
_L3:
        l4 = i2 - 1;
        pixels[i3] = pixelStack[l4];
        l3++;
        i4 = i3 + 1;
        i2 = l1;
        k2 = l;
        i3 = l4;
        l1 = k;
        k = i2;
        l = i1;
        i1 = i3;
        i2 = j1;
        j1 = k2;
        i3 = i4;
        if (true) goto _L2; else goto _L1
_L1:
        for (; i3 < i5; i3++)
        {
            pixels[i3] = 0;
        }

        return;
        int l2 = l;
        l = i2;
        i2 = i1;
        i1 = j1;
        int j4 = l1;
        j1 = l;
        l = i1;
        l1 = k;
        i1 = l2;
        k = j4;
          goto _L3
    }

    protected boolean err()
    {
        return status != 0;
    }

    public Bitmap getBitmapFromMemoryMap(int i)
    {
        int j = getImageSize();
        frameBytes = new byte[getImageSize()];
        if (_mappedByteBuffer != null)
        {
            _mappedByteBuffer.position((i - 1) * j + 12);
            _mappedByteBuffer.get(frameBytes, 0, getImageSize());
            _mappedByteBuffer.rewind();
        }
        if (width > 0 && height > 0)
        {
            Bitmap bitmap = Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
            if (bitmap != null)
            {
                bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(frameBytes));
            }
            return bitmap;
        } else
        {
            CrashReporting.a(new IllegalArgumentException((new StringBuilder("The logical screen width or height is not valid!!! width [")).append(width).append("] height [").append(height).append("] gif url [").append(cachePath).append("]").toString()));
            return null;
        }
    }

    protected long getBufferSize()
    {
        return (long)(frameCount * getImageSize() + 12);
    }

    public Bitmap getConcurrentFrame(int i)
    {
        if (frameCount <= 0 || i < 0)
        {
            return null;
        }
        if (i > frameCount)
        {
            i %= frameCount;
        }
        int j = i;
        if (i == 0)
        {
            j = i + 1;
        }
        return getBitmapFromMemoryMap(j);
    }

    public void getFirstFrame(final com.pinterest.ui.grid.pin.PinCinematicDrawable.DownloadGifTask.Listener listener)
    {
        _listener = listener;
        (new _cls1()).execute();
    }

    protected int getImageSize()
    {
        return width * height * 4;
    }

    protected void init()
    {
        status = 0;
        frameCount = 0;
        gct = null;
        lct = null;
    }

    public boolean isStatusComplete()
    {
        return status == 3;
    }

    public boolean isStatusOk()
    {
        return status == 0;
    }

    public void memoryMapCinematicFile()
    {
        offsetData = (new int[] {
            width, height, frameCount
        });
        _mappedByteBuffer = _fileChannel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, 0L, getBufferSize());
        int i = 0;
_L2:
        if (i >= offsetData.length)
        {
            break; /* Loop/switch isn't completed */
        }
        _mappedByteBuffer.putInt(i * 4, offsetData[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            if (_listener != null && !isFirstFrameReady)
            {
                getFirstFrame(_listener);
            }
            if (_listener != null)
            {
                _listener.onMemoryMappedFinish();
            }
            return;
        }
        catch (IOException ioexception)
        {
            PLog.info("Error while memory mapping the file", new Object[0]);
        }
        return;
    }

    protected int read()
    {
        int i;
        try
        {
            i = in.read();
        }
        catch (Exception exception)
        {
            status = 1;
            return 0;
        }
        return i;
    }

    public int read(InputStream inputstream)
    {
        Events.register(_eventsSubscriber, com/pinterest/kit/utils/GifDecoder$CancelGifDecodeTaskEvent, new Class[0]);
        init();
        readFrameTask = new DownloadFrameTask(inputstream);
        readFrameTask.execute();
        return status;
    }

    public int read(InputStream inputstream, com.pinterest.ui.grid.pin.PinCinematicDrawable.DownloadGifTask.Listener listener)
    {
        _listener = listener;
        init();
        readFrameTask = new DownloadFrameTask(inputstream);
        readFrameTask.execute();
        return status;
    }

    protected void readBitmap()
    {
        int j = 0;
        ix = readShort();
        iy = readShort();
        iw = readShort();
        ih = readShort();
        int i = read();
        boolean flag;
        if ((i & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lctFlag = flag;
        lctSize = (int)Math.pow(2D, (i & 7) + 1);
        if ((i & 0x40) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        interlace = flag;
        if (lctFlag)
        {
            lct = readColorTable(lctSize);
            act = lct;
        } else
        {
            act = gct;
            if (bgIndex == transIndex)
            {
                bgColor = 0;
            }
        }
        Object obj;
        Object obj1;
        if (transparency)
        {
            i = act[transIndex];
            act[transIndex] = 0;
        } else
        {
            i = 0;
        }
        if (act == null)
        {
            status = 1;
        }
        if (!err()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        decodeBitmapData();
        skip();
        if (err()) goto _L1; else goto _L3
_L3:
        frameCount = frameCount + 1;
        try
        {
            System.gc();
            obj = Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            PLog.wtf(((Throwable) (obj1)), "Failed to create a bitmap", new Object[0]);
            obj1 = null;
        }
        if (obj == null || !AppUtils.hasEnoughHeapSpace()) goto _L1; else goto _L4
_L4:
        setPixels(((Bitmap) (obj)));
        if (image == null || frameCount != 1)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        _randomAccessFile = new RandomAccessFile(DiskCache.getDirectoryCacheFile(cachePath, "Cinematic"), "rw");
        _fileChannel = _randomAccessFile.getChannel();
        obj = ByteBuffer.allocate(4);
        ((ByteBuffer) (obj)).putInt(0xaabbccdd);
_L6:
        if (j >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        _fileChannel.write(((ByteBuffer) (obj)), j * 4);
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        try
        {
            if (_listener != null)
            {
                _listener.onFirstFrameReady(image);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((Exception) (obj1)).printStackTrace();
        }
        writeFrameToDisk();
        if (transparency)
        {
            act[transIndex] = i;
        }
        resetFrame();
        return;
    }

    protected int readBlock()
    {
        int i;
        i = 0;
        blockSize = read();
        if (blockSize <= 0)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        i = 0;
_L2:
        int j;
        if (i >= blockSize)
        {
            break; /* Loop/switch isn't completed */
        }
        j = in.read(block, i, blockSize - i);
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        i += j;
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        PLog.error(exception, "exception occurred", new Object[0]);
_L1:
        if (i < blockSize)
        {
            status = 1;
        }
        return i;
    }

    protected int[] readColorTable(int i)
    {
        int ai[];
        byte abyte0[];
        int l;
        l = 0;
        int i1 = i * 3;
        ai = null;
        abyte0 = new byte[i1];
        int j;
        try
        {
            j = in.read(abyte0);
        }
        catch (Exception exception)
        {
            PLog.error(exception, "exception occurred", new Object[0]);
            j = 0;
        }
        if (j >= i1) goto _L2; else goto _L1
_L1:
        status = 1;
_L4:
        return ai;
_L2:
        int ai1[] = new int[256];
        int k = 0;
        do
        {
            ai = ai1;
            if (k >= i)
            {
                continue;
            }
            int j1 = l + 1;
            byte byte0 = abyte0[l];
            l = j1 + 1;
            ai1[k] = (byte0 & 0xff) << 16 | 0xff000000 | (abyte0[j1] & 0xff) << 8 | abyte0[l] & 0xff;
            k++;
            l++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void readContents()
    {
        boolean flag = false;
        do
        {
            if (flag || err() || readFrameTask == null)
            {
                break;
            }
            switch (read())
            {
            default:
                status = 1;
                break;

            case 44: // ','
                readBitmap();
                break;

            case 33: // '!'
                switch (read())
                {
                default:
                    skip();
                    break;

                case 249: 
                    readGraphicControlExt();
                    break;

                case 255: 
                    readBlock();
                    skip();
                    break;

                case 254: 
                    skip();
                    break;

                case 1: // '\001'
                    skip();
                    break;
                }
                break;

            case 59: // ';'
                status = 3;
                if (_listener != null)
                {
                    _listener.onDecodeFinished(frameCount);
                }
                IOUtils.closeQuietly(in);
                memoryMapCinematicFile();
                Events.unregister(_eventsSubscriber);
                flag = true;
                break;
            }
        } while (true);
    }

    protected void readGraphicControlExt()
    {
        boolean flag = true;
        read();
        int i = read();
        dispose = (i & 0x1c) >> 2;
        if (dispose == 0)
        {
            dispose = 1;
        }
        if ((i & 1) == 0)
        {
            flag = false;
        }
        transparency = flag;
        delay = readShort() * 10;
        transIndex = read();
        read();
    }

    protected void readHeader()
    {
        String s = "";
        for (int i = 0; i < 6; i++)
        {
            s = (new StringBuilder()).append(s).append((char)read()).toString();
        }

        if (!s.startsWith("GIF"))
        {
            status = 1;
        } else
        {
            readLSD();
            if (gctFlag && !err())
            {
                gct = readColorTable(gctSize);
                bgColor = gct[bgIndex];
                return;
            }
        }
    }

    protected void readLSD()
    {
        width = readShort();
        height = readShort();
        int i = read();
        boolean flag;
        if ((i & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gctFlag = flag;
        gctSize = 2 << (i & 7);
        bgIndex = read();
        pixelAspect = read();
    }

    protected void readNetscapeExt()
    {
        do
        {
            readBlock();
            if (block[0] == 1)
            {
                loopCount = block[1] & 0xff | (block[2] & 0xff) << 8;
            }
        } while (blockSize > 0 && !err());
    }

    protected int readShort()
    {
        return read() | read() << 8;
    }

    protected void resetFrame()
    {
        lastDispose = dispose;
        lrx = ix;
        lry = iy;
        lrw = iw;
        lrh = ih;
        lastBitmap = image;
        lastBgColor = bgColor;
        dispose = 0;
        transparency = false;
        delay = 0;
        lct = null;
    }

    protected void setPixels(Bitmap bitmap)
    {
        int j1;
        int l1;
        int j2;
        int k2;
        image = bitmap;
        bitmap = new int[width * height];
        if (lastDispose > 0)
        {
            if (lastDispose == 3)
            {
                int i = frameCount - 2;
                int k;
                int k1;
                int i2;
                if (i > 0)
                {
                    lastBitmap = getConcurrentFrame(i - 1);
                } else
                {
                    lastBitmap = null;
                }
            }
            if (lastBitmap != null)
            {
                lastBitmap.getPixels(bitmap, 0, width, 0, 0, width, height);
                if (lastDispose == 2)
                {
                    k = 0;
                    if (!transparency)
                    {
                        k = lastBgColor;
                    }
                    for (int i1 = 0; i1 < lrh; i1++)
                    {
                        k1 = (lry + i1) * width + lrx;
                        i2 = lrw;
                        for (i = k1; i < i2 + k1; i++)
                        {
                            bitmap[i] = k;
                        }

                    }

                }
            }
        }
        j2 = 1;
        l1 = 8;
        k2 = 0;
        j1 = 0;
_L10:
        if (j1 >= ih) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        int l2;
        if (!interlace)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        j = k2;
        l = l1;
        l2 = j2;
        if (k2 < ih) goto _L4; else goto _L3
_L3:
        l2 = j2 + 1;
        l2;
        JVM INSTR tableswitch 2 4: default 264
    //                   2 406
    //                   3 414
    //                   4 421;
           goto _L5 _L6 _L7 _L8
_L5:
        l = l1;
        j = k2;
_L4:
        k2 = j + l;
        j2 = l2;
          goto _L9
_L6:
        j = 4;
        l = l1;
          goto _L4
_L7:
        j = 2;
        l = 4;
          goto _L4
_L8:
        j = 1;
        l = 2;
          goto _L4
_L9:
        j += iy;
        if (j < height)
        {
            int j3 = j * width;
            int i3 = j3 + ix;
            l1 = iw + i3;
            j = l1;
            if (width + j3 < l1)
            {
                j = width + j3;
            }
            for (l1 = iw * j1; i3 < j; l1++)
            {
                int k3 = pixels[l1];
                k3 = act[k3 & 0xff];
                if (k3 != 0)
                {
                    bitmap[i3] = k3;
                }
                i3++;
            }

        }
        j1++;
        l1 = l;
          goto _L10
_L2:
        image.setPixels(bitmap, 0, width, 0, 0, width, height);
        return;
        j = j1;
        l = l1;
          goto _L9
    }

    protected void skip()
    {
        do
        {
            readBlock();
        } while (blockSize > 0 && !err());
    }



/*
    static boolean access$102(GifDecoder gifdecoder, boolean flag)
    {
        gifdecoder.isFirstFrameReady = flag;
        return flag;
    }

*/


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final GifDecoder this$0;

        public void onEventMainThread(CancelGifDecodeTaskEvent cancelgifdecodetaskevent)
        {
            if (readFrameTask != null)
            {
                readFrameTask = null;
            }
            Events.unregister(_eventsSubscriber, new Class[] {
                com/pinterest/kit/utils/GifDecoder$CancelGifDecodeTaskEvent
            });
        }

        _cls2()
        {
            this$0 = GifDecoder.this;
            super();
        }
    }


    private class _cls1 extends BackgroundTask
    {

        final GifDecoder this$0;
        final com.pinterest.ui.grid.pin.PinCinematicDrawable.DownloadGifTask.Listener val$listener;

        public void onFinish()
        {
            if (position != 0)
            {
                return;
            } else
            {
                Bitmap bitmap = getBitmapFromMemoryMap(1);
                listener.onFirstFrameReady(bitmap);
                isFirstFrameReady = true;
                return;
            }
        }

        public void run()
        {
            if (isStatusComplete())
            {
                position = initializeImageData();
            }
        }

        _cls1()
        {
            this$0 = GifDecoder.this;
            listener = listener1;
            super();
        }
    }


    private class DownloadFrameTask extends BackgroundTask
    {

        private InputStream _inputStream;
        final GifDecoder this$0;

        public void onFinish()
        {
            super.onFinish();
        }

        public void run()
        {
            Process.setThreadPriority(19);
            in = _inputStream;
            if (_inputStream != null)
            {
                readHeader();
                if (!err() && AppUtils.hasEnoughHeapSpace())
                {
                    readContents();
                    if (frameCount < 0)
                    {
                        status = 1;
                    }
                }
            } else
            {
                status = 2;
            }
            try
            {
                IOUtils.closeQuietly(_inputStream);
                return;
            }
            catch (Exception exception)
            {
                PLog.error(exception, "exception occurred", new Object[0]);
            }
        }

        public DownloadFrameTask(InputStream inputstream)
        {
            this$0 = GifDecoder.this;
            super();
            _inputStream = inputstream;
        }
    }

}
