// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import com.arist.util.BitmapService;
import com.arist.util.HttpService;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.yong.gift:
//            GiftEntity, GiftActivity

public class AsyncGiftImageLoader
{
    public static interface Callback
    {

        public abstract void imageLoaded(String s, Bitmap bitmap);
    }

    public class ImageLoadTask
    {

        private Bitmap bitmap;
        private Callback callback;
        private String icon_netPath;
        private String savePath;
        final AsyncGiftImageLoader this$0;

        public boolean equals(Object obj)
        {
            obj = (ImageLoadTask)obj;
            return icon_netPath.equals(((ImageLoadTask) (obj)).icon_netPath);
        }

        public String getAlbumID()
        {
            return savePath;
        }

        public Bitmap getBitmap()
        {
            return bitmap;
        }

        public String getPath()
        {
            return icon_netPath;
        }

        public void setAlbumID(String s)
        {
            savePath = s;
        }

        public void setBitmap(Bitmap bitmap1)
        {
            bitmap = bitmap1;
        }

        public void setPath(String s)
        {
            icon_netPath = s;
        }









        public ImageLoadTask()
        {
            this$0 = AsyncGiftImageLoader.this;
            super();
        }
    }


    private HashMap caches;
    private Handler handler;
    private boolean isLoop;
    private ArrayList tasks;
    private Thread workThread;

    public AsyncGiftImageLoader()
    {
        caches = new HashMap();
        handler = new Handler() {

            final AsyncGiftImageLoader this$0;

            public void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    return;

                case 0: // '\0'
                    message = (ImageLoadTask)message.obj;
                    break;
                }
                ((ImageLoadTask) (message)).callback.imageLoaded(((ImageLoadTask) (message)).icon_netPath, ((ImageLoadTask) (message)).bitmap);
            }

            
            {
                this$0 = AsyncGiftImageLoader.this;
                super();
            }
        };
        tasks = new ArrayList();
        isLoop = true;
        workThread = new Thread() {

            final AsyncGiftImageLoader this$0;

            public void run()
            {
_L4:
                if (isLoop) goto _L2; else goto _L1
_L1:
                return;
_L2:
                Object obj;
                while (tasks.size() > 0 && isLoop) 
                {
                    try
                    {
                        ImageLoadTask imageloadtask = (ImageLoadTask)tasks.remove(0);
                        imageloadtask.bitmap = BitmapService.getBitmap(HttpService.getBytes(imageloadtask.icon_netPath, null, 1), 200, 200);
                        Message message = Message.obtain();
                        message.what = 0;
                        message.obj = imageloadtask;
                        handler.sendMessage(message);
                        caches.put(imageloadtask.icon_netPath, new SoftReference(imageloadtask.bitmap));
                        AsyncGiftImageLoader.save(imageloadtask.bitmap, imageloadtask.savePath);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((Exception) (obj)).printStackTrace();
                    }
                }
                if (!isLoop) goto _L1; else goto _L3
_L3:
                this;
                JVM INSTR monitorenter ;
                wait();
_L5:
                this;
                JVM INSTR monitorexit ;
                  goto _L4
                obj;
                this;
                JVM INSTR monitorexit ;
                throw obj;
                obj;
                ((InterruptedException) (obj)).printStackTrace();
                  goto _L5
            }

            
            {
                this$0 = AsyncGiftImageLoader.this;
                super();
            }
        };
        workThread.start();
    }

    public static Bitmap getBitmap(String s)
    {
        return BitmapFactory.decodeFile(s);
    }

    public static void save(Bitmap bitmap, String s)
    {
        s = new File(s);
        if (s.exists())
        {
            return;
        }
        try
        {
            if (!s.getParentFile().exists())
            {
                s.getParentFile().mkdirs();
            }
            if (!s.exists())
            {
                s.createNewFile();
            }
            s = new FileOutputStream(s);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, s);
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
        }
        return;
    }

    public Bitmap loadImage(GiftEntity giftentity, Callback callback)
    {
        Bitmap bitmap1;
        if (caches.containsKey(giftentity.getIcon_imagePath()))
        {
            Bitmap bitmap = (Bitmap)((SoftReference)caches.get(giftentity.getIcon_imagePath())).get();
            if (bitmap != null)
            {
                return bitmap;
            }
            caches.remove(giftentity.getIcon_imagePath());
        }
        String s = (new StringBuilder(String.valueOf(GiftActivity.DOWNLOAD_ICON_PATH))).append(giftentity.getTitle()).append(".png").toString();
        bitmap1 = getBitmap(s);
        if (bitmap1 != null)
        {
            return bitmap1;
        }
        ImageLoadTask imageloadtask = new ImageLoadTask();
        imageloadtask.icon_netPath = giftentity.getIcon_imagePath();
        imageloadtask.savePath = s;
        imageloadtask.callback = callback;
        if (!tasks.contains(imageloadtask))
        {
            tasks.add(imageloadtask);
            synchronized (workThread)
            {
                workThread.notify();
            }
        }
        break MISSING_BLOCK_LABEL_173;
        callback;
        giftentity;
        JVM INSTR monitorexit ;
        throw callback;
        return bitmap1;
    }

    public void quit()
    {
        isLoop = false;
        synchronized (workThread)
        {
            workThread.notify();
        }
        return;
        exception;
        thread;
        JVM INSTR monitorexit ;
        throw exception;
    }




}
