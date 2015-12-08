// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaScannerConnection;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;

// Referenced classes of package com.millennialmedia.android:
//            MMJSObject, MMLog, MMJSResponse, MMSDK, 
//            AdCache, MMBaseActivity

class BridgeMMMedia extends MMJSObject
{
    static class Audio
        implements android.media.MediaPlayer.OnCompletionListener
    {

        private static final int MAX_SOUNDS = 4;
        private static Audio sharedInstance;
        private OnLoadCompleteListener completionListener;
        CopyOnWriteArrayList completionListeners;
        private WeakReference contextRef;
        private MediaPlayer mediaPlayer;
        CopyOnWriteArrayList periodicListeners;
        Runnable periodicUpdater = new _cls1();
        private SoundPool soundPool;

        static Audio sharedAudio(Context context)
        {
            com/millennialmedia/android/BridgeMMMedia$Audio;
            JVM INSTR monitorenter ;
            if (sharedInstance == null)
            {
                sharedInstance = new Audio(context);
            }
            context = sharedInstance;
            com/millennialmedia/android/BridgeMMMedia$Audio;
            JVM INSTR monitorexit ;
            return context;
            context;
            throw context;
        }

        boolean addCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
        {
            if (completionListeners == null)
            {
                completionListeners = new CopyOnWriteArrayList();
            }
            if (!completionListeners.contains(oncompletionlistener))
            {
                return completionListeners.add(oncompletionlistener);
            } else
            {
                return false;
            }
        }

        boolean addPeriodicListener(PeriodicListener periodiclistener)
        {
            if (periodicListeners == null)
            {
                periodicListeners = new CopyOnWriteArrayList();
            }
            if (!periodicListeners.contains(periodiclistener))
            {
                return periodicListeners.add(periodiclistener);
            } else
            {
                return false;
            }
        }

        boolean isPlaying()
        {
            this;
            JVM INSTR monitorenter ;
            if (mediaPlayer == null) goto _L2; else goto _L1
_L1:
            boolean flag = mediaPlayer.isPlaying();
            if (!flag) goto _L2; else goto _L3
_L3:
            flag = true;
_L5:
            this;
            JVM INSTR monitorexit ;
            return flag;
_L2:
            flag = false;
            if (true) goto _L5; else goto _L4
_L4:
            Exception exception;
            exception;
            throw exception;
        }

        public void onCompletion(MediaPlayer mediaplayer)
        {
            this;
            JVM INSTR monitorenter ;
            if (completionListeners != null)
            {
                for (mediaplayer = completionListeners.iterator(); mediaplayer.hasNext(); ((android.media.MediaPlayer.OnCompletionListener)mediaplayer.next()).onCompletion(mediaPlayer)) { }
            }
            break MISSING_BLOCK_LABEL_52;
            mediaplayer;
            throw mediaplayer;
            if (mediaPlayer != null)
            {
                mediaPlayer.release();
                mediaPlayer = null;
            }
            this;
            JVM INSTR monitorexit ;
        }

        MMJSResponse playAudio(Uri uri, boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            if (mediaPlayer != null)
            {
                mediaPlayer.release();
                mediaPlayer = null;
            }
            mediaPlayer = MediaPlayer.create((Context)contextRef.get(), uri);
            mediaPlayer.setLooping(flag);
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(this);
            MMSDK.runOnUiThread(periodicUpdater);
_L1:
            uri = MMJSResponse.responseWithSuccess("Audio playback started");
            this;
            JVM INSTR monitorexit ;
            return uri;
            uri;
            MMLog.e("BridgeMMMedia", "Exception in playAudio method", uri.getCause());
              goto _L1
            uri;
            throw uri;
        }

        MMJSResponse playSound(File file)
        {
            this;
            JVM INSTR monitorenter ;
            try
            {
                if (soundPool == null)
                {
                    soundPool = new SoundPool(4, 3, 0);
                    completionListener = new Audio.OnLoadCompleteListener(soundPool) {

                        final Audio this$0;

                        public void onLoadComplete(SoundPool soundpool, int i, int j)
                        {
                            this;
                            JVM INSTR monitorenter ;
                            if (soundpool == null)
                            {
                                break MISSING_BLOCK_LABEL_70;
                            }
                            Object obj = (Context)contextRef.get();
                            if (obj == null)
                            {
                                break MISSING_BLOCK_LABEL_70;
                            }
                            obj = (AudioManager)((Context) (obj)).getSystemService("audio");
                            float f = ((float)((AudioManager) (obj)).getStreamVolume(3) + 0.0F) / (float)((AudioManager) (obj)).getStreamMaxVolume(3);
                            soundpool.play(i, f, f, 1, 0, 1.0F);
                            this;
                            JVM INSTR monitorexit ;
                            return;
                            soundpool;
                            throw soundpool;
                        }

            
            {
                this$0 = Audio.this;
                super(soundpool);
            }
                    };
                }
                completionListener.testSample(soundPool.load(file.getAbsolutePath(), 1));
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            file = MMJSResponse.responseWithSuccess("Sound playback started");
            this;
            JVM INSTR monitorexit ;
            return file;
            file;
            throw file;
        }

        boolean removeCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
        {
            if (completionListeners != null)
            {
                return completionListeners.remove(oncompletionlistener);
            } else
            {
                return false;
            }
        }

        boolean removePeriodicListener(PeriodicListener periodiclistener)
        {
            if (periodicListeners != null)
            {
                return periodicListeners.remove(periodiclistener);
            } else
            {
                return false;
            }
        }

        MMJSResponse stop()
        {
            this;
            JVM INSTR monitorenter ;
            MMJSResponse mmjsresponse;
            if (mediaPlayer != null)
            {
                onCompletion(mediaPlayer);
            }
            if (soundPool != null)
            {
                soundPool.release();
                soundPool = null;
            }
            if (completionListener != null)
            {
                completionListener.release();
                completionListener = null;
            }
            mmjsresponse = MMJSResponse.responseWithSuccess("Audio stopped");
            this;
            JVM INSTR monitorexit ;
            return mmjsresponse;
            Exception exception;
            exception;
            throw exception;
        }



        private Audio()
        {
        }

        private Audio(Context context)
        {
            contextRef = new WeakReference(context.getApplicationContext());
        }
    }

    private abstract class Audio.OnLoadCompleteListener
    {

        private static final int TEST_PERIOD_MS = 100;
        private ArrayList sampleIds;
        private SoundPool soundPool;
        final Audio this$0;
        private Timer timer;

        abstract void onLoadComplete(SoundPool soundpool, int i, int j);

        void release()
        {
            this;
            JVM INSTR monitorenter ;
            if (timer != null)
            {
                timer.cancel();
                timer.purge();
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        void testSample(int i)
        {
            this;
            JVM INSTR monitorenter ;
            sampleIds.add(Integer.valueOf(i));
            if (sampleIds.size() == 1)
            {
                timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {

                    final Audio.OnLoadCompleteListener this$1;

                    public void run()
                    {
                        ArrayList arraylist = new ArrayList();
                        Iterator iterator = sampleIds.iterator();
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                break;
                            }
                            Integer integer = (Integer)iterator.next();
                            int i = soundPool.play(integer.intValue(), 0.0F, 0.0F, 0, 0, 1.0F);
                            if (i != 0)
                            {
                                soundPool.stop(i);
                                onLoadComplete(soundPool, integer.intValue(), 0);
                                arraylist.add(integer);
                            }
                        } while (true);
                        sampleIds.removeAll(arraylist);
                        if (sampleIds.size() == 0)
                        {
                            timer.cancel();
                            timer.purge();
                        }
                    }

            
            {
                this$1 = Audio.OnLoadCompleteListener.this;
                super();
            }
                }, 0L, 100L);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }




        public Audio.OnLoadCompleteListener(SoundPool soundpool)
        {
            this$0 = Audio.this;
            super();
            sampleIds = new ArrayList();
            soundPool = soundpool;
        }
    }

    static interface Audio.PeriodicListener
    {

        public abstract void onUpdate(int i);
    }

    static class PickerActivity extends MMBaseActivity
    {

        private Uri fileUri;
        boolean hasRequestedPic;

        protected void onActivityResult(int i, int j, Intent intent)
        {
            super.onActivityResult(i, j, intent);
            if (intent == null) goto _L2; else goto _L1
_L1:
            Object obj;
            Object obj3;
            Object obj4;
            Object obj5;
            File file;
            Object obj6;
            Object obj7;
            obj6 = null;
            obj5 = null;
            obj = null;
            obj4 = null;
            obj7 = null;
            obj3 = null;
            file = null;
            Object obj2 = intent.getData();
            if (obj2 != null) goto _L4; else goto _L3
_L3:
            if (intent.getExtras() == null) goto _L2; else goto _L5
_L5:
            obj3 = (Bitmap)intent.getExtras().get("data");
            intent = obj;
            obj2 = new File(getIntent().getData().getPath());
            intent = obj;
            obj4 = new ByteArrayOutputStream();
            intent = obj;
            ((Bitmap) (obj3)).compress(android.graphics.Bitmap.CompressFormat.PNG, 0, ((OutputStream) (obj4)));
            intent = obj;
            obj3 = new ByteArrayInputStream(((ByteArrayOutputStream) (obj4)).toByteArray());
            intent = obj;
            obj1 = new FileOutputStream(((File) (obj2)));
            intent = new byte[1024];
_L8:
            i = ((ByteArrayInputStream) (obj3)).read(intent);
            if (i <= 0) goto _L7; else goto _L6
_L6:
            ((OutputStream) (obj1)).write(intent, 0, i);
              goto _L8
            obj2;
_L35:
            intent = ((Intent) (obj1));
            MMLog.e("BridgeMMMedia", "Problem getting bitmap from data", ((Throwable) (obj2)));
            if (true) goto _L10; else goto _L9
_L9:
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
              goto _L11
_L10:
            if (obj1 == null) goto _L2; else goto _L12
_L12:
            ((OutputStream) (obj1)).close();
_L2:
            synchronized (BridgeMMMedia.pickerActivityObject)
            {
                BridgeMMMedia.pickerActivityObject.notify();
            }
            finish();
            return;
_L7:
            if (false)
            {
                try
                {
                    throw new NullPointerException();
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent) { }
                break MISSING_BLOCK_LABEL_253;
            }
            if (obj1 == null) goto _L2; else goto _L13
_L13:
            ((OutputStream) (obj1)).close();
              goto _L2
            MMLog.e("BridgeMMMedia", "Error closing file", intent);
              goto _L2
_L11:
            MMLog.e("BridgeMMMedia", "Error closing file", intent);
              goto _L2
_L14:
            MMLog.e("BridgeMMMedia", "Error with picture: ", intent);
              goto _L2
            obj2;
            obj1 = intent;
            intent = ((Intent) (obj2));
_L33:
            if (false)
            {
                try
                {
                    throw new NullPointerException();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
                break MISSING_BLOCK_LABEL_322;
            }
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_318;
            }
            ((OutputStream) (obj1)).close();
_L15:
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
              goto _L14
            MMLog.e("BridgeMMMedia", "Error closing file", ((Throwable) (obj1)));
              goto _L15
_L4:
            if (obj2 == null) goto _L2; else goto _L16
_L16:
            intent = getContentResolver();
            if (intent == null) goto _L2; else goto _L17
_L17:
            obj1 = intent.query(((Uri) (obj2)), new String[] {
                "_data"
            }, null, null, null);
            if (obj1 == null) goto _L2; else goto _L18
_L18:
            i = ((Cursor) (obj1)).getColumnIndex("_data");
            if (i == -1) goto _L2; else goto _L19
_L19:
            ((Cursor) (obj1)).moveToFirst();
            intent = new File(((Cursor) (obj1)).getString(i));
            ((Cursor) (obj1)).close();
            obj1 = obj6;
            obj2 = obj7;
            file = new File(getIntent().getData().getPath());
            obj1 = obj6;
            obj2 = obj7;
            intent = new FileInputStream(intent);
            obj1 = new FileOutputStream(file);
            obj2 = new byte[1024];
_L22:
            i = intent.read(((byte []) (obj2)));
            if (i <= 0) goto _L21; else goto _L20
_L20:
            ((OutputStream) (obj1)).write(((byte []) (obj2)), 0, i);
              goto _L22
            obj3;
            obj4 = obj1;
_L32:
            obj1 = intent;
            obj2 = obj4;
            MMLog.e("BridgeMMMedia", "Error copying image", ((Throwable) (obj3)));
            if (intent == null) goto _L24; else goto _L23
_L23:
            intent.close();
_L24:
            if (obj4 == null) goto _L2; else goto _L25
_L25:
            ((OutputStream) (obj4)).close();
              goto _L2
            intent;
            MMLog.e("BridgeMMMedia", "Error closing file", intent);
              goto _L2
_L21:
            if (intent == null) goto _L27; else goto _L26
_L26:
            intent.close();
_L27:
            if (obj1 == null) goto _L2; else goto _L28
_L28:
            ((OutputStream) (obj1)).close();
              goto _L2
            intent;
            MMLog.e("BridgeMMMedia", "Error closing file", intent);
              goto _L2
            intent;
_L31:
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_603;
            }
            ((InputStream) (obj1)).close();
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_613;
            }
            ((OutputStream) (obj2)).close();
_L30:
            throw intent;
            obj1;
            MMLog.e("BridgeMMMedia", "Error closing file", ((Throwable) (obj1)));
            if (true) goto _L30; else goto _L29
_L29:
            obj1;
            intent;
            JVM INSTR monitorexit ;
            throw obj1;
            intent;
              goto _L14
            intent;
              goto _L14
            obj2;
            obj1 = intent;
            intent = ((Intent) (obj2));
            obj2 = obj3;
              goto _L31
            obj3;
            obj2 = obj1;
            obj1 = intent;
            intent = ((Intent) (obj3));
              goto _L31
            obj3;
            intent = obj5;
              goto _L32
            obj3;
              goto _L32
            intent;
              goto _L33
            obj2;
            obj1 = file;
            if (true) goto _L35; else goto _L34
_L34:
        }

