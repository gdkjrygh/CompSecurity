// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.video;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;
import ajz;
import alh;
import ali;
import alj;
import alk;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;

public class MediaPlayerSource extends ahn
{

    private static final aif INPUT_ASSET_TYPE = aif.a(android/content/res/AssetFileDescriptor);
    private static final aif INPUT_PATH_TYPE = aif.a(android/net/Uri);
    private static final aif OUTPUT_VIDEO_TYPE = aif.a(301, 16);
    private static final String TAG = "MediaPlayerSource";
    private static final float TARGET_COORDS_0[] = {
        0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F
    };
    private static final float TARGET_COORDS_180[] = {
        1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F
    };
    private static final float TARGET_COORDS_270[] = {
        1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F
    };
    private static final float TARGET_COORDS_90[] = {
        0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F
    };
    private static final String mFrameShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n";
    private static float mSurfaceTransform[] = new float[16];
    private boolean mCompleted;
    private ajl mFrameExtractor;
    private Object mFrameMutex;
    private int mHeight;
    private final boolean mLogVerbose = Log.isLoggable("MediaPlayerSource", 2);
    private boolean mLooping;
    private ajz mMediaFrame;
    private MediaPlayer mMediaPlayer;
    private boolean mNewFrameAvailable;
    private boolean mPaused;
    private int mRotation;
    private Uri mSourceUri;
    private SurfaceTexture mSurfaceTexture;
    private float mVolume;
    private int mWidth;
    private android.media.MediaPlayer.OnCompletionListener onCompletionListener;
    private android.graphics.SurfaceTexture.OnFrameAvailableListener onMediaFrameAvailableListener;
    private android.media.MediaPlayer.OnPreparedListener onPreparedListener;
    private android.media.MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener;

    public MediaPlayerSource(ajr ajr1, String s)
    {
        super(ajr1, s);
        mLooping = false;
        mVolume = 0.0F;
        mRotation = 0;
        mFrameMutex = new Object();
        onPreparedListener = new alh(this);
        onVideoSizeChangedListener = new ali(this);
        onCompletionListener = new alj(this);
        onMediaFrameAvailableListener = new alk(this);
    }

    public static int a(MediaPlayerSource mediaplayersource, int i)
    {
        mediaplayersource.mWidth = i;
        return i;
    }

    public static MediaPlayer a(MediaPlayerSource mediaplayersource)
    {
        return mediaplayersource.mMediaPlayer;
    }

    public static void a(MediaPlayerSource mediaplayersource, String s)
    {
    }

