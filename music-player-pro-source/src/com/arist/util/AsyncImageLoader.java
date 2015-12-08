// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.yong.jamendo.api.JamendoMusic;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.arist.util:
//            Constant, BitmapService, HttpService

public class AsyncImageLoader
{
    public static interface Callback
    {

        public abstract void imageLoaded(String s, Bitmap bitmap);
    }

    public class ImageLoadTask
    {

        private Bitmap bitmap;
        private Callback callback;
        private String netPath;
        private String savePath;
        final AsyncImageLoader this$0;

        public boolean equals(Object obj)
        {
            obj = (ImageLoadTask)obj;
            return savePath.equals(((ImageLoadTask) (obj)).savePath);
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
            return netPath;
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
            netPath = s;
        }









        public ImageLoadTask()
        {
            this$0 = AsyncImageLoader.this;
            super();
        }
    }


    private HashMap caches;
    private Handler handler;
    private boolean isLoop;
    private ArrayList tasks;
    private Thread workThread;

    public AsyncImageLoader()
    {
        caches = new HashMap();
        handler = new Handler() {

            final AsyncImageLoader this$0;

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
                ((ImageLoadTask) (message)).callback.imageLoaded(((ImageLoadTask) (message)).netPath, ((ImageLoadTask) (message)).bitmap);
            }

            
            {
                this$0 = AsyncImageLoader.this;
                super();
            }
        };
        tasks = new ArrayList();
        isLoop = true;
        workThread = new Thread() {

            final AsyncImageLoader this$0;

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
                        imageloadtask.bitmap = BitmapService.getBitmap(HttpService.getBytes(imageloadtask.netPath, null, 1), 200, 200);
                        Message message = Message.obtain();
                        message.what = 0;
                        message.obj = imageloadtask;
                        handler.sendMessage(message);
                        caches.put(imageloadtask.netPath, new SoftReference(imageloadtask.bitmap));
                        BitmapService.save(imageloadtask.bitmap, imageloadtask.savePath);
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
                this$0 = AsyncImageLoader.this;
                super();
            }
        };
        workThread.start();
    }

    public Bitmap loadImage(JamendoMusic jamendomusic, Callback callback)
    {
        Bitmap bitmap1;
        if (caches.containsKey(jamendomusic.getAlbum_image()))
        {
            Bitmap bitmap = (Bitmap)((SoftReference)caches.get(jamendomusic.getAlbum_image())).get();
            if (bitmap != null)
            {
                return bitmap;
            }
            caches.remove(jamendomusic.getAlbum_image());
        }
        String s = (new StringBuilder(String.valueOf(Constant.BASE_ABLUM_CACHES_PATH))).append(jamendomusic.getMusic_name()).append("-").append(jamendomusic.getAlbum_name()).append(".jpg").toString();
        bitmap1 = BitmapService.getBitmap(s);
        if (bitmap1 != null)
        {
            return bitmap1;
        }
        ImageLoadTask imageloadtask = new ImageLoadTask();
        imageloadtask.netPath = jamendomusic.getAlbum_image();
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
        break MISSING_BLOCK_LABEL_185;
        callback;
        jamendomusic;
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