        public void onCreate(Bundle bundle)
        {
label0:
            {
                super.onCreate(bundle);
                if (getLastNonConfigurationInstance() != null)
                {
                    hasRequestedPic = ((Bundle)getLastNonConfigurationInstance()).getBoolean("hasRequestedPic");
                }
                if (!hasRequestedPic)
                {
                    if (!getIntent().getStringExtra("type").equalsIgnoreCase("Camera"))
                    {
                        break label0;
                    }
                    bundle = new Intent("android.media.action.IMAGE_CAPTURE");
                    fileUri = getIntent().getData();
                    bundle.putExtra("return-data", true);
                    hasRequestedPic = true;
                    startActivityForResult(bundle, 0);
                }
                return;
            }
            bundle = new Intent();
            bundle.setType("image/*");
            bundle.setAction("android.intent.action.GET_CONTENT");
            hasRequestedPic = true;
            startActivityForResult(bundle, 0);
        }

        public Object onRetainNonConfigurationInstance()
        {
            super.onRetainNonConfigurationInstance();
            Bundle bundle = new Bundle();
            bundle.putBoolean("hasRequestedPic", hasRequestedPic);
            return bundle;
        }

        PickerActivity()
        {
            hasRequestedPic = false;
        }
    }


    private static final String PATH = "path";
    private static final String TAG = "BridgeMMMedia";
    private static Object pickerActivityObject;
    private String AVAILABLE_SOURCE_TYPES;
    private String GET_DEVICE_VOLUME;
    private String GET_PICTURE;
    private String IS_SOURCE_TYPE_AVAILABLE;
    private String PLAY_AUDIO;
    private String PLAY_SOUND;
    private String PLAY_VIDEO;
    private String STOP_AUDIO;
    private String WRITE_TO_PHOTO_LIBRARY;
    MediaScannerConnection mediaScanner;

    BridgeMMMedia()
    {
        IS_SOURCE_TYPE_AVAILABLE = "isSourceTypeAvailable";
        AVAILABLE_SOURCE_TYPES = "availableSourceTypes";
        GET_PICTURE = "getPicture";
        WRITE_TO_PHOTO_LIBRARY = "writeToPhotoLibrary";
        PLAY_VIDEO = "playVideo";
        STOP_AUDIO = "stopAudio";
        GET_DEVICE_VOLUME = "getDeviceVolume";
        PLAY_AUDIO = "playAudio";
        PLAY_SOUND = "playSound";
    }

    private static Bitmap centerOfImage(Bitmap bitmap, int i, int j)
    {
        float f = (bitmap.getWidth() - i) / 2;
        float f1 = (bitmap.getHeight() - j) / 2;
        return cropImage(bitmap, (int)f, (int)f1, i, j);
    }

    private static Bitmap cropImage(Bitmap bitmap, int i, int j, int k, int l)
    {
        return Bitmap.createBitmap(bitmap, i, j, k, l);
    }

    private boolean isCameraAvailable()
    {
        boolean flag1 = false;
        Context context = (Context)contextRef.get();
        boolean flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (context.getPackageManager().checkPermission("android.permission.CAMERA", context.getPackageName()) == 0)
            {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                flag = flag1;
                if (context.getPackageManager().queryIntentActivities(intent, 0x10000).size() > 0)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private boolean isPictureChooserAvailable()
    {
        boolean flag1 = false;
        Context context = (Context)contextRef.get();
        boolean flag = flag1;
        if (context != null)
        {
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            flag = flag1;
            if (context.getPackageManager().queryIntentActivities(intent, 0x10000).size() > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    private static Bitmap resizeImage(Bitmap bitmap, int i, int j, int k)
    {
        return Bitmap.createScaledBitmap(bitmap, i, j, true);
    }

    static Bitmap resizeImage(Bitmap bitmap, String s, int i, int j, int k)
    {
        float f = (float)i / (float)bitmap.getWidth();
        float f1 = (float)j / (float)bitmap.getHeight();
        if (s.equals("Center"))
        {
            return centerOfImage(bitmap, i, j);
        }
        if (s.equals("ScaleToAspectFit"))
        {
            f = Math.min(f, f1);
            return resizeImage(bitmap, (int)((float)bitmap.getWidth() * f), (int)((float)bitmap.getHeight() * f), k);
        }
        if (s.equals("ScaleToAspectFill"))
        {
            f = Math.max(f, f1);
            return cropImage(resizeImage(bitmap, (int)((float)bitmap.getWidth() * f), (int)((float)bitmap.getHeight() * f), k), 0, 0, i, j);
        } else
        {
            return resizeImage(bitmap, i, j, k);
        }
    }

    private static final byte[] scaleBitmapToBytes(File file, int i, int j, String s)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj1 = null;
        obj6 = null;
        obj2 = null;
        obj5 = null;
        obj3 = null;
        obj4 = null;
        Object obj = new FileInputStream(file);
        int l;
        int i1;
        obj1 = new android.graphics.BitmapFactory.Options();
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(((InputStream) (obj)), null, ((android.graphics.BitmapFactory.Options) (obj1)));
        l = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        i1 = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        int k = 1;
        if (l <= j && i1 <= i) goto _L2; else goto _L1
_L1:
        if (i1 <= l) goto _L4; else goto _L3
_L3:
        k = Math.round((float)l / (float)j);
_L2:
        file = new FileInputStream(file);
        obj1.inJustDecodeBounds = false;
        obj1.inSampleSize = k;
        obj1 = BitmapFactory.decodeStream(file, null, ((android.graphics.BitmapFactory.Options) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        ((FileInputStream) (obj)).close();
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        file.close();
        obj = obj1;
_L10:
        file = null;
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj3 = resizeImage(((Bitmap) (obj)), s, i, j, 1);
        file = null;
        obj2 = null;
        obj1 = new ByteArrayOutputStream();
        if (!s.equals("")) goto _L8; else goto _L7
_L7:
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, ((OutputStream) (obj1)));
_L12:
        s = ((ByteArrayOutputStream) (obj1)).toByteArray();
        float f;
        if (obj != null)
        {
            try
            {
                ((Bitmap) (obj)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                MMLog.e("BridgeMMMedia", "Error closing file", file);
                return s;
            }
        }
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        ((Bitmap) (obj3)).recycle();
        file = s;
        if (obj1 == null) goto _L6; else goto _L9
_L9:
        ((ByteArrayOutputStream) (obj1)).close();
        file = s;
_L6:
        return file;
_L4:
        f = (float)i1 / (float)i;
        k = Math.round(f);
          goto _L2
        file;
        MMLog.e("BridgeMMMedia", "Error closing file", file);
        obj = obj1;
          goto _L10
        obj;
        file = obj6;
_L18:
        obj1 = file;
        obj2 = obj3;
        MMLog.e("BridgeMMMedia", "Can't find file to scale bitmap", ((Throwable) (obj)));
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        file.close();
        obj = obj4;
        if (obj3 == null) goto _L10; else goto _L11
_L11:
        ((FileInputStream) (obj3)).close();
        obj = obj4;
          goto _L10
        file;
        MMLog.e("BridgeMMMedia", "Error closing file", file);
        obj = obj4;
          goto _L10
        file;
_L17:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        ((FileInputStream) (obj1)).close();
        if (obj2 != null)
        {
            try
            {
                ((FileInputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                MMLog.e("BridgeMMMedia", "Error closing file", s);
            }
        }
        throw file;
_L8:
        ((Bitmap) (obj3)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, ((OutputStream) (obj1)));
          goto _L12
        file;
        s = ((String) (obj1));
        obj1 = file;
_L16:
        obj2 = null;
        file = s;
        MMLog.e("BridgeMMMedia", "Error scaling bitmap", ((Throwable) (obj1)));
        if (obj != null)
        {
            try
            {
                ((Bitmap) (obj)).recycle();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                MMLog.e("BridgeMMMedia", "Error closing file", file);
                return null;
            }
        }
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        ((Bitmap) (obj3)).recycle();
        file = ((File) (obj2));
        if (s == null) goto _L6; else goto _L13
_L13:
        s.close();
        return null;
        s;
_L15:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_493;
        }
        ((Bitmap) (obj)).recycle();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_503;
        }
        ((Bitmap) (obj3)).recycle();
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                MMLog.e("BridgeMMMedia", "Error closing file", file);
            }
        }
        throw s;
        s;
        file = ((File) (obj1));
        if (true) goto _L15; else goto _L14
_L14:
        obj1;
        s = ((String) (obj2));
          goto _L16
        file;
        obj1 = obj;
        obj2 = obj5;
          goto _L17
        s;
        obj1 = obj;
        obj2 = file;
        file = s;
          goto _L17
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        file = ((File) (obj));
        obj = filenotfoundexception;
          goto _L18
        filenotfoundexception;
        obj3 = file;
        file = ((File) (obj));
        obj = filenotfoundexception;
          goto _L18
    }

    private void scanMedia(final String path)
    {
        Context context = (Context)contextRef.get();
        if (context != null)
        {
            mediaScanner = new MediaScannerConnection(context.getApplicationContext(), new android.media.MediaScannerConnection.MediaScannerConnectionClient() {

                final BridgeMMMedia this$0;
                final String val$path;

                public void onMediaScannerConnected()
                {
                    if (mediaScanner != null)
                    {
                        mediaScanner.scanFile(path, null);
                    }
                }

                public void onScanCompleted(String s, Uri uri)
                {
                    if (uri == null)
                    {
                        MMLog.d("BridgeMMMedia", (new StringBuilder()).append("Failed to scan ").append(s).toString());
                    }
                    mediaScanner.disconnect();
                }

            
            {
                this$0 = BridgeMMMedia.this;
                path = s;
                super();
            }
            });
            if (mediaScanner != null)
            {
                mediaScanner.connect();
            }
        }
    }

    public MMJSResponse availableSourceTypes(Map map)
    {
        map = new JSONArray();
        if (isCameraAvailable())
        {
            map.put("Camera");
        }
        if (isPictureChooserAvailable())
        {
            map.put("Photo Library");
        }
        MMJSResponse mmjsresponse = new MMJSResponse();
        mmjsresponse.result = 1;
        mmjsresponse.response = map;
        return mmjsresponse;
    }

    MMJSResponse executeCommand(String s, Map map)
    {
        MMJSResponse mmjsresponse = null;
        if (IS_SOURCE_TYPE_AVAILABLE.equals(s))
        {
            mmjsresponse = isSourceTypeAvailable(map);
        } else
        {
            if (AVAILABLE_SOURCE_TYPES.equals(s))
            {
                return availableSourceTypes(map);
            }
            if (GET_PICTURE.equals(s))
            {
                return getPicture(map);
            }
            if (WRITE_TO_PHOTO_LIBRARY.equals(s))
            {
                return writeToPhotoLibrary(map);
            }
            if (PLAY_VIDEO.equals(s))
            {
                return playVideo(map);
            }
            if (STOP_AUDIO.equals(s))
            {
                return stopAudio(map);
            }
            if (GET_DEVICE_VOLUME.equals(s))
            {
                return getDeviceVolume(map);
            }
            if (PLAY_AUDIO.equals(s))
            {
                return playAudio(map);
            }
            if (PLAY_SOUND.equals(s))
            {
                return playSound(map);
            }
        }
        return mmjsresponse;
    }

    public MMJSResponse getDeviceVolume(Map map)
    {
        map = (Context)contextRef.get();
        if (map != null)
        {
            int i = MMSDK.getMediaVolume(map);
            map = MMJSResponse.responseWithSuccess();
            map.response = Integer.valueOf(i);
            return map;
        } else
        {
            return MMJSResponse.responseWithError("no volume available");
        }
    }

    public MMJSResponse getPicture(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Context context;
        String s;
        String s1;
        context = (Context)contextRef.get();
        s = (String)map.get("sourceType");
        obj1 = (String)map.get("constrainHeight");
        s1 = (String)map.get("constrainWidth");
        obj = (String)map.get("contentMode");
        map = ((Map) (obj));
        if (obj == null)
        {
            map = "";
        }
          goto _L1
_L4:
        map = MMJSResponse.responseWithError("Missing constrainHeight and/or constrainWidth");
_L2:
        this;
        JVM INSTR monitorexit ;
        return map;
_L5:
        int i;
        int j;
        i = (int)Float.parseFloat(((String) (obj1)));
        j = (int)Float.parseFloat(s1);
        if (i * j <= 0x57e40)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        map = MMJSResponse.responseWithError("constrainHeight * constrainWidth > 360000");
          goto _L2
        if (context == null || s == null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        boolean flag;
        obj = new File(AdCache.getInternalCacheDirectory(context), (new StringBuilder()).append("tmp_mm_").append(String.valueOf(System.currentTimeMillis())).append(".jpg").toString());
        if (s.equalsIgnoreCase("Camera") && isCameraAvailable())
        {
            break MISSING_BLOCK_LABEL_231;
        }
        if (!s.equalsIgnoreCase("Photo Library") && !s.equalsIgnoreCase("PhotoLibrary"))
        {
            break MISSING_BLOCK_LABEL_364;
        }
        flag = isPictureChooserAvailable();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        pickerActivityObject = new Object();
        synchronized (pickerActivityObject)
        {
            Utils.IntentUtils.startPickerActivity(context, ((File) (obj)), s);
            pickerActivityObject.wait();
        }
        pickerActivityObject = null;
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        byte abyte0[];
        if (!((File) (obj)).exists() || ((File) (obj)).length() <= 0L)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        abyte0 = scaleBitmapToBytes(((File) (obj)), j, i, map);
        ((File) (obj)).delete();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        map = new MMJSResponse();
        map.result = 1;
        map.dataResponse = abyte0;
          goto _L2
        map;
        throw map;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        Exception exception1;
        exception1;
        MMLog.e("BridgeMMMedia", "Error with pickerActivity synchronization", exception1);
        pickerActivityObject = null;
          goto _L3
        map;
        pickerActivityObject = null;
        throw map;
        map = null;
          goto _L2
_L1:
        if (obj1 != null && s1 != null) goto _L5; else goto _L4
    }

    public MMJSResponse isSourceTypeAvailable(Map map)
    {
        map = (String)map.get("sourceType");
        if (map != null)
        {
            if (map.equalsIgnoreCase("Camera") && isCameraAvailable())
            {
                return MMJSResponse.responseWithSuccess("true");
            }
            if (map.equalsIgnoreCase("Photo Library") && isPictureChooserAvailable())
            {
                return MMJSResponse.responseWithSuccess("true");
            }
        }
        return MMJSResponse.responseWithError("false");
    }

    public MMJSResponse playAudio(Map map)
    {
        Object obj = (Context)contextRef.get();
        String s = (String)map.get("path");
        if (obj != null && s != null)
        {
            Audio audio = Audio.sharedAudio(((Context) (obj)));
            if (audio != null)
            {
                if (audio.isPlaying())
                {
                    return MMJSResponse.responseWithError("Audio already playing.");
                }
                if (s.startsWith("http"))
                {
                    return audio.playAudio(Uri.parse(s), Boolean.parseBoolean((String)map.get("repeat")));
                }
                obj = AdCache.getDownloadFile(((Context) (obj)), s);
                if (((File) (obj)).exists())
                {
                    return audio.playAudio(Uri.fromFile(((File) (obj))), Boolean.parseBoolean((String)map.get("repeat")));
                }
            }
        }
        return null;
    }

    public MMJSResponse playSound(Map map)
    {
        if (contextRef == null)
        {
            return null;
        }
        Context context = (Context)contextRef.get();
        map = (String)map.get("path");
        if (context != null && map != null)
        {
            map = AdCache.getDownloadFile(context, map);
            if (map.exists())
            {
                Audio audio = Audio.sharedAudio((Context)contextRef.get());
                if (audio != null)
                {
                    return audio.playSound(map);
                }
            }
        }
        return null;
    }

    public MMJSResponse playVideo(Map map)
    {
        Context context = (Context)contextRef.get();
        map = (String)map.get("path");
        if (context != null && map != null)
        {
            if (map.startsWith("http"))
            {
                Utils.IntentUtils.startVideoPlayerActivityWithData(context, map);
                return MMJSResponse.responseWithSuccess(map);
            }
            map = AdCache.getDownloadFile(context, map);
            if (map.exists())
            {
                Utils.IntentUtils.startVideoPlayerActivityWithData(context, map);
                return MMJSResponse.responseWithSuccess(map.getName());
            }
        }
        return null;
    }

    public MMJSResponse stopAudio(Map map)
    {
        if (contextRef != null)
        {
            map = Audio.sharedAudio((Context)contextRef.get());
            if (map != null)
            {
                return map.stop();
            }
        }
        return null;
    }

    public MMJSResponse writeToPhotoLibrary(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        Context context;
        String s;
        context = (Context)contextRef.get();
        s = (String)map.get("path");
        if (context == null) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L3
_L3:
        String s1;
        map = Uri.parse((String)map.get("path"));
        s = map.getLastPathSegment();
        s1 = map.getScheme();
        if (s1 == null) goto _L5; else goto _L4
_L4:
        if (!s1.equals("http") || AdCache.downloadComponentExternalStorage(map.toString(), "Pictures", s, context, Boolean.valueOf(true))) goto _L5; else goto _L6
_L6:
        map = MMJSResponse.responseWithError("Failed to download");
_L8:
        this;
        JVM INSTR monitorexit ;
        return map;
_L5:
        map = AdCache.getDownloadFile(context, "Pictures", map.getLastPathSegment(), Boolean.valueOf(true));
        if (!map.exists())
        {
            map = MMJSResponse.responseWithError((new StringBuilder()).append("No file at ").append(map.getAbsolutePath()).toString());
            continue; /* Loop/switch isn't completed */
        }
        scanMedia(map.getAbsolutePath());
        if (!AdCache.isExternalMounted())
        {
            map = MMJSResponse.responseWithError("Storage not mounted, cannot add image to photo library photo library");
            continue; /* Loop/switch isn't completed */
        }
        map = MMJSResponse.responseWithSuccess("Image saved to photo library");
        continue; /* Loop/switch isn't completed */
_L2:
        map = null;
        if (true) goto _L8; else goto _L7
_L7:
        map;
        throw map;
    }


    // Unreferenced inner class com/millennialmedia/android/BridgeMMMedia$Audio$1

/* anonymous class */
    class Audio._cls1
        implements Runnable
    {

        final Audio this$0;

        public void run()
        {
            if (mediaPlayer != null)
            {
                if (mediaPlayer.isPlaying())
                {
                    int i = mediaPlayer.getCurrentPosition();
                    if (periodicListeners != null)
                    {
                        for (Iterator iterator = periodicListeners.iterator(); iterator.hasNext(); ((Audio.PeriodicListener)iterator.next()).onUpdate(i)) { }
                    }
                }
                MMSDK.runOnUiThreadDelayed(this, 500L);
            }
        }

            
            {
                this$0 = Audio.this;
                super();
            }
    }

}