    private boolean a()
    {
        Object obj = mFrameMutex;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = mNewFrameAvailable;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        mNewFrameAvailable = false;
_L1:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        p();
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean a(MediaPlayerSource mediaplayersource, boolean flag)
    {
        mediaplayersource.mCompleted = true;
        return true;
    }

    public static int b(MediaPlayerSource mediaplayersource, int i)
    {
        mediaplayersource.mHeight = i;
        return i;
    }

    public static Object b(MediaPlayerSource mediaplayersource)
    {
        return mediaplayersource.mFrameMutex;
    }

    public static boolean b(MediaPlayerSource mediaplayersource, boolean flag)
    {
        mediaplayersource.mNewFrameAvailable = true;
        return true;
    }

    public static void c(MediaPlayerSource mediaplayersource)
    {
        mediaplayersource.q();
    }

    public static boolean d(MediaPlayerSource mediaplayersource)
    {
        return mediaplayersource.mLogVerbose;
    }

    public static void e(MediaPlayerSource mediaplayersource)
    {
        mediaplayersource.q();
    }

    private boolean x()
    {
        this;
        JVM INSTR monitorenter ;
        mPaused = false;
        mCompleted = false;
        mNewFrameAvailable = false;
        if (mMediaPlayer == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        mMediaPlayer.reset();
_L1:
        if (mMediaPlayer == null)
        {
            throw new RuntimeException("Unable to create a MediaPlayer!");
        }
        break MISSING_BLOCK_LABEL_67;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        mMediaPlayer = new MediaPlayer();
          goto _L1
        String s = String.valueOf(mSourceUri);
        (new StringBuilder(String.valueOf(s).length() + 30)).append("Setting MediaPlayer source to ").append(s);
        mMediaPlayer.setDataSource(super.mContext.a, mSourceUri);
        mMediaPlayer.setLooping(mLooping);
        mMediaPlayer.setVolume(mVolume, mVolume);
        Surface surface = new Surface(mSurfaceTexture);
        mMediaPlayer.setSurface(surface);
        surface.release();
        mMediaPlayer.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        mMediaPlayer.setOnPreparedListener(onPreparedListener);
        mMediaPlayer.setOnCompletionListener(onCompletionListener);
        mSurfaceTexture.setOnFrameAvailableListener(onMediaFrameAvailableListener);
        mMediaPlayer.prepareAsync();
        this;
        JVM INSTR monitorexit ;
        return true;
        surface;
        mMediaPlayer.release();
        mMediaPlayer = null;
        throw new RuntimeException(String.format("Unable to set MediaPlayer to %s!", new Object[] {
            mSourceUri
        }), surface);
        surface;
        mMediaPlayer.release();
        mMediaPlayer = null;
        throw new RuntimeException(String.format("Unable to set MediaPlayer to URL %s!", new Object[] {
            mSourceUri
        }), surface);
    }

    public final ajw b()
    {
        return (new ajw()).a("sourceUri", 1, INPUT_PATH_TYPE).a("sourceAsset", 1, INPUT_ASSET_TYPE).a("context", 1, aif.a(android/content/Context)).a("loop", 1, aif.a(Boolean.TYPE)).a("volume", 1, aif.a(Float.TYPE)).a("rotation", 1, aif.a(Integer.TYPE)).b("video", 2, OUTPUT_VIDEO_TYPE).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("sourceUri"))
        {
            ajo1.a("mSourceUri");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("loop"))
            {
                ajo1.a("mLooping");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("volume"))
            {
                ajo1.a("mVolume");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("rotation"))
            {
                ajo1.a("mRotation");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void c()
    {
        mFrameExtractor = new ajl("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
    }

    public final void d()
    {
        String s = String.valueOf(mSourceUri);
        (new StringBuilder(String.valueOf(s).length() + 15)).append("Current URL is ").append(s);
        mMediaFrame = ajz.b();
        mSurfaceTexture = new SurfaceTexture(mMediaFrame.a);
        x();
    }

    public final void e()
    {
        if (mMediaPlayer == null)
        {
            throw new NullPointerException("Unexpected null media player!");
        }
        if (!mCompleted) goto _L2; else goto _L1
_L1:
        o();
_L4:
        return;
_L2:
        if (!a()) goto _L4; else goto _L3
_L3:
        Object obj;
        mSurfaceTexture.updateTexImage();
        mSurfaceTexture.getTransformMatrix(mSurfaceTransform);
        mFrameExtractor.b(mSurfaceTransform);
        obj = mFrameExtractor;
        mRotation;
        JVM INSTR lookupswitch 4: default 116
    //                   0: 127
    //                   90: 292
    //                   180: 299
    //                   270: 306;
           goto _L5 _L6 _L7 _L8 _L9
_L5:
        throw new RuntimeException("Unsupported rotation angle.");
_L6:
        af = TARGET_COORDS_0;
_L11:
        ((ajl) (obj)).c(af);
        int i;
        int j;
        synchronized (mFrameMutex)
        {
            j = mWidth;
            i = mHeight;
            if (mRotation == 90 || mRotation == 270)
            {
                j = mHeight;
                i = mWidth;
            }
        }
        af = b("video");
        obj = af.a(new int[] {
            j, i
        }).h();
        mFrameExtractor.a(mMediaFrame, ((ahv) (obj)).p(), j, i);
        long l = mSurfaceTexture.getTimestamp();
        long l1 = l / 0xf4240L;
        (new StringBuilder(34)).append("Timestamp: ").append(l1).append(" ms");
        ((ahv) (obj)).a(l);
        ((ahv) (obj)).k();
        af.a(((ahs) (obj)));
        return;
_L7:
        af = TARGET_COORDS_90;
        continue; /* Loop/switch isn't completed */
_L8:
        af = TARGET_COORDS_180;
        continue; /* Loop/switch isn't completed */
_L9:
        af = TARGET_COORDS_270;
        if (true) goto _L11; else goto _L10
_L10:
        exception;
        af;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void f()
    {
        if (mMediaPlayer.isPlaying())
        {
            mMediaPlayer.stop();
        }
        mPaused = false;
        mCompleted = false;
        mNewFrameAvailable = false;
        mMediaPlayer.release();
        mMediaPlayer = null;
        mSurfaceTexture.release();
        mSurfaceTexture = null;
    }

    public final void g()
    {
        if (mMediaFrame != null)
        {
            mMediaFrame.e();
        }
    }

}
