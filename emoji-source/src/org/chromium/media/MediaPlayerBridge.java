// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64InputStream;
import android.util.Log;
import android.view.Surface;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class MediaPlayerBridge
{
    protected static class AllowedOperations
    {

        private final boolean mCanPause;
        private final boolean mCanSeekBackward;
        private final boolean mCanSeekForward;

        private boolean canPause()
        {
            return mCanPause;
        }

        private boolean canSeekBackward()
        {
            return mCanSeekBackward;
        }

        private boolean canSeekForward()
        {
            return mCanSeekForward;
        }

        public AllowedOperations(boolean flag, boolean flag1, boolean flag2)
        {
            mCanPause = flag;
            mCanSeekForward = flag1;
            mCanSeekBackward = flag2;
        }
    }

    private class LoadDataUriTask extends AsyncTask
    {

        static final boolean $assertionsDisabled;
        private final Context mContext;
        private final String mData;
        private File mTempFile;
        final MediaPlayerBridge this$0;

        private void deleteFile()
        {
            if (mTempFile != null && !mTempFile.delete())
            {
                Log.e("MediaPlayerBridge", (new StringBuilder()).append("Failed to delete temporary file: ").append(mTempFile).toString());
                if (!$assertionsDisabled)
                {
                    throw new AssertionError();
                }
            }
        }

        protected transient Boolean doInBackground(Void avoid[])
        {
            Object obj;
            Object obj1;
            obj = null;
            obj1 = null;
            avoid = ((Void []) (obj));
            mTempFile = File.createTempFile("decoded", "mediadata");
            avoid = ((Void []) (obj));
            obj = new FileOutputStream(mTempFile);
            avoid = new Base64InputStream(new ByteArrayInputStream(mData.getBytes()), 0);
            obj1 = new byte[1024];
_L3:
            int i = avoid.read(((byte []) (obj1)));
            if (i == -1) goto _L2; else goto _L1
_L1:
            ((FileOutputStream) (obj)).write(((byte []) (obj1)), 0, i);
              goto _L3
            avoid;
_L7:
            avoid = ((Void []) (obj));
            obj1 = Boolean.valueOf(false);
            if (obj != null)
            {
                try
                {
                    ((FileOutputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    return ((Boolean) (obj1));
                }
            }
            return ((Boolean) (obj1));
_L2:
            avoid.close();
            if (obj != null)
            {
                try
                {
                    ((FileOutputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[]) { }
            }
            return Boolean.valueOf(true);
            obj;
_L5:
            if (avoid != null)
            {
                try
                {
                    avoid.close();
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[]) { }
            }
            throw obj;
            obj1;
            avoid = ((Void []) (obj));
            obj = obj1;
            if (true) goto _L5; else goto _L4
_L4:
            avoid;
            obj = obj1;
            if (true) goto _L7; else goto _L6
_L6:
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(Boolean boolean1)
        {
            if (isCancelled())
            {
                deleteFile();
                return;
            }
            try
            {
                getLocalPlayer().setDataSource(mContext, Uri.fromFile(mTempFile));
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1)
            {
                boolean1 = Boolean.valueOf(false);
            }
            deleteFile();
            if (!$assertionsDisabled && mNativeMediaPlayerBridge == 0L)
            {
                throw new AssertionError();
            } else
            {
                nativeOnDidSetDataUriDataSource(mNativeMediaPlayerBridge, boolean1.booleanValue());
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        static 
        {
            boolean flag;
            if (!org/chromium/media/MediaPlayerBridge.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        public LoadDataUriTask(Context context, String s)
        {
            this$0 = MediaPlayerBridge.this;
            super();
            mData = s;
            mContext = context;
        }
    }

    public static class ResourceLoadingFilter
    {

        public boolean shouldOverrideResourceLoading(MediaPlayer mediaplayer, Context context, Uri uri)
        {
            return false;
        }

        public ResourceLoadingFilter()
        {
        }
    }


    private static final String TAG = "MediaPlayerBridge";
    private static ResourceLoadingFilter sResourceLoadFilter = null;
    private LoadDataUriTask mLoadDataUriTask;
    private long mNativeMediaPlayerBridge;
    private MediaPlayer mPlayer;

    protected MediaPlayerBridge()
    {
    }

    protected MediaPlayerBridge(long l)
    {
        mNativeMediaPlayerBridge = l;
    }

    private static MediaPlayerBridge create(long l)
    {
        return new MediaPlayerBridge(l);
    }

    private native void nativeOnDidSetDataUriDataSource(long l, boolean flag);

    public static void setResourceLoadingFilter(ResourceLoadingFilter resourceloadingfilter)
    {
        sResourceLoadFilter = resourceloadingfilter;
    }

    protected void destroy()
    {
        if (mLoadDataUriTask != null)
        {
            mLoadDataUriTask.cancel(true);
            mLoadDataUriTask = null;
        }
        mNativeMediaPlayerBridge = 0L;
    }

    protected AllowedOperations getAllowedOperations()
    {
        Object obj;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        boolean flag11;
        boolean flag13;
        boolean flag14;
        boolean flag15;
        boolean flag16;
        boolean flag17;
        boolean flag18;
        boolean flag19;
        obj = getLocalPlayer();
        flag16 = true;
        flag17 = true;
        flag18 = true;
        flag19 = true;
        flag = true;
        flag11 = true;
        flag13 = true;
        flag14 = true;
        flag15 = true;
        flag1 = true;
        flag10 = true;
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        Object obj2 = obj.getClass().getDeclaredMethod("getMetadata", new Class[] {
            Boolean.TYPE, Boolean.TYPE
        });
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        ((Method) (obj2)).setAccessible(true);
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        obj = ((Method) (obj2)).invoke(obj, new Object[] {
            Boolean.valueOf(false), Boolean.valueOf(false)
        });
        flag6 = flag10;
        if (obj == null) goto _L2; else goto _L1
_L1:
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        obj2 = obj.getClass();
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        Method method = ((Class) (obj2)).getDeclaredMethod("has", new Class[] {
            Integer.TYPE
        });
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        Method method1 = ((Class) (obj2)).getDeclaredMethod("getBoolean", new Class[] {
            Integer.TYPE
        });
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        int i = ((Integer)((Class) (obj2)).getField("PAUSE_AVAILABLE").get(null)).intValue();
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        int j = ((Integer)((Class) (obj2)).getField("SEEK_FORWARD_AVAILABLE").get(null)).intValue();
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        int k = ((Integer)((Class) (obj2)).getField("SEEK_BACKWARD_AVAILABLE").get(null)).intValue();
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        method.setAccessible(true);
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        method1.setAccessible(true);
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        if (!((Boolean)method.invoke(obj, new Object[] {
            Integer.valueOf(i)
        })).booleanValue()) goto _L4; else goto _L3
_L3:
        flag6 = flag16;
        flag2 = flag11;
        flag7 = flag17;
        flag3 = flag13;
        flag8 = flag18;
        flag4 = flag14;
        flag9 = flag19;
        flag5 = flag15;
        if (!((Boolean)method1.invoke(obj, new Object[] {
            Integer.valueOf(i)
        })).booleanValue()) goto _L5; else goto _L4
_L9:
        flag6 = flag;
        flag2 = flag11;
        flag7 = flag;
        flag3 = flag13;
        flag8 = flag;
        flag4 = flag14;
        flag9 = flag;
        flag5 = flag15;
        if (!((Boolean)method.invoke(obj, new Object[] {
    Integer.valueOf(j)
})).booleanValue())
        {
            break MISSING_BLOCK_LABEL_1124;
        }
        flag6 = flag;
        flag2 = flag11;
        flag7 = flag;
        flag3 = flag13;
        flag8 = flag;
        flag4 = flag14;
        flag9 = flag;
        flag5 = flag15;
        break MISSING_BLOCK_LABEL_768;
_L10:
        flag6 = flag;
        flag2 = flag1;
        flag7 = flag;
        flag3 = flag1;
        flag8 = flag;
        flag4 = flag1;
        flag9 = flag;
        flag5 = flag1;
        if (!((Boolean)method.invoke(obj, new Object[] {
            Integer.valueOf(k)
        })).booleanValue()) goto _L7; else goto _L6
_L6:
        flag6 = flag;
        flag2 = flag1;
        flag7 = flag;
        flag3 = flag1;
        flag8 = flag;
        flag4 = flag1;
        flag9 = flag;
        flag5 = flag1;
        flag12 = ((Boolean)method1.invoke(obj, new Object[] {
            Integer.valueOf(k)
        })).booleanValue();
        if (!flag12) goto _L8; else goto _L7
_L7:
        flag6 = true;
_L2:
        return new AllowedOperations(flag, flag1, flag6);
_L5:
        flag = false;
          goto _L9
        boolean flag12;
        if (((Boolean)method1.invoke(obj, new Object[] {
    Integer.valueOf(j)
})).booleanValue())
        {
            break MISSING_BLOCK_LABEL_1124;
        }
        flag1 = false;
          goto _L10
_L8:
        flag6 = false;
          goto _L2
        Object obj1;
        obj1;
        Log.e("MediaPlayerBridge", (new StringBuilder()).append("Cannot find getMetadata() method: ").append(obj1).toString());
        flag = flag6;
        flag6 = flag10;
        flag1 = flag2;
          goto _L2
        obj1;
        Log.e("MediaPlayerBridge", (new StringBuilder()).append("Cannot invoke MediaPlayer.getMetadata() method: ").append(obj1).toString());
        flag = flag7;
        flag6 = flag10;
        flag1 = flag3;
          goto _L2
        obj1;
        Log.e("MediaPlayerBridge", (new StringBuilder()).append("Cannot access metadata: ").append(obj1).toString());
        flag = flag8;
        flag6 = flag10;
        flag1 = flag4;
          goto _L2
        obj1;
        Log.e("MediaPlayerBridge", (new StringBuilder()).append("Cannot find matching fields in Metadata class: ").append(obj1).toString());
        flag = flag9;
        flag6 = flag10;
        flag1 = flag5;
          goto _L2
_L4:
        flag = true;
          goto _L9
        flag1 = true;
          goto _L10
    }

    protected int getCurrentPosition()
    {
        return getLocalPlayer().getCurrentPosition();
    }

    protected int getDuration()
    {
        return getLocalPlayer().getDuration();
    }

    protected MediaPlayer getLocalPlayer()
    {
        if (mPlayer == null)
        {
            mPlayer = new MediaPlayer();
        }
        return mPlayer;
    }

    protected int getVideoHeight()
    {
        return getLocalPlayer().getVideoHeight();
    }

    protected int getVideoWidth()
    {
        return getLocalPlayer().getVideoWidth();
    }

    protected boolean isPlaying()
    {
        return getLocalPlayer().isPlaying();
    }

    protected void pause()
    {
        getLocalPlayer().pause();
    }

    protected boolean prepareAsync()
    {
        try
        {
            getLocalPlayer().prepareAsync();
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("MediaPlayerBridge", "Unable to prepare MediaPlayer.", illegalstateexception);
            return false;
        }
        return true;
    }

    protected void release()
    {
        getLocalPlayer().release();
    }

    protected void seekTo(int i)
        throws IllegalStateException
    {
        getLocalPlayer().seekTo(i);
    }

    protected boolean setDataSource(Context context, String s, String s1, String s2, boolean flag)
    {
        HashMap hashmap;
        s = Uri.parse(s);
        hashmap = new HashMap();
        if (flag)
        {
            hashmap.put("x-hide-urls-from-log", "true");
        }
        if (!TextUtils.isEmpty(s1))
        {
            hashmap.put("Cookie", s1);
        }
        if (!TextUtils.isEmpty(s2))
        {
            hashmap.put("User-Agent", s2);
        }
        if (android.os.Build.VERSION.SDK_INT > 19)
        {
            hashmap.put("allow-cross-domain-redirect", "false");
        }
        if (sResourceLoadFilter != null && sResourceLoadFilter.shouldOverrideResourceLoading(getLocalPlayer(), context, s))
        {
            return true;
        }
        try
        {
            getLocalPlayer().setDataSource(context, s, hashmap);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    protected boolean setDataSourceFromFd(int i, long l, long l1)
    {
        try
        {
            ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.adoptFd(i);
            getLocalPlayer().setDataSource(parcelfiledescriptor.getFileDescriptor(), l, l1);
            parcelfiledescriptor.close();
        }
        catch (IOException ioexception)
        {
            Log.e("MediaPlayerBridge", (new StringBuilder()).append("Failed to set data source from file descriptor: ").append(ioexception).toString());
            return false;
        }
        return true;
    }

    protected boolean setDataUriDataSource(Context context, String s)
    {
        if (mLoadDataUriTask != null)
        {
            mLoadDataUriTask.cancel(true);
            mLoadDataUriTask = null;
        }
        int i;
        if (s.startsWith("data:"))
        {
            if ((i = s.indexOf(',')) != -1)
            {
                String s1 = s.substring(0, i);
                s = s.substring(i + 1);
                String as[] = s1.substring(5).split(";");
                if (as.length == 2 && "base64".equals(as[1]))
                {
                    mLoadDataUriTask = new LoadDataUriTask(context, s);
                    mLoadDataUriTask.execute(new Void[0]);
                    return true;
                }
            }
        }
        return false;
    }

    protected void setOnBufferingUpdateListener(android.media.MediaPlayer.OnBufferingUpdateListener onbufferingupdatelistener)
    {
        getLocalPlayer().setOnBufferingUpdateListener(onbufferingupdatelistener);
    }

    protected void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        getLocalPlayer().setOnCompletionListener(oncompletionlistener);
    }

    protected void setOnErrorListener(android.media.MediaPlayer.OnErrorListener onerrorlistener)
    {
        getLocalPlayer().setOnErrorListener(onerrorlistener);
    }

    protected void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        getLocalPlayer().setOnPreparedListener(onpreparedlistener);
    }

    protected void setOnSeekCompleteListener(android.media.MediaPlayer.OnSeekCompleteListener onseekcompletelistener)
    {
        getLocalPlayer().setOnSeekCompleteListener(onseekcompletelistener);
    }

    protected void setOnVideoSizeChangedListener(android.media.MediaPlayer.OnVideoSizeChangedListener onvideosizechangedlistener)
    {
        getLocalPlayer().setOnVideoSizeChangedListener(onvideosizechangedlistener);
    }

    protected void setSurface(Surface surface)
    {
        getLocalPlayer().setSurface(surface);
    }

    protected void setVolume(double d)
    {
        getLocalPlayer().setVolume((float)d, (float)d);
    }

    protected void start()
    {
        getLocalPlayer().start();
    }



}
